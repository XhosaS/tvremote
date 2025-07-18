package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ims extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ hfx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ims(hfx hfxVar, yih yihVar) {
        super(yihVar);
        this.d = hfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
