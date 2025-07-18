package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class piq implements pio {
    public static final tvn a = tvn.n("GnpSdk");
    public final xbw b;
    public final String c;
    public final xbw d;
    private final uhs e;
    private final yfo f;

    public piq(uhs uhsVar, yfo yfoVar, xbw xbwVar, String str, xbw xbwVar2) {
        this.e = uhsVar;
        this.f = yfoVar;
        this.b = xbwVar;
        this.c = str;
        this.d = xbwVar2;
    }

    @Override // defpackage.pio
    public final void a() {
        yfo yfoVar = this.f;
        yfoVar.getClass();
        eet eetVar = new eet(yfoVar, 16);
        uhs uhsVar = this.e;
        osk.Z(ufn.j(uhsVar.submit(eetVar), new pbb(this, 4), uhsVar), new oyn(this, 4), new oyn(this, 5));
    }
}
