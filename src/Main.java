import java.util.Arrays;

public class Main {

    private static void printArrList(Employee[] arrList) {
        System.out.println("Список всех данных о сотрудниках:");
        for (int m = 0; m < arrList.length; m++) {
            System.out.println(arrList[m]);
        }
    }

    private static double getMonthlyPaymentAmount(double[] arrSalary) {
        double monthlyPaymentAmount = 0.00;
        for (double element : arrSalary) {
            monthlyPaymentAmount += element;
        }
        return monthlyPaymentAmount;
    }

    private static double getMonthlyPaymentMin(double[] arrSalary) {
        double monthlyPaymentMin = arrSalary[0];
        for (int index = 1; index < arrSalary.length; index++) {
            if (arrSalary[index] < monthlyPaymentMin) {
                monthlyPaymentMin = arrSalary[index];
            }
        }
        return monthlyPaymentMin;
    }

    private static double getMonthlyPaymentMax(double[] arrSalary) {
        double monthlyPaymentMax = arrSalary[0];
        for (int index = 1; index < arrSalary.length; index++) {
            if (arrSalary[index] > monthlyPaymentMax) {
                monthlyPaymentMax = arrSalary[index];
            }
        }
        return monthlyPaymentMax;
    }

    private static double getAverageSpendingPerMonth(double[] arrSalary) {
        double averageSpendingPerMonth = 0.00;
        averageSpendingPerMonth = getMonthlyPaymentAmount(arrSalary) / (arrSalary.length);
        return averageSpendingPerMonth;
    }

    private static void printMonthlyPaymentAmount(double[] arrSalary) {
        System.out.printf("Сумма затрат на зарплаты в месяц составила %.2f руб", getMonthlyPaymentAmount(arrSalary));
        System.out.println();
    }

    private static void printMonthlyPaymentMin(double[] arrSalary) {
        System.out.printf("Минимальная зарплата составила  %.2f руб", getMonthlyPaymentMin(arrSalary));
        System.out.println();
    }

    private static void printMonthlyPaymentMax(double[] arrSalary) {
        System.out.printf("Максимальная зарплата составила %.2f руб", getMonthlyPaymentMax(arrSalary));
        System.out.println();
    }

    private static void printAverageSpendingPerMonth(double[] arrSalary) {
        System.out.printf("Средняя зарплата составила %.2f руб", getAverageSpendingPerMonth(arrSalary));
        System.out.println();
    }

    private static void printArrLFullName(String[] ArrFullName) {
        System.out.println("Список ФИО сотрудников:");
        for (int m = 0; m < ArrFullName.length; m++) {
            System.out.println(ArrFullName[m]);
        }
    }


    public static void main(String[] args) {

        Employee[] arrList = new Employee[10];
        int indexE = 0;
        double[] arrSalary = new double[10];
        int indexS = 0;
        String[] ArrFullName = new String[10];
        int indexF = 0;


        Employee employee1 = new Employee("Иванов", "Иван", "Иванович", "отдел1", 31_000.31);
        arrList[indexE++] = employee1;
        arrSalary[indexS++] = employee1.getSalary();
        ArrFullName[indexF++] = employee1.getFullName();

        Employee employee2 = new Employee("Петров", "Петр", "Петрович", "отдел2", 29_000.29);
        arrList[indexE++] = employee2;
        arrSalary[indexS++] = employee2.getSalary();
        ArrFullName[indexF++] = employee2.getFullName();

        Employee employee3 = new Employee("Васев", "Василий", "Васильевич", "отдел3", 53_000.53);
        arrList[indexE++] = employee3;
        arrSalary[indexS++] = employee3.getSalary();
        ArrFullName[indexF++] = employee3.getFullName();

        Employee employee4 = new Employee("Семёнов", "Семён", "Семёноввич", "отдел4", 46_000.46);
        arrList[indexE++] = employee4;
        arrSalary[indexS++] = employee4.getSalary();
        ArrFullName[indexF++] = employee4.getFullName();

        Employee employee5 = new Employee("Кузнецов", "Андрей", "Викторович", "отдел5", 81_000.82);
        employee5.setSalary(81_000.81);
        arrList[indexE++] = employee5;
        arrSalary[indexS++] = employee5.getSalary();
        ArrFullName[indexF++] = employee5.getFullName();

        Employee employee6 = new Employee("Фролова", "Лариса", "Ивановна", "отдел1", 34_000.34);
        arrList[indexE++] = employee6;
        arrSalary[indexS++] = employee6.getSalary();
        ArrFullName[indexF++] = employee6.getFullName();

        Employee employee7 = new Employee("Лузина", "Елизавета", "Андреевна", "отдел2", 28_000.28);
        arrList[indexE++] = employee7;
        arrSalary[indexS++] = employee7.getSalary();
        ArrFullName[indexF++] = employee7.getFullName();

        Employee employee8 = new Employee("Вострикова", "Антонина", "Львовна", "отдел3", 44_000.44);
        arrList[indexE++] = employee8;
        arrSalary[indexS++] = employee8.getSalary();
        ArrFullName[indexF++] = employee8.getFullName();

        Employee employee9 = new Employee("Емильянова", "Инесса", "Романовна", "отдел4", 41_000.41);
        employee9.setDepartment("отдел5");
        arrList[indexE++] = employee9;
        arrSalary[indexS++] = employee9.getSalary();
        ArrFullName[indexF++] = employee9.getFullName();


        Employee employee10 = new Employee("Пузанков", "Илья", "Федорович", "отдел5", 77_000.77);
        arrList[indexE++] = employee10;
        arrSalary[indexS++] = employee10.getSalary();
        ArrFullName[indexF++] = employee10.getFullName();


        printArrList(arrList);
        System.out.println();
        printMonthlyPaymentAmount(arrSalary);
        System.out.println();
        printMonthlyPaymentMin(arrSalary);
        System.out.println();
        printMonthlyPaymentMax(arrSalary);
        System.out.println();
        printAverageSpendingPerMonth(arrSalary);
        System.out.println();
        printArrLFullName(ArrFullName);


    }
}