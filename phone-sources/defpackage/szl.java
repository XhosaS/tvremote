package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szl extends szg {
    private final szg a;
    private final float b;

    public szl(szg szgVar, float f) {
        this.a = szgVar;
        this.b = f;
    }

    @Override // defpackage.szg
    public final void a(float f, float f2, float f3, taa taaVar) {
        this.a.a(f, f2 - this.b, f3, taaVar);
    }

    @Override // defpackage.szg
    public final boolean c() {
        return true;
    }
}
