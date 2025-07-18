package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkg implements bkc {
    private final float a;

    public bkg(float f) {
        this.a = f;
    }

    @Override // defpackage.bkc
    public final int a(int i, int i2, cmi cmiVar) {
        return Math.round(((i2 - i) / 2.0f) * ((cmiVar == cmi.a ? this.a : -this.a) + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkg) && Float.compare(this.a, ((bkg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
