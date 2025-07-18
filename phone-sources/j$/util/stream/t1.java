package j$.util.stream;

import j$.nio.file.C0072j;
import java.security.AccessController;

/* loaded from: classes4.dex */
public abstract class t1 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new C0072j(4))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
