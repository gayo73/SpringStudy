package final1;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String newName) {
        // this.id = id; 컴파일 오류 (final 수정 불가)
        this.name = newName;
    }

    public void printData() {
        System.out.println("id=" + id + " name=" + name);
    }
}
