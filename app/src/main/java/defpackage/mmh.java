package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmh {
    public static final String a = "mmh";
    public static final AtomicInteger b = new AtomicInteger(1);

    private mmh() {
    }

    public static int a(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 4 ? 1 : 2;
        }
        return 4;
    }
}
