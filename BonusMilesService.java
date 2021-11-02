public class BonusMilesService {
    public long calculate(int price) {
        int bonus = 20;
        int miles = price / bonus;
        return miles;
    }
}