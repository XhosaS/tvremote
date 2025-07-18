package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eus extends evs {
    public final bdl a;
    final aejl b;
    final aejl c;
    final aejl d;
    private final eup e;
    private final eus f = this;

    public eus(eup eupVar, bdl bdlVar) {
        this.e = eupVar;
        this.a = bdlVar;
        this.b = new eur(eupVar, this, 0);
        this.c = new eur(eupVar, this, 1);
        this.d = new eur(eupVar, this, 2);
    }

    @Override // defpackage.aehw
    public final Map a() {
        return zcl.a;
    }

    @Override // defpackage.aehw
    public final Map b() {
        return new aeji(yyr.m("vgq", this.b, "vrp", this.c, "vze", this.d));
    }
}
