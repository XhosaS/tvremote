package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.StateSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkc extends Drawable implements bks {
    private static final String j = "bkc";
    private static final Paint k;
    private static final bkb[] l;
    private boolean A;
    private boolean B;
    private bkh C;
    private ud D;
    private float[] E;
    private final byj F;
    private final byj G;
    public bka a;
    public final bkq[] b;
    public final bkq[] c;
    public final BitSet d;
    public boolean e;
    public boolean f;
    public float[] g;
    uc[] h;
    public byj i;
    private final Matrix m;
    private final Path n;
    private final Path o;
    private final RectF p;
    private final RectF q;
    private final Region r;
    private final Region s;
    private final Paint t;
    private final Paint u;
    private final bjt v;
    private final bkj w;
    private PorterDuffColorFilter x;
    private PorterDuffColorFilter y;
    private final RectF z;

    static {
        bkg bkgVar = new bkg();
        int i = 0;
        xo xoVarK = bjz.k(0);
        bkgVar.d(xoVarK);
        bkgVar.e(xoVarK);
        bkgVar.c(xoVarK);
        bkgVar.b(xoVarK);
        bkgVar.a(0.0f);
        Paint paint = new Paint(1);
        k = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        l = new bkb[4];
        while (true) {
            bkb[] bkbVarArr = l;
            int length = bkbVarArr.length;
            if (i >= 4) {
                return;
            }
            bkbVarArr[i] = new bkb(i);
            i++;
        }
    }

    public bkc() {
        this(new bkh());
    }

    private final boolean A(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.e != null && color2 != (colorForState2 = this.a.e.getColorForState(iArr, (color2 = (paint2 = this.t).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.f == null || color == (colorForState = this.a.f.getColorForState(iArr, (color = (paint = this.u).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean B() {
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        bka bkaVar = this.a;
        this.x = t(bkaVar.h, bkaVar.i, this.t, true);
        bka bkaVar2 = this.a;
        ColorStateList colorStateList = bkaVar2.g;
        this.y = t(null, bkaVar2.i, this.u, false);
        boolean z = this.a.v;
        return (Objects.equals(porterDuffColorFilter, this.x) && Objects.equals(porterDuffColorFilter2, this.y)) ? false : true;
    }

    private static final float C(RectF rectF, bkh bkhVar, float[] fArr) {
        if (fArr == null) {
            if (bkhVar.e(rectF)) {
                return bkhVar.a.a(rectF);
            }
            return -1.0f;
        }
        if (biu.c(fArr) && bkhVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private static int s(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter t(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iE;
        if (colorStateList == null || mode == null) {
            if (!z || (iE = e((color = paint.getColor()))) == color) {
                return null;
            }
            return new PorterDuffColorFilter(iE, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private final RectF u() {
        RectF rectF = this.q;
        rectF.set(h());
        float fB = b();
        rectF.inset(fB, fB);
        return rectF;
    }

    private final void v(RectF rectF, Path path) {
        bka bkaVar = this.a;
        this.w.b(bkaVar.a, this.g, bkaVar.l, rectF, this.F, path);
        if (this.a.k != 1.0f) {
            Matrix matrix = this.m;
            matrix.reset();
            float f = this.a.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.z, true);
    }

    private final void w(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(j, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.t != 0) {
            canvas.drawPath(this.n, this.v.e);
        }
        for (int i = 0; i < 4; i++) {
            bkq[] bkqVarArr = this.b;
            bjt bjtVar = this.v;
            bkqVarArr[i].c(bjtVar, this.a.s, canvas);
            this.c[i].c(bjtVar, this.a.s, canvas);
        }
        if (this.A) {
            int iF = f();
            int iG = g();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.n, k);
            canvas.translate(iF, iG);
        }
    }

    private final void x(Canvas canvas, Paint paint, Path path, bkh bkhVar, float[] fArr, RectF rectF) {
        float fC = C(rectF, bkhVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fC * this.a.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    private final void y(int[] iArr, boolean z) {
        boolean z2;
        RectF rectFH = h();
        if (this.a.b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.D == null);
        if (this.g == null) {
            this.g = new float[4];
        }
        bku bkuVar = this.a.b;
        int iA = bkuVar.a(iArr);
        if (iA < 0) {
            iA = bkuVar.a(StateSet.WILD_CARD);
        }
        bkh bkhVar = bkuVar.d[iA];
        for (int i = 0; i < 4; i++) {
            float fA = bkj.a(i, bkhVar).a(rectFH);
            if (z3) {
                this.g[i] = fA;
                z2 = true;
            } else {
                z2 = false;
            }
            uc ucVar = this.h[i];
            if (ucVar != null) {
                if (ucVar.d) {
                    ucVar.j = fA;
                } else {
                    if (ucVar.i == null) {
                        ucVar.i = new ud(fA);
                    }
                    ucVar.i.d(fA);
                    ud udVar = ucVar.i;
                    if (udVar == null) {
                        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
                    }
                    double dA = udVar.a();
                    if (dA > 3.4028234663852886E38d) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                    }
                    if (dA < -3.4028234663852886E38d) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                    double dAbs = Math.abs(ucVar.f * 0.75f);
                    udVar.c = dAbs;
                    udVar.d = dAbs * 62.5d;
                    if (!ua.a().b()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (!ucVar.d) {
                        ucVar.d = true;
                        qk qkVar = ucVar.l;
                        float[] fArr = ((bkc) ucVar.c).g;
                        float f = fArr != null ? fArr[((bkb) qkVar).a] : 0.0f;
                        ucVar.b = f;
                        if (f > Float.MAX_VALUE || f < -3.4028235E38f) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        ua uaVarA = ua.a();
                        ArrayList arrayList = uaVarA.b;
                        if (arrayList.size() == 0) {
                            uaVarA.g.m(uaVarA.c);
                            if (Build.VERSION.SDK_INT >= 33) {
                                uaVarA.e = ValueAnimator.getDurationScale();
                                if (uaVarA.f == null) {
                                    uaVarA.f = new ty(uaVarA);
                                }
                                final ty tyVar = uaVarA.f;
                                if (tyVar.a == null) {
                                    tyVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: tx
                                        public final void onChanged(float f2) {
                                            tyVar.b.e = f2;
                                        }
                                    };
                                    ValueAnimator.registerDurationScaleChangeListener(tyVar.a);
                                }
                            }
                        }
                        if (!arrayList.contains(ucVar)) {
                            arrayList.add(ucVar);
                        }
                    }
                }
                if (z2) {
                    uc ucVar2 = this.h[i];
                    if (ucVar2.i.b <= 0.0d) {
                        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
                    }
                    if (!ua.a().b()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (ucVar2.d) {
                        ucVar2.k = true;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    private final boolean z() {
        return (this.a.w == Paint.Style.FILL_AND_STROKE || this.a.w == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    public final float a() {
        float fA;
        float fA2;
        float[] fArr = this.g;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFH = h();
            fA = (i().a.a(rectFH) + i().d.a(rectFH)) - i().c.a(rectFH);
            fA2 = bkj.a(0, i()).a(rectFH);
        }
        return (fA - fA2) / 2.0f;
    }

    public final float b() {
        if (z()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        bka bkaVar = this.a;
        float f = bkaVar.p;
        float f2 = bkaVar.q;
        return f + 0.0f;
    }

    @Override // defpackage.bks
    public final void d(bkh bkhVar) {
        bka bkaVar = this.a;
        bkaVar.a = bkhVar;
        bkaVar.b = null;
        this.g = null;
        this.E = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float[] fArr;
        int i;
        Paint paint;
        Paint paint2 = this.t;
        paint2.setColorFilter(this.x);
        int alpha = paint2.getAlpha();
        paint2.setAlpha(s(alpha, this.a.n));
        Paint paint3 = this.u;
        paint3.setColorFilter(this.y);
        paint3.setStrokeWidth(this.a.m);
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha(s(alpha2, this.a.n));
        if (this.a.w == Paint.Style.FILL_AND_STROKE || this.a.w == Paint.Style.FILL) {
            if (this.e) {
                v(h(), this.n);
                this.e = false;
            }
            bka bkaVar = this.a;
            int i2 = bkaVar.r;
            if (bkaVar.s > 0 && !bkaVar.a.e(h()) && (((fArr = this.g) == null || !biu.c(fArr) || !this.a.a.d()) && !this.n.isConvex() && Build.VERSION.SDK_INT < 29)) {
                canvas.save();
                canvas.translate(f(), g());
                if (this.A) {
                    RectF rectF = this.z;
                    float fWidth = rectF.width() - getBounds().width();
                    float fHeight = rectF.height() - getBounds().height();
                    int i3 = (int) fWidth;
                    if (i3 < 0 || (i = (int) fHeight) < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    int iWidth = (int) rectF.width();
                    int i4 = this.a.s;
                    int iHeight = (int) rectF.height();
                    int i5 = this.a.s;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth + i4 + i4 + i3, iHeight + i5 + i5 + i, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.a.s) - i3;
                    float f2 = (getBounds().top - this.a.s) - i;
                    canvas2.translate(-f, -f2);
                    w(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    w(canvas);
                    canvas.restore();
                }
            }
            x(canvas, paint2, this.n, this.a.a, this.g, h());
        }
        if (z()) {
            if (this.f) {
                bkh bkhVarI = i();
                byj byjVar = this.G;
                bkg bkgVar = new bkg(bkhVarI);
                bkgVar.a = byjVar.g(bkhVarI.a);
                bkgVar.b = byjVar.g(bkhVarI.b);
                bkgVar.d = byjVar.g(bkhVarI.d);
                bkgVar.c = byjVar.g(bkhVarI.c);
                this.C = new bkh(bkgVar);
                if (this.g != null) {
                    if (this.E == null) {
                        this.E = new float[4];
                    }
                    float fB = b();
                    int i6 = 0;
                    while (true) {
                        float[] fArr2 = this.g;
                        int length = fArr2.length;
                        if (i6 >= 4) {
                            break;
                        }
                        this.E[i6] = Math.max(0.0f, fArr2[i6] - fB);
                        i6++;
                    }
                } else {
                    this.E = null;
                }
                this.w.b(this.C, this.E, this.a.l, u(), null, this.o);
                this.f = false;
            }
            paint = paint3;
            x(canvas, paint, this.o, this.C, this.E, u());
        } else {
            paint = paint3;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    protected final int e(int i) {
        int i2;
        float fC = c();
        bka bkaVar = this.a;
        float f = fC + bkaVar.o;
        biv bivVar = bkaVar.c;
        if (bivVar == null || !bivVar.b || ns.d(i, 255) != bivVar.e) {
            return i;
        }
        float fMin = (bivVar.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iD = bit.d(ns.d(i, 255), bivVar.c, fMin);
        if (fMin > 0.0f && (i2 = bivVar.d) != 0) {
            iD = ns.c(ns.d(i2, biv.a), iD);
        }
        return ns.d(iD, iAlpha);
    }

    public final int f() {
        bka bkaVar = this.a;
        double d = bkaVar.t;
        int i = bkaVar.u;
        return (int) (d * Math.sin(Math.toRadians(0.0d)));
    }

    public final int g() {
        bka bkaVar = this.a;
        double d = bkaVar.t;
        int i = bkaVar.u;
        return (int) (d * Math.cos(Math.toRadians(0.0d)));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i = this.a.r;
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = C(rectFH, this.a.a, this.g);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.a.l);
            return;
        }
        if (this.e) {
            v(rectFH, this.n);
            this.e = false;
        }
        Path path = this.n;
        if (Build.VERSION.SDK_INT >= 30) {
            biu.a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                bit.b(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            bit.b(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.r;
        region.set(getBounds());
        RectF rectFH = h();
        Path path = this.n;
        v(rectFH, path);
        Region region2 = this.s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.p;
        rectF.set(getBounds());
        return rectF;
    }

    public final bkh i() {
        return this.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        this.f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        bka bkaVar = this.a;
        ColorStateList colorStateList2 = bkaVar.g;
        ColorStateList colorStateList3 = bkaVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.a.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        bku bkuVar = this.a.b;
        return bkuVar != null && bkuVar.a > 1;
    }

    public final void j(Context context) {
        this.a.c = new biv(context);
        r();
    }

    public final void k(ud udVar) {
        if (this.D == udVar) {
            return;
        }
        this.D = udVar;
        int i = 0;
        while (true) {
            uc[] ucVarArr = this.h;
            int length = ucVarArr.length;
            if (i >= 4) {
                y(getState(), true);
                invalidateSelf();
                return;
            }
            if (ucVarArr[i] == null) {
                ucVarArr[i] = new uc(this, l[i]);
            }
            uc ucVar = this.h[i];
            ud udVar2 = new ud();
            udVar2.c((float) udVar.b);
            double d = udVar.a;
            udVar2.e((float) (d * d));
            ucVar.i = udVar2;
            i++;
        }
    }

    public final void l(float f) {
        bka bkaVar = this.a;
        if (bkaVar.p != f) {
            bkaVar.p = f;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        bka bkaVar = this.a;
        if (bkaVar.e != colorStateList) {
            bkaVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new bka(this.a);
        return this;
    }

    public final void n(float f) {
        bka bkaVar = this.a;
        if (bkaVar.l != f) {
            bkaVar.l = f;
            this.e = true;
            this.f = true;
            invalidateSelf();
        }
    }

    public final void o(bku bkuVar) {
        bka bkaVar = this.a;
        if (bkaVar.b != bkuVar) {
            bkaVar.b = bkuVar;
            y(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        this.f = true;
        super.onBoundsChange(rect);
        if (this.a.b != null && !rect.isEmpty()) {
            y(getState(), this.B);
        }
        this.B = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.a.b != null) {
            y(iArr, false);
        }
        boolean z = A(iArr) || B();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(ColorStateList colorStateList) {
        bka bkaVar = this.a;
        if (bkaVar.f != colorStateList) {
            bkaVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void q(float f) {
        this.a.m = f;
        invalidateSelf();
    }

    public final void r() {
        float fC = c();
        this.a.s = (int) Math.ceil(0.75f * fC);
        this.a.t = (int) Math.ceil(fC * 0.25f);
        B();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        bka bkaVar = this.a;
        if (bkaVar.n != i) {
            bkaVar.n = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.d = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.h = colorStateList;
        B();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        bka bkaVar = this.a;
        if (bkaVar.i != mode) {
            bkaVar.i = mode;
            B();
            super.invalidateSelf();
        }
    }

    protected bkc(bka bkaVar) {
        this.G = new byj(this, null);
        this.b = new bkq[4];
        this.c = new bkq[4];
        this.d = new BitSet(8);
        this.m = new Matrix();
        this.n = new Path();
        this.o = new Path();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new Region();
        this.s = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new bjt();
        this.w = Looper.getMainLooper().getThread() == Thread.currentThread() ? bki.a : new bkj();
        this.z = new RectF();
        this.A = true;
        this.B = true;
        this.h = new uc[4];
        this.a = bkaVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        B();
        A(getState());
        this.F = new byj(this, null);
    }

    public bkc(bkh bkhVar) {
        this(new bka(bkhVar));
    }
}
