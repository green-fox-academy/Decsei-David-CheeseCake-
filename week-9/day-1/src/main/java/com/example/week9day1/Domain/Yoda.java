package com.example.week9day1.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Yoda {

  @JsonIgnore
  BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.ENGLISH);
  private String text;
  private String response = "";
  private List<String> sentencesFromSithText;
  private List<String[]> wordsFromSentences;
  private List<Integer> numberOfWordsInOneSentence;

  public Yoda(Sith input) {
    this.text = input.getText();
    this.sentencesFromSithText = new ArrayList<>();
    this.wordsFromSentences = new ArrayList<>();
    this.numberOfWordsInOneSentence = new ArrayList<>();
    splitTextToSentences();
    splitSentencesToWords();
    countWordsInSentences();
    //this.response = createResponse();
  }

  public void splitTextToSentences() {
    iterator.setText(text);
    int start = iterator.first();
    for (int end = iterator.next();
        end != BreakIterator.DONE;
        start = end, end = iterator.next()) {
      sentencesFromSithText.add(text.substring(start, end));
    }
  }

  public void countWordsInSentences() {
    for (int i = 0; i < wordsFromSentences.size(); i++) {
      numberOfWordsInOneSentence.add(wordsFromSentences.get(i).length);
    }
  }

  public void splitSentencesToWords() {
    for (int i = 0; i < sentencesFromSithText.size(); i++) {
      wordsFromSentences.add(sentencesFromSithText.get(i).split(" "));
    }
  }

  //public String createResponse()



  public BreakIterator getIterator() {
    return iterator;
  }

  public void setIterator(BreakIterator iterator) {
    this.iterator = iterator;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public List<String> getSentencesFromSithText() {
    return sentencesFromSithText;
  }

  public void setSentencesFromSithText(List<String> sentencesFromSithText) {
    this.sentencesFromSithText = sentencesFromSithText;
  }

  public List<String[]> getWordsFromSentences() {
    return wordsFromSentences;
  }

  public void setWordsFromSentences(List<String[]> wordsFromSentences) {
    this.wordsFromSentences = wordsFromSentences;
  }

  public List<Integer> getNumberOfWordsInOneSentence() {
    return numberOfWordsInOneSentence;
  }

  public void setNumberOfWordsInOneSentence(List<Integer> numberOfWordsInOneSentence) {
    this.numberOfWordsInOneSentence = numberOfWordsInOneSentence;
  }
}
