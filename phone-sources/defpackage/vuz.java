package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuz extends vsj implements RandomAccess, vum, vvr {
    public static final vuz a;
    private static final long[] d;
    public long[] b;
    public int c;

    static {
        long[] jArr = new long[0];
        d = jArr;
        a = new vuz(jArr, 0, false);
    }

    vuz() {
        this(d, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.vum
    public final long a(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        eA();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i3, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = jLongValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.vsj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        eA();
        Charset charset = vuo.a;
        collection.getClass();
        if (!(collection instanceof vuz)) {
            return super.addAll(collection);
        }
        vuz vuzVar = (vuz) collection;
        int i = vuzVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(vuzVar.b, 0, this.b, this.c, vuzVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.vum
    public final long e(int i, long j) {
        eA();
        i(i);
        long[] jArr = this.b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuz)) {
            return super.equals(obj);
        }
        vuz vuzVar = (vuz) obj;
        if (this.c != vuzVar.c) {
            return false;
        }
        long[] jArr = vuzVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vun
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final vum d(int i) {
        if (i >= this.c) {
            return new vuz(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.vum
    public final void g(long j) {
        eA();
        int i = this.c;
        int length = this.b.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, jArr, 0, this.c);
            this.b = jArr;
        }
        long[] jArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(a(i));
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iK = 1;
        for (int i = 0; i < this.c; i++) {
            long j = this.b[i];
            Charset charset = vuo.a;
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
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        eA();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        eA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Long.valueOf(e(i, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private vuz(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
