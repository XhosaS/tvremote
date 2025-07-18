package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyz implements oyx {
    public static final tvn a = tvn.n("GnpSdk");
    public final xbw b;
    public final String c;
    public final xbw d;
    public final uhs e;
    public final xbw f;
    private final yfo g;

    public oyz(xbw xbwVar, String str, yfo yfoVar, xbw xbwVar2, uhs uhsVar, xbw xbwVar3) {
        this.b = xbwVar;
        this.c = str;
        this.g = yfoVar;
        this.d = xbwVar2;
        this.e = uhsVar;
        this.f = xbwVar3;
    }

    @Override // defpackage.oyx
    public final uhp a(oyh oyhVar, String str) {
        yfo yfoVar = this.g;
        yfoVar.getClass();
        eet eetVar = new eet(yfoVar, 10);
        uhs uhsVar = this.e;
        uhp uhpVarSubmit = uhsVar.submit(eetVar);
        return ufn.j(ufn.j(uhi.v(uhpVarSubmit), new oyy(this, oyhVar, str, 0), uhsVar), new rwc(this, uhpVarSubmit, oyhVar, str, 1), uhsVar);
    }
}
