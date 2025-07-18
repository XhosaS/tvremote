package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wei extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ wek b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wei(wek wekVar, yih yihVar) {
        super(yihVar);
        this.b = wekVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, null, this);
    }
}
