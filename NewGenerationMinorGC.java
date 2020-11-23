public class NewGenerationMinorGC {
  private static final int MB = 1024 * 1024;

  public static void main(String args[]) {
    System.out.println("Starting allocation test");
    byte[] o1, o2, o3, o4;
    o1 = new byte[2 * MB];
    System.out.println("o1 allocated");
    o2 = new byte[2 * MB];
    System.out.println("o2 allocated");
    o3 = new byte[2 * MB];
    System.out.println("o3 allocated");
    o4 = new byte[4 * MB];
    System.out.println("o4 allocated");
  }
} 
