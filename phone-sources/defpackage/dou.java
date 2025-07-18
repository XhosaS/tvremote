package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dou extends dob implements RandomAccess, dpj {
    public int a;
    private double[] b;

    static {
        new dou(new double[0], 0, false);
    }

    dou() {
        this(new double[10], 0, true);
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
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        double[] dArr = this.b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.b, i, dArr2, i3, this.a - i);
            this.b = dArr2;
        }
        this.b[i] = dDoubleValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        byte[] bArr = dpk.b;
        collection.getClass();
        if (!(collection instanceof dou)) {
            return super.addAll(collection);
        }
        dou douVar = (dou) collection;
        int i = douVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.b;
        if (i3 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(douVar.b, 0, this.b, this.a, douVar.a);
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
            return new dou(Arrays.copyOf(this.b, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final double e(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dou)) {
            return super.equals(obj);
        }
        dou douVar = (dou) obj;
        if (this.a != douVar.a) {
            return false;
        }
        double[] dArr = douVar.b;
        for (int i = 0; i < this.a; i++) {
            if (Double.doubleToLongBits(this.b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d) {
        a();
        int i = this.a;
        double[] dArr = this.b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.b = dArr2;
        }
        double[] dArr3 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(e(i));
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iK = 1;
        for (int i = 0; i < this.a; i++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.b[i]);
            byte[] bArr = dpk.b;
            iK = (iK * 31) + a.k(jDoubleToLongBits);
        }
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        double[] dArr = this.b;
        double d = dArr[i];
        if (i < this.a - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        System.arraycopy(dArr, i2, dArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        h(i);
        double[] dArr = this.b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private dou(double[] dArr, int i, boolean z) {
        super(z);
        this.b = dArr;
        this.a = i;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
