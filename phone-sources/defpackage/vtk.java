package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtk extends vsj implements RandomAccess, vuf, vvr {
    public static final vtk a;
    private static final double[] d;
    public double[] b;
    public int c;

    static {
        double[] dArr = new double[0];
        d = dArr;
        a = new vtk(dArr, 0, false);
    }

    vtk() {
        this(d, 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        eA();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, dArr2, 0, i);
            System.arraycopy(this.b, i, dArr2, i3, this.c - i);
            this.b = dArr2;
        }
        this.b[i] = dDoubleValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.vsj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        eA();
        Charset charset = vuo.a;
        collection.getClass();
        if (!(collection instanceof vtk)) {
            return super.addAll(collection);
        }
        vtk vtkVar = (vtk) collection;
        int i = vtkVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.b;
        if (i3 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(vtkVar.b, 0, this.b, this.c, vtkVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.vun
    public final /* bridge */ /* synthetic */ vun d(int i) {
        if (i >= this.c) {
            return new vtk(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.vuf
    public final double e(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtk)) {
            return super.equals(obj);
        }
        vtk vtkVar = (vtk) obj;
        if (this.c != vtkVar.c) {
            return false;
        }
        double[] dArr = vtkVar.b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d2) {
        eA();
        int i = this.c;
        int length = this.b.length;
        if (i == length) {
            double[] dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, dArr, 0, this.c);
            this.b = dArr;
        }
        double[] dArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        dArr2[i2] = d2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(e(i));
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iK = 1;
        for (int i = 0; i < this.c; i++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.b[i]);
            Charset charset = vuo.a;
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
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        eA();
        h(i);
        double[] dArr = this.b;
        double d2 = dArr[i];
        if (i < this.c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        eA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        System.arraycopy(dArr, i2, dArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        eA();
        h(i);
        double[] dArr = this.b;
        double d2 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private vtk(double[] dArr, int i, boolean z) {
        super(z);
        this.b = dArr;
        this.c = i;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
