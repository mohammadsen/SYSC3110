import java.util.*;

public class AddressBook {


    private ArrayList<BuddyInfo> Buddies;

    public AddressBook(){
        Buddies = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo buddy){

        if(buddy != null) {
            Buddies.add(buddy);
        }

    }

    public BuddyInfo removeBuddy(int index){

        if(index >= 0 && index < Buddies.size()) {

           return Buddies.remove(index);
        }
        return null;
    }

    public BuddyInfo getBuddy(int x){
       return Buddies.get(x);

    }

    public static void main(String[] args){
        BuddyInfo Buddy1 = new BuddyInfo("Homer", "Ottawa", "613-260-7222");
        AddressBook Ad_book = new AddressBook();
        Ad_book.addBuddy(Buddy1);
      //  Ad_book.getBuddy(0);
        Ad_book.removeBuddy(0);
        System.out.println("Done");

    }


}
