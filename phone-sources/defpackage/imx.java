package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imx implements utj {
    private static final xsj b;
    public final ihq a;
    private final iea c;
    private final yow d;
    private final irc e;

    static {
        wkz wkzVar = wkz.a;
        vtp vtpVar = yer.a;
        yeq yeqVar = new yeq(wkzVar);
        int i = xsj.c;
        b = new xsf("x-goog-ext-373427421-bin", yeqVar);
    }

    public imx(ihq ihqVar, irc ircVar, iea ieaVar, yow yowVar) {
        ihqVar.getClass();
        ircVar.getClass();
        this.a = ihqVar;
        this.e = ircVar;
        this.c = ieaVar;
        this.d = yowVar;
    }

    public final ieg a() {
        ieg iegVarA = ((ldy) this.c).a();
        iegVarA.getClass();
        return iegVarA;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    @Override // defpackage.utj
    public final void e(upq upqVar) {
        wkz wkzVar = (wkz) ((xsm) upqVar.b).c(b);
        Objects.toString(wkzVar);
        krd.b("Side channel contained consistency info ".concat(String.valueOf(wkzVar)));
        if (!a().m() || wkzVar == null) {
            return;
        }
        woo wooVar = wkzVar.b;
        if (wooVar == null) {
            wooVar = woo.a;
        }
        vun vunVar = wooVar.b;
        vunVar.getClass();
        if (!vunVar.isEmpty()) {
            ykr.q(this.d, null, 0, new imw(this, wkzVar, (yih) null, 0), 3);
        }
        woo wooVar2 = wkzVar.b;
        if (wooVar2 == null) {
            wooVar2 = woo.a;
        }
        vun vunVar2 = wooVar2.c;
        vunVar2.getClass();
        if (vunVar2.isEmpty()) {
            return;
        }
        irc ircVar = this.e;
        woo wooVar3 = wkzVar.b;
        if (wooVar3 == null) {
            wooVar3 = woo.a;
        }
        vun vunVar3 = wooVar3.c;
        vunVar3.getClass();
        ircVar.c(vunVar3);
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv g(vvd vvdVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv h(vvd vvdVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ void d(upo upoVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void i(upo upoVar) {
    }
}
