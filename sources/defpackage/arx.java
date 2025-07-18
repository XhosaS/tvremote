package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arx extends cee {
    private final awy a;

    public arx(awy awyVar, byg bygVar) {
        super("");
        this.a = awyVar;
    }

    @Override // defpackage.cee, defpackage.cdd
    public final void a(RuntimeException runtimeException, cdb cdbVar) {
        Log.e("PrimesFloggerBackend", "Internal logging error", runtimeException);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @Override // defpackage.cdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.cdb r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arx.b(cdb):void");
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        return true;
    }
}
