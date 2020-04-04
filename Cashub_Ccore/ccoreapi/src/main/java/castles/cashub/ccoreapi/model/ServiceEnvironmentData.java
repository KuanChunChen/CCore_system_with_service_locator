package castles.cashub.ccoreapi.model;

public class ServiceEnvironmentData {

    public String vendorName = "";
    public String deviceImpl = "";
    public String moduleImpl = "";
    public String networkImpl = "";
    public String packageImpl = "";
    public String paymentConfigImpl = "";
    public String printImpl = "";
    public String scannerImpl = "";
    public String systemImpl = "";

    @Override
    public String toString() {
        return "ServiceEnvironmentData{" +
                "vendorName='" + vendorName + '\'' +
                ", deviceImpl='" + deviceImpl + '\'' +
                ", moduleImpl='" + moduleImpl + '\'' +
                ", networkImpl='" + networkImpl + '\'' +
                ", packageImpl='" + packageImpl + '\'' +
                ", paymentConfigImpl='" + paymentConfigImpl + '\'' +
                ", printImpl='" + printImpl + '\'' +
                ", scannerImpl='" + scannerImpl + '\'' +
                ", systemImpl='" + systemImpl + '\'' +
                '}';
    }
}
