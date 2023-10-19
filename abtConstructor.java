class abtConstructor{
    String name;
    int age;

    public abtConstructor(){
        name = "Kosiso";
        age = 30;
        System.out.printf("%S is my name, i am %d years old.",name,age);
    }

    static{
        System.out.println("Good Morning!!");
    }

    public static void main(String a[]){
        abtConstructor fit = new abtConstructor();
    }
};