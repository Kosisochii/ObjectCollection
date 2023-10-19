class Employee{
    String name;
    String department;
    String religion;
    int nin;
    String courseOfStudy;
};

class EmployeeClass{
    public static void main(String a[]){
        Employee p1 = new Employee();
        Employee p2 = new Employee();
        Employee p3 = new Employee();
        Employee p4 = new Employee();
        Employee p5 = new Employee();
        Employee p6 = new Employee();

        p1.name = "Temi";
        p1.department = "Account";
        p1.religion = "Muslim";
        p1.nin = 23945;
        p1.courseOfStudy = "Accounting";

        p2.name = "Tosin";
        p2.department = "Medical";
        p2.religion = "Muslim";
        p2.nin = 2334345;
        p2.courseOfStudy = "Medicine";

        p3.name = "MMesoma";
        p3.department = "Nursing";
        p3.religion = "Christian";
        p3.nin = 423423;
        p3.courseOfStudy = "Nursing";

        p4.name = "Adanna";
        p4.department = "Fishery";
        p4.religion = "Christian";
        p4.nin = 234245;
        p4.courseOfStudy = "Fishery";

        p5.name = "Iyabo";
        p5.department = "Mechanic";
        p5.religion = "Traditional";
        p5.nin = 4534530;
        p5.courseOfStudy = "Engineering";

        p6.name = "Titiwa";
        p6.department = "Theology";
        p6.religion = "Atheist";
        p6.nin = 23945;
        p6.courseOfStudy = "Accounting";

        Employee n[] = new Employee[6];
        n[0] = p1;
        n[1] = p2;
        n[2] = p3;
        n[3] = p4;
        n[4] = p5;
        n[5] = p6;

        for(Employee num : n){
            System.out.printf("Customer Name: %S  Department = %S  NIN = %d.",num.name,num.department,num.nin);
            System.out.println();
            System.out.println();
        }
    }
};