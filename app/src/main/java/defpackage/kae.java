package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kae {
    private static volatile kae b;
    public final List a = new CopyOnWriteArrayList();

    private kae() {
    }

    public static kae a() {
        if (b == null) {
            synchronized (kae.class) {
                if (b == null) {
                    b = new kae();
                }
            }
        }
        return b;
    }
}
