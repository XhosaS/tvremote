package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkl extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ qku e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkl(qku qkuVar, yih yihVar) {
        super(yihVar);
        this.e = qkuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, this);
    }
}
