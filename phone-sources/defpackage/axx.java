package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axx extends yiv {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ fzk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axx(fzk fzkVar, yih yihVar) {
        super(yihVar);
        this.e = fzkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
