package district.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
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
            Text districtNumber = new Text(district.toString().split(";")[1]); //Keep the value of second column
            if(!districtNumber.equals(new Text("ARRONDISSEMENT"))){ //Skip the first line
                context.write(districtNumber, new IntWritable(0));
                System.out.println(district.toString().split(";")[1]); //Display test
            }

    }


}

}