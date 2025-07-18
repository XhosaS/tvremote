package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahes implements agtc, agtd {
    public static final ahes a = new ahes();

    private ahes() {
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    @Override // defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        return agtb.b(this, agtdVar);
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

    @Override // defpackage.agtc
    public final agtd getKey() {
        return this;
    }
}
