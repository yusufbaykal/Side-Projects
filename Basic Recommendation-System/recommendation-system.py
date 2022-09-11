import numpy as np
import pandas as pd
import difflib
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

df = pd.read_csv('movies.csv',encoding='utf8',engine='python')

df.head()
df.info()
print(f'Data size',df.shape)


features_selec = ['genres','keywords','cast','director','tagline']

for i in features_selec:
    df[i] = df[i].fillna('')
    


combi_features = df['genres']+df['keywords']+df['cast']+df['director']+df['tagline']
print(f'Birleştirilen öznitelikler',combi_features)



vectorizer = TfidfVectorizer()
features_vector = vectorizer.fit_transform(combi_features)
print(f'cümlelerin vectorize hali',features_vector)


similatiry = cosine_similarity(features_vector)
print(f'benzelirlik skorları',similatiry)

mov_name = input('Lüften favori filminizi giriniz:')

mov = []
for title in df['title']:
    mov.append(title)
    counter =len(mov)
print(f'Filmlerin listesi',mov)
print(f'Filmlerin sayısı',str(counter))

find_close_match = difflib.get_close_matches(mov_name,mov)
print(find_close_match)

close_match = find_close_match[0]
index_of_the_mov = df[df.title == close_match]['index'].values[0]
print(f'Film indexsi',index_of_the_mov)

sim_score = list(enumerate(similatiry[index_of_the_mov]))
print(f'Benzerlik Skorları',sim_score)

sort_sim_mov = sorted(sim_score,key=lambda x:x[1],reverse=True)
print(sort_sim_mov)

i = 1
for movie  in sort_sim_mov:
    index=movie[0]
    title_frm_index = df[df.index==index]['title'].values[0]
    if i <30:
        print(i,'.',title_frm_index)
        i+=1
        
        