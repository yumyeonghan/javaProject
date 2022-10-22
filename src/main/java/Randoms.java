import java.util.Random;

class Randoms extends Coin {
    int i;
    int j;

    Randoms() {
    }

    boolean checkNumber(int[][] arr) {
        for (this.i = 0; this.i < this.lineNumber; ++this.i) {
            for (int j = 0; j < 5; ++j) {
                if (arr[this.i][j] == arr[this.i][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    void makeNumber() {
        System.out.println("------------생성번호-----------");
        Random rand = new Random();

        for (this.i = 0; this.i < this.lineNumber; ++this.i) {
            do {
                for (this.j = 0; this.j < 6; ++this.j) {
                    this.randomNumber[this.i][this.j] = rand.nextInt(45) + 1;
                }
            } while (!this.checkNumber(this.randomNumber));
        }

        for (this.i = 0; this.i < this.lineNumber; ++this.i) {
            System.out.print(this.i + 1 + "째줄:");

            for (this.j = 0; this.j < 6; ++this.j) {
                System.out.print(this.randomNumber[this.i][this.j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
