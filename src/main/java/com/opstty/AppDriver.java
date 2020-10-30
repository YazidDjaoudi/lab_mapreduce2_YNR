package com.opstty;

import com.opstty.job.WordCount;
import district.job.DistrictCount;
import maxHeight.job.MaxHeight;
import org.apache.hadoop.util.ProgramDriver;
import sortTrees.job.SortTrees;
import species.job.ExistingSpecies;
import treesSpecies.job.TreesSpecies;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("districtcount", DistrictCount.class,
                    "A map/reduce program that counts the number of district in the input files.");
            programDriver.addClass("existingspecies", ExistingSpecies.class,
                    "A map/reduce program that display all the existing species in the input files.");
            programDriver.addClass("treesspecies", TreesSpecies.class,
                    "A map/reduce program that display all the number of trees by species in the input files.");
            programDriver.addClass("maxheight", MaxHeight.class,
                    "A map/reduce program that display the maximum height of trees by species in the input files.");
            programDriver.addClass("sorttrees", SortTrees.class,
                    "A map/reduce program that sort the trees height from smallest to largest in the input files.");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
