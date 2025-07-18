package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgs implements eac {
    public final float a;
    public final int b;

    public fgs(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgs fgsVar = (fgs) obj;
            if (this.a == fgsVar.a && this.b == fgsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
