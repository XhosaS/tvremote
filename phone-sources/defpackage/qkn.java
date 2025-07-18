package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkn extends yiv {
    Object a;
    Object b;
    Object c;
    boolean d;
    /* synthetic */ Object e;
    final /* synthetic */ qku f;
    int g;
    vmd h;
    qel i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkn(qku qkuVar, yih yihVar) {
        super(yihVar);
        this.f = qkuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.k(null, null, false, null, this);
    }
}
