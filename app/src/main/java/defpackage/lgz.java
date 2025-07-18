package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgz implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ lhg b;

    public lgz(lhg lhgVar, long j) {
        this.a = j;
        this.b = lhgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lhg lhgVar = this.b;
        lhgVar.g();
        lhgVar.i();
        lbk lbkVar = lhgVar.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        kzz kzzVar = labVar.k;
        long j = this.a;
        kzzVar.b("Activity paused, time", Long.valueOf(j));
        lhc lhcVar = lhgVar.e;
        lhg lhgVar2 = lhcVar.b;
        klk klkVar = lhgVar2.y.B;
        lhcVar.a = new lhb(lhcVar, System.currentTimeMillis(), j);
        lhgVar2.a.postDelayed(lhcVar.a, 2000L);
        if (lbkVar.d.v()) {
            lhgVar.d.c.a();
        }
    }
}
