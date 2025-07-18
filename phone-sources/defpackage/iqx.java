package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqx extends yiv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ irc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqx(irc ircVar, yih yihVar) {
        super(yihVar);
        this.c = ircVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.i(null, this);
    }
}
