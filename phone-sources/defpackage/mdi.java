package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdi extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ hfx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdi(hfx hfxVar, yih yihVar) {
        super(yihVar);
        this.c = hfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.n(null, null, 0, this);
    }
}
