package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gby extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ cb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gby(cb cbVar, yih yihVar) {
        super(yihVar);
        this.c = cbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.t(null, this);
    }
}
