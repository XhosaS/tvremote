package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmm extends agtq {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ jmr c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmm(jmr jmrVar, agsw agswVar) {
        super(agswVar);
        this.c = jmrVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
