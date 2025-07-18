package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utv {
    public static final utv a = new utv(1, null, null, null, null);
    public static final utv b = new utv(5, null, null, null, null);
    public final utu c;
    public final xpy d;
    public final int e;
    public final usr f;
    private final uhp g;

    public utv(int i, utu utuVar, usr usrVar, uhp uhpVar, xpy xpyVar) {
        this.e = i;
        this.c = utuVar;
        this.f = usrVar;
        this.g = uhpVar;
        this.d = xpyVar;
    }

    public static utv b(xtk xtkVar, xsm xsmVar) {
        xtkVar.getClass();
        sij.x(!xtkVar.g(), "Error status must not be ok");
        return new utv(2, null, new usr(xtkVar, xsmVar), null, null);
    }

    public static utv c(uhp uhpVar) {
        uhpVar.getClass();
        return new utv(4, null, null, uhpVar, null);
    }

    public final uhp a() {
        a.ab(this.e == 4);
        return this.g;
    }
}
