package nl.volst.HoneywellScanner.model;

import com.honeywell.aidc.BarcodeReader;

import java.util.HashMap;
import java.util.Map;

public class ScannerProfile {

    public enum Profile {
        DEFAULT,
        CUSTOM
    }

    private Map<String, Object> profileProperties;

    public ScannerProfile(Profile profile) {
        switch (profile) {
            case CUSTOM: this.profileProperties = getCustomProperties();
                break;
            case DEFAULT: this.profileProperties = getDefaultProperties();
                break;
        }
    }

    public Profile[] getProfiles() {
        return Profile.values();
    }

    private Map<String, Object> getCustomProperties() {
        Map<String, Object> properties = new HashMap<>();

        properties.put(BarcodeReader.PROPERTY_NOTIFICATION_GOOD_READ_ENABLED, false);

        return properties;
    }

    private Map<String, Object> getDefaultProperties() {
        Map<String, Object> properties = new HashMap<>();

        properties.put(BarcodeReader.PROPERTY_NOTIFICATION_GOOD_READ_ENABLED, false);
        properties.put(BarcodeReader.PROPERTY_EAN_13_CHECK_DIGIT_TRANSMIT_ENABLED, true);

        return properties;
    }

    public Map<String, Object> getProfileProperties() {
        return profileProperties;
    }
}
