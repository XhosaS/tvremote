package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwt extends abuw implements RandomAccess, abxi, abyz {
    public static final float[] a;
    public static final abwt b;
    public float[] c;
    public int d;

    static {
        float[] fArr = new float[0];
        a = fArr;
        b = new abwt(fArr, 0, false);
    }

    abwt() {
        this(a, 0, true);
    }

    public static int e(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String i(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        fd();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i3 = i + 1;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[e(length)];
            System.arraycopy(this.c, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i3, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = fFloatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.abuw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        fd();
        Charset charset = abxt.a;
        collection.getClass();
        if (!(collection instanceof abwt)) {
            return super.addAll(collection);
        }
        abwt abwtVar = (abwt) collection;
        int i = abwtVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.c;
        if (i3 > fArr.length) {
            this.c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(abwtVar.c, 0, this.c, this.d, abwtVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abwt)) {
            return super.equals(obj);
        }
        abwt abwtVar = (abwt) obj;
        if (this.d != abwtVar.d) {
            return false;
        }
        float[] fArr = abwtVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.abxs
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final abxi d(int i) {
        if (i >= this.d) {
            return new abwt(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.abxi
    public final void g(float f) {
        fd();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            float[] fArr = new float[e(length)];
            System.arraycopy(this.c, 0, fArr, 0, this.d);
            this.c = fArr;
        }
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Float.valueOf(this.c[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        fd();
        h(i);
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        fd();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c;
        System.arraycopy(fArr, i2, fArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        fd();
        h(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public abwt(float[] fArr, int i, boolean z) {
        super(z);
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.abuw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
