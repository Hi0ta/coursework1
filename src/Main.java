import java.util.Arrays;

public class Main {

    private static void printArrList(Employee[] arrList) {
        System.out.println("Список всех данных о сотрудниках:");
        for (int m = 0; m < arrList.length; m++) {
            System.out.println(arrList[m]);
        }
    }

    private static double getMonthlyPaymentAmount(Employee[] arrList) {
        double monthlyPaymentAmount = 0.00;
        for (int m = 0; m < arrList.length; m++) {
            monthlyPaymentAmount += arrList[m].getSalary();
        }
        return monthlyPaymentAmount;
    }

    private static double getMonthlyPaymentMin(Employee[] arrList) {
        double monthlyPaymentMin = arrList[0].getSalary();
        for (int index = 1; index < arrList.length; index++) {
            if (arrList[index].getSalary() < monthlyPaymentMin) {
                monthlyPaymentMin = arrList[index].getSalary();
            }
        }
        return monthlyPaymentMin;
    }

    private static double getMonthlyPaymentMax(Employee[] arrList) {
        double monthlyPaymentMax = arrList[0].getSalary();
        for (int index = 1; index < arrList.length; index++) {
            if (arrList[index].getSalary() > monthlyPaymentMax) {
                monthlyPaymentMax = arrList[index].getSalary();
            }
        }
        return monthlyPaymentMax;
    }

    private static double getAverageSpendingPerMonth(Employee[] arrList) {
        double averageSpendingPerMonth = 0.00;
        averageSpendingPerMonth = getMonthlyPaymentAmount(arrList) / (arrList.length);
        return averageSpendingPerMonth;
    }

    private static void printMonthlyPaymentAmount(Employee[] arrList) {
        System.out.printf("Сумма затрат на зарплаты в месяц составила %.2f руб", getMonthlyPaymentAmount(arrList));
        System.out.println();
    }

    private static void printMonthlyPaymentMin(Employee[] arrList) {
        System.out.printf("Минимальная зарплата составила  %.2f руб", getMonthlyPaymentMin(arrList));
        System.out.println();
    }

    private static void printMonthlyPaymentMax(Employee[] arrList) {
        System.out.printf("Максимальная зарплата составила %.2f руб", getMonthlyPaymentMax(arrList));
        System.out.println();
    }

    private static void printAverageSpendingPerMonth(Employee[] arrList) {
        System.out.printf("Средняя зарплата составила %.2f руб", getAverageSpendingPerMonth(arrList));
        System.out.println();
    }

    private static void printLFullName(Employee[] arrList) {
        System.out.println("Список ФИО сотрудников:");
        for (int m = 0; m < arrList.length; m++) {
            System.out.println(arrList[m].getFullName());
        }
    }

    public static void main(String[] args) {

        Employee[] arrList = new Employee[10];
        int indexE = 0;

        arrList[indexE++] = new Employee("Иванов", "Иван", "Иванович", "отдел1", 31_000.31);
        arrList[indexE++] = new Employee("Петров", "Петр", "Петрович", "отдел2", 29_000.29);
        arrList[indexE++] = new Employee("Васев", "Василий", "Васильевич", "отдел3", 53_000.53);
        arrList[indexE++] = new Employee("Семёнов", "Семён", "Семёноввич", "отдел4", 46_000.46);
        arrList[indexE++] = new Employee("Кузнецов", "Андрей", "Викторович", "отдел5", 81_000.82);
        arrList[indexE++] = new Employee("Фролова", "Лариса", "Ивановна", "отдел1", 34_000.34);
        arrList[indexE++] = new Employee("Лузина", "Елизавета", "Андреевна", "отдел2", 28_000.28);
        arrList[indexE++] = new Employee("Вострикова", "Антонина", "Львовна", "отдел3", 44_000.44);
        arrList[indexE++] = new Employee("Емильянова", "Инесса", "Романовна", "отдел4", 41_000.41);
        arrList[indexE++] = new Employee("Пузанков", "Илья", "Федорович", "отдел5", 77_000.77);
        arrList[4].setSalary(81_000.81);
        arrList[8].setDepartment("отдел5");

        printArrList(arrList);
        System.out.println();
        printMonthlyPaymentAmount(arrList);
        System.out.println();
        printMonthlyPaymentMin(arrList);
        System.out.println();
        printMonthlyPaymentMax(arrList);
        System.out.println();
        printAverageSpendingPerMonth(arrList);
        System.out.println();
        printLFullName(arrList);

    }
}