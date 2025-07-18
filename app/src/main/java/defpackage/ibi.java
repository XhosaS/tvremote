package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibi extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ icd b;
    int c;
    yme d;
    String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibi(icd icdVar, agsw agswVar) {
        super(agswVar);
        this.b = icdVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH = this.b.h(null, null, null, this);
        return objH == agtg.a ? objH : new agpk(objH);
    }
}
