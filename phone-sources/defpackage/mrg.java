package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.play.movies.common.view.subtitles.DefaultSubtitlesOverlay;
import com.google.android.apps.play.movies.mobile.usecase.watch.StreamingWarningDialogActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import com.google.android.videos.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrg extends xch implements ActionBar.OnMenuVisibilityListener, mqo, lkr, mgr {
    private static final tui p = tui.l("com/google/android/apps/play/movies/mobile/usecase/watch/LocalWatchFragment");
    private iea A;
    private lks B;
    private KeyguardManager C;
    private mrc D;
    private msg E;
    private int F;
    private boolean G;
    private boolean H;
    private rzy I;
    private boolean J;
    private boolean K;
    private mgc L;
    private fbt M;
    private mfy N;
    private msx O;
    private mrt P;
    private iej Q;
    private DefaultSubtitlesOverlay R;
    private mtk S;
    private llw T;
    private lkc U;
    private iej V;
    private iej W;
    private ieg X;
    private msw Y;
    private ksy Z;
    public lfn a;
    private boolean aa;
    private mti ab;
    public ldv b;
    public ieh c;
    public lit d;
    public lkt e;
    public lnu f;
    public san g;
    public mru h;
    public ivx i;
    public mqp j;
    public isn k;
    public moz l;
    public ntp m;
    public paq n;
    public lhr o;
    private final idr q;
    private final idr r;
    private final iej s;
    private final idr t;
    private final idr u;
    private final mrb v;
    private final idr w;
    private final idy x;
    private liw y;
    private eu z;

    public mrg() {
        ieg iegVar = ieg.a;
        this.q = new idz(iegVar);
        this.r = new idz(-1);
        this.s = new lll(this, 11);
        this.t = new idz(iegVar);
        this.u = new idz(Collections.EMPTY_LIST);
        this.v = new mrb();
        this.w = new idz("");
        this.x = new lgx(this, 12);
        this.J = false;
        this.K = false;
        this.X = iegVar;
    }

    private final void b() {
        this.B.c(this.G && !this.C.inKeyguardRestrictedInputMode());
        this.B.e(this.aa);
        this.G = false;
    }

    private final WatchActivity c() {
        return (WatchActivity) getActivity();
    }

    @Override // defpackage.mgr
    public final void a() {
        this.y.a();
    }

    @Override // defpackage.bv
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        jwq.V(printWriter);
    }

    @Override // defpackage.lkr
    public final void maybeShowKnowledge(int i, int i2) {
        if (!isResumed() || this.aa) {
            return;
        }
        this.S.maybeShowKnowledge(i, i2);
    }

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            if (i2 == -1) {
                this.B.d();
                i2 = -1;
            }
            i = 100;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.lkr
    public final void onAdPlaybackCompleted() {
        this.aa = false;
        for (mga mgaVar : this.L.c) {
            mgaVar.isAvodOverlay();
            mgaVar.getView().setVisibility(0);
        }
    }

    @Override // defpackage.lkr
    public final void onAdPlaybackStarted() {
        this.D.b(false);
        this.aa = true;
        for (mga mgaVar : this.L.c) {
            mgaVar.isAvodOverlay();
            mgaVar.getView().setVisibility(8);
        }
    }

    @Override // defpackage.bv, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.F != configuration.orientation) {
            this.F = configuration.orientation;
            ((mqv) this.j).A();
            ((mtd) this.O).e();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.mqo
    public final void onControllerActivated() {
        this.D.b(false);
        this.O.a(true);
    }

    @Override // defpackage.mqo
    public final void onControllerDeactivated() {
        if (!this.H) {
            this.D.b(true);
        }
        this.O.a(false);
    }

    @Override // defpackage.mqo
    public final void onControllerDeactivationPending() {
        if (this.H) {
            return;
        }
        this.D.b(true);
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Context context = getContext();
        this.X = this.b.a();
        msw mswVar = (msw) getArguments().getParcelable("playback_info_extra");
        mswVar.getClass();
        this.Y = mswVar;
        this.Z = mswVar.e;
        this.K = getArguments().getBoolean("is_avod_playback", false);
        this.T = new llw(bundle != null ? bundle.getBundle("playback_resume_state") : new Bundle());
        this.G = bundle == null || bundle.getBoolean("should-auto-play");
        String strC = this.Y.c();
        boolean z = this.Y.h;
        this.A = this.l.b(this.q, true, this.r, this.Z.b, z, (ActivityManager) context.getSystemService("activity"));
        this.I = (rzy) ((sah) rrx.E(this.g.j(rzt.a(this)), wgi.LOCAL_PLAYBACK)).e();
        this.J = true;
        this.z = (eu) this.c.a();
        this.y = new liw(this.z, this.d, this.Z.b, strC != null, context.getApplicationContext());
        WatchActivity watchActivityC = c();
        tug tugVar = (tug) ((tug) p.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/LocalWatchFragment", "onCreate", 244, "LocalWatchFragment.java");
        boolean zA = watchActivityC.a().a();
        idr idrVar = watchActivityC.e;
        tugVar.D("[Playback] LocalWatchFragment.onCreate: useInAppDrmCondition=%s , currentPlaybackRestrictionRepository=%s", zA, idrVar.a());
        this.B = this.e.a(this, this.T, this.Z, this.Y.b(), strC, z, this.X, this.f, this.t, watchActivityC.a().a(), idrVar, kwx.createDisableTrack(getString(R.string.turn_off_subtitles)), trk.a, this.K);
        getActivity().getWindow().addFlags(201326592);
        this.W = new krw(this.w, new lyl(this, 7, null));
        this.F = getResources().getConfiguration().orientation;
        this.k.eb();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lfn] */
    @Override // defpackage.bv
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (c().E.h) {
            return;
        }
        this.j.i(menu, menuInflater);
        msg msgVar = this.E;
        lks lksVar = this.B;
        if (lksVar != null && lksVar.i()) {
            menuInflater.inflate(R.menu.zoom_menu, menu);
            if (msgVar.j) {
                sal salVar = (sal) msgVar.g.k(msgVar.h).a(wgi.ZOOM_BUTTON);
                salVar.d(!msgVar.k);
                msgVar.i = (rzy) salVar.e();
            }
            mjo.t(menu, R.id.menu_zoom_in, msgVar.j && !msgVar.k);
            mjo.t(menu, R.id.menu_zoom_out, msgVar.j && msgVar.k);
        }
        mti mtiVar = this.ab;
        if (mtiVar.b.dc()) {
            ieg iegVar = (ieg) mtiVar.a.a();
            if (iegVar.m()) {
                menuInflater.inflate(R.menu.debug_menu, menu);
                menu.findItem(R.id.menu_debug).setTitle((CharSequence) iegVar.g());
            }
        }
        this.i.a(getContext(), menu, menuInflater, new kil(17));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, lxj] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, yfo] */
    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SurfaceView surfaceView;
        lkc lkyVar;
        this.f.e(16);
        setHasOptionsMenu(true);
        Context context = getContext();
        if (this.a.du() && c().a().a()) {
            fbt fbtVar = new fbt(context);
            this.M = fbtVar;
            surfaceView = fbtVar;
        } else {
            this.M = null;
            surfaceView = new SurfaceView(context);
        }
        mgc mgcVar = new mgc(context, surfaceView);
        this.L = mgcVar;
        this.N = mgcVar.a;
        this.E = new msg(this.g, this.I, this.N);
        ntp ntpVar = this.m;
        idr idrVar = this.t;
        lfn lfnVar = (lfn) ntpVar.a.b();
        lfnVar.getClass();
        idrVar.getClass();
        this.ab = new mti(lfnVar, idrVar, getActivity(), 1);
        this.R = new DefaultSubtitlesOverlay(context);
        lhr lhrVar = this.o;
        rzy rzyVar = this.I;
        mcy mcyVar = (mcy) lhrVar.g.b();
        mcyVar.getClass();
        iea ieaVar = (iea) lhrVar.d.b();
        ieaVar.getClass();
        lhrVar.c.b();
        ((lie) lhrVar.f.b()).getClass();
        ldv ldvVar = (ldv) lhrVar.a.b();
        ldvVar.getClass();
        Object obj = lhrVar.e;
        san sanVar = (san) lhrVar.b.b();
        sanVar.getClass();
        context.getClass();
        rzyVar.getClass();
        this.O = new mtd(mcyVar, ieaVar, ldvVar, sanVar, context, rzyVar);
        WatchActivity watchActivityC = c();
        watchActivityC.d(this.O);
        mrm mrmVar = watchActivityC.E;
        lks lksVar = this.B;
        mgc mgcVar2 = this.L;
        mry mryVar = new mry(this.N);
        idy idyVar = this.x;
        if (ksk.v(mrmVar.c) && mrmVar.d.co() && !mrmVar.f) {
            mrmVar.g = new mri(mrmVar, lksVar, mgcVar2, mryVar, idyVar);
        } else {
            mrmVar.g = mrm.a;
        }
        if (ksy.t(this.Z) && this.a.bR()) {
            paq paqVar = this.n;
            ieg iegVar = this.X;
            ksy ksyVar = this.Z;
            int iJ = this.a.j();
            int i = this.a.i();
            lin linVar = watchActivityC.G;
            msx msxVar = this.O;
            SharedPreferences sharedPreferences = (SharedPreferences) paqVar.b.b();
            sharedPreferences.getClass();
            mem memVar = (mem) paqVar.a.b();
            memVar.getClass();
            ?? B = paqVar.d.b();
            iea ieaVar2 = (iea) paqVar.c.b();
            ieaVar2.getClass();
            iegVar.getClass();
            ksyVar.getClass();
            linVar.getClass();
            mrmVar.getClass();
            msxVar.getClass();
            layoutInflater.getClass();
            lkyVar = new msi(sharedPreferences, memVar, B, ieaVar2, getActivity(), ksyVar, iJ, i, linVar, mrmVar, msxVar, layoutInflater);
        } else {
            lkyVar = new lky(getActivity());
        }
        this.U = lkyVar;
        cr fragmentManager = getFragmentManager();
        lkc lkcVar = this.U;
        mtg mtgVar = new mtg(this.O, 0);
        mrb mrbVar = this.v;
        this.j = new mqv(context, fragmentManager, lkcVar, this, mtgVar, layoutInflater, mrbVar, this.g, this.I, false, null);
        mjo.x(mrbVar, (lod) getActivity(), this.L);
        mru mruVar = this.h;
        String str = this.Z.b;
        Object obj2 = this.j;
        mqv mqvVar = (mqv) obj2;
        mrt mrtVarA = mruVar.a(str, context, (View) obj2, mqvVar.b, mqvVar.p, mqvVar.c, false);
        this.P = mrtVarA;
        idr idrVar2 = this.u;
        krw krwVar = new krw(idrVar2, mrtVarA);
        this.Q = krwVar;
        idrVar2.ea(krwVar);
        this.Q.dM();
        ((mqv) this.j).b.a(this.P);
        this.U.a((ViewGroup) this.j);
        this.L.b(this.R, this.j, this.O);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        mrc mrcVar = new mrc(appCompatActivity.getWindow(), appCompatActivity.getSupportActionBar(), this.L);
        this.D = mrcVar;
        this.L.b = mrcVar;
        this.f.c(16);
        return this.L;
    }

    @Override // defpackage.bv
    public final void onDestroy() throws NoSuchFieldException {
        super.onDestroy();
        c().E.g = mrm.a;
        this.B.f();
        liw liwVar = this.y;
        liwVar.g.a = true;
        eu euVar = liwVar.b;
        euVar.e(false);
        euVar.f(new liu());
        euVar.i(liw.a);
        ((lit) ((ttd) liwVar.c).a).b(euVar);
        this.z.d();
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        super.onDestroyView();
        c().h(this.O);
        this.N.e();
        this.j.l();
        ((mqv) this.j).b.c(this.P);
        this.u.ee(this.Q);
        this.D.a();
    }

    @Override // android.support.v7.app.ActionBar.OnMenuVisibilityListener
    public final void onMenuVisibilityChanged(boolean z) {
        this.H = z;
        if (((mqv) this.j).q != 3 || z) {
            return;
        }
        this.D.b(true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lfn] */
    @Override // defpackage.bv
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        msg msgVar = this.E;
        if (menuItem.getItemId() == R.id.menu_zoom_in) {
            msgVar.g.f(msgVar.i).e();
            msgVar.b(true);
        } else if (menuItem.getItemId() == R.id.menu_zoom_out) {
            msgVar.g.f(msgVar.i).e();
            msgVar.b(false);
        } else {
            mti mtiVar = this.ab;
            if (mtiVar.b.dc() && menuItem != null && menuItem.getItemId() == R.id.menu_debug) {
                AlertDialog.Builder builder = new AlertDialog.Builder((Context) mtiVar.c);
                builder.setTitle("Playback Debug Info");
                builder.setMessage((CharSequence) ((ieg) mtiVar.a.a()).h("No Debug Info"));
                builder.setCancelable(true);
                builder.show();
            } else if (!this.j.q(menuItem) && !this.i.c(menuItem)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bv
    public final void onPause() {
        super.onPause();
        this.w.ee(this.W);
        if (!ksk.u() || getActivity().isFinishing()) {
            this.B.f();
        }
        this.i.b();
    }

    @Override // defpackage.lkr
    public final void onPlaybackTerminated() {
        getActivity().finish();
    }

    @Override // defpackage.lkr
    public final void onPlayerAudioTracks(List<kzo> list, int i) {
        this.v.onPlayerAudioTracks(list, i);
    }

    @Override // defpackage.lkr
    public final void onPlayerProgress(int i, int i2, int i3) {
        this.v.onPlayerProgress(i, i2, i3);
        lkc lkcVar = this.U;
        if (lkcVar != null) {
            lkcVar.onPlayerProgress(i, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    @Override // defpackage.lkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPlayerStateChanged(int r18, defpackage.llt r19, int r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrg.onPlayerStateChanged(int, llt, int):void");
    }

    @Override // defpackage.lkr
    public final void onPlayerSubtitleTracks(List<kwx> list, kwx kwxVar) {
        this.v.onPlayerSubtitleTracks(list, kwxVar);
    }

    @Override // defpackage.bv
    public final void onResume() {
        super.onResume();
        this.w.ea(this.W);
        this.W.dM();
        b();
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle("playback_resume_state", this.T.a);
        bundle.putBoolean("should-auto-play", this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.KeyEvent$Callback, mqp] */
    @Override // defpackage.bv
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        if (this.J) {
            this.J = false;
        } else {
            this.g.e(this.I);
        }
        Context context = getContext();
        WatchActivity watchActivityC = c();
        watchActivityC.g.add(this);
        watchActivityC.z.addOnMenuVisibilityListener(this);
        watchActivityC.h.add(this);
        this.E.ea(this.s);
        hjr.b(getContext()).e();
        ieg iegVarB = watchActivityC.b();
        if (!this.T.j() && iegVarB.m()) {
            this.T.e(((Integer) iegVarB.g()).intValue());
        }
        this.B.a(this.N, this.R, this.M);
        watchActivityC.e(this.B);
        ((mtd) this.O).m = new gag(this.j, ((AppCompatActivity) getActivity()).getSupportActionBar());
        watchActivityC.c(this.j);
        ((mtd) this.O).e();
        this.j.h(this.U);
        this.j.h(this.B);
        this.C = (KeyguardManager) context.getSystemService("keyguard");
        this.z.f(new llc(this.B, this.U));
        float dimension = getResources().getDimension(R.dimen.sqrt_min_tag_area);
        mtk mtkVar = new mtk(new llj(this.N), dimension * dimension, this.O, null, this.B, this.a);
        this.S = mtkVar;
        this.j.h(mtkVar);
        this.j.s();
        ((mqv) this.j).a = this.B;
        this.j.r(true != ((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled() ? 2 : 1);
        this.N.m();
        this.B.b();
        iea ieaVar = this.A;
        mti mtiVar = new mti(ieaVar, this.S, this.v.i, 0);
        this.V = mtiVar;
        ieaVar.ea(mtiVar);
        this.V.dM();
        this.U.b();
        mti mtiVar2 = this.ab;
        mtiVar2.a.ea(mtiVar2);
        this.j.j();
        if (ksk.v(context) && getActivity().isInPictureInPictureMode()) {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.KeyEvent$Callback, mqp] */
    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        this.B.f();
        this.j.m(this.U);
        this.j.m(this.B);
        this.j.m(this.S);
        this.D.b(false);
        this.U.c();
        this.S.b();
        this.A.ee(this.V);
        this.j.k();
        this.j.n();
        this.U.g();
        this.P.e();
        WatchActivity watchActivityC = c();
        watchActivityC.g(this.j);
        watchActivityC.g.remove(this);
        watchActivityC.z.removeOnMenuVisibilityListener(this);
        watchActivityC.i(this.B);
        this.E.ee(this.s);
        mti mtiVar = this.ab;
        mtiVar.a.ee(mtiVar);
    }

    @Override // defpackage.lkr
    public final void onStoryboards(List<lck> list) {
        this.u.c(list);
    }

    @Override // defpackage.lkr
    public final void onStreamingWarningRequired(boolean z) {
        if (z) {
            startActivityForResult(StreamingWarningDialogActivity.createIntent(getContext()), 100);
        }
    }

    @Override // defpackage.lkr
    public final /* synthetic */ void onVideoInfo(kwy kwyVar, int i, int i2, kuw kuwVar, ieg iegVar, int i3) {
        kfw.J(this, kwyVar, i, i2, kuwVar, iegVar, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.lkr
    public final void onVideoInfo(String str, int i, int i2, kuw kuwVar, ieg<lvd> iegVar, int i3) {
        this.w.c(str);
        this.v.onVideoInfo(str, i, i2, kuwVar, iegVar, i3);
        this.U.onVideoInfo(str, i, i2, kuwVar, iegVar, i3);
        this.q.c(iegVar);
        this.r.c(Integer.valueOf(i3));
        ?? r10 = kuwVar.a;
        liw liwVar = this.y;
        boolean zIsEmpty = TextUtils.isEmpty(r10);
        String str2 = r10;
        if (zIsEmpty) {
            str2 = kuwVar.b;
        }
        Uri uri = TextUtils.isEmpty(str2) ? Uri.EMPTY : Uri.parse(str2);
        tbk tbkVar = liwVar.g;
        tbkVar.a = false;
        tbkVar.a(null, str, i);
        liw liwVar2 = (liw) tbkVar.b;
        hjr.c(liwVar2.f).b().e(kxd.a(uri, liwVar2.d, "screenshot")).l(new liv(tbkVar, str, i));
    }
}
