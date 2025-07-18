package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knf {
    @Deprecated
    public static String a() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }
}
