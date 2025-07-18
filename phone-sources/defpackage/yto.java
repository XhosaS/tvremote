package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yto extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ fzk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yto(fzk fzkVar, yih yihVar) {
        super(yihVar);
        this.d = fzkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
