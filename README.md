# hadoop-examples-mapreduce

Question 1.8.1 :
`yarn jar /home/abenaissa/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \districtcount /user/abenaissa/trees.csv /user/abenaissa/districtcount`

20/11/10 18:53:48 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 18:53:48 INFO hdfs.DFSClient: Created token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030828461, maxDate=1605635628461, sequenceNumber=5921, masterKeyId=46 on ha-hdfs:efrei
20/11/10 18:53:48 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030828461, maxDate=1605635628461, sequenceNumber=5921, masterKeyId=46)
20/11/10 18:53:48 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/abenaissa/.staging/job_1603290159664_3483
20/11/10 18:53:49 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 18:53:49 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 18:53:49 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3483
20/11/10 18:53:49 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605030828461, maxDate=1605635628461, sequenceNumber=5921, masterKeyId=46)]
20/11/10 18:53:49 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 18:53:49 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 18:53:50 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3483
20/11/10 18:53:50 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3483/
20/11/10 18:53:50 INFO mapreduce.Job: Running job: job_1603290159664_3483
20/11/10 18:54:00 INFO mapreduce.Job: Job job_1603290159664_3483 running in uber mode : false
20/11/10 18:54:00 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 18:54:10 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 18:54:16 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 18:54:16 INFO mapreduce.Job: Job job_1603290159664_3483 completed successfully
20/11/10 18:54:16 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=152
                FILE: Number of bytes written=493491
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16880
                HDFS: Number of bytes written=78
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=20520
                Total time spent by all reduces in occupied slots (ms)=11632
                Total time spent by all map tasks (ms)=6840
                Total time spent by all reduce tasks (ms)=2908
                Total vcore-milliseconds taken by all map tasks=6840
                Total vcore-milliseconds taken by all reduce tasks=2908
                Total megabyte-milliseconds taken by all map tasks=10506240
                Total megabyte-milliseconds taken by all reduce tasks=5955584
        Map-Reduce Framework
                Map input records=98
                Map output records=97
                Map output bytes=665
                Map output materialized bytes=152
                Input split bytes=102
                Combine input records=97
                Combine output records=17
                Reduce input groups=17
                Reduce shuffle bytes=152
                Reduce input records=17
                Reduce output records=17
                Spilled Records=34
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=197
                CPU time spent (ms)=3240
                Physical memory (bytes) snapshot=1455824896
                Virtual memory (bytes) snapshot=7271854080
                Total committed heap usage (bytes)=1546125312
                Peak Map Physical memory (bytes)=1155833856
                Peak Map Virtual memory (bytes)=3395244032
                Peak Reduce Physical memory (bytes)=299991040
                Peak Reduce Virtual memory (bytes)=3876610048
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=16778
        File Output Format Counters
                Bytes Written=78
                
[abenaissa@hadoop-edge01 ~]$ hdfs dfs -cat districtcount/part-r-00000
11      1
12      1
13      1
14      1
15      1
16      1
17      1
18      1
19      1
20      1
3       1
4       1
5       1
6       1
7       1
8       1
9       1

                
Question 1.8.2 :
`yarn jar /home/abenaissa/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \existingspecies /user/abenaissa/trees.csv /user/abenaissa/existingspecies`

