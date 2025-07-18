package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phg extends ViewGroup {
    private final int[] A;
    private final Point B;
    private final int C;
    private final Shader D;
    private final Shader E;
    private final Shader F;
    private final Shader G;
    private final Shader H;
    private final Shader I;
    private final Shader J;
    private final float K;
    private final float L;
    private final float M;
    private final float N;
    private final float O;
    private final float P;
    private final float Q;
    private final float R;
    private final float S;
    private final float T;
    private final float U;
    private final float V;
    private final float W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    boolean b;
    public PopupWindow c;
    public boolean d;
    public View e;
    public View f;
    public float g;
    public int h;
    public int i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    private final Path l;
    private final RectF m;
    private final Paint n;
    private final Paint o;
    private final RectF p;
    private final RectF q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public phg(Context context) {
        super(context);
        this.a = new Rect();
        this.A = new int[2];
        this.B = new Point();
        this.ab = 3;
        this.g = 1.0f;
        this.h = 0;
        this.i = 0;
        this.ad = 1;
        setId(R.id.tooltip_view);
        setWillNotDraw(false);
        this.l = new Path();
        this.m = new RectF();
        Paint paint = new Paint();
        this.n = paint;
        this.p = new RectF();
        this.q = new RectF();
        Paint paint2 = new Paint(4);
        this.o = paint2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(phf.a);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, qtl.x(displayMetrics, 0));
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, qtl.x(displayMetrics, true != xfi.c() ? 8 : 2));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, qtl.x(displayMetrics, 16));
        this.t = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, qtl.x(displayMetrics, 24));
        this.w = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, qtl.x(displayMetrics, 4));
        this.C = dimensionPixelSize3;
        int iX = qtl.x(displayMetrics, 4);
        this.u = iX;
        int iX2 = qtl.x(displayMetrics, 4);
        this.v = iX2;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, qtl.x(displayMetrics, true != xfi.c() ? 24 : 8));
        this.x = dimensionPixelSize4;
        this.z = qtl.x(displayMetrics, 30);
        int color = typedArrayObtainStyledAttributes.getColor(2, -16033840);
        int color2 = typedArrayObtainStyledAttributes.getColor(6, 1075847200);
        this.y = color2;
        typedArrayObtainStyledAttributes.recycle();
        paint2.setStyle(Paint.Style.FILL);
        paint.setStyle(Paint.Style.FILL);
        b(color);
        int iG = csq.g(color2, 68);
        int iG2 = csq.g(color2, 20);
        int iG3 = csq.g(color2, 0);
        this.D = new LinearGradient(0.0f, 0.0f, 0.0f, dimensionPixelSize3, new int[]{iG, iG2, iG3}, (float[]) null, Shader.TileMode.CLAMP);
        this.E = new LinearGradient(0.0f, 0.0f, dimensionPixelSize3, 0.0f, new int[]{iG, iG2, iG3}, (float[]) null, Shader.TileMode.CLAMP);
        float f = dimensionPixelSize4 + dimensionPixelSize3;
        float f2 = f(f);
        this.F = new RadialGradient(f, f, f, new int[]{0, 0, iG, iG2, iG3}, new float[]{0.0f, f2, f2, e(f2), 1.0f}, Shader.TileMode.CLAMP);
        float f3 = dimensionPixelSize - iX;
        this.K = f3;
        float f4 = dimensionPixelSize2;
        float f5 = (f4 * f3) / (dimensionPixelSize + dimensionPixelSize);
        this.L = f5;
        float f6 = f4 - (f5 + f5);
        this.M = f6;
        float degrees = (float) Math.toDegrees(Math.atan(f3 / f5));
        this.N = degrees;
        float f7 = f5 * 0.15f;
        float fL = l((float) Math.hypot(f7 + f7, f3 * 0.15f), degrees);
        this.T = fL;
        float f8 = f(fL);
        this.G = new RadialGradient(fL, fL, fL, new int[]{0, iG3, iG2, iG}, new float[]{0.0f, f8, e(f8), 1.0f}, Shader.TileMode.CLAMP);
        float fL2 = l(f6, degrees + degrees) + dimensionPixelSize3;
        this.U = fL2;
        float f9 = f(fL2);
        this.H = new RadialGradient(fL2, fL2, fL2, new int[]{0, 0, iG, iG2, iG3}, new float[]{0.0f, f9, f9, e(f9), 1.0f}, Shader.TileMode.CLAMP);
        float f10 = dimensionPixelSize - iX2;
        this.O = f10;
        float f11 = dimensionPixelSize2;
        float f12 = dimensionPixelSize;
        float f13 = ((f12 - f10) * f11) / f12;
        this.P = f13;
        float f14 = f11 - f13;
        this.R = f14;
        float degrees2 = (float) Math.toDegrees(Math.atan(f10 / f14));
        this.S = degrees2;
        float f15 = f14 * 0.05f;
        float fL3 = l((float) Math.hypot(f15 + f15, f10 * 0.05f), degrees2);
        this.V = fL3;
        float f16 = f(fL3);
        this.I = new RadialGradient(fL3, fL3, fL3, new int[]{0, iG3, iG2, iG}, new float[]{0.0f, f16, e(f16), 1.0f}, Shader.TileMode.CLAMP);
        float f17 = dimensionPixelSize;
        float f18 = dimensionPixelSize2 * ((f17 - (f17 - (0.7f * iX2))) / f17);
        this.Q = f18;
        float fL4 = l((float) Math.hypot(f18, r5 * 0.3f), degrees2 + 90.0f) + dimensionPixelSize3;
        this.W = fL4;
        float f19 = f(fL4);
        this.J = new RadialGradient(fL4, fL4, fL4, new int[]{0, 0, iG, iG2, iG3}, new float[]{0.0f, f19, f19, e(f19), 1.0f}, Shader.TileMode.CLAMP);
        this.d = true;
    }

    private static float e(float f) {
        return f + ((1.0f - f) / 2.0f);
    }

    private final float f(float f) {
        return 1.0f - (this.C / f);
    }

    private final int g() {
        int iWidth;
        int i = this.ac;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            int i3 = this.w / 2;
            int i4 = this.s;
            iWidth = i3 + i4 + i4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException();
            }
            iWidth = this.a.width() / 2;
        }
        int[] iArr = cww.a;
        if (getLayoutDirection() == 1) {
            iWidth = this.a.width() - iWidth;
        }
        return iWidth + this.a.left;
    }

    private final int h() {
        return (int) (this.h + this.m.width());
    }

    private static int i(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final void j(Canvas canvas, int i) {
        if (i != 0) {
            canvas.save();
            RectF rectF = this.p;
            canvas.rotate(i, rectF.centerX(), rectF.centerY());
        }
        canvas.drawRect(this.p, this.o);
        if (i != 0) {
            canvas.restore();
        }
    }

    private final void k(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private static final float l(float f, float f2) {
        return (float) ((f / 2.0f) / Math.sin(Math.toRadians(f2 / 2.0f)));
    }

    public final void a(Rect rect) {
        this.a.set(rect);
    }

    public final void b(int i) {
        this.n.setColor(i);
    }

    public final void c() {
        int iHeight;
        int iWidth;
        Point point = this.B;
        k(point);
        int i = point.x;
        int i2 = point.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.ad = 1;
        int i3 = this.ab;
        if (i3 == 1) {
            iHeight = (-measuredHeight) - this.s;
        } else if (i3 == 2) {
            iHeight = this.a.height() + this.s;
        } else {
            iHeight = 0;
        }
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        Rect rect = this.a;
        int i4 = rect.top + iHeight;
        int i5 = this.ac;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 0) {
            iWidth = layoutDirection == 1 ? (rect.left + rect.width()) - measuredWidth : rect.left;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException();
            }
            iWidth = rect.left + ((rect.width() - measuredWidth) / 2);
        }
        int i7 = this.s;
        this.h = i(iWidth, i7, (i - i7) - measuredWidth);
        this.i = i(i4, i7, (i2 - i7) - measuredHeight);
        int iG = g();
        int i8 = this.w / 2;
        int i9 = iG - i8;
        int i10 = i8 + iG;
        int i11 = this.h;
        int i12 = i9 - i11;
        int i13 = this.C;
        int i14 = i11 + measuredWidth;
        int i15 = this.z;
        if (i12 + i13 < i15) {
            this.h = iG - i13;
            this.ad = 2;
        } else if ((i14 + i13) - i10 < i15) {
            this.h = (iG - measuredWidth) - i13;
            this.ad = 3;
        }
    }

    public final void d(View view, Rect rect, int i, int i2) {
        this.f = view;
        a(rect);
        this.aa = i;
        this.ab = 3;
        this.ac = i2;
        this.b = true;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        RectF rectF;
        float f;
        RectF rectF2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float fSin;
        float f9;
        float f10;
        canvas.save();
        Paint paint = this.o;
        paint.setShader(this.F);
        int i = this.C;
        int i2 = this.x;
        float f11 = i + i2;
        float f12 = f11 + f11;
        RectF rectF3 = this.p;
        float f13 = 0.0f;
        rectF3.set(0.0f, 0.0f, f12, f12);
        canvas.save();
        if (this.ab == 2) {
            canvas.translate(0.0f, this.t);
        }
        boolean z = this.ab == 1;
        int i3 = this.ad;
        boolean z2 = i3 == 2;
        boolean z3 = i3 == 3;
        if (z || !z2) {
            rectF = rectF3;
            canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        } else {
            rectF = rectF3;
        }
        RectF rectF4 = this.m;
        float f14 = i2 + i2;
        canvas.translate(rectF4.width() - f14, 0.0f);
        if (z || !z3) {
            f = f14;
            rectF2 = rectF4;
            canvas.drawArc(rectF, 270.0f, 90.0f, true, paint);
        } else {
            rectF2 = rectF4;
            f = f14;
        }
        canvas.translate(0.0f, rectF2.height() - f);
        if (!z || !z3) {
            canvas.drawArc(rectF, 0.0f, 90.0f, true, paint);
        }
        canvas.translate(-(rectF2.width() - f), 0.0f);
        if (!z || !z2) {
            canvas.drawArc(rectF, 90.0f, 90.0f, true, paint);
        }
        RectF rectF5 = rectF;
        canvas.restore();
        Shader shader = this.D;
        paint.setShader(shader);
        float f15 = i;
        rectF5.set(0.0f, 0.0f, rectF2.width() - f, f15);
        canvas.save();
        if (this.ab == 2) {
            canvas.translate(0.0f, this.t);
        }
        if (this.ab != 2) {
            canvas.save();
            canvas.translate(f11, 0.0f);
            j(canvas, 180);
            canvas.restore();
        }
        if (this.ab != 1) {
            canvas.save();
            canvas.translate(f11, rectF2.height() + f15);
            j(canvas, 0);
            canvas.restore();
        }
        Shader shader2 = this.E;
        paint.setShader(shader2);
        rectF5.set(0.0f, 0.0f, f15, rectF2.height() - f);
        canvas.save();
        canvas.translate(0.0f, f11);
        j(canvas, 180);
        canvas.translate(rectF2.width() + f15, 0.0f);
        j(canvas, 0);
        canvas.restore();
        canvas.restore();
        int i4 = this.ad;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        float f16 = i2;
        if (i5 == 0) {
            f2 = f15;
            f3 = f16;
            int i6 = 0;
            int i7 = this.ab;
            float fG = g();
            canvas.save();
            boolean z4 = i7 == 1;
            canvas.translate(f11, z4 ? rectF2.height() + f2 : this.t);
            int i8 = this.w;
            float f17 = this.L;
            float f18 = i8 / 2.0f;
            float f19 = f17 * 0.15f;
            rectF5.set(0.0f, 0.0f, ((((fG - this.h) - f2) - f18) - f3) - f19, f2);
            paint.setShader(shader);
            if (true != z4) {
                i6 = 180;
            }
            j(canvas, i6);
            float fWidth = rectF5.width();
            float f20 = this.T;
            float f21 = fWidth - f20;
            if (z4) {
                f4 = 0.0f;
            } else {
                float f22 = -f20;
                f4 = f22 + f22 + f2;
            }
            canvas.translate(f21, f4);
            Shader shader3 = this.G;
            paint.setShader(shader3);
            int i9 = i6;
            RectF rectF6 = this.q;
            float f23 = f20 + f20;
            rectF6.set(0.0f, 0.0f, f23, f23);
            float f24 = z4 ? 270.0f : 90.0f - this.N;
            float f25 = this.N;
            float f26 = 90.0f - f25;
            boolean z5 = z4;
            canvas.drawArc(rectF6, f24, f25, true, paint);
            if (!z5) {
                canvas.translate(0.0f, f23);
            }
            int i10 = i7 == 1 ? 1 : -1;
            float f27 = this.K;
            float f28 = i10;
            canvas.translate(f19 + f19 + f20, f28 * f27 * 0.15f);
            float f29 = f28 * f25;
            canvas.rotate(f29);
            if (z5) {
                f5 = f29;
            } else {
                f5 = f29;
                canvas.translate(0.0f, -i);
            }
            float f30 = f17 * 0.85f;
            float f31 = 0.85f * f27;
            rectF5.right = (float) Math.hypot(f30, f31);
            paint.setShader(shader);
            j(canvas, i9);
            if (!z5) {
                canvas.translate(0.0f, f2);
            }
            float f32 = this.U;
            float f33 = f32 - f2;
            float f34 = this.M;
            float f35 = f34 / 2.0f;
            if (z5) {
                f7 = f34;
                f8 = f35;
                f6 = f32;
                fSin = f6 + ((float) (Math.sin(Math.toRadians(f26)) * f33));
            } else {
                f6 = f32;
                f7 = f34;
                f8 = f35;
                fSin = f6 - ((float) (Math.sin(Math.toRadians(f26)) * f33));
            }
            float f36 = fSin;
            float f37 = f6 - f8;
            float f38 = f28 * (-f25);
            canvas.rotate(f38);
            canvas.translate(f30 - f37, z5 ? f31 - f36 : (-f31) - f36);
            paint.setShader(this.H);
            float f39 = f6 + f6;
            rectF6.set(0.0f, 0.0f, f39, f39);
            int i11 = true != z5 ? 270 : 90;
            float f40 = f5;
            canvas.drawArc(rectF6, i11 - f25, f25 + f25, true, paint);
            canvas.translate(f7 + f37, f36);
            canvas.rotate(f38);
            if (z5) {
                f9 = 0.0f;
            } else {
                f9 = 0.0f;
                canvas.translate(0.0f, -i);
            }
            paint.setShader(shader);
            j(canvas, i9);
            if (!z5) {
                canvas.translate(f9, f2);
            }
            canvas.rotate(f40);
            canvas.translate((f17 * 1.15f) - f20, f28 * (-f27));
            if (z5) {
                f10 = 0.0f;
            } else {
                float f41 = -f20;
                f10 = 0.0f;
                canvas.translate(0.0f, f41 + f41);
            }
            paint.setShader(shader3);
            rectF6.set(f10, f10, f23, f23);
            canvas.drawArc(rectF6, z5 ? 270.0f - f25 : 90.0f, f25, true, paint);
            rectF5.right = (((rectF2.width() - f3) - ((fG - this.h) - f2)) - f18) - f19;
            canvas.translate(f20, z5 ? 0.0f : f23 - f2);
            paint.setShader(shader);
            canvas.save();
            j(canvas, i9);
            canvas.restore();
            canvas.restore();
        } else if (i5 == 1) {
            int i12 = 0;
            f2 = f15;
            f3 = f16;
            int i13 = this.ab;
            int i14 = this.h;
            canvas.save();
            int i15 = (i14 - this.h) + i;
            int i16 = this.w;
            float f42 = this.R;
            boolean z6 = i13 == 1;
            float f43 = f42 * 0.05f;
            canvas.translate(i15 + i16 + f43, z6 ? rectF2.height() + f2 : this.t);
            rectF5.set(0.0f, 0.0f, ((rectF2.width() - i16) - f3) - f43, f2);
            paint.setShader(shader);
            if (true != z6) {
                i12 = 180;
            }
            j(canvas, i12);
            float f44 = this.V;
            float f45 = -f44;
            canvas.translate(f45, z6 ? 0.0f : f45 + f45 + f2);
            paint.setShader(this.I);
            int i17 = i12;
            RectF rectF7 = this.q;
            float f46 = f44 + f44;
            rectF7.set(0.0f, 0.0f, f46, f46);
            float f47 = z6 ? 270.0f - this.S : 90.0f;
            float f48 = this.S;
            canvas.drawArc(rectF7, f47, f48, true, paint);
            if (!z6) {
                canvas.translate(0.0f, f46);
            }
            int i18 = i13 == 1 ? 1 : -1;
            float f49 = this.P;
            float f50 = this.O;
            float f51 = i18;
            float f52 = f51 * f50 * 0.05f;
            float f53 = f44 - (f43 + f43);
            float f54 = (0.95f * f50) + (this.v * 0.3f);
            float f55 = (f42 * 0.95f) + (f49 * 0.3f);
            int i19 = i18;
            canvas.translate(f53 - f55, f52 + (f51 * f54));
            canvas.rotate((-f48) * f51);
            if (!z6) {
                canvas.translate(0.0f, -i);
            }
            rectF5.right = (float) Math.hypot(f55, f54);
            paint.setShader(shader);
            j(canvas, i17);
            if (!z6) {
                canvas.translate(0.0f, f2);
            }
            float f56 = this.W;
            double d = 90.0f - f48;
            double d2 = f56 - f2;
            double dCos = Math.cos(Math.toRadians(d)) * d2;
            float fSin2 = z6 ? ((float) (Math.sin(Math.toRadians(d)) * d2)) + f56 : f56 - ((float) (Math.sin(Math.toRadians(d)) * d2));
            canvas.rotate(f51 * f48);
            float f57 = f56 + f56;
            float f58 = (float) (f56 - dCos);
            canvas.translate(f58 - f57, -fSin2);
            float f59 = f48 + 90.0f;
            paint.setShader(this.J);
            rectF7.set(0.0f, 0.0f, f57, f57);
            canvas.drawArc(rectF7, 180.0f - (true != z6 ? 0.0f : f59), f59, true, paint);
            canvas.translate(((f57 - f58) - this.Q) - f2, fSin2 - ((i19 * r5) * 0.3f));
            rectF5.set(0.0f, 0.0f, f2, f50 + f3);
            if (z6) {
                canvas.translate(0.0f, -rectF5.height());
            }
            paint.setShader(shader2);
            j(canvas, 180);
            canvas.restore();
        } else if (i5 != 2) {
            f2 = f15;
            f3 = f16;
        } else {
            int i20 = this.ab;
            int iH = h();
            canvas.save();
            boolean z7 = i20 == 1;
            canvas.translate(f11, z7 ? f15 + rectF2.height() : this.t);
            int i21 = iH - this.h;
            int i22 = this.w;
            float f60 = this.R;
            float f61 = (i21 - i22) - i2;
            float f62 = f60 * 0.05f;
            rectF5.set(0.0f, 0.0f, f61 - f62, f15);
            paint.setShader(shader);
            int i23 = true != z7 ? 180 : 0;
            j(canvas, i23);
            float fWidth2 = rectF5.width();
            float f63 = this.V;
            float f64 = fWidth2 - f63;
            if (!z7) {
                float f65 = -f63;
                f13 = f65 + f65 + f15;
            }
            canvas.translate(f64, f13);
            paint.setShader(this.I);
            RectF rectF8 = this.q;
            float f66 = f63 + f63;
            rectF8.set(0.0f, 0.0f, f66, f66);
            float f67 = z7 ? 270.0f : 90.0f - this.S;
            float f68 = this.S;
            f2 = f15;
            f3 = f16;
            boolean z8 = z7;
            canvas.drawArc(rectF8, f67, f68, true, paint);
            if (!z8) {
                canvas.translate(0.0f, f66);
            }
            int i24 = i20 == 1 ? 1 : -1;
            float f69 = this.O;
            float f70 = i24;
            canvas.translate(f62 + f62 + f63, f70 * f69 * 0.05f);
            canvas.rotate(f70 * f68);
            if (!z8) {
                canvas.translate(0.0f, -i);
            }
            float f71 = this.P;
            float f72 = (0.95f * f69) + (this.v * 0.3f);
            float f73 = (f60 * 0.95f) + (f71 * 0.3f);
            int i25 = i24;
            rectF5.right = (float) Math.hypot(f73, f72);
            paint.setShader(shader);
            j(canvas, i23);
            if (!z8) {
                canvas.translate(0.0f, f2);
            }
            float f74 = this.W;
            double d3 = 90.0f - f68;
            double dCos2 = Math.cos(Math.toRadians(d3));
            double d4 = f74 - f2;
            double d5 = dCos2 * d4;
            float fSin3 = z8 ? ((float) (d4 * Math.sin(Math.toRadians(d3)))) + f74 : f74 - ((float) (d4 * Math.sin(Math.toRadians(d3))));
            canvas.rotate((-f68) * f70);
            float f75 = (float) (f74 - d5);
            canvas.translate(f73 - f75, (f72 * f70) - fSin3);
            float f76 = f68 + 90.0f;
            paint.setShader(this.J);
            float f77 = f74 + f74;
            rectF8.set(0.0f, 0.0f, f77, f77);
            canvas.drawArc(rectF8, z8 ? 0.0f : 270.0f - f68, f76, true, paint);
            canvas.translate(f75 + this.Q, fSin3 - ((i25 * r11) * 0.3f));
            rectF5.set(0.0f, 0.0f, f2, f69 + f3);
            if (z8) {
                canvas.translate(0.0f, -rectF5.height());
            }
            paint.setShader(shader2);
            j(canvas, 0);
            canvas.restore();
        }
        canvas.translate(f2, f2);
        canvas.save();
        canvas.translate(this.s - this.h, 0.0f);
        Path path = this.l;
        Paint paint2 = this.n;
        canvas.drawPath(path, paint2);
        canvas.restore();
        float f78 = f3;
        canvas.drawRoundRect(rectF2, f78, f78, paint2);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.e;
        int i6 = this.ab;
        if (i6 == 2) {
            i5 = this.t;
            i6 = 2;
        } else {
            i5 = 0;
        }
        int i7 = this.r;
        int i8 = this.C;
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i6 == 1 ? this.t : 0;
        int i12 = i8 + i7;
        view.layout(i12, i5 + i12, i9 - i7, (i10 - i7) - i11);
        c();
        this.c.update(this.h, this.i, getMeasuredWidth(), getMeasuredHeight(), true);
        int i13 = this.ad;
        if (i13 == 1) {
            int iG = g();
            Path path = this.l;
            path.reset();
            int i14 = this.ab;
            if (i14 == 1) {
                int i15 = iG - this.s;
                int i16 = this.w;
                path.moveTo((i15 - i8) - (i16 / 2), this.m.bottom);
                path.rLineTo(i16, 0.0f);
                float f = -this.L;
                float f2 = this.K;
                path.rLineTo(f, f2);
                float f3 = this.M;
                float f4 = -f3;
                path.rQuadTo(f4 / 2.0f, f3 / 2.0f, f4, 0.0f);
                path.rLineTo(f, -f2);
                path.close();
                return;
            }
            if (i14 == 2) {
                int i17 = iG - this.s;
                int i18 = this.w;
                path.moveTo((i17 - i8) + (i18 / 2), this.m.top);
                path.rLineTo(-i18, 0.0f);
                float f5 = this.L;
                float f6 = this.K;
                path.rLineTo(f5, -f6);
                float f7 = this.M;
                path.rQuadTo(f7 / 2.0f, (-f7) / 2.0f, f7, 0.0f);
                path.rLineTo(f5, f6);
                path.close();
                return;
            }
            return;
        }
        if (i13 == 3) {
            int iH = h();
            Path path2 = this.l;
            path2.reset();
            int i19 = this.ab;
            if (i19 == 1) {
                int i20 = iH - this.s;
                int i21 = this.w;
                RectF rectF = this.m;
                float f8 = this.x;
                path2.moveTo(i20 - i21, rectF.bottom - f8);
                path2.rLineTo(i21, 0.0f);
                float f9 = this.O;
                path2.rLineTo(0.0f, f8 + f9);
                float f10 = -this.P;
                path2.rQuadTo(f10 / 10.0f, this.v, f10, 0.0f);
                path2.rLineTo(-this.R, -f9);
                path2.close();
                return;
            }
            if (i19 == 2) {
                int i22 = iH - this.s;
                int i23 = this.w;
                RectF rectF2 = this.m;
                float f11 = this.x;
                path2.moveTo(i22 - i23, rectF2.top + f11);
                path2.rLineTo(i23, 0.0f);
                float f12 = this.O;
                path2.rLineTo(0.0f, -(f11 + f12));
                float f13 = -this.P;
                path2.rQuadTo(f13 / 10.0f, -this.v, f13, 0.0f);
                path2.rLineTo(-this.R, f12);
                path2.close();
                return;
            }
            return;
        }
        if (i13 == 2) {
            int i24 = this.h;
            Path path3 = this.l;
            path3.reset();
            int i25 = this.ab;
            if (i25 == 1) {
                int i26 = i24 - this.s;
                int i27 = this.w;
                RectF rectF3 = this.m;
                float f14 = this.x;
                path3.moveTo(i26 + i27, rectF3.bottom - f14);
                path3.rLineTo(-i27, 0.0f);
                float f15 = this.O;
                path3.rLineTo(0.0f, f14 + f15);
                float f16 = this.P;
                path3.rQuadTo(f16 / 10.0f, this.v, f16, 0.0f);
                path3.rLineTo(this.R, -f15);
                path3.close();
                return;
            }
            if (i25 == 2) {
                int i28 = i24 - this.s;
                int i29 = this.w;
                RectF rectF4 = this.m;
                float f17 = this.x;
                path3.moveTo(i28 + i29, rectF4.top + f17);
                path3.rLineTo(-i29, 0.0f);
                float f18 = this.O;
                path3.rLineTo(0.0f, -(f17 + f18));
                float f19 = this.P;
                path3.rQuadTo(f19 / 10.0f, -this.v, f19, 0.0f);
                path3.rLineTo(this.R, f18);
                path3.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phg.onMeasure(int, int):void");
    }
}
