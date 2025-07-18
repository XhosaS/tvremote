package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tic {
    public final int a;
    final SparseArray b = new SparseArray();
    final List c = new ArrayList();
    final /* synthetic */ SpannedGridLayoutManager d;
    private final int[] e;
    private final RecyclerView.Recycler f;

    public tic(SpannedGridLayoutManager spannedGridLayoutManager, RecyclerView.Recycler recycler, int i) {
        this.d = spannedGridLayoutManager;
        this.e = new int[spannedGridLayoutManager.n.a];
        this.f = recycler;
        this.a = i;
    }

    private final void g(int i, int i2) {
        List list = this.c;
        if (list.size() < i + 1) {
            list.add(Integer.valueOf(i2));
        }
    }

    private final void h() {
        tid tidVar;
        int[] iArr;
        int size = this.c.size();
        SparseArray sparseArray = this.b;
        int size2 = sparseArray.size();
        g(size, size2);
        int i = size2;
        int i2 = 0;
        while (i < this.a) {
            int iConvertPreLayoutPositionToPostLayout = this.f.convertPreLayoutPositionToPostLayout(i);
            if (iConvertPreLayoutPositionToPostLayout == -1) {
                int i3 = 0;
                while (true) {
                    SpannedGridLayoutManager spannedGridLayoutManager = this.d;
                    if (i3 >= spannedGridLayoutManager.getChildCount()) {
                        tidVar = tid.a;
                        break;
                    }
                    View childAt = spannedGridLayoutManager.getChildAt(i3);
                    if (i == spannedGridLayoutManager.getPosition(childAt)) {
                        thz thzVar = (thz) childAt.getLayoutParams();
                        tidVar = new tid(thzVar.a, thzVar.b);
                        break;
                    }
                    i3++;
                }
            } else {
                tidVar = this.d.a.a(iConvertPreLayoutPositionToPostLayout);
            }
            SpannedGridLayoutManager spannedGridLayoutManager2 = this.d;
            int i4 = tidVar.b;
            int i5 = spannedGridLayoutManager2.n.a;
            if (i4 > i5) {
                tidVar.b = i5;
                i4 = i5;
            }
            if (i4 + i2 > i5) {
                size++;
                g(size, size2);
                i2 = 0;
            }
            while (true) {
                iArr = this.e;
                if (iArr[i2] <= size) {
                    break;
                }
                i2++;
                if (tidVar.b + i2 > spannedGridLayoutManager2.n.a) {
                    size++;
                    g(size, size2);
                    i2 = 0;
                }
            }
            int i6 = tidVar.c;
            sparseArray.put(i, new thx(size, i6, i2, tidVar.b));
            int i7 = size + i6;
            for (int i8 = 0; i8 < tidVar.b; i8++) {
                iArr[i2 + i8] = i7;
            }
            if (i6 > 1) {
                for (int i9 = 1; i9 < i6; i9++) {
                    g(size + i9, size2);
                }
            }
            i2 += tidVar.b;
            i++;
            int i10 = iArr[0];
            for (int i11 = 1; i11 < spannedGridLayoutManager2.n.a; i11++) {
                if (i10 != iArr[i11]) {
                    break;
                }
            }
            return;
        }
    }

    private final void i(int i) {
        while (i >= this.c.size()) {
            SparseArray sparseArray = this.b;
            if (sparseArray.size() >= this.a) {
                return;
            } else {
                h();
            }
        }
    }

    public final int a(int i) {
        List list = this.c;
        if (i >= list.size()) {
            i(i);
        }
        if (list.isEmpty()) {
            return 0;
        }
        return ((Integer) list.get(i)).intValue();
    }

    public final int b(int i) {
        return (f(c(i)) ? a(r2) : this.a) - 1;
    }

    final int c(int i) {
        int i2 = i + 1;
        int iA = a(i);
        while (f(i2) && a(i2) == iA) {
            i2++;
        }
        return i2;
    }

    public final int d(int i) {
        if (i < this.a) {
            return e(i).a;
        }
        return -1;
    }

    public final thx e(int i) {
        if (i >= this.a) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "index: %d out of range.", Integer.valueOf(i)));
        }
        SparseArray sparseArray = this.b;
        if (i >= sparseArray.size()) {
            while (i >= sparseArray.size()) {
                h();
            }
        }
        return (thx) sparseArray.get(i);
    }

    final boolean f(int i) {
        List list = this.c;
        if (i >= list.size()) {
            i(i);
        }
        return i >= 0 && i < list.size();
    }
}
