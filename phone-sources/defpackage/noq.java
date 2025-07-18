package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noq {
    public static final nsf a = new nsf("SessionTransController");
    public boolean d;
    public nnm e;
    public fvx f;
    private final nmj g;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public final Handler c = new ogh(Looper.getMainLooper());
    private final Runnable h = new mpz(this, 16);

    public noq(nmj nmjVar) {
        this.g = nmjVar;
    }

    public final void a() {
        Runnable runnable = this.h;
        ocv.aF(runnable);
        this.c.removeCallbacks(runnable);
    }

    public final boolean b() {
        return this.d && this.g.s;
    }

    public final void c(jys jysVar) {
        nsf.e();
        ocv.aC();
        this.b.add(jysVar);
    }
}
