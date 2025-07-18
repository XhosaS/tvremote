package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egg implements eer {
    public egc a;
    public eer b = new eff();
    public final egk c = egk.a;
    public eer d;
    public nuh e;
    private eeq f;
    private boolean g;
    private int h;

    @Override // defpackage.eer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final egh a() {
        eer eerVar = this.d;
        return d(eerVar != null ? eerVar.a() : null, this.h, 0);
    }

    public final egh c() {
        eer eerVar = this.d;
        return d(eerVar != null ? eerVar.a() : null, 1, -4000);
    }

    public final egh d(ees eesVar, int i, int i2) {
        egf egfVar;
        egc egcVar = this.a;
        egcVar.getClass();
        egf egfVar2 = null;
        if (this.g || eesVar == null) {
            egfVar = egfVar2;
        } else {
            eeq eeqVar = this.f;
            if (eeqVar != null) {
                egfVar2 = new egf(((jdy) eeqVar).a);
                egfVar = egfVar2;
            } else {
                ege egeVar = new ege();
                egeVar.a = egcVar;
                egc egcVar2 = egeVar.a;
                egcVar2.getClass();
                egfVar = new egf(egcVar2, null);
            }
        }
        return new egh(egcVar, eesVar, this.b.a(), egfVar, i, this.e, i2);
    }

    public final void e(eeq eeqVar) {
        this.f = eeqVar;
        this.g = eeqVar == null;
    }

    public final void f() {
        this.h = 1;
    }
}
