public class Main {
    public static void main(String[] args) {
        BufferedWriter writer =
        new BufferedWriter(new FileWriter("rentals.txt", true));

        writer.write("Flying Tesla" );
        writer.newLine();
        writer.close();
    }
}
