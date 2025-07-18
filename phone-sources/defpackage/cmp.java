package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmp implements cmn {
    private final float[] a;
    private final float[] b;

    public cmp(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.cmn
    public final float a(float f) {
        return clw.s(f, this.b, this.a);
    }

    @Override // defpackage.cmn
    public final float b(float f) {
        return clw.s(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cmp)) {
            return false;
        }
        cmp cmpVar = (cmp) obj;
        return Arrays.equals(this.a, cmpVar.a) && Arrays.equals(this.b, cmpVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
