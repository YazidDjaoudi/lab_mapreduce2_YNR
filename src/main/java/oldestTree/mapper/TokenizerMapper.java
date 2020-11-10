package oldestTree.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, MapWritable> {
    private Text text_line = new Text();
    MapWritable newpair = new MapWritable(); //Mapper for values like : <key, <key,values>>
    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n"); //Split by line

        while (itr.hasMoreTokens()) {
            text_line.set(itr.nextToken());
            Text districtnumber = new Text(text_line.toString().split(";")[1]); //Keep the number of the district

            if (!districtnumber.equals(new Text("ARRONDISSEMENT"))) { //Skip the first line
                if((!text_line.toString().split(";")[6].equals("")) && (!text_line.toString().split(";")[5].equals(""))){ //Avoid empty value
                    newpair.clear();
                    newpair.put(new IntWritable(Integer.parseInt(text_line.toString().split(";")[1])),new IntWritable(Integer.parseInt(text_line.toString().split(";")[5]))); //Put in the mapper the number of the district and the year of the trees

                    System.out.println(new Text("District")+ " " + newpair ); //Display test
                    context.write(new Text("District"), newpair);

                }

            }

        }

    }

}

