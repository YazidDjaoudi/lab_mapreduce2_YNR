package sortTrees.job;

import org.apache.hadoop.io.FloatWritable;
import sortTrees.mapper.TokenizerMapper;
import sortTrees.reducer.IntReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class SortTrees {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
        if (otherArgs.length < 2) {
            System.err.println("Usage: sorttrees <in> [<in>...] <out>");
            System.exit(2);
        }
        Job job = Job.getInstance(conf, "sorttrees");
        job.setJarByClass(sortTrees.job.SortTrees.class);
        job.setMapperClass(TokenizerMapper.class);
        job.setCombinerClass(IntReducer.class);
        job.setReducerClass(IntReducer.class);
        job.setOutputKeyClass(FloatWritable.class);
        job.setOutputValueClass(Text.class);
        for (int i = 0; i < otherArgs.length - 1; ++i) {
            FileInputFormat.addInputPath(job, new Path(otherArgs[i]));
        }
        FileOutputFormat.setOutputPath(job,
                new Path(otherArgs[otherArgs.length - 1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}