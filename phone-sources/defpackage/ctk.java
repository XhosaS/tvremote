package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctk {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (yks.e("REL", str2)) {
            return false;
        }
        Integer numD = d(str2);
        Integer numD2 = d(str);
        if (numD != null && numD2 != null) {
            numD.intValue();
            numD2.intValue();
            return true;
        }
        if (numD != null || numD2 != null) {
            return numD != null;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @yfp
    public static final boolean b() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("Tiramisu", str)) {
                return true;
            }
        }
        return false;
    }

    @yfp
    public static final boolean c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("UpsideDownCake", str)) {
                return true;
            }
        }
        return false;
    }

    private static final Integer d(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return yks.e(upperCase, "BAKLAVA") ? 0 : null;
    }
}
