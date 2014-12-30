import java.io.*;

/**
 * Created by pc on 14-10-28.
 */
public class Test {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("C://Users//pc//Desktop//learning//1.txt");
            BufferedReader br = new BufferedReader(reader);
            String str = null;
            FileWriter writer = new FileWriter("C://Users//pc//Desktop//learning//2.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            double m=688.55;
            double c=59357;
            double x=1000;
            double r,q,a,f,e;
            str = br.readLine();
            while((str = br.readLine()) != null) {
                r=c/0.8;
                q=r+x;
                a=r/q;
                f=m;
                e=Integer.parseInt(str)-f;
                c=a*x;
                m=m+a*e;
                String out=f+"";
                bw.write(out);
                bw.newLine();
            }
            br.close();
            reader.close();
            bw.close();
            writer.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}