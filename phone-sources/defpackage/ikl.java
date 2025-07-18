package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ikl extends yiv {
    /* synthetic */ Object a;
    int b;
    String c;
    ikp d;
    final /* synthetic */ ikp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikl(ikm ikmVar, yih yihVar) {
        super(yihVar);
        this.e = (ikp) ikmVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return ikm.e(this.e, null, this);
    }
}
