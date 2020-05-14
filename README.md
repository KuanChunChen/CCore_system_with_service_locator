
[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

# Preface
----------
This project is a SDK that developer can refer to the interface and creat the own defined function.
And the API will call by the other application.

All module list in this Android project :
  - ccoreAPI
  - ccoreInterface
  
# Features
----------
#### How it work ?

- There are the interface already defined,developer just need to implement it and rewrite the function.
- Then,use the API to control each function.
    
 #### Config setting of Gradle
 - In this project use the concept of **Config.gradle** , and apply from root gradle file.Always use this file to centralized control the module name, library name, android compile SDK version, build tool version...ect.
 
 - E.g. Use such a file have below content :
    ```sh
            ext {
                android = [
                    "compileSdkVersion": 29,
                    "buildToolsVersion": '29.0.1',
                    "minSdkVersion"    : 21,
                    "targetSdkVersion" : 29
                ]
            }
    ```
    
 - Then, use some code like below to get the constant which created before:
    ```sh
        compileSdkVersion rootProject.ext.android['compileSdkVersion']
        buildToolsVersion rootProject.ext.android["buildToolsVersion"]
        minSdkVersion rootProject.ext.android["minSdkVersion"]
        targetSdkVersion rootProject.ext.android["targetSdkVersion"]
    ```
 - Thus,if there are several gradle file,they also can use this method to set the gradle's constants.

# Module Description
----------

#### ccoreAPI module
 - All API in this module.
 - Use Service Locator.
 - This module is the API can contrll the function that vendor provide.
 - When vendor provide different properties, the program will throgh reflect class to use.
 - Module strcture: https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/api.png
 - How the this API work:
 Use **Service Locator** to get the implement function : 
 ```java
  public static BasicIVendor getService(String serviceName) {

        BasicIVendor service = cache.getServices(serviceName);

        if (service != null) {
            Log.d("[Logs]", serviceName + " already exist!");
            return service;
        }

        InitialContext initialContext = new InitialContext();
        BasicIVendor newService = (BasicIVendor) initialContext.lookup(serviceName);
        cache.addService(serviceName, newService);
        return newService;
    }

 ```

And reflect the class from this function:

```java
 private BasicIVendor getReflectClass(String implName) {

        try {
            Class<?> clazz = Class.forName(implName);
            return (BasicIVendor) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
```
Then, according the **.properties** file from provider:

```sh
vendorName=Castles
packageImplPath =castles.cashub.customerimpl.PackageImpl
printImplPath =castles.cashub.customerimpl.PrintImpl
deviceImplPath =castles.cashub.customerimpl.DeviceImpl
moduleImplPath =castles.cashub.customerimpl.ModuleImpl
networkImplPath =castles.cashub.customerimpl.NetworkImpl
paymentConfigImplPath =castles.cashub.customerimpl.PaymentConfigImpl
scannerImplPath =castles.cashub.customerimpl.ScannerImpl
systemImplPath =castles.cashub.customerimpl.SystemImpl
```

However, I wrote the functino in gradle,the program will read the file that people provide before.
```sh
ext.initEnvirnoment = { ->

    final String FILE_PREFIX_PATH = "/src/main/assets/"
    final String FILE_EXTENSION = ".properties"

    Properties properties = new Properties()
    String vendorName = ext.vendor["mainVendor"]
    File proFile = new File(projectDir.absolutePath + FILE_PREFIX_PATH, vendorName + FILE_EXTENSION)

    println "Get Properties from :" + projectDir.absolutePath + FILE_PREFIX_PATH + vendorName + FILE_EXTENSION

    properties.load(proFile.newDataInputStream())
    gradle.ext.vendorName = ext.getPropertyByKey(properties,ext.propertiesKey["vendor"])
    gradle.ext.packageImpl = ext.getPropertyByKey(properties,ext.propertiesKey["package"])
    gradle.ext.printImpl = ext.getPropertyByKey(properties,ext.propertiesKey["print"])
    gradle.ext.deviceImpl = ext.getPropertyByKey(properties,ext.propertiesKey["device"])
    gradle.ext.moduleImpl = ext.getPropertyByKey(properties,ext.propertiesKey["module"])
    gradle.ext.networkImpl = ext.getPropertyByKey(properties,ext.propertiesKey["network"])
    gradle.ext.paymentConfigImpl = ext.getPropertyByKey(properties,ext.propertiesKey["paymentConfig"])
    gradle.ext.scannerImpl = ext.getPropertyByKey(properties,ext.propertiesKey["scanner"])
    gradle.ext.systemImpl = ext.getPropertyByKey(properties,ext.propertiesKey["system"])
    println ext.getPropertyByKey(properties, ext.propertiesKey["system"])


}

ext.getPropertyByKey = {

    Properties properties , String key->
        return properties.getProperty(key) != null ? properties.getProperty(key) : ""
}
```

#### ccoreInterface module
 - All ccore interface in the module.
 - Contain interface, callback, model and constants.
 - Module strcture: https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/interface.png
 - Each interface spec:

A. Device: https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/device.png
B. Network: https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/network.png
C. Module: https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/module.png
D. Package : https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/package.png
F. PaymentConfig :https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/paymentConfig.png
G. Print : https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/print.png
H. Scanner : https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/scanner.png
I. System :https://github.com/KuanChunChen/MyGitHubImage/blob/develop/ccoreSDK/system.png
