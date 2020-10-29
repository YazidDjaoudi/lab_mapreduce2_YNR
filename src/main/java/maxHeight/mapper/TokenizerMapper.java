package maxHeight.mapper;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, FloatWritable> {
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
                    context.write(districtNumber, height);
                    System.out.println(districtNumber + " "+height); //Test d'affichage
                }

            }

        }


    }

}