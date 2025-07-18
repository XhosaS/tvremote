package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaf {
    public static final Logger a = Logger.getLogger(aaaf.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private aaaf() {
    }

    public static boolean a() {
        return b.get();
    }
}
