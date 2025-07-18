package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soo extends Drawable implements suu {
    public final WeakReference a;
    public final soq b;
    public final int c;
    private final szk d;
    private final suv e;
    private final Rect f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private WeakReference l;
    private WeakReference m;

    public soo(Context context, sop sopVar) {
        syh syhVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        suy.d(context);
        this.f = new Rect();
        suv suvVar = new suv(this);
        this.e = suvVar;
        suvVar.a.setTextAlign(Paint.Align.CENTER);
        soq soqVar = new soq(context, sopVar);
        this.b = soqVar;
        szk szkVar = new szk(new szq(szq.b(context, r() ? soqVar.e() : soqVar.c(), r() ? soqVar.d() : soqVar.b())));
        this.d = szkVar;
        p();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && suvVar.e != (syhVar = new syh(context2, soqVar.b.d.intValue()))) {
            suvVar.c(syhVar, context2);
            q();
            j();
            invalidateSelf();
        }
        if (a() != -2) {
            this.c = ((int) Math.pow(10.0d, a() - 1.0d)) - 1;
        } else {
            this.c = soqVar.b.m;
        }
        suvVar.f();
        j();
        invalidateSelf();
        e();
        o();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(soqVar.b.b.intValue());
        if (szkVar.C() != colorStateListValueOf) {
            szkVar.N(colorStateListValueOf);
            invalidateSelf();
        }
        q();
        f();
        j();
        h();
    }

    private final String m() {
        if (!l()) {
            if (!k()) {
                return null;
            }
            int i = this.c;
            if (i == -2 || b() <= i) {
                return NumberFormat.getInstance(this.b.i()).format(b());
            }
            Context context = (Context) this.a.get();
            return context == null ? "" : String.format(this.b.i(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        String strD = d();
        int iA = a();
        if (iA == -2 || strD == null || strD.length() <= iA) {
            return strD;
        }
        Context context2 = (Context) this.a.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), strD.substring(0, iA - 1), "…");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    private final void n(View view, View view2) {
        float y;
        float x;
        View parent;
        FrameLayout frameLayoutC = c();
        if (frameLayoutC == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutC;
        }
        while (parent instanceof View) {
            if (parent != view2) {
                ViewParent parent2 = parent.getParent();
                if ((parent2 instanceof ViewGroup) && !((ViewGroup) parent2).getClipChildren()) {
                    View view3 = parent;
                    y += view3.getY();
                    x += view3.getX();
                    parent = parent.getParent();
                }
            }
            float f = (this.h - this.k) + y;
            float f2 = (this.g - this.j) + x;
            View view4 = parent;
            float height = ((this.h + this.k) - view4.getHeight()) + y;
            float width = ((this.g + this.j) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.h += Math.abs(f);
            }
            if (f2 < 0.0f) {
                this.g += Math.abs(f2);
            }
            if (height > 0.0f) {
                this.h -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.g -= Math.abs(width);
                return;
            }
            return;
        }
    }

    private final void o() {
        this.e.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    private final void p() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        this.d.p(new szq(szq.b(context, r() ? this.b.e() : this.b.c(), r() ? this.b.d() : this.b.b())));
        invalidateSelf();
    }

    private final void q() {
        this.e.a.setColor(this.b.b.c.intValue());
        invalidateSelf();
    }

    private final boolean r() {
        return l() || k();
    }

    public final int a() {
        return this.b.b.l;
    }

    public final int b() {
        soq soqVar = this.b;
        if (soqVar.j()) {
            return soqVar.h();
        }
        return 0;
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final String d() {
        return this.b.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strM;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.d.draw(canvas);
        if (!r() || (strM = m()) == null) {
            return;
        }
        Rect rect = new Rect();
        suv suvVar = this.e;
        int length = strM.length();
        TextPaint textPaint = suvVar.a;
        textPaint.getTextBounds(strM, 0, length, rect);
        float fExactCenterY = this.h - rect.exactCenterY();
        canvas.drawText(strM, this.g, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textPaint);
    }

    public final void e() {
        this.e.f();
        p();
        j();
        invalidateSelf();
    }

    public final void f() {
        WeakReference weakReference = this.l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.l.get();
        WeakReference weakReference2 = this.m;
        i(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    @Override // defpackage.suu
    public final void g() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        setVisible(this.b.b.t.booleanValue(), false);
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        float f11 = r() ? this.b.d : this.b.c;
        this.i = f11;
        if (f11 != -1.0f) {
            this.j = f11;
            this.k = f11;
        } else {
            this.j = Math.round((r() ? this.b.g : this.b.e) / 2.0f);
            this.k = Math.round((r() ? this.b.h : this.b.f) / 2.0f);
        }
        if (r()) {
            String strM = m();
            float f12 = this.j;
            suv suvVar = this.e;
            float fA = suvVar.a(strM) / 2.0f;
            sop sopVar = this.b.b;
            this.j = Math.max(f12, fA + sopVar.u.intValue());
            float f13 = this.k;
            if (suvVar.c) {
                suvVar.b(strM);
                f10 = suvVar.b;
            } else {
                f10 = suvVar.b;
            }
            float fMax = Math.max(f13, (f10 / 2.0f) + sopVar.v.intValue());
            this.k = fMax;
            this.j = Math.max(this.j, fMax);
        }
        soq soqVar = this.b;
        sop sopVar2 = soqVar.b;
        int iIntValue = sopVar2.x.intValue();
        if (r()) {
            iIntValue = sopVar2.z.intValue();
            if (((Context) weakReference.get()) != null) {
                iIntValue = sns.b(iIntValue, iIntValue - sopVar2.C.intValue(), sns.a(0.0f, 1.0f, 0.3f, 1.0f, sin.e(r0) - 1.0f));
            }
        }
        int i = soqVar.k;
        if (i == 0) {
            iIntValue -= Math.round(this.k);
            i = 0;
        }
        int iIntValue2 = iIntValue + sopVar2.B.intValue();
        int iA = soqVar.a();
        if (iA == 8388691 || iA == 8388693) {
            this.h = rect3.bottom - iIntValue2;
        } else {
            this.h = rect3.top + iIntValue2;
        }
        int iIntValue3 = r() ? sopVar2.y.intValue() : soqVar.g();
        if (i == 1) {
            iIntValue3 += r() ? soqVar.j : soqVar.i;
        }
        int iIntValue4 = iIntValue3 + sopVar2.A.intValue();
        int iA2 = soqVar.a();
        float f14 = iIntValue4;
        if (iA2 == 8388659 || iA2 == 8388691) {
            if (soqVar.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f7 = rect3.left + this.j;
                    f8 = this.k;
                    f9 = f7 - ((f8 + f8) - f14);
                } else {
                    f5 = rect3.right - this.j;
                    f6 = this.k;
                    f9 = f5 + ((f6 + f6) - f14);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = rect3.left;
                f4 = this.j;
                f9 = (f3 - f4) + f14;
            } else {
                f = rect3.right;
                f2 = this.j;
                f9 = (f + f2) - f14;
            }
        } else if (soqVar.l == 0) {
            if (view.getLayoutDirection() == 0) {
                f = rect3.right;
                f2 = this.j;
                f9 = (f + f2) - f14;
            } else {
                f3 = rect3.left;
                f4 = this.j;
                f9 = (f3 - f4) + f14;
            }
        } else if (view.getLayoutDirection() == 0) {
            f5 = rect3.right - this.j;
            f6 = this.k;
            f9 = f5 + ((f6 + f6) - f14);
        } else {
            f7 = rect3.left + this.j;
            f8 = this.k;
            f9 = f7 - ((f8 + f8) - f14);
        }
        this.g = f9;
        if (sopVar2.D.booleanValue()) {
            ViewParent viewParentC = c();
            if (viewParentC == null) {
                viewParentC = view.getParent();
            }
            if ((viewParentC instanceof View) && (viewParentC.getParent() instanceof View)) {
                n(view, (View) viewParentC.getParent());
            }
        } else {
            n(view, null);
        }
        float f15 = this.g;
        float f16 = this.h;
        float f17 = this.j;
        float f18 = this.k;
        rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
        float f19 = this.i;
        if (f19 != -1.0f) {
            this.d.K(f19);
        }
        if (rect.equals(rect2)) {
            return;
        }
        this.d.setBounds(rect2);
    }

    public final boolean k() {
        soq soqVar = this.b;
        return !soqVar.k() && soqVar.j();
    }

    public final boolean l() {
        return this.b.k();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.suu
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        soq soqVar = this.b;
        soqVar.a.i = i;
        soqVar.b.i = i;
        o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
