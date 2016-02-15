import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();

    }
    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {

        members.add(member);

    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        int miembros = 0;
        miembros = members.size();
        return miembros;
    }

    /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */

    public int joinedMonth(int month){
        String name = "";
        int year = 0;
        Membership member = new Membership(name,month,year);
        for(int numSocios = 0; numSocios < members.size(); numSocios++){
            numSocios = member.getMonth();
           
        }
        
         return member.getMonth();
    }
}
