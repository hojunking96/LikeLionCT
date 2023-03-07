package com.ll.p120906;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class Tests {

    @Test
    public void t1(){
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    public void t2(){
        assertThat(new Solution().solution(930211)).isEqualTo(16);
    }
}