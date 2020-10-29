package species.mapper;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, IntWritable> {
    private Text district = new Text();

    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n");

        while (itr.hasMoreTokens()) {
            district.set(itr.nextToken());
            Text districtNumber = new Text(district.toString().split(";")[3]);
            if(!districtNumber.equals(new Text("ESPECE"))){
                context.write(districtNumber, new IntWritable(0));
                System.out.println(district.toString().split(";")[3]); //Test d'affichage
            }

        }


    }

}