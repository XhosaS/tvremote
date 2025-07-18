package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zhj extends zgv {
    private final String a;
    private final boolean b;
    private final zfr c;
    private final Level d;
    private final boolean e;
    private final Set f;
    private final zge g;

    public zhj(String str, String str2, boolean z, zfr zfrVar, Level level, boolean z2, Set set, zge zgeVar) {
        super(str2);
        this.a = str;
        this.b = z;
        this.c = zfrVar;
        this.d = level;
        this.e = z2;
        this.f = set;
        this.g = zgeVar;
    }

    @Override // defpackage.zft
    public final void b(zfp zfpVar) {
        String strB = (String) zfpVar.c().c(zfi.a);
        if (strB == null) {
            strB = d();
        }
        if (strB == null) {
            strB = zfpVar.b().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strA = zhd.a(this.a, strB, this.b);
        Level levelG = zfpVar.g();
        if (!this.e) {
            int iB = zhd.b(levelG);
            if (!Log.isLoggable(strA, iB) && !Log.isLoggable("all", iB)) {
                return;
            }
        }
        zhk.e(zfpVar, strA, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.zft
    public final boolean c(Level level) {
        return true;
    }
}
