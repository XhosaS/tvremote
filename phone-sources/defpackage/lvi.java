package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvi {
    public final int a;
    public final int b;
    public final int c;

    public lvi() {
        throw null;
    }

    public static rek b() {
        rek rekVar = new rek();
        rekVar.g(0);
        return rekVar;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lvi) {
            lvi lviVar = (lvi) obj;
            if (this.a == lviVar.a && this.b == lviVar.b && this.c == lviVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "StreamsDuration{totalDurationMillis=" + this.a + ", startTimeMillis=" + this.b + ", endTimeMillis=" + this.c + "}";
    }

    public lvi(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
