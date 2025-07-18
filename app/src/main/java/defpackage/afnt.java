package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnt extends afeo {
    private final afnu a;

    public afnt(afnu afnuVar, agaa agaaVar) {
        afnuVar.getClass();
        this.a = afnuVar;
        agaaVar.getClass();
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

    @Override // defpackage.afeo
    public final void a(int i, String str) {
        Level levelC = c(i);
        if (afnu.a.isLoggable(levelC)) {
            afnu.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.afeo
    public final void b(int i, String str, Object... objArr) {
        Level levelC = c(i);
        d(i);
        a(i, afnu.a.isLoggable(levelC) ? MessageFormat.format(str, objArr) : null);
    }
}
