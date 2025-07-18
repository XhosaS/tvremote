package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnc implements agtc {
    public static final bnb a = new bnb();
    public final agsy b;

    public bnc(agsy agsyVar) {
        this.b = agsyVar;
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    @Override // defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        return agtb.b(this, agtdVar);
    }

    @Override // defpackage.agtc
    public final agtd getKey() {
        return a;
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        return agtb.c(this, agtdVar);
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        agteVar.getClass();
        return agta.a(this, agteVar);
    }
}
