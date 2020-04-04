package castles.cashub.ccore.Interface;

import java.util.List;
import java.util.Map;

import castles.cashub.ccore.model.APNConfig;
import castles.cashub.ccore.constants.Constants;
/**
 * Used to set white list.<br>
 *
 * @author Willy_Chen
 */
public interface IVendorNetworks extends BasicIVendor{


    /**
     * Get total data traffic.
     *
     * @param netType NET_TYPE_WIFI =  1 - wifi <p>
     *                               NET_TYPE_MOBILE_NETWORK = 2 - Mobile network.<p>
     * @param startTimestamp the start time user want to query.
     * @param endTimestamp   the end time user want to query.
     * @return The total data traffic <p> return -1 when it fail .
     */
    long getDataTraffic(int netType, long startTimestamp, long endTimestamp);

    /**
     * Get total data traffic of each application in specified network type.
     *
     * @param netType NET_TYPE_WIFI =  1 - wifi <p>
     *                               NET_TYPE_MOBILE_NETWORK = 2 - Mobile network.<p>
     * @param startTimestamp the start time user want to query.
     * @param endTimestamp   the end time user want to query.
     * @return data traffic map :<p>
     * key(String): package name<p>
     * value(Long): data traffic<p>
     * @see Constants
     */
    Map<String, Long> getAppDataTraffic(int netType, long startTimestamp, long endTimestamp);

    /**
     * Get specified application data traffic.
     *
     * @param packageName    the package name of app
     * @param netType NET_TYPE_WIFI =  1 - wifi <p>
     *                               NET_TYPE_MOBILE_NETWORK = 2 - Mobile network.<p>
     * @param startTimestamp the start time user want to query.
     * @param endTimestamp   the end time user want to query.
     * @return the specified application data traffic
     * @see Constants
     */
    long getAppDataTraffic(String packageName, int netType, long startTimestamp, long endTimestamp);

    /**
     * Set IP security policy.
     *
     * @param policyType policyType :<p>
     *                   POLICY_TYPE_ALLOW_ALL_CONNECTIONS = 1 - Allow all connections <p>
     *                   POLICY_TYPE_USE_IP_DENY_LIST = 2 - Use IP deny list <p>
     *                   POLICY_TYPE_USE_IP_ALLOW_LIST = 3 - Use IP allow list <p>
     * @return true : success<p>
     *  false: failure<p>
     * @see Constants
     */
    boolean setIPSecurityPolicy(int policyType);

    /**
     * Add a deny access IP
     *
     * @param IP IP you want to deny.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean addDenyIP(String IP);

    /**
     * Remove deny IP
     *
     * @param IP The IP which you want to remove from deny IP list.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean removeDenyIP(String IP);

    /**
     * Get the deny IP list.
     *
     * @return the list of deny IP.
     */
    List<String> getDenyIPList();

    /**
     * Clear all deny IPs
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean clearDenyIPList();

    /**
     * Add allow IP.
     *
     * @param IP The IP which user want to allow request.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean addAllowIP(String IP);

    /**
     * Remove allow ip.
     *
     * @param IP The IP which user want to allow request.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean removeAllowIP(String IP);

    /**
     * Get allow IP list.
     *
     * @return allow IP list.
     */
    List<String> getAllowIPList();

    /**
     * Clear allow ip list.
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean clearAllowIPList();

    /**
     * Change hotspot status.
     *
     * @param isEnable true:enable<p>
     *false:disable.<p>
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean changeHotspotStatus(boolean isEnable);

    /**
     * Add APN configuration.
     *
     * @param APNConfig The configurations contain include apnId, name, APNPointName, username, password, proxy, port, server, mmsc, mmsProxy, mmsPort, mcc, mnc, apnType, apnProtocol, apnRoamingProtocol .
     * @return Return -1 when it fail.
     * @see APNConfig
     */
    int addAPN(APNConfig APNConfig);

    /**
     * Update APN configuration.
     *
     * @param APNConfig The configurations contain include apnId, name, APNPointName, username, password, proxy, port, server, mmsc, mmsProxy, mmsPort, mcc, mnc, apnType, apnProtocol, apnRoamingProtocol .
     * @return Return -1 when it fail.
     * @see APNConfig
     */
    int updateAPN(APNConfig APNConfig);

    /**
     * Remove specified APN configuration.
     *
     * @param APNId APN ID
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean removeAPN(int APNId);

    /**
     * Get APN configuration list.
     *
     * @return APN configuration list.
     */
    List<APNConfig> getAPNList();

    /**
     * Select specified APN configuration.
     *
     * @param APNId APN ID
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean selectAPN(int APNId);

    /**
     * Clear the DNS cache.
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean clearDNSCache();

}
