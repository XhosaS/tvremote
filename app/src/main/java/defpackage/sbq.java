package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbq implements sbo {
    private final sbo a;
    private final agzv b = new agzv(false, agzz.a);

    public sbq(sbo sboVar) {
        this.a = sboVar;
    }

    private final void a(rsu rsuVar) {
        if (rsuVar.c == 7) {
            return;
        }
        this.a.b(rsuVar);
    }

    @Override // defpackage.sbo
    public final void b(rsu rsuVar) {
        rsuVar.getClass();
        if (!this.b.a(true)) {
            if (((rsuVar.c == 7 ? (rsw) rsuVar.d : rsw.a).b & 1) == 0) {
                rst rstVar = new rst();
                rsv rsvVar = new rsv();
                rtl.b(1, rsvVar);
                rsw rswVarA = rtl.a(rsvVar);
                if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rstVar.y();
                }
                rsu rsuVar2 = (rsu) rstVar.b;
                rsuVar2.d = rswVarA;
                rsuVar2.c = 7;
                a(rsq.a(rstVar));
            }
        }
        a(rsuVar);
    }
}
