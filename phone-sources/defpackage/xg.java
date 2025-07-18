package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xg implements xf {
    private final /* synthetic */ int a;

    public xg(int i) {
        this.a = i;
    }

    @Override // defpackage.xe
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.xe
    public final void b(clx clxVar, int i, int[] iArr, cmi cmiVar, int[] iArr2) {
        if (this.a != 0) {
            if (cmiVar == cmi.a) {
                xk.a(i, iArr, iArr2, false);
                return;
            } else {
                xk.a(i, iArr, iArr2, true);
                return;
            }
        }
        if (cmiVar == cmi.a) {
            xk.d(i, iArr, iArr2, false);
        } else {
            xk.d(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.xj
    public final void c(clx clxVar, int i, int[] iArr, int[] iArr2) {
        if (this.a != 0) {
            xk.a(i, iArr, iArr2, false);
        } else {
            xk.d(i, iArr, iArr2, false);
        }
    }

    public final String toString() {
        return this.a != 0 ? "Arrangement#Center" : "Arrangement#SpaceBetween";
    }
}
