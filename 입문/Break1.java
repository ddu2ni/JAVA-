package cond;

public class Break1 {
    public static void main(String[] args) {

        //break
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i =" + i + ", sum:=" + sum);
                break;
            }
            i++;
        }

        //continue
        int j = 1;

        while (j <= 5) {
            if (i == 3) { //i가 3일땐 일단 i++ => 4가 되고, 밑에 출력문을 처리하지않고 위로올라감
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
