package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "myName");
        member.printData();
        member.changeData("newName");
        member.printData();
    }
}
