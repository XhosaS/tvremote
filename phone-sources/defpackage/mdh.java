package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdh extends yiv {
    public int a;
    public /* synthetic */ Object b;
    public int c;
    public String d;
    public String e;
    final /* synthetic */ hfx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdh(hfx hfxVar, yih yihVar) {
        super(yihVar);
        this.f = hfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f.m(null, null, 0, this);
    }
}
