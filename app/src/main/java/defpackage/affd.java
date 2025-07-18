package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affd {
    private static affd a;
    private final List b = Collections.EMPTY_LIST;
    private int c = 0;

    public static synchronized affd a() {
        if (a == null) {
            a = new affd();
        }
        return a;
    }

    public final synchronized List b() {
        this.c++;
        return this.b;
    }

    public final synchronized void c() {
    }
}
