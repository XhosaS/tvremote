package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pai {
    public static final Level a;

    static {
        Level level;
        try {
            level = Level.parse(String.valueOf(Level.SEVERE.intValue() + 1000));
        } catch (Throwable unused) {
            level = Level.SEVERE;
        }
        a = level;
    }
}
