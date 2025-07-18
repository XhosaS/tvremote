package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xc implements xe {
    private final /* synthetic */ int a;

    public xc(int i) {
        this.a = i;
    }

    @Override // defpackage.xe
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.xe
    public final void b(clx clxVar, int i, int[] iArr, cmi cmiVar, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            xk.c(i, iArr, iArr2, false);
            return;
        }
        if (i2 == 1) {
            xk.b(iArr, iArr2, false);
            return;
        }
        if (i2 != 2) {
            if (cmiVar == cmi.a) {
                xk.b(iArr, iArr2, false);
                return;
            } else {
                xk.c(i, iArr, iArr2, true);
                return;
            }
        }
        if (cmiVar == cmi.a) {
            xk.c(i, iArr, iArr2, false);
        } else {
            xk.b(iArr, iArr2, true);
        }
    }

    public final String toString() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "Arrangement#Start" : "Arrangement#End" : "AbsoluteArrangement#Left" : "AbsoluteArrangement#Right";
    }
}
