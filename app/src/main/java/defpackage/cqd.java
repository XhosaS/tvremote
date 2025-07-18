package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqd extends Drawable implements Drawable.Callback, Animatable {
    private RectF A;
    private RectF B;
    private Matrix C;
    private Matrix D;
    public cph a;
    public final cws b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public csn f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public cuh k;
    public cqq l;
    public boolean m;
    public int n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private csm p;
    private int q;
    private boolean r;
    private final Matrix s;
    private Bitmap t;
    private Canvas u;
    private Rect v;
    private RectF w;
    private Paint x;
    private Rect y;
    private Rect z;

    public cqd() {
        cws cwsVar = new cws();
        this.b = cwsVar;
        this.c = true;
        this.d = false;
        this.n = 1;
        this.e = new ArrayList();
        cqb cqbVar = new cqb(this);
        this.o = cqbVar;
        this.j = true;
        this.q = 255;
        this.l = cqq.AUTOMATIC;
        this.r = false;
        this.s = new Matrix();
        this.m = false;
        cwsVar.addUpdateListener(cqbVar);
    }

    private final void s(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private final boolean t() {
        return this.c || this.d;
    }

    public final cqq a() {
        return this.r ? cqq.SOFTWARE : cqq.HARDWARE;
    }

    public final csm b() {
        if (getCallback() == null) {
            return null;
        }
        if (this.p == null) {
            csm csmVar = new csm(getCallback());
            this.p = csmVar;
            String str = this.h;
            if (str != null) {
                csmVar.e = str;
            }
        }
        return this.p;
    }

    public final void c(final css cssVar, final Object obj, final cxb cxbVar) {
        List list;
        if (this.k == null) {
            this.e.add(new cqc() { // from class: cpt
                @Override // defpackage.cqc
                public final void a() {
                    this.a.c(cssVar, obj, cxbVar);
                }
            });
            return;
        }
        if (cssVar == css.a) {
            this.k.a(obj, cxbVar);
        } else {
            cst cstVar = cssVar.b;
            if (cstVar != null) {
                cstVar.a(obj, cxbVar);
            } else {
                if (this.k == null) {
                    ((cwq) cwr.a).a("Cannot resolve KeyPath. Composition is not set yet.", null);
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.k.e(cssVar, 0, arrayList, new css(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((css) list.get(i)).b.a(obj, cxbVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == cqi.E) {
            q(this.b.c());
        }
    }

    public final void d() {
        cph cphVar = this.a;
        if (cphVar == null) {
            return;
        }
        int i = cvr.a;
        Rect rect = cphVar.h;
        cuh cuhVar = new cuh(this, new cuk(Collections.EMPTY_LIST, cphVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new cti(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null), cphVar.g, cphVar);
        this.k = cuhVar;
        cuhVar.j = this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqd.draw(android.graphics.Canvas):void");
    }

    public final void e() {
        cws cwsVar = this.b;
        if (cwsVar.k) {
            cwsVar.g();
            cwsVar.i(true);
            if (!isVisible()) {
                this.n = 1;
            }
        }
        this.a = null;
        this.k = null;
        this.f = null;
        cwsVar.j = null;
        cwsVar.h = -2.1474836E9f;
        cwsVar.i = 2.1474836E9f;
        invalidateSelf();
    }

    public final void f() {
        cph cphVar = this.a;
        if (cphVar == null) {
            return;
        }
        cqq cqqVar = this.l;
        int i = cphVar.l;
        int iOrdinal = cqqVar.ordinal();
        boolean z = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || i > 4)) {
            z = true;
        }
        this.r = z;
    }

    public final void g() {
        this.e.clear();
        cws cwsVar = this.b;
        cwsVar.i(true);
        Iterator it = cwsVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(cwsVar);
        }
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        cph cphVar = this.a;
        if (cphVar == null) {
            return -1;
        }
        return cphVar.h.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        cph cphVar = this.a;
        if (cphVar == null) {
            return -1;
        }
        return cphVar.h.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        if (this.k == null) {
            this.e.add(new cqc() { // from class: cpw
                @Override // defpackage.cqc
                public final void a() {
                    this.a.h();
                }
            });
            return;
        }
        f();
        if (t() || this.b.getRepeatCount() == 0) {
            if (isVisible()) {
                cws cwsVar = this.b;
                cwsVar.k = true;
                boolean zM = cwsVar.m();
                Iterator it = cwsVar.a.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(cwsVar, zM);
                }
                cwsVar.k((int) (cwsVar.m() ? cwsVar.d() : cwsVar.e()));
                cwsVar.d = 0L;
                cwsVar.g = 0;
                cwsVar.h();
                this.n = 1;
            } else {
                this.n = 2;
            }
        }
        if (t()) {
            return;
        }
        cws cwsVar2 = this.b;
        j((int) (cwsVar2.c < 0.0f ? cwsVar2.e() : cwsVar2.d()));
        cwsVar2.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void i() {
        if (this.k == null) {
            this.e.add(new cqc() { // from class: cpv
                @Override // defpackage.cqc
                public final void a() {
                    this.a.i();
                }
            });
            return;
        }
        f();
        if (t() || this.b.getRepeatCount() == 0) {
            if (isVisible()) {
                cws cwsVar = this.b;
                cwsVar.k = true;
                cwsVar.h();
                cwsVar.d = 0L;
                if (cwsVar.m() && cwsVar.f == cwsVar.e()) {
                    cwsVar.k(cwsVar.d());
                } else if (!cwsVar.m() && cwsVar.f == cwsVar.d()) {
                    cwsVar.k(cwsVar.e());
                }
                Iterator it = cwsVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(cwsVar);
                }
                this.n = 1;
            } else {
                this.n = 3;
            }
        }
        if (t()) {
            return;
        }
        cws cwsVar2 = this.b;
        j((int) (cwsVar2.c < 0.0f ? cwsVar2.e() : cwsVar2.d()));
        cwsVar2.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.m) {
            return;
        }
        this.m = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return r();
    }

    public final void j(final int i) {
        if (this.a == null) {
            this.e.add(new cqc() { // from class: cpz
                @Override // defpackage.cqc
                public final void a() {
                    this.a.j(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void k(final int i) {
        if (this.a == null) {
            this.e.add(new cqc() { // from class: cpr
                @Override // defpackage.cqc
                public final void a() {
                    this.a.k(i);
                }
            });
        } else {
            cws cwsVar = this.b;
            cwsVar.l(cwsVar.h, i + 0.99f);
        }
    }

    public final void l(final float f) {
        cph cphVar = this.a;
        if (cphVar == null) {
            this.e.add(new cqc() { // from class: cpu
                @Override // defpackage.cqc
                public final void a() {
                    this.a.l(f);
                }
            });
            return;
        }
        cws cwsVar = this.b;
        float f2 = cphVar.i;
        float f3 = cphVar.j;
        PointF pointF = cwt.a;
        cwsVar.l(cwsVar.h, f2 + (f * (f3 - f2)));
    }

    public final void m(final int i, final int i2) {
        if (this.a == null) {
            this.e.add(new cqc() { // from class: cpq
                @Override // defpackage.cqc
                public final void a() {
                    this.a.m(i, i2);
                }
            });
        } else {
            this.b.l(i, i2 + 0.99f);
        }
    }

    public final void n(final float f, final float f2) {
        cph cphVar = this.a;
        if (cphVar == null) {
            this.e.add(new cqc() { // from class: cqa
                @Override // defpackage.cqc
                public final void a() {
                    this.a.n(f, f2);
                }
            });
            return;
        }
        float f3 = cphVar.i;
        float f4 = cphVar.j;
        PointF pointF = cwt.a;
        float f5 = f3 + (f * (f4 - f3));
        cph cphVar2 = this.a;
        float f6 = cphVar2.i;
        m((int) f5, (int) (f6 + (f2 * (cphVar2.j - f6))));
    }

    public final void o(final int i) {
        if (this.a == null) {
            this.e.add(new cqc() { // from class: cps
                @Override // defpackage.cqc
                public final void a() {
                    this.a.o(i);
                }
            });
        } else {
            this.b.l(i, (int) r0.i);
        }
    }

    public final void p(final float f) {
        cph cphVar = this.a;
        if (cphVar == null) {
            this.e.add(new cqc() { // from class: cpx
                @Override // defpackage.cqc
                public final void a() {
                    this.a.p(f);
                }
            });
            return;
        }
        float f2 = cphVar.i;
        float f3 = cphVar.j;
        PointF pointF = cwt.a;
        o((int) (f2 + (f * (f3 - f2))));
    }

    public final void q(final float f) {
        cph cphVar = this.a;
        if (cphVar == null) {
            this.e.add(new cqc() { // from class: cpy
                @Override // defpackage.cqc
                public final void a() {
                    this.a.q(f);
                }
            });
            return;
        }
        cws cwsVar = this.b;
        float f2 = cphVar.i;
        float f3 = cphVar.j;
        PointF pointF = cwt.a;
        cwsVar.k(f2 + (f * (f3 - f2)));
        coy.a();
    }

    public final boolean r() {
        cws cwsVar = this.b;
        if (cwsVar == null) {
            return false;
        }
        return cwsVar.k;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.q = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((cwq) cwr.a).a("Use addColorFilter instead.", null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.n;
            if (i == 2) {
                h();
                return visible;
            }
            if (i == 3) {
                i();
                return visible;
            }
        } else {
            if (this.b.k) {
                g();
                this.n = 3;
                return visible;
            }
            if (zIsVisible) {
                this.n = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
