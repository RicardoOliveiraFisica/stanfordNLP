package com.stanfornpl.example;

import java.util.List;

import com.stanfornpl.Pipeline;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Lemma {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getInstance();
        String text = "Hey! This is Ricardo de Oliveira. I am a software engineer. I love to code. I am learning new things.";

        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for (CoreLabel coreLabel: coreLabelList) {
            String lemma = coreLabel.lemma();
            System.out.println(coreLabel.originalText() + " = " + lemma);
        }
    }
}
