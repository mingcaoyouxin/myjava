import java.util.Arrays;
import java.util.Random;

/**
 * Created by pc on 15-4-22.
 * 生成1-1000内的不重复随机数
 */
public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();
        int maxNum=1000,minNum=1,count=900;
        int index ,len=1000;

        int[] randomAraay=new int[count];//保存结果
        int[] init = new int[maxNum];//保存待选集合


        //将1-1000填入数组init中
        for (int i = minNum; i <= maxNum; i++){
            init[i-1] = i;
        }
        //从待选数组中选择一个随机数填入结果数组中，并将待选集合中被选择的那个用最后一个init[999]替换掉，下次从init[0-998]中选择,依次类推
        for (int i = 0; i <count; i++) {
            index = Math.abs(random.nextInt() % len--);//
            randomAraay[i] = init[index];
            init[index] = init[len];
        }
        Arrays.sort(randomAraay);//数组排序输出
        for (int i=0;i<randomAraay.length ; i++) {
            System.out.println(randomAraay[i]);
        }
    }
}

