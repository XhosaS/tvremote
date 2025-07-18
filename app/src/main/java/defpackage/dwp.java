package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwp extends dzu {
    public int[] a;
    public dtm b;
    public boolean[] c;

    public dwp(eoe eoeVar) {
        super(eoeVar);
    }

    private final void D(int i, boolean z) {
        if (this.c == null && z) {
            this.c = new boolean[9];
        }
        boolean[] zArr = this.c;
        if (zArr != null) {
            zArr[i - 1] = z;
        }
    }

    private final void E(int i, float f) {
        if (this.b == null) {
            this.b = new dtm();
        }
        this.b.e(i, f);
    }

    @Override // defpackage.dzu
    public final void a(int i, float f) {
        if (this.a == null) {
            this.a = new int[4];
        }
        dre.c(this.a, i, (int) f);
    }

    @Override // defpackage.dzu, defpackage.dva
    public final void y(int i, float f) {
        E(i, f);
        D(i, true);
    }

    @Override // defpackage.dzu, defpackage.dva
    public final void z(int i, int i2) {
        E(i, i2);
        D(i, false);
    }
}
