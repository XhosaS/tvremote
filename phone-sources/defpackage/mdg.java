package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdg extends yiv {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public int h;
    public String i;
    final /* synthetic */ hfx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdg(hfx hfxVar, yih yihVar) {
        super(yihVar);
        this.j = hfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.h |= Integer.MIN_VALUE;
        return this.j.p(null, null, this);
    }
}
