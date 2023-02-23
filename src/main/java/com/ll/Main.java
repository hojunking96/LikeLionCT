package com.ll;


public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
    }
}


class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}