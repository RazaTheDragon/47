package com.example.faizan;

import static jdk.internal.org.objectweb.asm.Opcodes.SWAP;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double venom = Math.random();
        int [] sum = new int [10];
        sum [1]=(int)(venom*100);
        sum [2]=(int)(venom*100);
        sum [3]=(int)(venom*100);
        sum [4]=(int)(venom*100);
        sum [5]=(int)(venom*100);
        sum [6]=(int)(venom*100);
        sum [7]=(int)(venom*100);
        sum [8]=(int)(venom*100);
        sum [9]=(int)(venom*100);
        sum [0]=(int)(venom*100);
        for(int j = 0; j < 9; j++) {
            for(int i = 0; i < 9; i++) {
                if(sum[i]>sum[i+1]) {sum[i]=sum[i+1];
                sum[i+1]=sum[1]};
    }
}}}
