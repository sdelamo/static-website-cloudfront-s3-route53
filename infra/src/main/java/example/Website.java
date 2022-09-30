package example;

public class Website {
    private final String subdomain;
    private final String path;
    private final String defaultRootObject;

    public Website(String subdomain,
                   String path) {
        this(subdomain, path, "index.html");
    }

    public Website(String subdomain,
                   String path,
                   String defaultRootObject) {
        this.subdomain = subdomain;
        this.path = path;
        this.defaultRootObject = defaultRootObject;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public String getPath() {
        return path;
    }

    public String getDefaultRootObject() {
        return defaultRootObject;
    }
}
