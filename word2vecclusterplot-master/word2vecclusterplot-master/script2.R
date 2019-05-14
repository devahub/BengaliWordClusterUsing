
library("MASS", lib.loc="/usr/lib/R/library")
mydata <- read.table("/home/adnan/NetBeansProjects/DocumentCategorization/rtsne_out_lebeled.txt", na.string = "OPPS", as.is = TRUE, header=FALSE, sep=" ", comment.char = "",  quote = "", row.names =1)
library(cluster, lib.loc="/usr/lib/R/library")
fit <- kmeans(mydata, 1000)
write.matrix(fit$cluster,'cluster_vector_out.csv',sep = ",")
