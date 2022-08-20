package hackerrank.BeatifulDaysAtTheMovies;

public class BeatifulDaysAtTheMovies {
    //https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int checkedNumber,number,remainder,reverse;
        int answer = 0;
        for(int m = i; m <= j; m++){
            number = m;  //i=20;
            reverse = 0;
            while(number!=0){
                remainder = number % 10;          //rem = 0  rem = 2
                reverse = reverse *10 + remainder;    // 0+0   reverse = 2
                number = number/10;    // num = 2      num = 0
            }
            //System.out.println(reverse);
            checkedNumber = Math.abs(reverse-m);
           // System.out.println(checkedNumber);
           // System.out.println(checkedNumber%k);
            // checkedNumber = 2 -  20 = 18
            if(checkedNumber%k==0){
               // System.out.println(m);  // 18/6 ==0
                answer++;           // answer=1
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(13,45,3));

    }

}

