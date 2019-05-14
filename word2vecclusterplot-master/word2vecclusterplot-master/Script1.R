library("Rtsne", lib.loc="~/R/x86_64-pc-linux-gnu-library/3.2")
library("MASS", lib.loc="/usr/lib/R/library")

mydata <- read.table("/home/adnan/NetBeansProjects/DocumentCategorization/word2vec_model.txt", header=FALSE, sep=" ", na.string = "OPPS", as.is = TRUE,  comment.char = "",  quote = "", row.names =1)
rtsne_out <- Rtsne(as.matrix(mydata), check_duplicates = FALSE)
write.matrix(rtsne_out$Y,'/home/adnan/NetBeansProjects/DocumentCategorization/rtsne_out.csv',sep = " ")
