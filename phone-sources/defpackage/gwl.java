package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwl extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public gzu c;
    public gwi d;
    public gzm e;
    final /* synthetic */ riv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwl(riv rivVar, yih yihVar) {
        super(yihVar);
        this.f = rivVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.c(null, 0, this);
    }
}
