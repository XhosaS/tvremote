package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xh implements xf {
    public final float a;
    private final float b;
    private final boolean c;
    private final yjz d;

    public xh(float f, boolean z, yjz yjzVar) {
        this.b = f;
        this.c = z;
        this.d = yjzVar;
        this.a = f;
    }

    @Override // defpackage.xe
    public final float a() {
        return this.a;
    }

    @Override // defpackage.xe
    public final void b(clx clxVar, int i, int[] iArr, cmi cmiVar, int[] iArr2) {
        int i2;
        int i3;
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int iCu = clxVar.cu(this.b);
        if (this.c && cmiVar == cmi.b) {
            int i4 = length - 1;
            i2 = 0;
            i3 = 0;
            while (i4 >= 0) {
                int i5 = iArr[i4];
                int iMin = Math.min(i2, i - i5);
                iArr2[i4] = iMin;
                int iMin2 = Math.min(iCu, (i - iMin) - i5);
                int i6 = iArr2[i4] + i5 + iMin2;
                i4--;
                i3 = iMin2;
                i2 = i6;
            }
        } else {
            i2 = 0;
            i3 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                int i9 = iArr[i7];
                int iMin3 = Math.min(i2, i - i9);
                iArr2[i8] = iMin3;
                int iMin4 = Math.min(iCu, (i - iMin3) - i9);
                int i10 = iArr2[i8] + i9 + iMin4;
                i7++;
                i3 = iMin4;
                i2 = i10;
                i8++;
            }
        }
        int i11 = i2 - i3;
        if (i11 < i) {
            int iIntValue = ((Number) this.d.a(Integer.valueOf(i - i11), cmiVar)).intValue();
            int length2 = iArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                iArr2[i12] = iArr2[i12] + iIntValue;
            }
        }
    }

    @Override // defpackage.xj
    public final void c(clx clxVar, int i, int[] iArr, int[] iArr2) {
        b(clxVar, i, iArr, cmi.a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj;
        return cma.b(this.b, xhVar.b) && this.c == xhVar.c && yks.e(this.d, xhVar.d);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.b) * 31) + a.q(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.c ? "Absolute" : "");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) cma.a(this.b));
        sb.append(", ");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
