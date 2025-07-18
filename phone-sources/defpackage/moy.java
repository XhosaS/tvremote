package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class moy extends sbx {
    public final pkg a;
    public final pjx b;
    public final mem c;
    public final mru d;
    public final irc e;
    private final Context f;
    private final iea g;
    private final int h;
    private final ntp i;

    public moy(ntp ntpVar, Context context, mru mruVar, iea ieaVar, pkg pkgVar, pjx pjxVar, irc ircVar, mem memVar, int i) {
        this.i = ntpVar;
        this.f = context;
        this.d = mruVar;
        this.g = ieaVar;
        this.a = pkgVar;
        this.b = pjxVar;
        this.e = ircVar;
        this.c = memVar;
        this.h = i;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new mov(this.h);
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        iea ieaVar = this.g;
        kwn kwnVar = (kwn) obj;
        mov movVar = (mov) obj2;
        m(ieaVar);
        ksy ksyVar = kwnVar.d;
        int i = 0;
        movVar.F(ksyVar.c, new String[0]);
        sco scoVar = new sco(kwnVar.g);
        if (!yks.e(movVar.d, scoVar)) {
            movVar.d = scoVar;
            movVar.G(1);
        }
        sco scoVar2 = new sco(hjs.g(this.f, "number", Integer.valueOf(((kva) ieaVar.a()).c(ksyVar).a)));
        if (!yks.e(movVar.e, scoVar2)) {
            movVar.e = scoVar2;
            movVar.G(2);
        }
        Uri uri = kwnVar.e;
        if (!yks.e(movVar.c, uri)) {
            movVar.c = uri;
            movVar.G(0);
        }
        movVar.f = new scc("R.id.card", movVar, new juu(this, kwnVar, 8));
        movVar.G(3);
        movVar.a = new mox(movVar, this, kwnVar, i);
        movVar.b = new jfu(this, 9);
    }
}
