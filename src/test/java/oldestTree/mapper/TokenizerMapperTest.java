package oldestTree.mapper;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import oldestTree.mapper.TokenizerMapper;

import java.io.IOException;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TokenizerMapperTest {
    @Mock
    private Mapper.Context context;
    private oldestTree.mapper.TokenizerMapper tokenizerMapper;

    @Before
    public void setup() {
        this.tokenizerMapper = new oldestTree.mapper.TokenizerMapper();
    }

    @Test
    public void testMap() throws IOException, InterruptedException {

        oldestTree.mapper.TokenizerMapper test = new TokenizerMapper();
        MapWritable newpair = new MapWritable();
        test.map(null, new Text("GEOPOINT;ARRONDISSEMENT;GENRE;ESPECE;FAMILLE;ANNEE PLANTATION;HAUTEUR;CIRCONFERENCE;ADRESSE;NOM COMMUN;VARIETE;OBJECTID;NOM_EV\n" +
                "(48.8685686134, 2.31331809304);8;Calocedrus;decurrens;Cupressaceae;1854;20.0;195.0;Cours-la-Reine, avenue Franklin-D.-Roosevelt, avenue Matignon, avenue Gabriel;Cèdre à encens;;11;Jardin des Champs Elysées\n"+
                "(48.857140829, 2.29533455314);7;Maclura;pomifera;Moraceae;1935;13.0;;Quai Branly, avenue de La Motte-Piquet, avenue de la Bourdonnais, avenue de Suffren;Oranger des Osages;;6;Parc du Champs de Mars\n"), this.context);

        newpair.put(new IntWritable(7),new IntWritable(1935));
        verify(this.context, times(2))
                .write( new Text("District"),newpair);
    }
}