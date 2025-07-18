package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sjs {
    public static sjs b() {
        rvr rvrVar = rvr.a;
        rvq rvqVar = new rvq();
        rwk rwkVar = rwk.UNKNOWN_DISCONNECT_REASON;
        if ((rvqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvqVar.y();
        }
        rvr rvrVar2 = (rvr) rvqVar.b;
        rvrVar2.c = rwkVar.N;
        rvrVar2.b |= 1;
        zyd zydVarH = zxn.h((rvr) rvqVar.v());
        rvw rvwVar = rvw.a;
        ypv ypvVar = ypv.a;
        return new sjv(zydVarH, rvwVar, ypvVar, zxn.h(ypvVar), ypvVar);
    }

    public abstract rvw a();

    public abstract yqt c();

    public abstract yqt d();

    public abstract zyd e();

    public abstract zyd f();
}
