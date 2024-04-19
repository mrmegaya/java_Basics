package inheritanceExamples;

public interface SecondaryInterface extends LegendaryInterface {
	//An Interface can extend another interface, but not IMPLEMENT
	//Only can access the properties but 
	int Secondaryint=2;// variables are STATIC by default in Interface
	String SecondaryString="Hello from Secondary Interface String";// variables are STATIC by default in Interface
	void SecondaryInterfaceownMethod();// can have its own implementation added.
}
