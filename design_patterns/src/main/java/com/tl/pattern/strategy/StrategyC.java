package com.tl.pattern.strategy;

/**
 * 具体策略类,封装算法
 */
public class StrategyC implements Strategy{
    public void show(){
        System.out.println("满1000元加1元换购任意200元以下商品");
    }
}
