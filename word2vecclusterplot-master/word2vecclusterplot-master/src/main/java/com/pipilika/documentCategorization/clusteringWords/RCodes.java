/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pipilika.documentCategorization.clusteringWords;

/**
 *
 * @author adnan
 */
public class RCodes {
    
    
    /*
    Step -1:
    
    #Apply Rtsne and output the matrix: script 1
    
     library("Rtsne", lib.loc="~/R/x86_64-pc-linux-gnu-library/3.2")
     library("MASS", lib.loc="/usr/lib/R/library")
    
     mydata <- read.table("/home/adnan/NetBeansProjects/DocumentCategorization/word2vec_model.txt", header=FALSE, sep=" ", na.string = "OPPS", as.is = TRUE,  comment.char = "",  quote = "", row.names =1)
     rtsne_out <- Rtsne(as.matrix(mydata), check_duplicates = FALSE)
     write.matrix(rtsne_out$Y,'/home/adnan/NetBeansProjects/DocumentCategorization/rtsne_out.csv',sep = " ")
    
    ##Step - 2
    Label Rtsne output using java code (LabelRtsneMatrix.java)
    
    
    ##Step - 3
    #Apply k-means (k=50) and output the cluster: script 2
    
    library("MASS", lib.loc="/usr/lib/R/library")

    mydata <- read.table("/home/adnan/NetBeansProjects/DocumentCategorization/rtsne_out_lebeled.txt", na.string = "OPPS", as.is = TRUE, header=FALSE, sep=" ", comment.char = "",  quote = "", row.names =1)
    library(cluster, lib.loc="/usr/lib/R/library")

    fit <- kmeans(mydata, 1000)
    write.matrix(fit$cluster,'cluster_vector_out.csv',sep = ",")
    
    ##Step - 4
    Label cluter output using java code (LabelClusterMatrix.java)

    ##Step - 5
    #plot cluster
    
     x <- 0
     filename <- paste("/home/adnan/NetBeansProjects/DocumentCategorization/plot-cluster", x, "jpg", sep=".")
     cat("> Plotting TSNE to ", filename, " ")
    
     jpeg(filename, width=10240, height=6000)
     clusplot(mydata, fit$cluster, color=TRUE, shade=TRUE, labels=2, lines=0)
     dev.off()
    
    */
        
    
}
