package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wxw extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ wyn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxw(wyn wynVar, yih yihVar) {
        super(yihVar);
        this.b = wynVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(null, null, this);
    }
}
