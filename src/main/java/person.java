public class person {
   private String name;
   private int age;
   private String gender;
   private String[] interest;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    public person(String name, int age, String gender, String[] interest) {
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.interest = interest;
   }

    public person() {
    }

    public String hello()
   {
       String Message = "Hello, my name is " + name +" and I am "+ age +" years old." + array();;
       System.out.println("Hello, my name is " + name +" and I am "+ age +" years old." + array());
       return Message;
   }

   public String array()
   {
       String words = "My interests are ";
       for(int i=0; i< interest.length; i++)
       {
           int flag = 0;
           while(flag < interest[i].length())
           {
                words=  words + interest[i].charAt(flag);
               flag++;
           }
       }
       System.out.println(words instanceof String  );
       return words;
   }

}

