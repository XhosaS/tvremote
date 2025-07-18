package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mza {
    public final int a;
    public final int b;
    public final String c;

    public mza(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mza)) {
            return false;
        }
        mza mzaVar = (mza) obj;
        return this.a == mzaVar.a && this.b == mzaVar.b && yks.e(this.c, mzaVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TomatometerModel(numericalRating=" + this.a + ", ratingDrawable=" + this.b + ", sourceUrl=" + this.c + ")";
    }
}
