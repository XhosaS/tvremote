package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwa extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ aafi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwa(aafi aafiVar, yih yihVar) {
        super(yihVar);
        this.c = aafiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.B(null, this);
    }
}
