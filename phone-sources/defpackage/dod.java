package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dod extends dob implements RandomAccess, dpj {
    public int a;
    private boolean[] b;

    static {
        new dod(new boolean[0], 0, false);
    }

    dod() {
        this(new boolean[10], 0, true);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.b, i, zArr2, i3, this.a - i);
            this.b = zArr2;
        }
        this.b[i] = zBooleanValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        byte[] bArr = dpk.b;
        collection.getClass();
        if (!(collection instanceof dod)) {
            return super.addAll(collection);
        }
        dod dodVar = (dod) collection;
        int i = dodVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.b;
        if (i3 > zArr.length) {
            this.b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(dodVar.b, 0, this.b, this.a, dodVar.a);
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
            return new dod(Arrays.copyOf(this.b, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(boolean z) {
        a();
        int i = this.a;
        boolean[] zArr = this.b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.b = zArr2;
        }
        boolean[] zArr3 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dod)) {
            return super.equals(obj);
        }
        dod dodVar = (dod) obj;
        if (this.a != dodVar.a) {
            return false;
        }
        boolean[] zArr = dodVar.b;
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(int i) {
        h(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(f(i));
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iQ = 1;
        for (int i = 0; i < this.a; i++) {
            boolean z = this.b[i];
            byte[] bArr = dpk.b;
            iQ = (iQ * 31) + a.q(z);
        }
        return iQ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        if (i < this.a - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i2, zArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        h(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private dod(boolean[] zArr, int i, boolean z) {
        super(z);
        this.b = zArr;
        this.a = i;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
