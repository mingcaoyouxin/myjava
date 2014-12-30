/**
 * Created by pc on 14-11-28.
 */
public class Prediction {

        //计算季节指数
        private static double[] SeasonIndex(int[] A, int month)
        {
            //移动平均法平滑处理序列值
            double[] num = new double[A.length-12];
            for(int i = 6; i < A.length-6; i++)
            {
                double sum = A[i-6] * 0.5 + A[i+6] * 0.5;
                for(int j = i - 5; j <= i + 5; j++)
                    sum += A[j];
                num[i-6] = sum / 12 ;
            }

            //计算季节指数 ,12月存储在sindex[0]中
            double[] sindex = new double[12];
            int[] scount = new int[12];
            for(int i = 0; i < 12; i++)
            {
                sindex[i] = 0;
                scount[i] = 0;
            }
            for(int i = 0; i < num.length; i++)
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

            //季节指数修正
            indexpara = 12/indexsum;
            for(int i = 0; i < 12; i++)
                sindex[i] = sindex[i] * indexpara;

            return sindex;
        }

        //计算剔除季节因素的序列值
        private static double[] TrendSeries(int[] A, int month, double[] sindex)
        {
            double[] num = new double[A.length];
            for(int i = 0; i < num.length; i++)
            {
                month = month % 12;
                num[i] = A[i] * sindex[month];
                month++;
            }
            return num;
        }

        //计算二次曲线回归方程
        private static double[] ModelFunction(double[] num)
        {
            double[] parameters = new double[3];
            parameters[0] = 1;
            parameters[1] = 1;
            parameters[2] = 1;
            return parameters;
        }

        public static void main(String[] args)
        {
            int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            int month = 5;
            double[] sindex = SeasonIndex(A,month);
            double[] num = TrendSeries(A,month,sindex);
            double[] para = ModelFunction(num);
            double[] prediction = new double[A.length +12];
            for(int i = 0; i < A.length + 12; i++)
            {
                prediction[i] = (para[0] + para[1] * i + para[2] * i * i) * sindex[(i + month)%12];
            }
        }


}
