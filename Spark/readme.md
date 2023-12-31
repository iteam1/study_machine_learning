# install scala

`sudo apt-get update`

`sudo apt install openjdk-17-jdk`

`java --version`

`wget https://downloads.lightbend.com/scala/2.13.4/scala-2.13.4.deb`

`sudo dpkg -i scala-2.13.4.deb`

`scala`

# install spark command

Update System Packages `sudo apt update`

Install Java Development Kit (JDK) `sudo apt install default-jdk`

Download Apache Spark on Ubuntu and CentOS `wget https://dlcdn.apache.org/spark/spark-3.5.0/spark-3.5.0-bin-hadoop3.tgz`

Extract the Apache Spark Package `tar xvf spark-3.5.0-bin-hadoop3.tgz`

Move the Spark Directory `sudo mv spark-3.5.0-bin-hadoop3 /opt/spark`

Configure Environment Variables `nano ~/.bashrc`

Add the following lines at the end of the file:

        export SPARK_HOME=/opt/spark
        export PATH=$PATH:$SPARK_HOME/bin

Save the file and exit the text editor. Then, reload the ‘.bashrc’ file: `source ~/.bashrc`

Verify the Installation `spark-shell`

Go to UI `http://localhost:4041/jobs/`

# guide

- compile `scala` file: `scalac <your_file>.scala`
- Run compile `scala <your_class>`

# spark

[Spark-download](https://spark.apache.org/downloads.html)

[Spark-documents](https://spark.apache.org/docs/latest/)

[Apache Spark Full Course 2024 | Learn Apache Spark | Apache Spark Tutorial | Edureka](https://www.youtube.com/watch?v=xDEzSxlsUpU)

[Spark](https://www.youtube.com/watch?v=BihNWmoGf7c&list=PLDBADHjR9XKkVaFb4dUIwVWILNccq4xgp&index=2)


[Spark Full Course | Spark Tutorial For Beginners | Learn Apache Spark | Simplilearn](https://www.youtube.com/watch?v=S2MUhGA3lEw)
