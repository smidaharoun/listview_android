package smida.haroun.listview;

/**
 * Created by odc on 11/10/16.
 */

public class DataModel {

    String name;
    String type;
    String version_number;
    String feature;

    public DataModel() {
    }

    public DataModel(String name, String type, String version_number, String feature ) {
        this.name=name;
        this.type=type;
        this.version_number=version_number;
        this.feature=feature;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVersion_number() {
        return version_number;
    }

    public String getFeature() {
        return feature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion_number(String version_number) {
        this.version_number = version_number;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
