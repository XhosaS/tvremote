package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sub {
    private ColorStateList B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private Typeface I;
    private Typeface J;
    private Typeface K;
    private Typeface L;
    private Typeface M;
    private Typeface N;
    private Typeface O;
    private syd P;
    private syd Q;
    private CharSequence R;
    private float T;
    private float U;
    private float V;
    private float W;
    private float X;
    private int Y;
    private int Z;
    public float a;
    private int[] aa;
    private boolean ab;
    private final TextPaint ac;
    private TimeInterpolator ad;
    private TimeInterpolator ae;
    private float af;
    private float ag;
    private float ah;
    private ColorStateList ai;
    private float aj;
    private float ak;
    private float al;
    private ColorStateList am;
    private float an;
    private float ao;
    private float ap;
    private float aq;
    private CharSequence ar;
    private boolean as;
    public boolean b;
    public float c;
    public int d;
    public final Rect e;
    public ColorStateList h;
    public int i;
    public CharSequence k;
    public boolean l;
    public final TextPaint m;
    public float n;
    public StaticLayout o;
    public float p;
    private final View u;
    private float v;
    private final Rect w;
    private Rect x;
    private final RectF y;
    private int z = 16;
    private int A = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    public TextUtils.TruncateAt j = TextUtils.TruncateAt.END;
    private boolean S = true;
    public int q = 1;
    public int r = 1;
    public int s = -1;
    public int t = -1;

    public sub(View view) {
        this.u = view;
        TextPaint textPaint = new TextPaint(129);
        this.ac = textPaint;
        this.m = new TextPaint(textPaint);
        this.e = new Rect();
        this.w = new Rect();
        this.y = new RectF();
        this.c = M();
        k(view.getContext().getResources().getConfiguration());
    }

    private final float M() {
        float f = this.v;
        return f + ((1.0f - f) * 0.5f);
    }

    private static float N(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = sns.a;
        return f + (f3 * (f2 - f));
    }

    private static int O(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int P(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.aa;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void Q() {
        float f;
        float f2 = this.a;
        if (this.b) {
            this.y.set(f2 < this.c ? this.w : this.e);
        } else {
            RectF rectF = this.y;
            float f3 = this.w.left;
            Rect rect = this.e;
            rectF.left = N(f3, rect.left, f2, this.ad);
            rectF.top = N(this.C, this.D, f2, this.ad);
            rectF.right = N(r2.right, rect.right, f2, this.ad);
            rectF.bottom = N(r2.bottom, rect.bottom, f2, this.ad);
        }
        if (!this.b) {
            this.G = N(this.E, this.F, f2, this.ad);
            this.H = N(this.C, this.D, f2, this.ad);
            S(f2);
            f = f2;
        } else if (f2 < this.c) {
            this.G = this.E;
            this.H = this.C;
            S(0.0f);
            f = 0.0f;
        } else {
            this.G = this.F;
            this.H = this.D - Math.max(0, this.d);
            S(1.0f);
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator = sns.b;
        this.ap = 1.0f - N(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.u;
        view.postInvalidateOnAnimation();
        this.aq = N(1.0f, 0.0f, f2, timeInterpolator);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.h;
        ColorStateList colorStateList2 = this.B;
        if (colorStateList != colorStateList2) {
            this.ac.setColor(O(P(colorStateList2), f(), f));
        } else {
            this.ac.setColor(f());
        }
        float f4 = this.an;
        float f5 = this.n;
        if (f4 != f5) {
            this.ac.setLetterSpacing(N(f5, f4, f2, timeInterpolator));
        } else {
            this.ac.setLetterSpacing(f4);
        }
        this.V = N(this.aj, this.af, f2, null);
        this.W = N(this.ak, this.ag, f2, null);
        this.X = N(this.al, this.ah, f2, null);
        int iO = O(P(this.am), P(this.ai), f2);
        this.Y = iO;
        TextPaint textPaint = this.ac;
        textPaint.setShadowLayer(this.V, this.W, this.X, iO);
        if (this.b) {
            int alpha = textPaint.getAlpha();
            float f6 = this.c;
            textPaint.setAlpha((int) ((f2 <= f6 ? sns.a(1.0f, 0.0f, this.v, f6, f2) : sns.a(0.0f, 1.0f, f6, 1.0f, f2)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint.setShadowLayer(this.V, this.W, this.X, sip.b(this.Y, textPaint.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    private final void R(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        if (this.k == null) {
            return;
        }
        float fWidth = this.e.width();
        float fWidth2 = this.w.width();
        if (T(f, 1.0f)) {
            f2 = K() ? this.g : this.f;
            f3 = K() ? this.an : this.n;
            this.T = K() ? 1.0f : N(this.f, this.g, f, this.ae) / this.f;
            if (true != K()) {
                fWidth = fWidth2;
            }
            typeface = this.I;
            fWidth2 = fWidth;
        } else {
            float f4 = this.f;
            float f5 = this.n;
            typeface = this.L;
            if (T(f, 0.0f)) {
                this.T = 1.0f;
            } else {
                this.T = N(this.f, this.g, f, this.ae) / this.f;
            }
            float f6 = this.g / this.f;
            float f7 = fWidth2 * f6;
            if (!z && !this.b && f7 > fWidth && K()) {
                fWidth2 = Math.min(fWidth / f6, fWidth2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.q : this.r;
        if (fWidth2 > 0.0f) {
            float f8 = this.U;
            float f9 = this.ao;
            Typeface typeface2 = this.O;
            StaticLayout staticLayout = this.o;
            boolean z2 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.Z == i && !this.ab) ? false : true;
            this.U = f2;
            this.ao = f3;
            this.O = typeface;
            this.ab = false;
            this.Z = i;
            this.ac.setLinearText(this.T != 1.0f);
            z = z2;
        }
        if (this.R == null || z) {
            TextPaint textPaint = this.ac;
            textPaint.setTextSize(this.U);
            textPaint.setTypeface(this.O);
            textPaint.setLetterSpacing(this.ao);
            boolean zG = G(this.k);
            this.l = zG;
            StaticLayout staticLayoutG = g(true != V() ? 1 : i, textPaint, this.k, fWidth2 * (K() ? 1.0f : this.T), zG);
            this.o = staticLayoutG;
            this.R = staticLayoutG.getText();
        }
    }

    private final void S(float f) {
        R(f, false);
        this.u.postInvalidateOnAnimation();
    }

    private static boolean T(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private static boolean U(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean V() {
        if (this.q > 1 || this.r > 1) {
            return !this.l || this.b;
        }
        return false;
    }

    private static final float W(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void A(float f) {
        if (this.f != f) {
            this.f = f;
            l();
        }
    }

    public final void B(float f) {
        float fK = cmq.k(f, 0.0f, 1.0f);
        if (fK != this.a) {
            this.a = fK;
            Q();
        }
    }

    public final void C(float f) {
        this.v = f;
        this.c = M();
    }

    public final void D(TimeInterpolator timeInterpolator) {
        this.ad = timeInterpolator;
        l();
    }

    public final void E(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.k, charSequence)) {
            this.k = charSequence;
            this.R = null;
            l();
        }
    }

    public final void F(TimeInterpolator timeInterpolator) {
        this.ae = timeInterpolator;
        l();
    }

    public final boolean G(CharSequence charSequence) {
        int layoutDirection = this.u.getLayoutDirection();
        boolean z = this.S;
        boolean z2 = layoutDirection == 1;
        if (z) {
            return (z2 ? cug.d : cug.c).l(charSequence, charSequence.length());
        }
        return z2;
    }

    public final boolean H(Typeface typeface) {
        syd sydVar = this.Q;
        if (sydVar != null) {
            sydVar.c();
        }
        if (this.K == typeface) {
            return false;
        }
        this.K = typeface;
        Typeface typefaceD = sin.d(this.u.getContext().getResources().getConfiguration(), typeface);
        this.J = typefaceD;
        if (typefaceD == null) {
            typefaceD = this.K;
        }
        this.I = typefaceD;
        return true;
    }

    public final boolean I(Typeface typeface) {
        syd sydVar = this.P;
        if (sydVar != null) {
            sydVar.c();
        }
        if (this.N == typeface) {
            return false;
        }
        this.N = typeface;
        Typeface typefaceD = sin.d(this.u.getContext().getResources().getConfiguration(), typeface);
        this.M = typefaceD;
        if (typefaceD == null) {
            typefaceD = this.N;
        }
        this.L = typefaceD;
        return true;
    }

    public final boolean J(int[] iArr) {
        ColorStateList colorStateList;
        this.aa = iArr;
        ColorStateList colorStateList2 = this.h;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.B) == null || !colorStateList.isStateful())) {
            return false;
        }
        l();
        return true;
    }

    public final boolean K() {
        return this.r == 1;
    }

    public final void L() {
        this.S = false;
    }

    public final float a() {
        TextPaint textPaint = this.m;
        i(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float b() {
        TextPaint textPaint = this.m;
        i(textPaint);
        return -textPaint.ascent();
    }

    public final float c() {
        int i = this.s;
        return i != -1 ? i : b();
    }

    public final float d() {
        TextPaint textPaint = this.m;
        j(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float e() {
        TextPaint textPaint = this.m;
        j(textPaint);
        return -textPaint.ascent();
    }

    public final int f() {
        return P(this.h);
    }

    public final StaticLayout g(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        int i2;
        Layout.Alignment alignment2;
        StaticLayout staticLayoutA = null;
        try {
            if (i == 1) {
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                i2 = 1;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.l ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    if (this.l) {
                    }
                }
                Layout.Alignment alignment3 = alignment;
                i2 = i;
                alignment2 = alignment3;
            }
            sus susVar = new sus(charSequence, textPaint, (int) f);
            susVar.f = this.j;
            susVar.e = z;
            susVar.a = alignment2;
            susVar.d = false;
            susVar.b = i2;
            susVar.b(0.0f, 1.0f);
            susVar.c = 1;
            susVar.g = null;
            staticLayoutA = susVar.a();
        } catch (sur e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final void h(Canvas canvas) {
        int iSave = canvas.save();
        if (this.R != null) {
            RectF rectF = this.y;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.ac;
            textPaint.setTextSize(this.U);
            float f = this.G;
            float f2 = this.H;
            float f3 = this.T;
            if (f3 != 1.0f && !this.b) {
                canvas.scale(f3, f3, f, f2);
            }
            if (V() && K() && (!this.b || this.a > this.c)) {
                float lineStart = this.G - this.o.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.b) {
                    textPaint.setAlpha((int) (this.aq * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.V, this.W, this.X, sip.b(this.Y, textPaint.getAlpha()));
                    }
                    this.o.draw(canvas);
                }
                if (!this.b) {
                    textPaint.setAlpha((int) (this.ap * alpha));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.V, this.W, this.X, sip.b(this.Y, textPaint.getAlpha()));
                }
                int lineBaseline = this.o.getLineBaseline(0);
                CharSequence charSequence = this.ar;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, textPaint);
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.V, this.W, this.X, this.Y);
                }
                if (!this.b) {
                    String strTrim = this.ar.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.o.getLineEnd(0), str.length()), 0.0f, f4, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f, f2);
                this.o.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void i(TextPaint textPaint) {
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.I);
        textPaint.setLetterSpacing(this.an);
    }

    public final void j(TextPaint textPaint) {
        textPaint.setTextSize(this.f);
        textPaint.setTypeface(this.L);
        textPaint.setLetterSpacing(this.n);
    }

    public final void k(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.K;
            if (typeface != null) {
                this.J = sin.d(configuration, typeface);
            }
            Typeface typeface2 = this.N;
            if (typeface2 != null) {
                this.M = sin.d(configuration, typeface2);
            }
            Typeface typeface3 = this.J;
            if (typeface3 == null) {
                typeface3 = this.K;
            }
            this.I = typeface3;
            Typeface typeface4 = this.M;
            if (typeface4 == null) {
                typeface4 = this.N;
            }
            this.L = typeface4;
            m(true);
        }
    }

    public final void l() {
        m(false);
    }

    public final void m(boolean z) {
        float fW;
        StaticLayout staticLayout;
        View view = this.u;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        R(1.0f, z);
        CharSequence charSequenceEllipsize = this.R;
        if (charSequenceEllipsize != null && (staticLayout = this.o) != null) {
            if (K()) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.ac, staticLayout.getWidth(), this.j);
            }
            this.ar = charSequenceEllipsize;
        }
        CharSequence charSequence = this.ar;
        if (charSequence != null) {
            this.p = W(this.ac, charSequence);
        } else {
            this.p = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.A, this.l ? 1 : 0);
        Rect rect = this.x;
        if (rect == null) {
            rect = this.e;
        }
        int i = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i == 48) {
            this.D = rect.top;
        } else if (i != 80) {
            TextPaint textPaint = this.ac;
            this.D = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.D = rect.bottom + this.ac.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.F = rect.centerX() - (this.p / 2.0f);
        } else if (i2 != 5) {
            this.F = rect.left;
        } else {
            this.F = rect.right - this.p;
        }
        float f = this.p;
        Rect rect2 = this.e;
        if (f <= rect2.width()) {
            float fMax = this.F + Math.max(0.0f, rect2.left - this.F);
            this.F = fMax;
            this.F = fMax + Math.min(0.0f, rect2.right - (this.F + this.p));
        }
        if (a() <= rect2.height()) {
            float fMax2 = this.D + Math.max(0.0f, rect2.top - this.D);
            this.D = fMax2;
            this.D = fMax2 + Math.min(0.0f, rect2.bottom - (this.D + c()));
        }
        R(0.0f, z);
        float height = this.o != null ? r13.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.o;
        if (staticLayout2 == null || this.q <= 1) {
            CharSequence charSequence2 = this.R;
            fW = charSequence2 != null ? W(this.ac, charSequence2) : 0.0f;
        } else {
            fW = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.o;
        this.i = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0);
        int i3 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i3 == 48) {
            this.C = this.w.top;
        } else if (i3 != 80) {
            this.C = this.w.centerY() - (height / 2.0f);
        } else {
            this.C = (this.w.bottom - height) + (this.as ? this.ac.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.E = this.w.centerX() - (fW / 2.0f);
        } else if (i4 != 5) {
            this.E = this.w.left;
        } else {
            this.E = this.w.right - fW;
        }
        S(this.a);
        Q();
    }

    public final void n(ColorStateList colorStateList) {
        if (this.h == colorStateList && this.B == colorStateList) {
            return;
        }
        this.h = colorStateList;
        this.B = colorStateList;
        l();
    }

    public final void o(Rect rect) {
        p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void p(int i, int i2, int i3, int i4) {
        Rect rect = this.e;
        if (U(rect, i, i2, i3, i4)) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.ab = true;
    }

    public final void q(int i, int i2, int i3, int i4) {
        if (this.x == null) {
            this.x = new Rect(i, i2, i3, i4);
            this.ab = true;
        }
        if (U(this.x, i, i2, i3, i4)) {
            return;
        }
        this.x.set(i, i2, i3, i4);
        this.ab = true;
    }

    public final void r(int i) {
        View view = this.u;
        syh syhVar = new syh(view.getContext(), i);
        ColorStateList colorStateList = syhVar.k;
        if (colorStateList != null) {
            this.h = colorStateList;
        }
        float f = syhVar.l;
        if (f != 0.0f) {
            this.g = f;
        }
        ColorStateList colorStateList2 = syhVar.a;
        if (colorStateList2 != null) {
            this.ai = colorStateList2;
        }
        this.ag = syhVar.f;
        this.ah = syhVar.g;
        this.af = syhVar.h;
        this.an = syhVar.j;
        syd sydVar = this.Q;
        if (sydVar != null) {
            sydVar.c();
        }
        this.Q = new syd(new sua(this, 1), syhVar.a());
        syhVar.b(view.getContext(), this.Q);
        l();
    }

    public final void s(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            l();
        }
    }

    public final void t(int i) {
        if (this.A != i) {
            this.A = i;
            l();
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        v(i, i2, i3, i4, true);
    }

    public final void v(int i, int i2, int i3, int i4, boolean z) {
        Rect rect = this.w;
        if (U(rect, i, i2, i3, i4) && z == this.as) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.ab = true;
        this.as = z;
    }

    public final void w(int i) {
        if (i != this.q) {
            this.q = i;
            l();
        }
    }

    public final void x(int i) {
        View view = this.u;
        syh syhVar = new syh(view.getContext(), i);
        ColorStateList colorStateList = syhVar.k;
        if (colorStateList != null) {
            this.B = colorStateList;
        }
        float f = syhVar.l;
        if (f != 0.0f) {
            this.f = f;
        }
        ColorStateList colorStateList2 = syhVar.a;
        if (colorStateList2 != null) {
            this.am = colorStateList2;
        }
        this.ak = syhVar.f;
        this.al = syhVar.g;
        this.aj = syhVar.h;
        this.n = syhVar.j;
        syd sydVar = this.P;
        if (sydVar != null) {
            sydVar.c();
        }
        this.P = new syd(new sua(this, 0), syhVar.a());
        syhVar.b(view.getContext(), this.P);
        l();
    }

    public final void y(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            l();
        }
    }

    public final void z(int i) {
        if (this.z != i) {
            this.z = i;
            l();
        }
    }
}
