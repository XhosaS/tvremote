package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drz {
    public final float a;
    public final List b;

    private drz(float f, List list) {
        this.a = f;
        this.b = list;
    }

    public final drz a(drz drzVar) {
        return new drz(this.a + drzVar.a, yfm.af(this.b, drzVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drz)) {
            return false;
        }
        drz drzVar = (drz) obj;
        return cma.b(this.a, drzVar.a) && yks.e(this.b, drzVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) cma.a(this.a)) + ", resourceIds=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ drz(float f, int i) {
        int i2 = i & 1;
        this(1 == i2 ? 0.0f : f, yhb.a);
    }
}