20/11/10 19:03:20 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:03:20 INFO hdfs.DFSClient: Created token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031400446, maxDate=1605636200446, sequenceNumber=5952, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:03:20 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031400446, maxDate=1605636200446, sequenceNumber=5952, masterKeyId=46)
20/11/10 19:03:20 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/abenaissa/.staging/job_1603290159664_3505
20/11/10 19:03:21 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:03:21 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:03:21 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3505
20/11/10 19:03:21 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605031400446, maxDate=1605636200446, sequenceNumber=5952, masterKeyId=46)]
20/11/10 19:03:21 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 19:03:21 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:03:22 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3505
20/11/10 19:03:22 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3505/
20/11/10 19:03:22 INFO mapreduce.Job: Running job: job_1603290159664_3505
20/11/10 19:03:33 INFO mapreduce.Job: Job job_1603290159664_3505 running in uber mode : false
20/11/10 19:03:33 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:03:42 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:03:48 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:03:48 INFO mapreduce.Job: Job job_1603290159664_3505 completed successfully
20/11/10 19:03:48 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=727
                FILE: Number of bytes written=494631
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16880
                HDFS: Number of bytes written=541
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=20616
                Total time spent by all reduces in occupied slots (ms)=11776
                Total time spent by all map tasks (ms)=6872
                Total time spent by all reduce tasks (ms)=2944
                Total vcore-milliseconds taken by all map tasks=6872
                Total vcore-milliseconds taken by all reduce tasks=2944
                Total megabyte-milliseconds taken by all map tasks=10555392
                Total megabyte-milliseconds taken by all reduce tasks=6029312
        Map-Reduce Framework
                Map input records=98
                Map output records=97
                Map output bytes=1383
                Map output materialized bytes=727
                Input split bytes=102
                Combine input records=97
                Combine output records=45
                Reduce input groups=45
                Reduce shuffle bytes=727
                Reduce input records=45
                Reduce output records=45
                Spilled Records=90
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=209
                CPU time spent (ms)=3040
                Physical memory (bytes) snapshot=1444552704
                Virtual memory (bytes) snapshot=7271665664
                Total committed heap usage (bytes)=1551892480
                Peak Map Physical memory (bytes)=1156997120
                Peak Map Virtual memory (bytes)=3396161536
                Peak Reduce Physical memory (bytes)=287555584
                Peak Reduce Virtual memory (bytes)=3875504128
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=16778
        File Output Format Counters
                Bytes Written=541
                
                
araucana        1
atlantica       1
australis       1
baccata 1
bignonioides    1
biloba  1
bungeana        1
cappadocicum    1
carpinifolia    1
colurna 1
coulteri        1
decurrens       1
dioicus 1
distichum       1
excelsior       1
fraxinifolia    1
giganteum       1
giraldii        1
glutinosa       1
grandiflora     1
hippocastanum   1
ilex    1
involucrata     1
japonicum       1
kaki    1
libanii 1
monspessulanum  1
nigra   1
nigra laricio   1
opalus  1
orientalis      1
papyrifera      1
petraea 1
pomifera        1
pseudoacacia    1
sempervirens    1
serrata 1
stenoptera      1
suber   1
sylvatica       1
tomentosa       1
tulipifera      1
ulmoides        1
virginiana      1
x acerifolia    1
                
Question 1.8.3 :
`yarn jar /home/abenaissa/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \treesspecies /user/abenaissa/trees.csv /user/abenaissa/treesspecies`

20/11/10 19:15:52 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:15:52 INFO hdfs.DFSClient: Created token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032152586, maxDate=1605636952586, sequenceNumber=5987, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:15:52 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032152586, maxDate=1605636952586, sequenceNumber=5987, masterKeyId=46)
20/11/10 19:15:52 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/abenaissa/.staging/job_1603290159664_3529
20/11/10 19:15:53 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:15:53 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:15:53 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3529
20/11/10 19:15:53 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032152586, maxDate=1605636952586, sequenceNumber=5987, masterKeyId=46)]
20/11/10 19:15:53 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 19:15:54 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:15:54 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3529
20/11/10 19:15:54 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3529/
20/11/10 19:15:54 INFO mapreduce.Job: Running job: job_1603290159664_3529
20/11/10 19:16:04 INFO mapreduce.Job: Job job_1603290159664_3529 running in uber mode : false
20/11/10 19:16:04 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:16:14 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:16:24 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:16:25 INFO mapreduce.Job: Job job_1603290159664_3529 completed successfully
20/11/10 19:16:25 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=727
                FILE: Number of bytes written=494649
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16880
                HDFS: Number of bytes written=542
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=21162
                Total time spent by all reduces in occupied slots (ms)=28344
                Total time spent by all map tasks (ms)=7054
                Total time spent by all reduce tasks (ms)=7086
                Total vcore-milliseconds taken by all map tasks=7054
                Total vcore-milliseconds taken by all reduce tasks=7086
                Total megabyte-milliseconds taken by all map tasks=10834944
                Total megabyte-milliseconds taken by all reduce tasks=14512128
        Map-Reduce Framework
                Map input records=98
                Map output records=97
                Map output bytes=1383
                Map output materialized bytes=727
                Input split bytes=102
                Combine input records=97
                Combine output records=45
                Reduce input groups=45
                Reduce shuffle bytes=727
                Reduce input records=45
                Reduce output records=45
                Spilled Records=90
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=207
                CPU time spent (ms)=3480
                Physical memory (bytes) snapshot=1445027840
                Virtual memory (bytes) snapshot=7265951744
                Total committed heap usage (bytes)=1550319616
                Peak Map Physical memory (bytes)=1152032768
                Peak Map Virtual memory (bytes)=3391004672
                Peak Reduce Physical memory (bytes)=292995072
                Peak Reduce Virtual memory (bytes)=3874947072
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=16778
        File Output Format Counters
                Bytes Written=542
                
