package de.telran.lesson_2_20240620;

public class Task3 {
    public static void main(String[] args) {
        nlog(6);
    }

    static void nlog(int n) {
        for(int i = 0; i < n; i++) //const = 3 time = n
            for(int j = 1; j < n; j = j * 2) // const = 4, times = ?  log 2 (6) = 3 log 3 (6 ) ~ 2
                System.out.println("Hello ["+i+"] ["+j+"]"); //константное время //+1n
    }
}

// (1+2n) * (1+3*logn) = 1 +3logn+ 2n + 6n*logn =  3*logn + 2n + 6n*log(n)  = O(n log(n))
