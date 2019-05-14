# -*- coding: utf-8 -*-

import gensim
from gensim.models import Word2Vec
from gensim.models.keyedvectors import KeyedVectors


print 'loading word2vec'
model = Word2Vec.load('/media/adnan/Common/Word2VecGensim/200D model skipgram/word2vec_model.model')
print 'Model loaded'

#get the vector of a word
print str(model.wv[u'বাংলাদেশ']) + "বাংলাদেশ"


#save models
#model.save('word2vec_model.model')
#save model in txt format for clutering and plotting
model.wv.save_word2vec_format('word2vec_model.txt', binary=False)



