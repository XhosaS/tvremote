package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnj {
    public final Object a;
    public final Object b;
    public final /* synthetic */ Object c;

    public hnj(moz mozVar, hvd hvdVar, hnn hnnVar) {
        this.c = mozVar;
        this.b = hvdVar;
        this.a = hnnVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a() {
        this.a.execute(new caw(this, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final pa b() {
        return (pa) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bcb, java.lang.Object] */
    public final bdy c(yjv yjvVar, yjv yjvVar2) {
        pa paVarB = b();
        if (paVarB == null) {
            pf pfVar = (pf) this.c;
            Object objA = yjvVar2.a(pfVar.f());
            bhi bhiVar = (bhi) this.b;
            pa paVar = new pa(this, new pd(pfVar, objA, hp.y(bhiVar, yjvVar2.a(pfVar.f())), bhiVar), yjvVar, yjvVar2);
            this.a.b(paVar);
            pfVar.B(paVar.a);
            paVarB = paVar;
        }
        Object obj = this.c;
        paVarB.c = yjvVar2;
        paVarB.b = yjvVar;
        paVarB.b(((pf) obj).e());
        return paVarB;
    }

    public hnj(pf pfVar, bhi bhiVar) {
        this.c = pfVar;
        this.b = bhiVar;
        this.a = new bci(null, bcz.c);
    }

    public hnj(nxo nxoVar, edf edfVar, Executor executor) {
        this.c = nxoVar;
        this.b = new WeakReference(edfVar);
        this.a = executor;
    }

    public hnj(emm emmVar) {
        this.c = emmVar;
        this.b = new Handler(Looper.myLooper());
        this.a = new eml(this);
    }
}
