# Spark-graph-algo-lib



Introduction
============

MACHINE LEARNING Algorithm library, running on KUNPENG chipset, is an accelerated library that provides a rich set of higher-level tools for machine learning algorithms. It is based on the original APIs from Apache Spark version 2.3.2. The accelerated library for performance optimization greatly improves the computational performance of big data algorithm scenarios.

The current version provides four Graph Algorithms, TC (Triangle Count), WCE (Weak Clique Enumeration), MCE (MaximalClique Enumeration), Modualrity. You can find the latest documentation, including a programming guide, on the project web page. This README file only contains basic setup instructions.





Building
========

    cd Spark-graph-algo-lib/
 
    sbt package

 
 Get sophon-graph-kernel-clinet_2.11-1.0.0.jar under "Spark-graph-algo-lib/target/scala-2.11"
 


Contact
=======

Spark is distributed through GitHub. For the latest version, a bug tracker,
and other information, see

  http://spark.apache.org/

or the repository at

  https://github.com/apache/spark/tree/v2.3.2