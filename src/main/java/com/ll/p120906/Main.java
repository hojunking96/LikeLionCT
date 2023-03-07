package com.ll.p120906;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        return (n + "")
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}