package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sli {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/core/timestamp/TimestampProvider");
    public final int b;
    public final int c;
    public final AtomicReference d;
    private final int e;

    public sli(ruo ruoVar) {
        ruoVar.getClass();
        int iBitCount = Integer.bitCount(ruoVar.e);
        this.e = iBitCount;
        this.b = szr.a(ruoVar.f) * iBitCount;
        this.c = 1000000000 / ruoVar.d;
        rth rthVar = rth.a;
        rsz rszVar = new rsz();
        rtb rtbVar = rtb.a;
        rtb rtbVarA = ryv.a(new rta());
        if ((rszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rszVar.y();
        }
        rth rthVar2 = (rth) rszVar.b;
        rthVar2.c = rtbVarA;
        rthVar2.b = 4;
        this.d = new AtomicReference(ryu.a(rszVar));
    }

    public final void a(rth rthVar) {
        rthVar.getClass();
        this.d.set(rthVar);
    }
}
