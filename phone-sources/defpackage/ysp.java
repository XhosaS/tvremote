package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ysp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ysq b;
    int c;
    ywa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysp(ysq ysqVar, yih yihVar) {
        super(yihVar);
        this.b = ysqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
