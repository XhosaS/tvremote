package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clj {
    public static final clj a = new clj(cli.b, 17, 0);
    public final float b;
    public final int c;
    public final int d;

    public clj(float f, int i, int i2) {
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clj)) {
            return false;
        }
        float f = this.b;
        clj cljVar = (clj) obj;
        float f2 = cljVar.b;
        float f3 = cli.a;
        return Float.compare(f, f2) == 0 && a.r(this.c, cljVar.c) && a.r(this.d, cljVar.d);
    }

    public final int hashCode() {
        float f = cli.a;
        return (((Float.floatToIntBits(this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = cli.a;
        float f2 = this.b;
        if (f2 == 0.0f) {
            str = "LineHeightStyle.Alignment.Top";
        } else if (f2 == cli.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f2 == cli.b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f2 == cli.c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i = this.c;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        sb.append((Object) ("Mode(value=" + this.d + ')'));
        sb.append(')');
        return sb.toString();
    }

    public clj(float f) {
        this(f, 0, 0);
    }
}
