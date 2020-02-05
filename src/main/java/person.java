public class person {
   private String name;
   private int age;
   private String gender;
   private String[] interest;


   public person(String name,int age,String gender,String[] interest) {
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.interest = interest;
   }
   public void hello()
   {
       System.out.println("Hello, my name is " + name +" and I am "+ age +" years old."+ " My interests are " +  interest[0] +" "+ interest[1]+" "+ interest[2]);
   }

 /*  public String array()
   {
       for(int i=0; i< interest.length; i++)
       {
           String words = interest[i] + " and " + interest[i-1];

       }
       return words;
   }*/

}

