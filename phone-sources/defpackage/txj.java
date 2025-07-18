package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class txj extends twx {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final twh d;
    private final int e;

    public txj(String str, int i, Level level, boolean z, Set set, twh twhVar) {
        super(str);
        this.e = i;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = twhVar;
    }

    @Override // defpackage.tvw
    public final void c(tvu tvuVar) {
        String strB = (String) tvuVar.l().d(tvo.a);
        if (strB == null) {
            strB = a();
        }
        if (strB == null) {
            strB = tvuVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strH = txu.h(strB);
        Level levelP = tvuVar.p();
        if (!this.b) {
            int iG = txu.g(levelP);
            if (!Log.isLoggable(strH, iG) && !Log.isLoggable("all", iG)) {
                return;
            }
        }
        txk.e(tvuVar, strH, this.e, this.a, this.c, this.d);
    }

    @Override // defpackage.tvw
    public final boolean d(Level level) {
        return true;
    }
}
