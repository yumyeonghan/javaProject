class Compare extends Randoms {
    int bonusNum;
    int[] num = new int[5];
    int[] count = new int[5];

    Compare() {
    }

    void checkValidity() {
        System.out.println("-------------비교-------------");

        int i;
        for (i = 0; i < this.lineNumber; ++i) {
            this.num[i] = 0;

            for (int j = 0; j < 6; ++j) {
                if (this.randomNumber[i][j] == Lottery.winningNumber[j]) {
                    this.count[i] = ++this.num[i];
                }

                if (this.randomNumber[i][j] == Lottery.winningNumber[6]) {
                    this.bonusNum = 1;
                }
            }
        }

        for (i = 0; i < this.lineNumber; ++i) {
            if (this.count[i] == 3) {
                System.out.println(i + 1 + "째줄:축하드립니다. 5등에 당첨 되셨습니다!\n당첨 금액:" + Lottery.winningReward[4]);
            } else if (this.count[i] == 4) {
                System.out.println(i + 1 + "째줄:축하드립니다. 4등에 당첨 되셨습니다!\n당첨 금액:" + Lottery.winningReward[3]);
            } else if (this.count[i] == 5) {
                System.out.println(i + 1 + "째줄:축하드립니다. 3등에 당첨 되셨습니다!\n당첨 금액:" + Lottery.winningReward[2]);
            } else if (this.count[i] == 5 && this.bonusNum == 1) {
                System.out.println(i + 1 + "째줄:축하드립니다. 2등에 당첨 되셨습니다!\n당첨 금액:" + Lottery.winningReward[1]);
            } else if (this.count[i] == 6) {
                System.out.println(i + 1 + "째줄:축하드립니다. 1등에 당첨 되셨습니다!\n당첨 금액:" + Lottery.winningReward[0]);
            } else {
                System.out.println(i + 1 + "째줄:아쉽게도 당첨되지 못했습니다...");
            }
        }

    }
}
