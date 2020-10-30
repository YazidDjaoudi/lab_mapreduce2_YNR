package sortTrees.mapper;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, FloatWritable, Text> {
    private Text district = new Text();

    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n");

        while (itr.hasMoreTokens()) {
            district.set(itr.nextToken());
            Text districtNumber = new Text(district.toString().split(";")[3]);

            if (!districtNumber.equals(new Text("ESPECE"))) {
                if(!district.toString().split(";")[6].equals("")){
                    FloatWritable height = new FloatWritable((float)Double.parseDouble(district.toString().split(";")[6]));
                    context.write(height, districtNumber);
                    System.out.println(height+ " " + districtNumber); //Test d'affichage
                }

            }

        }


    }

}