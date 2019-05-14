Bengali word clusters using word2vec : creation and visualization
=======================================

This is pipeline module for cerating bengali word clusters. Word clusters can be a very useful feature when it comes to Natular Language processing.It can be used as feature for several NLP tasks, for example, document classification, named entity recognition etc. It use word2vec to generate embedding models, Rtsne algorithm to reduce the dimentions, K-means to create and visualize clusters.

This project use Python to generate word2vec model, R to create and visualize word clusters and JAVA for preprocessing and labeling.

### How to use
First, create word2vec model using word2vec.py

Once the model is created, use the following steps to create word clusters and visualize them. 

          /*
            Step -1:
            Apply Rtsne and output the matrix: script 1

            Step - 2
            Label Rtsne output using java code (LabelRtsneMatrix.java)


            Step - 3
            Apply k-means (k=50) and output the cluster: script 2


            Step - 4
            Label cluter output using java code (LabelClusterMatrix.java)
            
            Step - 5
            plot cluster using: script3

            */

### Methods

Details on the methods of this process can be found in the paper titled : Bengali word embeddings and it's application in solving document classification problem Paper link : <https://ieeexplore.ieee.org/document/7860236>
