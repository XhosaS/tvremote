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
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbv extends Drawable implements Drawable.Callback, Animatable {
    private RectF A;
    private Matrix B;
    private Matrix C;
    private goe D;
    public hbk a;
    public final hhl b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public hdy f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public hfl k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    private final ValueAnimator.AnimatorUpdateListener p;
    private int q;
    private final Matrix r;
    private Bitmap s;
    private Canvas t;
    private Rect u;
    private RectF v;
    private Paint w;
    private Rect x;
    private Rect y;
    private RectF z;

    public hbv() {
        hhl hhlVar = new hhl();
        this.b = hhlVar;
        this.c = true;
        this.d = false;
        this.n = 1;
        this.e = new ArrayList();
        fsz fszVar = new fsz(this, 5);
        this.p = fszVar;
        this.j = true;
        this.q = 255;
        this.o = 1;
        this.l = false;
        this.r = new Matrix();
        this.m = false;
        hhlVar.addUpdateListener(fszVar);
    }

    private final boolean r() {
        return this.c || this.d;
    }

    private static final void s(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbv.draw(android.graphics.Canvas):void");
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(final hed hedVar, final Object obj, final hhu hhuVar) {
        hfl hflVar = this.k;
        if (hflVar == null) {
            this.e.add(new hbu() { // from class: hbq
                @Override // defpackage.hbu
                public final void a() {
                    this.a.f(hedVar, obj, hhuVar);
                }
            });
            return;
        }
        if (hedVar == hed.a) {
            hflVar.a(obj, hhuVar);
        } else {
            hee heeVar = hedVar.b;
            if (heeVar != null) {
                heeVar.a(obj, hhuVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.k.e(hedVar, 0, arrayList, new hed(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((hed) arrayList.get(i)).b.a(obj, hhuVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == hca.E) {
            n(c());
        }
    }

    public final void g() {
        hbk hbkVar = this.a;
        if (hbkVar == null) {
            return;
        }
        int i = hgp.a;
        Rect rect = hbkVar.g;
        hfl hflVar = new hfl(this, new hfn(Collections.EMPTY_LIST, hbkVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new her(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null), hbkVar.f, hbkVar);
        this.k = hflVar;
        hflVar.j = this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        hbk hbkVar = this.a;
        if (hbkVar == null) {
            return -1;
        }
        return hbkVar.g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        hbk hbkVar = this.a;
        if (hbkVar == null) {
            return -1;
        }
        return hbkVar.g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        hhl hhlVar = this.b;
        if (hhlVar.k) {
            hhlVar.cancel();
            if (!isVisible()) {
                this.n = 1;
            }
        }
        this.a = null;
        this.k = null;
        this.f = null;
        hhlVar.j = null;
        hhlVar.h = -2.1474836E9f;
        hhlVar.i = 2.1474836E9f;
        invalidateSelf();
    }

    public final void i() {
        hbk hbkVar = this.a;
        if (hbkVar == null) {
            return;
        }
        int i = this.o - 1;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = hbkVar.k;
        int i3 = hbkVar.l;
        boolean z2 = false;
        if (i != 1 && (i == 2 || ((z && i2 < 28) || i3 > 4 || i2 <= 25))) {
            z2 = true;
        }
        this.l = z2;
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
        return p();
    }

    public final void j() {
        this.e.clear();
        hhl hhlVar = this.b;
        hhlVar.h();
        Iterator it = hhlVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(hhlVar);
        }
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void k() {
        if (this.k == null) {
            this.e.add(new hbr(this, 0));
            return;
        }
        i();
        if (r() || e() == 0) {
            if (isVisible()) {
                hhl hhlVar = this.b;
                hhlVar.k = true;
                Set<Animator.AnimatorListener> set = hhlVar.a;
                boolean zM = hhlVar.m();
                for (Animator.AnimatorListener animatorListener : set) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(hhlVar, zM);
                    } else {
                        animatorListener.onAnimationStart(hhlVar);
                    }
                }
                hhlVar.k((int) (hhlVar.m() ? hhlVar.d() : hhlVar.e()));
                hhlVar.d = 0L;
                hhlVar.g = 0;
                hhlVar.g();
                this.n = 1;
            } else {
                this.n = 2;
            }
        }
        if (r()) {
            return;
        }
        m((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void l() {
        if (this.k == null) {
            this.e.add(new hbr(this, 1));
            return;
        }
        i();
        if (r() || e() == 0) {
            if (isVisible()) {
                hhl hhlVar = this.b;
                hhlVar.k = true;
                hhlVar.g();
                hhlVar.d = 0L;
                if (hhlVar.m() && hhlVar.f == hhlVar.e()) {
                    hhlVar.k(hhlVar.d());
                } else if (!hhlVar.m() && hhlVar.f == hhlVar.d()) {
                    hhlVar.k(hhlVar.e());
                }
                Iterator it = hhlVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(hhlVar);
                }
                this.n = 1;
            } else {
                this.n = 3;
            }
        }
        if (r()) {
            return;
        }
        m((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void m(final int i) {
        if (this.a == null) {
            this.e.add(new hbu() { // from class: hbt
                @Override // defpackage.hbu
                public final void a() {
                    this.a.m(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void n(final float f) {
        hbk hbkVar = this.a;
        if (hbkVar == null) {
            this.e.add(new hbu() { // from class: hbs
                @Override // defpackage.hbu
                public final void a() {
                    this.a.n(f);
                }
            });
            return;
        }
        hhl hhlVar = this.b;
        float f2 = hbkVar.h;
        float f3 = hbkVar.i;
        PointF pointF = hhm.a;
        hhlVar.k(f2 + (f * (f3 - f2)));
        hbd.a();
    }

    public final void o(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean p() {
        hhl hhlVar = this.b;
        if (hhlVar == null) {
            return false;
        }
        return hhlVar.k;
    }

    public final goe q() {
        if (getCallback() == null) {
            return null;
        }
        if (this.D == null) {
            goe goeVar = new goe(getCallback());
            this.D = goeVar;
            String str = this.h;
            if (str != null) {
                goeVar.e = str;
            }
        }
        return this.D;
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
        hhk.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.n;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                l();
                return visible;
            }
        } else {
            if (this.b.k) {
                j();
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
        k();
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
