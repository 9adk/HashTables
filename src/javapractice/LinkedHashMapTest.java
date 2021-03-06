package javapractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedHashMapTest {

	/**
	 * The method is finding the frequency of the word
	 * and removing a particular word from the linked list
	 */
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves " + "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> map = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = map.get(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			map.add(word, value);
		}
		int frequency = map.get("paranoid");
		System.out.println(map);
		map.remove("avoidable"); 							//Removing the "avoidable" node from the list
		System.out.println(map);
		assertEquals(3, frequency);
	}

}
