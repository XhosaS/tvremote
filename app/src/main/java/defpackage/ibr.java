package defpackage;

/* loaded from: classes.dex */
public final class ibr extends agtq {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ibs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibr(ibs ibsVar, agsw agswVar) {
        super(agswVar);
        this.c = ibsVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
