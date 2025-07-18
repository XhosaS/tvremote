package j$.util.stream;

import j$.nio.file.C0036j;
import java.security.AccessController;

/* loaded from: classes3.dex */
public abstract class t0 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new C0036j(4))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
