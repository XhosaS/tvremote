package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qv {
    private static final List s = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int j;
    RecyclerView q;
    pq r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    int g = -1;
    public qv h = null;
    public qv i = null;
    List k = null;
    List l = null;
    private int t = 0;
    ql m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public qv(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final int b() {
        RecyclerView recyclerView;
        pq adapter;
        int iCE;
        if (this.r == null || (recyclerView = this.q) == null || (adapter = recyclerView.getAdapter()) == null || (iCE = this.q.cE(this)) == -1 || this.r != adapter) {
            return -1;
        }
        return iCE;
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final int cs() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.cE(this);
    }

    public final List d() {
        List list;
        return ((this.j & 1024) != 0 || (list = this.k) == null || list.size() == 0) ? s : this.l;
    }

    public final void e(Object obj) {
        if (obj == null) {
            this.j |= 1024;
            return;
        }
        if ((this.j & 1024) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = DesugarCollections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void f() {
        this.d = -1;
        this.g = -1;
    }

    final void g() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    public final void j(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((qe) view.getLayoutParams()).e = true;
        }
    }

    final void k() {
        int i = RecyclerView.ac;
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        g();
        this.o = 0;
        this.p = -1;
        RecyclerView.B(this);
    }

    public final void l(int i, int i2) {
        this.j = (i & i2) | (this.j & (~i2));
    }

    public final void m(boolean z) {
        int i;
        int i2 = z ? this.t - 1 : this.t + 1;
        this.t = i2;
        if (i2 < 0) {
            this.t = 0;
            int i3 = RecyclerView.ac;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else {
            if (!z && i2 == 1) {
                i = this.j | 16;
            } else if (z && i2 == 0) {
                i = this.j & (-17);
            }
            this.j = i;
        }
        int i4 = RecyclerView.ac;
    }

    public final boolean n(int i) {
        return (i & this.j) != 0;
    }

    final boolean o() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.q) ? false : true;
    }

    public final boolean p() {
        return (this.j & 1) != 0;
    }

    public final boolean q() {
        return (this.j & 4) != 0;
    }

    public final boolean r() {
        if ((this.j & 16) != 0) {
            return false;
        }
        View view = this.a;
        int[] iArr = ahj.a;
        return !view.hasTransientState();
    }

    public final boolean s() {
        return (this.j & 8) != 0;
    }

    final boolean t() {
        return this.m != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (t()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (q()) {
            sb.append(" invalid");
        }
        if (!p()) {
            sb.append(" unbound");
        }
        if (w()) {
            sb.append(" update");
        }
        if (s()) {
            sb.append(" removed");
        }
        if (x()) {
            sb.append(" ignored");
        }
        if (u()) {
            sb.append(" tmpDetached");
        }
        if (!r()) {
            sb.append(" not recyclable(" + this.t + ")");
        }
        if ((this.j & 512) != 0 || q()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & 256) != 0;
    }

    public final boolean v() {
        return (this.j & 2) != 0;
    }

    public final boolean w() {
        return (this.j & 2) != 0;
    }

    public final boolean x() {
        return (this.j & 128) != 0;
    }

    final boolean y() {
        return (this.j & 32) != 0;
    }
}
