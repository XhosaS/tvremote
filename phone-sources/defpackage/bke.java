package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bke implements bkc {
    public final float a;

    public bke(float f) {
        this.a = f;
    }

    @Override // defpackage.bkc
    public final int a(int i, int i2, cmi cmiVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bke) && Float.compare(this.a, ((bke) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
