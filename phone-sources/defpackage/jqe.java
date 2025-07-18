package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqe extends ixi {
    public static final Handler d;
    public final ixw e;

    static {
        Handler handlerK = crh.k(Looper.getMainLooper());
        handlerK.getClass();
        d = handlerK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jqe(isy isyVar, wkx wkxVar) {
        vvd vvdVar = wsx.c;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        wly wlyVar = ((wsx) this.b).b;
        this.e = isyVar.a(wlyVar == null ? wly.a : wlyVar);
    }

    @Override // defpackage.ixi, defpackage.sbt
    protected final void e() {
        ykr.q(yoz.m(), null, 0, new jbb(this, (yih) null, 12), 3);
        x(this.e.f(), true, new ajh(this, (yih) null, 5));
    }
}
