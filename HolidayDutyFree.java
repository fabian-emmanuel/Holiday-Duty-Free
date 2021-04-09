/*
The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy
such that the saving over the normal high street price would effectively cover the cost of your holiday.
You will be given the high street price (normPrice), the duty free discount (discount) and the cost of the holiday.
For example, if a bottle cost £10 normally and the discount in duty free was 10%, you would save £1 per bottle.
If your holiday cost £500, the answer you should return would be 500.

All inputs will be integers. Please return an integer. Round down.

 */
public class HolidayDutyFree {
    public static void main(String[] args) {
        System.out.println(dutyFree(10, 10, 500)); //500
        System.out.println(dutyFree(12,50,1000)); //166
        System.out.println(dutyFree(17,10,500));  //294
        System.out.println(dutyFree(24,35,3000)); //357
        System.out.println(dutyFree(1400,35,10000)); //20
        System.out.println(dutyFree(700,26,7000)); //28
    }

    public static int dutyFree(int normPrice, int discount, int hol) {
        return hol*100/(normPrice*discount);
    }

    /*
        Solution 2
        double mainDiscount = discount * 0.01;
        double gainPerBottle = normPrice * mainDiscount;
        double ans = hol / gainPerBottle;
        return (int) ans;
*/
}

