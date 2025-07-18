package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkz extends agtq {
    Object a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ jla e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkz(jla jlaVar, agsw agswVar) {
        super(agswVar);
        this.e = jlaVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, false, this);
    }
}
