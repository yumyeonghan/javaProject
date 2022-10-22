import java.util.Scanner;

public class Lottery {
    static int[] winningNumber = new int[]{6, 21, 36, 38, 39, 43, 30};
    static int chance = 0;
    static String[] winningReward = new String[]{"2345861063원", "75187855원", "1597781원", "50000원", "5000원"};
    static Scanner scanner;
    static String c1;
    static String c2;

    static {
        scanner = new Scanner(System.in);
        c2 = "y";
    }

    public Lottery() {
    }

    static void startGame() {
        System.out.println("\n지금부터 복권 당첨 게임을 시작하겠습니다.");
    }

    public static void main(String[] args) {
        System.out.println("\n------이번주 복권 당첨번호--------");

        int num;
        for (num = 0; num < 6; ++num) {
            System.out.print(winningNumber[num] + " ");
        }

        System.out.println("+" + winningNumber[6]);
        num = 0;
        Game[] g = new Game[100];

        for (int i = 0; i < 100; ++i) {
            g[i] = new Game();
        }

        do {
            startGame();

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var4) {
                var4.printStackTrace();
            }

            g[num].insert();
            g[num].makeNumber();
            g[num].checkValidity();
            ++chance;
            System.out.println("\n현재 사용한 돈:" + g[num].spendMoney() + "(원)\n게임 이용 횟수:" + chance + "(번)");
            ++num;
            System.out.println("\n게임을 다시 시작하겠습니까? y/n");
            c1 = scanner.next();
        } while (c1.equals(c2));

    }
}
