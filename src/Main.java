public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int price = 1000;
        int miles = service.calculate(price);
         System.out.println("Вам будет начислено " + miles + " миль за купленный билет.");
    }


}



