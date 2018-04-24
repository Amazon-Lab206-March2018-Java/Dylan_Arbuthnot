class Project {
    private String name;
    private String description;
    public Project() {
        this.name = null;
        this.description = null;
    }
    public Project(String name) {
        this.name = name;
        this.description = null;
    }
    public Project(String name, String desc) {
        this.name = name;
        this.description = desc;
    }
    public String elevatorPitch() {
        String result = this.name + ":" + this.description;
        return result;
    }
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesc(String desc) {
        this.description = desc;
    }
}