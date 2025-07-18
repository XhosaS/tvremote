package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igf implements ixf {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/actions/openlink/OpenLinkActionHandler");
    public final yow b;
    public final irc c;
    public final irc d;
    private final yow e;

    public igf(yow yowVar, irc ircVar, irc ircVar2) {
        ircVar.getClass();
        ircVar2.getClass();
        yow yowVarM = yoz.m();
        this.e = yowVar;
        this.c = ircVar;
        this.d = ircVar2;
        this.b = yowVarM;
    }

    @Override // defpackage.ixf
    public final void a(wkg wkgVar, Context context, String str, String str2) {
        vvd vvdVar = wqb.c;
        wkgVar.i(vvdVar);
        Object objK = wkgVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        objK.getClass();
        ykr.q(this.e, null, 0, new th(this, (wqb) objK, context, (yih) null, 17), 3);
    }

    @Override // defpackage.ixf
    public final /* synthetic */ void b() {
    }
}
