import java.util.ArrayList;
import java.util.Random;

/**
 * Store details of club memberships.
 * 
 * @author Raman Mehat 
 * @version 1, Feb 5th 2015
 */
public class Club
{
    // Define any necessary fields here ...
    
    private ArrayList<Membership> Members;
    private Random rnd;
    private ArrayList<Membership> removemembers;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        Members = new ArrayList<Membership>();
        rnd = new Random();
        removemembers = new ArrayList<Membership>();
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return Members.size();
    }
    
    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join (Membership member)
    {
        Members.add(member);
    }  
    
    /** 
     * Determine if a specific person is a member of the club. 
     * @para mname The person's name. 
     * @return true if that person is a member; 
     * otherwise return false.
     */
      public boolean hasMember (String name)
      {
          for(Membership member : Members){
              if(member.getName().equals(name) == true){
                  return true;
              }
          }
          return false;
    }
    
    /** 
     * Determine the number of members who joined in the given month. 
     * @param month The month we are interested in. 
     * @return The number of members.
     */
     public int joinedInMonth (int month)
    {
        if(month < 1 || month > 12) {
             System.out.println("Month has to be vaild!");
        }
        
        int count = 0;
        for(Membership member : Members){
            if(member.getMonth() == month){
                count++;
            }
        }
        return count;
    }
    
    /**
     * Select a random member of the club.
     * @return The randomly selected member.
     */
     public Membership pickAMember()
     {
         int random = rnd.nextInt(Members.size());
         return Members.get(random);
    }
    
    /**
     * Remove from the club's collection all members who
     * joined in the given month, and return them stored
     * in a separate collection object.
     * @param month The month of the Membership.
     * @return The members who joined in the given month.
     */
     public ArrayList<Membership> purge(int month){
    // removed members is an arraylist of type Membership that stores purged members
    
    if(month < 1 || month > 12) {
        System.out.println("Month has to be vaild!");
        return Members;
    }
    
    for(int i = Members.size() - 1;i >= 0; i--){
        if (Members.get(i).getMonth() == month){
            removemembers.add(Members.get(i));
            Members.remove(i);
    }
    }
    return removemembers;
    }
}
