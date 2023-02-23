package com.ll.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {


    @Test
    @DisplayName("70 => 1")
    public void test1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }
    @Test
    @DisplayName("91 => 3")
    public void test2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }
    @Test
    @DisplayName("180 => 4")
    public void test3() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}
