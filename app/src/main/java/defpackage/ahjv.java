package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahjv implements agte {
    public final Throwable a;
    private final /* synthetic */ agte b;

    public ahjv(Throwable th, agte agteVar) {
        this.b = agteVar;
        this.a = th;
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return this.b.fold(obj, agvbVar);
    }

    @Override // defpackage.agte
    public final agtc get(agtd agtdVar) {
        return this.b.get(agtdVar);
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        return this.b.minusKey(agtdVar);
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        return this.b.plus(agteVar);
    }
}
