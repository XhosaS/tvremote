package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fme extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fmg b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fme(fmg fmgVar, agsw agswVar) {
        super(agswVar);
        this.b = fmgVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
