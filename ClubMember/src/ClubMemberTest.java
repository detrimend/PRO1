import java.util.ArrayList;

public class ClubMemberTest
{
  public static void main(String[] args)
  {
    ArrayList<ClubMember> members = new ArrayList<>();

    ClubMember member1 = new Junior("Rasmus",23,'M');
    ClubMember member2 = new Senior("Martin",33);
    ClubMember member3 = new OldBoys("Victor",22,7);

    members.add(member1);
    members.add(member2);
    members.add(member3);

    for (int i = 0; i < members.size(); i++)
    {
      System.out.println("Member " + (i+1) + ":");
      System.out.println(members.get(i).toString() + ".");
      System.out.println("Membership fee: " + members.get(i).getMembershipFee());
      System.out.println();
    }

  }
}
