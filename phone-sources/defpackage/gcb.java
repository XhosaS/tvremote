package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcb {
    public static final gcb a = new gcb(0, yhb.a);
    public final int[] b;
    public final List c;
    public final int d;

    public gcb(int i, List list) {
        this.b = new int[]{i};
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gcb gcbVar = (gcb) obj;
        return Arrays.equals(this.b, gcbVar.b) && yks.e(this.c, gcbVar.c) && this.d == gcbVar.d && yks.e(null, null);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.b) + ", data=" + this.c + ", hintOriginalPageOffset=" + this.d + ", hintOriginalIndices=null)";
    }
}
