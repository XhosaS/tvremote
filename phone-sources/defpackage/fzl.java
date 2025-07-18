package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzl extends yiv {
    /* synthetic */ Object a;
    int b;
    ylf c;
    final /* synthetic */ fzk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzl(fzk fzkVar, yih yihVar) {
        super(yihVar);
        this.d = fzkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
