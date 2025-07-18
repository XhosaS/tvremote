package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vud extends vsj implements RandomAccess, vuj, vvr {
    public static final vud a;
    private static final int[] d;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        a = new vud(iArr, 0, false);
    }

    vud() {
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

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        eA();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i3, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.vsj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        eA();
        Charset charset = vuo.a;
        collection.getClass();
        if (!(collection instanceof vud)) {
            return super.addAll(collection);
        }
        vud vudVar = (vud) collection;
        int i = vudVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(vudVar.b, 0, this.b, this.c, vudVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.vuj
    public final int e(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vud)) {
            return super.equals(obj);
        }
        vud vudVar = (vud) obj;
        if (this.c != vudVar.c) {
            return false;
        }
        int[] iArr = vudVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vun
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final vuj d(int i) {
        if (i >= this.c) {
            return new vud(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.vuj
    public final void g(int i) {
        eA();
        int i2 = this.c;
        int length = this.b.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(e(i));
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
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
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        eA();
        i(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        eA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        eA();
        i(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private vud(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // defpackage.vsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
