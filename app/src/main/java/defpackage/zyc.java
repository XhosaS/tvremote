package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyc {
    private final ysa a = new ysa();
    private final String b;
    private volatile Logger c;

    public zyc(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            Logger logger2 = this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.b);
            this.c = logger3;
            return logger3;
        }
    }
}
