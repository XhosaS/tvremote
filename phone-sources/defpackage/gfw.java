package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfw extends yiv {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ gfx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(gfx gfxVar, yih yihVar) {
        super(yihVar);
        this.d = gfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
