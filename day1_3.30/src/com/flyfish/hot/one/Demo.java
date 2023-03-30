package com.flyfish.hot.one;

import java.awt.geom.Area;
import java.util.HashMap;
import java.util.Map;

/**
 * @autohr flyfish
 * @date: 2023/3/30 20:02
 * @description:
 */
public class Demo {

}

/*递归法*/
class solve1{
    public int[] getAns(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}

/*哈希法*/
class solve2{
    public int[] getNums(int[] nums,int tar){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(tar-nums[i])){
                return new int[]{map.get(tar - nums[i]),i};
            }
        }
        return new int[0];
    }
}
