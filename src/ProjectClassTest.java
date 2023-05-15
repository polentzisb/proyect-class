public class ProjectClassTest {
    public static void main(String[] args){
        ProjectClass testProject = new ProjectClass("proyecto1", "Descripcion proyecto1", 1111.1);
        testProject.setName("proyecto main");
        testProject.setDescription("Santiago de Chile");
        testProject.setCost(2222.22);
        // System.out.println(testProject.getName());
        // System.out.println(testProject.getDescription());
        // System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}
