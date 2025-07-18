package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcf extends agtq {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ gci d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcf(gci gciVar, agsw agswVar) {
        super(agswVar);
        this.d = gciVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
