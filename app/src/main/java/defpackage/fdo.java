package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdo extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fdp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdo(fdp fdpVar, agsw agswVar) {
        super(agswVar);
        this.b = fdpVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
