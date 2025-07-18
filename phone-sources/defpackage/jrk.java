package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrk extends iyd {
    public String n;
    private final ino o;

    public jrk(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, ino inoVar) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.o = inoVar;
        this.n = "";
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        j("library");
        return ygi.a;
    }

    @Override // defpackage.iyd
    public final ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        return this.o.y(wodVar, this.n);
    }

    @Override // defpackage.iyd
    public final boolean n() {
        return true;
    }
}
