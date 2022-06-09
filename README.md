# Spark-graph-algo-lib



Introduction
============

The graph algorithm library running on Kunpeng processors is an acceleration library that provides a rich set of high-level tools for graph algorithms. It is developed based on original APIs of Apache [Spark 3.1.1](https://github.com/apache/spark/tree/v3.1.1). The acceleration library greatly improves the computing power in big data scenarios. Additionally, it provides multiple APIs in addition to the original APIs if the Apache Spark graph library.

The library provides 16 graph algorithms: triangle count (TC), weak clique enumeration (WCE), maximal clique enumeration (MCE), modualrity, cycle detection (CD), label propagation algorithm (LPA), Louvain, PageRank, Multiple Source shortest path(MSSP), strongly connected components (SCC), K-core decomposition (KCore), breadth-first-search (BFS), ClusteringCoefficient, PersonalizedPageRank, Betweenness and SubgraphMatching. You can find the latest documentation on the project web page. This README file contains only basic setup instructions.





Building
========

    cd Spark-graph-algo-lib/
 
    mvn package

 Obtain "boostkit-graph-acc_2.12-2.1.0-spark3.1.1.jar" from the "Spark-graph-algo-lib/graph-accelerator/target/" directory

 Obtain "boostkit-graph-core_2.12-2.1.0-Spark3.1.1.jar" from the "Spark-graph-algo-lib/graph-core/target/" directory
 
 Obtain "boostkit-graph-kernel-clinet_2.12-2.1.0-Spark3.1.1.jar" from the "Spark-graph-algo-lib/graph-kernel/target/" directory
 


Contribution Guidelines
========

Track the bugs and feature requests via [GitHub issues](https://github.com/kunpengcompute/Spark-graph-algo-lib/issues).

More Information
========

For further assistance, send an email to kunpengcompute@huawei.com.
