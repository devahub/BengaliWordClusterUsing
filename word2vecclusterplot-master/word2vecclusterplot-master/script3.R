 x <- 0
 filename <- paste("/home/adnan/NetBeansProjects/DocumentCategorization/plot-cluster", x, "jpg", sep=".")
 cat("> Plotting TSNE to ", filename, " ")

 jpeg(filename, width=10240, height=6000)
 clusplot(mydata, fit$cluster, color=TRUE, shade=TRUE, labels=2, lines=0)
 dev.off()
