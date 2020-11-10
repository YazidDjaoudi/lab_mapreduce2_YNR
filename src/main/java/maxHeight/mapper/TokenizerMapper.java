package maxHeight.mapper;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, FloatWritable> {
    private Text text_line = new Text();

    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n"); //Split by line

        while (itr.hasMoreTokens()) {
            text_line.set(itr.nextToken());
            Text species = new Text(text_line.toString().split(";")[3]); //Keep the value of third column

            if (!species.equals(new Text("ESPECE"))) { // skip the first line
                if(!text_line.toString().split(";")[6].equals("")){ // avoid empty value
                    FloatWritable height = new FloatWritable((float)Double.parseDouble(text_line.toString().split(";")[6])); //Keep value of the sixth column
                    context.write(species, height);
                    System.out.println(species + " "+height); //Display test
                }

            }

        }


    }

}