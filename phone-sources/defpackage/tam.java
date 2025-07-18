package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.android.videos.R;
import defpackage.irc;
import defpackage.tah;
import defpackage.tam;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tam<S extends tam<S, L, T>, L extends tah<S>, T extends irc> extends View {
    public static final String a = "tam";
    static final int b = 2132085972;
    private static final int l = 2130969948;
    private static final int m = 2130969951;
    private static final int n = 2130969958;
    private static final int o = 2130969956;
    private final List A;
    private boolean B;
    private ValueAnimator C;
    private ValueAnimator D;
    private final int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private float[] aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private boolean aF;
    private ColorStateList aG;
    private ColorStateList aH;
    private ColorStateList aI;
    private ColorStateList aJ;
    private ColorStateList aK;
    private final Path aL;
    private final RectF aM;
    private final RectF aN;
    private final RectF aO;
    private final RectF aP;
    private final Rect aQ;
    private final RectF aR;
    private final Rect aS;
    private final Matrix aT;
    private final szk aU;
    private List aV;
    private float aW;
    private final ViewTreeObserver.OnScrollChangedListener aX;
    private final ViewTreeObserver.OnGlobalLayoutListener aY;
    private boolean aZ;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private Drawable af;
    private boolean ag;
    private Drawable ah;
    private boolean ai;
    private ColorStateList aj;
    private Drawable ak;
    private boolean al;
    private Drawable am;
    private boolean an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private float as;
    private float at;
    private MotionEvent au;
    private boolean av;
    private ArrayList aw;
    private int ax;
    private float ay;
    private int az;
    public final tak c;
    public final List d;
    public tan e;
    public float f;
    public float g;
    public int h;
    public boolean i;
    public final int j;
    public final Runnable k;
    private final Paint p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final Paint u;
    private final Paint v;
    private final AccessibilityManager w;
    private taj x;
    private int y;
    private final List z;

    public tam(Context context) {
        this(context, null);
    }

    private final void A(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1) {
            if (intrinsicHeight == -1) {
                drawable.setBounds(0, 0, this.S, this.T);
                return;
            }
            intrinsicWidth = -1;
        }
        float fMax = Math.max(this.S, this.T) / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
    }

    private final void B(tdg tdgVar) {
        ViewGroup viewGroupJ = sil.j(this);
        if (viewGroupJ == null) {
            return;
        }
        tdgVar.c(viewGroupJ);
        viewGroupJ.addOnLayoutChangeListener(tdgVar.c);
    }

    private final void C(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            RectF rectF2 = this.aR;
            int i = this.ap;
            int i2 = this.aq;
            if (rectF.right - rectF.left >= i2 + i2 + i) {
                float f = i;
                float f2 = i2;
                boolean z2 = true;
                if (!m() && !n()) {
                    z2 = false;
                }
                float f3 = z ^ z2 ? rectF.left + f2 : (rectF.right - f2) - f;
                float fV = v() - (f / 2.0f);
                rectF2.set(f3, fV, f + f3, fV + f);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (n()) {
                this.aT.mapRect(rectF2);
            }
            Rect rect = this.aS;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    private final void D(tdg tdgVar) {
        ViewOverlay viewOverlayK = sil.k(this);
        if (viewOverlayK != null) {
            viewOverlayK.remove(tdgVar);
            ViewGroup viewGroupJ = sil.j(this);
            if (viewGroupJ == null) {
                return;
            }
            viewGroupJ.removeOnLayoutChangeListener(tdgVar.c);
        }
    }

    private final void E(Canvas canvas, float f, float f2) {
        ArrayList arrayList = this.aw;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            float fU = u(((Float) arrayList.get(i)).floatValue());
            float f3 = this.V + (this.S / 2.0f);
            if (f >= fU - f3 && f <= fU + f3) {
                return;
            }
        }
        if (n()) {
            canvas.drawPoint(f2, f, this.v);
        } else {
            canvas.drawPoint(f, f2, this.v);
        }
    }

    private final void F(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (n()) {
            canvas.concat(this.aT);
        }
        canvas.translate((this.R + ((int) (t(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G(int r7, int r8, android.graphics.Canvas r9, android.graphics.Paint r10) {
        /*
            r6 = this;
        L0:
            if (r7 >= r8) goto L6d
            boolean r0 = r6.n()
            if (r0 == 0) goto Lf
            int r0 = r7 + 1
            float[] r1 = r6.aA
            r0 = r1[r0]
            goto L13
        Lf:
            float[] r0 = r6.aA
            r0 = r0[r7]
        L13:
            int r1 = r6.V
            float r1 = (float) r1
            int r2 = r6.S
            float r2 = (float) r2
            java.util.ArrayList r3 = r6.aw
            int r4 = r3.size()
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 <= 0) goto L40
            float r2 = r2 / r5
            float r1 = r1 + r2
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r6.u(r2)
            float r3 = r2 - r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L40
            float r2 = r2 + r1
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 > 0) goto L40
            goto L6a
        L40:
            boolean r1 = r6.ae
            if (r1 == 0) goto L5f
            int r1 = r6.V
            float r1 = (float) r1
            int r2 = r6.S
            float r2 = (float) r2
            int r3 = r6.aE
            int r4 = r6.R
            int r4 = r4 + r4
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r5
            float r2 = r2 / r5
            float r1 = r1 + r2
            float r2 = r3 - r1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L5f
            float r3 = r3 + r1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6a
        L5f:
            int r0 = r7 + 1
            float[] r1 = r6.aA
            r2 = r1[r7]
            r0 = r1[r0]
            r9.drawPoint(r2, r0, r10)
        L6a:
            int r7 = r7 + 2
            goto L0
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.G(int, int, android.graphics.Canvas, android.graphics.Paint):void");
    }

    private final void H(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.af == null && this.ah == null && this.ak == null && this.am == null) {
            return;
        }
        if (this.aw.size() > 1) {
            Log.w(a, "Track icons can only be used when only 1 thumb is present.");
        }
        C(canvas, rectF, this.af, true);
        C(canvas, rectF2, this.ak, true);
        C(canvas, rectF, this.ah, false);
        C(canvas, rectF2, this.am, false);
    }

    private final void I() {
        if (!this.B) {
            this.B = true;
            ValueAnimator valueAnimatorZ = z(true);
            this.C = valueAnimatorZ;
            this.D = null;
            valueAnimatorZ.start();
        }
        List list = this.d;
        Iterator it = list.iterator();
        for (int i = 0; i < this.aw.size() && it.hasNext(); i++) {
            if (i != this.ax) {
                L((tdg) it.next(), ((Float) this.aw.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(list.size()), Integer.valueOf(this.aw.size())));
        }
        L((tdg) it.next(), ((Float) this.aw.get(this.ax)).floatValue());
    }

    private final void J() {
        if (this.B) {
            this.B = false;
            ValueAnimator valueAnimatorZ = z(false);
            this.D = valueAnimatorZ;
            this.C = null;
            valueAnimatorZ.addListener(new tai(this));
            this.D.start();
        }
    }

    private final void K() {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((iuq) ((irc) it.next()).b).d = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(defpackage.tdg r5, float r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.b(r6)
            r5.b(r0)
            boolean r0 = r4.n()
            if (r0 == 0) goto L4e
            int r0 = r4.R
            float r6 = r4.t(r6)
            int r1 = r4.aE
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 / 2
            int r1 = r5.getIntrinsicHeight()
            int r0 = r0 - r6
            int r1 = r1 + r0
            boolean r6 = r4.m()
            if (r6 == 0) goto L3c
            int r6 = r4.v()
            int r2 = r4.ar
            int r3 = r4.T
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r6 = r6 - r2
            int r2 = r5.getIntrinsicWidth()
            goto L76
        L3c:
            int r6 = r4.v()
            int r2 = r4.ar
            int r3 = r4.T
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r2 = r2 + r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 + r2
            goto L78
        L4e:
            int r0 = r4.R
            float r6 = r4.t(r6)
            int r1 = r4.aE
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 / 2
            int r1 = r5.getIntrinsicWidth()
            int r0 = r0 - r6
            int r1 = r1 + r0
            int r6 = r4.v()
            int r2 = r4.ar
            int r3 = r4.T
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r6 = r6 - r2
            int r2 = r5.getIntrinsicHeight()
        L76:
            int r2 = r6 - r2
        L78:
            android.graphics.Rect r3 = r4.aQ
            r3.set(r0, r2, r1, r6)
            boolean r6 = r4.n()
            if (r6 == 0) goto L90
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r3)
            android.graphics.Matrix r0 = r4.aT
            r0.mapRect(r6)
            r6.round(r3)
        L90:
            android.view.ViewGroup r6 = defpackage.sil.j(r4)
            defpackage.suc.b(r6, r4, r3)
            r5.setBounds(r3)
            android.view.ViewOverlay r6 = defpackage.sil.k(r4)
            r6.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.L(tdg, float):void");
    }

    private final void M(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.aw.size() == arrayList.size() && this.aw.equals(arrayList)) {
            return;
        }
        this.aw = arrayList;
        this.i = true;
        this.ax = 0;
        k();
        List list = this.d;
        if (list.size() > this.aw.size()) {
            List<tdg> listSubList = list.subList(this.aw.size(), list.size());
            for (tdg tdgVar : listSubList) {
                if (isAttachedToWindow()) {
                    D(tdgVar);
                }
            }
            listSubList.clear();
        }
        while (list.size() < this.aw.size()) {
            Context context = getContext();
            int i = this.y;
            tdg tdgVar2 = new tdg(context, i);
            Context context2 = tdgVar2.a;
            TypedArray typedArrayA = suy.a(context2, null, tdf.a, 0, i, new int[0]);
            tdgVar2.i = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayA.getBoolean(8, true);
            tdgVar2.h = z;
            if (z) {
                szp szpVar = new szp(tdgVar2.F());
                szpVar.g = tdgVar2.a();
                tdgVar2.p(new szq(szpVar));
            } else {
                tdgVar2.i = 0;
            }
            tdgVar2.b(typedArrayA.getText(6));
            syh syhVarM = sin.m(context2, typedArrayA);
            if (syhVarM != null && typedArrayA.hasValue(1)) {
                syhVarM.k = sin.h(context2, typedArrayA, 1);
            }
            tdgVar2.b.c(syhVarM, context2);
            tdgVar2.N(ColorStateList.valueOf(typedArrayA.getColor(7, csq.f(csq.g(sip.e(context2, R.attr.colorOnBackground, tdg.class.getCanonicalName()), 153), csq.g(sip.e(context2, android.R.attr.colorBackground, tdg.class.getCanonicalName()), 229)))));
            tdgVar2.U(ColorStateList.valueOf(sip.e(context2, R.attr.colorSurface, tdg.class.getCanonicalName())));
            tdgVar2.d = typedArrayA.getDimensionPixelSize(2, 0);
            tdgVar2.e = typedArrayA.getDimensionPixelSize(4, 0);
            tdgVar2.f = typedArrayA.getDimensionPixelSize(5, 0);
            tdgVar2.g = typedArrayA.getDimensionPixelSize(3, 0);
            typedArrayA.recycle();
            list.add(tdgVar2);
            if (isAttachedToWindow()) {
                B(tdgVar2);
            }
        }
        int i2 = list.size() == 1 ? 0 : 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((tdg) it.next()).V(i2);
        }
        for (tah tahVar : this.z) {
            ArrayList arrayList2 = this.aw;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((Float) arrayList2.get(i3)).floatValue();
                tahVar.a();
            }
        }
        postInvalidate();
    }

    private final void N() {
        if (X()) {
            int i = this.S;
            this.W = i;
            this.aa = this.V;
            int iRound = Math.round(i * 0.5f);
            int i2 = this.S - iRound;
            g(iRound);
            f(this.V - (i2 / 2));
        }
    }

    private final void O() {
        int iMin;
        W();
        if (this.ay <= 0.0f) {
            P(this.az);
            return;
        }
        int i = this.aB;
        if (i != 0) {
            iMin = 0;
            if (i == 1) {
                int iX = x();
                if (iX <= y()) {
                    iMin = iX;
                }
            } else if (i != 2) {
                throw new IllegalStateException(a.cf(i, "Unexpected tickVisibilityMode: "));
            }
        } else {
            iMin = Math.min(x(), y());
        }
        P(iMin);
    }

    private final void P(int i) {
        if (i == 0) {
            this.aA = null;
            return;
        }
        float[] fArr = this.aA;
        int i2 = i + i;
        if (fArr == null || fArr.length != i2) {
            this.aA = new float[i2];
        }
        float f = this.aE;
        int i3 = i - 1;
        float fV = v();
        for (int i4 = 0; i4 < i2; i4 += 2) {
            float[] fArr2 = this.aA;
            fArr2[i4] = this.R + ((i4 / 2.0f) * (f / i3));
            fArr2[i4 + 1] = fV;
        }
        if (n()) {
            this.aT.mapPoints(this.aA);
        }
    }

    private final void Q() {
        Drawable drawable = this.ah;
        if (drawable != null) {
            if (!this.ai) {
                if (this.aj == null) {
                    return;
                }
                this.ah = drawable.mutate();
                this.ai = true;
            }
            this.ah.setTintList(this.aj);
        }
    }

    private final void R() {
        Drawable drawable = this.af;
        if (drawable != null) {
            if (!this.ag) {
                if (this.aj == null) {
                    return;
                }
                this.af = drawable.mutate();
                this.ag = true;
            }
            this.af.setTintList(this.aj);
        }
    }

    private final void S() {
        Drawable drawable = this.am;
        if (drawable != null) {
            if (!this.an) {
                if (this.ao == null) {
                    return;
                }
                this.am = drawable.mutate();
                this.an = true;
            }
            this.am.setTintList(this.ao);
        }
    }

    private final void T() {
        Drawable drawable = this.ak;
        if (drawable != null) {
            if (!this.al) {
                if (this.ao == null) {
                    return;
                }
                this.ak = drawable.mutate();
                this.al = true;
            }
            this.ak.setTintList(this.ao);
        }
    }

    private final void U(int i) {
        int i2 = this.R;
        this.aE = Math.max(i - (i2 + i2), 0);
        O();
    }

    private final void V(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (n()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingTop + paddingBottom;
        int iMax = Math.max(this.N, Math.max(this.Q + i, this.T + i));
        boolean z3 = true;
        if (iMax == this.O) {
            z2 = false;
        } else {
            this.O = iMax;
            z2 = true;
        }
        int iMax2 = this.F + Math.max(Math.max(Math.max((this.S / 2) - this.G, 0), Math.max((this.Q - this.H) / 2, 0)), Math.max(Math.max(this.aC - this.I, 0), Math.max(this.aD - this.J, 0)));
        if (this.R == iMax2) {
            z3 = false;
        } else {
            this.R = iMax2;
            if (isLaidOut()) {
                U(n() ? getHeight() : getWidth());
            }
        }
        if (n()) {
            float fV = v();
            Matrix matrix = this.aT;
            matrix.reset();
            matrix.setRotate(90.0f, fV, fV);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    private final void W() {
        if (this.i) {
            float f = this.f;
            if (f >= this.g) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(f), Float.valueOf(this.g)));
            }
            ArrayList arrayList = this.aw;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Float f2 = (Float) arrayList.get(i);
                if (f2.floatValue() < this.f || f2.floatValue() > this.g) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f2, Float.valueOf(this.f), Float.valueOf(this.g)));
                }
                if (this.ay > 0.0f && !af(f2.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f2, Float.valueOf(this.f), Float.valueOf(this.ay), Float.valueOf(this.ay)));
                }
            }
            if (this.ay > 0.0f && !af(this.g)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.ay), Float.valueOf(this.f), Float.valueOf(this.g)));
            }
            float f3 = this.ay;
            if (f3 != 0.0f) {
                if (((int) f3) != f3) {
                    Log.w(a, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f3)));
                }
                float f4 = this.f;
                if (((int) f4) != f4) {
                    Log.w(a, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f4)));
                }
                float f5 = this.g;
                if (((int) f5) != f5) {
                    Log.w(a, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f5)));
                }
            }
            this.i = false;
        }
    }

    private final boolean X() {
        return this.V > 0;
    }

    private static boolean Y(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private final boolean Z(MotionEvent motionEvent) {
        if (Y(motionEvent)) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private final boolean aa(MotionEvent motionEvent) {
        if (Y(motionEvent)) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0013 A[PHI: r5
  0x0013: PHI (r5v3 long) = (r5v1 long), (r5v2 long) binds: [B:3:0x0011, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean ab(int r8) {
        /*
            r7 = this;
            int r0 = r7.ax
            long r1 = (long) r0
            java.util.ArrayList r3 = r7.aw
            int r3 = r3.size()
            r4 = -1
            int r3 = r3 + r4
            long r5 = (long) r8
            long r1 = r1 + r5
            r5 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 >= 0) goto L15
        L13:
            r1 = r5
            goto L1b
        L15:
            long r5 = (long) r3
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto L1b
            goto L13
        L1b:
            int r8 = (int) r1
            r7.ax = r8
            if (r8 != r0) goto L22
            r8 = 0
            return r8
        L22:
            int r0 = r7.h
            if (r0 == r4) goto L28
            r7.h = r8
        L28:
            r7.k()
            r7.postInvalidate()
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.ab(int):boolean");
    }

    private final boolean ac() {
        return this.P == 3;
    }

    private final boolean ad() {
        return !(getBackground() instanceof RippleDrawable);
    }

    private final boolean ae(float f) {
        return o(this.h, f);
    }

    private final boolean af(float f) {
        double dDoubleValue = new BigDecimal(Double.toString(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f)), MathContext.DECIMAL64).doubleValue())).divide(new BigDecimal(Float.toString(this.ay)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private final float[] ag() {
        float fFloatValue = ((Float) this.aw.get(0)).floatValue();
        float fFloatValue2 = ((Float) this.aw.get(r2.size() - 1)).floatValue();
        if (this.aw.size() == 1) {
            fFloatValue = this.f;
        }
        float fT = t(fFloatValue);
        float fT2 = t(fFloatValue2);
        if (this.ae) {
            float fMin = Math.min(0.5f, fT2);
            fT2 = Math.max(0.5f, fT2);
            fT = fMin;
        }
        return (this.ae || !(m() || n())) ? new float[]{fT, fT2} : new float[]{fT2, fT};
    }

    private final void ah(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, int i) {
        if (f2 - f > a() - this.V) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        ai(canvas, this.p, rectF, a(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ai(android.graphics.Canvas r18, android.graphics.Paint r19, android.graphics.RectF r20, float r21, int r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.ai(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, int):void");
    }

    private final void aj(int i) {
        if (m() || n()) {
            i = i == Integer.MIN_VALUE ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : -i;
        }
        ab(i);
    }

    private final void ak() {
        double dRound;
        float f = this.aW;
        float f2 = this.ay;
        if (f2 > 0.0f) {
            dRound = Math.round(f * r1) / ((int) ((this.g - this.f) / f2));
        } else {
            dRound = f;
        }
        if (m() || n()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.g;
        ae((float) ((dRound * (f3 - r1)) + this.f));
    }

    private final float s() {
        float f = this.ay;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    private final float t(float f) {
        float f2 = this.f;
        float f3 = (f - f2) / (this.g - f2);
        return (m() || n()) ? 1.0f - f3 : f3;
    }

    private final float u(float f) {
        return (t(f) * this.aE) + this.R;
    }

    private final int v() {
        return (this.O / 2) + ((this.P == 1 || ac()) ? ((tdg) this.d.get(0)).getIntrinsicHeight() : 0);
    }

    private final int w(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private final int x() {
        return (int) (((this.g - this.f) / this.ay) + 1.0f);
    }

    private final int y() {
        return (this.aE / this.K) + 1;
    }

    private final ValueAnimator z(boolean z) {
        int iB;
        TimeInterpolator timeInterpolatorK;
        ValueAnimator valueAnimator = z ? this.D : this.C;
        float fFloatValue = true != z ? 1.0f : 0.0f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, true != z ? 0.0f : 1.0f);
        if (z) {
            iB = sim.b(getContext(), l, 83);
            timeInterpolatorK = sim.k(getContext(), n, sns.e);
        } else {
            iB = sim.b(getContext(), m, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar);
            timeInterpolatorK = sim.k(getContext(), o, sns.c);
        }
        valueAnimatorOfFloat.setDuration(iB);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorK);
        valueAnimatorOfFloat.addUpdateListener(new fsz(this, 16));
        return valueAnimatorOfFloat;
    }

    public final int a() {
        int i = this.ac;
        return i == -1 ? this.Q / 2 : i;
    }

    public final String b(float f) {
        tan tanVar = this.e;
        if (tanVar != null) {
            return tanVar.a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final List c() {
        return new ArrayList(this.aw);
    }

    public final void d(int i) {
        if (i == this.T) {
            return;
        }
        this.T = i;
        this.aU.setBounds(0, 0, this.S, i);
        Iterator it = this.aV.iterator();
        while (it.hasNext()) {
            A((Drawable) it.next());
        }
        V(false);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.c.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.p.setColor(w(this.aK));
        this.q.setColor(w(this.aJ));
        this.t.setColor(w(this.aI));
        this.u.setColor(w(this.aH));
        this.v.setColor(w(this.aI));
        for (tdg tdgVar : this.d) {
            if (tdgVar.isStateful()) {
                tdgVar.setState(getDrawableState());
            }
        }
        szk szkVar = this.aU;
        if (szkVar.isStateful()) {
            szkVar.setState(getDrawableState());
        }
        Paint paint = this.s;
        paint.setColor(w(this.aG));
        paint.setAlpha(63);
    }

    public final void e(int i) {
        int i2 = i + i;
        g(i2);
        d(i2);
    }

    public final void f(int i) {
        if (this.V == i) {
            return;
        }
        this.V = i;
        invalidate();
    }

    public final void g(int i) {
        if (i == this.S) {
            return;
        }
        this.S = i;
        szk szkVar = this.aU;
        szp szpVar = new szp();
        szpVar.h(i / 2.0f);
        szkVar.p(new szq(szpVar));
        szkVar.setBounds(0, 0, this.S, this.T);
        Iterator it = this.aV.iterator();
        while (it.hasNext()) {
            A((Drawable) it.next());
        }
        V(false);
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final void h(float f) {
        this.g = f;
        this.i = true;
        postInvalidate();
    }

    public final void i(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        M(arrayList);
    }

    final void j(int i, Rect rect) {
        int iT = this.R + ((int) (t(((Float) c().get(i)).floatValue()) * this.aE));
        int iV = v();
        int iMax = Math.max(this.S / 2, this.L / 2);
        int iMax2 = Math.max(this.T / 2, this.L / 2);
        RectF rectF = new RectF(iT - iMax, iV - iMax2, iT + iMax, iV + iMax2);
        if (n()) {
            this.aT.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void k() {
        if (ad() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fT = t(((Float) this.aw.get(this.ax)).floatValue()) * this.aE;
            float f = this.R;
            int iV = v();
            float f2 = this.U;
            float f3 = fT + f;
            float[] fArr = {f3 - f2, iV - r4, f3 + f2, iV + r4};
            if (n()) {
                this.aT.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void l() {
        boolean zN = n();
        boolean zM = m();
        float f = 1.2f;
        float f2 = 0.5f;
        if (!zN) {
            f2 = 1.2f;
            f = 0.5f;
        } else if (zM) {
            f = -0.2f;
        }
        for (tdg tdgVar : this.d) {
            tdgVar.l = f;
            tdgVar.m = f2;
            tdgVar.invalidateSelf();
        }
        int i = this.P;
        if (i == 0 || i == 1) {
            if (this.h == -1 || !isEnabled()) {
                J();
                return;
            } else {
                I();
                return;
            }
        }
        if (i == 2) {
            J();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException(a.cf(i, "Unexpected labelBehavior: "));
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            sil.j(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.aZ) {
                I();
                return;
            }
        }
        J();
    }

    final boolean m() {
        return getLayoutDirection() == 1;
    }

    public final boolean n() {
        return this.M == 1;
    }

    public final boolean o(int i, float f) {
        this.ax = i;
        if (Math.abs(f - ((Float) this.aw.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        m();
        int i2 = i + 1;
        int i3 = i - 1;
        this.aw.set(i, Float.valueOf(cmq.k(f, i3 < 0 ? this.f : ((Float) this.aw.get(i3)).floatValue() + 0.0f, i2 >= this.aw.size() ? this.g : ((Float) this.aw.get(i2)).floatValue() + 0.0f)));
        for (tah tahVar : this.z) {
            ((Float) this.aw.get(i)).floatValue();
            tahVar.a();
        }
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        taj tajVar = this.x;
        if (tajVar == null) {
            this.x = new taj(this);
        } else {
            removeCallbacks(tajVar);
        }
        taj tajVar2 = this.x;
        tajVar2.a = i;
        postDelayed(tajVar2, 200L);
        return true;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aZ = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.aX);
        getViewTreeObserver().addOnGlobalLayoutListener(this.aY);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            B((tdg) it.next());
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        taj tajVar = this.x;
        if (tajVar != null) {
            removeCallbacks(tajVar);
        }
        this.B = false;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            D((tdg) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.aX);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.aY);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[PHI: r3
  0x00a1: PHI (r3v7 int) = (r3v6 int), (r3v6 int), (r3v29 int), (r3v29 int) binds: [B:10:0x008b, B:12:0x008f, B:14:0x0096, B:16:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.h = -1;
            this.c.l(this.ax);
            return;
        }
        if (i == 1) {
            ab(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else if (i == 2) {
            ab(Integer.MIN_VALUE);
        } else if (i == 17) {
            aj(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else if (i == 66) {
            aj(Integer.MIN_VALUE);
        }
        this.c.p(this.ax);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.aF = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.O + ((this.P == 1 || ac()) ? ((tdg) this.d.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (n()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        tal talVar = (tal) parcelable;
        super.onRestoreInstanceState(talVar.getSuperState());
        this.f = talVar.a;
        this.g = talVar.b;
        M(talVar.c);
        this.ay = talVar.d;
        if (talVar.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        tal talVar = new tal(super.onSaveInstanceState());
        talVar.a = this.f;
        talVar.b = this.g;
        talVar.c = new ArrayList(this.aw);
        talVar.d = this.ay;
        talVar.e = hasFocus();
        return talVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (true == n()) {
            i = i2;
        }
        U(i);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (java.lang.Math.abs(r2 - r7.at) >= (r7.E * 0.8f)) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Type inference failed for: r2v7, types: [ith, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tam.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.aZ = z;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        ViewOverlay viewOverlayK;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (viewOverlayK = sil.k(this)) == null) {
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            viewOverlayK.remove((tdg) it.next());
        }
    }

    public final float p() {
        float fS = s();
        return (this.g - this.f) / fS <= 20.0f ? fS : Math.round(r1 / 20.0f) * fS;
    }

    protected void q() {
        throw null;
    }

    public final void r(irc ircVar) {
        this.A.add(ircVar);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(true != z ? 2 : 0, null);
    }

    public tam(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tam(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2;
        int i3 = b;
        super(tde.a(context, attributeSet, i, i3), attributeSet, i);
        this.d = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = false;
        this.W = -1;
        this.aa = -1;
        this.ae = false;
        this.ag = false;
        this.ai = false;
        this.al = false;
        this.an = false;
        this.av = false;
        this.aw = new ArrayList();
        this.h = -1;
        this.ax = -1;
        this.ay = 0.0f;
        this.az = 0;
        this.aF = false;
        this.aL = new Path();
        this.aM = new RectF();
        this.aN = new RectF();
        this.aO = new RectF();
        this.aP = new RectF();
        this.aQ = new Rect();
        this.aR = new RectF();
        this.aS = new Rect();
        this.aT = new Matrix();
        szk szkVar = new szk();
        this.aU = szkVar;
        this.aV = Collections.EMPTY_LIST;
        this.aX = new rln(this, 2);
        this.aY = new iyo(this, 8, null);
        this.k = new slt(this, 17);
        Context context2 = getContext();
        this.aZ = isShown();
        Paint paint = new Paint();
        this.p = paint;
        Paint paint2 = new Paint();
        this.q = paint2;
        Paint paint3 = new Paint(1);
        this.r = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.s = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.t = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.u = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Paint paint7 = new Paint();
        this.v = paint7;
        paint7.setStyle(Paint.Style.FILL);
        paint7.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.N = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.F = dimensionPixelOffset;
        this.R = dimensionPixelOffset;
        this.G = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.H = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.J = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.ar = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.aq = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        TypedArray typedArrayA = suy.a(context2, attributeSet, tao.a, i, i3, new int[0]);
        int i4 = typedArrayA.getInt(2, 0);
        if (this.M != i4) {
            this.M = i4;
            V(true);
        }
        this.y = typedArrayA.getResourceId(11, R.style.Widget_MaterialComponents_Tooltip);
        this.f = typedArrayA.getFloat(4, 0.0f);
        this.g = typedArrayA.getFloat(5, 1.0f);
        i(Float.valueOf(this.f));
        boolean z = typedArrayA.getBoolean(6, false);
        if (this.ae != z) {
            this.ae = z;
            if (z) {
                i(Float.valueOf((this.f + this.g) / 2.0f));
            } else {
                i(Float.valueOf(this.f));
            }
            V(true);
        }
        this.ay = typedArrayA.getFloat(3, 0.0f);
        this.az = typedArrayA.getInt(7, 0);
        this.L = (int) Math.ceil(typedArrayA.getDimension(12, sim.c(context2)));
        boolean zHasValue = typedArrayA.hasValue(28);
        int i5 = zHasValue ? 28 : 30;
        int i6 = true != zHasValue ? 29 : 28;
        ColorStateList colorStateListH = sin.h(context2, typedArrayA, i5);
        colorStateListH = colorStateListH == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_inactive_track_color) : colorStateListH;
        if (!colorStateListH.equals(this.aK)) {
            this.aK = colorStateListH;
            paint.setColor(w(colorStateListH));
            invalidate();
        }
        ColorStateList colorStateListH2 = sin.h(context2, typedArrayA, i6);
        colorStateListH2 = colorStateListH2 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_active_track_color) : colorStateListH2;
        if (!colorStateListH2.equals(this.aJ)) {
            this.aJ = colorStateListH2;
            paint2.setColor(w(colorStateListH2));
            invalidate();
        }
        szkVar.N(sin.h(context2, typedArrayA, 13));
        if (typedArrayA.hasValue(17)) {
            szkVar.U(sin.h(context2, typedArrayA, 17));
            postInvalidate();
        }
        szkVar.V(typedArrayA.getDimension(18, 0.0f));
        postInvalidate();
        ColorStateList colorStateListH3 = sin.h(context2, typedArrayA, 8);
        colorStateListH3 = colorStateListH3 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_halo_color) : colorStateListH3;
        if (!colorStateListH3.equals(this.aG)) {
            this.aG = colorStateListH3;
            Drawable background = getBackground();
            if (!ad() && (background instanceof RippleDrawable)) {
                ((RippleDrawable) background).setColor(colorStateListH3);
            } else {
                paint4.setColor(w(colorStateListH3));
                paint4.setAlpha(63);
                invalidate();
            }
        }
        if (typedArrayA.hasValue(26)) {
            i2 = typedArrayA.getInt(26, -1);
        } else {
            i2 = true != typedArrayA.getBoolean(27, true) ? 2 : 0;
        }
        this.aB = i2;
        boolean zHasValue2 = typedArrayA.hasValue(21);
        int i7 = zHasValue2 ? 21 : 23;
        int i8 = true != zHasValue2 ? 22 : 21;
        ColorStateList colorStateListH4 = sin.h(context2, typedArrayA, i7);
        colorStateListH4 = colorStateListH4 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListH4;
        if (!colorStateListH4.equals(this.aI)) {
            this.aI = colorStateListH4;
            paint5.setColor(w(colorStateListH4));
            invalidate();
        }
        ColorStateList colorStateListH5 = sin.h(context2, typedArrayA, i8);
        colorStateListH5 = colorStateListH5 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_active_tick_marks_color) : colorStateListH5;
        if (!colorStateListH5.equals(this.aH)) {
            this.aH = colorStateListH5;
            paint6.setColor(w(colorStateListH5));
            invalidate();
        }
        f(typedArrayA.getDimensionPixelSize(19, 0));
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(41, 0);
        if (this.ab != dimensionPixelSize) {
            this.ab = dimensionPixelSize;
            paint7.setStrokeWidth(dimensionPixelSize);
            invalidate();
        }
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(31, -1);
        if (this.ac != dimensionPixelSize2) {
            this.ac = dimensionPixelSize2;
            invalidate();
        }
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(40, 0);
        if (this.ad != dimensionPixelSize3) {
            this.ad = dimensionPixelSize3;
            invalidate();
        }
        Drawable drawableJ = sin.j(context2, typedArrayA, 35);
        if (drawableJ != this.af) {
            this.af = drawableJ;
            this.ag = false;
            R();
            invalidate();
        }
        Drawable drawableJ2 = sin.j(context2, typedArrayA, 34);
        if (drawableJ2 != this.ah) {
            this.ah = drawableJ2;
            this.ai = false;
            Q();
            invalidate();
        }
        ColorStateList colorStateListH6 = sin.h(context2, typedArrayA, 33);
        if (colorStateListH6 != this.aj) {
            this.aj = colorStateListH6;
            R();
            Q();
            invalidate();
        }
        Drawable drawableJ3 = sin.j(context2, typedArrayA, 38);
        if (drawableJ3 != this.ak) {
            this.ak = drawableJ3;
            this.al = false;
            T();
            invalidate();
        }
        Drawable drawableJ4 = sin.j(context2, typedArrayA, 37);
        if (drawableJ4 != this.am) {
            this.am = drawableJ4;
            this.an = false;
            S();
            invalidate();
        }
        ColorStateList colorStateListH7 = sin.h(context2, typedArrayA, 36);
        if (colorStateListH7 != this.ao) {
            this.ao = colorStateListH7;
            T();
            S();
            invalidate();
        }
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(39, 0);
        if (this.ap != dimensionPixelSize4) {
            this.ap = dimensionPixelSize4;
            invalidate();
        }
        int dimensionPixelSize5 = typedArrayA.getDimensionPixelSize(16, 0);
        int i9 = dimensionPixelSize5 + dimensionPixelSize5;
        int dimensionPixelSize6 = typedArrayA.getDimensionPixelSize(20, i9);
        int dimensionPixelSize7 = typedArrayA.getDimensionPixelSize(15, i9);
        g(dimensionPixelSize6);
        d(dimensionPixelSize7);
        int dimensionPixelSize8 = typedArrayA.getDimensionPixelSize(9, 0);
        if (dimensionPixelSize8 != this.U) {
            this.U = dimensionPixelSize8;
            Drawable background2 = getBackground();
            if (!ad() && (background2 instanceof RippleDrawable)) {
                ((RippleDrawable) background2).setRadius(this.U);
            } else {
                postInvalidate();
            }
        }
        szkVar.M(typedArrayA.getDimension(14, 0.0f));
        int dimensionPixelSize9 = typedArrayA.getDimensionPixelSize(32, 0);
        if (this.Q != dimensionPixelSize9) {
            this.Q = dimensionPixelSize9;
            paint.setStrokeWidth(dimensionPixelSize9);
            paint2.setStrokeWidth(this.Q);
            V(false);
        }
        int dimensionPixelSize10 = typedArrayA.getDimensionPixelSize(24, this.ab / 2);
        if (this.aC != dimensionPixelSize10) {
            this.aC = dimensionPixelSize10;
            paint6.setStrokeWidth(dimensionPixelSize10 + dimensionPixelSize10);
            V(false);
        }
        int dimensionPixelSize11 = typedArrayA.getDimensionPixelSize(25, this.ab / 2);
        if (this.aD != dimensionPixelSize11) {
            this.aD = dimensionPixelSize11;
            paint5.setStrokeWidth(dimensionPixelSize11 + dimensionPixelSize11);
            V(false);
        }
        int i10 = typedArrayA.getInt(10, 0);
        if (this.P != i10) {
            this.P = i10;
            V(true);
        }
        if (!typedArrayA.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayA.recycle();
        setFocusable(true);
        setClickable(true);
        szkVar.Q(2);
        this.E = ViewConfiguration.get(context2).getScaledTouchSlop();
        tak takVar = new tak(this);
        this.c = takVar;
        cww.p(this, takVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.w = accessibilityManager;
        this.j = Build.VERSION.SDK_INT >= 29 ? accessibilityManager.getRecommendedTimeoutMillis(WVMediaCrypto.TYPE, 6) : 120000;
    }
}
