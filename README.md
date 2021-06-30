# Spark-graph-algo-lib



Introduction
============

The graph algorithm library running on Kunpeng processors is an acceleration library that provides a rich set of high-level tools for graph algorithms. It is developed based on original APIs of Apache [Spark 2.3.2](https://github.com/apache/spark/tree/v2.3.2). The acceleration library greatly improves the computing power in big data scenarios. Additionally, it provides multiple APIs in addition to the original APIs if the Apache Spark graph library.

The library provides 21 graph algorithms: triangle count (TC), weak clique enumeration (WCE), maximal clique enumeration (MCE), modualrity, closeness, cycle detection (CD), label propagation algorithm (LPA), Louvain, PageRank, shortest-paths, strongly connected components (SCC), connected components (CC), K-core decomposition (KCore), degree centrality (Degree), breadth-first-search (BFS), ClusteringCoefficient, TrustRank, PersonalizedPageRank, Betweenness, Node2Vec and SubgraphMatching. You can find the latest documentation on the project web page. This README file contains only basic setup instructions.





Building
========

    cd Spark-graph-algo-lib/
 
    mvn package

 Obtain "boostkit-graph-acc_2.11-1.3.0-spark2.3.2.jar" from the "Spark-graph-algo-lib/graph-accelerator/target/" directory

 Obtain "boostkit-graph-core_2.11-1.3.0-spark2.3.2.jar" from the "Spark-graph-algo-lib/graph-core/target/" directory
 
 Obtain "boostkit-graph-kernel-clinet_2.11-1.3.0-spark2.3.2.jar" from the "Spark-graph-algo-lib/graph-kernel/target/" directory
 


Contribution Guidelines
========

Track the bugs and feature requests via [GitHub issues](https://github.com/kunpengcompute/Spark-graph-algo-lib/issues).

More Information
========

For further assistance, send an email to kunpengcompute@huawei.com.
