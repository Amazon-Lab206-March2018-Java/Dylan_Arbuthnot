public class ProjectTest {
    public static void main(String[] args) {
        Project first = new Project("First");
        Project second = new Project("Second", "Description");
        System.out.println(second.elevatorPitch());
        System.out.println(first.getDesc());
        first.setDesc("Description of first project");
        System.out.println(first.getDesc());
    }
}