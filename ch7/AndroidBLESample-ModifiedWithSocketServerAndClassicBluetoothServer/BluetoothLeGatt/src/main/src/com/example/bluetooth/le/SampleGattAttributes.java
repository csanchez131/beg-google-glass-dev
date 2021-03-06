/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.bluetooth.le;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    public static String HEART_RATE_SERVICE_UUID = "0000180d-0000-1000-8000-00805f9b34fb";
    public static String DEVICE_INFORMATION_SERVICE_UUID = "0000180a-0000-1000-8000-00805f9b34fb";
    
    public static String HEART_RATE_MEASUREMENT_CHARACTERISTIC_UUID = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String MANUFACTURER_NAME_CHARACTERISTIC_UUID = "00002a29-0000-1000-8000-00805f9b34fb";

    
    public static String IOS_PERIPHERAL_SERVICE_UUID = "E57DC29A-26F1-41F2-8F37-9C79E015CF6C";
    public static String IOS_PERIPHERAL_CHARACTERISTIC_UUID = "B9D4E5B3-D805-4684-BFF5-867BD2783B5F";
    
    
    static {
        // Sample Services.
        attributes.put(HEART_RATE_SERVICE_UUID, "Heart Rate Service");
        attributes.put(DEVICE_INFORMATION_SERVICE_UUID, "Device Information Service");
        
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT_CHARACTERISTIC_UUID, "Heart Rate Measurement");
        attributes.put(MANUFACTURER_NAME_CHARACTERISTIC_UUID, "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
