package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iby extends agtq {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ icd c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iby(icd icdVar, agsw agswVar) {
        super(agswVar);
        this.c = icdVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(null, false, null, this);
    }
}
