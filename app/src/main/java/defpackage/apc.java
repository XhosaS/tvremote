package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apc extends agtq {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ apd c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apc(apd apdVar, agsw agswVar) {
        super(agswVar);
        this.c = apdVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
