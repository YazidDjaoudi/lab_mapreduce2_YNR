package treesSpecies.mapper;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, IntWritable> {
    private Text text_line = new Text();
    private final static IntWritable one = new IntWritable(1);

    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n"); //Split by line

        while (itr.hasMoreTokens()) {
            text_line.set(itr.nextToken());
            Text districtNumber = new Text(text_line.toString().split(";")[3]); //Keep the third value
            if(!districtNumber.equals(new Text("ESPECE"))){ //Skip the first line
                context.write(districtNumber, one);
                System.out.println(text_line.toString().split(";")[3]); //Display test
            }

        }


    }

}