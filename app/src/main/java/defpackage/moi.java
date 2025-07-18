package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class moi {
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;
    public List g;
    public List h;
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public List o;
    public WeakReference a = new WeakReference(null);
    public Integer p = null;
    public ofs q = null;

    final void a(MotionEvent motionEvent) {
        List list = this.h;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((obp) it.next()).a((View) this.a.get(), new nzd(motionEvent.getX(), motionEvent.getY()));
            }
        }
    }

    final void b(MotionEvent motionEvent) {
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((obu) it.next()).a((View) this.a.get(), new nzd(motionEvent.getX(), motionEvent.getY()), motionEvent);
            }
        }
    }

    final void c(View view) {
        this.a = new WeakReference(view);
    }

    final boolean d() {
        return this.f != null;
    }

    final boolean e() {
        return this.i != null;
    }

    final boolean f() {
        return k() || d() || g() || j() || e() || i() || h();
    }

    final boolean g() {
        return this.h != null;
    }

    final boolean h() {
        return this.n != null;
    }

    final boolean i() {
        return this.l != null;
    }

    final boolean j() {
        return this.k != null;
    }

    final boolean k() {
        return this.e != null;
    }

    final boolean l() {
        return (this.b == null && this.c == null && this.d == null && this.g == null && this.j == null) ? false : true;
    }

    final boolean m(boolean z) {
        if (z) {
            return (k() || g()) && e();
        }
        return false;
    }
}
