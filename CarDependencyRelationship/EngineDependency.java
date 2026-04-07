package CarDependencyRelationship;

//The class EngineDependency only has one method, start(),
//which is later invoked by the CarDependency class. 
// The EngineDependency class is not stored as a member variable
// in the CarDependency class, but is instead passed as a 
// parameter to the drive() method, demonstrating a 
// temporary dependency relationship.
class EngineDependency {
    void start() {
        System.out.println("Engine started....");
    }
}
