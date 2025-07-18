package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezw implements ezy {
    public static final aacv d = new aacv(0, -9223372036854775807L);
    public static final aacv e = new aacv(2, -9223372036854775807L);
    public static final aacv f = new aacv(3, -9223372036854775807L);
    public ezs a;
    public IOException b;
    public final max c;

    public ezw(String str) {
        this.c = new max(edt.ab("ExoPlayer:Loader:".concat(str)), new eoj(6), 1);
    }

    @Override // defpackage.ezy
    public final void a() throws IOException {
        d(Integer.MIN_VALUE);
    }

    public final void b() {
        ezs ezsVar = this.a;
        eci.e(ezsVar);
        ezsVar.a(false);
    }

    public final void c() {
        this.b = null;
    }

    public final void d(int i) throws IOException {
        IOException iOException = this.b;
        if (iOException != null) {
            throw iOException;
        }
        ezs ezsVar = this.a;
        if (ezsVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = ezsVar.a;
            }
            IOException iOException2 = ezsVar.b;
            if (iOException2 != null && ezsVar.c > i) {
                throw iOException2;
            }
        }
    }

    public final void e() {
        f(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecq, java.lang.Object] */
    public final void f(ezu ezuVar) {
        ezs ezsVar = this.a;
        if (ezsVar != null) {
            ezsVar.a(true);
        }
        if (ezuVar != null) {
            this.c.execute(new hx(ezuVar, 3));
        }
        max maxVar = this.c;
        maxVar.a.a(maxVar.b);
    }

    public final boolean g() {
        return this.b != null;
    }

    public final boolean h() {
        return this.a != null;
    }

    public final void i(ezt eztVar, ezr ezrVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        eci.e(looperMyLooper);
        this.b = null;
        new ezs(this, looperMyLooper, eztVar, ezrVar, i, SystemClock.elapsedRealtime()).b(0L);
    }
}
