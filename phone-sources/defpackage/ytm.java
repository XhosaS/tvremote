package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ytm extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ytn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytm(ytn ytnVar, yih yihVar) {
        super(yihVar);
        this.b = ytnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
