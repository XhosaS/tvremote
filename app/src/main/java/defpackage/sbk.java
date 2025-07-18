package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbk implements sbo {
    public final agzy a;
    final /* synthetic */ sbl b;
    private final int c;
    private final agzv d;

    public sbk(sbl sblVar, int i) {
        this.b = sblVar;
        this.c = i;
        agzz agzzVar = agzz.a;
        this.a = new agzy(null, agzzVar);
        this.d = new agzv(false, agzzVar);
    }

    @Override // defpackage.sbo
    public final void b(rsu rsuVar) {
        rsuVar.getClass();
        agzv agzvVar = this.d;
        if (agzvVar.b()) {
            return;
        }
        if (rsuVar.c == 2) {
            agzvVar.a = 1;
        }
        sbo sboVar = (sbo) this.a.a;
        if (sboVar != null) {
            sboVar.b(rsuVar);
        }
        if (rsuVar.c == 2 || rsuVar.g < this.c) {
            return;
        }
        sbl sblVar = this.b;
        rst rstVar = new rst();
        rtj rtjVar = rtj.a;
        rti rtiVar = new rti();
        rzc.b(rtiVar);
        rtj rtjVarA = rzc.a(rtiVar);
        if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rstVar.y();
        }
        rsu rsuVar2 = (rsu) rstVar.b;
        rsuVar2.d = rtjVarA;
        rsuVar2.c = 2;
        sblVar.f(this, rsq.a(rstVar));
    }
}
