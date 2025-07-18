package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixw extends iyd {
    private final wly n;
    private final boolean o;

    public ixw(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, wly wlyVar) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.n = wlyVar;
        this.o = wlyVar.b == 2;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        wod wodVar = wod.a;
        wodVar.getClass();
        Object objA = b("", wodVar, false).a(new ait(this, 15), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.iyd
    public final ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        if (str != null && str.length() != 0) {
            return super.b(str, wodVar, z);
        }
        wly wlyVar = this.n;
        int i = wlyVar.b;
        return i == 1 ? new isv(new iht((wom) wlyVar.c, 3), 6) : i == 2 ? super.b((String) wlyVar.c, wodVar, z) : new isv(new ihz[0], 5);
    }

    @Override // defpackage.iyd
    public final boolean d() {
        return this.o;
    }
}
