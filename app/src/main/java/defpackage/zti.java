package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zti extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final float[] a;
    final int b;
    final int c;

    public zti(float[] fArr, int i, int i2) {
        this.a = fArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && ztj.a(this.a, ((Float) obj).floatValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zti)) {
            return super.equals(obj);
        }
        zti ztiVar = (zti) obj;
        int i = this.c;
        int i2 = this.b;
        int i3 = ztiVar.c;
        int i4 = ztiVar.b;
        int i5 = i - i2;
        if (i3 - i4 != i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.a[i2 + i6] != ztiVar.a[i4 + i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.c;
        int i3 = this.b;
        yqw.al(i, i2 - i3);
        return Float.valueOf(this.a[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = this.b; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.a[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.b;
        int iA = ztj.a(fArr, fFloatValue, i, this.c);
        if (iA >= 0) {
            return iA - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.a;
            float fFloatValue = ((Float) obj).floatValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (fArr[i2] == fFloatValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.c;
        int i3 = this.b;
        Float f = (Float) obj;
        yqw.al(i, i2 - i3);
        float[] fArr = this.a;
        int i4 = i3 + i;
        float f2 = fArr[i4];
        f.getClass();
        fArr[i4] = f.floatValue();
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.c;
        int i4 = this.b;
        yqw.K(i, i2, i3 - i4);
        return i == i2 ? Collections.EMPTY_LIST : new zti(this.a, i + i4, i4 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.c;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder((i - i2) * 12);
        sb.append('[');
        float[] fArr = this.a;
        sb.append(fArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(fArr[i2]);
        }
    }
}