[abenaissa@hadoop-edge01 ~]$ hdfs dfs -cat /user/abenaissa/treesspecies/part-r-00000
araucana        1
atlantica       2
australis       1
baccata 2
bignonioides    1
biloba  5
bungeana        1
cappadocicum    1
carpinifolia    4
colurna 3
coulteri        1
decurrens       1
dioicus 1
distichum       3
excelsior       1
fraxinifolia    2
giganteum       5
giraldii        1
glutinosa       1
grandiflora     1
hippocastanum   3
ilex    1
involucrata     1
japonicum       1
kaki    2
libanii 2
monspessulanum  1
nigra   3
nigra laricio   1
opalus  1
orientalis      8
papyrifera      1
petraea 2
pomifera        1
pseudoacacia    1
sempervirens    1
serrata 1
stenoptera      1
suber   1
sylvatica       8
tomentosa       2
tulipifera      2
ulmoides        1
virginiana      2
x acerifolia    11

                
Question 1.8.4 :
`yarn jar /home/abenaissa/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \maxheight /user/abenaissa/trees.csv /user/abenaissa/maxheight`

20/11/10 19:19:45 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:19:45 INFO hdfs.DFSClient: Created token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032385860, maxDate=1605637185860, sequenceNumber=5994, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:19:45 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032385860, maxDate=1605637185860, sequenceNumber=5994, masterKeyId=46)
20/11/10 19:19:46 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/abenaissa/.staging/job_1603290159664_3535
20/11/10 19:19:46 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:19:46 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:19:47 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3535
20/11/10 19:19:47 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032385860, maxDate=1605637185860, sequenceNumber=5994, masterKeyId=46)]
20/11/10 19:19:47 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 19:19:47 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:19:48 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3535
20/11/10 19:19:48 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3535/
20/11/10 19:19:48 INFO mapreduce.Job: Running job: job_1603290159664_3535
20/11/10 19:19:59 INFO mapreduce.Job: Job job_1603290159664_3535 running in uber mode : false
20/11/10 19:19:59 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:20:09 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:20:18 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:20:18 INFO mapreduce.Job: Job job_1603290159664_3535 completed successfully
20/11/10 19:20:18 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=727
                FILE: Number of bytes written=494623
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16880
                HDFS: Number of bytes written=675
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=22992
                Total time spent by all reduces in occupied slots (ms)=29132
                Total time spent by all map tasks (ms)=7664
                Total time spent by all reduce tasks (ms)=7283
                Total vcore-milliseconds taken by all map tasks=7664
                Total vcore-milliseconds taken by all reduce tasks=7283
                Total megabyte-milliseconds taken by all map tasks=11771904
                Total megabyte-milliseconds taken by all reduce tasks=14915584
        Map-Reduce Framework
                Map input records=98
                Map output records=96
                Map output bytes=1369
                Map output materialized bytes=727
                Input split bytes=102
                Combine input records=96
                Combine output records=45
                Reduce input groups=45
                Reduce shuffle bytes=727
                Reduce input records=45
                Reduce output records=45
                Spilled Records=90
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=188
                CPU time spent (ms)=3590
                Physical memory (bytes) snapshot=1448292352
                Virtual memory (bytes) snapshot=7269715968
                Total committed heap usage (bytes)=1558183936
                Peak Map Physical memory (bytes)=1157242880
                Peak Map Virtual memory (bytes)=3393982464
                Peak Reduce Physical memory (bytes)=291049472
                Peak Reduce Virtual memory (bytes)=3875733504
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=16778
        File Output Format Counters
                Bytes Written=675
                
