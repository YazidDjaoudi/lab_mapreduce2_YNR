package oldestTree.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
import java.util.StringTokenizer;


public class TokenizerMapper extends Mapper<Object, Text, Text, MapWritable> {
    private Text district = new Text();
    MapWritable newpair = new MapWritable();
    @Override
    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(), "\n");

        while (itr.hasMoreTokens()) {
            district.set(itr.nextToken());
            Text districtnumber_t = new Text(district.toString().split(";")[1]);

            if (!districtnumber_t.equals(new Text("ARRONDISSEMENT"))) {
                if((!district.toString().split(";")[6].equals("")) && (!district.toString().split(";")[5].equals(""))){

                    //IntWritable districtnumber = new IntWritable(Integer.parseInt(district.toString().split(";")[1]));
                    newpair.clear();
                    newpair.put(new IntWritable(Integer.parseInt(district.toString().split(";")[1])),new IntWritable(Integer.parseInt(district.toString().split(";")[5])));

                    System.out.println(new Text("District")+ " " + newpair ); //Test d'affichage
                    context.write(new Text("District"), newpair);

                }

            }

        }

    }

}

