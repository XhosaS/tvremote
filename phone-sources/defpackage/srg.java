package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srg extends szk implements Drawable.Callback, suu {
    private ColorStateList F;
    private ColorStateList G;
    private float H;
    private ColorStateList I;
    private float J;
    private boolean K;
    private Drawable L;
    private ColorStateList M;
    private float N;
    private boolean O;
    private Drawable P;
    private ColorStateList Q;
    private boolean R;
    private Drawable S;
    private ColorStateList T;
    private float U;
    private float V;
    private final Context W;
    private final Paint X;
    private final Paint.FontMetrics Y;
    private final RectF Z;
    private final PointF aa;
    private final Path ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private boolean ah;
    private int ai;
    private int aj;
    private ColorFilter ak;
    private PorterDuffColorFilter al;
    private ColorStateList am;
    private PorterDuff.Mode an;
    private int[] ao;
    private WeakReference ap;
    private boolean aq;
    public float b;
    public ColorStateList c;
    public CharSequence d;
    public boolean e;
    public Drawable f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public final suv o;
    public TextUtils.TruncateAt p;
    public boolean q;
    public int r;
    public static final int[] a = {R.attr.state_enabled};
    private static final ShapeDrawable E = new ShapeDrawable(new OvalShape());

    private srg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.H = -1.0f;
        this.X = new Paint(1);
        this.Y = new Paint.FontMetrics();
        this.Z = new RectF();
        this.aa = new PointF();
        this.ab = new Path();
        this.aj = 255;
        this.an = PorterDuff.Mode.SRC_IN;
        this.ap = new WeakReference(null);
        J(context);
        this.W = context;
        suv suvVar = new suv(this);
        this.o = suvVar;
        this.d = "";
        suvVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        r(iArr);
        this.q = true;
        E.setTint(-1);
    }

    private final float Z() {
        Drawable drawable = this.ah ? this.S : this.L;
        float f = this.N;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final ColorFilter aa() {
        ColorFilter colorFilter = this.ak;
        return colorFilter != null ? colorFilter : this.al;
    }

    private final void ab(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f) {
            if (drawable.isStateful()) {
                drawable.setState(this.ao);
            }
            drawable.setTintList(this.Q);
            return;
        }
        Drawable drawable2 = this.L;
        if (drawable == drawable2 && this.O) {
            drawable2.setTintList(this.M);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private final void ac(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ah() || ag()) {
            float f = this.i + this.U;
            float fZ = Z();
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + fZ;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - fZ;
            }
            Drawable drawable = this.ah ? this.S : this.L;
            float fCeil = this.N;
            if (fCeil <= 0.0f && drawable != null) {
                fCeil = (float) Math.ceil(sil.f(this.W, 24));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.bottom = rectF.top + fCeil;
        }
    }

    private final boolean ad() {
        return this.R && this.S != null && this.h;
    }

    private static boolean ae(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final boolean af(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.F;
        int iZ = z(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.ac) : 0);
        boolean state = true;
        if (this.ac != iZ) {
            this.ac = iZ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.G;
        int iZ2 = z(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ad) : 0);
        if (this.ad != iZ2) {
            this.ad = iZ2;
            zOnStateChange = true;
        }
        int iF = csq.f(iZ2, iZ);
        if ((this.ae != iF) | (C() == null)) {
            this.ae = iF;
            N(ColorStateList.valueOf(iF));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.I;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.af) : 0;
        if (this.af != colorForState) {
            this.af = colorForState;
            zOnStateChange = true;
        }
        syh syhVar = this.o.e;
        int colorForState2 = (syhVar == null || (colorStateList = syhVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.ag);
        if (this.ag != colorForState2) {
            this.ag = colorForState2;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int i = 0;
            while (true) {
                if (i >= state2.length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.h) {
                    z = true;
                }
            }
        }
        if (this.ah == z || this.S == null) {
            z2 = false;
        } else {
            float fA = a();
            this.ah = z;
            if (fA != a()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.am;
        int colorForState3 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.ai) : 0;
        if (this.ai != colorForState3) {
            this.ai = colorForState3;
            this.al = ssr.c(this, this.am, this.an);
        } else {
            state = zOnStateChange;
        }
        if (q(this.L)) {
            state |= this.L.setState(iArr);
        }
        if (q(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (q(this.f)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            state |= this.f.setState(iArr3);
        }
        if (q(this.P)) {
            state |= this.P.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            h();
        }
        return state;
    }

    private final boolean ag() {
        return this.R && this.S != null && this.ah;
    }

    private final boolean ah() {
        return this.K && this.L != null;
    }

    private static final void ai(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.srg e(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srg.e(android.content.Context, android.util.AttributeSet, int, int):srg");
    }

    public static boolean q(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final float a() {
        if (ah() || ag()) {
            return this.U + Z() + this.V;
        }
        return 0.0f;
    }

    public final float b() {
        if (s()) {
            return this.l + this.g + this.m;
        }
        return 0.0f;
    }

    public final float c() {
        return this.aq ? w() : this.H;
    }

    public final Drawable d() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return cry.a(drawable);
        }
        return null;
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.aj) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.aj);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        if (!this.aq) {
            Paint paint = this.X;
            paint.setColor(this.ac);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.Z;
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, c(), c(), paint);
        }
        if (!this.aq) {
            Paint paint2 = this.X;
            paint2.setColor(this.ad);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColorFilter(aa());
            RectF rectF2 = this.Z;
            rectF2.set(bounds);
            canvas2.drawRoundRect(rectF2, c(), c(), paint2);
        }
        if (this.aq) {
            super.draw(canvas);
        }
        if (this.J <= 0.0f || this.aq) {
            f = 2.0f;
        } else {
            Paint paint3 = this.X;
            paint3.setColor(this.af);
            paint3.setStyle(Paint.Style.STROKE);
            if (!this.aq) {
                paint3.setColorFilter(aa());
            }
            RectF rectF3 = this.Z;
            f = 2.0f;
            rectF3.set(bounds.left + (this.J / 2.0f), bounds.top + (this.J / 2.0f), bounds.right - (this.J / 2.0f), bounds.bottom - (this.J / 2.0f));
            float f2 = this.H - (this.J / 2.0f);
            canvas2.drawRoundRect(rectF3, f2, f2, paint3);
        }
        Paint paint4 = this.X;
        paint4.setColor(0);
        paint4.setStyle(Paint.Style.FILL);
        RectF rectF4 = this.Z;
        rectF4.set(bounds);
        if (this.aq) {
            RectF rectF5 = new RectF(bounds);
            Path path = this.ab;
            G(rectF5, path);
            super.H(canvas2, paint4, path, this.s.a, this.A, D());
        } else {
            canvas2.drawRoundRect(rectF4, c(), c(), paint4);
        }
        if (ah()) {
            ac(bounds, rectF4);
            float f3 = rectF4.left;
            float f4 = rectF4.top;
            canvas2.translate(f3, f4);
            this.L.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.L.draw(canvas2);
            canvas2.translate(-f3, -f4);
        }
        if (ag()) {
            ac(bounds, rectF4);
            float f5 = rectF4.left;
            float f6 = rectF4.top;
            canvas2.translate(f5, f6);
            this.S.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.S.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (this.q && this.d != null) {
            PointF pointF = this.aa;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.d != null) {
                float fA = this.i + a() + this.j;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fA;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fA;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                suv suvVar = this.o;
                Paint.FontMetrics fontMetrics = this.Y;
                suvVar.a.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF4.setEmpty();
            if (this.d != null) {
                float fA2 = this.i + a() + this.j;
                float fB = this.n + b() + this.k;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + fA2;
                    rectF4.right = bounds.right - fB;
                } else {
                    rectF4.left = bounds.left + fB;
                    rectF4.right = bounds.right - fA2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            suv suvVar2 = this.o;
            if (suvVar2.e != null) {
                suvVar2.a.drawableState = getState();
                suvVar2.d(this.W);
            }
            TextPaint textPaint = suvVar2.a;
            textPaint.setTextAlign(align);
            boolean z = Math.round(suvVar2.a(this.d.toString())) > Math.round(rectF4.width());
            if (z) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF4);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.d;
            if (z && this.p != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, rectF4.width(), this.p);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint);
            canvas2 = canvas;
            if (z) {
                canvas2.restoreToCount(i2);
            }
        }
        if (s()) {
            rectF4.setEmpty();
            if (s()) {
                float f7 = this.n + this.m;
                if (getLayoutDirection() == 0) {
                    rectF4.right = bounds.right - f7;
                    rectF4.left = rectF4.right - this.g;
                } else {
                    rectF4.left = bounds.left + f7;
                    rectF4.right = rectF4.left + this.g;
                }
                rectF4.top = bounds.exactCenterY() - (this.g / f);
                rectF4.bottom = rectF4.top + this.g;
            }
            float f8 = rectF4.left;
            float f9 = rectF4.top;
            canvas2.translate(f8, f9);
            this.f.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.P.setBounds(this.f.getBounds());
            this.P.jumpToCurrentState();
            this.P.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.aj < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final syh f() {
        return this.o.e;
    }

    @Override // defpackage.suu
    public final void g() {
        h();
        invalidateSelf();
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.aj;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.ak;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.i + a() + this.j + this.o.a(this.d.toString()) + this.k + b() + this.n), this.r);
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.aq) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.H);
        } else {
            outline.setRoundRect(bounds, this.H);
            outline2 = outline;
        }
        outline2.setAlpha(this.aj / 255.0f);
    }

    protected final void h() {
        srf srfVar = (srf) this.ap.get();
        if (srfVar != null) {
            srfVar.g();
        }
    }

    public final void i(boolean z) {
        if (this.R != z) {
            boolean zAg = ag();
            this.R = z;
            boolean zAg2 = ag();
            if (zAg != zAg2) {
                if (zAg2) {
                    ab(this.S);
                } else {
                    ai(this.S);
                }
                invalidateSelf();
                h();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (ae(this.F) || ae(this.G) || ae(this.I)) {
            return true;
        }
        syh syhVar = this.o.e;
        return !(syhVar == null || (colorStateList = syhVar.k) == null || !colorStateList.isStateful()) || ad() || q(this.L) || q(this.S) || ae(this.am);
    }

    public final void j(boolean z) {
        if (this.K != z) {
            boolean zAh = ah();
            this.K = z;
            boolean zAh2 = ah();
            if (zAh != zAh2) {
                if (zAh2) {
                    ab(this.L);
                } else {
                    ai(this.L);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void k(boolean z) {
        if (this.e != z) {
            boolean zS = s();
            this.e = z;
            boolean zS2 = s();
            if (zS != zS2) {
                if (zS2) {
                    ab(this.f);
                } else {
                    ai(this.f);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void l(srf srfVar) {
        this.ap = new WeakReference(srfVar);
    }

    public final void m(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.o.g();
        invalidateSelf();
        h();
    }

    public final void n(syh syhVar) {
        this.o.c(syhVar, this.W);
    }

    public final void o(int i) {
        n(new syh(this.W, i));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ah()) {
            zOnLayoutDirectionChanged |= this.L.setLayoutDirection(i);
        }
        if (ag()) {
            zOnLayoutDirectionChanged |= this.S.setLayoutDirection(i);
        }
        if (s()) {
            zOnLayoutDirectionChanged |= this.f.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (ah()) {
            zOnLevelChange |= this.L.setLevel(i);
        }
        if (ag()) {
            zOnLevelChange |= this.S.setLevel(i);
        }
        if (s()) {
            zOnLevelChange |= this.f.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable, defpackage.suu
    public final boolean onStateChange(int[] iArr) {
        if (this.aq) {
            super.onStateChange(iArr);
        }
        return af(iArr, this.ao);
    }

    public final boolean r(int[] iArr) {
        if (Arrays.equals(this.ao, iArr)) {
            return false;
        }
        this.ao = iArr;
        if (s()) {
            return af(getState(), iArr);
        }
        return false;
    }

    public final boolean s() {
        return this.e && this.f != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.aj != i) {
            this.aj = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.ak != colorFilter) {
            this.ak = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.am != colorStateList) {
            this.am = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.szk, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.an != mode) {
            this.an = mode;
            this.al = ssr.c(this, this.am, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ah()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (ag()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (s()) {
            visible |= this.f.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
