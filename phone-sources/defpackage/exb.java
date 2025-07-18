package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exb implements ewx {
    public int a;
    final /* synthetic */ exd b;
    private boolean c;

    public exb(exd exdVar) {
        this.b = exdVar;
    }

    private final void c() {
        if (this.c) {
            return;
        }
        exd exdVar = this.b;
        dze dzeVar = exdVar.b;
        exdVar.f.m(eae.b(dzeVar.Y), dzeVar, 0, 0L);
        this.c = true;
    }

    @Override // defpackage.ewx
    public final int a(long j) {
        c();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        return this.b.c;
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) {
        c();
        exd exdVar = this.b;
        boolean z = exdVar.c;
        if (z && exdVar.d == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            ehkVar.addFlag(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            higVar.a = exdVar.b;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        exdVar.d.getClass();
        ehkVar.addFlag(1);
        ehkVar.e = 0L;
        if ((i & 4) == 0) {
            ehkVar.a(exdVar.e);
            ehkVar.c.put(exdVar.d, 0, exdVar.e);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // defpackage.ewx
    public final void b() {
    }
}
