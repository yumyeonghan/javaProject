class Game extends Compare {
    static int sumMoney;

    Game() {
    }

    int spendMoney() {
        sumMoney += this.usingMoney;
        return sumMoney;
    }
}
