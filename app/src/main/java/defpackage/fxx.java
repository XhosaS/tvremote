package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxx extends agtq {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fxy c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxx(fxy fxyVar, agsw agswVar) {
        super(agswVar);
        this.c = fxyVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
