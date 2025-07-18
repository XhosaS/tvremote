package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adn {
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
        if (agvy.c("REL", str2)) {
            return false;
        }
        Integer numF = f(str2);
        Integer numF2 = f(str);
        if (numF != null && numF2 != null) {
            numF.intValue();
            numF2.intValue();
            return true;
        }
        if (numF != null || numF2 != null) {
            return numF != null;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("S", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c() {
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

    public static final boolean d() {
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

    public static final boolean e() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("VanillaIceCream", str)) {
                return true;
            }
        }
        return false;
    }

    private static final Integer f(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return agvy.c(upperCase, "BAKLAVA") ? 0 : null;
    }
}
