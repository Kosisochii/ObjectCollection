class Customer{
    String name;
    int age;
    String location;
};

class CustomerDetails{
    public static void main(String a[]) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        Customer cust3 = new Customer();
        Customer cust4 = new Customer();
        Customer cust5 = new Customer();

        cust1.name = "Monday";
        cust1.age = 49;
        cust1.location = "Malaysia";

        cust2.name = "Tuesday";
        cust2.age = 43;
        cust2.location = "Cotonu";

        cust3.name = "Wednesday";
        cust3.age = 41;
        cust3.location = "Nigeria";

        cust4.name = "Thurdsay";
        cust4.age = 45;
        cust4.location = "Jos";

        cust5.name = "Friday";
        cust5.age = 47;
        cust5.location = "Canada";

        Customer num[] = new Customer[5];
        num[0] = cust1;
        num[1] = cust2;
        num[2] = cust3;
        num[3] = cust4;
        num[4] = cust5;

        for(Customer x : num){
            System.out.println(x.name);
        }
    }
};