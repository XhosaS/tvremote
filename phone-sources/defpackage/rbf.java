package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbf {
    public final int[][] a;
    public final int[] b;

    public rbf(int[][] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbf)) {
            return false;
        }
        rbf rbfVar = (rbf) obj;
        return yks.e(this.a, rbfVar.a) && yks.e(this.b, rbfVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        int[] iArr = this.b;
        return "LayoutConfig(constraints=" + Arrays.toString(this.a) + ", hiddenElements=" + Arrays.toString(iArr) + ")";
    }
}
