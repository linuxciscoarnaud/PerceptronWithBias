# PerceptronWithBias
Implémentation java de l'algorithme du perceptron qui prend en compte le bias

Ce code est une simple implémentation en utilisant le langage de programmation java de l’algorithme du perceptron qui fait intervenir le bias. Cette implémentation ne fait intervenir aucune librairie java d’apprentissage automatique telle que DeepLearning4j ou weka.

Le programme principal commence par définir les paramètres et constantes qui vont être utilisés pour l'apprentissage: Le nombre de données d'entrainement, le nombre de données de test, la dimmension des données d'entrée (qui est en fait le nombre de paramètres), le taux 
d'apprentissage et le bias. Ces données peuvent être modifiées par l'utilisateur de ce code source pour évaluer differents cas de test.

Les données d'entrainement et ceux de test sont generées de telle sorte qu'elles suivent la loi normale (la Gaussienne). Le but ici est d'avoir des données qui refletent autant que possible la réalité

Puis la prochaine étape consiste en l'entrainement proprement dite. Le programme procède par itération de l'apprentissage qui ne prendra fin que lorsque les deux évènements suivant vont se présenter:
- Le nombre d'apprentissage préalablement établi est atteind
- Toutes les données d'entrainement sont correctement classifiées
