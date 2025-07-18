package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eai {
    public static final eai a = new eai(1.0f, 1.0f);
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public final float d;
    public final float e;
    public final int f;

    public eai(float f, float f2) {
        a.H(f > 0.0f);
        a.H(f2 > 0.0f);
        this.d = f;
        this.e = f2;
        this.f = Math.round(f * 1000.0f);
    }

    public final eai a(float f) {
        return new eai(f, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eai eaiVar = (eai) obj;
            if (this.d == eaiVar.d && this.e == eaiVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.d) + 527) * 31) + Float.floatToRawIntBits(this.e);
    }

    public final String toString() {
        return edt.R("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.d), Float.valueOf(this.e));
    }
}
