package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbb extends agtq {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ jbc c;
    int d;
    String e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbb(jbc jbcVar, agsw agswVar) {
        super(agswVar);
        this.c = jbcVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
