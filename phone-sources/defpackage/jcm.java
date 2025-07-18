package defpackage;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Rational;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.videos.R;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcm extends xch implements jbt, jbs {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/player/TrailerPlayerFragment");
    public kgu A;
    public kw B;
    public pku C;
    public kuw D;
    private cve E;
    private jbq F;
    private iea G;
    private iej H;
    private jca I;
    private DefaultTimeBar J;
    private Toolbar K;
    private boolean L;
    private fny M;
    public lfn b;
    public iea c;
    public mem d;
    public Executor e;
    public idf f;
    public idf g;
    public ldv h;
    public xke i;
    public jcc j;
    public jbo k;
    public ExoPlayer m;
    public ConstraintLayout o;
    public PlayerControlView p;
    public boolean r;
    public PlayerView u;
    public TextView v;
    public TextView w;
    public lsc x;
    public isi y;
    public jwq z;
    public out l = out.a;
    public int n = 4;
    private final eam N = new jcf(this);
    public final oui s = new jcv(this);
    private final jcu O = new jcu(1);
    public boolean q;
    public final jce t = new jce(this, this.q);

    public static final void m(View view) {
        view.animate().alpha(0.3f).setDuration(500L);
        new Handler().postDelayed(new iuc(view, 12), 500L);
    }

    private final PictureInPictureParams r() {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        PlayerView playerView = this.u;
        if (playerView != null) {
            p();
            kw.r(builder, playerView);
        }
        ExoPlayer exoPlayer = this.m;
        if (exoPlayer != null) {
            PictureInPictureParams.Builder aspectRatio = builder.setAspectRatio(new Rational(16, 9));
            if (Build.VERSION.SDK_INT >= 26) {
                aspectRatio.setActions(p().q(exoPlayer.u(), EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG));
                if (Build.VERSION.SDK_INT >= 31) {
                    aspectRatio.setAutoEnterEnabled(exoPlayer.u());
                }
            }
        }
        PictureInPictureParams pictureInPictureParamsBuild = builder.build();
        pictureInPictureParamsBuild.getClass();
        return pictureInPictureParamsBuild;
    }

    public final jac a(wdq wdqVar) {
        ebf ebfVarO;
        ebf ebfVarO2;
        out outVar = this.l;
        ExoPlayer exoPlayer = this.m;
        jbo jboVar = null;
        Integer numValueOf = (exoPlayer == null || (ebfVarO2 = exoPlayer.O()) == null) ? null : Integer.valueOf(ebfVarO2.J);
        ExoPlayer exoPlayer2 = this.m;
        Integer numValueOf2 = (exoPlayer2 == null || (ebfVarO = exoPlayer2.O()) == null) ? null : Integer.valueOf(ebfVarO.K);
        isi isiVar = this.y;
        if (isiVar == null) {
            yks.c("userSettingsStore");
            isiVar = null;
        }
        String str = isiVar.i.k;
        str.getClass();
        jbo jboVar2 = this.k;
        if (jboVar2 == null) {
            yks.c("networkStatusMonitor");
        } else {
            jboVar = jboVar2;
        }
        return new jac(outVar, false, false, numValueOf, numValueOf2, str, jboVar.a(), false, wdqVar);
    }

    @Override // defpackage.jbs
    public final void b(PictureInPictureUiState pictureInPictureUiState) {
        ExoPlayer exoPlayer;
        if (Build.VERSION.SDK_INT < 31 || (exoPlayer = this.m) == null) {
            return;
        }
        if (pictureInPictureUiState.isStashed()) {
            this.L = exoPlayer.u();
            if (exoPlayer.u()) {
                d().a.a();
                return;
            }
            return;
        }
        if (!this.L || exoPlayer.u()) {
            return;
        }
        d().a.b();
    }

    @Override // defpackage.jbt
    public final void c() {
        ExoPlayer exoPlayer = this.m;
        if (exoPlayer != null && e().c() && Build.VERSION.SDK_INT >= 26 && requireActivity().getPackageManager().hasSystemFeature("android.software.picture_in_picture") && exoPlayer.u()) {
            ((tug) a.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment", "enterPictureInPictureMode", 914, "TrailerPlayerFragment.kt")).s("Picture-in-picture mode enabled for Trailer");
            requireActivity().enterPictureInPictureMode(r());
        }
    }

    public final jcc d() {
        jcc jccVar = this.j;
        if (jccVar != null) {
            return jccVar;
        }
        yks.c("trailerControllerManager");
        return null;
    }

    public final xke e() {
        xke xkeVar = this.i;
        if (xkeVar != null) {
            return xkeVar;
        }
        yks.c("kinetoscopeLibIntegrationFeatureFlags");
        return null;
    }

    public final Executor f() {
        Executor executor = this.e;
        if (executor != null) {
            return executor;
        }
        yks.c("networkExecutor");
        return null;
    }

    public final void g(boolean z, int i) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        if (z) {
            TextView textView = this.v;
            if (textView != null) {
                long j = i;
                Resources resources = getResources();
                ExoPlayer exoPlayer = this.m;
                textView.setText(resources.getString(R.string.x_seconds, Long.valueOf(Math.abs((exoPlayer != null ? exoPlayer.G() : 0L) / 1000) * j)));
            }
            TextView textView2 = this.v;
            if (textView2 != null && (viewPropertyAnimatorAnimate2 = textView2.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null) {
                viewPropertyAnimatorAlpha2.setDuration(500L);
            }
            Context context = getContext();
            context.getClass();
            new Handler(context.getMainLooper()).postDelayed(new iuc(this, 10), 500L);
            return;
        }
        TextView textView3 = this.w;
        if (textView3 != null) {
            long j2 = i;
            Resources resources2 = getResources();
            ExoPlayer exoPlayer2 = this.m;
            textView3.setText(resources2.getString(R.string.x_seconds, Long.valueOf(Math.abs((exoPlayer2 != null ? exoPlayer2.H() : 0L) / 1000) * j2)));
        }
        TextView textView4 = this.w;
        if (textView4 != null && (viewPropertyAnimatorAnimate = textView4.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(500L);
        }
        Context context2 = getContext();
        context2.getClass();
        new Handler(context2.getMainLooper()).postDelayed(new iuc(this, 11), 500L);
    }

    public final void h() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        PlayerView playerView = this.u;
        if (playerView != null) {
            playerView.j(true);
        }
        cqn cqnVar = new cqn();
        cqnVar.e(this.o);
        o();
        kgu.g(cqnVar);
        o();
        kgu.i(cqnVar);
        cqnVar.c(this.o);
        ConstraintLayout constraintLayout = this.o;
        constraintLayout.getClass();
        gjy.b(constraintLayout);
        PlayerView playerView2 = this.u;
        if (playerView2 != null) {
            j(playerView2);
        }
    }

    public final void i() {
        if (getActivity() == null) {
            ((tug) a.g().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment", "setupPictureInPicture", 874, "TrailerPlayerFragment.kt")).v("Fragment %s not attached to an activity.", this);
        } else if (e().c() && requireActivity().getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            requireActivity().setPictureInPictureParams(r());
        }
    }

    public final void j(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.left_panel);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.right_panel);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.exo_ffwd);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.exo_rew);
        this.v = (TextView) view.findViewById(R.id.feedback_text_rewind);
        this.w = (TextView) view.findViewById(R.id.feedback_text_forward);
        nhl nhlVar = new nhl(requireContext(), new jck(this, imageView));
        nhl nhlVar2 = new nhl(requireContext(), new jcl(this, imageView2));
        imageView.setOnTouchListener(new jcd(nhlVar, 1));
        imageView2.setOnTouchListener(new jcd(nhlVar2, 0));
        imageView4.setOnClickListener(new jci(this, imageView));
        imageView3.setOnClickListener(new jcj(this, imageView2));
    }

    public final void k() {
        by byVarRequireActivity = requireActivity();
        if (this.z == null) {
            yks.c("displayManager");
        }
        byVarRequireActivity.setRequestedOrientation(true != jwq.g(requireContext()) ? 6 : -1);
    }

    public final boolean l() {
        PlayerView playerView = this.u;
        return playerView != null && playerView.a() == 4;
    }

    public final void o() {
        if (this.A != null) {
            return;
        }
        yks.c("tabletopManager");
    }

    @Override // defpackage.xch, defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        k();
        out outVar = (out) requireArguments().getParcelable("player_metadata");
        if (outVar == null) {
            outVar = out.a;
        }
        this.l = outVar;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        layoutInflater.getClass();
        View viewInflate = getLayoutInflater().inflate(true != e().d() ? R.layout.trailer_player_layout : R.layout.trailer_player_layout_tabletop, viewGroup, false);
        viewInflate.getClass();
        PlayerView playerView = (PlayerView) viewInflate.findViewById(R.id.trailer_player_view);
        if (playerView != null) {
            playerView.z();
            playerView.A();
            playerView.addOnLayoutChangeListener(new jco((xch) this, playerView, 1));
        } else {
            playerView = null;
        }
        this.u = playerView;
        this.o = (ConstraintLayout) viewInflate.findViewById(R.id.trailer_view_root);
        this.K = (Toolbar) viewInflate.findViewById(R.id.player_toolbar);
        PlayerView playerView2 = this.u;
        this.J = playerView2 != null ? (DefaultTimeBar) playerView2.findViewById(R.id.exo_progress) : null;
        this.E = requireActivity();
        this.F = new jbq();
        if (e().d()) {
            this.p = (PlayerControlView) viewInflate.findViewById(R.id.tabletop_control_view);
        }
        ykr.q(dvb.d(getViewLifecycleOwner()), null, 0, new jbb(this, (yih) null, 5, (byte[]) null), 3);
        PlayerView playerView3 = this.u;
        if (playerView3 != null && (viewTreeObserver = playerView3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new iyo(this, 2, null));
        }
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDestroy() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
        fny fnyVar = this.M;
        if (fnyVar != null) {
            fnyVar.b();
        }
        this.M = null;
        d().a(this);
        this.m = null;
        PlayerView playerView = this.u;
        if (playerView != null) {
            playerView.h(null);
        }
        PlayerControlView playerControlView = this.p;
        if (playerControlView != null) {
            playerControlView.d(null);
        }
        PlayerControlView playerControlView2 = this.p;
        if (playerControlView2 != null) {
            playerControlView2.d(null);
        }
    }

    @Override // defpackage.bv
    public final void onPictureInPictureModeChanged(boolean z) {
        PlayerView playerView = this.u;
        if (playerView != null) {
            playerView.j(!z);
        }
        this.q = true;
    }

    @Override // defpackage.bv
    public final void onResume() {
        ActionBar supportActionBar;
        super.onResume();
        PlayerView playerView = this.u;
        if (playerView != null) {
            playerView.g();
        }
        this.r = false;
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
        k();
        IntentFilter intentFilter = new IntentFilter("com.google.android.apps.googletv.app.player.PIP_ACTION");
        Context contextRequireContext = requireContext();
        jbq jbqVar = this.F;
        if (jbqVar == null) {
            yks.c("pictureInPictureBroadcastReceiver");
            jbqVar = null;
        }
        czi.f(contextRequireContext, jbqVar, intentFilter, 4);
    }

    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        PlayerView playerView = this.u;
        if (playerView != null) {
            playerView.f();
        }
        d().a.a();
        ExoPlayer exoPlayer = d().a.a;
        if (exoPlayer != null && exoPlayer.u()) {
            exoPlayer.ak();
            exoPlayer.ab(false);
        }
        ExoPlayer exoPlayer2 = this.m;
        if (exoPlayer2 != null) {
            exoPlayer2.ab(false);
        }
        this.r = true;
        Context contextRequireContext = requireContext();
        jbq jbqVar = this.F;
        if (jbqVar == null) {
            yks.c("pictureInPictureBroadcastReceiver");
            jbqVar = null;
        }
        contextRequireContext.unregisterReceiver(jbqVar);
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        idf idfVar;
        idf idfVar2;
        view.getClass();
        mem memVar = this.d;
        lsc lscVar = null;
        if (memVar == null) {
            yks.c("networkStatus");
            memVar = null;
        }
        if (!memVar.g().j()) {
            ((tug) a.g().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment", "onViewCreated", 386, "TrailerPlayerFragment.kt")).s("No network available for online playback.");
            pku pkuVar = this.C;
            if (pkuVar != null) {
                String string = getString(R.string.no_network);
                string.getClass();
                pkuVar.f(string, true, false);
            }
        }
        dyo dyoVar = new dyo(3, 0, 1, 3, 0);
        cvm cvmVar = new cvm(requireContext());
        cvmVar.q(this.N);
        cvmVar.o(this.O);
        cvmVar.p(dyoVar);
        ExoPlayer exoPlayerN = cvmVar.n();
        this.m = exoPlayerN;
        if (exoPlayerN != null) {
            fnr fnrVar = new fnr(requireContext(), exoPlayerN);
            fnrVar.c(UUID.randomUUID().toString());
            fnrVar.b(new jch(0));
            this.M = fnrVar.a();
        }
        ExoPlayer exoPlayer = this.m;
        int i = 2;
        if (exoPlayer != null) {
            exoPlayer.at(2);
        }
        PlayerView playerView = this.u;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.i(0);
            playerView.h(this.m);
        }
        PlayerControlView playerControlView = this.p;
        if (playerControlView != null) {
            playerControlView.d(this.m);
            playerControlView.e(-1);
        }
        d().b(this);
        cve cveVar = this.E;
        if (cveVar == null) {
            yks.c("menuHost");
            cveVar = null;
        }
        cveVar.addMenuProvider(new jcg(this), getViewLifecycleOwner(), dvd.e);
        by activity = getActivity();
        PlayerView playerView2 = this.u;
        playerView2.getClass();
        int i2 = 15;
        jbr.k(activity, playerView2, this.J, new iwg(i2));
        i();
        if (requireActivity() instanceof PlayerActivity) {
            PlayerActivity playerActivity = (PlayerActivity) requireActivity();
            playerActivity.setSupportActionBar(this.K);
            ActionBar supportActionBar = playerActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setDisplayHomeAsUpEnabled(true);
            }
            ActionBar supportActionBar2 = playerActivity.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.setShowHideAnimationEnabled(false);
            }
            ActionBar supportActionBar3 = playerActivity.getSupportActionBar();
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
            viewInflate.findViewById(R.id.img_up_indicator).setOnClickListener(new izk(this, i2));
            ActionBar supportActionBar6 = playerActivity.getSupportActionBar();
            if (supportActionBar6 != null) {
                supportActionBar6.setCustomView(viewInflate);
            }
        }
        PlayerView playerView3 = this.u;
        if (playerView3 != null) {
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) playerView3.findViewById(R.id.exo_progress);
            ImageView imageView = (ImageView) playerView3.findViewById(R.id.scrubbing_position);
            View viewFindViewById = playerView3.findViewById(R.id.previewContainer);
            viewFindViewById.getClass();
            TextView textView = (TextView) playerView3.findViewById(R.id.scrubbingPreviewTimestamp);
            View viewFindViewById2 = playerView3.findViewById(R.id.scrubbingPreview);
            viewFindViewById2.getClass();
            ImageView imageView2 = (ImageView) viewFindViewById2;
            if (e().e() && this.m != null && getContext() != null && defaultTimeBar != null) {
                ((tug) a.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment", "onViewCreated", 418, "TrailerPlayerFragment.kt")).s("Setting up thumbnail scrubbing preview for Trailer");
                Context context = getContext();
                context.getClass();
                ExoPlayer exoPlayer2 = this.m;
                exoPlayer2.getClass();
                imageView.getClass();
                textView.getClass();
                idf idfVar3 = this.f;
                if (idfVar3 == null) {
                    yks.c("imageFunction");
                    idfVar = null;
                } else {
                    idfVar = idfVar3;
                }
                idf idfVar4 = this.g;
                if (idfVar4 == null) {
                    yks.c("cacheImageFunction");
                    idfVar2 = null;
                } else {
                    idfVar2 = idfVar4;
                }
                jca jcaVar = new jca(context, exoPlayer2, defaultTimeBar, imageView, viewFindViewById, imageView2, textView, idfVar, idfVar2, f());
                this.I = jcaVar;
                defaultTimeBar.b(jcaVar);
                Executor executorF = f();
                ldv ldvVar = this.h;
                if (ldvVar == null) {
                    yks.c("accountManagerWrapper");
                    ldvVar = null;
                }
                ksy ksyVarR = hju.r(ihz.X(this.l.c));
                lsc lscVar2 = this.x;
                if (lscVar2 == null) {
                    yks.c("getStreamsFunction");
                } else {
                    lscVar = lscVar2;
                }
                iea ieaVarA = jbr.a(executorF, ldvVar, ksyVarR, lscVar);
                this.G = ieaVarA;
                krw krwVar = new krw(ieaVarA, this.I);
                this.H = krwVar;
                if (ieaVarA != null) {
                    ieaVarA.ea(krwVar);
                }
                iej iejVar = this.H;
                if (iejVar != null) {
                    iejVar.dM();
                }
            }
        }
        d().a.c(this.l, new izc(this, i));
        PlayerView playerView4 = this.u;
        if (playerView4 != null) {
            j(playerView4);
        }
        jce jceVar = this.t;
        jceVar.g(true);
        requireActivity().getOnBackPressedDispatcher().b(getViewLifecycleOwner(), jceVar);
    }

    public final kw p() {
        kw kwVar = this.B;
        if (kwVar != null) {
            return kwVar;
        }
        yks.c("pictureInPictureHelper");
        return null;
    }

    public final kuw q() {
        kuw kuwVar = this.D;
        if (kuwVar != null) {
            return kuwVar;
        }
        yks.c("semanticEventLogger");
        return null;
    }
}
