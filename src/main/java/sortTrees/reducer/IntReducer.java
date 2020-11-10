package sortTrees.reducer;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;


public class IntReducer extends Reducer<FloatWritable,Text, Text, FloatWritable> {
    private FloatWritable result = new FloatWritable();

    public void reduce(Text key, Iterable<FloatWritable> values, Context context)
            throws IOException, InterruptedException {
        for (FloatWritable val : values) {
            context.write(key, new FloatWritable(val.get())); //Write all of the value
            System.out.println(key.toString()+ " "+ val);
        }
    }
}