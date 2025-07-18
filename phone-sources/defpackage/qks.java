package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qks extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ qku e;
    int f;
    String g;
    qel h;
    vmd i;
    String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qks(qku qkuVar, yih yihVar) {
        super(yihVar);
        this.e = qkuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, null, null, null, null, null, null, null, this);
    }
}
