package defpackage;

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
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vbq extends Drawable implements vch {
    public static final /* synthetic */ int j = 0;
    private static final String k = "vbq";
    private static final Paint l;
    private static final vbp[] m;
    private final RectF A;
    private boolean B;
    private boolean C;
    private vbw D;
    private aqo E;
    private float[] F;
    private final vbm G;
    private final vbn H;
    public vbo a;
    public final vcf[] b;
    public final vcf[] c;
    public final BitSet d;
    public boolean e;
    public boolean f;
    aqn[] g;
    public float[] h;
    public uzg i;
    private final Matrix n;
    private final Path o;
    private final Path p;
    private final RectF q;
    private final RectF r;
    private final Region s;
    private final Region t;
    private final Paint u;
    private final Paint v;
    private final vbe w;
    private final vby x;
    private PorterDuffColorFilter y;
    private PorterDuffColorFilter z;

    static {
        vbv vbvVar = new vbv();
        vbu vbuVar = new vbu();
        vbvVar.a = vbuVar;
        vbv.a(vbuVar);
        vbvVar.b = vbuVar;
        vbv.a(vbuVar);
        vbvVar.c = vbuVar;
        vbv.a(vbuVar);
        vbvVar.d = vbuVar;
        vbv.a(vbuVar);
        vbvVar.b(0.0f);
        Paint paint = new Paint(1);
        l = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m = new vbp[4];
        int i = 0;
        while (true) {
            vbp[] vbpVarArr = m;
            int length = vbpVarArr.length;
            if (i >= 4) {
                return;
            }
            vbpVarArr[i] = new vbp(i);
            i++;
        }
    }

    public vbq() {
        this(new vbw());
    }

    private final boolean A() {
        return (this.a.w == Paint.Style.FILL_AND_STROKE || this.a.w == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f;
    }

    private final boolean B(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.e != null && color2 != (colorForState2 = this.a.e.getColorForState(iArr, (color2 = (paint2 = this.u).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.f == null || color == (colorForState = this.a.f.getColorForState(iArr, (color = (paint = this.v).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean C() {
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        vbo vboVar = this.a;
        this.y = u(vboVar.h, vboVar.i, this.u, true);
        vbo vboVar2 = this.a;
        ColorStateList colorStateList = vboVar2.g;
        this.z = u(null, vboVar2.i, this.v, false);
        boolean z = this.a.v;
        return (Objects.equals(porterDuffColorFilter, this.y) && Objects.equals(porterDuffColorFilter2, this.z)) ? false : true;
    }

    private final float s(RectF rectF, vbw vbwVar, float[] fArr) {
        if (fArr == null) {
            if (vbwVar.e(rectF)) {
                return vbwVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (vau.a(fArr) && vbwVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private static int t(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter u(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iD;
        if (colorStateList == null || mode == null) {
            if (!z || (iD = d((color = paint.getColor()))) == color) {
                return null;
            }
            return new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private final RectF v() {
        RectF rectF = this.r;
        rectF.set(h());
        float fB = b();
        rectF.inset(fB, fB);
        return rectF;
    }

    private final void w(RectF rectF, Path path) {
        vbo vboVar = this.a;
        this.x.b(vboVar.a, this.h, vboVar.l, rectF, this.H, path);
        if (this.a.k != 1.0f) {
            Matrix matrix = this.n;
            matrix.reset();
            float f = this.a.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    private final void x(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(k, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.t != 0) {
            canvas.drawPath(this.o, this.w.e);
        }
        for (int i = 0; i < 4; i++) {
            vcf[] vcfVarArr = this.b;
            vbe vbeVar = this.w;
            vcf vcfVar = vcfVarArr[i];
            int i2 = this.a.s;
            Matrix matrix = vcf.c;
            vcfVar.a(matrix, vbeVar, i2, canvas);
            this.c[i].a(matrix, vbeVar, this.a.s, canvas);
        }
        if (this.B) {
            int iF = f();
            int iG = g();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.o, l);
            canvas.translate(iF, iG);
        }
    }

    private final void y(Canvas canvas, Paint paint, Path path, vbw vbwVar, float[] fArr, RectF rectF) {
        float fS = s(rectF, vbwVar, fArr);
        if (fS < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fS * this.a.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    private final void z(int[] iArr, boolean z) {
        boolean z2;
        RectF rectFH = h();
        if (this.a.b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.E == null);
        if (this.h == null) {
            this.h = new float[4];
        }
        vck vckVar = this.a.b;
        int iA = vckVar.a(iArr);
        if (iA < 0) {
            iA = vckVar.a(StateSet.WILD_CARD);
        }
        vbw vbwVar = vckVar.d[iA];
        for (int i = 0; i < 4; i++) {
            float fA = this.x.a(i, vbwVar).a(rectFH);
            if (z3) {
                this.h[i] = fA;
                z2 = true;
            } else {
                z2 = false;
            }
            aqn aqnVar = this.g[i];
            if (aqnVar != null) {
                aqnVar.d(fA);
                if (z2) {
                    aqn aqnVar2 = this.g[i];
                    if (aqnVar2.r.b <= 0.0d) {
                        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
                    }
                    if (!aqa.a().b()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (aqnVar2.l) {
                        aqnVar2.s = true;
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

    public final float a() {
        float fA;
        float fA2;
        float[] fArr = this.h;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFH = h();
            fA = (this.a.a.e.a(rectFH) + this.a.a.h.a(rectFH)) - this.a.a.g.a(rectFH);
            fA2 = this.x.a(0, this.a.a).a(rectFH);
        }
        return (fA - fA2) / 2.0f;
    }

    public final float b() {
        if (A()) {
            return this.v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        vbo vboVar = this.a;
        float f = vboVar.p;
        float f2 = vboVar.q;
        return f + 0.0f;
    }

    protected final int d(int i) {
        int i2;
        float fC = c();
        vbo vboVar = this.a;
        float f = fC + vboVar.o;
        uzy uzyVar = vboVar.c;
        if (uzyVar == null || !uzyVar.b || acr.f(i, 255) != uzyVar.e) {
            return i;
        }
        float fMin = (uzyVar.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iB = uzt.b(acr.f(i, 255), uzyVar.c, fMin);
        if (fMin > 0.0f && (i2 = uzyVar.d) != 0) {
            iB = acr.e(acr.f(i2, uzy.a), iB);
        }
        return acr.f(iB, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float[] fArr;
        int i;
        Paint paint;
        Paint paint2 = this.u;
        paint2.setColorFilter(this.y);
        int alpha = paint2.getAlpha();
        paint2.setAlpha(t(alpha, this.a.n));
        Paint paint3 = this.v;
        paint3.setColorFilter(this.z);
        paint3.setStrokeWidth(this.a.m);
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha(t(alpha2, this.a.n));
        if (this.a.w == Paint.Style.FILL_AND_STROKE || this.a.w == Paint.Style.FILL) {
            if (this.e) {
                w(h(), this.o);
                this.e = false;
            }
            vbo vboVar = this.a;
            int i2 = vboVar.r;
            if (vboVar.s > 0 && !vboVar.a.e(h()) && (((fArr = this.h) == null || !vau.a(fArr) || !this.a.a.d()) && !this.o.isConvex() && Build.VERSION.SDK_INT < 29)) {
                canvas.save();
                canvas.translate(f(), g());
                if (this.B) {
                    RectF rectF = this.A;
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
                    x(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    x(canvas);
                    canvas.restore();
                }
            }
            y(canvas, paint2, this.o, this.a.a, this.h, h());
        }
        if (A()) {
            if (this.f) {
                vbw vbwVar = this.a.a;
                vbm vbmVar = this.G;
                vbv vbvVar = new vbv(vbwVar);
                vbvVar.e = vbmVar.a(vbwVar.e);
                vbvVar.f = vbmVar.a(vbwVar.f);
                vbvVar.h = vbmVar.a(vbwVar.h);
                vbvVar.g = vbmVar.a(vbwVar.g);
                this.D = new vbw(vbvVar);
                if (this.h != null) {
                    if (this.F == null) {
                        this.F = new float[4];
                    }
                    float fB = b();
                    int i6 = 0;
                    while (true) {
                        float[] fArr2 = this.h;
                        int length = fArr2.length;
                        if (i6 >= 4) {
                            break;
                        }
                        this.F[i6] = Math.max(0.0f, fArr2[i6] - fB);
                        i6++;
                    }
                } else {
                    this.F = null;
                }
                this.x.b(this.D, this.F, this.a.l, v(), null, this.p);
                this.f = false;
            }
            paint = paint3;
            y(canvas, paint, this.p, this.D, this.F, v());
        } else {
            paint = paint3;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    @Override // defpackage.vch
    public final void e(vbw vbwVar) {
        vbo vboVar = this.a;
        vboVar.a = vbwVar;
        vboVar.b = null;
        this.h = null;
        this.F = null;
        invalidateSelf();
    }

    public final int f() {
        vbo vboVar = this.a;
        double d = vboVar.t;
        int i = vboVar.u;
        return (int) (d * Math.sin(Math.toRadians(0.0d)));
    }

    public final int g() {
        vbo vboVar = this.a;
        double d = vboVar.t;
        int i = vboVar.u;
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
        float fS = s(rectFH, this.a.a, this.h);
        if (fS >= 0.0f) {
            outline.setRoundRect(getBounds(), fS * this.a.l);
            return;
        }
        if (this.e) {
            w(rectFH, this.o);
            this.e = false;
        }
        Path path = this.o;
        if (Build.VERSION.SDK_INT >= 30) {
            uzw.a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                uzv.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            uzv.a(outline, path);
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
        Region region = this.s;
        region.set(getBounds());
        RectF rectFH = h();
        Path path = this.o;
        w(rectFH, path);
        Region region2 = this.t;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.q;
        rectF.set(getBounds());
        return rectF;
    }

    public final void i(Context context) {
        this.a.c = new uzy(context);
        q();
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
        vbo vboVar = this.a;
        ColorStateList colorStateList2 = vboVar.g;
        ColorStateList colorStateList3 = vboVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.a.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        vck vckVar = this.a.b;
        return vckVar != null && vckVar.a > 1;
    }

    public final void j(aqo aqoVar) {
        if (this.E == aqoVar) {
            return;
        }
        this.E = aqoVar;
        int i = 0;
        while (true) {
            aqn[] aqnVarArr = this.g;
            int length = aqnVarArr.length;
            if (i >= 4) {
                z(getState(), true);
                invalidateSelf();
                return;
            }
            if (aqnVarArr[i] == null) {
                aqnVarArr[i] = new aqn(this, m[i]);
            }
            aqn aqnVar = this.g[i];
            aqo aqoVar2 = new aqo();
            aqoVar2.b((float) aqoVar.b);
            double d = aqoVar.a;
            aqoVar2.c((float) (d * d));
            aqnVar.r = aqoVar2;
            i++;
        }
    }

    public final void k(float f) {
        vbo vboVar = this.a;
        if (vboVar.p != f) {
            vboVar.p = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        vbo vboVar = this.a;
        if (vboVar.e != colorStateList) {
            vboVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f) {
        vbo vboVar = this.a;
        if (vboVar.l != f) {
            vboVar.l = f;
            this.e = true;
            this.f = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new vbo(this.a);
        return this;
    }

    public final void n(vck vckVar) {
        vbo vboVar = this.a;
        if (vboVar.b != vckVar) {
            vboVar.b = vckVar;
            z(getState(), true);
            invalidateSelf();
        }
    }

    public final void o(ColorStateList colorStateList) {
        vbo vboVar = this.a;
        if (vboVar.f != colorStateList) {
            vboVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        this.f = true;
        super.onBoundsChange(rect);
        if (this.a.b != null && !rect.isEmpty()) {
            z(getState(), this.C);
        }
        this.C = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.a.b != null) {
            z(iArr, false);
        }
        boolean z = B(iArr) || C();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(float f) {
        this.a.m = f;
        invalidateSelf();
    }

    public final void q() {
        float fC = c();
        this.a.s = (int) Math.ceil(0.75f * fC);
        this.a.t = (int) Math.ceil(fC * 0.25f);
        C();
        super.invalidateSelf();
    }

    public final void r(float f) {
        p(f);
        o(ColorStateList.valueOf(0));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        vbo vboVar = this.a;
        if (vboVar.n != i) {
            vboVar.n = i;
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
        C();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        vbo vboVar = this.a;
        if (vboVar.i != mode) {
            vboVar.i = mode;
            C();
            super.invalidateSelf();
        }
    }

    protected vbq(vbo vboVar) {
        this.G = new vbm(this);
        this.b = new vcf[4];
        this.c = new vcf[4];
        this.d = new BitSet(8);
        this.n = new Matrix();
        this.o = new Path();
        this.p = new Path();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new Region();
        this.t = new Region();
        Paint paint = new Paint(1);
        this.u = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new vbe(null);
        this.x = Looper.getMainLooper().getThread() == Thread.currentThread() ? vbx.a : new vby();
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.g = new aqn[4];
        this.a = vboVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        C();
        B(getState());
        this.H = new vbn(this);
    }

    public vbq(vbw vbwVar) {
        this(new vbo(vbwVar));
    }
}
