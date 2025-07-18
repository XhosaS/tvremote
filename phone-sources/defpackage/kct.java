package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kct extends iyd {
    private final wly n;

    public kct(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, wly wlyVar) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.n = wlyVar;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        wly wlyVar = this.n;
        int i = wlyVar.b;
        if (i == 1) {
            i(new iht((wom) wlyVar.c, 3));
        } else if (i == 2) {
            String str = (String) wlyVar.c;
            str.getClass();
            j(str);
        }
        return ygi.a;
    }
}
