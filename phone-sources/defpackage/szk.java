package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class szk extends Drawable implements tab {
    public static final /* synthetic */ int D = 0;
    private static final String a = "szk";
    private static final Paint b;
    private static final szj[] c;
    public float[] A;
    dhb[] B;
    public zft C;
    private szq E;
    private dhe F;
    private float[] G;
    private final zft H;
    private final zft I;
    private final Matrix d;
    private final Path e;
    private final Path f;
    private final RectF g;
    private final RectF h;
    private final Region i;
    private final Region j;
    private final Paint k;
    private final Paint l;
    private final sza m;
    private final szs n;
    private PorterDuffColorFilter o;
    private PorterDuffColorFilter p;
    private final RectF q;
    private boolean r;
    public szi s;
    public final szz[] t;
    public final szz[] u;
    public final BitSet v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;

    static {
        new szp().h(0.0f);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c = new szj[4];
        int i = 0;
        while (true) {
            szj[] szjVarArr = c;
            int length = szjVarArr.length;
            if (i >= 4) {
                return;
            }
            szjVarArr[i] = new szj(i);
            i++;
        }
    }

    public szk() {
        this(new szq());
    }

    public static szk E(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(sip.e(context, R.attr.colorSurface, "szk"));
        }
        szk szkVar = new szk();
        szkVar.J(context);
        szkVar.N(colorStateList);
        szkVar.M(f);
        return szkVar;
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = z(colorForState);
            }
            this.y = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iZ = z(color);
        this.y = iZ;
        if (iZ != color) {
            return new PorterDuffColorFilter(iZ, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private final RectF c() {
        RectF rectF = this.h;
        rectF.set(D());
        float fV = v();
        rectF.inset(fV, fV);
        return rectF;
    }

    private final void d(RectF rectF, Path path) {
        G(rectF, path);
        if (this.s.k != 1.0f) {
            Matrix matrix = this.d;
            matrix.reset();
            float f = this.s.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.q, true);
    }

    private final void e(Canvas canvas) {
        if (this.v.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.s.t != 0) {
            canvas.drawPath(this.e, this.m.e);
        }
        for (int i = 0; i < 4; i++) {
            szz[] szzVarArr = this.t;
            sza szaVar = this.m;
            szzVarArr[i].c(szaVar, this.s.s, canvas);
            this.u[i].c(szaVar, this.s.s, canvas);
        }
        if (this.z) {
            int iA = A();
            int iB = B();
            canvas.translate(-iA, -iB);
            canvas.drawPath(this.e, b);
            canvas.translate(iA, iB);
        }
    }

    private final void f(int[] iArr, boolean z) {
        szq szqVar;
        boolean z2;
        RectF rectFD = D();
        if (this.s.b == null || rectFD.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.F == null);
        if (this.A == null) {
            this.A = new float[4];
        }
        tae taeVar = this.s.b;
        int iA = taeVar.a(iArr);
        if (iA < 0) {
            iA = taeVar.a(StateSet.WILD_CARD);
        }
        Object obj = taeVar.e;
        if (obj == null && taeVar.f == null && taeVar.g == null && taeVar.h == null) {
            szqVar = ((szq[]) taeVar.d)[iA];
        } else {
            szp szpVar = new szp(((szq[]) taeVar.d)[iA]);
            if (obj != null) {
                szpVar.a = ((tac) obj).a(iArr);
            }
            Object obj2 = taeVar.f;
            if (obj2 != null) {
                szpVar.b = ((tac) obj2).a(iArr);
            }
            Object obj3 = taeVar.g;
            if (obj3 != null) {
                szpVar.d = ((tac) obj3).a(iArr);
            }
            Object obj4 = taeVar.h;
            if (obj4 != null) {
                szpVar.c = ((tac) obj4).a(iArr);
            }
            szqVar = new szq(szpVar);
        }
        for (int i = 0; i < 4; i++) {
            float fA = szs.b(i, szqVar).a(rectFD);
            if (z3) {
                this.A[i] = fA;
                z2 = true;
            } else {
                z2 = false;
            }
            dhb dhbVar = this.B[i];
            if (dhbVar != null) {
                dhbVar.d(fA);
                if (z2) {
                    this.B[i].e();
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    private final boolean g() {
        return (this.s.w == Paint.Style.FILL_AND_STROKE || this.s.w == Paint.Style.STROKE) && this.l.getStrokeWidth() > 0.0f;
    }

    private final boolean h(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.s.e != null && color2 != (colorForState2 = this.s.e.getColorForState(iArr, (color2 = (paint2 = this.k).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.s.f == null || color == (colorForState = this.s.f.getColorForState(iArr, (color = (paint = this.l).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean i() {
        PorterDuffColorFilter porterDuffColorFilter = this.o;
        PorterDuffColorFilter porterDuffColorFilter2 = this.p;
        szi sziVar = this.s;
        this.o = b(sziVar.h, sziVar.i, this.k, true);
        szi sziVar2 = this.s;
        ColorStateList colorStateList = sziVar2.g;
        this.p = b(null, sziVar2.i, this.l, false);
        boolean z = this.s.v;
        return (Objects.equals(porterDuffColorFilter, this.o) && Objects.equals(porterDuffColorFilter2, this.p)) ? false : true;
    }

    private static final float j(RectF rectF, szq szqVar, float[] fArr) {
        if (fArr == null) {
            if (szqVar.g(rectF)) {
                return szqVar.b.a(rectF);
            }
            return -1.0f;
        }
        if (sil.e(fArr) && szqVar.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int A() {
        szi sziVar = this.s;
        double d = sziVar.t;
        int i = sziVar.u;
        return (int) (d * Math.sin(Math.toRadians(0.0d)));
    }

    public final int B() {
        szi sziVar = this.s;
        double d = sziVar.t;
        int i = sziVar.u;
        return (int) (d * Math.cos(Math.toRadians(0.0d)));
    }

    public final ColorStateList C() {
        return this.s.e;
    }

    public final RectF D() {
        RectF rectF = this.g;
        rectF.set(getBounds());
        return rectF;
    }

    public final szq F() {
        return this.s.a;
    }

    protected final void G(RectF rectF, Path path) {
        szi sziVar = this.s;
        this.n.c(sziVar.a, this.A, sziVar.l, rectF, this.H, path);
    }

    public final void H(Canvas canvas, Paint paint, Path path, szq szqVar, float[] fArr, RectF rectF) {
        float fJ = j(rectF, szqVar, fArr);
        if (fJ < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fJ * this.s.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void I(Canvas canvas) {
        H(canvas, this.l, this.f, this.E, this.G, c());
    }

    public final void J(Context context) {
        this.s.c = new sst(context);
        W();
    }

    public final void K(float f) {
        p(this.s.a.e(f));
    }

    public final void L(dhe dheVar) {
        if (this.F == dheVar) {
            return;
        }
        this.F = dheVar;
        int i = 0;
        while (true) {
            dhb[] dhbVarArr = this.B;
            int length = dhbVarArr.length;
            if (i >= 4) {
                f(getState(), true);
                invalidateSelf();
                return;
            }
            if (dhbVarArr[i] == null) {
                dhbVarArr[i] = new dhb(this, c[i]);
            }
            dhb dhbVar = this.B[i];
            dhe dheVar2 = new dhe();
            dheVar2.c((float) dheVar.b);
            double d = dheVar.a;
            dheVar2.e((float) (d * d));
            dhbVar.r = dheVar2;
            i++;
        }
    }

    public final void M(float f) {
        szi sziVar = this.s;
        if (sziVar.p != f) {
            sziVar.p = f;
            W();
        }
    }

    public final void N(ColorStateList colorStateList) {
        szi sziVar = this.s;
        if (sziVar.e != colorStateList) {
            sziVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void O(float f) {
        szi sziVar = this.s;
        if (sziVar.l != f) {
            sziVar.l = f;
            this.w = true;
            this.x = true;
            invalidateSelf();
        }
    }

    public final void P(Paint.Style style) {
        this.s.w = style;
        super.invalidateSelf();
    }

    public final void Q(int i) {
        szi sziVar = this.s;
        if (sziVar.r != i) {
            sziVar.r = i;
            super.invalidateSelf();
        }
    }

    public final void R(tae taeVar) {
        szi sziVar = this.s;
        if (sziVar.b != taeVar) {
            sziVar.b = taeVar;
            f(getState(), true);
            invalidateSelf();
        }
    }

    public final void S(float f, int i) {
        V(f);
        U(ColorStateList.valueOf(i));
    }

    public final void T(float f, ColorStateList colorStateList) {
        V(f);
        U(colorStateList);
    }

    public final void U(ColorStateList colorStateList) {
        szi sziVar = this.s;
        if (sziVar.f != colorStateList) {
            sziVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void V(float f) {
        this.s.m = f;
        invalidateSelf();
    }

    public final void W() {
        float fY = y();
        this.s.s = (int) Math.ceil(0.75f * fY);
        this.s.t = (int) Math.ceil(fY * 0.25f);
        i();
        super.invalidateSelf();
    }

    public final boolean X() {
        if (this.s.a.g(D())) {
            return true;
        }
        float[] fArr = this.A;
        return fArr != null && sil.e(fArr) && this.s.a.f();
    }

    public final void Y() {
        this.m.a(-12303292);
        this.s.v = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Paint paint = this.k;
        paint.setColorFilter(this.o);
        int alpha = paint.getAlpha();
        paint.setAlpha(a(alpha, this.s.n));
        Paint paint2 = this.l;
        paint2.setColorFilter(this.p);
        paint2.setStrokeWidth(this.s.m);
        int alpha2 = paint2.getAlpha();
        paint2.setAlpha(a(alpha2, this.s.n));
        if (this.s.w == Paint.Style.FILL_AND_STROKE || this.s.w == Paint.Style.FILL) {
            if (this.w) {
                d(D(), this.e);
                this.w = false;
            }
            szi sziVar = this.s;
            int i2 = sziVar.r;
            if (i2 != 1 && sziVar.s > 0 && (i2 == 2 || (!X() && !this.e.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate(A(), B());
                if (this.z) {
                    RectF rectF = this.q;
                    float fWidth = rectF.width() - getBounds().width();
                    float fHeight = rectF.height() - getBounds().height();
                    int i3 = (int) fWidth;
                    if (i3 < 0 || (i = (int) fHeight) < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    int iWidth = (int) rectF.width();
                    int i4 = this.s.s;
                    int iHeight = (int) rectF.height();
                    int i5 = this.s.s;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth + i4 + i4 + i3, iHeight + i5 + i5 + i, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.s.s) - i3;
                    float f2 = (getBounds().top - this.s.s) - i;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            H(canvas, paint, this.e, this.s.a, this.A, D());
        }
        if (g()) {
            if (this.x) {
                szq szqVarF = F();
                zft zftVar = this.I;
                szp szpVar = new szp(szqVarF);
                szpVar.a = zftVar.l(szqVarF.b);
                szpVar.b = zftVar.l(szqVarF.c);
                szpVar.d = zftVar.l(szqVarF.e);
                szpVar.c = zftVar.l(szqVarF.d);
                this.E = new szq(szpVar);
                if (this.A != null) {
                    if (this.G == null) {
                        this.G = new float[4];
                    }
                    float fV = v();
                    int i6 = 0;
                    while (true) {
                        float[] fArr = this.A;
                        int length = fArr.length;
                        if (i6 >= 4) {
                            break;
                        }
                        this.G[i6] = Math.max(0.0f, fArr[i6] - fV);
                        i6++;
                    }
                } else {
                    this.G = null;
                }
                this.n.c(this.E, this.G, this.s.l, c(), null, this.f);
                this.x = false;
            }
            I(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.s.r == 2) {
            return;
        }
        RectF rectFD = D();
        if (rectFD.isEmpty()) {
            return;
        }
        float fJ = j(rectFD, this.s.a, this.A);
        if (fJ >= 0.0f) {
            outline.setRoundRect(getBounds(), fJ * this.s.l);
            return;
        }
        if (this.w) {
            d(rectFD, this.e);
            this.w = false;
        }
        ssr.f(outline, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.s.j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.i;
        region.set(getBounds());
        RectF rectFD = D();
        Path path = this.e;
        d(rectFD, path);
        Region region2 = this.j;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.w = true;
        this.x = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.s.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        szi sziVar = this.s;
        ColorStateList colorStateList2 = sziVar.g;
        ColorStateList colorStateList3 = sziVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.s.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        tae taeVar = this.s.b;
        return taeVar != null && taeVar.c();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.s = new szi(this.s);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.w = true;
        this.x = true;
        super.onBoundsChange(rect);
        if (this.s.b != null && !rect.isEmpty()) {
            f(getState(), this.r);
        }
        this.r = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.suu
    protected boolean onStateChange(int[] iArr) {
        if (this.s.b != null) {
            f(iArr, false);
        }
        boolean z = h(iArr) || i();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // defpackage.tab
    public final void p(szq szqVar) {
        szi sziVar = this.s;
        sziVar.a = szqVar;
        sziVar.b = null;
        this.A = null;
        this.G = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        szi sziVar = this.s;
        if (sziVar.n != i) {
            sziVar.n = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.s.d = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.s.h = colorStateList;
        i();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        szi sziVar = this.s;
        if (sziVar.i != mode) {
            sziVar.i = mode;
            i();
            super.invalidateSelf();
        }
    }

    public final float t() {
        float fA;
        float fA2;
        float[] fArr = this.A;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFD = D();
            fA = (F().b.a(rectFD) + F().e.a(rectFD)) - F().d.a(rectFD);
            fA2 = szs.b(0, F()).a(rectFD);
        }
        return (fA - fA2) / 2.0f;
    }

    public final float u() {
        return this.s.p;
    }

    public final float v() {
        if (g()) {
            return this.l.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float w() {
        float[] fArr = this.A;
        return fArr != null ? fArr[3] : this.s.a.b.a(D());
    }

    public final float x() {
        float[] fArr = this.A;
        return fArr != null ? fArr[0] : this.s.a.c.a(D());
    }

    public final float y() {
        float fU = u();
        float f = this.s.q;
        return fU + 0.0f;
    }

    protected final int z(int i) {
        float fY = y();
        szi sziVar = this.s;
        float f = fY + sziVar.o;
        sst sstVar = sziVar.c;
        return sstVar != null ? sstVar.b(i, f) : i;
    }

    public szk(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new szq(szq.c(context, attributeSet, i, i2)));
    }

    protected szk(szi sziVar) {
        szs szsVar;
        this.I = new zft(this, null);
        this.t = new szz[4];
        this.u = new szz[4];
        this.v = new BitSet(8);
        this.d = new Matrix();
        this.e = new Path();
        this.f = new Path();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new Region();
        this.j = new Region();
        Paint paint = new Paint(1);
        this.k = paint;
        Paint paint2 = new Paint(1);
        this.l = paint2;
        this.m = new sza();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            szsVar = szr.a;
        } else {
            szsVar = new szs();
        }
        this.n = szsVar;
        this.q = new RectF();
        this.z = true;
        this.r = true;
        this.B = new dhb[4];
        this.s = sziVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        i();
        h(getState());
        this.H = new zft(this, null);
    }

    public szk(szq szqVar) {
        this(new szi(szqVar));
    }
}
