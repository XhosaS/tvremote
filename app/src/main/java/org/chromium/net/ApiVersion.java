package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 35;
    private static final String CRONET_VERSION = "138.0.7156.0";
    private static final String LAST_CHANGE = "1f8149e52d17f42e7cad03f331dfbac77fe56706-refs/branch-heads/7156@{#1}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "138.0.7156.0@".concat("1f8149e5");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return API_LEVEL;
    }
}
