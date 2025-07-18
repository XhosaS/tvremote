package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pbp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pbq b;
    int c;
    ulp d;
    ulp e;
    ulp f;
    ulp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp(pbq pbqVar, yih yihVar) {
        super(yihVar);
        this.b = pbqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, null, null, this);
    }
}
