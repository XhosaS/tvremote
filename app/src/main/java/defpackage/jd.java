package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.katniss.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jd extends js implements View.OnKeyListener, PopupWindow.OnDismissListener, jw {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private jv y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new iy(this);
    private final View.OnAttachStateChangeListener m = new iz(this);
    private final pa n = new jb(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public jd(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(defpackage.jj r17) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.z(jj):void");
    }

    @Override // defpackage.js
    public final void b(jj jjVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        jjVar.f(this, this.h);
        if (u()) {
            z(jjVar);
        } else {
            this.l.add(jjVar);
        }
    }

    @Override // defpackage.ka
    public final ListView cl() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((jc) list.get(list.size() - 1)).a.e;
    }

    @Override // defpackage.jw
    public final void d(jj jjVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jjVar == ((jc) list.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            ((jc) list.get(i2)).b.g(false);
        }
        jc jcVar = (jc) list.remove(i);
        jcVar.b.k(this);
        if (this.f) {
            pc pcVar = jcVar.a;
            pcVar.q.setExitTransition(null);
            pcVar.q.setAnimationStyle(0);
        }
        jcVar.a.f();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((jc) list.get(size2 - 1)).c;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((jc) list.get(0)).b.g(false);
                return;
            }
            return;
        }
        f();
        jv jvVar = this.y;
        if (jvVar != null) {
            jvVar.a(jjVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        ((jt) this.z).a.c();
    }

    @Override // defpackage.jw
    public final void e(jv jvVar) {
        this.y = jvVar;
    }

    @Override // defpackage.ka
    public final void f() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        jc[] jcVarArr = (jc[]) list.toArray(new jc[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            pc pcVar = jcVarArr[size].a;
            if (pcVar.q.isShowing()) {
                pcVar.f();
            }
        }
    }

    @Override // defpackage.jw
    public final boolean g() {
        return false;
    }

    @Override // defpackage.jw
    public final boolean h(ke keVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (jc jcVar : this.b) {
            if (keVar == jcVar.b) {
                jcVar.a.e.requestFocus();
                return true;
            }
        }
        if (!keVar.hasVisibleItems()) {
            return false;
        }
        b(keVar);
        jv jvVar = this.y;
        if (jvVar != null) {
            jvVar.b(keVar);
        }
        return true;
    }

    @Override // defpackage.js
    public final void k(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.jw
    public final void l() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((jc) it.next()).a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.js
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.js
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.js
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        jc jcVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                jcVar = null;
                break;
            }
            jcVar = (jc) list.get(i);
            if (!jcVar.a.q.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (jcVar != null) {
            jcVar.b.g(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.js
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.js
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.js
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.ka
    public final void s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (u()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z((jj) it.next());
        }
        list.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.js
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.ka
    public final boolean u() {
        List list = this.b;
        return list.size() > 0 && ((jc) list.get(0)).a.q.isShowing();
    }
}
