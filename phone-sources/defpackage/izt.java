package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class izt extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    /* synthetic */ Object e;
    final /* synthetic */ izu f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izt(izu izuVar, yih yihVar) {
        super(yihVar);
        this.f = izuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
