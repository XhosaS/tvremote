package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpg extends dob implements RandomAccess, dpj {
    public int a;
    private int[] b;

    static {
        new dpg(new int[0], 0, false);
    }

    dpg() {
        this(new int[10], 0, true);
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
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i3, this.a - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        byte[] bArr = dpk.b;
        collection.getClass();
        if (!(collection instanceof dpg)) {
            return super.addAll(collection);
        }
        dpg dpgVar = (dpg) collection;
        int i = dpgVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(dpgVar.b, 0, this.b, this.a, dpgVar.a);
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
            return new dpg(Arrays.copyOf(this.b, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final int e(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpg)) {
            return super.equals(obj);
        }
        dpg dpgVar = (dpg) obj;
        if (this.a != dpgVar.a) {
            return false;
        }
        int[] iArr = dpgVar.b;
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        a();
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(e(i));
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.a - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        h(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private dpg(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.a = i;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
