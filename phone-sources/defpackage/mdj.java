package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdj extends yiv {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    public String e;
    final /* synthetic */ hfx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdj(hfx hfxVar, yih yihVar) {
        super(yihVar);
        this.f = hfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.l(null, null, null, this);
    }
}
