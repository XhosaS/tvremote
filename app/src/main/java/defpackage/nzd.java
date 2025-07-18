package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzd extends ofs {
    public final float a;
    public final float b;

    public nzd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ofs
    public final float a() {
        return this.a;
    }

    @Override // defpackage.ofs
    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofs) {
            ofs ofsVar = (ofs) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ofsVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ofsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "TouchLocation{x=" + this.a + ", y=" + this.b + "}";
    }
}
