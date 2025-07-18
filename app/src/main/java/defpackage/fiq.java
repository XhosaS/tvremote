package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fiq extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fiu b;
    int c;
    agwe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiq(fiu fiuVar, agsw agswVar) {
        super(agswVar);
        this.b = fiuVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(null, this);
    }
}
