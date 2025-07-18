package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvb extends xqa {
    private final xvc a;

    public xvb(xvc xvcVar, ybv ybvVar) {
        xvcVar.getClass();
        this.a = xvcVar;
        ybvVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.xqa
    public final void a(int i, String str) {
        Level levelC = c(i);
        if (xvc.a.isLoggable(levelC)) {
            xvc.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.xqa
    public final void b(int i, String str, Object... objArr) {
        Level levelC = c(i);
        d(i);
        a(i, xvc.a.isLoggable(levelC) ? MessageFormat.format(str, objArr) : null);
    }
}
