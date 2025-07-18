package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axk extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ dbl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axk(dbl dblVar, yih yihVar) {
        super(yihVar);
        this.c = dblVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
