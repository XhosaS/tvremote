package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkl {
    private final int a;
    private final pjs[] b;
    private final pjt[] c;

    public pkl(int i, pjs[] pjsVarArr, pjt[] pjtVarArr) {
        this.a = i;
        this.b = pjsVarArr;
        this.c = pjtVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkl)) {
            return false;
        }
        pkl pklVar = (pkl) obj;
        return this.a == pklVar.a && Arrays.equals(this.b, pklVar.b) && Arrays.equals(this.c, pklVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}
