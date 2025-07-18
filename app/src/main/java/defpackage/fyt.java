package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyt implements afer {
    public static final afid a;
    public final afih b;
    public final String c;

    static {
        afib afibVar = afih.b;
        int i = afid.c;
        a = new afia("Authorization", afibVar);
    }

    public fyt(afih afihVar, String str) {
        this.b = afihVar;
        this.c = str;
    }

    @Override // defpackage.afer
    public final afeq a(afil afilVar, afem afemVar, afen afenVar) {
        afilVar.getClass();
        afemVar.getClass();
        return new fys(this, afenVar.a(afilVar, afemVar));
    }
}
