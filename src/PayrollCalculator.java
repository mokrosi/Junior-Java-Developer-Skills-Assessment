public class PayrollCalculator {

    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        // Employee types: "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN" switch
        // (employeeType) {
        double weeklyPay;
        switch (employeeType) {
            case "FULL_TIME":

                break;
            case "PART_TIME":
                if (hoursWorked > 40) {
                    weeklyPay = 40 * hourlyRate;
                    weeklyPay = (hourlyRate - 40) * hourlyRate * 1.5;
                    return weeklyPay;
                }
                weeklyPay = hoursWorked * hourlyRate;
                return weeklyPay;

            case "CONTRACTOR":
                weeklyPay = hoursWorked * hourlyRate;
                return weeklyPay;

            case "INTERN":
                if (hoursWorked > 20) {
                    weeklyPay = 20 * hourlyRate * 0.8;

                    return weeklyPay;
                }
                weeklyPay = hoursWorked * hourlyRate * 0.8;
                return weeklyPay;

        }

        return 0;
    }

    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        // Tax brackets using nested if-else:
        // $0-500: 10% tax
        // $501-1000: 15% tax
        // $1001-2000: 20% tax
        // Above $2000: 25% tax
        // If hasHealthInsurance is true, reduce tax by $50
        // Return total tax amount
        double tax = 0;
        if (grossPay >= 0 && grossPay <= 500) {
            tax = grossPay * 0.1;
        } else if (grossPay >= 501 && grossPay <= 1000) {
            tax = grossPay * 0.15;
        } else if (grossPay >= 1001 && grossPay <= 2000) {
            tax = grossPay * 0.2;
        } else if (grossPay > 2000) {
            tax = grossPay * 0.25;
        }

        if (hasHealthInsurance) {
            if (tax <= 50) {
                tax = 0;
            } else {
                tax = tax - 50;
            }
        }
        return tax;
    }

    // Method to process multiple employees and find statistics
    public static double[] processPayroll(String[] employeeTypes, double[] hours,
            double[] rates, String[] names) {
        // Calculate pay for each employee
        // Find: highest paid employee, lowest paid employee, average pay
        // Count how many employees worked overtime (>40 hours)
        // Display results in a formatted table
        // Handle arrays of different lengths gracefully
        int empNum = employeeTypes.length;
        double [] WeeklyPay = new double[empNum];
        while (empNum > 0) {
            double pay = calculateWeeklyPay(employeeTypes[empNum-1],hours[empNum - 1],rates[empNum - 1]);
            WeeklyPay[empNum-1] = pay ;
            empNum--;
        }
        empNum = employeeTypes.length;
        System.out.println("employee weekly pay :");
        while (empNum > 0) {
            displayEmpInfo(names[empNum-1],employeeTypes[empNum-1],hours[empNum-1],rates[empNum-1],WeeklyPay[empNum-1]);
            empNum--;
        }
        // highest paid employee
        System.out.println("highest paid employee : ");
        double hisPay = 0 ; 
        int index = 0;
        for (double d : WeeklyPay) {
            if (d > hisPay) {
                hisPay = d ;
            }
            else{
                index++;
            }
        }
        System.out.println("name :" + names[index]);
        System.out.println("Weekly pay :" + WeeklyPay[index]);
        // lowest paid employee
        System.out.println("lowest paid employee : ");
        double lowPay = 0;
        index = 0;
        for (double d : WeeklyPay) {
            if (d < hisPay) {
                lowPay = d;
            } else {
                index++;
            }
        }
        System.out.println("name :" + names[index]);
        System.out.println("Weekly pay :" + WeeklyPay[index]);
        // average pay
        System.out.println("average paid  : ");
        double payCount  = 0 ;
        double avgPay ;
        for (double d : WeeklyPay) {
            payCount  = payCount + d ;
        }
        avgPay = payCount / WeeklyPay.length ;
        System.out.println(">> "+ avgPay );
        // how many employees worked overtime (>40 hours)
        index = 0 ;
        int overTimeCount = 0 ;
        for (String d : employeeTypes) {
            if(d == "FULL_TIME" && hours[index] > 40  ){
                overTimeCount++;
            }
            index++;
        }
        System.out.println("Number of employees worked overtime (>40 hours)");
        System.out.println(">> " + overTimeCount);

        return WeeklyPay;

    }
    
    public static void displayEmpInfo (String name , String employeeTypes , double hours , double rate ,double pay ) {
        System.out.println("name : " + name);
        System.out.println("employee Types : " + employeeTypes);
        System.out.println("hours : " + hours);
        System.out.println("rate : " + rate);
        System.out.println("weekly pay : " + pay);
    }


    public static void main(String[] args) {
        // Test data:
        String[] types = { "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME" };
        double[] hours = { 45, 20, 35, 15, 50 };
        double[] rates = { 25.0, 18.0, 40.0, 12.0, 30.0 };
        String[] names = { "Alice", "Bob", "Charlie", "Diana", "Eve" };
        boolean [] hasHealthInsurance = {true,true,false,true,true};
        processPayroll(types, hours, rates, names);
        double [] weeklyPay = processPayroll(types, hours, rates, names);
        double taxCount = 0 ;
        int index = 0 ;
        for (double d : weeklyPay) {
            taxCount = calculateTaxDeduction(d, hasHealthInsurance[index]);
            index++;
        }
        System.out.println("total tax amount : ");
        System.out.println(">> "+ taxCount + "$" );
        // Test individual calculations first
        // Then process the entire payroll
        // Show all results clearly

    }
}
