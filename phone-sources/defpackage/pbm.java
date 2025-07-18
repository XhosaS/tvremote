package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pbm extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pbq b;
    int c;
    upo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbm(pbq pbqVar, yih yihVar) {
        super(yihVar);
        this.b = pbqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
