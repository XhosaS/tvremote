package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpb extends dob implements RandomAccess, dpj {
    public int a;
    private float[] b;

    static {
        new dpb(new float[0], 0, false);
    }

    dpb() {
        this(new float[10], 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.a;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i3, this.a - i);
            this.b = fArr2;
        }
        this.b[i] = fFloatValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        byte[] bArr = dpk.b;
        collection.getClass();
        if (!(collection instanceof dpb)) {
            return super.addAll(collection);
        }
        dpb dpbVar = (dpb) collection;
        int i = dpbVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.b;
        if (i3 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(dpbVar.b, 0, this.b, this.a, dpbVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.dpj
    public final /* bridge */ /* synthetic */ dpj d(int i) {
        if (i >= this.a) {
            return new dpb(Arrays.copyOf(this.b, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final float e(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpb)) {
            return super.equals(obj);
        }
        dpb dpbVar = (dpb) obj;
        if (this.a != dpbVar.a) {
            return false;
        }
        float[] fArr = dpbVar.b;
        for (int i = 0; i < this.a; i++) {
            if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f) {
        a();
        int i = this.a;
        float[] fArr = this.b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(e(i));
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.a; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        float[] fArr = this.b;
        float f = fArr[i];
        if (i < this.a - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i2, fArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        h(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private dpb(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.a = i;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
