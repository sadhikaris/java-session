package day2;

public class Student {
    // States

    // name
    // phoneNumber
    // dob
    // class
    // rollNumber
    // height
    // address
    // idNumber
    // email
    // username
    // password
    // emergencyContactNumber
    // socialSecurityNumber

   public static String name;
   private String phoneNumber;
   String dob;
    String sClass;
    String rollNumber;
    float height;
    String address;
    String idNumber;
    String email;
    String username;
    String password;
    String emergencyContactNumber;
    String socialSecurityNumber;



    // behaviour

    // present
    public void present(){
        System.out.println("Student is present");
    }
    // studying
    public void studying(){
        System.out.println("student is studying");
    }
    // playing
    public void playing() {
        System.out.println("student is playing");
    }

    // working
        public void working() {
            System.out.println("student is playing");
        }
    // teaching
            public void teaching() {
            System.out.println("student is playing");
        }
    // discussing
                public void discussing() {
            System.out.println("student is playing");
        }
                    // eating
                    public void eating () {
            System.out.println("student is playing");

        }


    public static void main(String[] args) {
        Student student1 = new Student();     // use new to create new object
        student1.name= "Sudip";
        student1.address = "2616 Jacksboro Hwy";

        Student student2 = new Student();
        student2.email = "try@gmail.com";

        Student student3 = new Student();
       // student3.height = "20"
        student3.password="Hello12345";

        System.out.println(student1.name);
        System.out.println(student2.email);
        System.out.println(student3.password);


        Student student4 = new Student();

    }
                    }