[abenaissa@hadoop-edge01 ~]$ hdfs dfs -cat /user/abenaissa/maxheight/part-r-00000
araucana        9.0
atlantica       25.0
australis       16.0
baccata 13.0
bignonioides    15.0
biloba  33.0
bungeana        10.0
cappadocicum    16.0
carpinifolia    30.0
colurna 20.0
coulteri        14.0
decurrens       20.0
dioicus 10.0
distichum       35.0
excelsior       30.0
fraxinifolia    27.0
giganteum       35.0
giraldii        35.0
glutinosa       16.0
grandiflora     12.0
hippocastanum   30.0
ilex    15.0
involucrata     12.0
japonicum       10.0
kaki    14.0
libanii 30.0
monspessulanum  12.0
nigra   30.0
nigra laricio   30.0
opalus  15.0
orientalis      34.0
papyrifera      12.0
petraea 31.0
pomifera        13.0
pseudoacacia    11.0
sempervirens    30.0
serrata 18.0
stenoptera      30.0
suber   10.0
sylvatica       30.0
tomentosa       20.0
tulipifera      35.0
ulmoides        12.0
virginiana      14.0
x acerifolia    45.0


Question 1.8.5 :
`yarn jar /home/abenaissa/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \sorttrees /user/abenaissa/trees.csv /user/abenaissa/sorttrees`

20/11/10 19:23:54 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:23:54 INFO hdfs.DFSClient: Created token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032634354, maxDate=1605637434354, sequenceNumber=6001, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:23:54 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032634354, maxDate=1605637434354, sequenceNumber=6001, masterKeyId=46)
20/11/10 19:23:54 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/abenaissa/.staging/job_1603290159664_3541
20/11/10 19:23:55 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:23:55 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:23:55 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3541
20/11/10 19:23:55 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032634354, maxDate=1605637434354, sequenceNumber=6001, masterKeyId=46)]
20/11/10 19:23:55 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 19:23:55 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:23:56 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3541
20/11/10 19:23:56 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3541/
20/11/10 19:23:56 INFO mapreduce.Job: Running job: job_1603290159664_3541
20/11/10 19:24:06 INFO mapreduce.Job: Job job_1603290159664_3541 running in uber mode : false
20/11/10 19:24:06 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:24:15 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:24:25 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:24:26 INFO mapreduce.Job: Job job_1603290159664_3541 completed successfully
20/11/10 19:24:26 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=1567
                FILE: Number of bytes written=496303
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16880
                HDFS: Number of bytes written=1461
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=20931
                Total time spent by all reduces in occupied slots (ms)=28792
                Total time spent by all map tasks (ms)=6977
                Total time spent by all reduce tasks (ms)=7198
                Total vcore-milliseconds taken by all map tasks=6977
                Total vcore-milliseconds taken by all reduce tasks=7198
                Total megabyte-milliseconds taken by all map tasks=10716672
                Total megabyte-milliseconds taken by all reduce tasks=14741504
        Map-Reduce Framework
                Map input records=98
                Map output records=96
                Map output bytes=1369
                Map output materialized bytes=1567
                Input split bytes=102
                Combine input records=96
                Combine output records=96
                Reduce input groups=28
                Reduce shuffle bytes=1567
                Reduce input records=96
                Reduce output records=96
                Spilled Records=192
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=195
                CPU time spent (ms)=3960
                Physical memory (bytes) snapshot=1446141952
                Virtual memory (bytes) snapshot=7267647488
                Total committed heap usage (bytes)=1557135360
                Peak Map Physical memory (bytes)=1155153920
                Peak Map Virtual memory (bytes)=3393019904
                Peak Reduce Physical memory (bytes)=290988032
                Peak Reduce Virtual memory (bytes)=3874627584
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=16778
        File Output Format Counters
                Bytes Written=1461
                
