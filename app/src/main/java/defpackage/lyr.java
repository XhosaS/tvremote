package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyr extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ lys b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyr(lys lysVar, agsw agswVar) {
        super(agswVar);
        this.b = lysVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
