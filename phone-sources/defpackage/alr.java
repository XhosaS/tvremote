package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alr {
    public static final alr a = new alr(null, null);
    public final bvc b;
    public final cgz c;

    public alr(bvc bvcVar, cgz cgzVar) {
        this.b = bvcVar;
        this.c = cgzVar;
    }

    public static /* synthetic */ alr a(alr alrVar, bvc bvcVar, cgz cgzVar, int i) {
        if ((i & 1) != 0) {
            bvcVar = alrVar.b;
        }
        if ((i & 2) != 0) {
            cgzVar = alrVar.c;
        }
        return new alr(bvcVar, cgzVar);
    }
}
