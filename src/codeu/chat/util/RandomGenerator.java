package codeu.chat.util;
 +
 +// TODO used and modified some outside code, was not sure how to cite it, this was one suggested way
 +/**
 + * Title: LoremIpsum <br>
 + * Author: Sven Jacobs <br>
 + * Date: 4/18/2017 <br>
 + * Code version: 1.0 <br>
 + * Availability: http://loremipsum.sourceforge.net/ License: MIT License <br>
 + */
 +
 +/**
 + * Randomly generate user, conversations, messages. <br>
 + * Will be later used to generate random use behavior and to find bottlenecks.
 + */
 +public class RandomGenerator {
 +
 +  private static final String LOREM_IPSUM =
 +      "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, "
 +          + "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam "
 +          + "voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, "
 +          + "no sea takimata sanctus est Lorem ipsum dolor sit amet.";
 +  private String[] words;
 +
 +  public RandomGenerator() {
 +    this.words = LOREM_IPSUM.split("\\s");
 +  }
 +
 +  /**
 +   * Returns words from the lorem ipsum text.
 +   *
 +   * @param amount Amount of words
 +   * @return Lorem ipsum text
 +   */
 +  public String getWords(int amount) {
 +
 +    int word = 0;
 +    StringBuilder lorem = new StringBuilder();
 +
 +    for (int i = 0; i < amount; i++) {
 +      if (word == 50) {
 +        word = 0;
 +      }
 +
 +      lorem.append(words[word]);
 +
 +      if (i < amount - 1) {
 +        lorem.append(' ');
 +      }
 +
 +      word++;
 +    }
 +
 +    return lorem.toString();
 +  }
 +
 +  // TODO
 +//  public String getUserName()
 +//  public String getConversation()
 +//
 +
 +}
