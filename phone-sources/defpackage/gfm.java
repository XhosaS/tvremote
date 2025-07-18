package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfm extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ gfn b;
    int c;
    int[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfm(gfn gfnVar, yih yihVar) {
        super(yihVar);
        this.b = gfnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
