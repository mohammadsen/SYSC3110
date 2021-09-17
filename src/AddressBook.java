import java.util.*;

public class AddressBook {




    public static void main(String[] args){
        BuddyInfo Buddy1 = new BuddyInfo("Homer", "Ottawa", "613-260-7222");
        AddressBook Ad_book = new AddressBook();
        Ad_book.addBuddy(Buddy1);
        Ad_book.removeBuddy(Buddy1);
        System.out.println("Done");

    }
    ArrayList<BuddyInfo> Buddies = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddyInfo){
        Buddies.add(buddyInfo);
    }

    public  void removeBuddy(BuddyInfo buddyInfo){
        Buddies.remove(buddyInfo);

    }

    public String getBuddy(int x){
       return Buddies.toString();

    }




}
