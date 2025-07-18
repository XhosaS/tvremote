package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqd extends iyd {
    private final ino n;
    private final wod o;
    private final String p;

    public jqd(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, ino inoVar, wod wodVar, String str) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.n = inoVar;
        this.o = wodVar;
        this.p = str;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        j("library");
        return ygi.a;
    }

    @Override // defpackage.iyd
    public final ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        return this.n.x(this.o, this.p);
    }

    @Override // defpackage.iyd
    public final boolean n() {
        return true;
    }
}
