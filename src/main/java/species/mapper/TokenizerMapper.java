package species.mapper;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, IntWritable> {
    private Text text_line = new Text();

    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n"); //Split by line

        while (itr.hasMoreTokens()) {
            text_line.set(itr.nextToken());
            Text species = new Text(text_line.toString().split(";")[3]); //Keep the value of the third column
            if(!species.equals(new Text("ESPECE"))){ //Skip the first line
                context.write(species, new IntWritable(0));
                System.out.println(text_line.toString().split(";")[3]); //Display test
            }

        }


    }

}