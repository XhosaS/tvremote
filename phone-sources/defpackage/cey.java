package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cey {
    public static final cey a = new cey(0.0f, new ylz(0.0f, 0.0f));
    public final float b;
    public final ylz c;
    private final int d = 0;

    public cey(float f, ylz ylzVar) {
        this.b = f;
        this.c = ylzVar;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cey)) {
            return false;
        }
        cey ceyVar = (cey) obj;
        if (this.b != ceyVar.b || !yks.e(this.c, ceyVar.c)) {
            return false;
        }
        int i = ceyVar.d;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}
