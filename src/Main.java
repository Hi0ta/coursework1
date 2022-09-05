import java.util.Arrays;

public class Main {
    private static Employee[] getArrlist(Employee[] arrlist, Employee nextEmployee) {
        for (int i = 0; i < arrlist.length; ) {
            if (arrlist[i] != null) {
                i++;
            } else {
                arrlist[i] = nextEmployee;
                break;
            }
        }
        return arrlist;
    }

    private static void printArrList(Employee[] arrlist) {
        for (int m = 0; m < arrlist.length; m++) {
            System.out.println(arrlist[m]);
        }
    }

    private static double[] getArrSalary(double[] arrSalary, double nextSalary) {
        for (int x = 0; x < arrSalary.length; ) {
            if (arrSalary[x] != 0) {
                x++;
            } else {
                arrSalary[x] = nextSalary;
                break;
            }
        }
        return arrSalary;
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

    private static void printArrLFullName(String [] ArrFullName) {
        for (int m = 0; m < ArrFullName.length; m++) {
            System.out.println(ArrFullName[m]);
        }
    }


    public static void main(String[] args) {

        Employee nextEmployee = new Employee(null, null, null, null, 0);
        Employee[] arrlist = new Employee[10];
        double nextSalary = 0.00;
        double[] arrSalary = new double[10];



        nextEmployee = new Employee("Иванов", "Иван", "Иванович", "отдел1", 31_000.31);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName1 = nextEmployee.getFullName();

        nextEmployee = new Employee("Петров", "Петр", "Петрович", "отдел2", 29_000.29);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName2 = nextEmployee.getFullName();

        nextEmployee = new Employee("Васев", "Василий", "Васильевич", "отдел3", 53_000.53);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName3 = nextEmployee.getFullName();

        nextEmployee = new Employee("Семёнов", "Семён", "Семёноввич", "отдел4", 46_000.46);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName4 = nextEmployee.getFullName();

        nextEmployee = new Employee("Кузнецов", "Андрей", "Викторович", "отдел5", 81_000.82);
        nextEmployee.setSalary(81_000.81);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName5 = nextEmployee.getFullName();

        nextEmployee = new Employee("Фролова", "Лариса", "Ивановна", "отдел1", 34_000.34);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName6 = nextEmployee.getFullName();

        nextEmployee = new Employee("Лузина", "Елизавета", "Андреевна", "отдел2", 28_000.28);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName7 = nextEmployee.getFullName();

        nextEmployee = new Employee("Вострикова", "Антонина", "Львовна", "отдел3", 44_000.44);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName8 = nextEmployee.getFullName();

        nextEmployee = new Employee("Емильянова", "Инесса", "Романовна", "отдел4", 41_000.41);
        nextEmployee.setDepartment("отдел5");
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName9 = nextEmployee.getFullName();


        nextEmployee = new Employee("Пузанков", "Илья", "Федорович", "отдел5", 77_000.77);
        getArrlist(arrlist, nextEmployee);
        nextSalary = nextEmployee.getSalary();
        getArrSalary(arrSalary, nextSalary);
        String fullName10 = nextEmployee.getFullName();


        String [] ArrFullName = {fullName1, fullName2, fullName3, fullName4, fullName5, fullName6, fullName7, fullName8, fullName9, fullName10};

        System.out.println("Список всех данных о сотрудниках:");
        printArrList(arrlist);
        System.out.println();
        printMonthlyPaymentAmount(arrSalary);
        System.out.println();
        printMonthlyPaymentMin(arrSalary);
        System.out.println();
        printMonthlyPaymentMax(arrSalary);
        System.out.println();
        printAverageSpendingPerMonth(arrSalary);
        System.out.println();
        System.out.println("Список ФИО сотрудников:");
        printArrLFullName(ArrFullName);


    }
}