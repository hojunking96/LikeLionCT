package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class tests {


    @Test
    @DisplayName("10 => 30")
    public void test1() throws Exception {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }
    @Test
    @DisplayName("4 => 6")
    public void test2() throws Exception {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
}