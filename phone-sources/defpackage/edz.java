package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edz implements eac {
    public final float a;
    public final float b;

    public edz(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        eci.a(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
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
            edz edzVar = (edz) obj;
            if (this.a == edzVar.a && this.b == edzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) + 527) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
