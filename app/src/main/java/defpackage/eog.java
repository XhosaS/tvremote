package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eog {
    public final float a;
    public final int b;

    public eog(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eog) {
            eog eogVar = (eog) obj;
            int i = this.b;
            if (i == eogVar.b) {
                return i == 1 || i == 4 || Float.compare(this.a, eogVar.a) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) + (this.b - 1);
    }

    public final String toString() {
        int i = this.b - 1;
        if (i == 0) {
            return "undefined";
        }
        if (i == 1) {
            return Float.toString(this.a);
        }
        if (i != 2) {
            return "auto";
        }
        return this.a + "%";
    }
}
