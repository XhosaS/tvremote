package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adz extends yiv {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ aea d;
    int e;
    bmy f;
    Object[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adz(aea aeaVar, yih yihVar) {
        super(yihVar);
        this.d = aeaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
