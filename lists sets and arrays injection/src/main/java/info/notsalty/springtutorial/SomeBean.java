package info.notsalty.springtutorial;

import java.util.List;
import java.util.Set;

public class SomeBean {

	List<String> stringsList;
	Set<Integer> integerList;
	Long[] longArray;

	public SomeBean(List<String> stringsList, Set<Integer> integerList, Long[] longArray) {
		this.stringsList = stringsList;
		this.integerList = integerList;
		this.longArray = longArray;
	}

	public List<String> getStringsList() {
		return stringsList;
	}

	public void setStringsList(List<String> stringsList) {
		this.stringsList = stringsList;
	}

	public Set<Integer> getIntegerList() {
		return integerList;
	}

	public void setIntegerList(Set<Integer> integerList) {
		this.integerList = integerList;
	}

	public Long[] getLongArray() {
		return longArray;
	}

	public void setLongArray(Long[] longArray) {
		this.longArray = longArray;
	}

}
