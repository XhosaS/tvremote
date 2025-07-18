package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrd {
    public static final Random a = new yrb();
    public static final SecureRandom b = a();
    public static final ThreadLocal c;

    static {
        new yrc();
        c = new yra();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
