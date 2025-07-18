package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmm extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fmn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmm(fmn fmnVar, agsw agswVar) {
        super(agswVar);
        this.b = fmnVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
