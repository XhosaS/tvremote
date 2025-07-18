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
import com.google.android.tv.remote.service.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0000do extends ec implements View.OnKeyListener, PopupWindow.OnDismissListener, eg {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
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
    private ef y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new el(this, 1);
    private final View.OnAttachStateChangeListener m = new dm(this, 0);
    private final ia n = new dn(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public ViewOnKeyListenerC0000do(Context context, View view, int i, boolean z) {
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(defpackage.du r17) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnKeyListenerC0000do.z(du):void");
    }

    @Override // defpackage.ek
    public final ListView aF() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((bda) list.get(list.size() - 1)).b();
    }

    @Override // defpackage.eg
    public final void c(du duVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (duVar == ((bda) list.get(i)).c) {
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
            ((du) ((bda) list.get(i2)).c).i(false);
        }
        bda bdaVar = (bda) list.remove(i);
        ((du) bdaVar.c).m(this);
        if (this.f) {
            Object obj = bdaVar.b;
            ((ic) obj).q.setExitTransition(null);
            ((hz) obj).q.setAnimationStyle(0);
        }
        ((hz) bdaVar.b).k();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((bda) list.get(size2 - 1)).a;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((du) ((bda) list.get(0)).c).i(false);
                return;
            }
            return;
        }
        k();
        ef efVar = this.y;
        if (efVar != null) {
            efVar.a(duVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.eg
    public final void d(ef efVar) {
        this.y = efVar;
    }

    @Override // defpackage.eg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eg
    public final boolean f(en enVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (bda bdaVar : this.b) {
            if (enVar == bdaVar.c) {
                bdaVar.b().requestFocus();
                return true;
            }
        }
        if (!enVar.hasVisibleItems()) {
            return false;
        }
        j(enVar);
        ef efVar = this.y;
        if (efVar != null) {
            efVar.b(enVar);
        }
        return true;
    }

    @Override // defpackage.eg
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((bda) it.next()).b().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.ec
    public final void j(du duVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        duVar.h(this, this.h);
        if (u()) {
            z(duVar);
        } else {
            this.l.add(duVar);
        }
    }

    @Override // defpackage.ek
    public final void k() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        bda[] bdaVarArr = (bda[]) list.toArray(new bda[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            hz hzVar = (hz) bdaVarArr[size].b;
            if (hzVar.u()) {
                hzVar.k();
            }
        }
    }

    @Override // defpackage.ec
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ec
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.ec
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.ec
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        bda bdaVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bdaVar = null;
                break;
            }
            bdaVar = (bda) list.get(i);
            if (!((hz) bdaVar.b).u()) {
                break;
            } else {
                i++;
            }
        }
        if (bdaVar != null) {
            ((du) bdaVar.c).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.ec
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.ec
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.ec
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.ek
    public final void s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (u()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z((du) it.next());
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

    @Override // defpackage.ec
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.ek
    public final boolean u() {
        List list = this.b;
        return list.size() > 0 && ((hz) ((bda) list.get(0)).b).u();
    }
}
