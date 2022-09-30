package example;

import java.util.List;

public class Project {
    private final String name;
    private final String domainName;
    private final List<Website> websites;

    public Project(String name,
                   String domainName,
                   List<Website> websites) {
        this.name = name;
        this.domainName = domainName;
        this.websites = websites;
    }

    public String getName() {
        return name;
    }

    public String getDomainName() {
        return domainName;
    }

    public List<Website> getWebsites() {
        return websites;
    }
}
