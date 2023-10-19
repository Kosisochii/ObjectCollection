class abtString{
    public static void main(String a[]){
        StringBuffer word = new StringBuffer("Hello");
        System.out.println(word.capacity() - 16);

        String op = new String("come");
        System.out.println(op);
    }
}