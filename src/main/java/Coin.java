import java.util.Scanner;

class Coin {
    Scanner sc;
    int usingMoney;
    int lineNumber;
    int usedMoney;
    int[][] randomNumber;

    Coin() {
        this.sc = new Scanner(System.in);
    }

    void makeLine(int usingMoney) {
        this.usingMoney = usingMoney;
        this.lineNumber = usingMoney / 1000;
        this.randomNumber = new int[this.lineNumber][7];
    }

    void insert() {
        System.out.println("\n얼마를 넣으시겠습니까?(1000원~5000원)");
        this.usingMoney = this.sc.nextInt();
        this.makeLine(this.usingMoney);
    }
}
