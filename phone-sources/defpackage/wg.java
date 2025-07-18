package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wg extends yiv {
    Object a;
    float b;
    /* synthetic */ Object c;
    final /* synthetic */ wh d;
    int e;
    bg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(wh whVar, yih yihVar) {
        super(yihVar);
        this.d = whVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
