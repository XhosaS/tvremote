package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxw extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fxy b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxw(fxy fxyVar, agsw agswVar) {
        super(agswVar);
        this.b = fxyVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
