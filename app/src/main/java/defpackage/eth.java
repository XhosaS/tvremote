package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eth extends evn {
    public final bq a;
    public final eup b;
    public final etb c;
    final aejl d;
    public final aejl e;
    public final aejl f;
    public final aejl g;
    public final aejl h;
    public final aejl i;
    public final aejl j;
    public final aejl k;
    private final eth l = this;

    public eth(eup eupVar, etb etbVar, bq bqVar) {
        this.b = eupVar;
        this.c = etbVar;
        this.a = bqVar;
        this.d = new etg(eupVar, this, 0);
        this.e = aejf.c(new etg(eupVar, this, 1));
        this.f = new etg(eupVar, this, 2);
        this.g = new etg(eupVar, this, 3);
        this.h = new etg(eupVar, this, 4);
        this.i = new etg(eupVar, this, 5);
        this.j = new etg(eupVar, this, 6);
        this.k = aejf.c(new etg(eupVar, this, 7));
    }

    public final hmi a() {
        eup eupVar = this.b;
        return new hmi(eupVar.pm, eupVar.bj(), (zyg) eupVar.w.a(), (zyh) eupVar.aR.a());
    }

    public final hmj b() {
        eup eupVar = this.b;
        return new hmj(eupVar.pn, eupVar.bj(), eupVar.po);
    }

    public final tkl c() {
        eup eupVar = this.b;
        return new tkl(eupVar.aR, eupVar.pg, eupVar.ph, eupVar.pi, eupVar.pj, this.d, eupVar.pk, eupVar.cf);
    }

    @Override // defpackage.aehq
    public final aehr d() {
        return this.c.m();
    }
}
