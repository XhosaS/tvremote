package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class imp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ imq b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imp(imq imqVar, yih yihVar) {
        super(yihVar);
        this.b = imqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
