package TechLead.ProgrammingQuestions;

public class AB extends B implements A{
    public int add(int a, int b) {
        System.out.println("AB" + (a + b));
        return a + b;
        }
    public static void main(String[] args) {
        AB ab = new AB();
        ab.add(1, 2);
        }
    
}
