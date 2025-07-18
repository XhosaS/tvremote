package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agsq implements agtc {
    private final agtd key;

    public agsq(agtd agtdVar) {
        agtdVar.getClass();
        this.key = agtdVar;
    }

    @Override // defpackage.agte
    public Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    @Override // defpackage.agtc, defpackage.agte
    public agtc get(agtd agtdVar) {
        return agtb.b(this, agtdVar);
    }

    @Override // defpackage.agtc
    public agtd getKey() {
        return this.key;
    }

    @Override // defpackage.agte
    public agte minusKey(agtd agtdVar) {
        return agtb.c(this, agtdVar);
    }

    @Override // defpackage.agte
    public agte plus(agte agteVar) {
        agteVar.getClass();
        return agta.a(this, agteVar);
    }
}
