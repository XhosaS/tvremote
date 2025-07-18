package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tvsearch.app.hover.HoverWindow$HoverLayoutParams;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.apps.tvsearch.searchbar.widget.StreamingTextView;
import com.google.android.apps.tvsearch.widget.bounded.BoundedHorizontalScrollView;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hxr extends exf implements hxt, eza {
    private static final Duration aw;
    private static final Duration ax;
    public static final zdy f = zdy.h("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity");
    public static final Duration g;
    public static final Duration h;
    public static final Duration i;
    public static final Duration j;
    public static final Duration k;
    public final InputMethodManager A;
    public final gtu B;
    public final agow C;
    public final gfr D;
    public final agow E;
    public final gmd F;
    public final glg G;
    public final agow H;
    public final agow I;
    public final agow J;
    public final agow K;
    public final lzb L;
    public final ghr M;
    public boolean N;
    public final ewb O;
    public String P;
    public hyo Q;
    public boolean R;
    public final ewm S;
    public final boolean T;
    public hyi U;
    public Handler V;
    public final Runnable W;
    public String X;
    public hzc Y;
    public boolean Z;
    private final Supplier aA;
    private final agow aB;
    private final agow aC;
    private final ahbt aD;
    private final fae aE;
    private final fam aF;
    private final Display aG;
    private final agow aH;
    private final agow aI;
    private final Executor aJ;
    private final gzu aK;
    private final agow aL;
    private final jnb aM;
    private final zyh aN;
    private final gof aO;
    private final agow aP;
    private final agow aQ;
    private final agow aR;
    private final iyj aS;
    private final iyr aT;
    private eyn aU;
    private View aV;
    private View aW;
    private ConversationStateListener aX;
    private AnimatorSet aY;
    private final Duration aZ;
    public hvq aa;
    public hvu ab;
    public final zxe ac;
    public boolean ad;
    public boolean ae;
    public final Runnable af;
    public hyq ag;
    public boolean ah;
    public boolean ai;
    public final yrn aj;
    public hsu ak;
    public hzw al;
    public zxe am;
    public final fbh an;
    public final hvw ao;
    public final gnv ap;
    public hwy aq;
    public int ar;
    public int as;
    public final ewo at;
    public final iyw au;
    public final gnu av;
    private final ActivityManager ay;
    private final fby az;
    private EditText ba;
    private TextWatcher bb;
    private final agpc bc;
    private boolean bd;
    private ViewGroup be;
    private jno bf;
    private final hxq bg;
    private final eyx bh;
    private final exz bi;
    private final fdy bj;
    public final AccessibilityManager l;
    public final eyw m;
    public final gkz n;
    public final jdt o;
    public final hxu p;
    public final ixj q;
    public final agow r;
    public final ewc s;
    public final agow t;
    public final agow u;
    public final jhs v;
    public final gph w;
    public final hxv x;
    public final fyq y;
    public final agow z;

    static {
        Duration durationOfMillis = Duration.ofMillis(30L);
        durationOfMillis.getClass();
        g = durationOfMillis;
        Duration durationOfSeconds = Duration.ofSeconds(2L);
        durationOfSeconds.getClass();
        aw = durationOfSeconds;
        Duration durationOfMillis2 = Duration.ofMillis(300L);
        durationOfMillis2.getClass();
        ax = durationOfMillis2;
        Duration durationOfSeconds2 = Duration.ofSeconds(2L);
        durationOfSeconds2.getClass();
        h = durationOfSeconds2;
        Duration durationOfSeconds3 = Duration.ofSeconds(10L);
        durationOfSeconds3.getClass();
        i = durationOfSeconds3;
        Duration durationOfSeconds4 = Duration.ofSeconds(1L);
        durationOfSeconds4.getClass();
        j = durationOfSeconds4;
        Duration durationOfSeconds5 = Duration.ofSeconds(3L);
        durationOfSeconds5.getClass();
        k = durationOfSeconds5;
    }

    public hxr(AccessibilityManager accessibilityManager, ActivityManager activityManager, eyw eywVar, fby fbyVar, gkz gkzVar, Supplier supplier, jdt jdtVar, hxu hxuVar, agow agowVar, agow agowVar2, ixj ixjVar, ahbt ahbtVar, agow agowVar3, agow agowVar4, fae faeVar, fam famVar, Display display, ewc ewcVar, agow agowVar5, agow agowVar6, agow agowVar7, agow agowVar8, jhs jhsVar, Executor executor, gph gphVar, abwf abwfVar, gzu gzuVar, hxv hxvVar, fyq fyqVar, agow agowVar9, ewo ewoVar, agow agowVar10, InputMethodManager inputMethodManager, eyx eyxVar, fbh fbhVar, gtu gtuVar, agow agowVar11, gfr gfrVar, exz exzVar, jnb jnbVar, agow agowVar12, gmd gmdVar, zyh zyhVar, glg glgVar, agow agowVar13, agow agowVar14, gof gofVar, agow agowVar15, agow agowVar16, agow agowVar17, lzb lzbVar, agow agowVar18, agow agowVar19, iyj iyjVar, iyr iyrVar, yrx yrxVar, ghr ghrVar, iyw iywVar, hvw hvwVar, gnu gnuVar, gnv gnvVar) {
        activityManager.getClass();
        eywVar.getClass();
        fbyVar.getClass();
        gkzVar.getClass();
        jdtVar.getClass();
        hxuVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        ixjVar.getClass();
        ahbtVar.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        famVar.getClass();
        display.getClass();
        ewcVar.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        agowVar8.getClass();
        jhsVar.getClass();
        executor.getClass();
        gzuVar.getClass();
        hxvVar.getClass();
        agowVar9.getClass();
        agowVar10.getClass();
        eyxVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        exzVar.getClass();
        jnbVar.getClass();
        agowVar12.getClass();
        gmdVar.getClass();
        zyhVar.getClass();
        glgVar.getClass();
        agowVar13.getClass();
        agowVar14.getClass();
        gofVar.getClass();
        agowVar15.getClass();
        agowVar16.getClass();
        agowVar17.getClass();
        lzbVar.getClass();
        agowVar18.getClass();
        agowVar19.getClass();
        iyjVar.getClass();
        ghrVar.getClass();
        gnvVar.getClass();
        this.l = accessibilityManager;
        this.ay = activityManager;
        this.m = eywVar;
        this.az = fbyVar;
        this.n = gkzVar;
        this.aA = supplier;
        this.o = jdtVar;
        this.p = hxuVar;
        this.aB = agowVar;
        this.aC = agowVar2;
        this.q = ixjVar;
        this.aD = ahbtVar;
        this.r = agowVar4;
        this.aE = faeVar;
        this.aF = famVar;
        this.aG = display;
        this.s = ewcVar;
        this.t = agowVar5;
        this.u = agowVar6;
        this.aH = agowVar7;
        this.aI = agowVar8;
        this.v = jhsVar;
        this.aJ = executor;
        this.w = gphVar;
        this.aK = gzuVar;
        this.x = hxvVar;
        this.y = fyqVar;
        this.z = agowVar9;
        this.at = ewoVar;
        this.aL = agowVar10;
        this.A = inputMethodManager;
        this.bh = eyxVar;
        this.an = fbhVar;
        this.B = gtuVar;
        this.C = agowVar11;
        this.D = gfrVar;
        this.bi = exzVar;
        this.aM = jnbVar;
        this.E = agowVar12;
        this.F = gmdVar;
        this.aN = zyhVar;
        this.G = glgVar;
        this.H = agowVar13;
        this.I = agowVar14;
        this.aO = gofVar;
        this.aP = agowVar15;
        this.J = agowVar16;
        this.K = agowVar17;
        this.L = lzbVar;
        this.aQ = agowVar18;
        this.aR = agowVar19;
        this.aS = iyjVar;
        this.aT = iyrVar;
        this.M = ghrVar;
        this.au = iywVar;
        this.ao = hvwVar;
        this.av = gnuVar;
        this.ap = gnvVar;
        this.ar = 3;
        this.O = new ewb() { // from class: hvz
            @Override // defpackage.ewb
            public final void a(Intent intent) throws InterruptedException {
                if (agvy.c(intent.getAction(), "android.intent.action.DREAMING_STARTED")) {
                    this.a.a();
                }
            }
        };
        Duration durationB = acbh.b(abwfVar);
        durationB.getClass();
        this.aZ = durationB;
        this.S = new ewm() { // from class: hwa
            @Override // defpackage.ewm
            public final void a() throws InterruptedException {
                hxr hxrVar = this.a;
                hxrVar.R = true;
                hvu hvuVar = hxrVar.ab;
                if (hvuVar == null) {
                    agvy.b("searchBarViewManager");
                    hvuVar = null;
                }
                hvuVar.g();
                hxrVar.K();
            }
        };
        Object objA = agowVar3.a();
        objA.getClass();
        this.bj = (fdy) objA;
        boolean z = false;
        if (jdtVar.Z() == jlv.INVOCATION_TYPE_NOT_INVOKED && !eywVar.k && !eywVar.o && !eywVar.n && !eywVar.m && !eywVar.j && !eywVar.g && !eywVar.h) {
            z = true;
        }
        this.T = z;
        this.bc = new agpn(new agum() { // from class: hwb
            @Override // defpackage.agum
            public final Object a() {
                return new hwz(this.a);
            }
        });
        this.W = new Runnable() { // from class: hwc
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                this.a.a();
            }
        };
        this.Z = true;
        this.ac = new hxf(this);
        this.af = new Runnable() { // from class: hwd
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U();
            }
        };
        this.aj = new yrn(yrxVar);
        this.bg = new hxq(this);
        this.as = 5;
    }

    private final AnimatorSet am(EditText editText, int i2) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this, R.animator.fade_out_linear);
        animatorLoadAnimator.addListener(new hww(editText, i2));
        animatorLoadAnimator.setTarget(editText);
        animatorLoadAnimator.setStartDelay(4000L);
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this, R.animator.search_tab_hint_enter);
        animatorLoadAnimator2.setTarget(editText);
        animatorLoadAnimator2.setStartDelay(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorLoadAnimator, animatorLoadAnimator2);
        animatorSet.addListener(new hwx(editText, animatorLoadAnimator2));
        return animatorSet;
    }

    private final void an() {
        if (this.Z) {
            return;
        }
        this.F.p(gmc.V, gmc.W);
        ixj ixjVar = this.q;
        zxn.p(ixjVar.a(), this.bg, zwk.a);
    }

    private final void ao() {
        if (this.w == gph.b) {
            Object obj = this.ab;
            if (obj == null) {
                agvy.b("searchBarViewManager");
                obj = null;
            }
            SearchBar searchBar = (SearchBar) obj;
            if (searchBar.v()) {
                return;
            }
            searchBar.T.b((View) obj).start();
        }
    }

    private final void ap() {
        hxi hxiVar = new hxi(this);
        this.aU = hxiVar;
        this.m.a(hxiVar);
    }

    private final void aq(Intent intent) {
        EditText editText;
        gph gphVar = this.w;
        int intExtra = intent.getIntExtra("search_type", 1);
        gph gphVar2 = gph.a;
        if (gphVar == gphVar2 || gphVar == gph.c) {
            if (intExtra == 12 || intExtra == 8) {
                if (this.ar != 2) {
                    View view = this.aV;
                    if (view != null) {
                        view.setBackground(getDrawable(R.color.G950));
                    }
                    this.ar = 2;
                }
            } else if (this.ar != 1) {
                View view2 = this.aV;
                if (view2 != null) {
                    view2.setBackground(getDrawable(R.drawable.bg_simple_gradient_amati));
                }
                this.ar = 1;
            }
        }
        String action = intent.getAction();
        Y();
        this.ai = false;
        if (agvy.c(action, "android.katniss.search.action.DISPLAY_ERROR")) {
            return;
        }
        if ((gphVar == gphVar2 || gphVar == gph.c) && intExtra == 8) {
            H().d();
            EditText editTextF = F();
            if (editTextF != null) {
                editTextF.setHint(getString(R.string.app_search_hint));
            }
            this.ah = true;
            return;
        }
        if ((gphVar != gphVar2 && gphVar != gph.c) || intExtra != 12) {
            if (this.m.i) {
                return;
            }
            O();
            return;
        }
        if (((Boolean) this.aL.a()).booleanValue()) {
            Object obj = this.ab;
            if (obj == null) {
                agvy.b("searchBarViewManager");
                obj = null;
            }
            SearchBar searchBar = (SearchBar) obj;
            if (!searchBar.m.b()) {
                searchBar.i.inflate(R.layout.search_bar_amati_search_icon, (ViewGroup) obj, true);
                searchBar.v = (ImageView) searchBar.findViewById(R.id.search_icon);
                if (searchBar.v != null && searchBar.getKeyboardInputBox() != null && (editText = searchBar.E) != null) {
                    zr zrVar = (zr) editText.getLayoutParams();
                    zrVar.v = -1;
                    zrVar.u = searchBar.v.getId();
                    zrVar.setMarginEnd((int) searchBar.getResources().getDimension(R.dimen.space_light_blue));
                    searchBar.E.setLayoutParams(zrVar);
                }
            }
        }
        H().d();
        String stringExtra = intent.getStringExtra("query");
        EditText editTextF2 = F();
        if (editTextF2 != null) {
            if (stringExtra != null && stringExtra.length() != 0) {
                editTextF2.append(stringExtra);
            }
            editTextF2.setHint(getString(R.string.keyboard_search_hint));
            if (stringExtra == null || stringExtra.length() == 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = am(editTextF2, true != this.o.U() ? R.string.assistant_press_button_prompt : R.string.assistant_hold_down_button_prompt);
                animatorArr[1] = am(editTextF2, R.string.keyboard_search_hint);
                animatorSet.playSequentially(animatorArr);
                animatorSet.addListener(new hwv(animatorSet));
                animatorSet.start();
                this.aY = animatorSet;
            }
        }
        S();
    }

    private final void ar() throws InterruptedException {
        EditText editText;
        ((zdv) f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "tearDown", 1369, "VoicePlateActivity.kt")).u("#tearDown");
        E().removeCallbacks(this.af);
        X();
        this.aS.b();
        hyq hyqVar = this.ag;
        if (hyqVar != null) {
            hyqVar.c();
        }
        this.ag = null;
        ConversationStateListener conversationStateListener = this.aX;
        if (conversationStateListener != null) {
            this.aM.a(conversationStateListener);
        }
        this.aX = null;
        this.o.N("");
        hvt hvtVar = (hvt) H();
        hvtVar.g.q();
        hvtVar.g = hvtVar.e;
        hvu hvuVar = this.ab;
        if (hvuVar == null) {
            agvy.b("searchBarViewManager");
            hvuVar = null;
        }
        hvuVar.w(null, null);
        hvu hvuVar2 = this.ab;
        if (hvuVar2 == null) {
            agvy.b("searchBarViewManager");
            hvuVar2 = null;
        }
        SearchBar searchBar = (SearchBar) hvuVar2;
        SuggestionsScrollView suggestionsScrollView = searchBar.L;
        if (suggestionsScrollView != null) {
            suggestionsScrollView.c();
        }
        iak iakVar = searchBar.I;
        if (iakVar != null) {
            iakVar.a();
        }
        if (searchBar.m.b()) {
            ValueAnimator valueAnimator = searchBar.R;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = searchBar.R;
                valueAnimator2.end();
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = searchBar.Q;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                ValueAnimator valueAnimator4 = searchBar.Q;
                valueAnimator4.end();
                valueAnimator4.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator5 = searchBar.S;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                ValueAnimator valueAnimator6 = searchBar.S;
                valueAnimator6.end();
                valueAnimator6.removeAllUpdateListeners();
            }
            if (((View) searchBar.getParent()) != null && ((View) searchBar.getParent()).getLayerType() != 0) {
                ((View) searchBar.getParent()).setLayerType(0, null);
            }
        }
        this.Z = true;
        gph gphVar = this.w;
        if (gphVar == gph.b) {
            N();
        }
        eyw eywVar = this.m;
        eywVar.q = null;
        this.bh.a = null;
        this.v.m(null);
        this.p.b = null;
        eywVar.b(this.aU);
        this.aU = null;
        this.X = null;
        if (gphVar == gph.a || gphVar == gph.c) {
            EditText editText2 = this.ba;
            if (editText2 != null) {
                editText2.setOnEditorActionListener(null);
                editText2.setOnFocusChangeListener(null);
                editText2.setOnClickListener(null);
                editText2.setText((CharSequence) null);
            }
            hyi hyiVar = this.U;
            if (hyiVar != null) {
                hyiVar.h = null;
                if (this.ba != null && ((Boolean) this.aH.a()).booleanValue()) {
                    EditText editText3 = this.ba;
                    if (editText3 != null) {
                        editText3.removeTextChangedListener(hyiVar);
                    }
                    hyiVar.a();
                }
            }
            this.U = null;
            TextWatcher textWatcher = this.bb;
            if (textWatcher != null && (editText = this.ba) != null) {
                editText.removeTextChangedListener(textWatcher);
            }
            this.bb = null;
        }
        this.s.a(this.O);
        this.az.k();
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void B() {
        gnv gnvVar = this.ap;
        mcw mcwVar = gnvVar.j;
        gnvVar.c = Duration.ofMillis(SystemClock.uptimeMillis());
        ((exf) this).e.g();
        gmd gmdVar = this.F;
        gmdVar.f(gmb.a);
        this.V = new Handler(getMainLooper());
        hxv hxvVar = this.x;
        if (hxvVar.b()) {
            this.b.setContentView(R.layout.interactor_voiceplate_gemini);
        } else {
            gph gphVar = this.w;
            if (gphVar == gph.a || gphVar == gph.c) {
                this.b.setContentView(R.layout.interactor_voiceplate_amati);
            } else {
                this.b.setContentView(R.layout.interactor_voiceplate_watson);
            }
        }
        this.be = (ViewGroup) eB(R.id.interactor_voiceplate_main);
        SearchBar searchBar = (SearchBar) eB(R.id.search_bar);
        this.ab = searchBar;
        this.ak = new hsu() { // from class: hwq
            @Override // defpackage.hsu
            public final void a(SuggestionChipItem suggestionChipItem, View view) {
                rqs rqsVarAv;
                int i2;
                suggestionChipItem.getClass();
                hxr hxrVar = this.a;
                ghr ghrVar = hxrVar.M;
                ghrVar.d(view, suggestionChipItem);
                ghrVar.E(6);
                String str = suggestionChipItem.a;
                ghrVar.ad(str, 4, 1);
                hxrVar.H().f(str);
                hxrVar.q.d(str);
                jdt jdtVar = hxrVar.o;
                jdtVar.M();
                if (((Boolean) hxrVar.u.a()).booleanValue()) {
                    ((gfn) hxrVar.C.a()).b(rpm.s()).b().c();
                }
                agow agowVar = hxrVar.H;
                if (((Boolean) agowVar.a()).booleanValue()) {
                    ((gfn) hxrVar.C.a()).b(rpm.bu()).b().c();
                } else {
                    hxrVar.D.b(rpm.bu(), null, null);
                }
                switch (((zpk) suggestionChipItem.f.a.b).d) {
                    case 157862:
                        rqsVarAv = rpm.av();
                        i2 = 16;
                        break;
                    case 157863:
                        rqsVarAv = rpm.aw();
                        i2 = 15;
                        break;
                    default:
                        rqsVarAv = rpm.E();
                        i2 = 1;
                        break;
                }
                if (((Boolean) agowVar.a()).booleanValue()) {
                    ((gfn) hxrVar.C.a()).a(rqsVarAv).b().c();
                } else {
                    gfq.b(hxrVar.D, rqsVarAv, null, null, 14);
                }
                hxrVar.v.j(i2);
                jdtVar.A(str, true, jlv.INVOCATION_TYPE_SUGGESTION_INTENT);
            }
        };
        this.aq = new hwy(this);
        hvu hvuVar = this.ab;
        ViewGroup viewGroup = null;
        if (hvuVar == null) {
            agvy.b("searchBarViewManager");
            hvuVar = null;
        }
        hvuVar.w(ak(), G());
        this.Y = searchBar;
        this.aa = new hvt(this.C, this.D, gmdVar, this.H, searchBar, hxvVar.b());
        hvu hvuVar2 = this.ab;
        if (hvuVar2 == null) {
            agvy.b("searchBarViewManager");
            hvuVar2 = null;
        }
        hvw hvwVar = this.ao;
        SearchBar searchBar2 = (SearchBar) hvuVar2;
        LogoView logoView = searchBar2.F;
        if (logoView != null) {
            hyk hykVar = searchBar2.j;
            hykVar.a = hvwVar;
            logoView.b(hykVar, 2);
        }
        this.Q = new hwu(this);
        this.aW = this.b.findViewById(R.id.voiceplate_background_watson);
        if (hxvVar.b()) {
            ViewGroup viewGroup2 = this.be;
            if (viewGroup2 == null) {
                agvy.b("rootView");
                viewGroup2 = null;
            }
            viewGroup2.setLayerType(2, null);
            if (Build.VERSION.SDK_INT >= 33) {
                searchBar.setBackground(new LayerDrawable(new Drawable[]{new uso(this), getDrawable(R.drawable.gemini_pill_backplate)}));
            } else {
                searchBar.setBackground(new LayerDrawable(new Drawable[]{new usx(this), getDrawable(R.drawable.gemini_pill_backplate)}));
            }
        } else {
            gph gphVar2 = this.w;
            if (gphVar2 == gph.a || gphVar2 == gph.c) {
                LayoutInflater layoutInflater = this.b.a;
                ViewGroup viewGroup3 = this.be;
                if (viewGroup3 == null) {
                    agvy.b("rootView");
                    viewGroup3 = null;
                }
                layoutInflater.inflate(R.layout.voiceplate_background_amati, viewGroup3, true);
                this.aV = eB(R.id.voiceplate_background_amati);
                this.b.getDecorView().setClipChildren(false);
                float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.search_bar_motion_amati);
                this.aG.getSize(new Point());
                ViewGroup viewGroup4 = this.be;
                if (viewGroup4 == null) {
                    agvy.b("rootView");
                } else {
                    viewGroup = viewGroup4;
                }
                viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (r2.y - dimensionPixelSize)));
            }
        }
        ap();
        this.as = 4;
        if (hxvVar.b()) {
            HoverWindow$HoverLayoutParams hoverWindow$HoverLayoutParams = this.b.c;
            hoverWindow$HoverLayoutParams.a = R.animator.voice_plate_enter;
            hoverWindow$HoverLayoutParams.c = R.animator.voice_plate_exit;
            hoverWindow$HoverLayoutParams.e = R.animator.voice_plate_enter;
            hoverWindow$HoverLayoutParams.f = R.animator.voice_plate_exit;
        }
        this.m.r = true;
    }

    @Override // defpackage.ewp
    public final void C() {
        gnv gnvVar = this.ap;
        mcw mcwVar = gnvVar.j;
        gnvVar.f = Duration.ofMillis(SystemClock.uptimeMillis());
        Intent intent = this.d;
        intent.getClass();
        aq(intent);
        gmd gmdVar = this.F;
        gmc gmcVar = gmc.av;
        gmdVar.a(gmcVar);
        gmc gmcVar2 = gmc.aw;
        gmdVar.a(gmcVar2);
        if (this.o.Z() == jlv.INVOCATION_TYPE_HOTWORD) {
            gmdVar.l(gmcVar);
            if (((Boolean) this.H.a()).booleanValue()) {
                ((gfn) this.C.a()).a(rpm.cE()).b().c();
                return;
            } else {
                gfq.b(this.D, rpm.cE(), null, null, 14);
                return;
            }
        }
        gmdVar.l(gmcVar2);
        if (((Boolean) this.H.a()).booleanValue()) {
            ((gfn) this.C.a()).a(rpm.cF()).b().c();
        } else {
            gfq.b(this.D, rpm.cF(), null, null, 14);
        }
    }

    public final Handler E() {
        Handler handler = this.V;
        if (handler != null) {
            return handler;
        }
        agvy.b("mainHandler");
        return null;
    }

    public final EditText F() {
        if (this.ba == null) {
            this.ba = I().getKeyboardInputBox();
            ab();
        }
        return this.ba;
    }

    public final hsu G() {
        hsu hsuVar = this.ak;
        if (hsuVar != null) {
            return hsuVar;
        }
        agvy.b("suggestionChipClickListener");
        return null;
    }

    public final hvq H() {
        hvq hvqVar = this.aa;
        if (hvqVar != null) {
            return hvqVar;
        }
        agvy.b("searchBarStateMachine");
        return null;
    }

    public final hzc I() {
        hzc hzcVar = this.Y;
        if (hzcVar != null) {
            return hzcVar;
        }
        agvy.b("searchBarAssets");
        return null;
    }

    public final hzw J() {
        lu keyboardIcon;
        hvu hvuVar = this.ab;
        if (hvuVar == null) {
            agvy.b("searchBarViewManager");
            hvuVar = null;
        }
        hzw suggestionChipsViewManager = hvuVar.getSuggestionChipsViewManager();
        if (this.al == null) {
            this.al = suggestionChipsViewManager;
            gph gphVar = this.w;
            if ((gphVar == gph.a || gphVar == gph.c) && (keyboardIcon = I().getKeyboardIcon()) != null) {
                keyboardIcon.setOnClickListener(new View.OnClickListener() { // from class: hwg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hxr hxrVar = this.a;
                        hxrVar.o.M();
                        hxrVar.X();
                        if (!hxrVar.H().m()) {
                            hxrVar.y();
                            EditText editTextF = hxrVar.F();
                            if (editTextF != null) {
                                editTextF.setHint(hxrVar.getString(R.string.keyboard_search_hint));
                            }
                            hxrVar.S();
                            hxrVar.z();
                        }
                        hxrVar.H().d();
                    }
                });
            }
        }
        return suggestionChipsViewManager;
    }

    public final void K() throws InterruptedException {
        jdt jdtVar = this.o;
        if (jdtVar.R()) {
            jdtVar.M();
        }
        ad();
    }

    public final void L() {
        String stringExtra = this.d.getStringExtra("display_error_message");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = "Google Assistant internal error!";
        }
        H().c(stringExtra);
    }

    public final void M(List list) {
        hzw hzwVarJ = J();
        hsx hsxVar = SuggestionChipList.a;
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((xlm) it.next()).c;
            str.getClass();
            arrayList.add(new SuggestionChipItem(str, null, null, 157863));
        }
        SuggestionChipList suggestionChipList = new SuggestionChipList("", arrayList, 157863);
        SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) hzwVarJ;
        suggestionsScrollView.i();
        suggestionsScrollView.h(suggestionChipList);
        H().j();
        this.F.m(gmc.ae);
    }

    public final void N() {
        View view = this.aW;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.animate().withLayer().alpha(0.0f).setDuration(getResources().getInteger(R.integer.search_dim_background_duration_ms));
        view.setVisibility(8);
    }

    public final void O() {
        if (this.w == gph.b || !this.m.l) {
            this.aT.a(new hxb(this));
            return;
        }
        if (this.Z) {
            return;
        }
        ixj ixjVar = this.q;
        zxn.p(ixjVar.a(), this.bg, zwk.a);
        hyq hyqVar = this.ag;
        if (hyqVar != null) {
            hyqVar.b();
        }
    }

    public final void P() {
        hzw hzwVar = this.al;
        if (hzwVar == null || !hzwVar.getHasSuggestions()) {
            an();
        }
    }

    @Override // defpackage.hxt
    public final void Q(final boolean z) {
        E().post(new Runnable() { // from class: hvx
            @Override // java.lang.Runnable
            public final void run() {
                if (z) {
                    hxr hxrVar = this;
                    if (hxrVar.o.U()) {
                        hxrVar.R();
                    }
                }
            }
        });
    }

    public final void R() {
        hzw hzwVar;
        if (((Boolean) this.H.a()).booleanValue()) {
            gfl gflVarB = ((gfn) this.C.a()).a(rpm.ca()).b();
            abxk abxkVar = ahrs.a;
            ahrq ahrqVar = new ahrq();
            ahre ahreVar = ahre.a;
            ahrd ahrdVar = new ahrd();
            abwf abwfVarA = this.p.a();
            abwfVarA.getClass();
            if ((ahrdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrdVar.y();
            }
            ahre ahreVar2 = (ahre) ahrdVar.b;
            ahreVar2.c = abwfVarA;
            ahreVar2.b |= 1;
            abxd abxdVarV = ahrdVar.v();
            abxdVarV.getClass();
            ahre ahreVar3 = (ahre) abxdVarV;
            if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrqVar.y();
            }
            ahrs ahrsVar = (ahrs) ahrqVar.b;
            ahrsVar.g = ahreVar3;
            ahrsVar.f = 10;
            gflVarB.g(ahta.a(ahrqVar));
            gflVarB.c();
        } else {
            gfq.b(this.D, rpm.ca(), null, null, 14);
        }
        if (this.Z) {
            return;
        }
        if (this.w == gph.a && ((hzwVar = this.al) == null || !hzwVar.getHasSuggestions())) {
            an();
        }
        if (H().o()) {
            hvt hvtVar = (hvt) H();
            hvtVar.r();
            hvtVar.g = hvtVar.g.a(hzg.HTT_QUICK_RELEASE);
            hvtVar.s();
        }
        hyq hyqVar = this.ag;
        if (hyqVar != null) {
            hyqVar.c();
        }
    }

    public final void S() {
        if (((Boolean) this.E.a()).booleanValue()) {
            final List listK = this.o.k();
            if (listK != null && !listK.isEmpty()) {
                feq.e(E(), ax, new Runnable() { // from class: hwe
                    @Override // java.lang.Runnable
                    public final void run() {
                        hxr hxrVar = this.a;
                        hxrVar.F.b(gmc.ae);
                        hxrVar.M(listK);
                    }
                });
                return;
            }
            if (this.am == null) {
                this.F.b(gmc.ae);
                this.am = this.ac;
                fae faeVar = this.aE;
                fam famVar = this.aF;
                final zyd zydVarA = faeVar.a();
                final zyd zydVarA2 = famVar.a();
                xab.b(zydVarA, zydVarA2).a(new Callable() { // from class: hwf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zyd zydVar = zydVarA;
                        zyd zydVar2 = zydVarA2;
                        hxr hxrVar = this;
                        try {
                            Object objO = zxn.o(zydVar);
                            objO.getClass();
                            Object objO2 = zxn.o(zydVar2);
                            objO2.getClass();
                            iyw iywVar = hxrVar.au;
                            Optional optionalOf = Optional.of((xfp) objO);
                            Optional optionalOf2 = Optional.of((xdl) objO2);
                            zxe zxeVar = hxrVar.ac;
                            zxeVar.getClass();
                            ahal.e(iywVar.a, null, 0, new iyv(iywVar, zxeVar, optionalOf, optionalOf2, null), 3);
                        } catch (Exception e) {
                            ((zdv) hxr.f.d().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "onKeyboardSearchSuggestionsReadyToDisplay$lambda$38", 2375, "VoicePlateActivity.kt")).x("Failed to retrieve fresh suggestions: %s", e.getMessage());
                        }
                        return null;
                    }
                }, this.aN);
            }
        }
    }

    @Override // defpackage.hxt
    public final void T(String str) {
        str.getClass();
        H().f(str);
    }

    public final void U() {
        if (!H().o()) {
            ((zdv) f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "onSoundDetected", 1838, "VoicePlateActivity.kt")).u("Unexpected onSoundDetected when mic is not open");
            return;
        }
        hvt hvtVar = (hvt) H();
        hvtVar.r();
        hvtVar.g = hvtVar.g.a(hzg.SOUND_DETECTED);
        hvtVar.s();
    }

    @Override // defpackage.hxt
    public final void V() {
        this.ad = true;
        y();
        ((hvv) I().getSuggestionsDistributor()).c = null;
        if (this.w == gph.b) {
            E().post(new Runnable() { // from class: hwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.ac();
                }
            });
        }
    }

    @Override // defpackage.hxt
    public final void W(String str) {
        str.getClass();
        this.ae = true;
        String str2 = this.X;
        if (str2 == null || str2.length() == 0) {
            this.X = str;
            if (this.w == gph.b) {
                E().post(new Runnable() { // from class: hwn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.ac();
                    }
                });
                return;
            }
            return;
        }
        this.X = this.X + "\n" + str;
    }

    public final void X() {
        E().removeCallbacks(this.W);
    }

    public final void Y() {
        AnimatorSet animatorSet = this.aY;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
        this.aY = null;
    }

    @Override // defpackage.hxt
    public final void Z() {
        this.L.v();
    }

    @Override // defpackage.eza
    public final void a() throws InterruptedException {
        int i2 = this.as;
        if (i2 == 5 || i2 == 4) {
            zdv zdvVar = (zdv) f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "mayFinish", 1022, "VoicePlateActivity.kt");
            int i3 = this.as;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            zdvVar.x("#mayFinish gets called when RunningState = %s", i4 != 3 ? i4 != 4 ? "unknown" : "Destroyed" : "Mock Destroyed");
            return;
        }
        this.as = 4;
        if (i2 == 3) {
            ar();
        } else {
            e();
        }
        Duration duration = this.aZ;
        if (duration.compareTo(Duration.ZERO) <= 0 || this.o.S()) {
            return;
        }
        this.bj.b(duration, new agum() { // from class: hwi
            @Override // defpackage.agum
            public final Object a() {
                hxr hxrVar = this.a;
                if (hxrVar.T && !hxrVar.o.Q()) {
                    hxrVar.an.a();
                }
                return agpu.a;
            }
        });
    }

    public final void aa() {
        if (((Boolean) this.aQ.a()).booleanValue() || this.o.R()) {
            hxo hxoVar = new hxo(this);
            this.aM.b(hxoVar);
            this.aX = hxoVar;
        }
    }

    public final void ab() {
        EditText editText;
        if (this.w == gph.b || (editText = this.ba) == null) {
            return;
        }
        if (((Boolean) this.aH.a()).booleanValue()) {
            ahal.e(this.aD, null, 0, new hxp(this, editText, null), 3);
        }
        TextWatcher textWatcher = (TextWatcher) this.bc.a();
        this.bb = textWatcher;
        editText.addTextChangedListener(textWatcher);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hws
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                textView.getClass();
                hxr hxrVar = this.a;
                hvu hvuVar = null;
                if (i2 == 1) {
                    hvu hvuVar2 = hxrVar.ab;
                    if (hvuVar2 == null) {
                        agvy.b("searchBarViewManager");
                    } else {
                        hvuVar = hvuVar2;
                    }
                    hvuVar.g();
                    hzw hzwVar = hxrVar.al;
                    if (hzwVar != null && hzwVar.getHasSuggestions()) {
                        hzwVar.d();
                    }
                    return true;
                }
                if (i2 != 3) {
                    return false;
                }
                hxrVar.M.E(4);
                String string = textView.getText().toString();
                hxrVar.H().f(string);
                if (hxrVar.ah) {
                    hxrVar.o.y(string);
                    return true;
                }
                hxrVar.D.b(rpm.cZ(), null, null);
                hxrVar.v.j(10);
                hxrVar.o.A(string, true, jlv.INVOCATION_TYPE_TEXT_SEARCH);
                return true;
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hwt
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                hvu hvuVar = this.a.ab;
                if (hvuVar == null) {
                    agvy.b("searchBarViewManager");
                    hvuVar = null;
                }
                hvuVar.g();
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: hvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText2;
                hxr hxrVar = this.a;
                hvu hvuVar = hxrVar.ab;
                if (hvuVar == null) {
                    agvy.b("searchBarViewManager");
                    hvuVar = null;
                }
                int i2 = hxrVar.ar;
                final SearchBar searchBar = (SearchBar) hvuVar;
                if ((searchBar.z == gph.a || searchBar.z == gph.c) && (editText2 = searchBar.E) != null) {
                    final int selectionStart = editText2.getSelectionStart();
                    searchBar.E.requestFocus();
                    if (Build.VERSION.SDK_INT >= 30) {
                        searchBar.E.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hvm
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                                if (windowInsets.isVisible(WindowInsets.Type.ime())) {
                                    int i3 = selectionStart;
                                    SearchBar searchBar2 = searchBar;
                                    searchBar2.E.setOnApplyWindowInsetsListener(null);
                                    if (i3 >= 0) {
                                        searchBar2.E.setSelection(i3);
                                    }
                                }
                                return view2.onApplyWindowInsets(windowInsets);
                            }
                        });
                        if (searchBar.E.getWindowInsetsController() != null) {
                            searchBar.B.isActive();
                            searchBar.E.getWindowInsetsController().show(WindowInsets.Type.ime());
                        }
                    } else {
                        searchBar.post(new Runnable() { // from class: hvn
                            @Override // java.lang.Runnable
                            public final void run() {
                                SearchBar searchBar2 = searchBar;
                                searchBar2.B.showSoftInput(searchBar2.E, 2, new ResultReceiver(new Handler(Looper.getMainLooper())) { // from class: com.google.android.apps.tvsearch.searchbar.SearchBar.2
                                    final /* synthetic */ int a;
                                    final /* synthetic */ SearchBar b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(SearchBar searchBar22, Handler handler, int i3) {
                                        super(handler);
                                        i = i3;
                                        searchBar = searchBar22;
                                    }

                                    @Override // android.os.ResultReceiver
                                    protected final void onReceiveResult(int i3, Bundle bundle) {
                                        super.onReceiveResult(i3, bundle);
                                        int i4 = i;
                                        if (i4 >= 0) {
                                            searchBar.E.setSelection(i4);
                                        }
                                    }
                                });
                            }
                        });
                    }
                    if (i2 == 1) {
                        if (searchBar.C == null) {
                            searchBar.i.inflate(R.layout.interactor_voiceplate_keyboard_bg, (ViewGroup) searchBar.getParent(), true);
                            searchBar.C = (ImageView) ((View) searchBar.getParent()).findViewById(R.id.keyboard_bg);
                        }
                        searchBar.C.setVisibility(0);
                    }
                }
            }
        });
    }

    public final void ac() {
        hvu hvuVar = this.ab;
        if (hvuVar == null) {
            agvy.b("searchBarViewManager");
            hvuVar = null;
        }
        ((SearchBar) hvuVar).setBackgroundResource(R.color.search_bar_opaque_bg_color);
    }

    public final void ad() throws InterruptedException {
        a();
        lzb lzbVar = this.L;
        lzbVar.k();
        lzbVar.j(Message.obtain((Handler) null, 12));
    }

    @Override // defpackage.hxt
    public final void ae(int i2) throws InterruptedException {
        if (this.Z) {
            return;
        }
        if (i2 == 2) {
            if (H().o()) {
                H().b();
                hyq hyqVar = this.ag;
                if (hyqVar != null) {
                    hyqVar.c();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 5) {
            if (H().p()) {
                H().l();
                return;
            }
            return;
        }
        if (i2 == 7) {
            ao();
            return;
        }
        if (i2 == 20) {
            a();
            return;
        }
        if (i2 == 23) {
            if (this.w == gph.b) {
                Object obj = this.ab;
                if (obj == null) {
                    agvy.b("searchBarViewManager");
                    obj = null;
                }
                SearchBar searchBar = (SearchBar) obj;
                if (searchBar.v()) {
                    searchBar.T.a((View) obj).start();
                    return;
                }
                return;
            }
            return;
        }
        switch (i2) {
            case 26:
                ((SuggestionsScrollView) J()).h = true;
                H().j();
                break;
            case 27:
                H().e();
                break;
            case 28:
                if (this.v.q() || this.ah) {
                    a();
                    break;
                }
                break;
            case 29:
                if (((hvt) H()).g.j() == hzk.ERROR) {
                    H().c("");
                    break;
                }
                break;
            case 30:
                eD();
                break;
            case 31:
                hzw hzwVar = this.al;
                if (hzwVar != null) {
                    hzwVar.c();
                    ((SuggestionsScrollView) hzwVar).h = false;
                }
                H().j();
                break;
            case 32:
                hvt hvtVar = (hvt) H();
                hvtVar.r();
                hvtVar.g = hvtVar.g.a(hzg.START_INTERACTION);
                hvtVar.s();
                break;
            default:
                ((zdv) f.d().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "updateSearchBar", 2264, "VoicePlateActivity.kt")).v("#updateSearchBar receives SearchState %s that cannot be handled", i2);
                break;
        }
    }

    @Override // defpackage.hxt
    public final void af(final SuggestionChipList suggestionChipList) {
        E().post(new Runnable() { // from class: hwo
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar = this.a;
                if (hxrVar.Z) {
                    return;
                }
                hxrVar.ag(suggestionChipList, !r1.f);
            }
        });
    }

    public final void ag(SuggestionChipList suggestionChipList, boolean z) {
        hzw hzwVarJ = J();
        SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) hzwVarJ;
        suggestionsScrollView.i();
        suggestionsScrollView.h(suggestionChipList);
        if (hzwVarJ.getHasSuggestions() && !H().m()) {
            hzwVarJ.d();
        }
        suggestionsScrollView.h = z;
        H().j();
    }

    @Override // defpackage.hxt
    public final boolean ah() {
        return this.ah;
    }

    public final boolean ai() {
        return agvy.c("android.katniss.search.action.DISPLAY_ERROR", this.d.getAction()) && !this.o.R();
    }

    public final boolean aj() {
        String str;
        return (!this.ae || (str = this.X) == null || str.length() == 0) ? false : true;
    }

    public final hwy ak() {
        hwy hwyVar = this.aq;
        if (hwyVar != null) {
            return hwyVar;
        }
        agvy.b("searchBarListener");
        return null;
    }

    @Override // defpackage.hxt
    public final void al(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            z();
        } else if (((hvt) H()).g.j() == hzk.LOADING_IN_APP) {
            hvt hvtVar = (hvt) H();
            hvtVar.g = hvtVar.g.a(hzg.IN_APP_INTERACTION_EXECUTED);
        }
    }

    @Override // defpackage.eza
    public final void b() {
        gph gphVar = this.w;
        if (gphVar == gph.a || gphVar == gph.c) {
            y();
        }
    }

    @Override // defpackage.eza
    public final void c(String str) {
        this.v.k(str);
    }

    @Override // defpackage.eza
    public final void d(Runnable runnable) {
        exh exhVar = this.c;
        if (exhVar != null) {
            exhVar.l(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void f() throws InterruptedException {
        if (H().n()) {
            H().e();
        } else {
            K();
        }
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void g() throws InterruptedException {
        int i2 = this.as;
        if (i2 != 4 && i2 != 5) {
            ar();
        }
        this.m.b(this.aU);
        this.aU = null;
        hvu hvuVar = this.ab;
        if (hvuVar == null) {
            agvy.b("searchBarViewManager");
            hvuVar = null;
        }
        SearchBar searchBar = (SearchBar) hvuVar;
        iak iakVar = searchBar.I;
        if (iakVar != null) {
            iakVar.a();
            searchBar.I = null;
        }
        SuggestionsScrollView suggestionsScrollView = searchBar.L;
        if (suggestionsScrollView != null) {
            suggestionsScrollView.getViewTreeObserver().removeOnScrollChangedListener(searchBar.K);
            searchBar.K = null;
            searchBar.L.c();
            searchBar.L.removeAllViews();
            searchBar.L = null;
        }
        StreamingTextView streamingTextView = searchBar.M;
        if (streamingTextView != null) {
            streamingTextView.removeTextChangedListener(searchBar.N);
        }
        searchBar.N = null;
        searchBar.x = null;
        searchBar.A = null;
        searchBar.F = null;
        searchBar.v = null;
        searchBar.G = null;
        searchBar.H = null;
        searchBar.M = null;
        EditText editText = searchBar.E;
        if (editText != null) {
            editText.setOnApplyWindowInsetsListener(null);
            searchBar.E = null;
        }
        searchBar.D = null;
        searchBar.C = null;
        searchBar.removeAllViews();
        searchBar.B = null;
        hvt hvtVar = (hvt) H();
        hvtVar.g = hvtVar.e;
        Map map = hvtVar.f;
        for (hyr hyrVar : map.values()) {
            hyrVar.b = null;
            hyrVar.c = null;
        }
        map.clear();
        this.as = 5;
        super.g();
    }

    @Override // defpackage.ewp
    protected final void h() {
        if (this.x.b()) {
            ViewGroup viewGroup = this.be;
            if (viewGroup == null) {
                agvy.b("rootView");
                viewGroup = null;
            }
            viewGroup.setLayerType(0, null);
            this.F.m(gmc.aC);
            ((gfn) this.C.a()).a(rpm.dr()).b().c();
        }
    }

    @Override // defpackage.ewp
    public final void j(Intent intent) {
        String strI;
        hyq hyqVar;
        gnv gnvVar = this.ap;
        if (yqs.a(gnvVar.g, Duration.ZERO)) {
            mcw mcwVar = gnvVar.j;
            gnvVar.g = Duration.ofMillis(SystemClock.uptimeMillis());
        }
        if (agvy.c(this.d.getAction(), "android.katniss.search.action.DISPLAY_ERROR") && !agvy.c(intent.getAction(), "android.katniss.search.action.DISPLAY_ERROR") && this.aX == null) {
            aa();
            if (intent.getBooleanExtra("isMicOpen", false) && (((strI = this.o.i()) == null || strI.length() == 0) && (hyqVar = this.ag) != null)) {
                hyqVar.a(this.Q);
            }
        }
        this.d = intent;
        aq(intent);
        this.X = null;
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void k() {
        hzw hzwVar;
        this.q.g();
        gph gphVar = this.w;
        if ((gphVar == gph.a || gphVar == gph.c) && (hzwVar = this.al) != null) {
            hzwVar.c();
        }
        ((exf) this).e.a();
        if (((Boolean) this.aI.a()).booleanValue()) {
            agow agowVar = this.aR;
            if (((jnr) agowVar.a()).n()) {
                jno jnoVar = this.bf;
                if (jnoVar != null) {
                    ((jnr) agowVar.a()).h(jnoVar);
                }
                this.bf = null;
            }
        }
    }

    @Override // defpackage.ewp
    public final void l() {
        gnv gnvVar = this.ap;
        mcw mcwVar = gnvVar.j;
        gnvVar.d = Duration.ofMillis(SystemClock.uptimeMillis());
        if (this.aU == null) {
            ap();
        }
        if (this.w == gph.b) {
            ac();
            hvu hvuVar = this.ab;
            if (hvuVar == null) {
                agvy.b("searchBarViewManager");
                hvuVar = null;
            }
            if (!hvuVar.v()) {
                ao();
            }
        }
        X();
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void m() {
        ((exf) this).e.b();
        this.bj.a();
        gmd gmdVar = this.F;
        gmdVar.e(gmb.a);
        long longExtra = this.d.getLongExtra("intent_sent_elapsed_real_time", -1L);
        if (longExtra > 0) {
            gmdVar.j(longExtra);
        }
        if (this.d.getIntExtra("search_type", 1) == 12) {
            gmdVar.m(gmc.ad);
        }
        gnv gnvVar = this.ap;
        if (yqs.a(gnvVar.h, Duration.ZERO)) {
            mcw mcwVar = gnvVar.j;
            gnvVar.h = Duration.ofMillis(SystemClock.uptimeMillis());
        }
        this.as = 2;
        if (this.w == gph.b && this.m.h) {
            y();
        }
        if (ai()) {
            if (this.d.hasExtra("EXTRA_AUDIO_FD")) {
                feq.e(E(), aw, new Runnable() { // from class: hwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        hxr hxrVar = this.a;
                        Intent intent = hxrVar.d;
                        intent.getClass();
                        if (hxrVar.ai()) {
                            if (intent.getBooleanExtra("EXTRA_LOG_LIBASSISTANT_NOT_RUNNING", false)) {
                                hxrVar.M.G(6);
                                ((gfn) hxrVar.C.a()).a(rpm.az()).b().c();
                            }
                            hxrVar.L();
                            hxrVar.n.b();
                        }
                    }
                });
            } else {
                if (this.d.getBooleanExtra("EXTRA_LOG_LIBASSISTANT_NOT_RUNNING", false)) {
                    ((gfn) this.C.a()).a(rpm.az()).b().c();
                    this.M.G(6);
                }
                L();
                this.n.b();
            }
        }
        if (((Boolean) this.aC.a()).booleanValue() && this.n.f() && !this.bd) {
            ((zdv) f.d().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "onResume", 798, "VoicePlateActivity.kt")).u("Re-starting KatnissVoiceInteractionService to recover audio permission.");
            exz exzVar = this.bi;
            Intent intent = this.d;
            intent.getClass();
            exzVar.d(intent);
            this.bd = true;
        }
        if (((Boolean) this.aI.a()).booleanValue()) {
            agow agowVar = this.aR;
            if (((jnr) agowVar.a()).n()) {
                hxc hxcVar = new hxc(this);
                this.bf = hxcVar;
                ((jnr) agowVar.a()).c(hxcVar);
            }
        }
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void n() {
        ViewGroup viewGroup;
        hyq hyqVar;
        View view;
        ((exf) this).e.e();
        zdy zdyVar = f;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "onStart", 586, "VoicePlateActivity.kt")).u("onStart");
        SearchBar searchBar = (SearchBar) eB(R.id.search_bar);
        hxv hxvVar = this.x;
        if (hxvVar.b()) {
            ((gfn) this.C.a()).a(rpm.ds()).b().c();
            this.F.b(gmc.aC);
        }
        if (searchBar.m.b()) {
            searchBar.P = new uta();
        }
        HorizontalScrollView horizontalScrollView = searchBar.A;
        if (horizontalScrollView instanceof BoundedHorizontalScrollView) {
            searchBar.removeView(horizontalScrollView);
            searchBar.A = null;
            searchBar.M = null;
        }
        lzb lzbVar = this.L;
        if (!lzbVar.p) {
            lzbVar.k();
            lzbVar.j(Message.obtain((Handler) null, 31));
        }
        Executor executor = this.aJ;
        executor.execute(wyo.h(new Runnable() { // from class: hwj
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar = this.a;
                hxrVar.at.a(hxrVar, hxrVar.S);
            }
        }));
        if (this.as == 4) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "setup", 1308, "VoicePlateActivity.kt")).u("#setup");
            this.m.q = this;
            this.bh.a = this;
            this.v.m(this);
            hxu hxuVar = this.p;
            hxuVar.b = this;
            this.Z = false;
            Object obj = this.aA.get();
            obj.getClass();
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean booleanExtra = this.d.getBooleanExtra("isMicOpen", false);
            jdt jdtVar = this.o;
            String strI = jdtVar.i();
            hvu hvuVar = this.ab;
            if (hvuVar == null) {
                agvy.b("searchBarViewManager");
                hvuVar = null;
            }
            SearchBar searchBar2 = (SearchBar) hvuVar;
            searchBar2.w = zBooleanValue;
            LogoView logoView = searchBar2.F;
            if (logoView != null) {
                if (!zBooleanValue) {
                    searchBar2.u(logoView.getState(), true);
                } else if (logoView.getState() == 7) {
                    searchBar2.u(10, true);
                } else if (searchBar2.F.getState() == 5) {
                    searchBar2.u(11, true);
                }
            }
            if (strI == null || strI.length() == 0) {
                H().a(booleanExtra ? hzk.LISTENING : hzk.ATTENTION_ASSISTANT);
            } else {
                H().a(hzk.ATTENTION_ASSISTANT);
                H().f(strI);
            }
            if (hxuVar.c() && jdtVar.U()) {
                R();
            }
            if (this.w == gph.b && (view = this.aW) != null && view.getVisibility() == 8) {
                Intent intent = this.d;
                intent.getClass();
                if (agvy.c(ewj.a(intent, this.ay), "com.google.android.tvlauncher")) {
                    view.animate().setDuration(getResources().getInteger(R.integer.search_dim_background_duration_ms)).alpha(1.0f).setStartDelay(getResources().getInteger(R.integer.search_dim_background_start_delay_ms));
                    view.setVisibility(0);
                }
            }
            String str = this.aK.a;
            this.P = str;
            this.q.i(str);
            if (!hxvVar.b()) {
                Handler handlerE = E();
                Object objA = this.aP.a();
                objA.getClass();
                Duration durationB = acbh.b((abwf) objA);
                durationB.getClass();
                this.ag = new hyq(handlerE, durationB);
            }
            if (booleanExtra && ((strI == null || strI.length() == 0) && (hyqVar = this.ag) != null)) {
                hyqVar.a(this.Q);
            }
            if (this.l.isTouchExplorationEnabled()) {
                ViewGroup viewGroup2 = this.be;
                if (viewGroup2 == null) {
                    agvy.b("rootView");
                    viewGroup2 = null;
                }
                viewGroup2.setAccessibilityDelegate(new hxg());
            }
            hvu hvuVar2 = this.ab;
            if (hvuVar2 == null) {
                agvy.b("searchBarViewManager");
                hvuVar2 = null;
            }
            hvuVar2.w(ak(), G());
            executor.execute(wyo.h(new Runnable() { // from class: hwl
                @Override // java.lang.Runnable
                public final void run() {
                    hxr hxrVar = this.a;
                    hxrVar.aa();
                    hxrVar.ab();
                    hxrVar.s.b(hxrVar.O);
                }
            }));
        }
        this.as = 1;
        gnv gnvVar = this.ap;
        mcw mcwVar = gnvVar.j;
        gnvVar.e = Duration.ofMillis(SystemClock.uptimeMillis());
        this.F.m(gmc.X);
        if (this.o.Z() == jlv.INVOCATION_TYPE_HOTWORD) {
            if ((this.w == gph.b || !this.m.l) && ((Boolean) this.aB.a()).booleanValue()) {
                lzbVar.y(this.aO.d(this.P));
            } else {
                lzbVar.y(this.aO.c(this.P));
            }
        }
        if (Build.VERSION.SDK_INT <= 29) {
            this.bi.a();
        }
        ViewGroup viewGroup3 = this.be;
        if (viewGroup3 == null) {
            agvy.b("rootView");
            viewGroup = null;
        } else {
            viewGroup = viewGroup3;
        }
        agm.b(viewGroup, new Runnable() { // from class: hwk
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar = this.a;
                mcw mcwVar2 = hxrVar.ap.j;
                Duration.ofMillis(SystemClock.uptimeMillis());
                hxrVar.b.addOnFrameMetricsAvailableListener(new hxd(hxrVar), hxrVar.E());
            }
        });
    }

    @Override // defpackage.exf, defpackage.ewp
    public final void o() throws InterruptedException {
        ((zdv) f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity", "onStop", 851, "VoicePlateActivity.kt")).u("onStop");
        Y();
        this.at.b(this);
        lzb lzbVar = this.L;
        lzbVar.k();
        lzbVar.j(Message.obtain((Handler) null, 37));
        this.ah = false;
        gnv gnvVar = this.ap;
        boolean zA = gms.a(gnvVar.a, gnvVar.b, gnvVar.i);
        gnu gnuVar = this.av;
        if (zA) {
            if (gnuVar.d.b()) {
                gnuVar.a(gnt.ASSISTANT_REQUEST_BUTTON_PRESS_TIMESTAMP_RECIEVED_BY_ATV_TO_INTENT_GIA_CHAT, gnvVar.a, gnvVar.b);
                gnuVar.a(gnt.ASSISTANT_REQUEST_BUTTON_PRESS_TIMESTAMP_RECIEVED_BY_ATV_TO_UI_GIA_CHAT, gnvVar.a, gnvVar.i);
            } else {
                gnuVar.a(gnt.ASSISTANT_REQUEST_BUTTON_PRESS_TIMESTAMP_RECIEVED_BY_ATV_TO_INTENT, gnvVar.a, gnvVar.b);
                gnuVar.a(gnt.ASSISTANT_REQUEST_BUTTON_PRESS_TIMESTAMP_RECIEVED_BY_ATV_TO_UI, gnvVar.a, gnvVar.i);
            }
        }
        if (gms.a(gnvVar.b, gnvVar.c, gnvVar.e, gnvVar.f, gnvVar.h, gnvVar.i)) {
            geq geqVar = gnuVar.c;
            if (geqVar.b()) {
                gnuVar.a(gnt.ASSISTANT_REQUEST_INTENT_TO_UI_AFTER_REBOOT, gnvVar.b, gnvVar.i);
            } else if (geqVar.e.get()) {
                gnuVar.a(gnt.ASSISTANT_REQUEST_INTENT_TO_UI_AFTER_SLEEP, gnvVar.b, gnvVar.i);
            } else if (geqVar.f.get()) {
                gnuVar.a(gnt.ASSISTANT_REQUEST_INTENT_TO_UI_COLD, gnvVar.b, gnvVar.i);
                gnuVar.a(gnt.COLD_VOICEPLATE_SERVICE_ON_START_COMMAND_TO_ACTIVITY_CREATE, gnvVar.b, gnvVar.c);
                gnuVar.a(gnt.COLD_VOICEPLATE_ACTIVITY_CREATE_TO_START, gnvVar.c, gnvVar.e);
                gnuVar.a(gnt.COLD_VOICEPLATE_ACTIVITY_START_TO_POST_CREATE, gnvVar.e, gnvVar.f);
                gnuVar.a(gnt.COLD_VOICEPLATE_ACTIVITY_POST_CREATE_TO_RESUME, gnvVar.f, gnvVar.h);
                gnuVar.a(gnt.COLD_VOICEPLATE_ACTIVITY_RESUME_TO_FIRST_DRAW, gnvVar.h, gnvVar.i);
                gfr gfrVar = gnuVar.f;
                rqs rqsVarCA = rpm.cA();
                abqb abqbVar = abqb.OK;
                gfrVar.a(rqsVarCA, abqbVar, gnvVar.a(gnvVar.b), null);
                gfrVar.a(rpm.dz(), abqbVar, gnvVar.a(gnvVar.c), null);
                gfrVar.a(rpm.dF(), abqbVar, gnvVar.a(gnvVar.e), null);
                gfrVar.a(rpm.dB(), abqbVar, gnvVar.a(gnvVar.f), null);
                gfrVar.a(rpm.dD(), abqbVar, gnvVar.a(gnvVar.h), null);
                gfrVar.c(rpm.eJ(), abqbVar, gnvVar.a(gnvVar.i), null);
            } else {
                gnuVar.a(gnt.ASSISTANT_REQUEST_INTENT_TO_UI_WARM, gnvVar.b, gnvVar.i);
                gnuVar.a(gnt.WARM_VOICEPLATE_SERVICE_ON_START_COMMAND_TO_ACTIVITY_CREATE, gnvVar.b, gnvVar.c);
                gnuVar.a(gnt.WARM_VOICEPLATE_ACTIVITY_CREATE_TO_START, gnvVar.c, gnvVar.e);
                gnuVar.a(gnt.WARM_VOICEPLATE_ACTIVITY_START_TO_POST_CREATE, gnvVar.e, gnvVar.f);
                gnuVar.a(gnt.WARM_VOICEPLATE_ACTIVITY_POST_CREATE_TO_RESUME, gnvVar.f, gnvVar.h);
                gnuVar.a(gnt.WARM_VOICEPLATE_ACTIVITY_RESUME_TO_FIRST_DRAW, gnvVar.h, gnvVar.i);
                gfr gfrVar2 = gnuVar.f;
                gfrVar2.b(rpm.cB(), gnvVar.a(gnvVar.b), null);
                rqs rqsVarDA = rpm.dA();
                abqb abqbVar2 = abqb.OK;
                gfrVar2.a(rqsVarDA, abqbVar2, gnvVar.a(gnvVar.c), null);
                gfrVar2.a(rpm.dG(), abqbVar2, gnvVar.a(gnvVar.e), null);
                gfrVar2.a(rpm.dC(), abqbVar2, gnvVar.a(gnvVar.f), null);
                gfrVar2.a(rpm.dE(), abqbVar2, gnvVar.a(gnvVar.h), null);
                gfrVar2.c(rpm.eK(), abqbVar2, gnvVar.a(gnvVar.i), null);
            }
        } else if (gms.a(gnvVar.b, gnvVar.d, gnvVar.e, gnvVar.g, gnvVar.h, gnvVar.i)) {
            gnuVar.a(gnt.ASSISTANT_REQUEST_INTENT_TO_UI_HOT, gnvVar.b, gnvVar.i);
            gnuVar.a(gnt.HOT_VOICEPLATE_SERVICE_ON_START_COMMAND_TO_RESTART, gnvVar.b, gnvVar.d);
            gnuVar.a(gnt.HOT_VOICEPLATE_ACTIVITY_RESTART_TO_START, gnvVar.d, gnvVar.e);
            gnuVar.a(gnt.HOT_VOICEPLATE_ACTIVITY_START_TO_NEW_INTENT, gnvVar.e, gnvVar.g);
            gnuVar.a(gnt.HOT_VOICEPLATE_ACTIVITY_NEW_INTENT_TO_RESUME, gnvVar.g, gnvVar.h);
            gnuVar.a(gnt.HOT_VOICEPLATE_ACTIVITY_RESUME_TO_FIRST_DRAW, gnvVar.h, gnvVar.i);
        } else if (gnvVar.c.compareTo(Duration.ZERO) > 0 || gnvVar.f.compareTo(Duration.ZERO) > 0) {
            if (gnvVar.b.compareTo(Duration.ZERO) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 463, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start no serviceStartCommand.");
            } else if (gnvVar.c.compareTo(Duration.ZERO) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 466, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start no activityCreate.");
            } else if (gnvVar.c.compareTo(gnvVar.b) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 468, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start activityCreate before serviceStartCommand.");
            } else if (gnvVar.e.compareTo(Duration.ZERO) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 472, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start no activityStart.");
            } else if (gnvVar.e.compareTo(gnvVar.c) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 474, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start activityStart before activityCreate.");
            } else if (gnvVar.f.compareTo(Duration.ZERO) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 477, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start no activityPostCreate.");
            } else if (gnvVar.f.compareTo(gnvVar.e) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 479, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start activityPostCreate before activityStart.");
            } else if (gnvVar.h.compareTo(Duration.ZERO) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 482, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start no activityResume.");
            } else if (gnvVar.h.compareTo(gnvVar.f) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 484, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start activityResume before activityPostCreate.");
            } else if (gnvVar.i.compareTo(Duration.ZERO) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 488, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start no activityDrawAt.");
            } else if (gnvVar.i.compareTo(gnvVar.h) <= 0) {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 490, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start activityDrawAt before activityResume.");
            } else {
                ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 493, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Warm start unknown reason.");
            }
        } else if (gnvVar.d.compareTo(Duration.ZERO) > 0 || gnvVar.g.compareTo(Duration.ZERO) > 0) {
            if (gnvVar.b.compareTo(Duration.ZERO) > 0) {
                if (gnvVar.d.compareTo(Duration.ZERO) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 503, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start no activityRestart.");
                } else if (gnvVar.d.compareTo(gnvVar.b) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 505, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start activityRestart before serviceStartCommand.");
                } else if (gnvVar.e.compareTo(Duration.ZERO) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 509, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start no activityStart.");
                } else if (gnvVar.e.compareTo(gnvVar.d) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 511, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start activityStart before activityRestart.");
                } else if (gnvVar.g.compareTo(Duration.ZERO) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 514, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start no activityNewIntent.");
                } else if (gnvVar.g.compareTo(gnvVar.e) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 516, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start activityNewIntent before activityStart.");
                } else if (gnvVar.h.compareTo(Duration.ZERO) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 519, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start no activityResume.");
                } else if (gnvVar.h.compareTo(gnvVar.g) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 521, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start activityResume before activityNewIntent.");
                } else if (gnvVar.i.compareTo(Duration.ZERO) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 524, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start no activityDrawAt.");
                } else if (gnvVar.i.compareTo(gnvVar.h) <= 0) {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 526, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start activityDrawAt before activityResume.");
                } else {
                    ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 529, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Hot start unknown reason.");
                }
            }
        } else if (gnvVar.b.compareTo(Duration.ZERO) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 534, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start no serviceStartCommand.");
        } else if (gnvVar.e.compareTo(Duration.ZERO) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 537, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start no activityStart.");
        } else if (gnvVar.e.compareTo(gnvVar.c) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 539, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start activityStart before serviceStartCommand.");
        } else if (gnvVar.h.compareTo(Duration.ZERO) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 543, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start no activityResume.");
        } else if (gnvVar.h.compareTo(gnvVar.e) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 545, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start activityResume before activityStart.");
        } else if (gnvVar.i.compareTo(Duration.ZERO) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 548, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start no activityDrawAt.");
        } else if (gnvVar.i.compareTo(gnvVar.h) <= 0) {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 550, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start activityDrawAt before activityResume.");
        } else {
            ((zdv) ((zdv) gnu.a.d()).q("com/google/android/apps/tvsearch/logging/voiceplate/VoicePlateLoggerImpl", "recordFailureReason", 553, "VoicePlateLoggerImpl.java")).u("Not a valid VPA startup metric! Unknown start unknown reason.");
        }
        gnvVar.a = Duration.ZERO;
        gnvVar.b = Duration.ZERO;
        gnvVar.c = Duration.ZERO;
        gnvVar.d = Duration.ZERO;
        gnvVar.e = Duration.ZERO;
        gnvVar.f = Duration.ZERO;
        gnvVar.g = Duration.ZERO;
        gnvVar.h = Duration.ZERO;
        gnvVar.i = Duration.ZERO;
        if ((this.w == gph.b || !this.m.l) && ((Boolean) this.aB.a()).booleanValue()) {
            if (this.R) {
                this.aO.b();
                this.R = false;
            } else {
                this.aO.a(this.P);
            }
        }
        if (this.as == 4) {
            ar();
        } else {
            this.as = 3;
        }
        ((exf) this).e.f();
    }

    @Override // defpackage.ewp, android.view.Window.Callback
    public final void onAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 33) {
            eB(R.id.search_bar).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hwr
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    this.a.b.getDecorView().setUnrestrictedPreferKeepClearRects(yyk.o(new Rect(i2, i3, i4, i5)));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // defpackage.ewp, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            r3.getClass()
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 == r0) goto L11
            r0 = 96
            if (r2 == r0) goto L11
            switch(r2) {
                case 19: goto L11;
                case 20: goto L11;
                case 21: goto L11;
                case 22: goto L11;
                default: goto L10;
            }
        L10:
            goto L31
        L11:
            r1.X()
            hvq r0 = r1.H()
            boolean r0 = r0.o()
            if (r0 == 0) goto L31
            hvq r0 = r1.H()
            r0.b()
            jdt r0 = r1.o
            r0.M()
            hyq r0 = r1.ag
            if (r0 == 0) goto L31
            r0.c()
        L31:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxr.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // defpackage.ewp, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 >= 15) {
            int i3 = this.as;
            if (i3 == 3 || i3 == 4) {
                eD();
            }
        }
    }
}
