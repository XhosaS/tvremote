package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swz implements swv {
    private static final rvw b;
    public xo a;
    private final zyd c = xt.a(new xq() { // from class: swy
        @Override // defpackage.xq
        public final Object a(xo xoVar) {
            this.a.a = xoVar;
            return "createAudioRouteDisconnectFuture";
        }
    });
    private final yqt d;

    static {
        rvw rvwVar = rvw.a;
        rvv rvvVar = new rvv();
        rwg rwgVar = rwg.a;
        if ((rvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvvVar.y();
        }
        rvw rvwVar2 = (rvw) rvvVar.b;
        rwgVar.getClass();
        rvwVar2.c = rwgVar;
        rvwVar2.b = 2;
        b = (rvw) rvvVar.v();
    }

    public swz(yqt yqtVar) {
        this.d = yqtVar;
    }

    @Override // defpackage.swv
    public final sjs a() {
        rvw rvwVar = b;
        ypv ypvVar = ypv.a;
        return new sjv(this.c, rvwVar, this.d, zxn.h(ypvVar), ypvVar);
    }

    @Override // defpackage.swv
    public final synchronized zyd b(rwk rwkVar) {
        zyd zydVar = this.c;
        if (((xs) zydVar).b.isDone()) {
            return zydVar;
        }
        rvr rvrVar = rvr.a;
        rvq rvqVar = new rvq();
        if ((rvqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rvqVar.y();
        }
        rvr rvrVar2 = (rvr) rvqVar.b;
        rvrVar2.c = rwkVar.N;
        rvrVar2.b |= 1;
        this.a.b((rvr) rvqVar.v());
        return zydVar;
    }
}
