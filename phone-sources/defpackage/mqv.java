package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.watch.ScrubbingIndicator;
import com.google.android.apps.play.movies.mobile.usecase.watch.TimeBar;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqv extends FrameLayout implements mqp {
    private static final Drawable r = new ColorDrawable(0);
    private final boolean A;
    private final List B;
    private final Animator.AnimatorListener C;
    private final Animator.AnimatorListener D;
    private final idy E;
    private final lob F;
    private final idb G;
    private final Rect H;
    private final Rect I;
    private final iej J;
    private final iej K;
    private final iej L;
    private final iej M;
    private final san N;
    private final View O;
    private final ImageButton P;
    private final ImageButton Q;
    private final ImageButton R;
    private final ImageView S;
    private final ImageView T;
    private final ImageView U;
    private final ImageView V;
    private final ImageButton W;
    public loa a;
    private int aA;
    private int aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private MotionEvent aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private long aL;
    private boolean aM;
    private int aN;
    private int aO;
    private final kuw aP;
    private final ImageButton aa;
    private final TextView ab;
    private final ProgressBar ac;
    private final rzy ad;
    private final rzy ae;
    private final rzy af;
    private final rzy ag;
    private final rzy ah;
    private rzy ai;
    private boolean aj;
    private final TextView ak;
    private final ScrubbingIndicator al;
    private final ScrubbingIndicator am;
    private ScrubbingIndicator an;
    private int ao;
    private final iea ap;
    private final iea aq;
    private final iea ar;
    private final iea as;
    private boolean at;
    private boolean au;
    private int av;
    private long aw;
    private int ax;
    private int ay;
    private int az;
    public final TimeBar b;
    public final TextView c;
    public DialogInterface d;
    public final rzy e;
    public final rzy f;
    public final View g;
    public final iea h;
    public final iea i;
    public final iea j;
    public final iea k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public final ImageView p;
    public int q;
    private final Drawable s;
    private final Context t;
    private final cr u;
    private final mqo v;
    private final Handler w;
    private final int x;
    private final int y;
    private final boolean z;

    public mqv(Context context, cr crVar, lob lobVar, mqo mqoVar, idb idbVar, LayoutInflater layoutInflater, mrb mrbVar, san sanVar, rzy rzyVar, boolean z, idy idyVar) {
        super(context);
        this.w = new Handler(this);
        this.B = new ArrayList();
        this.H = new Rect();
        this.I = new Rect();
        this.J = new lll(this, 9);
        this.K = new lll(this, 7);
        this.L = new lll(this, 8);
        this.M = new lll(this, 10);
        final int i = 0;
        this.ao = 0;
        final int i2 = 1;
        this.aN = 1;
        this.au = false;
        this.aO = 1;
        this.q = 1;
        this.aF = true;
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.aJ = Integer.MIN_VALUE;
        this.aK = 0;
        this.v = mqoVar;
        this.t = context;
        this.u = crVar;
        this.F = lobVar;
        this.G = idbVar;
        this.h = mrbVar.b;
        this.i = mrbVar.d;
        this.ap = mrbVar.e;
        this.aq = mrbVar.f;
        this.ar = mrbVar.g;
        this.as = mrbVar.h;
        this.j = mrbVar.a;
        this.k = mrbVar.c;
        this.N = sanVar;
        this.ad = rzyVar;
        this.A = z;
        this.E = idyVar;
        Resources resources = getResources();
        this.x = resources.getInteger(R.integer.fade_duration_fast);
        this.y = resources.getInteger(R.integer.fade_duration_slow);
        this.s = new ColorDrawable(context.getColor(R.color.playback_controller_scrim_color));
        layoutInflater.inflate(true != z ? R.layout.controller_overlay : R.layout.cast_controller_overlay, this);
        View viewFindViewById = findViewById(R.id.control_bar);
        viewFindViewById.getClass();
        this.O = viewFindViewById;
        viewFindViewById.setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: mqq
            @Override // android.view.View.OnGenericMotionListener
            public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                return this.a.B(motionEvent);
            }
        });
        View viewFindViewById2 = findViewById(R.id.thumbnail);
        viewFindViewById2.getClass();
        this.p = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.timebar);
        viewFindViewById3.getClass();
        TimeBar timeBar = (TimeBar) viewFindViewById3;
        this.b = timeBar;
        View viewFindViewById4 = findViewById(R.id.loading_spinner);
        viewFindViewById4.getClass();
        this.ac = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.play);
        viewFindViewById5.getClass();
        ImageButton imageButton = (ImageButton) viewFindViewById5;
        this.P = imageButton;
        View viewFindViewById6 = findViewById(R.id.pause);
        viewFindViewById6.getClass();
        ImageButton imageButton2 = (ImageButton) viewFindViewById6;
        this.Q = imageButton2;
        this.R = (ImageButton) findViewById(R.id.zoom_in);
        View viewFindViewById7 = findViewById(R.id.fine_scrubber_overlay);
        viewFindViewById7.getClass();
        this.g = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.seeking_progress_text);
        viewFindViewById8.getClass();
        this.ak = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.icon_rwd);
        viewFindViewById9.getClass();
        ScrubbingIndicator scrubbingIndicator = (ScrubbingIndicator) viewFindViewById9;
        this.al = scrubbingIndicator;
        scrubbingIndicator.b = true;
        View viewFindViewById10 = findViewById(R.id.icon_fwd);
        viewFindViewById10.getClass();
        this.am = (ScrubbingIndicator) viewFindViewById10;
        ImageView imageView = (ImageView) findViewById(R.id.right_panel);
        this.S = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.left_panel);
        this.T = imageView2;
        this.U = (ImageView) findViewById(R.id.scrub_scrim);
        this.V = (ImageView) findViewById(R.id.bg_scrim);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.rewind_10_s);
        this.W = imageButton3;
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.forward_10_s);
        this.aa = imageButton4;
        TextView textView = (TextView) findViewById(R.id.seeking_timestamp);
        this.c = textView;
        this.ab = (TextView) findViewById(R.id.feedback_text);
        this.ae = (rzy) ((sah) sanVar.g(rzyVar).a(wgi.PLAYER_PLAY_BUTTON)).e();
        this.af = (rzy) ((sah) sanVar.g(rzyVar).a(wgi.PLAYER_PAUSE_BUTTON)).e();
        this.e = (rzy) ((sah) sanVar.g(rzyVar).a(wgi.REWIND_10_SECONDS_SIDE_PANEL)).e();
        this.f = (rzy) ((sah) sanVar.g(rzyVar).a(wgi.FORWARD_10_SECONDS_SIDE_PANEL)).e();
        this.ag = (rzy) ((sah) sanVar.g(rzyVar).a(wgi.REWIND_10_SECONDS_BUTTON)).e();
        this.ah = (rzy) ((sah) sanVar.g(rzyVar).a(wgi.FORWARD_10_SECONDS_BUTTON)).e();
        ((TextView) findViewById(R.id.progress)).setFontFeatureSettings("tnum");
        ((TextView) findViewById(R.id.duration)).setFontFeatureSettings("tnum");
        textView.setFontFeatureSettings("tnum");
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        timeBar.a(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        timeBar.setAccessibilityDelegate(new mqs(this));
        P();
        u(true);
        kuw kuwVar = new kuw(context, (mgn) this);
        this.aP = kuwVar;
        kuwVar.o();
        final kuw kuwVar2 = new kuw(context, (mgn) new mro(new lik(this, sanVar, 17), this));
        final kuw kuwVar3 = new kuw(context, (mgn) new mro(new lik(this, sanVar, 18), this));
        kuwVar2.o();
        kuwVar3.o();
        imageView2.setOnTouchListener(new View.OnTouchListener(this) { // from class: mqr
            public final /* synthetic */ mqv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (i2 != 0) {
                    return this.a.F(motionEvent, kuwVar2);
                }
                return this.a.F(motionEvent, kuwVar2);
            }
        });
        imageView.setOnTouchListener(new View.OnTouchListener(this) { // from class: mqr
            public final /* synthetic */ mqv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (i != 0) {
                    return this.a.F(motionEvent, kuwVar3);
                }
                return this.a.F(motionEvent, kuwVar3);
            }
        });
        setClipToPadding(false);
        this.z = ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
        this.C = new mqt(this);
        this.D = new mqu(this);
    }

    private final float G(MotionEvent motionEvent, MotionEvent motionEvent2) {
        InputDevice.MotionRange motionRangeAg = ag(motionEvent);
        if (motionRangeAg == null) {
            return 0.0f;
        }
        float x = (motionEvent.getX() - motionEvent2.getX()) / (motionRangeAg.getMax() - motionRangeAg.getMin());
        return !this.z ? x * 60000.0f : this.b.e * x;
    }

    private static int H(int i) {
        return (i / 500) * 500;
    }

    private static int I(MotionEvent motionEvent) {
        InputDevice.MotionRange motionRangeAg = ag(motionEvent);
        if (motionRangeAg == null) {
            return 0;
        }
        float x = (motionEvent.getX() - motionRangeAg.getMin()) / (motionRangeAg.getMax() - motionRangeAg.getMin());
        if (x <= 0.15f) {
            return -4;
        }
        return x >= 0.85f ? 4 : 0;
    }

    private final void J(boolean z) throws Resources.NotFoundException {
        this.w.removeMessages(5);
        X(z, false);
    }

    private final void K(boolean z) throws Resources.NotFoundException {
        ImageView imageView = z ? this.T : this.S;
        Handler handler = this.w;
        handler.removeMessages(6);
        handler.removeMessages(7);
        imageView.animate().alpha(0.3f).setDuration(500L);
        handler.sendMessageDelayed(handler.obtainMessage(6), 1000L);
        X(z, true);
    }

    private final void L() {
        this.w.removeMessages(1);
        if (this.aO == 2) {
            View view = this.O;
            view.animate().setListener(null).cancel();
            view.setAlpha(1.0f);
        }
    }

    private final void M(int i) {
        TimeBar timeBar = this.b;
        int iSignum = Integer.signum(timeBar.a - this.ax);
        int iSignum2 = Integer.signum(i - this.ax);
        if (iSignum != 0 && iSignum != iSignum2) {
            performHapticFeedback(3, 2);
        }
        int iH = H(i);
        if (iH != this.ay) {
            this.ak.setText(ksi.d(i, ((long) timeBar.e) >= 3600000));
            int i2 = iH > this.ay ? 1 : -1;
            if (i2 != this.az) {
                this.aA = i;
                this.az = i2;
                U(false, i2 == 1);
            }
            if (this.ao != 1) {
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    ((loc) it.next()).t(1, iH, false);
                }
            }
            this.ay = iH;
        }
        timeBar.d(i);
        if (this.av != 4) {
            int i3 = this.az;
            if (i3 > 0) {
                this.am.b(i - this.aA);
            } else if (i3 < 0) {
                this.al.b(this.aA - i);
            }
        }
    }

    private final void N() {
        int i;
        Handler handler = this.w;
        handler.removeMessages(1);
        if (!ae() || this.av != 0 || (i = this.aO) == 1 || this.q == 3) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, i == 2 ? 2500L : 5000L);
    }

    private final void O() {
        List list = (List) this.ap.a();
        int size = list.size();
        List list2 = (List) this.ar.a();
        int size2 = list2.size();
        boolean z = size > 1;
        if (z || size2 > 1) {
            DialogInterface dialogInterface = this.d;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            ieg iegVar = (ieg) this.aq.a();
            int iIndexOf = (!z || iegVar.k() || ((kwx) iegVar.g()).isForced()) ? 0 : list.indexOf(iegVar.g());
            cr crVar = this.u;
            int iIntValue = ((Integer) this.as.a()).intValue();
            Context context = getContext();
            cuc cucVarA = cuc.a();
            ArrayList arrayList = new ArrayList();
            String str = "";
            if (list2.size() > 1) {
                ImmutableList.Builder builder = ImmutableList.builder();
                String str2 = "";
                for (int i = 0; i < list2.size(); i++) {
                    kzo kzoVar = (kzo) list2.get(i);
                    String strV = mjo.v(kzoVar);
                    builder.add((ImmutableList.Builder) new mvg(strV, cucVarA.b(krh.x(context.getResources(), kzoVar))));
                    if (i == iIntValue) {
                        str2 = strV;
                    }
                }
                nag nagVarB = mvl.b();
                nagVarB.j(context.getString(R.string.audio));
                nagVarB.d = "audio_options";
                nagVarB.i(builder.build());
                nagVarB.h(str2);
                arrayList.add(nagVarB.g());
            }
            if (list.size() > 1) {
                ImmutableList.Builder builder2 = ImmutableList.builder();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    kwx kwxVar = (kwx) list.get(i2);
                    String strW = mjo.w(kwxVar);
                    builder2.add((ImmutableList.Builder) new mvg(strW, cucVarA.b(krh.v(kwxVar, context.getResources()))));
                    if (i2 == iIndexOf) {
                        str = strW;
                    }
                }
                nag nagVarB2 = mvl.b();
                nagVarB2.j(context.getString(R.string.subtitles_v2));
                nagVarB2.d = "caption_options";
                nagVarB2.i(builder2.build());
                nagVarB2.h(str);
                arrayList.add(nagVarB2.g());
            }
            mvk mvkVarA = mvk.a(arrayList, "audio_cc_dialog");
            mvkVarA.show(crVar, "AudioCcDialog");
            crVar.af();
            this.d = mvkVarA.getDialog();
        }
    }

    private final void P() {
        if (this.ao == 4 || (!ae() && !this.aC && !this.l)) {
            g(false);
        }
        A();
        N();
    }

    private final void Q() {
        L();
        if (this.aO != 2 || this.aN == 2) {
            return;
        }
        this.aN = 2;
        A();
        this.q = 2;
        this.v.onControllerDeactivationPending();
    }

    private final void R() {
        int i = this.av;
        if (i == 3 || i == 4) {
            V();
        }
        this.av = 0;
    }

    private static void S(ImageButton imageButton, boolean z) {
        if (z) {
            imageButton.sendAccessibilityEvent(8);
        }
    }

    private final void T(boolean z) {
        this.W.setEnabled(z);
        this.aa.setEnabled(z);
        this.P.setEnabled(z);
        this.Q.setEnabled(z);
        this.T.setEnabled(z);
        this.S.setEnabled(z);
    }

    private final void U(boolean z, boolean z2) {
        Handler handler = this.w;
        handler.removeMessages(4);
        if (!this.aj) {
            View view = this.g;
            view.setVisibility(0);
            view.animate().setListener(null).alpha(1.0f).setDuration(this.x);
            this.aj = true;
        }
        ScrubbingIndicator scrubbingIndicator = z2 ? this.am : this.al;
        ScrubbingIndicator scrubbingIndicator2 = this.an;
        if (scrubbingIndicator2 != null && scrubbingIndicator2 != scrubbingIndicator) {
            scrubbingIndicator2.a();
            this.an.setVisibility(4);
        }
        this.an = scrubbingIndicator;
        scrubbingIndicator.setVisibility(0);
        if (z) {
            ScrubbingIndicator scrubbingIndicator3 = this.an;
            scrubbingIndicator3.a();
            scrubbingIndicator3.c = ValueAnimator.ofFloat(-2.0f, 0.0f);
            scrubbingIndicator3.c.setDuration(500L);
            scrubbingIndicator3.c.setInterpolator(scrubbingIndicator3.a);
            scrubbingIndicator3.c.addUpdateListener(scrubbingIndicator3);
            scrubbingIndicator3.c.start();
            handler.sendEmptyMessageDelayed(4, this.y);
        }
    }

    private final void V() {
        Handler handler = this.w;
        handler.removeMessages(3);
        this.aC = false;
        this.aD = false;
        if (this.aE && this.aO == 2) {
            u(true);
        }
        TimeBar timeBar = this.b;
        List list = this.B;
        int i = timeBar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).t(1, i, true);
        }
        timeBar.b(i);
        handler.removeMessages(4);
        this.m = 0;
        View view = this.g;
        view.animate().cancel();
        view.setAlpha(0.0f);
        view.setVisibility(4);
        this.aj = false;
        this.ak.setText((CharSequence) null);
        W();
    }

    private final void W() {
        setBackgroundResource(true != this.aD ? 0 : R.color.fine_grained_scrubbing_background);
    }

    private final void X(boolean z, boolean z2) throws Resources.NotFoundException {
        int right;
        int top;
        int height;
        if (this.aM) {
            return;
        }
        TextView textView = this.ab;
        textView.setAlpha(0.0f);
        textView.setText(getResources().getString(R.string.x_seconds, Integer.valueOf(Math.abs(this.aI / 1000))));
        textView.animate().alpha(1.0f).setDuration(500L);
        if (!this.A) {
            mjo.r(textView, true);
            if (z) {
                right = getResources().getDimensionPixelSize(R.dimen.center_controls_text_margin_rewind);
                ImageButton imageButton = this.W;
                top = (imageButton.getTop() + imageButton.getBottom()) / 2;
                height = textView.getHeight() / 2;
            } else {
                textView.measure(0, 0);
                right = (this.O.getRight() - getResources().getDimensionPixelSize(R.dimen.center_controls_text_margin_forward)) - textView.getMeasuredWidth();
                ImageButton imageButton2 = this.aa;
                top = (imageButton2.getTop() + imageButton2.getBottom()) / 2;
                height = textView.getHeight() / 2;
            }
            textView.setTranslationX(right - textView.getLeft());
            textView.setTranslationY((top - height) - textView.getTop());
        }
        if (z2) {
            Handler handler = this.w;
            handler.sendMessageDelayed(handler.obtainMessage(7), 1000L);
        } else {
            Handler handler2 = this.w;
            handler2.sendMessageDelayed(handler2.obtainMessage(5), 1000L);
        }
    }

    private final void Y(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.aG;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.aG = MotionEvent.obtainNoHistory(motionEvent);
    }

    private final void Z() {
        if (this.au) {
            ImageButton imageButton = this.Q;
            boolean zIsAccessibilityFocused = imageButton.isAccessibilityFocused();
            mex.c(imageButton, false);
            ImageButton imageButton2 = this.P;
            mex.c(imageButton2, this.aN != 3);
            S(imageButton2, zIsAccessibilityFocused);
            return;
        }
        ImageButton imageButton3 = this.P;
        boolean zIsAccessibilityFocused2 = imageButton3.isAccessibilityFocused();
        mex.c(imageButton3, false);
        ImageButton imageButton4 = this.Q;
        mex.c(imageButton4, this.aN != 3);
        S(imageButton4, zIsAccessibilityFocused2);
    }

    private static boolean aa(int i) {
        return i == 90 || i == 22;
    }

    private static boolean ab(int i) {
        return i == 79 || i == 85 || i == 86 || i == 126 || i == 127 || i == 175 || i == 62;
    }

    private final boolean ac() {
        return jwq.M(this.t);
    }

    private static boolean ad(int i) {
        return i == 89 || i == 21;
    }

    private final boolean ae() {
        int i = this.ao;
        return i == 2 || i == 1;
    }

    private static final void af(View view, int i, int i2) {
        int measuredHeight = i2 - (view.getMeasuredHeight() / 2);
        int measuredHeight2 = view.getMeasuredHeight() + measuredHeight;
        int measuredWidth = i - (view.getMeasuredWidth() / 2);
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, measuredHeight2);
    }

    private static InputDevice.MotionRange ag(MotionEvent motionEvent) {
        InputDevice device = motionEvent.getDevice();
        if (device == null) {
            return null;
        }
        return device.getMotionRange(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqv.A():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 2
            boolean r0 = r8.isFromSource(r0)
            r1 = 0
            if (r0 != 0) goto L9
            goto L3a
        L9:
            int r8 = r8.getActionMasked()
            r0 = 7
            r2 = 1
            if (r8 == r0) goto L29
            r0 = 12
            if (r8 == r0) goto L22
            r0 = 9
            if (r8 == r0) goto L29
            r0 = 10
            if (r8 == r0) goto L1e
            goto L3a
        L1e:
            r7.N()
            return r2
        L22:
            long r2 = java.lang.System.currentTimeMillis()
            r7.aL = r2
            return r1
        L29:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.aL
            long r3 = r3 - r5
            r5 = 50
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L3a
            r7.g(r1)
            return r2
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqv.B(android.view.MotionEvent):boolean");
    }

    public final void C(boolean z) {
        TimeBar timeBar = this.b;
        int i = timeBar.a;
        int iMin = Math.min(i + WVMediaCrypto.TYPE, timeBar.e);
        int i2 = iMin - i;
        int i3 = this.aI;
        if (i3 < 0) {
            this.aI = i2;
        } else {
            this.aI = i3 + i2;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).t(4, iMin, true);
        }
        if (z) {
            K(false);
        } else {
            J(false);
        }
    }

    public final void D(boolean z) {
        int i = this.b.a;
        int iMax = Math.max(i - 10000, 0);
        int i2 = iMax - i;
        int i3 = this.aI;
        if (i3 > 0) {
            this.aI = i2;
        } else {
            this.aI = i3 + i2;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).t(4, iMax, true);
        }
        if (z) {
            K(true);
        } else {
            J(true);
        }
    }

    @Override // defpackage.mrx
    public final void E(int i) {
        TimeBar timeBar = this.b;
        if (timeBar.e > 0) {
            ImageView imageView = this.p;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            int i2 = layoutParams.width;
            Rect rect = this.H;
            int i3 = timeBar.c;
            rect.set(i3, 0, i3, 0);
            offsetDescendantRectToMyCoords(timeBar, rect);
            layoutParams.leftMargin = Math.max(getPaddingLeft(), Math.min((getWidth() - getPaddingRight()) - i2, rect.left - (i2 / 2)));
            imageView.setLayoutParams(layoutParams);
        }
    }

    public final boolean F(MotionEvent motionEvent, kuw kuwVar) {
        return ((this.A && motionEvent.getActionMasked() == 0 && this.G.a()) || (motionEvent.getSource() & 2) == 0 || !kuwVar.n(motionEvent)) ? false : true;
    }

    @Override // defpackage.mgn
    public final boolean a() {
        R();
        N();
        return true;
    }

    @Override // defpackage.mgn
    public final boolean b() {
        R();
        N();
        return true;
    }

    @Override // defpackage.mqp
    public final ImageButton c() {
        return this.R;
    }

    @Override // defpackage.mqp
    public final ImageView d() {
        return this.p;
    }

    @Override // defpackage.mqp
    public final TextView e() {
        return this.c;
    }

    @Override // defpackage.mqp
    public final TimeBar f() {
        return this.b;
    }

    @Override // defpackage.mqp
    public final void g(boolean z) {
        p();
        if (this.q != 1) {
            this.q = 1;
            this.v.onControllerActivated();
        }
        if (z) {
            this.w.removeMessages(1);
        } else {
            N();
        }
    }

    @Override // defpackage.mga
    public final mfz generateLayoutParams() {
        return new mfz(-1, -1, true);
    }

    @Override // defpackage.mqp
    public final void h(loc locVar) {
        this.B.add(locVar);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (ae()) {
                    u(false);
                }
                return true;
            case 2:
                this.w.removeMessages(2);
                mex.c(this.ac, true);
                mex.c(this.P, false);
                mex.c(this.Q, false);
                return true;
            case 3:
                int i = message.arg1;
                int i2 = message.arg2;
                TimeBar timeBar = this.b;
                M(Math.max(0, Math.min(timeBar.e, timeBar.a + i)));
                Handler handler = this.w;
                handler.sendMessageDelayed(handler.obtainMessage(3, i, i2), i2);
                return true;
            case 4:
                this.w.removeMessages(4);
                this.g.animate().alpha(0.0f).setDuration(this.y).setListener(this.D);
                this.aj = false;
                return true;
            case 5:
                this.w.removeMessages(5);
                this.aI = 0;
                this.ab.animate().alpha(0.0f).setDuration(500L);
                return true;
            case 6:
                this.w.removeMessages(6);
                this.S.animate().alpha(0.0f).setDuration(500L);
                this.T.animate().alpha(0.0f).setDuration(500L);
                return true;
            case 7:
                this.w.removeMessages(7);
                this.aI = 0;
                this.ab.animate().alpha(0.0f).setDuration(500L);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.mga
    public final void hideFeedbackText(boolean z) {
        this.aM = z;
    }

    @Override // defpackage.mqp
    public final void i(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.controller_overlay_menu, menu);
        if ((((List) this.ap.a()).size() > 1 || ((List) this.ar.a()).size() > 1) && !ac()) {
            ieg iegVar = (ieg) this.aq.a();
            boolean z = false;
            if (iegVar.m() && !((kwx) iegVar.g()).isForced()) {
                z = true;
            }
            this.ai = (rzy) ((sah) this.N.g(this.ad).a(wgi.MOVIES_AUDIO_CC_BUTTON)).e();
            mjo.t(menu, R.id.cc_menu_item_selected, z);
            mjo.t(menu, R.id.cc_menu_item_unselected, true ^ z);
        }
    }

    @Override // defpackage.mga
    public final boolean isAvodOverlay() {
        return false;
    }

    @Override // defpackage.mqp
    public final void j() {
        iea ieaVar = this.h;
        iej iejVar = this.J;
        ieaVar.ea(iejVar);
        iejVar.dM();
        this.i.ea(iejVar);
        iejVar.dM();
        iea ieaVar2 = this.ar;
        iej iejVar2 = this.K;
        ieaVar2.ea(iejVar2);
        iejVar2.dM();
        iea ieaVar3 = this.j;
        iej iejVar3 = this.L;
        ieaVar3.ea(iejVar3);
        iejVar3.dM();
        iea ieaVar4 = this.k;
        iej iejVar4 = this.M;
        ieaVar4.ea(iejVar4);
        iejVar4.dM();
    }

    @Override // defpackage.mqp
    public final void k() {
        iea ieaVar = this.h;
        iej iejVar = this.J;
        ieaVar.ee(iejVar);
        this.i.ee(iejVar);
        this.ar.ee(this.K);
        this.j.ee(this.L);
        this.k.ee(this.M);
    }

    @Override // defpackage.mqp
    public final void l() {
        this.b.c(this);
    }

    @Override // defpackage.mqp
    public final void m(loc locVar) {
        this.B.remove(locVar);
    }

    @Override // defpackage.mqp
    public final void n() {
        z(0);
        setBackgroundResource(0);
        this.w.removeMessages(3);
        this.al.a();
        this.am.a();
        DialogInterface dialogInterface = this.d;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
            this.d = null;
        }
    }

    @Override // defpackage.mqp
    public final void o(loa loaVar) {
        this.a = loaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a != null) {
            if (view == this.P) {
                this.N.f(this.ae).e();
                this.a.p();
                return;
            }
            if (view == this.Q) {
                this.N.f(this.af).e();
                this.a.n();
                return;
            }
            if (view == this.W) {
                this.N.f(this.ag).e();
                D(false);
            } else if (view == this.aa) {
                this.N.f(this.ah).e();
                C(false);
            } else if (view == this.S) {
                C(true);
            } else if (view == this.T) {
                D(true);
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.ao == 4) {
            return false;
        }
        if (this.aC) {
            V();
            return true;
        }
        if (ae()) {
            if (this.aN != 1) {
                g(false);
            }
            loa loaVar = this.a;
            if (loaVar != null) {
                loaVar.n();
            }
            return true;
        }
        if (this.aN != 3) {
            u(true);
        }
        loa loaVar2 = this.a;
        if (loaVar2 != null) {
            loaVar2.p();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (ac()) {
            return true;
        }
        this.av = 1;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.av != 2) {
            return false;
        }
        if (Math.abs(f) < Math.abs(f2) || Math.abs(f) < getResources().getDisplayMetrics().density * 1000.0f) {
            g(false);
            return false;
        }
        float fSignum = Math.signum(f) * 10000.0f;
        TimeBar timeBar = this.b;
        int i = (int) fSignum;
        int iMax = Math.max(0, Math.min(timeBar.f + i, timeBar.e));
        if (iMax == timeBar.f) {
            g(false);
            return false;
        }
        this.aC = true;
        List list = this.B;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).s(2);
        }
        this.aC = false;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((loc) it2.next()).t(2, iMax, true);
        }
        timeBar.e();
        timeBar.b(iMax);
        if (Integer.signum(i) != Integer.signum(this.m)) {
            this.m = 0;
        }
        this.m += i;
        this.ak.setText(getResources().getString(R.string.x_seconds, Integer.valueOf(Math.abs(this.m / 1000))));
        U(true, f > 0.0f);
        return true;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return B(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009c  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqv.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!ad(i) && !aa(i)) {
            return ab(i) || super.onKeyUp(i, keyEvent);
        }
        int i2 = this.aJ;
        if (i2 != Integer.MIN_VALUE && i == this.aK) {
            this.b.b(i2);
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((loc) it.next()).t(0, this.aJ, true);
            }
            this.aJ = Integer.MIN_VALUE;
            this.aK = 0;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        boolean z2 = this.A;
        int i6 = i5 / 2;
        int i7 = (i4 - i2) / 2;
        if (!z2) {
            af(this.ac, i6, i7);
        }
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.layout(0, 0, getWidth(), getHeight());
        }
        ImageView imageView2 = this.V;
        if (imageView2 != null) {
            imageView2.layout(0, 0, getWidth(), getHeight());
        }
        if (!z2) {
            ImageButton imageButton = this.P;
            af(imageButton, i6, i7);
            af(this.Q, i6, i7);
            int left = imageButton.getLeft();
            int top = (imageButton.getTop() + imageButton.getBottom()) / 2;
            int right = imageButton.getRight();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.player_seek_controls_margin);
            ImageButton imageButton2 = this.W;
            int height = imageButton2.getHeight() / 2;
            int height2 = imageButton2.getHeight() / 2;
            int i8 = left - dimensionPixelSize;
            int width = imageButton2.getWidth();
            int i9 = height2 + top;
            int i10 = top - height;
            imageButton2.layout(i8 - width, i10, i8, i9);
            int i11 = right + dimensionPixelSize;
            this.aa.layout(i11, i10, width + i11, i9);
        }
        double height3 = getHeight();
        double width2 = getWidth();
        int i12 = (int) (height3 * (-0.5d));
        int i13 = (int) (height3 * 1.5d);
        this.T.layout((int) ((-0.5d) * width2), i12, (int) (0.35d * width2), i13);
        this.S.layout((int) (width2 * 0.65d), i12, (int) (1.5d * width2), i13);
        this.O.getHitRect(this.I);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.ao == 4) {
            return false;
        }
        int i = this.av;
        if (i == 1) {
            if (Math.abs(motionEvent.getY() - motionEvent2.getY()) > Math.abs(motionEvent.getX() - motionEvent2.getX())) {
                return true;
            }
            this.aw = SystemClock.elapsedRealtime();
            this.av = 2;
            return false;
        }
        if (i == 2) {
            if (this.aC || SystemClock.elapsedRealtime() - this.aw < 200) {
                return false;
            }
            this.av = 3;
            Y(motionEvent2);
            ScrubbingIndicator scrubbingIndicator = this.al;
            scrubbingIndicator.a();
            ScrubbingIndicator scrubbingIndicator2 = this.am;
            scrubbingIndicator2.a();
            scrubbingIndicator.b(0);
            scrubbingIndicator2.b(0);
            this.aC = true;
            this.aD = true;
            this.aE = ae();
            TimeBar timeBar = this.b;
            int i2 = timeBar.f;
            this.ax = i2;
            this.az = 0;
            this.aA = i2;
            this.ay = H(i2);
            this.aB = 0;
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((loc) it.next()).s(1);
            }
            timeBar.e();
            if (this.aE) {
                Q();
            }
            W();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            if (I(motionEvent2) != this.aH) {
                this.av = 3;
                this.w.removeMessages(3);
                this.al.a();
                this.am.a();
                Y(motionEvent2);
                this.aB = (this.b.a - this.ax) - ((int) G(motionEvent2, motionEvent));
            }
            return true;
        }
        int I = I(motionEvent2);
        this.aH = I;
        if (this.z || I * f >= 0.0f) {
            Y(motionEvent2);
            M(Math.max(0, Math.min(((int) G(motionEvent2, motionEvent)) + this.ax + this.aB, this.b.e)));
        } else {
            this.av = 4;
            boolean z = I > 0;
            if (z) {
                this.am.c();
            } else {
                this.al.c();
            }
            int iMax = Math.max(1, 500 / Math.abs(this.aH));
            int i3 = iMax < 200 ? (iMax + 199) / iMax : 1;
            int i4 = z ? i3 : -i3;
            int i5 = iMax * i3;
            Handler handler = this.w;
            handler.sendMessageDelayed(handler.obtainMessage(3, i4 * 500, i5), i5);
            performHapticFeedback(3, 2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.ao == 4) {
            return false;
        }
        if (this.aC) {
            V();
            return true;
        }
        if (this.aN != 1) {
            g(false);
        } else if (this.aO == 2) {
            u(true);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.G.a()) {
            return false;
        }
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        return (motionEvent.getSource() & 2) != 0 && this.aP.n(motionEvent);
    }

    @Override // defpackage.mqp
    public final void p() {
        this.l = false;
        View view = this.O;
        view.animate().cancel();
        view.animate().setListener(null).alpha(1.0f).setDuration(this.x).start();
        if (this.aN != 1) {
            this.aN = 1;
            A();
        }
        this.F.onControlsShown();
    }

    @Override // defpackage.mqp
    public final boolean q(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.cc_menu_item_selected && menuItem.getItemId() != R.id.cc_menu_item_unselected) {
            return false;
        }
        this.N.f(this.ai).e();
        O();
        N();
        return true;
    }

    @Override // defpackage.mqp
    public final void r(int i) {
        if (this.aO != i) {
            L();
            this.aO = i;
            P();
        }
    }

    @Override // defpackage.mqp
    public final void s() {
        if (!this.at) {
            this.at = true;
            A();
        }
    }

    public final void t(int i) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).t(0, i, true);
        }
        this.ak.setContentDescription(jwq.H(getContext(), i));
    }

    public final void u(boolean z) {
        if (this.aO == 1) {
            return;
        }
        Q();
        if (this.aO == 2) {
            this.O.animate().alpha(0.0f).setDuration(z ? this.x : this.y).setListener(this.C);
        }
        this.q = 3;
        this.v.onControllerDeactivated();
    }

    public final void v() {
        if (this.aN != 3) {
            this.aN = 3;
            A();
        }
        this.F.onControlsHidden();
    }

    @Override // defpackage.mrx
    public final void w() {
        this.aC = false;
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setVisibility(4);
            T(true);
        }
        if (this.aE && this.aO == 2) {
            u(false);
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).r();
        }
    }

    @Override // defpackage.mrx
    public final void x(int i) {
        this.aC = false;
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setVisibility(4);
            T(true);
        }
        if (this.aE) {
            N();
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).t(0, i, true);
        }
    }

    @Override // defpackage.mrx
    public final void y() {
        this.aC = true;
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setVisibility(0);
            T(false);
        }
        this.aE = ae();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((loc) it.next()).s(0);
        }
        if (this.aE) {
            Q();
        }
    }

    public final void z(int i) {
        if (i != this.ao) {
            this.aF = false;
        }
        this.ao = i;
        P();
    }

    @Override // defpackage.mga
    public final View getView() {
        return this;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
