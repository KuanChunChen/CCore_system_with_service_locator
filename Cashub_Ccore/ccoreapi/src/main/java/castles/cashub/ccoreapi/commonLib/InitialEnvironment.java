package castles.cashub.ccoreapi.commonLib;

import java.io.IOException;
import java.util.Properties;

import castles.cashub.ccoreapi.constants.CommonConstant;
import castles.cashub.ccoreapi.model.ServiceEnvironmentData;


public class InitialEnvironment {


    public ServiceEnvironmentData serviceEnvironmentData = null;

    private final String FILE_PREFIX_PATH = "/assets/";
    private final String FILE_EXTENSION = ".properties";



    public ServiceEnvironmentData initServiceEnviroment(String vendorName) {

        Properties properties = new Properties();
        String filePath = FILE_PREFIX_PATH + vendorName + FILE_EXTENSION;
        ServiceEnvironmentData serviceEnvironmentData = new ServiceEnvironmentData();
        try {
            properties.load(InitialEnvironment.class.getResourceAsStream(filePath));
            serviceEnvironmentData = new ServiceEnvironmentData();

            serviceEnvironmentData.vendorName = properties.getProperty(CommonConstant.ServiceKey.SERVICE_VENDOR_NAME);
            serviceEnvironmentData.packageImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_PACKAGE);
            serviceEnvironmentData.printImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_PRINT);
            serviceEnvironmentData.deviceImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_DEVICE);
            serviceEnvironmentData.moduleImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_MODULE);
            serviceEnvironmentData.networkImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_NETWORK);
            serviceEnvironmentData.paymentConfigImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_PAYMENT_CONFIG);
            serviceEnvironmentData.scannerImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_SCANNER);
            serviceEnvironmentData.systemImpl = properties.getProperty(CommonConstant.ServiceKey.SERVICE_SYSTEM);

            return serviceEnvironmentData;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return serviceEnvironmentData;
    }

    public void setServiceEnviroment(ServiceEnvironmentData serviceEnviroment) {
        this.serviceEnvironmentData = serviceEnviroment;
    }


    public static synchronized InitialEnvironment getInstance(){
        return InitialEnvironment.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InitialEnvironment INSTANCE = new InitialEnvironment();
    }
}
