import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeConfig config = new EmployeeConfig(
                20,
                8,
                4,
                20,
                100,
                20
        );

        EmployeeWageCalculator calculator = new EmployeeWageCalculator(config);

        AttendanceStatus attendance = calculator.checkAttendance();
        System.out.println("UC1 - Attendance: " + attendance);

        int dailyWageFullTime = calculator.calculateDailyWageFullTime(attendance);
        System.out.println("UC2 - Daily Wage (Full Time): " + dailyWageFullTime);

        WorkType todayWorkType = calculator.getWorkTypeRandom();
        int dailyWageByType = calculator.calculateDailyWageByWorkType(todayWorkType);
        System.out.println("UC3/UC4 - WorkType: " + todayWorkType + ", Daily Wage: " + dailyWageByType);

        int monthlyWageFixedDays = calculator.calculateMonthlyWageFixedDays(config.workingDaysPerMonth);
        System.out.println("UC5 - Monthly Wage (20 working days): " + monthlyWageFixedDays);

        MonthWageResult capped = calculator.calculateMonthlyWageUntilCap();
        System.out.println("UC6 - Monthly Wage (capped): " + capped.totalWage
                + " | days worked: " + capped.totalDaysWorked
                + " | hours worked: " + capped.totalHoursWorked);

        System.out.println("Day-wise wages (from capped calculation):");
        for (Map.Entry<Integer, Integer> e : capped.dayToWage.entrySet()) {
            System.out.println("Day " + e.getKey() + " -> " + e.getValue());
        }
    }
}

enum AttendanceStatus {
    PRESENT,
    ABSENT
}

enum WorkType {
    ABSENT,
    FULL_TIME,
    PART_TIME
}

final class EmployeeConfig {
    final int wagePerHour;
    final int fullDayHours;
    final int partTimeHours;
    final int workingDaysPerMonth;
    final int maxHoursPerMonth;
    final int maxDaysPerMonth;

    EmployeeConfig(int wagePerHour, int fullDayHours, int partTimeHours,
                   int workingDaysPerMonth, int maxHoursPerMonth, int maxDaysPerMonth) {
        this.wagePerHour = wagePerHour;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.maxDaysPerMonth = maxDaysPerMonth;
    }
}

final class MonthWageResult {
    final int totalWage;
    final int totalDaysWorked;
    final int totalHoursWorked;
    final List<Integer> dailyWages;
    final Map<Integer, Integer> dayToWage;

    MonthWageResult(int totalWage, int totalDaysWorked, int totalHoursWorked,
                    List<Integer> dailyWages, Map<Integer, Integer> dayToWage) {
        this.totalWage = totalWage;
        this.totalDaysWorked = totalDaysWorked;
        this.totalHoursWorked = totalHoursWorked;
        this.dailyWages = dailyWages;
        this.dayToWage = dayToWage;
    }
}

final class EmployeeWageCalculator {
    private final EmployeeConfig config;
    private final Random random = new Random();

    private WorkType lastWorkType = WorkType.ABSENT;

    EmployeeWageCalculator(EmployeeConfig config) {
        this.config = config;
    }

    AttendanceStatus checkAttendance() {
        int isPresent = random.nextInt(2);
        return isPresent == 1 ? AttendanceStatus.PRESENT : AttendanceStatus.ABSENT;
    }

    int calculateDailyWageFullTime(AttendanceStatus attendance) {
        if (attendance == AttendanceStatus.ABSENT) return 0;
        return config.wagePerHour * config.fullDayHours;
    }

    WorkType getWorkTypeRandom() {
        int v = random.nextInt(3);
        lastWorkType = switch (v) {
            case 1 -> WorkType.FULL_TIME;
            case 2 -> WorkType.PART_TIME;
            default -> WorkType.ABSENT;
        };
        return lastWorkType;
    }

    int calculateDailyWageByWorkType(WorkType workType) {
        int hours = switch (workType) {
            case FULL_TIME -> config.fullDayHours;
            case PART_TIME -> config.partTimeHours;
            case ABSENT -> 0;
        };
        return hours * config.wagePerHour;
    }

    int calculateMonthlyWageFixedDays(int workingDays) {
        int total = 0;
        for (int day = 1; day <= workingDays; day++) {
            WorkType wt = getWorkTypeRandom();
            total += calculateDailyWageByWorkType(wt);
        }
        return total;
    }

    MonthWageResult calculateMonthlyWageUntilCap() {
        int totalWage = 0;
        int totalHours = 0;
        int day = 0;

        List<Integer> dailyWages = new ArrayList<>();
        Map<Integer, Integer> dayToWage = new LinkedHashMap<>();

        while (day < config.maxDaysPerMonth && totalHours < config.maxHoursPerMonth) {
            day++;

            WorkType wt = getWorkTypeRandom();
            int hours = switch (wt) {
                case FULL_TIME -> config.fullDayHours;
                case PART_TIME -> config.partTimeHours;
                case ABSENT -> 0;
            };

            if (totalHours + hours > config.maxHoursPerMonth) {
                hours = config.maxHoursPerMonth - totalHours;
                if (hours < 0) hours = 0;
            }

            int wage = hours * config.wagePerHour;
            totalHours += hours;
            totalWage += wage;

            dailyWages.add(wage);
            dayToWage.put(day, wage);
        }

        return new MonthWageResult(totalWage, day, totalHours, dailyWages, dayToWage);
    }
}

