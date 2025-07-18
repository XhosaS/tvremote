package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpr extends dob implements RandomAccess, dpj {
    public int a;
    private long[] b;

    static {
        new dpr(new long[0], 0, false);
    }

    dpr() {
        this(new long[10], 0, true);
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
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i3, this.a - i);
            this.b = jArr2;
        }
        this.b[i] = jLongValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        byte[] bArr = dpk.b;
        collection.getClass();
        if (!(collection instanceof dpr)) {
            return super.addAll(collection);
        }
        dpr dprVar = (dpr) collection;
        int i = dprVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(dprVar.b, 0, this.b, this.a, dprVar.a);
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
            return new dpr(Arrays.copyOf(this.b, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final long e(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpr)) {
            return super.equals(obj);
        }
        dpr dprVar = (dpr) obj;
        if (this.a != dprVar.a) {
            return false;
        }
        long[] jArr = dprVar.b;
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j) {
        a();
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(e(i));
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iK = 1;
        for (int i = 0; i < this.a; i++) {
            long j = this.b[i];
            byte[] bArr = dpk.b;
            iK = (iK * 31) + a.k(j);
        }
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.a - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        h(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private dpr(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.a = i;
    }

    @Override // defpackage.dob, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
