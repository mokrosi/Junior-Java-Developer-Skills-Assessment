public class UserInfo {
    
    private String name ;
    
    private int  age ; 
    
    private String email ;

    private boolean isActive ; 

    public UserInfo(String name , int age , String email ,boolean isActive   ) {
        this.name = name ;
        this.age = age ; 
        this.email = email ; 
        this.isActive = isActive ;
    
    }

    public String getName(){

        return name ;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }



    public static void displayInfo(String name, int age, String email, boolean isActive) {
        System.out.println("user info : ");
        System.out.println("name : " + name);
        System.out.println("age : "+ age);
        System.out.println("email : " + email);
        System.out.println("is active : "+ isActive);
    }

    public static void main(String[] args) {
        UserInfo Ahmed  = new UserInfo("Ahmed" , 20 , "zyx1@email.com" , true);
        UserInfo Ali = new UserInfo("Ali", 24, "zyx2@email.com", false);
        UserInfo Saleh  = new UserInfo("Saleh", 30, "zyx3@email.com", true);
        displayInfo(Ahmed.name , Ahmed.age , Ahmed.email , Ahmed.isActive);
        displayInfo(Ali.name, Ali.age, Ali.email, Ali.isActive);
        displayInfo(Saleh.name, Saleh.age, Saleh.email, Saleh.isActive);

    }
}  


