package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.google.android.videos.R;
import defpackage.bko;
import defpackage.ccj;
import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbc extends ViewGroup implements bzz, bmt, bti, duv, bzw {
    public static final kc M = new kc((byte[]) null);
    public static Class a;
    public static Method b;
    public static Method c;
    public static Runnable d;
    public static Method e;
    public final float[] A;
    public final float[] B;
    public long C;
    public final bcb D;
    public yjv E;
    public final ckk F;
    public final brs G;
    public MotionEvent H;
    public long I;
    public boolean J;
    public final bmh K;
    public final caz L;
    public final jc N;
    public final bnf O;
    public final bla P;
    public final caw Q;
    public final cbp R;
    public final ckn S;
    public final qtx T;
    public final dfb U;
    public final kw V;
    public final cvw W;
    private final ViewTreeObserver.OnTouchModeChangeListener aA;
    private final ckm aB;
    private final AtomicReference aC;
    private final bcb aD;
    private int aE;
    private final bcb aF;
    private float aG;
    private float aH;
    private final Runnable aI;
    private final yjk aJ;
    private final cck aK;
    private boolean aL;
    private View aM;
    private final kc aN;
    private final bmd aO;
    private final kw aP;
    public final dhk aa;
    public final kw ab;
    public final cvw ac;
    public final cvw ad;
    public final cvw ae;
    private long af;
    private final boolean ag;
    private final bcb ah;
    private View ai;
    private final cew aj;
    private final EmptySemanticsElement ak;
    private final AndroidComposeView$bringIntoViewNode$1 al;
    private final bkp am;
    private final bkp an;
    private boolean ao;
    private final bso ap;
    private ccd aq;
    private clv ar;
    private boolean as;
    private long at;
    private final int[] au;
    private long av;
    private boolean aw;
    private final bdy ax;
    private final ViewTreeObserver.OnGlobalLayoutListener ay;
    private final ViewTreeObserver.OnScrollChangedListener az;
    public final byu f;
    public final boolean g;
    public yil h;
    public final bll i;
    public final cdf j;
    public final cds k;
    public final bys l;
    public final cfq m;
    public final cbi n;
    public final blj o;
    public final blc p;
    public final List q;
    public List r;
    public boolean s;
    public yjv t;
    public final bku u;
    public boolean v;
    public final cab w;
    public boolean x;
    public final bzf y;
    public final float[] z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1, bkp] */
    public cbc(Context context, yil yilVar) {
        bla blaVar;
        super(context);
        this.af = 9205357640488583168L;
        this.ag = true;
        this.f = new byu(0 == true ? 1 : 0);
        clx clxVarQ = clw.q(context);
        bcz bczVar = bcz.a;
        this.ah = new bci(clxVarQ, bczVar);
        boolean z = false;
        boolean z2 = Build.VERSION.SDK_INT >= 35;
        this.g = z2;
        cew cewVar = new cew();
        this.aj = cewVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(cewVar);
        this.ak = emptySemanticsElement;
        ?? r2 = new bzi<ccj>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.bzi
            public final /* bridge */ /* synthetic */ bko d() {
                return new ccj(this.a);
            }

            @Override // defpackage.bzi
            public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
                ((ccj) bkoVar).a = this.a;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }
        };
        this.al = r2;
        bmh bmhVar = new bmh(this, this);
        this.K = bmhVar;
        this.h = yilVar;
        bll bllVar = new bll();
        this.i = bllVar;
        this.j = new cdf();
        bkp bkpVarC = brx.c(bkp.g, new cay(this));
        this.am = bkpVarC;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(bzg.r);
        this.an = rotaryInputElement;
        this.aP = new kw((byte[]) null, (char[]) null);
        ccc cccVar = new ccc(ViewConfiguration.get(context));
        this.k = cccVar;
        new buv();
        bys bysVar = new bys(z, 3, 0 == true ? 1 : 0);
        bysVar.W(bwo.a);
        bysVar.V(m());
        bysVar.Y(cccVar);
        bysVar.X(bdi.A(emptySemanticsElement, rotaryInputElement).a(bkpVarC).a(bmhVar.d).a(bllVar.c).a(r2));
        this.l = bysVar;
        jc jcVar = jd.a;
        jc jcVar2 = new jc((byte[]) null);
        this.N = jcVar2;
        cfq cfqVar = new cfq(null);
        this.m = cfqVar;
        dfb dfbVar = new dfb(bysVar, cewVar, jcVar2);
        this.U = dfbVar;
        cbi cbiVar = new cbi(this);
        this.n = cbiVar;
        blj bljVar = new blj(this, new agx((Object) this, 3, (short[]) null));
        this.o = bljVar;
        this.V = new kw(context);
        this.O = new bnf(this);
        blc blcVar = new blc();
        this.p = blcVar;
        this.q = new ArrayList();
        this.ap = new bso();
        this.aO = new bmd(bysVar);
        this.t = bzg.p;
        this.u = M() ? new bku(this, blcVar) : null;
        if (M()) {
            AutofillManager autofillManagerM69m = bb$$ExternalSyntheticApiModelOutline1.m69m(context.getSystemService(bb$$ExternalSyntheticApiModelOutline1.m78m$1()));
            if (autofillManagerM69m == null) {
                bty.a("Autofill service could not be located.");
                throw new yfs();
            }
            blaVar = new bla(new cb(autofillManagerM69m, (byte[]) null), dfbVar, this, cfqVar, context.getPackageName());
        } else {
            blaVar = null;
        }
        this.P = blaVar;
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        cvw cvwVar = new cvw((ClipboardManager) systemService, (byte[]) null);
        this.ad = cvwVar;
        this.ae = new cvw(cvwVar, (byte[]) null);
        this.w = new cab(new brj(this, 16));
        this.y = new bzf(bysVar);
        this.at = 9223372034707292159L;
        this.au = new int[]{0, 0};
        float[] fArrE = boa.e();
        this.z = fArrE;
        this.A = boa.e();
        this.B = boa.e();
        this.av = -1L;
        this.C = 9187343241974906880L;
        bcz bczVar2 = bcz.c;
        this.D = new bci(null, bczVar2);
        bms bmsVar = new bms(this, 20);
        ivx ivxVar = bdt.a;
        this.ax = new bbh(bmsVar, null);
        this.ay = new iyo(this, 1, 0 == true ? 1 : 0);
        this.az = new rln(this, 1);
        this.aA = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: cav
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z3) {
                this.a.ab.m(true != z3 ? 2 : 1);
            }
        };
        ckm ckmVar = new ckm(this);
        this.aB = ckmVar;
        ckk ckkVar = new ckk(ckmVar);
        this.F = ckkVar;
        this.aC = new AtomicReference(null);
        this.ac = new cvw(ckkVar, (byte[]) null);
        this.S = new ckn();
        this.aD = new bci(cko.y(context), bczVar);
        this.aE = ab(context.getResources().getConfiguration());
        cmi cmiVarV = d.V(context.getResources().getConfiguration().getLayoutDirection());
        this.aF = new bci(cmiVarV == null ? cmi.a : cmiVarV, bczVar2);
        this.G = new ccr(this, 1);
        this.ab = new kw(true != isInTouchMode() ? 2 : 1, (byte[]) null);
        this.T = new qtx(this);
        this.R = new cbp();
        this.aa = new dhk((char[]) null);
        this.aN = new kc((byte[]) (0 == true ? 1 : 0));
        this.Q = new caw(this, 2, null);
        this.aI = new caw(this, 1);
        this.aJ = new bms(this, 19);
        this.aK = Build.VERSION.SDK_INT < 29 ? new ccl(fArrE) : new ccm();
        addOnAttachStateChangeListener(bljVar);
        setWillNotDraw(false);
        setFocusable(true);
        if (Build.VERSION.SDK_INT >= 26) {
            cbo.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        cww.p(this, cbiVar);
        setOnDragListener(bllVar);
        bysVar.w(this);
        if (Build.VERSION.SDK_INT >= 29) {
            cbk.a.a(this);
        }
        if (z2) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, true);
            this.ai = view;
            addView(view);
        }
        this.W = Build.VERSION.SDK_INT >= 31 ? new cvw((char[]) null) : null;
        this.L = new caz(this);
    }

    public static final boolean M() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final int Q(MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.Q);
        try {
            this.av = AnimationUtils.currentAnimationTimeMillis();
            W();
            long jA = boa.a(this.A, (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX()) << 32));
            this.C = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jA >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jA & 4294967295L))) & 4294967295L);
            boolean z = true;
            this.aw = true;
            q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.H;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && ac(motionEvent, motionEvent2)) {
                    if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        this.aO.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        I(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                int toolType = motionEvent.getToolType(0);
                if (!z2 && toolType == 3 && actionMasked2 != 3 && actionMasked2 != 9 && Z(motionEvent)) {
                    I(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.H;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.H;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.ap.a(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.H;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.H;
                        float y = motionEvent6 != null ? motionEvent6.getY() : Float.NaN;
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (x == x2 && y == y2) {
                            z = false;
                        }
                        MotionEvent motionEvent7 = this.H;
                        long eventTime = motionEvent7 != null ? motionEvent7.getEventTime() : -1L;
                        long eventTime2 = motionEvent.getEventTime();
                        if (z || eventTime != eventTime2) {
                            if (pointerId >= 0) {
                                this.ap.a(pointerId);
                            }
                            ((bsm) this.aO.e).a();
                        }
                    }
                }
                this.H = MotionEvent.obtainNoHistory(motionEvent);
                return D(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.aw = false;
        }
    }

    private final View R(int i, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (yks.e(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewR = R(i, viewGroup.getChildAt(i2));
                    if (viewR != null) {
                        return viewR;
                    }
                }
            }
        }
        return null;
    }

    private final void S(ViewGroup viewGroup) throws Throwable {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof cbc) {
                ((cbc) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                S((ViewGroup) childAt);
            }
        }
    }

    private final void T() {
        if (this.ao) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.ao = false;
        }
    }

    private final void U(bys bysVar) {
        bysVar.F();
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            U((bys) objArr[i2]);
        }
    }

    private final void V(bys bysVar) {
        this.y.j(bysVar, false);
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            V((bys) objArr[i2]);
        }
    }

    private final void W() {
        float[] fArr = this.A;
        this.aK.a(this, fArr);
        cbp.w(fArr, this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(bys bysVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (bysVar != null) {
            while (bysVar != null && bysVar.aw() == 1) {
                if (!this.as) {
                    bys bysVarJ = bysVar.j();
                    if (bysVarJ == null) {
                        break;
                    }
                    long j = bysVarJ.n().d;
                    if (clv.j(j) && clv.i(j)) {
                        break;
                    }
                }
                bysVar = bysVar.j();
            }
            if (bysVar == this.l) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void Y() {
        bcb bcbVar = this.j.a;
        if (bcbVar != null) {
            bcbVar.b(new cmh(ccf.c(this)));
        }
    }

    private final boolean Z(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private final boolean aa(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.H) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final int ab(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private static final boolean ac(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean ad(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !cdh.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private static final long ae(int i, int i2) {
        return i2 | (i << 32);
    }

    private static final long af(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return ae(0, size);
        }
        if (mode == 0) {
            return ae(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        if (mode == 1073741824) {
            return ae(size, size);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.bzz
    public final boolean A() {
        return Build.VERSION.SDK_INT >= 30 ? cce.a.a(this) : this.x;
    }

    @Override // defpackage.bzz
    public final void B() {
        this.ao = true;
    }

    @Override // defpackage.bzz
    public final esn C() {
        return (esn) this.aD.a();
    }

    public final int D(MotionEvent motionEvent) {
        Object obj;
        if (this.aL) {
            this.aL = false;
            cdf.e(motionEvent.getMetaState());
        }
        bso bsoVar = this.ap;
        cpw cpwVarB = bsoVar.b(motionEvent, this);
        if (cpwVarB == null) {
            this.aO.b();
            return bny.x(false, false, false);
        }
        List list = cpwVarB.c;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((btb) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        btb btbVar = (btb) obj;
        if (btbVar != null) {
            this.af = btbVar.d;
        }
        int iF = this.aO.f(cpwVarB, this, Z(motionEvent));
        cpwVarB.b = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && (iF & 1) == 0) {
            bsoVar.a(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iF;
    }

    public final ccd E() {
        if (this.aq == null) {
            ccd ccdVar = new ccd(getContext());
            this.aq = ccdVar;
            addView(ccdVar);
            requestLayout();
        }
        ccd ccdVar2 = this.aq;
        ccdVar2.getClass();
        return ccdVar2;
    }

    public final void F(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        cbi cbiVar = this.n;
        if (yks.e(str, cbiVar.t)) {
            int iD2 = cbiVar.B.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!yks.e(str, cbiVar.u) || (iD = cbiVar.C.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public final void G() {
        U(this.l);
    }

    public final void H() {
        if (this.aw) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.av) {
            this.av = jCurrentAnimationTimeMillis;
            W();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.au;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = iArr[1];
            this.C = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f2 - f4) & 4294967295L);
        }
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jD = d((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jD >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jD & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        cpw cpwVarB = this.ap.b(motionEventObtain, this);
        cpwVarB.getClass();
        this.aO.f(cpwVarB, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.au
            r0.getLocationOnScreen(r1)
            long r2 = r0.at
            int r4 = defpackage.cmf.a(r2)
            int r2 = defpackage.cmf.b(r2)
            r3 = 0
            r5 = r1[r3]
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            r9 = 1
            if (r4 != r5) goto L2a
            r10 = r1[r9]
            if (r2 != r10) goto L2a
            long r10 = r0.av
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L45
        L2a:
            r1 = r1[r9]
            long r10 = (long) r5
            long r10 = r10 << r8
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.at = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r1) goto L45
            if (r2 == r1) goto L45
            bys r1 = r0.l
            byw r1 = r1.u
            bzh r1 = r1.o
            r1.B()
            r1 = r9
            goto L46
        L45:
            r1 = r3
        L46:
            r0.H()
            android.view.View r2 = r0.aM
            if (r2 != 0) goto L53
            android.view.View r2 = r0.getRootView()
            r0.aM = r2
        L53:
            cfq r4 = r0.m
            long r10 = r0.at
            long r12 = r0.C
            long r12 = defpackage.cme.d(r12)
            float[] r5 = r0.A
            int r14 = r2.getWidth()
            int r2 = r2.getHeight()
            int r15 = defpackage.ccf.q(r5)
            r15 = r15 & 2
            if (r15 != 0) goto L70
            goto L71
        L70:
            r5 = 0
        L71:
            cfr r15 = r4.b
            r16 = r6
            long r6 = r15.b
            boolean r6 = defpackage.a.s(r12, r6)
            if (r6 != 0) goto L81
            r15.b = r12
            r6 = r9
            goto L82
        L81:
            r6 = r3
        L82:
            long r12 = r15.c
            boolean r7 = defpackage.a.s(r10, r12)
            if (r7 != 0) goto L8d
            r15.c = r10
            r6 = r9
        L8d:
            if (r5 == 0) goto L91
            r5 = r3
            goto L92
        L91:
            r5 = r9
        L92:
            r5 = r5 ^ r9
            long r10 = (long) r14
            long r7 = r10 << r8
            long r10 = (long) r2
            long r10 = r10 & r16
            long r12 = r15.d
            long r7 = r7 | r10
            int r2 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r2 == 0) goto La4
            r15.d = r7
        La2:
            r3 = r9
            goto Lad
        La4:
            r2 = r5 | r6
            if (r2 != 0) goto La2
            boolean r2 = r4.c
            if (r2 == 0) goto Lad
            goto La2
        Lad:
            r4.c = r3
            bzf r2 = r0.y
            r2.b(r1)
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.J():void");
    }

    public final dhk P() {
        return (dhk) this.ax.a();
    }

    @Override // defpackage.bmt
    public final bmy a() {
        if (isFocused()) {
            return this.K.b();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return d.U(viewFindFocus, this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        cfc cfcVarP;
        ces cesVar;
        if (M()) {
            bla blaVar = this.P;
            if (blaVar != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueM70m = bb$$ExternalSyntheticApiModelOutline1.m70m(sparseArray.get(iKeyAt));
                    if (autofillValueM70m.isText()) {
                        bys bysVar = (bys) ((jc) blaVar.h.a).a(iKeyAt);
                        if (bysVar != null && (cfcVarP = bysVar.p()) != null && (cesVar = (ces) ccf.t(cfcVarP, cfb.g)) != null) {
                        }
                    } else if (autofillValueM70m.isDate()) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueM70m.isList()) {
                        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueM70m.isToggle()) {
                        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            bku bkuVar = this.u;
            if (bkuVar != null) {
                Map map = bkuVar.b.a;
                if (map.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValueM70m2 = bb$$ExternalSyntheticApiModelOutline1.m70m(sparseArray.get(iKeyAt2));
                    if (autofillValueM70m2.isText()) {
                        autofillValueM70m2.getTextValue().toString();
                        if (((blb) map.get(Integer.valueOf(iKeyAt2))) != null) {
                            throw null;
                        }
                    } else {
                        if (autofillValueM70m2.isDate()) {
                            throw new yfv("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueM70m2.isList()) {
                            throw new yfv("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueM70m2.isToggle()) {
                            throw new yfv("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.bmt
    public final void b() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // defpackage.bmt
    public final boolean c() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.n.p(false, i, this.af);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.n.p(true, i, this.af);
    }

    @Override // defpackage.bti
    public final long d(long j) {
        H();
        long jA = boa.a(this.A, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) + Float.intBitsToFloat((int) (this.C >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L)) + Float.intBitsToFloat((int) (this.C & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [bnp, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            U(this.l);
        }
        q(true);
        bcm.v();
        this.s = true;
        ?? r0 = this.aP.a;
        Canvas canvas2 = ((bnb) r0).a;
        ((bnb) r0).a = canvas;
        View view = null;
        this.l.A(r0, null);
        ((bnb) r0).a = canvas2;
        List list = this.q;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((bzx) list.get(i)).i();
            }
        }
        int i2 = cdu.a;
        list.clear();
        this.s = false;
        List list2 = this.r;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
        if (this.g) {
            ccf.a(this, this.aG);
            View view2 = this.ai;
            if (view2 == null) {
                yks.c("frameRateCategoryView");
                view2 = null;
            }
            ccf.a(view2, this.aH);
            if (!Float.isNaN(this.aH)) {
                View view3 = this.ai;
                if (view3 == null) {
                    yks.c("frameRateCategoryView");
                    view3 = null;
                }
                view3.invalidate();
                View view4 = this.ai;
                if (view4 == null) {
                    yks.c("frameRateCategoryView");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.aG = Float.NaN;
            this.aH = Float.NaN;
        }
        this.m.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [bko] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [bko] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [bfz] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [bfz] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r2v14, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v15, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v19, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v20, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        bru bruVar;
        int size;
        bzm bzmVar;
        bxw bxwVarF;
        bzm bzmVar2;
        btw btwVar;
        int size2;
        bzm bzmVar3;
        bko bkoVarF;
        bzm bzmVar4;
        if (this.J) {
            Runnable runnable = this.aI;
            removeCallbacks(runnable);
            if (motionEvent.getActionMasked() == 8) {
                this.J = false;
            } else {
                runnable.run();
            }
        }
        if (ad(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (Q(motionEvent) & 1) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f = -motionEvent.getAxisValue(26);
            btx btxVar = new btx(cwy.b(viewConfiguration, getContext()) * f, f * cwy.a(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId());
            bmh bmhVar = this.K;
            bmq bmqVar = new bmq(this, motionEvent, 7);
            if (bmhVar.c.a) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            bmr bmrVarA = bmhVar.a();
            if (bmrVarA != null) {
                if (!bmrVarA.q.A) {
                    bty.c("visitAncestors called on an unattached node");
                }
                bko bkoVar = bmrVarA.q;
                bys bysVarI = fh.I(bmrVarA);
                loop0: while (true) {
                    if (bysVarI == null) {
                        bkoVarF = null;
                        break;
                    }
                    if ((bysVarI.t.f.s & 16384) != 0) {
                        while (bkoVar != null) {
                            if ((bkoVar.r & 16384) != 0) {
                                bkoVarF = bkoVar;
                                bfz bfzVar = null;
                                while (bkoVarF != null) {
                                    if (bkoVarF instanceof btw) {
                                        break loop0;
                                    }
                                    if ((bkoVarF.r & 16384) != 0 && (bkoVarF instanceof bxw)) {
                                        int i = 0;
                                        for (bko bkoVar2 = ((bxw) bkoVarF).C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                                            if ((bkoVar2.r & 16384) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    bkoVarF = bkoVar2;
                                                } else {
                                                    if (bfzVar == null) {
                                                        bfzVar = new bfz(new bko[16], 0);
                                                    }
                                                    if (bkoVarF != null) {
                                                        bfzVar.o(bkoVarF);
                                                    }
                                                    bfzVar.o(bkoVar2);
                                                    bkoVarF = null;
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    bkoVarF = fh.F(bfzVar);
                                }
                            }
                            bkoVar = bkoVar.t;
                        }
                    }
                    bysVarI = bysVarI.j();
                    bkoVar = (bysVarI == null || (bzmVar4 = bysVarI.t) == null) ? null : bzmVar4.e;
                }
                btwVar = (btw) bkoVarF;
            } else {
                btwVar = null;
            }
            if (btwVar != null) {
                if (!btwVar.q.A) {
                    bty.c("visitAncestors called on an unattached node");
                }
                bko bkoVar3 = btwVar.q.t;
                bys bysVarI2 = fh.I(btwVar);
                ArrayList arrayList = null;
                while (bysVarI2 != null) {
                    if ((bysVarI2.t.f.s & 16384) != 0) {
                        while (bkoVar3 != null) {
                            if ((bkoVar3.r & 16384) != 0) {
                                bko bkoVarF2 = bkoVar3;
                                bfz bfzVar2 = null;
                                while (bkoVarF2 != null) {
                                    if (bkoVarF2 instanceof btw) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(bkoVarF2);
                                    } else if ((bkoVarF2.r & 16384) != 0 && (bkoVarF2 instanceof bxw)) {
                                        int i2 = 0;
                                        for (bko bkoVar4 = ((bxw) bkoVarF2).C; bkoVar4 != null; bkoVar4 = bkoVar4.u) {
                                            if ((bkoVar4.r & 16384) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    bkoVarF2 = bkoVar4;
                                                } else {
                                                    if (bfzVar2 == null) {
                                                        bfzVar2 = new bfz(new bko[16], 0);
                                                    }
                                                    if (bkoVarF2 != null) {
                                                        bfzVar2.o(bkoVarF2);
                                                    }
                                                    bfzVar2.o(bkoVar4);
                                                    bkoVarF2 = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    bkoVarF2 = fh.F(bfzVar2);
                                }
                            }
                            bkoVar3 = bkoVar3.t;
                        }
                    }
                    bysVarI2 = bysVarI2.j();
                    bkoVar3 = (bysVarI2 == null || (bzmVar3 = bysVarI2.t) == null) ? null : bzmVar3.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (i3 < 0) {
                            break;
                        }
                        size2 = i3;
                    }
                }
                bko bkoVarF3 = btwVar.q;
                bfz bfzVar3 = null;
                while (bkoVarF3 != null) {
                    if (bkoVarF3 instanceof btw) {
                    } else if ((bkoVarF3.r & 16384) != 0 && (bkoVarF3 instanceof bxw)) {
                        int i4 = 0;
                        for (bko bkoVar5 = ((bxw) bkoVarF3).C; bkoVar5 != null; bkoVar5 = bkoVar5.u) {
                            if ((bkoVar5.r & 16384) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    bkoVarF3 = bkoVar5;
                                } else {
                                    if (bfzVar3 == null) {
                                        bfzVar3 = new bfz(new bko[16], 0);
                                    }
                                    if (bkoVarF3 != null) {
                                        bfzVar3.o(bkoVarF3);
                                    }
                                    bfzVar3.o(bkoVar5);
                                    bkoVarF3 = null;
                                }
                            }
                        }
                        if (i4 != 1) {
                        }
                    }
                    bkoVarF3 = fh.F(bfzVar3);
                }
                if (((Boolean) bmqVar.a()).booleanValue()) {
                    return true;
                }
                bko bkoVarF4 = btwVar.q;
                bfz bfzVar4 = null;
                while (bkoVarF4 != null) {
                    if (bkoVarF4 instanceof btw) {
                        ((btw) bkoVarF4).b(btxVar);
                    } else if ((bkoVarF4.r & 16384) != 0 && (bkoVarF4 instanceof bxw)) {
                        int i5 = 0;
                        for (bko bkoVar6 = ((bxw) bkoVarF4).C; bkoVar6 != null; bkoVar6 = bkoVar6.u) {
                            if ((bkoVar6.r & 16384) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    bkoVarF4 = bkoVar6;
                                } else {
                                    if (bfzVar4 == null) {
                                        bfzVar4 = new bfz(new bko[16], 0);
                                    }
                                    if (bkoVarF4 != null) {
                                        bfzVar4.o(bkoVarF4);
                                    }
                                    bfzVar4.o(bkoVar6);
                                    bkoVarF4 = null;
                                }
                            }
                        }
                        if (i5 != 1) {
                        }
                    }
                    bkoVarF4 = fh.F(bfzVar4);
                }
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        ((btw) arrayList.get(i6)).b(btxVar);
                    }
                }
            }
            return false;
        }
        if (!motionEvent.isFromSource(2)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Float.floatToRawIntBits(x);
            Float.floatToRawIntBits(y);
            motionEvent.getEventTime();
            motionEvent.getActionMasked();
            bmh bmhVar2 = this.K;
            bmq bmqVar2 = new bmq(this, motionEvent, 5);
            if (bmhVar2.c.a) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            } else {
                bmr bmrVarA2 = bmhVar2.a();
                if (bmrVarA2 != null) {
                    if (!bmrVarA2.q.A) {
                        bty.c("visitAncestors called on an unattached node");
                    }
                    bko bkoVar7 = bmrVarA2.q;
                    bys bysVarI3 = fh.I(bmrVarA2);
                    loop14: while (true) {
                        if (bysVarI3 == null) {
                            bxwVarF = 0;
                            break;
                        }
                        if ((bysVarI3.t.f.s & 2097152) != 0) {
                            while (bkoVar7 != null) {
                                if ((bkoVar7.r & 2097152) != 0) {
                                    bxwVarF = bkoVar7;
                                    ?? bfzVar5 = 0;
                                    while (bxwVarF != 0) {
                                        if (bxwVarF instanceof bru) {
                                            break loop14;
                                        }
                                        if ((bxwVarF.r & 2097152) != 0 && (bxwVarF instanceof bxw)) {
                                            bko bkoVar8 = bxwVarF.C;
                                            int i7 = 0;
                                            bxwVarF = bxwVarF;
                                            bfzVar5 = bfzVar5;
                                            while (bkoVar8 != null) {
                                                if ((bkoVar8.r & 2097152) != 0) {
                                                    i7++;
                                                    bfzVar5 = bfzVar5;
                                                    if (i7 == 1) {
                                                        bxwVarF = bkoVar8;
                                                    } else {
                                                        if (bfzVar5 == 0) {
                                                            bfzVar5 = new bfz(new bko[16], 0);
                                                        }
                                                        if (bxwVarF != 0) {
                                                            bfzVar5.o(bxwVarF);
                                                        }
                                                        bfzVar5.o(bkoVar8);
                                                        bxwVarF = 0;
                                                    }
                                                }
                                                bkoVar8 = bkoVar8.u;
                                                bxwVarF = bxwVarF;
                                                bfzVar5 = bfzVar5;
                                            }
                                            if (i7 != 1) {
                                            }
                                        }
                                        bxwVarF = fh.F(bfzVar5);
                                    }
                                }
                                bkoVar7 = bkoVar7.t;
                            }
                        }
                        bysVarI3 = bysVarI3.j();
                        bkoVar7 = (bysVarI3 == null || (bzmVar2 = bysVarI3.t) == null) ? null : bzmVar2.e;
                    }
                    bruVar = (bru) bxwVarF;
                } else {
                    bruVar = null;
                }
                if (bruVar != null) {
                    if (!bruVar.E().A) {
                        bty.c("visitAncestors called on an unattached node");
                    }
                    bko bkoVar9 = bruVar.E().t;
                    bys bysVarI4 = fh.I(bruVar);
                    ArrayList arrayList2 = null;
                    while (bysVarI4 != null) {
                        if ((bysVarI4.t.f.s & 2097152) != 0) {
                            while (bkoVar9 != null) {
                                if ((bkoVar9.r & 2097152) != 0) {
                                    bko bkoVarF5 = bkoVar9;
                                    bfz bfzVar6 = null;
                                    while (bkoVarF5 != null) {
                                        if (bkoVarF5 instanceof bru) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(bkoVarF5);
                                        } else if ((bkoVarF5.r & 2097152) != 0 && (bkoVarF5 instanceof bxw)) {
                                            int i8 = 0;
                                            for (bko bkoVar10 = ((bxw) bkoVarF5).C; bkoVar10 != null; bkoVar10 = bkoVar10.u) {
                                                if ((bkoVar10.r & 2097152) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        bkoVarF5 = bkoVar10;
                                                    } else {
                                                        if (bfzVar6 == null) {
                                                            bfzVar6 = new bfz(new bko[16], 0);
                                                        }
                                                        if (bkoVarF5 != null) {
                                                            bfzVar6.o(bkoVarF5);
                                                        }
                                                        bfzVar6.o(bkoVar10);
                                                        bkoVarF5 = null;
                                                    }
                                                }
                                            }
                                            if (i8 != 1) {
                                            }
                                        }
                                        bkoVarF5 = fh.F(bfzVar6);
                                    }
                                }
                                bkoVar9 = bkoVar9.t;
                            }
                        }
                        bysVarI4 = bysVarI4.j();
                        bkoVar9 = (bysVarI4 == null || (bzmVar = bysVarI4.t) == null) ? null : bzmVar.e;
                    }
                    if (arrayList2 != null && arrayList2.size() - 1 >= 0) {
                        while (true) {
                            int i9 = size - 1;
                            if (((bru) arrayList2.get(size)).b()) {
                                break;
                            }
                            if (i9 < 0) {
                                break;
                            }
                            size = i9;
                        }
                    }
                    bxw bxwVarE = bruVar.E();
                    ?? bfzVar7 = 0;
                    while (true) {
                        if (bxwVarE != 0) {
                            if (bxwVarE instanceof bru) {
                                if (((bru) bxwVarE).b()) {
                                    break;
                                }
                            } else if ((bxwVarE.r & 2097152) != 0 && (bxwVarE instanceof bxw)) {
                                bko bkoVar11 = bxwVarE.C;
                                int i10 = 0;
                                bxwVarE = bxwVarE;
                                bfzVar7 = bfzVar7;
                                while (bkoVar11 != null) {
                                    if ((bkoVar11.r & 2097152) != 0) {
                                        i10++;
                                        bfzVar7 = bfzVar7;
                                        if (i10 == 1) {
                                            bxwVarE = bkoVar11;
                                        } else {
                                            if (bfzVar7 == 0) {
                                                bfzVar7 = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarE != 0) {
                                                bfzVar7.o(bxwVarE);
                                            }
                                            bfzVar7.o(bkoVar11);
                                            bxwVarE = 0;
                                        }
                                    }
                                    bkoVar11 = bkoVar11.u;
                                    bxwVarE = bxwVarE;
                                    bfzVar7 = bfzVar7;
                                }
                                if (i10 != 1) {
                                }
                            }
                            bxwVarE = fh.F(bfzVar7);
                        } else if (!((Boolean) bmqVar2.a()).booleanValue()) {
                            bxw bxwVarE2 = bruVar.E();
                            ?? bfzVar8 = 0;
                            while (true) {
                                if (bxwVarE2 != 0) {
                                    if (bxwVarE2 instanceof bru) {
                                        if (((bru) bxwVarE2).a()) {
                                            break;
                                        }
                                    } else if ((bxwVarE2.r & 2097152) != 0 && (bxwVarE2 instanceof bxw)) {
                                        bko bkoVar12 = bxwVarE2.C;
                                        int i11 = 0;
                                        bxwVarE2 = bxwVarE2;
                                        bfzVar8 = bfzVar8;
                                        while (bkoVar12 != null) {
                                            if ((bkoVar12.r & 2097152) != 0) {
                                                i11++;
                                                bfzVar8 = bfzVar8;
                                                if (i11 == 1) {
                                                    bxwVarE2 = bkoVar12;
                                                } else {
                                                    if (bfzVar8 == 0) {
                                                        bfzVar8 = new bfz(new bko[16], 0);
                                                    }
                                                    if (bxwVarE2 != 0) {
                                                        bfzVar8.o(bxwVarE2);
                                                    }
                                                    bfzVar8.o(bkoVar12);
                                                    bxwVarE2 = 0;
                                                }
                                            }
                                            bkoVar12 = bkoVar12.u;
                                            bxwVarE2 = bxwVarE2;
                                            bfzVar8 = bfzVar8;
                                        }
                                        if (i11 != 1) {
                                        }
                                    }
                                    bxwVarE2 = fh.F(bfzVar8);
                                } else if (arrayList2 != null) {
                                    int size4 = arrayList2.size();
                                    for (int i12 = 0; i12 < size4; i12++) {
                                        if (!((bru) arrayList2.get(i12)).a()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (this.J) {
            Runnable runnable = this.aI;
            removeCallbacks(runnable);
            runnable.run();
        }
        if (!ad(motionEvent) && isAttachedToWindow()) {
            cbi cbiVar = this.n;
            if (cbiVar.t()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    cbc cbcVar = cbiVar.b;
                    cbcVar.q(true);
                    byg bygVar = new byg();
                    cbcVar.l.al((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), bygVar, true);
                    for (int iQ = yfm.q(bygVar); iQ >= 0; iQ--) {
                        bys bysVarI = fh.I(bygVar.get(iQ));
                        if (((cmv) cbcVar.E().b.get(bysVarI)) != null) {
                            break;
                        }
                        if (bysVarI.t.j(8)) {
                            int iD = cbiVar.d(bysVarI.c);
                            cff cffVarS = ccf.s(bysVarI, false);
                            if (cfg.b(cffVarS) && !cffVarS.f().f(cfi.z)) {
                                i = iD;
                                break;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    cbcVar.E().dispatchGenericMotionEvent(motionEvent);
                    cbiVar.o(i);
                } else if (action == 10) {
                    if (cbiVar.c != Integer.MIN_VALUE) {
                        cbiVar.o(Integer.MIN_VALUE);
                    } else {
                        cbiVar.b.E().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && Z(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.H;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.H = MotionEvent.obtainNoHistory(motionEvent);
                    this.J = true;
                    postDelayed(this.aI, 8L);
                    return false;
                }
            } else if (!aa(motionEvent)) {
                return false;
            }
            if ((Q(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.K.g(keyEvent, new bmq(this, keyEvent, 6));
        }
        cdf.e(keyEvent.getMetaState());
        return this.K.g(keyEvent, bmf.a) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v11, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v12, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [bko] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [bko] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [bko] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [bko] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [bfz] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [bfz] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.dispatchKeyEventPreIme(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            cbj.a.a(viewStructure, this);
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            Runnable runnable = this.aI;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.H;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || ac(motionEvent, motionEvent2)) {
                runnable.run();
            } else {
                this.J = false;
            }
        }
        if (ad(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !aa(motionEvent))) {
            return false;
        }
        int iQ = Q(motionEvent);
        if ((iQ & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iQ & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return R(i, this);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        bmy bmyVarU;
        if (view == null || this.y.b) {
            return super.focusSearch(view, i);
        }
        ccw ccwVar = ccy.a;
        View viewA = cbp.q().a(this, view, i);
        if (view != this || (bmyVarU = this.K.b()) == null) {
            bmyVarU = d.U(view, this);
        }
        blz blzVarT = d.T(i);
        int i2 = blzVarT != null ? blzVarT.a : 6;
        ylf ylfVar = new ylf();
        if (this.K.c(i2, bmyVarU, new brj(ylfVar, 13)) != null) {
            Object obj = ylfVar.a;
            if (obj != null) {
                if (viewA != null) {
                    if (d.R(i2)) {
                        return super.focusSearch(view, i);
                    }
                    if (!d.B(d.I((bmr) obj), d.U(viewA, this), bmyVarU, i2)) {
                    }
                }
                return this;
            }
            if (viewA != null) {
            }
            return viewA;
        }
        return view;
    }

    @Override // defpackage.bti
    public final long g(long j) {
        H();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.C >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.C & 4294967295L));
        return boa.a(this.B, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        bmy bmyVarA = a();
        if (bmyVarA != null) {
            rect.left = Math.round(bmyVarA.b);
            rect.top = Math.round(bmyVarA.c);
            rect.right = Math.round(bmyVarA.d);
            rect.bottom = Math.round(bmyVarA.e);
            return;
        }
        if (yks.e(this.K.c(6, null, bzg.q), true)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.bzz
    public final bzx h(yjz yjzVar, yjk yjkVar, bpu bpuVar) {
        Object obj;
        if (bpuVar != null) {
            return new cdc(bpuVar, null, this, yjzVar, yjkVar);
        }
        dhk dhkVar = this.aa;
        dhkVar.d();
        while (true) {
            bfz bfzVar = (bfz) dhkVar.b;
            int i = bfzVar.b;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) bfzVar.d(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        bzx bzxVar = (bzx) obj;
        if (bzxVar != null) {
            bzxVar.g(yjzVar, yjkVar);
            return bzxVar;
        }
        bnf bnfVar = this.O;
        return new cdc(bnfVar.a(), bnfVar, this, yjzVar, yjkVar);
    }

    @Override // defpackage.bzz
    public final cab i() {
        return this.w;
    }

    @Override // defpackage.duv
    public final void k() {
        if (Build.VERSION.SDK_INT < 30) {
            this.x = cbp.F();
        }
    }

    @Override // defpackage.bzz
    public final clx m() {
        return (clx) this.ah.a();
    }

    @Override // defpackage.bzz
    public final cmi n() {
        return (cmi) this.aF.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bzz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.yjz r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cbb
            if (r0 == 0) goto L13
            r0 = r7
            cbb r0 = (defpackage.cbb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbb r0 = new cbb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.ybn.f(r7)
            goto L44
        L2f:
            defpackage.ybn.f(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.aC
            brj r2 = new brj
            r4 = 17
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.bks.b(r7, r2, r6, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            yfs r6 = new yfs
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.o(yjz, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dvk, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        dve lifecycle;
        Object obj;
        bku bkuVar;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 30) {
            this.x = cbp.F();
        }
        if (Build.VERSION.SDK_INT > 28) {
            if (d == null) {
                ehq ehqVar = new ehq(1);
                d = ehqVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (a == null) {
                        a = Class.forName("android.os.SystemProperties");
                    }
                    if (c == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = a;
                        c = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = c;
                    if (method != null) {
                        method.invoke(null, ehqVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            kc kcVar = M;
            synchronized (kcVar) {
                kcVar.p(this);
            }
        }
        cdf cdfVar = this.j;
        cdfVar.c(hasWindowFocus());
        cdfVar.b(new bms(this, 18));
        Y();
        bys bysVar = this.l;
        V(bysVar);
        U(bysVar);
        this.w.a.d();
        if (M() && (bkuVar = this.u) != null) {
            bkuVar.c.registerCallback(bkz.a);
        }
        dvk dvkVarE = dwf.e(this);
        ghe gheVarV = gez.v(this);
        dhk dhkVarP = P();
        if (dhkVarP == null || (dvkVarE != null && gheVarV != null && (dvkVarE != (obj = dhkVarP.a) || gheVarV != obj))) {
            if (dvkVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (gheVarV == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (dhkVarP != null && (lifecycle = dhkVarP.a.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            dvkVarE.getLifecycle().c(this);
            dhk dhkVar = new dhk(dvkVarE, gheVarV, (byte[]) null);
            this.D.b(dhkVar);
            yjv yjvVar = this.E;
            if (yjvVar != null) {
                yjvVar.a(dhkVar);
            }
            this.E = null;
        }
        this.ab.m(true != isInTouchMode() ? 2 : 1);
        dhk dhkVarP2 = P();
        dve lifecycle2 = dhkVarP2 != null ? dhkVarP2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            bty.a("No lifecycle owner exists");
            throw new yfs();
        }
        lifecycle2.c(this);
        lifecycle2.c(this.o);
        getViewTreeObserver().addOnGlobalLayoutListener(this.ay);
        getViewTreeObserver().addOnScrollChangedListener(this.az);
        getViewTreeObserver().addOnTouchModeChangeListener(this.aA);
        if (Build.VERSION.SDK_INT >= 31) {
            cbm.a.b(this);
        }
        bla blaVar = this.P;
        if (blaVar != null) {
            this.K.f.p(blaVar);
            ((kc) this.U.d).p(blaVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        bmd bmdVar;
        cbv cbvVar = (cbv) bks.a(this.aC);
        return (cbvVar == null || (bmdVar = (bmd) bks.a(cbvVar.d)) == null || bmdVar.a) ? false : true;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ah.b(clw.q(getContext()));
        Y();
        if (ab(configuration) != this.aE) {
            this.aE = ab(configuration);
            this.aD.b(cko.y(getContext()));
        }
        this.t.a(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        bmd bmdVar;
        int i;
        int i2;
        cbv cbvVar = (cbv) bks.a(this.aC);
        if (cbvVar != null && (bmdVar = (bmd) bks.a(cbvVar.d)) != null) {
            synchronized (bmdVar.d) {
                if (bmdVar.a) {
                    return null;
                }
                Object obj = bmdVar.c;
                akb akbVar = ((aij) obj).a;
                cka ckaVar = ((aij) obj).b;
                sp spVar = ((aij) obj).c;
                aip aipVar = ((aij) obj).h;
                yjv yjvVar = ((aij) obj).d;
                aiu aiuVar = ((aij) obj).e;
                lhr lhrVar = ((aij) obj).i;
                yjk yjkVar = ((aij) obj).f;
                cds cdsVar = ((aij) obj).g;
                String[] strArr = aim.a;
                aik aikVar = new aik(new aiv(akbVar), akbVar, aipVar, yjvVar, spVar, aiuVar, lhrVar, yjkVar, cdsVar);
                ahx ahxVarE = akbVar.e();
                long j = akbVar.e().d;
                String[] strArr2 = spVar != null ? aim.a : null;
                int i3 = ckaVar.e;
                if (a.r(i3, 1)) {
                    i = ckaVar.a ? 6 : 0;
                } else if (a.r(i3, 0)) {
                    i = 1;
                } else if (a.r(i3, 2)) {
                    i = 2;
                } else if (a.r(i3, 6)) {
                    i = 5;
                } else if (a.r(i3, 5)) {
                    i = 7;
                } else if (a.r(i3, 3)) {
                    i = 3;
                } else if (a.r(i3, 4)) {
                    i = 4;
                } else if (!a.r(i3, 7)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                editorInfo.imeOptions = i;
                ckq ckqVar = ckaVar.f;
                if (yks.e(ckqVar, ckq.a)) {
                    editorInfo.hintLocales = null;
                } else {
                    ArrayList arrayList = new ArrayList(yfm.z(ckqVar, 10));
                    Iterator<E> it = ckqVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ckp) it.next()).a);
                    }
                    Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                    editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                }
                int i4 = ckaVar.d;
                if (a.r(i4, 1)) {
                    i2 = 1;
                } else if (a.r(i4, 2)) {
                    editorInfo.imeOptions |= Integer.MIN_VALUE;
                    i2 = 1;
                } else if (a.r(i4, 3)) {
                    i2 = 2;
                } else if (a.r(i4, 4)) {
                    i2 = 3;
                } else if (a.r(i4, 5)) {
                    i2 = 17;
                } else if (a.r(i4, 6)) {
                    i2 = 33;
                } else if (a.r(i4, 7)) {
                    i2 = 129;
                } else if (a.r(i4, 8)) {
                    i2 = 18;
                } else {
                    if (!a.r(i4, 9)) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    i2 = 8194;
                }
                editorInfo.inputType = i2;
                if (!ckaVar.a && hu.M(editorInfo.inputType)) {
                    editorInfo.inputType |= 131072;
                    if (a.r(i3, 1)) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                if (hu.M(editorInfo.inputType)) {
                    int i5 = ckaVar.b;
                    if (a.r(i5, 1)) {
                        editorInfo.inputType |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    } else if (a.r(i5, 2)) {
                        editorInfo.inputType |= 8192;
                    } else if (a.r(i5, 3)) {
                        editorInfo.inputType |= 16384;
                    }
                    boolean z = ckaVar.c;
                    editorInfo.inputType |= 32768;
                }
                editorInfo.initialSelStart = chb.e(j);
                editorInfo.initialSelEnd = chb.a(j);
                czd.b(editorInfo, ahxVarE);
                if (strArr2 != null) {
                    czd.a(editorInfo, strArr2);
                }
                editorInfo.imeOptions |= 33554432;
                if (!aht.a || a.r(i4, 7) || a.r(i4, 8)) {
                    czd.c(editorInfo, false);
                } else {
                    czd.c(editorInfo, true);
                    editorInfo.setSupportedHandwritingGestures(yfm.s(fd$$ExternalSyntheticApiModelOutline0.m390m$1(), fd$$ExternalSyntheticApiModelOutline0.m$5(), fd$$ExternalSyntheticApiModelOutline0.m$6(), fd$$ExternalSyntheticApiModelOutline0.m384m(), fd$$ExternalSyntheticApiModelOutline0.m$2(), fd$$ExternalSyntheticApiModelOutline0.m$3(), fd$$ExternalSyntheticApiModelOutline0.m$4()));
                    editorInfo.setSupportedHandwritingGesturePreviews(yfm.aZ(new Class[]{fd$$ExternalSyntheticApiModelOutline0.m390m$1(), fd$$ExternalSyntheticApiModelOutline0.m$5(), fd$$ExternalSyntheticApiModelOutline0.m$6(), fd$$ExternalSyntheticApiModelOutline0.m384m()}));
                }
                ajf ajfVar = new ajf(aikVar, editorInfo);
                cbq cbqVar = new cbq(bmdVar, 5);
                InputConnection ckhVar = Build.VERSION.SDK_INT >= 34 ? new ckh(ajfVar, cbqVar) : Build.VERSION.SDK_INT >= 25 ? new ckg(ajfVar, cbqVar) : new ckf(ajfVar, cbqVar);
                ((bfz) bmdVar.b).o(new cam(ckhVar));
                return ckhVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        Object obj;
        for (long j : jArr) {
            blj bljVar = this.o;
            dhk dhkVar = (dhk) bljVar.a().a((int) j);
            if (dhkVar != null && (obj = dhkVar.b) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(bljVar.a.getAutofillId(), r2.e);
                List list = (List) ccf.t(((cff) obj).c, cfi.A);
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new cfy(cmq.d(list, "\n", null, null, null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [dvk, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        bku bkuVar;
        super.onDetachedFromWindow();
        if (this.g) {
            View view = this.ai;
            if (view == null) {
                yks.c("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            kc kcVar = M;
            synchronized (kcVar) {
                kcVar.o(this);
            }
        }
        bji bjiVar = this.w.a;
        bjiVar.e();
        bjiVar.a();
        this.j.b(null);
        dhk dhkVarP = P();
        dve lifecycle = dhkVarP != null ? dhkVarP.a.getLifecycle() : null;
        if (lifecycle == null) {
            bty.a("No lifecycle owner exists");
            throw new yfs();
        }
        lifecycle.d(this.o);
        lifecycle.d(this);
        if (M() && (bkuVar = this.u) != null) {
            bkuVar.c.unregisterCallback(bkz.a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.ay);
        getViewTreeObserver().removeOnScrollChangedListener(this.az);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.aA);
        if (Build.VERSION.SDK_INT >= 31) {
            cbm.a.a(this);
        }
        bla blaVar = this.P;
        if (blaVar != null) {
            ((kc) this.U.d).o(blaVar);
            this.K.f.o(blaVar);
        }
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        d.L(this.K.b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.av = 0L;
        this.y.i(this.aJ);
        this.ar = null;
        J();
        if (this.aq != null) {
            E().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                V(this.l);
            }
            long jAf = af(i);
            long jAf2 = af(i2);
            long jM = clw.m((int) (jAf >>> 32), (int) (jAf & 4294967295L), (int) (jAf2 >>> 32), (int) (4294967295L & jAf2));
            clv clvVar = this.ar;
            if (clvVar == null) {
                this.ar = new clv(jM);
                this.as = false;
            } else if (!a.s(clvVar.a, jM)) {
                this.as = true;
            }
            bzf bzfVar = this.y;
            clv clvVar2 = bzfVar.f;
            if (clvVar2 == null || !a.s(clvVar2.a, jM)) {
                if (bzfVar.b) {
                    bty.b("updateRootConstraints called while measuring");
                }
                bzfVar.f = new clv(jM);
                bys bysVar = bzfVar.a;
                if (bysVar.h != null) {
                    bysVar.K();
                }
                bysVar.L();
                bzfVar.h.d(bysVar, bysVar.h != null ? 1 : 3);
            }
            eyy eyyVar = bzfVar.h;
            if (eyyVar.a()) {
                bys bysVar2 = bzfVar.a;
                if (!bysVar2.af()) {
                    bty.b("performMeasureAndLayout called with unattached root");
                }
                if (!bysVar2.ag()) {
                    bty.b("performMeasureAndLayout called with unplaced root");
                }
                if (bzfVar.b) {
                    bty.b("performMeasureAndLayout called during measure layout");
                }
                if (bzfVar.f != null) {
                    bzfVar.b = true;
                    bzfVar.c = false;
                    try {
                        if (!eyyVar.a) {
                            if (bysVar2.h != null) {
                                bzfVar.g(bysVar2, true);
                            } else {
                                bzfVar.f(bysVar2);
                            }
                        }
                        bzfVar.g(bysVar2, false);
                        bzfVar.b = false;
                        bzfVar.c = false;
                        cbp cbpVar = bzfVar.i;
                    } finally {
                    }
                }
            }
            bys bysVar3 = this.l;
            setMeasuredDimension(bysVar3.g(), bysVar3.e());
            if (this.aq != null) {
                E().measure(View.MeasureSpec.makeMeasureSpec(bysVar3.g(), 1073741824), View.MeasureSpec.makeMeasureSpec(bysVar3.e(), 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            r11 = this;
            boolean r13 = M()
            if (r13 == 0) goto Lf7
            if (r12 == 0) goto Lf7
            bla r13 = r11.P
            r0 = 1
            if (r13 == 0) goto La0
            dfb r1 = r13.h
            android.view.autofill.AutofillId r2 = r13.e
            java.lang.String r3 = r13.c
            cfq r4 = r13.b
            java.lang.Object r1 = r1.c
            r5 = r1
            bys r5 = (defpackage.bys) r5
            defpackage.bdi.q(r12, r5, r2, r3, r4)
            kc r1 = defpackage.kd.c(r1, r12)
        L21:
            boolean r2 = r1.g()
            if (r2 == 0) goto La0
            int r2 = r1.b
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.h(r2)
            r2.getClass()
            android.view.ViewStructure r2 = (android.view.ViewStructure) r2
            int r5 = r1.b
            int r5 = r5 + (-1)
            java.lang.Object r5 = r1.h(r5)
            r5.getClass()
            bys r5 = (defpackage.bys) r5
            java.util.List r5 = r5.t()
            int r6 = r5.size()
            r7 = 0
        L4a:
            if (r7 >= r6) goto L21
            java.lang.Object r8 = r5.get(r7)
            bys r8 = (defpackage.bys) r8
            boolean r9 = r8.z
            if (r9 != 0) goto L9d
            boolean r9 = r8.af()
            if (r9 == 0) goto L9d
            boolean r9 = r8.ag()
            if (r9 != 0) goto L63
            goto L9d
        L63:
            cfc r9 = r8.p()
            if (r9 == 0) goto L97
            ki r9 = r9.c
            cfm r10 = defpackage.cfb.g
            boolean r10 = defpackage.ki.e(r9, r10)
            if (r10 != 0) goto L83
            cfm r10 = defpackage.cfi.q
            boolean r10 = defpackage.ki.e(r9, r10)
            if (r10 != 0) goto L83
            cfm r10 = defpackage.cfi.r
            boolean r9 = defpackage.ki.e(r9, r10)
            if (r9 == 0) goto L97
        L83:
            int r9 = r2.addChildCount(r0)
            android.view.ViewStructure r9 = r2.newChild(r9)
            android.view.autofill.AutofillId r10 = r13.e
            defpackage.bdi.q(r9, r8, r10, r3, r4)
            r1.p(r8)
            r1.p(r9)
            goto L9d
        L97:
            r1.p(r8)
            r1.p(r2)
        L9d:
            int r7 = r7 + 1
            goto L4a
        La0:
            bku r13 = r11.u
            if (r13 == 0) goto Lf7
            blc r1 = r13.b
            java.util.Map r1 = r1.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Laf
            goto Lf7
        Laf:
            int r2 = r1.size()
            int r2 = r12.addChildCount(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto Lc6
            goto Lf7
        Lc6:
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.getValue()
            blb r1 = (defpackage.blb) r1
            android.view.ViewStructure r12 = r12.newChild(r2)
            android.view.autofill.AutofillId r1 = r13.d
            defpackage.bb$$ExternalSyntheticApiModelOutline1.m(r12, r1, r3)
            android.view.View r13 = r13.a
            android.content.Context r13 = r13.getContext()
            java.lang.String r13 = r13.getPackageName()
            defpackage.bdi.u(r12, r3, r13)
            defpackage.bb$$ExternalSyntheticApiModelOutline1.m(r12, r0)
            r12 = 0
            throw r12
        Lf7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        bsw bswVar;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (bswVar = this.L.b) == null) ? super.onResolvePointerIcon(motionEvent, i) : cbn.b(getContext(), bswVar);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.ag) {
            cmi cmiVarV = d.V(i);
            if (cmiVarV == null) {
                cmiVarV = cmi.a;
            }
            this.aF.b(cmiVarV);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        cvw cvwVar;
        if (Build.VERSION.SDK_INT >= 31 && (cvwVar = this.W) != null) {
            dfb dfbVar = this.U;
            yil yilVar = this.h;
            bfz bfzVar = new bfz(new cer[16], 0);
            ccf.v(dfbVar.e(), 0, new ceq(bfzVar, 0));
            bfzVar.k(new yib(new yjv[]{ccu.e, ccu.f}));
            int i = bfzVar.b;
            cer cerVar = (cer) (i == 0 ? null : bfzVar.a[i - 1]);
            if (cerVar != null) {
                yow yowVarL = yoz.l(yilVar);
                cff cffVar = cerVar.a;
                cmg cmgVar = cerVar.c;
                cel celVar = new cel(cffVar, cmgVar, yowVarL, cvwVar, this);
                bmy bmyVarU = bty.u(cerVar.d);
                long jD = cmgVar.d();
                ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, bnj.n(clw.A(bmyVarU)), new Point(cmf.a(jD), cmf.b(jD)), celVar);
                scrollCaptureTarget.setScrollBounds(bnj.n(cmgVar));
                consumer.accept(scrollCaptureTarget);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        blj bljVar = this.o;
        if (yks.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            bga.B(bljVar, longSparseArray);
        } else {
            bljVar.a.post(new be(bljVar, longSparseArray, 9));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zF;
        this.j.c(z);
        this.aL = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || A() == (zF = cbp.F())) {
            return;
        }
        this.x = zF;
        G();
    }

    @Override // defpackage.bzz
    public final void p(bys bysVar, boolean z) {
        this.y.e(bysVar, z);
    }

    @Override // defpackage.bzz
    public final void q(boolean z) {
        yjk yjkVar;
        bzf bzfVar = this.y;
        if (bzfVar.h() || ((bfz) bzfVar.g.a).b != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    yjkVar = this.aJ;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                yjkVar = null;
            }
            if (bzfVar.i(yjkVar)) {
                requestLayout();
            }
            bzfVar.b(false);
            T();
            Trace.endSection();
        }
    }

    @Override // defpackage.bzz
    public final void r(bys bysVar, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            bzf bzfVar = this.y;
            if (!bysVar.z) {
                bys bysVar2 = bzfVar.a;
                if (yks.e(bysVar, bysVar2)) {
                    bty.b("measureAndLayout called on root");
                }
                if (!bysVar2.af()) {
                    bty.b("performMeasureAndLayout called with unattached root");
                }
                if (!bysVar2.ag()) {
                    bty.b("performMeasureAndLayout called with unplaced root");
                }
                if (bzfVar.b) {
                    bty.b("performMeasureAndLayout called during measure layout");
                }
                if (bzfVar.f != null) {
                    bzfVar.b = true;
                    bzfVar.c = false;
                    try {
                        bzfVar.h.c(bysVar);
                        if ((bzf.l(bysVar, new clv(j)) || bysVar.ac()) && yks.e(bysVar.q(), true)) {
                            bysVar.I();
                        }
                        bzfVar.d(bysVar);
                        bzf.m(bysVar, new clv(j));
                        if (bysVar.ab() && bysVar.ag()) {
                            bysVar.Q();
                            bzfVar.g.c(bysVar);
                        }
                        bzfVar.c();
                        bzfVar.b = false;
                        bzfVar.c = false;
                        cbp cbpVar = bzfVar.i;
                    } finally {
                    }
                }
                bzfVar.a();
            }
            bzf bzfVar2 = this.y;
            if (!bzfVar2.h()) {
                bzfVar2.b(false);
                T();
            }
            this.m.a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        bmh bmhVar = this.K;
        if (bmhVar.j().a()) {
            return super.requestFocus(i, rect);
        }
        blz blzVarT = d.T(i);
        int i2 = blzVarT != null ? blzVarT.a : 7;
        return yks.e(bmhVar.c(i2, rect != null ? bnj.p(rect) : null, new cba(i2, 0)), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:20:0x0059, B:22:0x0073, B:25:0x008b, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00b9, B:40:0x00d3, B:42:0x00db, B:44:0x00eb, B:37:0x00c4, B:50:0x010e, B:52:0x0122, B:54:0x0128, B:58:0x0137, B:56:0x012d, B:59:0x013f), top: B:96:0x0059 }] */
    @Override // defpackage.bzz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.s():void");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.bzz
    public final void t(bys bysVar) {
        cbi cbiVar = this.n;
        cbiVar.r = true;
        if (cbiVar.r()) {
            cbiVar.k(bysVar);
        }
        blj bljVar = this.o;
        bljVar.b = true;
        if (bljVar.i()) {
            bljVar.d();
        }
    }

    @Override // defpackage.bzz
    public final void u(bys bysVar, boolean z, boolean z2, boolean z3) {
        bys bysVarJ;
        bys bysVarJ2;
        if (!z) {
            if (this.y.j(bysVar, z2) && z3) {
                X(bysVar);
                return;
            }
            return;
        }
        bzf bzfVar = this.y;
        if (bysVar.h == null) {
            bty.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iAv = bysVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new yfu();
                }
                if (!bysVar.ad() || z2) {
                    bysVar.K();
                    bysVar.L();
                    if (bysVar.z) {
                        return;
                    }
                    if ((yks.e(bysVar.q(), true) || bzf.n(bysVar)) && ((bysVarJ = bysVar.j()) == null || !bysVarJ.ad())) {
                        bzfVar.h.d(bysVar, 1);
                    } else if ((bysVar.ag() || bzf.o(bysVar)) && ((bysVarJ2 = bysVar.j()) == null || !bysVarJ2.ae())) {
                        bzfVar.h.d(bysVar, 3);
                    }
                    if (bzfVar.c || !z3) {
                        return;
                    }
                    X(bysVar);
                    return;
                }
                return;
            }
        }
        bzfVar.e.o(new bze(bysVar, true, z2));
        cbp cbpVar = bzfVar.i;
    }

    @Override // defpackage.bzz
    public final void v(bys bysVar, boolean z, boolean z2) {
        if (!z) {
            bzf bzfVar = this.y;
            int iAv = bysVar.av();
            int i = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                cbp cbpVar = bzfVar.i;
                return;
            }
            if (i != 4) {
                throw new yfu();
            }
            bys bysVarJ = bysVar.j();
            boolean z3 = bysVarJ == null || bysVarJ.ag();
            if (!z2 && (bysVar.ae() || (bysVar.ab() && bysVar.ag() == z3 && bysVar.ag() == bysVar.ah()))) {
                cbp cbpVar2 = bzfVar.i;
                return;
            }
            bysVar.J();
            if (!bysVar.z && bysVar.ah() && z3) {
                if ((bysVarJ == null || !bysVarJ.ab()) && (bysVarJ == null || !bysVarJ.ae())) {
                    bzfVar.h.d(bysVar, 4);
                }
                if (bzfVar.c) {
                    return;
                }
                X(null);
                return;
            }
            return;
        }
        bzf bzfVar2 = this.y;
        int iAv2 = bysVar.av();
        int i2 = iAv2 - 1;
        if (iAv2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new yfu();
                        }
                    }
                }
            }
            cbp cbpVar3 = bzfVar2.i;
            return;
        }
        if ((bysVar.ad() || bysVar.ac()) && !z2) {
            cbp cbpVar4 = bzfVar2.i;
            return;
        }
        bysVar.u.e();
        bysVar.J();
        if (bysVar.z) {
            return;
        }
        bys bysVarJ2 = bysVar.j();
        if (yks.e(bysVar.q(), true) && ((bysVarJ2 == null || !bysVarJ2.ad()) && (bysVarJ2 == null || !bysVarJ2.ac()))) {
            bzfVar2.h.d(bysVar, 2);
        } else if (bysVar.ag() && ((bysVarJ2 == null || !bysVarJ2.ab()) && (bysVarJ2 == null || !bysVarJ2.ae()))) {
            bzfVar2.h.d(bysVar, 4);
        }
        if (bzfVar2.c) {
            return;
        }
        X(null);
    }

    @Override // defpackage.bzz
    public final void w() {
        cbi cbiVar = this.n;
        cbiVar.r = true;
        if (cbiVar.r() && !cbiVar.v) {
            cbiVar.v = true;
            cbiVar.h.post(cbiVar.w);
        }
        blj bljVar = this.o;
        bljVar.b = true;
        if (!bljVar.i() || bljVar.d) {
            return;
        }
        bljVar.d = true;
        bljVar.c.post(bljVar.e);
    }

    @Override // defpackage.bzz
    public final void x(yjk yjkVar) {
        kc kcVar = this.aN;
        if (kcVar.e(yjkVar)) {
            return;
        }
        kcVar.p(yjkVar);
    }

    @Override // defpackage.bzz
    public final void y(bys bysVar) {
        this.y.g.c(bysVar);
        X(null);
    }

    @Override // defpackage.bzz
    public final void z(float f) {
        if (this.g) {
            if (f > 0.0f) {
                if (Float.isNaN(this.aG) || f > this.aG) {
                    this.aG = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.aH) || f < this.aH) {
                    this.aH = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void f(dvk dvkVar) {
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }
}
