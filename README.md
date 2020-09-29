# Spark-graph-algo-lib



Introduction
============

Graph Algorithm library, running on KUNPENG chipset, is an accelerated library that provides a rich set of higher-level tools for graph algorithms. It is based on the original APIs from Apache Spark version 2.3.2. The accelerated library greatly improves the computational performance in big data scenarios. Additionally, it provides several original created APIs which are not included in Apache Spark graphx library.

The current version provides four Graph Algorithms, TC (Triangle Count), WCE (Weak Clique Enumeration), MCE (MaximalClique Enumeration), Modualrity. You can find the latest documentation, including a programming guide, on the project web page. This README file only contains basic setup instructions.





Building
========

    cd Spark-graph-algo-lib/
 
    mvn package

 
 Get sophon-graph-kernel-clinet_2.11-1.0.0.jar under "Spark-graph-algo-lib/target/"
 


Contact
=======

Spark is distributed through GitHub. For the latest version, a bug tracker,
and other information, see

  http://spark.apache.org/

or the repository at

  https://github.com/apache/spark/tree/v2.3.2
