package newprojectprogram;
public abstract class Library {
    private String libraryname;
    private String building;

    public Library(String libraryname, String building) {
        this.libraryname = libraryname;
        this.building = building;
    }

    public String getLibraryName() {
        return libraryname;
    }

    public String getBuilding() {
        return building;
    }
}
