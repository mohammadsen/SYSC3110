public class BuddyInfo {

// Mohammad Gaffori 101082318
// Lab 1


    private String Name;
    private String Address;  //Varibles for desired info for BuddyInfo
    private String Phone;  //could have been int, but string was chosen here


    public BuddyInfo(){ //defualt Constructor

    }


    public BuddyInfo(String name, String address, String phone) {  //Constructor with desired info
        Name = name;
        Address = address;
        Phone = phone;
    }

    public  String getName() { //Getter For name of Buddy
        return Name;
    }



    public String getAddress() { //Getter for Address
        return Address;
    }

    public String getPhone() {
        return Phone; //Getter for Phone #
    }



    public static void main(String[] args) {
        AddressBook Ad_book = new AddressBook();
        BuddyInfo Buddy1 = new BuddyInfo("Homer", "Ottawa", "613-260-7222");
        BuddyInfo Buddy2 = new BuddyInfo("Homer", "Ottawa", "613-260-7222");
        Ad_book.addBuddy(Buddy1);
        Ad_book.addBuddy(Buddy2);
        System.out.println("Hello, " + Buddy1.getName());
        System.out.println("Your Phone Number is: " + Buddy1.getPhone());
        System.out.println(Ad_book.getBuddy(0));
    }
}
