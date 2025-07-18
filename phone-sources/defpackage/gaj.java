package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaj extends yiv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ gak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaj(gak gakVar, yih yihVar) {
        super(yihVar);
        this.c = gakVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
