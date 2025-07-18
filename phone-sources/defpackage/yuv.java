package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yuv extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ yuw b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuv(yuw yuwVar, yih yihVar) {
        super(yihVar);
        this.b = yuwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, this);
    }
}
