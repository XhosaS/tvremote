package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anb extends agtq {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ano d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anb(ano anoVar, agsw agswVar) {
        super(agswVar);
        this.d = anoVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(false, this);
    }
}
