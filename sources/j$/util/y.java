package j$.util;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }
}
