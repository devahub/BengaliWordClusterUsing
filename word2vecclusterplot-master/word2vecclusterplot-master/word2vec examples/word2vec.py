# -*- coding: utf-8 -*-

import gensim, logging
from gensim.models import Word2Vec
from gensim.models.word2vec import LineSentence


logging.basicConfig(format='%(asctime)s : %(levelname)s : %(message)s', level=logging.INFO)

sentences = LineSentence('all-content-with-wikipedia-test.txt')
model = Word2Vec(sentences, size=300, window=10, min_count=20, workers=8, sg=1, negative=0, hs=1)
model.wv.save_word2vec_format('word2vec_model_300_skip_hs1_neg0.model', binary=True)


#model = Word2Vec.load('word2vec_model.model')
#print str(model.wv[u'বাংলাদেশ']) + "বাংলাদেশ"

