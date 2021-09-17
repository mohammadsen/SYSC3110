import java.util.*;

public class AddressBook {


    public static void main(String[] args){
        System.out.println("This is a git");

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
