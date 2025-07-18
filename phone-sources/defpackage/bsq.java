package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bsq {
    public final bfz d = new bfz(new bsp[16], 0);
    public final kc e = new kc(10);

    public boolean c(jn jnVar, bvc bvcVar, ft ftVar, boolean z) {
        bfz bfzVar = this.d;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((bsp) objArr[i2]).c(jnVar, bvcVar, ftVar, z) || z2;
        }
        return z2;
    }

    public final void f() {
        bfz bfzVar = this.d;
        int i = bfzVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (((bsp) bfzVar.a[i]).c.a == 0) {
                bfzVar.d(i);
            }
        }
    }
}
