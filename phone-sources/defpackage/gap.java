package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gap extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ gaq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gap(gaq gaqVar, yih yihVar) {
        super(yihVar);
        this.b = gaqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
