package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ica extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ icd b;
    int c;
    ymg d;
    String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ica(icd icdVar, agsw agswVar) {
        super(agswVar);
        this.b = icdVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(null, null, null, this);
        return objJ == agtg.a ? objJ : new agpk(objJ);
    }
}
