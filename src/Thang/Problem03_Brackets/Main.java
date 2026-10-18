    package Thang.Problem03_Brackets;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;


    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < t; i++) {
                String line = br.readLine();
                if (line == null) line = "";
                if (BracketCheck.check(line)){
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
            }
        }
    }
