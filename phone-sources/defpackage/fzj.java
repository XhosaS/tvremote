package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzj extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ fzk b;
    int c;
    ylf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(fzk fzkVar, yih yihVar) {
        super(yihVar);
        this.b = fzkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
