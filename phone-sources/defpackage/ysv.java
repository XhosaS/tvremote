package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysv extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ fzk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysv(fzk fzkVar, yih yihVar) {
        super(yihVar);
        this.c = fzkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
