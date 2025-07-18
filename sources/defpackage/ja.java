package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ja {
    public static final List a = Collections.EMPTY_LIST;
    public final View b;
    public WeakReference c;
    int k;
    RecyclerView p;
    ig q;
    public final TextView r;
    public int d = -1;
    public int e = -1;
    long f = -1;
    public int g = -1;
    int h = -1;
    public ja i = null;
    public ja j = null;
    private int s = 0;
    ir l = null;
    boolean m = false;
    public int n = 0;
    public int o = -1;

    public ja(View view, TextView textView) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.b = view;
        this.r = textView;
    }

    public final int a() {
        RecyclerView recyclerView = this.p;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    public final int b() {
        int i = this.h;
        return i == -1 ? this.d : i;
    }

    public final void c(int i) {
        this.k = i | this.k;
    }

    public final void d() {
        this.e = -1;
        this.h = -1;
    }

    final void e() {
        this.k &= -1025;
    }

    final void f() {
        this.k &= -33;
    }

    public final void g() {
        this.k &= -257;
    }

    public final void h(int i, boolean z) {
        if (this.e == -1) {
            this.e = this.d;
        }
        int i2 = this.h;
        if (i2 == -1) {
            i2 = this.d;
            this.h = i2;
        }
        if (z) {
            this.h = i2 + i;
        }
        this.d += i;
        View view = this.b;
        if (view.getLayoutParams() != null) {
            ((io) view.getLayoutParams()).e = true;
        }
    }

    final void i() {
        int i = RecyclerView.aa;
        this.k = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1L;
        this.h = -1;
        this.s = 0;
        this.i = null;
        this.j = null;
        e();
        this.n = 0;
        this.o = -1;
        RecyclerView.q(this);
    }

    public final void j(int i, int i2) {
        this.k = (i & i2) | (this.k & (~i2));
    }

    public final void k(boolean z) {
        int i;
        int i2 = z ? this.s - 1 : this.s + 1;
        this.s = i2;
        if (i2 < 0) {
            this.s = 0;
            int i3 = RecyclerView.aa;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else {
            if (!z && i2 == 1) {
                i = this.k | 16;
            } else if (z && i2 == 0) {
                i = this.k & (-17);
            }
            this.k = i;
        }
        int i4 = RecyclerView.aa;
    }

    final void l(ir irVar, boolean z) {
        this.l = irVar;
        this.m = z;
    }

    final void m() {
        this.l.l(this);
    }

    public final boolean n(int i) {
        return (i & this.k) != 0;
    }

    final boolean o() {
        View view = this.b;
        return (view.getParent() == null || view.getParent() == this.p) ? false : true;
    }

    public final boolean p() {
        return (this.k & 1) != 0;
    }

    public final boolean q() {
        return (this.k & 4) != 0;
    }

    public final boolean r() {
        if ((this.k & 16) != 0) {
            return false;
        }
        View view = this.b;
        int[] iArr = qv.a;
        return !view.hasTransientState();
    }

    public final boolean s() {
        return (this.k & 8) != 0;
    }

    final boolean t() {
        return this.l != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.d + " id=" + this.f + ", oldPos=" + this.e + ", pLpos:" + this.h);
        if (t()) {
            sb.append(" scrap ");
            sb.append(true != this.m ? "[attachedScrap]" : "[changeScrap]");
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
            sb.append(" not recyclable(" + this.s + ")");
        }
        if ((this.k & 512) != 0 || q()) {
            sb.append(" undefined adapter position");
        }
        if (this.b.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.k & 256) != 0;
    }

    public final boolean v() {
        return (this.k & 2) != 0;
    }

    public final boolean w() {
        return (this.k & 2) != 0;
    }

    public final boolean x() {
        return (this.k & 128) != 0;
    }

    final boolean y() {
        return (this.k & 32) != 0;
    }

    public final void z() {
        c(1024);
    }
}
