package fu.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
//
// class này là chứa các hàm tiện ích bổ sung mà dùng chung mọi nơi nên là static

public class MathUtil {
    //hàm giai thừa n!=1.2.3.4.5
    //int(2 tỉ 1)
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
