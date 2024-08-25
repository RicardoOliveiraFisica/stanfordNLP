package com;

import java.util.List;

import com.stanfornpl.Pipeline;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NER {
    public static void main(String[] args) {        
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getInstance();
        String text = "Hey. My name is Ricardo and have friend his name is Noah." + 
        " We both are living in Brazil, in São Paulo";

        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for (CoreLabel coreLabel: coreLabelList) {
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText() + " = " + ner);
        }

    }
}
