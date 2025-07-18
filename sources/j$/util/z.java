package j$.util;

import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class z {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new y(0))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
