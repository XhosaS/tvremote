package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnd extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qnf c;
    int d;
    String e;
    URL f;
    vjs g;
    vjt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnd(qnf qnfVar, yih yihVar) {
        super(yihVar);
        this.c = qnfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, null, null, null, this);
    }
}
