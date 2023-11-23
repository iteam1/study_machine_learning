# install scala

`sudo apt-get update`

`sudo apt install openjdk-17-jdk`

`java --version`

`sudo apt install scal`

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

# spark

[Spark-download](https://spark.apache.org/downloads.html)

[Spark-documents](https://spark.apache.org/docs/latest/)