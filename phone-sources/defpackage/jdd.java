package defpackage;

import android.animation.ObjectAnimator;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.util.Property;
import android.util.Rational;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;
import j$.time.Duration;
import j$.time.Instant;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdd extends xch implements jbt, fsv, jbs {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/player/TvodPlayerFragment");
    private static final long ay;
    private static final long az;
    public static final long b;
    public ouk A;
    public ouj B;
    public ExoPlayer C;
    public long D;
    public jdg E;
    public boolean F;
    public egc G;
    public byte[] H;
    public out I;
    public long J;
    public vwe K;
    public ksy L;
    public View M;
    public TextView N;
    public jdh O;
    public cve P;
    public ConstraintLayout Q;
    public PlayerControlView R;
    public int S;
    public long T;
    public boolean U;
    public boolean V;
    public AlertDialog W;
    public boolean X;
    public boolean Y;
    public jbo Z;
    private fny aA;
    private long aB;
    private long aC;
    private jbq aD;
    private Toolbar aE;
    private DefaultTimeBar aF;
    private iea aG;
    private iej aH;
    private jca aI;
    private Runnable aJ;
    private long aK;
    private boolean aL;
    private boolean aM;
    private inn aN;
    private boolean aO;
    private final eam aP;
    private final jcu aQ;
    private final fnt aR;
    private PlayerControlView aS;
    public final jcs aa;
    public final oui ab;
    public PlayerView ac;
    public TextView ad;
    public TextView ae;
    public lzw af;
    public lsc ag;
    public jdr ah;
    public ltw ai;
    public isi aj;
    public jan ak;
    public lqs al;
    public lhr am;
    public final nxb an = new nxb();
    public jwq ao;
    public kgu ap;
    public irc aq;
    public kw ar;
    public final pku as;
    public pku at;
    public pku au;
    public cvw av;
    public kuw aw;
    public kuw ax;
    public lfn c;
    public iea d;
    public ldv e;
    public lzz f;
    public idf g;
    public ExecutorService h;
    public Executor i;
    public String j;
    public xla k;
    public xke l;
    public ino m;
    public lzi n;
    public ljj o;
    public idf p;
    public idf q;
    public mem r;
    public SharedPreferences s;
    public iea t;
    public jcn u;
    public List v;
    public List w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        long j = ynm.a;
        b = ylh.o(1, yno.e);
        ay = ylh.o(3, yno.e);
        az = ylh.o(1, yno.d);
    }

    public jdd() {
        yhb yhbVar = yhb.a;
        this.v = yhbVar;
        this.w = yhbVar;
        long j = ynm.a;
        this.D = 0L;
        this.I = out.a;
        this.J = 0L;
        this.K = Q(System.currentTimeMillis());
        long j2 = ynm.a;
        this.aB = j2;
        this.aC = j2;
        this.S = 4;
        this.T = j2;
        this.aK = 0L;
        this.aP = new jcw(this);
        this.as = new pku(this);
        this.aa = new jcs(this, this.X);
        this.ab = new jcv(this);
        this.aQ = new jcu(0);
        this.aR = new jcr(this);
    }

    public static final void N(View view) {
        view.animate().alpha(0.3f).setDuration(500L);
        new Handler(Looper.getMainLooper()).postDelayed(new iuc(view, 16), 500L);
    }

    public static final vwe Q(long j) {
        long j2 = j * 1000000;
        vwe vweVarF = vxf.f(j2 / 1000000000, (int) (j2 % 1000000000));
        vweVarF.getClass();
        return vweVarF;
    }

    private final PictureInPictureParams U() {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        PlayerView playerView = this.ac;
        if (playerView != null) {
            S();
            kw.r(builder, playerView);
        }
        ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null) {
            PictureInPictureParams.Builder aspectRatio = builder.setAspectRatio(new Rational(16, 9));
            if (Build.VERSION.SDK_INT >= 26) {
                aspectRatio.setActions(S().q(exoPlayer.u(), "tvod_fragment"));
                if (Build.VERSION.SDK_INT >= 31) {
                    aspectRatio.setAutoEnterEnabled(exoPlayer.u());
                }
            }
        }
        PictureInPictureParams pictureInPictureParamsBuild = builder.build();
        pictureInPictureParamsBuild.getClass();
        return pictureInPictureParamsBuild;
    }

    private final void V(inn innVar) {
        jdg jdgVar = this.E;
        if (jdgVar != null) {
            jdgVar.l(String.valueOf(innVar.c));
            jdgVar.m(innVar.b);
            wlx wlxVar = innVar.d;
            jdgVar.k(wlxVar);
            String str = wlxVar != null ? wlxVar.d : null;
            if (str == null || yks.e(jdgVar.a, str)) {
                return;
            }
            jdgVar.a = str;
            jdgVar.G(1);
        }
    }

    private final boolean W(long j) {
        return ynm.b(j, this.aB) < 0;
    }

    public final void A() {
        Context context = getContext();
        if (context != null) {
            new Handler(context.getMainLooper()).post(new iuc(this, 13));
        } else {
            ((tug) a.g().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "seekAndPlay", 1461, "TvodPlayerFragment.kt")).s("Failed to seekAndPlay: Context is not available.");
        }
    }

    public final void B(ouk oukVar) {
        ExoPlayer exoPlayer;
        if (oukVar != null) {
            String str = ouk.a.b;
            String str2 = oukVar.b;
            if (yks.e(str2, str) || (exoPlayer = this.C) == null) {
                return;
            }
            eyu eyuVar = new eyu((eyv) exoPlayer.O());
            eyuVar.n(str2);
            eyuVar.k(oukVar.a());
            exoPlayer.af(new eyv(eyuVar));
        }
    }

    public final void C() {
        if (getActivity() == null) {
            ((tug) a.g().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "setupPictureInPicture", 2081, "TvodPlayerFragment.kt")).v("Fragment %s not attached to an activity.", this);
        } else if (l().c() && requireActivity().getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            requireActivity().setPictureInPictureParams(U());
        }
    }

    public final void D() {
        ((tug) ((tug) a.e().h(tvo.a, "[GTVM-Kinetoscope]")).k(tvj.FULL).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "setupPlayerController$java_com_google_android_apps_googletv_app_player_player", 1531, "TvodPlayerFragment.kt")).v("setupPlayerController for account: %s", ((ksn) ((ldy) e()).a().g()).a);
        j().b(this);
        PlayerControlView playerControlView = this.aS;
        playerControlView.getClass();
        playerControlView.J = this;
        PlayerControlView playerControlView2 = this.R;
        if (playerControlView2 != null) {
            playerControlView2.J = this;
        }
    }

    public final void E(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.left_panel);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.right_panel);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.exo_ffwd);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.exo_rew);
        this.ad = (TextView) view.findViewById(R.id.feedback_text_rewind);
        this.ae = (TextView) view.findViewById(R.id.feedback_text_forward);
        nhl nhlVar = new nhl(requireContext(), new jda(this, imageView));
        nhl nhlVar2 = new nhl(requireContext(), new jdb(this, imageView2));
        imageView.setOnTouchListener(new jcd(nhlVar, 2));
        imageView2.setOnTouchListener(new jcd(nhlVar2, 3));
        imageView4.setOnClickListener(new jcy(this, imageView));
        imageView3.setOnClickListener(new jcz(this, imageView2));
    }

    public final void F(View view) {
        idf idfVar;
        idf idfVar2;
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view.findViewById(R.id.exo_progress);
        ImageView imageView = (ImageView) view.findViewById(R.id.scrubbing_position);
        View viewFindViewById = view.findViewById(R.id.previewContainer);
        viewFindViewById.getClass();
        View viewFindViewById2 = view.findViewById(R.id.scrubbingPreview);
        viewFindViewById2.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.scrubbingPreviewTimestamp);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        if (!l().e() || this.C == null || getContext() == null || defaultTimeBar == null) {
            return;
        }
        ((tug) a.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "setupThumbnailScrubbing", 1126, "TvodPlayerFragment.kt")).s("Setting up thumbnail scrubbing preview for Tvod Player");
        Context context = getContext();
        context.getClass();
        ExoPlayer exoPlayer = this.C;
        exoPlayer.getClass();
        imageView.getClass();
        idf idfVar3 = this.p;
        lsc lscVar = null;
        if (idfVar3 == null) {
            yks.c("imageFunction");
            idfVar = null;
        } else {
            idfVar = idfVar3;
        }
        idf idfVar4 = this.q;
        if (idfVar4 == null) {
            yks.c("cacheImageFunction");
            idfVar2 = null;
        } else {
            idfVar2 = idfVar4;
        }
        jca jcaVar = new jca(context, exoPlayer, defaultTimeBar, imageView, viewFindViewById, imageView2, textView, idfVar, idfVar2, n());
        this.aI = jcaVar;
        defaultTimeBar.b(jcaVar);
        Executor executorN = n();
        ldv ldvVar = this.e;
        if (ldvVar == null) {
            yks.c("accountManagerWrapper");
            ldvVar = null;
        }
        ksy ksyVar = this.L;
        if (ksyVar == null) {
            yks.c("assetId");
            ksyVar = null;
        }
        lsc lscVar2 = this.ag;
        if (lscVar2 == null) {
            yks.c("getStreamsFunction");
        } else {
            lscVar = lscVar2;
        }
        iea ieaVarA = jbr.a(executorN, ldvVar, ksyVar, lscVar);
        this.aG = ieaVarA;
        krw krwVar = new krw(ieaVarA, this.aI);
        this.aH = krwVar;
        if (ieaVarA != null) {
            ieaVarA.ea(krwVar);
        }
        iej iejVar = this.aH;
        if (iejVar != null) {
            iejVar.dM();
        }
    }

    public final void G(float f) {
        View viewFindViewById;
        View view = getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.binge_watch_card)) == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f);
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.addListener(new jdc(this));
        objectAnimatorOfFloat.addUpdateListener(new fsz(viewFindViewById, 6));
        objectAnimatorOfFloat.start();
    }

    public final void H() {
        by byVarRequireActivity = requireActivity();
        if (this.ao == null) {
            yks.c("displayManager");
        }
        byVarRequireActivity.setRequestedOrientation(true != jwq.g(requireContext()) ? 6 : -1);
    }

    public final void I() {
        by activity;
        if (l().a()) {
            ExoPlayer exoPlayer = this.C;
            PlayerView playerView = this.ac;
            if (playerView == null || exoPlayer == null || !playerView.isAttachedToWindow()) {
                return;
            }
            if (exoPlayer.u() && (activity = getActivity()) != null && !activity.isInPictureInPictureMode()) {
                long jD = exoPlayer.D();
                exoPlayer.A();
                a(jD);
            }
            ((tug) a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "updateProgress", 537, "TvodPlayerFragment.kt")).u("Flag bingeWatchEnabled(): Current position returned = %s", exoPlayer.D());
            PlayerView playerView2 = this.ac;
            if (playerView2 != null) {
                Runnable runnable = this.aJ;
                runnable.getClass();
                playerView2.removeCallbacks(runnable);
            }
            PlayerView playerView3 = this.ac;
            if (playerView3 != null) {
                Runnable runnable2 = this.aJ;
                runnable2.getClass();
                playerView3.postDelayed(runnable2, 1000L);
            }
        }
    }

    public final void J(long j) {
        ksy ksyVar;
        if (l().h()) {
            ykr.q(dvb.d(this), null, 0, new vo(this, j, (yih) null, 8), 3);
            return;
        }
        ksn ksnVar = (ksn) ((ldy) e()).a().g();
        ksy ksyVar2 = this.L;
        if (ksyVar2 == null) {
            yks.c("assetId");
            ksyVar = null;
        } else {
            ksyVar = ksyVar2;
        }
        o().execute(new jcp(this, luj.a(ksnVar, ksyVar, vxf.b(this.K), System.currentTimeMillis(), new lui(false, j)), j, 0));
    }

    public final boolean K() {
        PlayerView playerView = this.ac;
        return playerView != null && playerView.a() == 4;
    }

    public final isi L() {
        isi isiVar = this.aj;
        if (isiVar != null) {
            return isiVar;
        }
        yks.c("userSettingsStore");
        return null;
    }

    public final lzw M() {
        lzw lzwVar = this.af;
        if (lzwVar != null) {
            return lzwVar;
        }
        yks.c("localUserLibrary");
        return null;
    }

    public final void P() {
        if (this.ap != null) {
            return;
        }
        yks.c("tabletopManager");
    }

    public final irc R() {
        irc ircVar = this.aq;
        if (ircVar != null) {
            return ircVar;
        }
        yks.c("playbackStateStore");
        return null;
    }

    public final kw S() {
        kw kwVar = this.ar;
        if (kwVar != null) {
            return kwVar;
        }
        yks.c("pictureInPictureHelper");
        return null;
    }

    public final kuw T() {
        kuw kuwVar = this.ax;
        if (kuwVar != null) {
            return kuwVar;
        }
        yks.c("semanticEventLogger");
        return null;
    }

    @Override // defpackage.fsv
    public final void a(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        jdh jdhVar;
        if (l().a()) {
            long j2 = ynm.a;
            yno ynoVar = yno.d;
            long jP = ylh.p(j / 1000, ynoVar);
            if (ynm.b(ynm.n(this.aC, jP), ylh.o(1, ynoVar)) <= 0 && this.aN != null) {
                s();
            }
            if ((W(this.T) || a.s(this.T, ynm.a)) && !a.s(this.aC, 0L)) {
                jdh jdhVar2 = this.O;
                if (jdhVar2 == null) {
                    yks.c("bingeWatchHelper");
                    jdhVar2 = null;
                }
                if (jdhVar2.c != 5) {
                    if (!W(0L)) {
                        jdh jdhVar3 = this.O;
                        if (jdhVar3 == null) {
                            yks.c("bingeWatchHelper");
                            jdhVar3 = null;
                        }
                        jdhVar3.c = 5;
                    }
                    long j3 = this.aK;
                    if (a.s(j3, 0L)) {
                        long j4 = this.aB;
                        jdh jdhVar4 = this.O;
                        if (jdhVar4 == null) {
                            yks.c("bingeWatchHelper");
                            jdhVar4 = null;
                        }
                        ynm ynmVar = new ynm(ynm.o(j4, jdhVar4.b));
                        ynm ynmVar2 = new ynm(ynm.n(this.aC, az));
                        if (ynmVar.compareTo(ynmVar2) > 0) {
                            ynmVar = ynmVar2;
                        }
                        j3 = ynmVar.c;
                    }
                    this.aK = j3;
                    PlayerControlView playerControlView = this.aS;
                    boolean z = false;
                    if (playerControlView != null && playerControlView.s()) {
                        z = true;
                    }
                    long jN = ynm.n(this.aC, this.aB);
                    jdh jdhVar5 = this.O;
                    if (jdhVar5 == null) {
                        yks.c("bingeWatchHelper");
                        jdhVar5 = null;
                    }
                    long j5 = jdhVar5.a;
                    long j6 = az;
                    int iB = ynm.b(jN, ynm.o(j5, j6));
                    long j7 = this.aC;
                    yno ynoVar2 = yno.c;
                    long jN2 = ynm.n(j7, ylh.p(j, ynoVar2));
                    jdh jdhVar6 = this.O;
                    if (jdhVar6 == null) {
                        yks.c("bingeWatchHelper");
                        jdhVar6 = null;
                    }
                    int iB2 = ynm.b(jN2, ynm.o(jdhVar6.a, j6));
                    if (k().bS(d()) && !W(ylh.p(j, ynoVar2)) && !z && iB >= 0 && iB2 >= 0) {
                        jdg jdgVar = this.E;
                        if (jdgVar != null) {
                            jdgVar.b(true);
                        }
                        jdh jdhVar7 = this.O;
                        if (jdhVar7 == null) {
                            yks.c("bingeWatchHelper");
                            jdhVar7 = null;
                        }
                        jdhVar7.c = 6;
                        jdg jdgVar2 = this.E;
                        if (jdgVar2 != null) {
                            jdgVar2.d(Integer.valueOf(ynm.g(ynm.n(this.aK, jP), ynoVar)));
                        }
                    }
                    jdh jdhVar8 = this.O;
                    if (jdhVar8 == null) {
                        yks.c("bingeWatchHelper");
                        jdhVar = null;
                    } else {
                        jdhVar = jdhVar8;
                    }
                    if (jdhVar.c == 6) {
                        jdg jdgVar3 = this.E;
                        if (jdgVar3 != null) {
                            jdgVar3.d(Integer.valueOf(ynm.g(ynm.n(this.aK, jP), ynoVar)));
                        }
                        if (ynm.b(ynm.n(this.aK, jP), ylh.o(1, ynoVar)) < 0) {
                            v();
                            if (this.aN != null) {
                                s();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.jbs
    public final void b(PictureInPictureUiState pictureInPictureUiState) {
        ExoPlayer exoPlayer;
        if (Build.VERSION.SDK_INT >= 31 && (exoPlayer = this.C) != null) {
            if (pictureInPictureUiState.isStashed()) {
                this.aO = exoPlayer.u();
                if (exoPlayer.u()) {
                    j().a.L();
                    return;
                }
                return;
            }
            if (!this.aO || exoPlayer.u()) {
                return;
            }
            j().a.M();
        }
    }

    @Override // defpackage.jbt
    public final void c() {
        ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null && l().c() && Build.VERSION.SDK_INT >= 26 && requireActivity().getPackageManager().hasSystemFeature("android.software.picture_in_picture") && exoPlayer.u()) {
            ((tug) a.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "enterPictureInPictureMode", 2121, "TvodPlayerFragment.kt")).s("Picture-in-picture mode enabled for Tvod Player.");
            requireActivity().enterPictureInPictureMode(U());
        }
    }

    public final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.s;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        yks.c("preferences");
        return null;
    }

    public final iea e() {
        iea ieaVar = this.d;
        if (ieaVar != null) {
            return ieaVar;
        }
        yks.c("accountRepository");
        return null;
    }

    public final iea f() {
        iea ieaVar = this.t;
        if (ieaVar != null) {
            return ieaVar;
        }
        yks.c("downloadSupplier");
        return null;
    }

    public final ino g() {
        ino inoVar = this.m;
        if (inoVar != null) {
            return inoVar;
        }
        yks.c("mediaLibraryStore");
        return null;
    }

    public final jac h(wdq wdqVar) {
        String str;
        ebf ebfVarO;
        ebf ebfVarO2;
        out outVar = this.I;
        boolean zL = g().L(this.I.c.b());
        int size = this.w.size();
        ExoPlayer exoPlayer = this.C;
        Integer numValueOf = null;
        Integer numValueOf2 = (exoPlayer == null || (ebfVarO2 = exoPlayer.O()) == null) ? null : Integer.valueOf(ebfVarO2.J);
        ExoPlayer exoPlayer2 = this.C;
        if (exoPlayer2 != null && (ebfVarO = exoPlayer2.O()) != null) {
            numValueOf = Integer.valueOf(ebfVarO.K);
        }
        ouk oukVar = this.A;
        if (oukVar != null) {
            str = oukVar.b;
        } else {
            str = L().i.k;
            str.getClass();
        }
        return new jac(outVar, zL, size > 1, numValueOf2, numValueOf, str, i().a(), this.F, wdqVar);
    }

    public final jbo i() {
        jbo jboVar = this.Z;
        if (jboVar != null) {
            return jboVar;
        }
        yks.c("networkStatusMonitor");
        return null;
    }

    public final jcn j() {
        jcn jcnVar = this.u;
        if (jcnVar != null) {
            return jcnVar;
        }
        yks.c("tvodControllerManager");
        return null;
    }

    public final lfn k() {
        lfn lfnVar = this.c;
        if (lfnVar != null) {
            return lfnVar;
        }
        yks.c("config");
        return null;
    }

    public final xke l() {
        xke xkeVar = this.l;
        if (xkeVar != null) {
            return xkeVar;
        }
        yks.c("kinetoscopeLibIntegrationFeatureFlags");
        return null;
    }

    public final xla m() {
        xla xlaVar = this.k;
        if (xlaVar != null) {
            return xlaVar;
        }
        yks.c("playerRatingOverlayFeatureFlags");
        return null;
    }

    public final Executor n() {
        Executor executor = this.i;
        if (executor != null) {
            return executor;
        }
        yks.c("networkExecutor");
        return null;
    }

    public final ExecutorService o() {
        ExecutorService executorService = this.h;
        if (executorService != null) {
            return executorService;
        }
        yks.c("localExecutor");
        return null;
    }

    @Override // defpackage.xch, defpackage.bv
    public final void onAttach(Context context) {
        out outVar;
        context.getClass();
        super.onAttach(context);
        H();
        if (Build.VERSION.SDK_INT >= 33) {
            outVar = (out) requireArguments().getParcelable("player_metadata", out.class);
            if (outVar == null) {
                outVar = out.a;
            }
        } else {
            outVar = (out) requireArguments().getParcelable("player_metadata");
            if (outVar == null) {
                outVar = out.a;
            }
        }
        this.I = outVar;
        String string = requireArguments().getString("referrer");
        boolean z = false;
        if (string != null && ylh.K(string, "binge", false)) {
            z = true;
        }
        this.aL = z;
    }

    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, yfo] */
    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        layoutInflater.getClass();
        View viewInflate = getLayoutInflater().inflate(true != l().d() ? R.layout.tvod_player_layout : R.layout.tvod_player_layout_tabletop, viewGroup, false);
        viewInflate.getClass();
        PlayerView playerView = (PlayerView) viewInflate.findViewById(R.id.tvod_player_view);
        if (playerView != null) {
            playerView.z();
            playerView.A();
            playerView.addOnLayoutChangeListener(new jco((xch) this, playerView, 0));
        } else {
            playerView = null;
        }
        this.ac = playerView;
        if (playerView != null && (viewTreeObserver = playerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new iyo(this, 3, null));
        }
        PlayerView playerView2 = this.ac;
        this.aF = playerView2 != null ? (DefaultTimeBar) playerView2.findViewById(R.id.exo_progress) : null;
        PlayerView playerView3 = this.ac;
        this.aS = playerView3 != null ? (PlayerControlView) playerView3.findViewById(R.id.exo_controller) : null;
        this.aJ = new iuc(this, 14);
        this.M = viewInflate.findViewById(R.id.player_text_container);
        this.N = (TextView) viewInflate.findViewById(R.id.rating_text);
        this.aE = (Toolbar) viewInflate.findViewById(R.id.player_toolbar);
        if (l().d()) {
            this.Q = (ConstraintLayout) viewInflate.findViewById(R.id.tvod_player_view_root);
            this.R = (PlayerControlView) viewInflate.findViewById(R.id.tabletop_control_view);
        }
        this.U = this.I.c.b == ouq.e;
        int i = 12;
        if (l().a()) {
            long j = ynm.a;
            this.O = new jdh(j, j);
            if (this.U) {
                cvw cvwVar = this.av;
                if (cvwVar == null) {
                    yks.c("factory");
                    cvwVar = null;
                }
                jdg jdgVar = new jdg(cvwVar.a);
                jdgVar.b(false);
                this.E = jdgVar;
                jdh jdhVar = this.O;
                if (jdhVar == null) {
                    yks.c("bingeWatchHelper");
                    jdhVar = null;
                }
                int iJ = k().j();
                yno ynoVar = yno.c;
                jdhVar.a = ylh.o(iJ, ynoVar);
                jdh jdhVar2 = this.O;
                if (jdhVar2 == null) {
                    yks.c("bingeWatchHelper");
                    jdhVar2 = null;
                }
                jdhVar2.b = ylh.o(k().i(), ynoVar);
                inn innVarD = g().d(this.I.c.b());
                this.aN = innVarD;
                if (innVarD != null) {
                    V(innVarD);
                } else {
                    jdh jdhVar3 = this.O;
                    if (jdhVar3 == null) {
                        yks.c("bingeWatchHelper");
                        jdhVar3 = null;
                    }
                    jdhVar3.c = 5;
                }
                ius iusVar = new ius(this, i);
                jct jctVar = new jct(this);
                jdg jdgVar2 = this.E;
                if (jdgVar2 != null && !yks.e(jdgVar2.b, jctVar)) {
                    jdgVar2.b = jctVar;
                    jdgVar2.G(3);
                }
                jdg jdgVar3 = this.E;
                if (jdgVar3 != null) {
                    jdgVar3.c(iusVar);
                }
                jdg jdgVar4 = this.E;
                if (jdgVar4 != null) {
                    View viewFindViewById = viewInflate.findViewById(R.id.binge_watch_card);
                    viewFindViewById.getClass();
                    sfy.l(this, viewFindViewById).a(jdgVar4);
                }
            }
        }
        this.P = requireActivity();
        this.aD = new jbq();
        if (((Boolean) xlb.b.et(((xlb) m()).c)).booleanValue()) {
            ykr.q(dvb.d(this), null, 0, new jbb(this, (yih) null, 10, (int[]) null), 3);
        }
        ssn ssnVar = new ssn(requireContext(), R.style.MoviesTheme_ThemeOverlay_App_MaterialAlertDialog);
        ssnVar.o(R.string.warning_movie_bandwidth_title);
        ssnVar.d(R.string.warning_mobile_network_usage_body);
        ssnVar.l(R.string.continue_label, new gcu(this, 13, null));
        ssnVar.g(R.string.open_wifi_settings, new gcu(this, 14, null));
        ssnVar.i(R.string.always_use, new gcu(this, 12, null));
        this.W = ssnVar.create();
        ykr.q(dvb.d(this), null, 0, new jbb(this, (yih) null, 7, (byte[]) null), 3);
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDestroy() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
        fny fnyVar = this.aA;
        if (fnyVar != null) {
            fnyVar.b();
        }
        this.aA = null;
        if (!this.aM) {
            z();
        } else {
            this.as.e(0L);
            J(0L);
        }
    }

    @Override // defpackage.bv
    public final void onPictureInPictureModeChanged(boolean z) {
        View view = this.M;
        if (view == null) {
            yks.c("playerTextContainer");
            view = null;
        }
        view.setVisibility(8);
        PlayerView playerView = this.ac;
        if (playerView != null) {
            playerView.j(!z);
        }
        this.X = true;
    }

    @Override // defpackage.bv
    public final void onResume() {
        ActionBar supportActionBar;
        super.onResume();
        ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null) {
            exoPlayer.W();
        }
        PlayerView playerView = this.ac;
        if (playerView != null) {
            playerView.g();
        }
        by byVarRequireActivity = requireActivity();
        PlayerActivity playerActivity = byVarRequireActivity instanceof PlayerActivity ? (PlayerActivity) byVarRequireActivity : null;
        if (playerActivity == null || (supportActionBar = playerActivity.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setShowHideAnimationEnabled(false);
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        H();
        inn innVar = this.aN;
        if (innVar != null) {
            V(innVar);
        }
        IntentFilter intentFilter = new IntentFilter("com.google.android.apps.googletv.app.player.PIP_ACTION");
        Context contextRequireContext = requireContext();
        jbq jbqVar = this.aD;
        if (jbqVar == null) {
            yks.c("pictureInPictureBroadcastReceiver");
            jbqVar = null;
        }
        czi.f(contextRequireContext, jbqVar, intentFilter, 4);
    }

    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        if (this.aM) {
            return;
        }
        PlayerView playerView = this.ac;
        if (playerView != null) {
            playerView.f();
        }
        j().a.L();
        j().a.U();
        ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null) {
            exoPlayer.ab(false);
        }
        jbq jbqVar = null;
        if (l().a()) {
            jdh jdhVar = this.O;
            if (jdhVar == null) {
                yks.c("bingeWatchHelper");
                jdhVar = null;
            }
            jdhVar.c = 1;
            jdg jdgVar = this.E;
            if (jdgVar != null) {
                jdgVar.k(null);
                jdgVar.d(0);
                jdgVar.l("");
                jdgVar.m("");
                jdgVar.c(null);
            }
        }
        Context contextRequireContext = requireContext();
        jbq jbqVar2 = this.aD;
        if (jbqVar2 == null) {
            yks.c("pictureInPictureBroadcastReceiver");
        } else {
            jbqVar = jbqVar2;
        }
        contextRequireContext.unregisterReceiver(jbqVar);
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ksy ksyVarI;
        long jO;
        view.getClass();
        ahf ahfVar = new ahf((Object) this, 7, (byte[][]) null);
        dyo dyoVar = new dyo(3, 0, 1, 3, 0);
        cvm cvmVar = new cvm(requireContext());
        cvmVar.q(this.aP);
        cvmVar.o(this.aQ);
        cvmVar.p(dyoVar);
        ExoPlayer exoPlayerN = cvmVar.n();
        exoPlayerN.at(2);
        eyu eyuVar = new eyu((eyv) exoPlayerN.O());
        eyuVar.q = 1;
        if (((Boolean) xkf.a.e(7, "KinetoscopeLibIntegrationFeature__restrict_playback_to_hd", false).et(((xkf) l()).b)).booleanValue()) {
            eyuVar.d(1920, 1080);
        }
        exoPlayerN.af(eyuVar.a());
        this.C = exoPlayerN;
        PlayerView playerView = this.ac;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.i(0);
            playerView.h(this.C);
        } else {
            ((tug) a.g().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "setupPlayer", 1519, "TvodPlayerFragment.kt")).s("PlayerView is unexpectedly null.");
        }
        PlayerControlView playerControlView = this.R;
        if (playerControlView != null) {
            playerControlView.d(this.C);
            playerControlView.e(-1);
        }
        by activity = getActivity();
        PlayerView playerView2 = this.ac;
        playerView2.getClass();
        jbr.k(activity, playerView2, this.aF, ahfVar);
        our ourVar = this.I.c;
        String str = ourVar.a;
        int iOrdinal = ourVar.b.ordinal();
        if (iOrdinal == 1) {
            ksyVarI = ksy.i(str);
        } else if (iOrdinal == 4) {
            ksyVarI = ksy.h(str);
        } else {
            if (iOrdinal != 5) {
                throw new IllegalArgumentException("Unsupported playId type " + this.I.c.b + ".");
            }
            ksyVarI = ksy.m(str);
        }
        this.L = ksyVarI;
        cve cveVar = this.P;
        if (cveVar == null) {
            yks.c("menuHost");
            cveVar = null;
        }
        cveVar.addMenuProvider(new jcx(this), getViewLifecycleOwner(), dvd.e);
        C();
        if (requireActivity() instanceof PlayerActivity) {
            PlayerActivity playerActivity = (PlayerActivity) requireActivity();
            Toolbar toolbar = this.aE;
            if (toolbar == null) {
                yks.c("playerToolbar");
                toolbar = null;
            }
            playerActivity.setSupportActionBar(toolbar);
            ActionBar supportActionBar = playerActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setDisplayHomeAsUpEnabled(true);
            }
            ActionBar supportActionBar2 = playerActivity.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.setShowHideAnimationEnabled(false);
            }
            ActionBar supportActionBar3 = playerActivity.getSupportActionBar();
            int i = 16;
            if (supportActionBar3 != null) {
                supportActionBar3.setDisplayOptions(16);
            }
            ActionBar supportActionBar4 = playerActivity.getSupportActionBar();
            if (supportActionBar4 != null) {
                supportActionBar4.setDisplayShowCustomEnabled(true);
            }
            ActionBar supportActionBar5 = playerActivity.getSupportActionBar();
            if (supportActionBar5 != null) {
                supportActionBar5.setDisplayShowTitleEnabled(false);
            }
            View viewInflate = LayoutInflater.from(playerActivity).inflate(R.layout.action_bar_title, (ViewGroup) null);
            viewInflate.getClass();
            ((TextView) viewInflate.findViewById(R.id.title)).setText(playerActivity.j.b);
            viewInflate.findViewById(R.id.img_up_indicator).setOnClickListener(new izk(this, i));
            ActionBar supportActionBar6 = playerActivity.getSupportActionBar();
            if (supportActionBar6 != null) {
                supportActionBar6.setCustomView(viewInflate);
            }
        }
        idf idfVar = this.g;
        if (idfVar == null) {
            yks.c("assetFromAssetIdFunction");
            idfVar = null;
        }
        ksy ksyVar = this.L;
        if (ksyVar == null) {
            yks.c("assetId");
            ksyVar = null;
        }
        kst kstVar = (kst) ((ieg) idfVar.b(ksyVar)).c;
        if (kstVar != null) {
            ksy ksyVar2 = this.L;
            if (ksyVar2 == null) {
                yks.c("assetId");
                ksyVar2 = null;
            }
            int i2 = ksyVar2.a;
            if (i2 == 6) {
                long j = ynm.a;
                jO = ylh.o(((kvf) kstVar).e(), yno.d);
            } else if (i2 != 20) {
                long j2 = ynm.a;
                jO = 0;
            } else {
                long j3 = ynm.a;
                jO = ylh.o(((kuo) kstVar).l, yno.d);
            }
            this.aB = jO;
            ksy ksyVar3 = this.L;
            if (ksyVar3 == null) {
                yks.c("assetId");
                ksyVar3 = null;
            }
            this.aC = ksyVar3.a == 20 ? ylh.o(((kuo) kstVar).m, yno.d) : 0L;
        }
        lzz lzzVar = this.f;
        if (lzzVar == null) {
            yks.c("purchaseStore");
            lzzVar = null;
        }
        ksn ksnVar = (ksn) ((ldy) e()).a().g();
        List list = jee.k;
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        ygm ygmVar = new ygm((ygp) list);
        while (ygmVar.hasNext()) {
            arrayList.add(((jee) ygmVar.next()).m);
        }
        final ieg iegVarA = lzzVar.a(jwq.ad(ksnVar, (String[]) arrayList.toArray(new String[0]), this.I.c.a));
        mem memVar = this.r;
        if (memVar == null) {
            yks.c("networkStatus");
            memVar = null;
        }
        this.F = !memVar.g().j();
        jdr jdrVar = this.ah;
        if (jdrVar == null) {
            yks.c("offlineController");
            jdrVar = null;
        }
        ksy ksyVar4 = this.L;
        if (ksyVar4 == null) {
            yks.c("assetId");
            ksyVar4 = null;
        }
        etn etnVarA = jdrVar.a(ksyVar4);
        if (l().b() && etnVarA != null && etnVarA.b == 3 && this.F) {
            euh euhVar = etnVarA.a;
            byte[] bArr = euhVar.g;
            bArr.getClass();
            this.H = euhVar.e;
            lhr lhrVar = this.am;
            if (lhrVar == null) {
                yks.c("kineCacheProvider");
                lhrVar = null;
            }
            ksy ksyVar5 = this.L;
            if (ksyVar5 == null) {
                yks.c("assetId");
                ksyVar5 = null;
            }
            this.G = lhrVar.f(ksyVar5);
            D();
            kuw kuwVar = this.aw;
            if (kuwVar == null) {
                yks.c("nurManifestToDashManifestMap");
                kuwVar = null;
            }
            int length = bArr.length;
            vfg vfgVar = vfg.a;
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vuc vucVarP = vuc.p(vfgVar, bArr, 0, length, vtp.a);
            vuc.B(vucVarP);
            vfg vfgVar2 = (vfg) vucVarP;
            vfgVar2.getClass();
            t(kuwVar.u(vfgVar2).e(euhVar.d));
        } else if (iegVarA != null && iegVarA.m()) {
            o().execute(new Runnable() { // from class: jcq
                /* JADX WARN: Removed duplicated region for block: B:52:0x00fb A[Catch: all -> 0x0302, TryCatch #1 {all -> 0x0302, blocks: (B:3:0x000d, B:6:0x0017, B:8:0x001b, B:11:0x0022, B:14:0x0031, B:16:0x003f, B:17:0x0045, B:19:0x0051, B:24:0x005b, B:28:0x0087, B:30:0x0092, B:34:0x00a0, B:36:0x00a8, B:37:0x00ae, B:39:0x00b5, B:66:0x015d, B:68:0x0163, B:69:0x0171, B:71:0x0177, B:73:0x0187, B:74:0x018b, B:75:0x018f, B:77:0x01a2, B:80:0x01aa, B:82:0x01dc, B:83:0x01ef, B:85:0x01f5, B:87:0x01fd, B:88:0x0200, B:90:0x0233, B:92:0x0237, B:93:0x023d, B:89:0x0231, B:94:0x02a8, B:40:0x00b9, B:42:0x00bf, B:52:0x00fb, B:53:0x00fe, B:55:0x0108, B:56:0x011a, B:58:0x0120, B:60:0x013d, B:61:0x0146, B:63:0x014c, B:65:0x0159, B:59:0x013b, B:44:0x00d1, B:45:0x00d9, B:46:0x00dd, B:48:0x00e7, B:49:0x00ed, B:50:0x00f3, B:99:0x02cf, B:101:0x02d3, B:102:0x02d7, B:105:0x02e7, B:107:0x02eb, B:110:0x02f2, B:27:0x0061), top: B:121:0x000d, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00fe A[Catch: all -> 0x0302, TryCatch #1 {all -> 0x0302, blocks: (B:3:0x000d, B:6:0x0017, B:8:0x001b, B:11:0x0022, B:14:0x0031, B:16:0x003f, B:17:0x0045, B:19:0x0051, B:24:0x005b, B:28:0x0087, B:30:0x0092, B:34:0x00a0, B:36:0x00a8, B:37:0x00ae, B:39:0x00b5, B:66:0x015d, B:68:0x0163, B:69:0x0171, B:71:0x0177, B:73:0x0187, B:74:0x018b, B:75:0x018f, B:77:0x01a2, B:80:0x01aa, B:82:0x01dc, B:83:0x01ef, B:85:0x01f5, B:87:0x01fd, B:88:0x0200, B:90:0x0233, B:92:0x0237, B:93:0x023d, B:89:0x0231, B:94:0x02a8, B:40:0x00b9, B:42:0x00bf, B:52:0x00fb, B:53:0x00fe, B:55:0x0108, B:56:0x011a, B:58:0x0120, B:60:0x013d, B:61:0x0146, B:63:0x014c, B:65:0x0159, B:59:0x013b, B:44:0x00d1, B:45:0x00d9, B:46:0x00dd, B:48:0x00e7, B:49:0x00ed, B:50:0x00f3, B:99:0x02cf, B:101:0x02d3, B:102:0x02d7, B:105:0x02e7, B:107:0x02eb, B:110:0x02f2, B:27:0x0061), top: B:121:0x000d, inners: #0 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 778
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.jcq.run():void");
                }
            });
        }
        PlayerView playerView3 = this.ac;
        if (playerView3 != null) {
            F(playerView3);
            E(playerView3);
        }
        ykr.q(dvb.d(this), null, 0, new jbb(this, (yih) null, 9, (short[]) null), 3);
        ExoPlayer exoPlayer = this.C;
        if (exoPlayer != null) {
            fnr fnrVar = new fnr(requireContext(), exoPlayer);
            fnrVar.c(UUID.randomUUID().toString());
            fnrVar.b(this.aR);
            this.aA = fnrVar.a();
        }
        jcs jcsVar = this.aa;
        jcsVar.g(true);
        requireActivity().getOnBackPressedDispatcher().b(getViewLifecycleOwner(), jcsVar);
    }

    public final void p(boolean z, int i) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        if (z) {
            TextView textView = this.ad;
            if (textView != null) {
                long j = i;
                ExoPlayer exoPlayer = this.C;
                textView.setText(getString(R.string.x_seconds, Long.valueOf(Math.abs((exoPlayer != null ? exoPlayer.G() : 0L) / 1000) * j)));
            }
            TextView textView2 = this.ad;
            if (textView2 != null && (viewPropertyAnimatorAnimate2 = textView2.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null) {
                viewPropertyAnimatorAlpha2.setDuration(500L);
            }
            new Handler(requireContext().getMainLooper()).postDelayed(new iuc(this, 17), 500L);
            return;
        }
        TextView textView3 = this.ae;
        if (textView3 != null) {
            long j2 = i;
            ExoPlayer exoPlayer2 = this.C;
            textView3.setText(getString(R.string.x_seconds, Long.valueOf(Math.abs((exoPlayer2 != null ? exoPlayer2.H() : 0L) / 1000) * j2)));
        }
        TextView textView4 = this.ae;
        if (textView4 != null && (viewPropertyAnimatorAnimate = textView4.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(500L);
        }
        new Handler(requireContext().getMainLooper()).postDelayed(new iuc(this, 18), 500L);
    }

    public final void q() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        PlayerView playerView = this.ac;
        if (playerView != null) {
            playerView.j(!requireActivity().isInPictureInPictureMode());
        }
        cqn cqnVar = new cqn();
        cqnVar.e(this.Q);
        P();
        kgu.g(cqnVar);
        P();
        kgu.i(cqnVar);
        cqnVar.c(this.Q);
        ConstraintLayout constraintLayout = this.Q;
        constraintLayout.getClass();
        gjy.b(constraintLayout);
        PlayerView playerView2 = this.ac;
        if (playerView2 != null) {
            F(playerView2);
            E(playerView2);
        }
    }

    public final void r(jbl jblVar, jbl jblVar2) {
        long jO;
        if (jblVar2 == null) {
            Duration duration = jblVar.a;
            jO = ynm.o(ylh.p(duration.getSeconds(), yno.d), ylh.o(duration.getNano(), yno.a));
        } else if (jblVar.b.compareTo(jblVar2.b) > 0) {
            Duration duration2 = jblVar.a;
            jO = ynm.o(ylh.p(duration2.getSeconds(), yno.d), ylh.o(duration2.getNano(), yno.a));
        } else {
            Duration duration3 = jblVar2.a;
            jO = ynm.o(ylh.p(duration3.getSeconds(), yno.d), ylh.o(duration3.getNano(), yno.a));
        }
        this.J = jO;
        if (ynm.b(jO, ay) <= 0 || !W(jO) || this.aL) {
            this.J = 0L;
        }
        ((tug) a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "compareAndSetResumePosition", 1758, "TvodPlayerFragment.kt")).v("Resume location %s loaded.", new ynm(this.J));
        this.D = this.J;
    }

    public final void s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.aM) {
            return;
        }
        z();
        new Handler(requireContext().getMainLooper()).removeCallbacksAndMessages(null);
        inn innVar = this.aN;
        if (innVar != null) {
            w(innVar);
            this.aM = true;
        } else {
            by activity = getActivity();
            if (activity != null) {
                activity.finishAndRemoveTask();
            }
        }
    }

    public final void t(enr enrVar) {
        Context context = getContext();
        if (context == null) {
            throw new IllegalStateException("Failed to loadOfflineManifestAndPlay: Context is not available.");
        }
        new Handler(context.getMainLooper()).post(new gvj(this, enrVar, 12, null));
    }

    public final void u(Cursor cursor, yjk yjkVar) {
        jbl jblVar;
        tui tuiVar = a;
        tuv tuvVarB = tuiVar.b();
        tuy tuyVar = tvo.a;
        ((tug) tuvVarB.h(tuyVar, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "loadResumeTime", 1653, "TvodPlayerFragment.kt")).s("Start loading resume timestamp");
        ksy ksyVar = null;
        if (this.aL) {
            Duration duration = Duration.ZERO;
            duration.getClass();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(0L);
            instantOfEpochMilli.getClass();
            r(new jbl(duration, instantOfEpochMilli), null);
            yjkVar.a();
            return;
        }
        if (cursor.getCount() == 0) {
            Duration duration2 = Duration.ZERO;
            duration2.getClass();
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(0L);
            instantOfEpochMilli2.getClass();
            jblVar = new jbl(duration2, instantOfEpochMilli2);
        } else {
            long j = ynm.a;
            Duration durationOfSeconds = Duration.ofSeconds(ynm.l(ylh.o(cursor.getInt(jee.b.l), yno.c)), ynm.e(r10));
            durationOfSeconds.getClass();
            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(cursor.getLong(jee.c.l));
            instantOfEpochMilli3.getClass();
            jblVar = new jbl(durationOfSeconds, instantOfEpochMilli3);
        }
        if (this.F) {
            r(jblVar, null);
            yjkVar.a();
            return;
        }
        ((tug) tuiVar.b().h(tuyVar, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "loadResumeTime", 1671, "TvodPlayerFragment.kt")).s("Loading resume timestamp from the server.");
        if (l().h()) {
            ykr.q(yoz.m(), null, 0, new ixs(this, yjkVar, jblVar, (yih) null, 5), 3);
            return;
        }
        lqs lqsVar = this.al;
        if (lqsVar == null) {
            yks.c("getWatchEventFunction");
            lqsVar = null;
        }
        Object objB = lqsVar.b(ltr.a((ksn) ((ldy) e()).a().g(), this.I.c.a));
        objB.getClass();
        ieg iegVar = (ieg) objB;
        if (iegVar.k() || iegVar.l()) {
            ((tug) tuiVar.g().h(tuyVar, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "loadResumeTime", 1698, "TvodPlayerFragment.kt")).s("Error encountered when retrieving resume timestamp from server. Using local resume timestamp.");
            r(jblVar, null);
            yjkVar.a();
            return;
        }
        ImmutableMap immutableMap = ((lts) iegVar.g()).a;
        ksy ksyVar2 = this.L;
        if (ksyVar2 == null) {
            yks.c("assetId");
        } else {
            ksyVar = ksyVar2;
        }
        kvx kvxVar = (kvx) immutableMap.get(ksyVar);
        if (kvxVar != null) {
            long j2 = ynm.a;
            Duration durationOfSeconds2 = Duration.ofSeconds(ynm.l(ylh.p(kvxVar.a(), yno.c)), ynm.e(r4));
            durationOfSeconds2.getClass();
            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(kvxVar.b());
            instantOfEpochMilli4.getClass();
            r(jblVar, new jbl(durationOfSeconds2, instantOfEpochMilli4));
        }
        yjkVar.a();
    }

    public final void v() {
        jdh jdhVar = this.O;
        jdh jdhVar2 = null;
        if (jdhVar == null) {
            yks.c("bingeWatchHelper");
            jdhVar = null;
        }
        if (jdhVar.c == 6) {
            jdg jdgVar = this.E;
            if (jdgVar != null) {
                jdgVar.b(false);
            }
            jdh jdhVar3 = this.O;
            if (jdhVar3 == null) {
                yks.c("bingeWatchHelper");
            } else {
                jdhVar2 = jdhVar3;
            }
            jdhVar2.c = 4;
        }
    }

    public final void w(inn innVar) {
        String str;
        String str2;
        ino inoVarG = g();
        wni wniVar = innVar.a;
        wni wniVarG = inoVarG.g(wniVar);
        wni wniVarH = g().h(wniVar);
        jan janVar = this.ak;
        if (janVar == null) {
            yks.c("navigationManager");
            janVar = null;
        }
        jan janVar2 = janVar;
        Context contextRequireContext = requireContext();
        wll wllVar = wll.a;
        wllVar.getClass();
        String str3 = wniVar.b;
        str3.getClass();
        janVar2.c(contextRequireContext, wllVar, str3, (wniVarG == null || (str2 = wniVarG.b) == null) ? "" : str2, (wniVarH == null || (str = wniVarH.b) == null) ? "" : str, "binge");
    }

    public final void x() {
        pku pkuVar = this.at;
        if (pkuVar != null) {
            String string = getString(R.string.no_network);
            string.getClass();
            pkuVar.f(string, true, false);
        }
    }

    public final void y() {
        j().a.N(this.I, new izc(this, 6));
    }

    public final void z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((tug) ((tug) a.e().h(tvo.a, "[GTVM-Kinetoscope]")).k(tvj.FULL).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "releasePlayerResources", 1439, "TvodPlayerFragment.kt")).s("releasePlayerResources is called");
        j().a(this);
        this.C = null;
        PlayerView playerView = this.ac;
        if (playerView != null) {
            playerView.h(null);
        }
        PlayerControlView playerControlView = this.R;
        if (playerControlView != null) {
            playerControlView.d(null);
        }
    }
}
