package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbw extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    public yyk d;
    final /* synthetic */ ivx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbw(ivx ivxVar, yih yihVar) {
        super(yihVar);
        this.e = ivxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
