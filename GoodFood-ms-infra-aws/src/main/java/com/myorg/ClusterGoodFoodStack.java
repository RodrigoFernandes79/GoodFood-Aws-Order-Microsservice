package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.ecs.Cluster;
import software.constructs.Construct;


public class ClusterGoodFoodStack extends Stack {
    private Cluster cluster;

    public ClusterGoodFoodStack(final Construct scope, final String id, final Vpc vpc) {
        this(scope, id, null, vpc);
    }

    public ClusterGoodFoodStack(final Construct scope, final String id, final StackProps props, final Vpc vpc) {
        super(scope, id, props);
        cluster = Cluster.Builder.create(this, "GoodFoodCluster")
                .clusterName("GoodFood-Cluster")
                .vpc(vpc).build();
    }

    public Cluster getCluster() {
        return cluster;
    }
}