[abenaissa@hadoop-edge01 ~]$ hdfs dfs -cat /user/abenaissa/sorttrees/part-r-00000
2.0     sylvatica
5.0     baccata
6.0     atlantica
9.0     araucana
10.0    japonicum
10.0    suber
10.0    bungeana
10.0    dioicus
10.0    sylvatica
11.0    pseudoacacia
12.0    virginiana
12.0    grandiflora
12.0    carpinifolia
12.0    ulmoides
12.0    monspessulanum
12.0    kaki
12.0    papyrifera
12.0    involucrata
13.0    baccata
13.0    pomifera
14.0    kaki
14.0    coulteri
14.0    virginiana
15.0    opalus
15.0    bignonioides
15.0    sylvatica
15.0    carpinifolia
15.0    ilex
16.0    glutinosa
16.0    cappadocicum
16.0    carpinifolia
16.0    australis
18.0    biloba
18.0    serrata
18.0    hippocastanum
18.0    sylvatica
20.0    colurna
20.0    x acerifolia
20.0    tomentosa
20.0    colurna
20.0    decurrens
20.0    colurna
20.0    orientalis
20.0    sylvatica
20.0    tomentosa
20.0    giganteum
20.0    distichum
20.0    orientalis
22.0    biloba
22.0    hippocastanum
22.0    orientalis
22.0    fraxinifolia
22.0    tulipifera
23.0    sylvatica
25.0    atlantica
25.0    biloba
25.0    x acerifolia
25.0    orientalis
25.0    nigra
25.0    biloba
26.0    orientalis
27.0    fraxinifolia
27.0    orientalis
28.0    nigra
30.0    nigra laricio
30.0    petraea
30.0    giganteum
30.0    stenoptera
30.0    carpinifolia
30.0    sempervirens
30.0    sylvatica
30.0    x acerifolia
30.0    distichum
30.0    x acerifolia
30.0    nigra
30.0    sylvatica
30.0    giganteum
30.0    excelsior
30.0    libanii
30.0    libanii
30.0    hippocastanum
31.0    petraea
31.0    orientalis
32.0    x acerifolia
33.0    biloba
34.0    orientalis
35.0    distichum
35.0    tulipifera
35.0    x acerifolia
35.0    giraldii
35.0    giganteum
40.0    x acerifolia
40.0    x acerifolia
40.0    x acerifolia
42.0    x acerifolia
45.0    x acerifolia

                
Question 1.8.6 :
`yarn jar /home/abenaissa/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \oldesttrees /user/abenaissa/trees.csv /user/abenaissa/oldesttrees`

20/11/10 19:26:09 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:26:09 INFO hdfs.DFSClient: Created token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032769473, maxDate=1605637569473, sequenceNumber=6004, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:26:09 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032769473, maxDate=1605637569473, sequenceNumber=6004, masterKeyId=46)
20/11/10 19:26:09 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/abenaissa/.staging/job_1603290159664_3544
20/11/10 19:26:10 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:26:10 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:26:10 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3544
20/11/10 19:26:10 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for abenaissa: HDFS_DELEGATION_TOKEN owner=abenaissa@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605032769473, maxDate=1605637569473, sequenceNumber=6004, masterKeyId=46)]
20/11/10 19:26:10 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 19:26:10 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:26:11 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3544
20/11/10 19:26:11 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3544/
20/11/10 19:26:11 INFO mapreduce.Job: Running job: job_1603290159664_3544
20/11/10 19:26:21 INFO mapreduce.Job: Job job_1603290159664_3544 running in uber mode : false
20/11/10 19:26:21 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:26:30 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:26:39 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:26:39 INFO mapreduce.Job: Job job_1603290159664_3544 completed successfully
20/11/10 19:26:40 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=32
                FILE: Number of bytes written=493241
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16880
                HDFS: Number of bytes written=18
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=20229
                Total time spent by all reduces in occupied slots (ms)=27752
                Total time spent by all map tasks (ms)=6743
                Total time spent by all reduce tasks (ms)=6938
                Total vcore-milliseconds taken by all map tasks=6743
                Total vcore-milliseconds taken by all reduce tasks=6938
                Total megabyte-milliseconds taken by all map tasks=10357248
                Total megabyte-milliseconds taken by all reduce tasks=14209024
        Map-Reduce Framework
                Map input records=98
                Map output records=76
                Map output bytes=1824
                Map output materialized bytes=32
                Input split bytes=102
                Combine input records=76
                Combine output records=1
                Reduce input groups=1
                Reduce shuffle bytes=32
                Reduce input records=1
                Reduce output records=1
                Spilled Records=2
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=189
                CPU time spent (ms)=2950
                Physical memory (bytes) snapshot=1453748224
                Virtual memory (bytes) snapshot=7271452672
                Total committed heap usage (bytes)=1559232512
                Peak Map Physical memory (bytes)=1156751360
                Peak Map Virtual memory (bytes)=3394023424
                Peak Reduce Physical memory (bytes)=296996864
                Peak Reduce Virtual memory (bytes)=3877429248
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=16778
        File Output Format Counters
                Bytes Written=18

[abenaissa@hadoop-edge01 ~]$ hdfs dfs -cat oldesttrees/part-r-00000    

District :       5 
