package com.coin.part.imp;

import com.coin.part.type.CPU;

/**
 * IntelCPU IntelCPU具体类
 *
 * @author 25852
 */
public class IntelCPU extends CPU {
    public IntelCPU(String name, int coreNum, double price) {
        super(name, coreNum, price);
    }

    public void work() {
        System.out.println("This is Intel's CPU working");
    }
}
