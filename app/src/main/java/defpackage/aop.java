package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aop extends agtq {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ aor e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aop(aor aorVar, agsw agswVar) {
        super(agswVar);
        this.e = aorVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
