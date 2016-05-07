package info.notsalty.springtutorial;

public class Application {
	private UserRepository userRepository;
	private DictionaryRepository dictionaryRepository;

	
	 public UserRepository getUserRepository() {
	 return userRepository;
	 }
	////settery  potrzebne do wiazania z u¿yciem byType w autowire
	// public void setUserRepository(UserRepository userRepository) {
	// this.userRepository = userRepository;
	// }
	//
	 public DictionaryRepository getDictionaryRepository() {
	 return dictionaryRepository;
	 }
	//
	// public void setDictionaryRepository(DictionaryRepository
	// dictionaryRepository) {
	// this.dictionaryRepository = dictionaryRepository;
	// }
	public Application(UserRepository userRepository, DictionaryRepository dictionaryRepository) {
		this.userRepository = userRepository;
		this.dictionaryRepository = dictionaryRepository;
	}

}
