package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klr extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public wxd c;
    final /* synthetic */ mdw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klr(mdw mdwVar, yih yihVar) {
        super(yihVar);
        this.d = mdwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.g(false, this);
    }
}
