package defpackage;

/* loaded from: classes.dex */
public final class ibv extends agtq {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ibw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibv(ibw ibwVar, agsw agswVar) {
        super(agswVar);
        this.c = ibwVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
