package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbq {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/SodaDetectionHandlerUtils");
    public static final yyk b = yyk.p("/system/usr/srec", "/product/usr/srec");

    public static boolean a(String str) {
        try {
            String[] list = new File(str).list();
            if (list != null) {
                if (list.length != 0) {
                    return false;
                }
            }
            return true;
        } catch (SecurityException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/libraries/assistant/soda/SodaDetectionHandlerUtils", "isDirectoryEmpty", 66, "SodaDetectionHandlerUtils.java")).x("Read access to the directory is denied: %s", str);
            return true;
        }
    }
}
