package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.play.movies.common.view.subtitles.DefaultSubtitlesOverlay;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import defpackage.by;
import defpackage.icz;
import defpackage.idr;
import defpackage.idy;
import defpackage.idz;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.iej;
import defpackage.jwq;
import defpackage.kfw;
import defpackage.krw;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.ksy;
import defpackage.kuw;
import defpackage.kwx;
import defpackage.kwy;
import defpackage.kxb;
import defpackage.kzo;
import defpackage.lck;
import defpackage.ldv;
import defpackage.lfn;
import defpackage.lhr;
import defpackage.lie;
import defpackage.lkr;
import defpackage.lks;
import defpackage.lkt;
import defpackage.llt;
import defpackage.llv;
import defpackage.llw;
import defpackage.lnu;
import defpackage.lob;
import defpackage.lvd;
import defpackage.lyl;
import defpackage.mdz;
import defpackage.mem;
import defpackage.mfx;
import defpackage.mfy;
import defpackage.mga;
import defpackage.mgc;
import defpackage.mjl;
import defpackage.mjn;
import defpackage.mjo;
import defpackage.mjp;
import defpackage.mpz;
import defpackage.mqo;
import defpackage.mqp;
import defpackage.mqv;
import defpackage.mrb;
import defpackage.mrc;
import defpackage.mrd;
import defpackage.mre;
import defpackage.mrf;
import defpackage.mrt;
import defpackage.mru;
import defpackage.msv;
import defpackage.msw;
import defpackage.rrx;
import defpackage.rzt;
import defpackage.rzy;
import defpackage.sah;
import defpackage.san;
import defpackage.trk;
import defpackage.tst;
import defpackage.wgi;
import defpackage.xch;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InlineLocalWatchFragment extends xch implements View.OnClickListener, lkr, lob, mqo {
    public ldv accountManagerWrapper;
    public ieh<ieg<ksn>> accountSupplier;
    public lfn config;
    private mqp controllerOverlay;
    final idr<tst<llv>> currentPlaybackRestrictionRepository;
    private final idr<ieg<llt>> currentPlayerErrorRepository;
    final idy<ieg<String>> debugInfoReceiver;
    private lks director;
    public lkt directorFactory;
    final kwx disabledSubtitleTrack;
    private final mrd errorUpdatable;
    private View errorView;
    public lie eventLogger;
    final mrb fragmentState;
    private mrc fullscreenUiVisibilityHelper;
    public lhr gmsHelpUtil;
    private int lastKnownPlayerState;
    private boolean manageActionBarVisibility;
    public mjl mediaRouteManager;
    private mjn mediaRouteProvider;
    public mjo mediaRouteProviderCompat;
    private final mre mediaRouterCallback;
    public mem networkStatus;
    private rzy pageNode;
    private boolean pageNodeWasLoggedBeforeOnStart;
    public san playUlexLogger;
    private msw playbackInfo;
    llw playbackResumeState;
    mfy playerSurface;
    public mgc playerView;
    public lnu preparationLogger;
    private final mrf routeManagerListener;
    public mru storyboardHelperFactory;
    private final idr<List<lck>> storyboardsRepository;
    private iej storyboardsUpdatable;
    DefaultSubtitlesOverlay subtitlesOverlay;

    public InlineLocalWatchFragment() {
        ieg iegVar = ieg.a;
        this.debugInfoReceiver = new idz(iegVar);
        this.currentPlaybackRestrictionRepository = new idz(trk.a);
        this.disabledSubtitleTrack = kwx.createDisableTrack("");
        this.fragmentState = new mrb();
        this.mediaRouterCallback = new mre(this);
        this.routeManagerListener = new mrf(this);
        this.currentPlayerErrorRepository = new idz(iegVar);
        this.errorUpdatable = new mrd(this);
        this.storyboardsRepository = new idz(ImmutableList.of());
        this.manageActionBarVisibility = false;
        this.lastKnownPlayerState = 2;
    }

    private ieg<Integer> getCurrentTimeMillis() {
        mrb mrbVar = this.fragmentState;
        return mrbVar == null ? ieg.a : ieg.f((Integer) mrbVar.b.a());
    }

    private boolean isPlayingFullscreen() {
        return (getView() == null || getView().getLayoutParams() == null || getView().getLayoutParams().height != -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchFullScreenActivity$0() {
        try {
            getActivity().getSupportFragmentManager().M();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchFullScreenActivity() {
        mdz mdzVar = new mdz(this, 0);
        Context context = getContext();
        msw mswVar = this.playbackInfo;
        Intent intentCreateTrailerIntent = BootstrapWatchActivity.createTrailerIntent(context, kxb.b(mswVar.e.b, mswVar.f, mswVar.g), this.playbackInfo.a, getCurrentTimeMillis(), getArguments().getString("referrer"));
        intentCreateTrailerIntent.putExtra("use_close_as_home_up_indicator", true);
        mdzVar.a(intentCreateTrailerIntent);
        lks lksVar = this.director;
        if (lksVar != null) {
            lksVar.f();
        }
        ksk.g(new mpz(this, 6));
    }

    public static InlineLocalWatchFragment newInstance(msw mswVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("playback_info_extra", mswVar);
        bundle.putBoolean("manage_action_bar_visibility", z);
        bundle.putString("referrer", str);
        InlineLocalWatchFragment inlineLocalWatchFragment = new InlineLocalWatchFragment();
        inlineLocalWatchFragment.setArguments(bundle);
        return inlineLocalWatchFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        launchFullScreenActivity();
    }

    @Override // defpackage.mqo
    public void onControllerActivated() {
        if (isPlayingFullscreen()) {
            this.fullscreenUiVisibilityHelper.b(false);
        }
    }

    @Override // defpackage.mqo
    public void onControllerDeactivated() {
        if (isPlayingFullscreen()) {
            this.fullscreenUiVisibilityHelper.b(true);
        }
    }

    @Override // defpackage.mqo
    public void onControllerDeactivationPending() {
        if (isPlayingFullscreen()) {
            this.fullscreenUiVisibilityHelper.b(true);
        }
    }

    @Override // defpackage.lob
    public void onControlsHidden() {
        if (this.manageActionBarVisibility) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        }
    }

    @Override // defpackage.lob
    public void onControlsShown() {
        if (this.manageActionBarVisibility) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        }
    }

    @Override // defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.manageActionBarVisibility = getArguments().getBoolean("manage_action_bar_visibility", false);
        msw mswVar = (msw) getArguments().getParcelable("playback_info_extra");
        this.playbackInfo = mswVar;
        if (mswVar == null) {
            msv msvVarA = msw.a((ksy) getArguments().getParcelable("asset_id"));
            msvVarA.i(true);
            this.playbackInfo = msvVarA.a();
        }
        this.playbackResumeState = new llw((bundle == null || !bundle.containsKey("playback_resume_state")) ? new Bundle() : bundle.getBundle("playback_resume_state"));
        this.mediaRouteProvider = new mjp();
        mjl mjlVar = this.mediaRouteManager;
        mjlVar.a.c(mjlVar.b, this.mediaRouterCallback);
        this.mediaRouteManager.S(this.routeManagerListener);
        this.pageNode = (rzy) ((sah) rrx.E(this.playUlexLogger.j(rzt.a(this)), wgi.INLINE_LOCAL_PLAYBACK)).e();
        this.pageNodeWasLoggedBeforeOnStart = true;
        lkt lktVar = this.directorFactory;
        llw llwVar = this.playbackResumeState;
        msw mswVar2 = this.playbackInfo;
        this.director = lktVar.a(this, llwVar, mswVar2.e, mswVar2.b(), this.playbackInfo.c(), this.playbackInfo.h, this.accountManagerWrapper.a(), this.preparationLogger, this.debugInfoReceiver, false, this.currentPlaybackRestrictionRepository, this.disabledSubtitleTrack, trk.a, false);
        if (bundle != null) {
            this.currentPlayerErrorRepository.c(kfw.G(bundle));
            this.lastKnownPlayerState = bundle.getInt("last_known_player_state", 2);
        }
    }

    @Override // defpackage.bv
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.preparationLogger.e(16);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.inline_local_watch_fragment, viewGroup, false);
        Context context = getContext();
        this.subtitlesOverlay = new DefaultSubtitlesOverlay(context);
        mqv mqvVar = new mqv(context, getFragmentManager(), this, this, icz.c, layoutInflater, this.fragmentState, this.playUlexLogger, this.pageNode, false, new lyl(this, 6));
        this.controllerOverlay = mqvVar;
        mqvVar.s();
        this.controllerOverlay.o(this.director);
        this.controllerOverlay.h(this.director);
        this.controllerOverlay.c().setOnClickListener(this);
        mrt mrtVarA = this.storyboardHelperFactory.a(this.playbackInfo.e.c, context, this.controllerOverlay.getView(), this.controllerOverlay.f(), this.controllerOverlay.d(), this.controllerOverlay.e(), false);
        idr<List<lck>> idrVar = this.storyboardsRepository;
        krw krwVar = new krw(idrVar, mrtVarA);
        this.storyboardsUpdatable = krwVar;
        idrVar.ea(krwVar);
        this.storyboardsUpdatable.dM();
        this.controllerOverlay.f().a(mrtVarA);
        int i = getResources().getConfiguration().orientation;
        mgc mgcVar = new mgc(context, new SurfaceView(context));
        this.playerView = mgcVar;
        mgcVar.b(this.subtitlesOverlay, this.controllerOverlay);
        mfx mfxVar = this.playerView.a;
        this.playerSurface = mfxVar;
        mfxVar.g(i == 2 ? 100 : 0);
        this.playerSurface.i(false);
        this.preparationLogger.c(16);
        viewGroup2.addView(this.playerView);
        this.playerView.getLayoutParams().width = -1;
        this.playerView.getLayoutParams().height = -1;
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        mrc mrcVar = new mrc(appCompatActivity.getWindow(), appCompatActivity.getSupportActionBar(), this.playerView);
        this.fullscreenUiVisibilityHelper = mrcVar;
        mgc mgcVar2 = this.playerView;
        mgcVar2.b = mrcVar;
        boolean z = i != 2;
        Iterator it = mgcVar2.c.iterator();
        while (it.hasNext()) {
            ((mga) it.next()).hideFeedbackText(z);
        }
        jwq.W(viewGroup2);
        View viewInflate = this.config.cH() ? layoutInflater.inflate(R.layout.gtv_error_overlay, viewGroup, false) : layoutInflater.inflate(R.layout.error_overlay, viewGroup, false);
        this.errorView = viewInflate;
        viewInflate.setVisibility(8);
        viewGroup2.addView(this.errorView);
        return viewGroup2;
    }

    @Override // defpackage.bv
    public void onDestroy() {
        super.onDestroy();
        this.director.f();
        this.mediaRouteManager.U(this.routeManagerListener);
        this.mediaRouteManager.a.f(this.mediaRouterCallback);
    }

    @Override // defpackage.bv
    public void onDestroyView() {
        super.onDestroyView();
        this.controllerOverlay.l();
        this.playerSurface.e();
        this.storyboardsRepository.ee(this.storyboardsUpdatable);
        this.fullscreenUiVisibilityHelper.a();
    }

    @Override // defpackage.bv
    public void onPause() {
        super.onPause();
        if (!ksk.u() || getActivity().isFinishing()) {
            this.director.f();
        }
        this.currentPlayerErrorRepository.ee(this.errorUpdatable);
    }

    @Override // defpackage.lkr
    public void onPlayerAudioTracks(List<kzo> list, int i) {
        this.fragmentState.onPlayerAudioTracks(list, i);
    }

    @Override // defpackage.lkr
    public void onPlayerProgress(int i, int i2, int i3) {
        this.fragmentState.onPlayerProgress(i, i2, i3);
    }

    @Override // defpackage.lkr
    public void onPlayerStateChanged(int i, llt lltVar, int i2) {
        by activity = getActivity();
        if (i == 2) {
            this.lastKnownPlayerState = i;
        } else if (i == 3) {
            i = 3;
            this.lastKnownPlayerState = i;
        }
        if (i == 4) {
            this.currentPlayerErrorRepository.c(ieg.a(lltVar));
            i = 4;
        }
        if (!activity.isFinishing()) {
            this.fragmentState.onPlayerStateChanged(i, lltVar, i2);
            if (i == 5) {
                getActivity().getSupportFragmentManager().M();
            }
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        mgc mgcVar = this.playerView;
        if (mgcVar != null) {
            mgcVar.setKeepScreenOn(z);
        }
    }

    @Override // defpackage.lkr
    public void onPlayerSubtitleTracks(List<kwx> list, kwx kwxVar) {
        this.fragmentState.onPlayerSubtitleTracks(list, kwxVar);
    }

    @Override // defpackage.bv
    public void onResume() {
        super.onResume();
        this.director.c(((ieg) this.currentPlayerErrorRepository.a()).l() && this.lastKnownPlayerState == 2);
        this.currentPlayerErrorRepository.ea(this.errorUpdatable);
        this.controllerOverlay.c().setVisibility(true == isPlayingFullscreen() ? 8 : 0);
    }

    @Override // defpackage.bv
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle("playback_resume_state", this.playbackResumeState.a);
        bundle.putInt("last_known_player_state", this.lastKnownPlayerState);
        ieg iegVar = (ieg) this.currentPlayerErrorRepository.a();
        if (iegVar.m()) {
            kfw.H(bundle, (llt) iegVar.g());
        }
    }

    @Override // defpackage.bv
    public void onStart() {
        super.onStart();
        if (this.pageNodeWasLoggedBeforeOnStart) {
            this.pageNodeWasLoggedBeforeOnStart = false;
        } else {
            this.playUlexLogger.e(this.pageNode);
        }
        this.director.a(this.playerSurface, this.subtitlesOverlay, null);
        this.playerSurface.m();
        this.director.b();
        this.controllerOverlay.r(true != ((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled() ? 2 : 1);
        this.controllerOverlay.j();
    }

    @Override // defpackage.bv
    public void onStop() {
        super.onStop();
        this.controllerOverlay.k();
        this.controllerOverlay.n();
        this.director.f();
        if (isPlayingFullscreen()) {
            this.fullscreenUiVisibilityHelper.b(false);
        }
    }

    @Override // defpackage.lkr
    public void onStoryboards(List<lck> list) {
        this.storyboardsRepository.c(list);
    }

    @Override // defpackage.lkr
    public void onVideoInfo(kwy kwyVar, int i, int i2, kuw kuwVar, ieg<lvd> iegVar, int i3) {
        kfw.J(this.fragmentState, kwyVar, i, i2, kuwVar, iegVar, i3);
    }

    @Override // defpackage.lkr
    public /* synthetic */ void onVideoInfo(String str, int i, int i2, kuw kuwVar, ieg iegVar, int i3) {
        throw new IllegalStateException("One of onVideoInfo overrides must be implemented");
    }

    @Override // defpackage.lkr
    public /* synthetic */ void onAdPlaybackCompleted() {
    }

    @Override // defpackage.lkr
    public /* synthetic */ void onAdPlaybackStarted() {
    }

    @Override // defpackage.lkr
    public void onPlaybackTerminated() {
    }

    @Override // defpackage.lkr
    public void onStreamingWarningRequired(boolean z) {
    }

    @Override // defpackage.lkr
    public void maybeShowKnowledge(int i, int i2) {
    }
}
