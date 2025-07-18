package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plj implements plh {
    private final plh a;
    private final plh b;
    private final yrp c;

    public plj(plh plhVar, plh plhVar2, yrp yrpVar) {
        this.a = plhVar;
        this.b = plhVar2;
        this.c = yrpVar;
    }

    @Override // defpackage.plh
    public final zyd a(plg plgVar) {
        return ((Boolean) this.c.eV()).booleanValue() ? this.b.a(plgVar) : this.a.a(plgVar);
    }
}
