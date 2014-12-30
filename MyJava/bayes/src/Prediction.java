import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by pc on 14-11-28.
 * 乘法分解模型
 * S---季节变动
 * T---长期趋势
 * C---循环变动
 * I---不规则变动
 */
public class Prediction {
    private ArrayList<Double> timeSeriesOrig=new ArrayList<Double>();
    private ArrayList<Double> monthSeries=new ArrayList<Double>();
    private ArrayList<Double> seasonIndex=new ArrayList<Double>();
    private LinkedList<Double> ceterMovList=new LinkedList<Double>();
    public Prediction(){
        for(int i=0;i<20;i++){
            timeSeriesOrig.add((double)i+1);
            monthSeries.add((double)(i+1)%12);
        }
    }
    public Prediction(ArrayList<Double> data){

    }
    //中心化移动平均,计算TC
    public void centerMovAvg(){
        //移动平均法平滑处理序列值
        for(int i = 6; i < timeSeriesOrig.size()-6; i++)
        {
            double sum = timeSeriesOrig.get(i-6) * 0.5 + timeSeriesOrig.get(i+6) * 0.5;
            for(int j = i - 5; j <= i + 5; j++)
                sum += timeSeriesOrig.get(j);
            ceterMovList.add(i,sum / 12);
        }
    }
    //计算季节因子
    public  void getSeasonIndex(){
        //每个月份出现的次数
        int[] seasonCount = new int[12];
        for(int i = 0; i < 12; i++)
        {
            seasonCount[i] = 0;
        }
        for(int i = 0; i < timeSeriesOrig.size(); i++)
        {
            month = month % 12;
            sindex[month] += A[i+6]/num[i];
            scount[month]++;
            month++;
        }
        double indexsum = 0, indexpara = 0;
        for(int i = 0; i < 12; i++)
        {
            sindex[i] = sindex[i] / scount[i];
            indexsum +=sindex[i];
        }
    }

    //消除季节因子中的残差趋势，进行修正
    public void updateSeasonIndex(){

    }
    public static void main(String [] args){

        //获取初始样本数据
        Prediction prediction=new Prediction();
        //通过中心化移动平均计算趋势循环的初始估计
        prediction.centerMovAvg();
        //计算季节因子
        prediction.getSeasonIndex();
        //修正季节因子
        prediction.updateSeasonIndex();
    }
}
