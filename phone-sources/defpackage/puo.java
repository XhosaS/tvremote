package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class puo extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pur b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puo(pur purVar, yih yihVar) {
        super(yihVar);
        this.b = purVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
