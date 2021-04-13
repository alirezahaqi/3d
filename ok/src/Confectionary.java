
import java.util.HashMap;
public class Confectionary
    {
        private int balance = 0;
        static HashMap<Integer, Integer> discounts = new HashMap<Integer, Integer>();
        public Confectionary()
        {
            discounts = new HashMap<Integer, Integer>();
            this.balance = 0;
        }
        public int getBalance()        
        {
            return balance;            
        }
        public void setBalance(int balance)
        {
            this.balance = balance;
        }
        public static boolean isDicountExists(int code)
        {
            if(discounts.get(code) == null)
                return false;
            return true;            
        }
        public static void addDiscount(int code, int price)
        {
            discounts.put(code, price);
        }
        public static int getDiscountPriceByCode(int code)
        {
            return discounts.get(code);
        }
    }
