package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ead {
    public final eac[] a;
    public final long b;

    public ead(long j, eac... eacVarArr) {
        this.b = j;
        this.a = eacVarArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final eac b(int i) {
        return this.a[i];
    }

    public final ead c(eac... eacVarArr) {
        int length = eacVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.b;
        eac[] eacVarArr2 = this.a;
        String str = edt.a;
        int length2 = eacVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(eacVarArr2, length2 + length);
        System.arraycopy(eacVarArr, 0, objArrCopyOf, length2, length);
        return new ead(j, (eac[]) objArrCopyOf);
    }

    public final ead d(ead eadVar) {
        return eadVar == null ? this : c(eadVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ead eadVar = (ead) obj;
            if (Arrays.equals(this.a, eadVar.a) && this.b == eadVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + a.k(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "entries=" + Arrays.toString(this.a) + (j == -9223372036854775807L ? "" : a.cs(j, ", presentationTimeUs="));
    }

    public ead(List list) {
        this((eac[]) list.toArray(new eac[0]));
    }

    public ead(eac... eacVarArr) {
        this(-9223372036854775807L, eacVarArr);
    }
}
