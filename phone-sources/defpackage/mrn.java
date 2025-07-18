package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import com.google.android.videos.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrn extends xch implements View.OnTouchListener, mqo, mjg {
    private KeyguardManager A;
    private int B;
    private boolean C;
    private boolean D;
    private rzy E;
    private msw H;
    private ksy I;
    private String J;
    private boolean K;
    private ieg L;
    private mqp M;
    private mrt N;
    private iej O;
    private llw P;
    private iea R;
    private iej S;
    private iej T;
    public lfn d;
    public Executor e;
    public ldv f;
    public mjl g;
    public mab h;
    public lzz i;
    public lnu j;
    public san k;
    public mru l;
    public mta m;
    public SharedPreferences n;
    public mkc o;
    public msx p;
    public mtk q;
    public lsc r;
    public krb s;
    public rah t;
    public moz u;
    public paq v;
    public lkt w;
    private iea x;
    private mjh y;
    private mjw z;
    public final idr a = new idz(-1);
    public final idr b = new idz("");
    public final mrb c = new mrb();
    private boolean F = false;
    private ieg G = ieg.a;
    private mfb Q = mfi.a;

    public final WatchActivity a() {
        return (WatchActivity) getActivity();
    }

    @Override // defpackage.bv
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        jwq.V(printWriter);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        by activity = getActivity();
        mjw mjwVar = this.g.e;
        this.z = mjwVar;
        if (mjwVar == null) {
            activity.finish();
            this.y = mjf.a;
            krd.f("Dummy remote director created.");
            return;
        }
        String str = this.L.m() ? ((ksy) this.L.g()).b : null;
        paq paqVar = this.v;
        llw llwVar = this.P;
        ksy ksyVar = this.I;
        String strB = this.H.b();
        String str2 = this.J;
        boolean z = this.K;
        ieg iegVar = this.G;
        mjw mjwVar2 = this.z;
        lnu lnuVar = this.j;
        Resources resources = getResources();
        Uri uri = this.H.g;
        Context contextA = ((rgq) paqVar.a).a();
        SharedPreferences sharedPreferences = (SharedPreferences) paqVar.d.b();
        sharedPreferences.getClass();
        lie lieVar = (lie) paqVar.b.b();
        lieVar.getClass();
        lld lldVar = (lld) paqVar.c.b();
        lldVar.getClass();
        llwVar.getClass();
        ksyVar.getClass();
        iegVar.getClass();
        mjwVar2.getClass();
        lnuVar.getClass();
        resources.getClass();
        this.y = new mje(contextA, sharedPreferences, lieVar, lldVar, this, llwVar, ksyVar, strB, str2, z, str, iegVar, mjwVar2, lnuVar, resources, uri);
    }

    @Override // defpackage.bv, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.B != configuration.orientation) {
            this.B = configuration.orientation;
            ((mqv) this.M).A();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.mqo
    public final void onControllerActivated() {
        this.p.a(true);
    }

    @Override // defpackage.mqo
    public final void onControllerDeactivated() {
        this.p.a(false);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [iec, ied] */
    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        msw mswVar = (msw) getArguments().getParcelable("playback_info_extra");
        mswVar.getClass();
        this.H = mswVar;
        this.I = mswVar.e;
        this.J = mswVar.c();
        msw mswVar2 = this.H;
        this.K = mswVar2.h;
        this.L = mswVar2.a;
        Context context = getContext();
        this.G = this.f.a();
        this.E = (rzy) ((sah) rrx.E(this.k.j(rzt.a(this)), wgi.CAST_PLAYBACK)).e();
        this.F = true;
        ?? C = ieb.c(Collections.EMPTY_LIST);
        ieb iebVar = (ieb) C;
        iebVar.k(new ids[0]);
        iebVar.q();
        iebVar.i(this.e);
        nag nagVar = new nag(null, null, null, null);
        nagVar.n(this.G);
        nagVar.o(this.I);
        nagVar.a = tst.i(Locale.getDefault());
        nagVar.p(lgm.a());
        iebVar.h(new icy(nagVar.m()));
        iebVar.f(this.r);
        iebVar.l();
        iebVar.n(new mcm(15));
        this.R = C.a();
        this.g.c.j(PendingIntent.getActivity(context, 0, krb.j(context, this.G, this.J, this.H.b(), this.I.b, this.L.m() ? ((ksy) this.L.g()).b : "", this.K), 201326592));
        this.C = bundle != null;
        this.P = new llw(bundle != null ? bundle.getBundle("playback_resume_state") : new Bundle());
        this.x = this.u.b(new idz(ieg.a), false, this.a, this.I.b, this.K, (ActivityManager) context.getSystemService("activity"));
        getActivity().setRequestedOrientation(7);
        this.T = new krw(this.b, new lyl(this, 7, null));
        this.B = getResources().getConfiguration().orientation;
    }

    @Override // defpackage.bv
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        this.M.i(menu, menuInflater);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.KeyEvent$Callback, mqp] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, yfo] */
    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        this.j.e(16);
        setHasOptionsMenu(true);
        Context context = getContext();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.watch_remote_and_secondary_fragment, viewGroup, false);
        View viewInflate = layoutInflater.inflate(R.layout.remote_screen_panel, viewGroup2, false);
        this.t = new rah(viewInflate, this.H.g, this.o, true != ksy.v(this.I) ? R.id.show_poster : R.id.movie_poster);
        viewGroup2.addView(viewInflate);
        mta mtaVar = this.m;
        lgx lgxVar = new lgx(this, 13);
        ?? r8 = mtaVar.a;
        rzy rzyVar = this.E;
        lfn lfnVar = (lfn) r8.b();
        lfnVar.getClass();
        Executor executor = (Executor) mtaVar.b.b();
        executor.getClass();
        mcy mcyVar = (mcy) mtaVar.c.b();
        mcyVar.getClass();
        iea ieaVar = (iea) mtaVar.d.b();
        ieaVar.getClass();
        mtaVar.e.b();
        ((lie) mtaVar.f.b()).getClass();
        ldv ldvVar = (ldv) mtaVar.g.b();
        ldvVar.getClass();
        idf idfVarA = ((lwc) mtaVar.h).a();
        Object obj = mtaVar.i;
        san sanVar = (san) mtaVar.j.b();
        sanVar.getClass();
        context.getClass();
        rzyVar.getClass();
        this.p = new msz(lfnVar, executor, mcyVar, ieaVar, ldvVar, idfVarA, sanVar, context, lgxVar, rzyVar);
        if (this.d.cP() && !this.n.getBoolean(krh.ENABLE_INFO_CARDS, true)) {
            this.p.a(false);
            this.t.a(true);
        }
        WatchActivity watchActivityA = a();
        watchActivityA.d(this.p);
        cr fragmentManager = getFragmentManager();
        mrb mrbVar = this.c;
        this.M = new mqv(context, fragmentManager, mja.a, this, icz.b, layoutInflater, mrbVar, this.k, this.E, true, null);
        mjo.x(mrbVar, (lod) getActivity(), viewGroup2);
        mru mruVar = this.l;
        String str = this.I.b;
        Object obj2 = this.M;
        mqv mqvVar = (mqv) obj2;
        mrt mrtVarA = mruVar.a(str, context, (View) obj2, mqvVar.b, mqvVar.p, mqvVar.c, true);
        this.N = mrtVarA;
        iea ieaVar2 = this.R;
        krw krwVar = new krw(ieaVar2, mrtVarA);
        this.S = krwVar;
        ieaVar2.ea(krwVar);
        this.S.dM();
        ((mqv) this.M).b.a(this.N);
        watchActivityA.c(this.M);
        viewGroup2.addView((View) this.p, -1, -1);
        viewGroup2.addView((View) this.M, -1, -1);
        viewGroup2.setSystemUiVisibility(0);
        viewGroup2.setOnTouchListener(this);
        this.j.c(16);
        return viewGroup2;
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        super.onDestroy();
        this.y.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.KeyEvent$Callback, mqp] */
    @Override // defpackage.bv
    public final void onDestroyView() {
        super.onDestroyView();
        WatchActivity watchActivityA = a();
        watchActivityA.g(this.M);
        watchActivityA.h(this.p);
        this.M.l();
        ((mqv) this.M).b.c(this.N);
        this.R.ee(this.S);
    }

    @Override // defpackage.bv
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.M.q(menuItem);
    }

    @Override // defpackage.bv
    public final void onPause() {
        super.onPause();
        this.b.ee(this.T);
        if (getActivity().isFinishing()) {
            this.y.w(true);
            this.Q.a();
            this.Q = mfi.a;
        }
    }

    @Override // defpackage.mjg
    public final void onPlaybackTerminated() {
        by activity = getActivity();
        if (ksk.o(activity)) {
            activity.finish();
        }
    }

    @Override // defpackage.bv
    public final void onResume() {
        int i;
        super.onResume();
        getActivity().setRequestedOrientation(7);
        this.b.ea(this.T);
        this.T.dM();
        mjy mjyVarC = this.z.c();
        by activity = getActivity();
        boolean z = this.C;
        if (z && mjyVarC != null && ((i = mjyVarC.b) == 0 || i == 5)) {
            activity.finish();
        } else if (z || !this.D) {
            this.D = true;
            this.y.k((z || this.A.inKeyguardRestrictedInputMode()) ? false : true);
        }
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle("playback_resume_state", this.P.a);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.bv
    public final void onStart() {
        int i;
        int i2;
        mfb mfbVarB;
        super.onStart();
        if (this.F) {
            this.F = false;
        } else {
            this.k.e(this.E);
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        WatchActivity watchActivityA = a();
        ((msz) this.p).e();
        this.A = (KeyguardManager) appCompatActivity.getSystemService("keyguard");
        ieg iegVarB = watchActivityA.b();
        if (!this.P.j() && iegVarB.m()) {
            this.P.e(((Integer) iegVarB.g()).intValue());
        }
        lkt lktVar = this.w;
        mjh mjhVar = this.y;
        mab mabVar = this.h;
        lzz lzzVar = this.i;
        lzzVar.getClass();
        mjk mjkVar = new mjk(mabVar, new mmm(lzzVar, 15));
        ieg iegVar = this.G;
        ksy ksyVar = this.I;
        boolean z = this.K;
        llw llwVar = this.P;
        int i3 = 8;
        byte[] bArr = null;
        if (z) {
            mfbVarB = mjo.e(new krn(mjhVar, new lqs(lktVar.c, lktVar.f, 8, null), 11, bArr), new ldj(lktVar, ksyVar, 14), lktVar.a);
            i2 = 0;
            i = 1;
        } else {
            i = 1;
            krx krxVar = new krx(new pku(new nhl(lktVar.b), null), mjhVar);
            ksn ksnVar = (ksn) iegVar.g();
            String str = ksyVar.b;
            jbj jbjVar = new jbj(krxVar, 9);
            i2 = 0;
            iei ieiVar = new iei(mjkVar, uof.k(ksnVar, str));
            ?? r7 = lktVar.a;
            mfb mfbVarE = mjo.e(jbjVar, ieiVar, r7);
            mfb mfbVarE2 = mjo.e(new jbj(krxVar, i3), new ldj(lktVar, ksyVar, 15), r7);
            jbj jbjVar2 = new jbj(krxVar, 7);
            if (llwVar.j()) {
                jbjVar2.c(ieg.a);
                mfbVarB = mfg.b(mfbVarE, mfbVarE2);
            } else {
                mfbVarB = mfg.b(mjo.e(new krn(ksyVar, jbjVar2, 12, bArr), new iei(lktVar.d, ltr.a(ksnVar, str)), r7), mfbVarE, mfbVarE2);
            }
        }
        this.Q = mfbVarB;
        watchActivityA.e(this.y);
        ((msz) this.p).n = new gag(this.M, appCompatActivity.getSupportActionBar());
        int i4 = i2;
        this.q = new mtk(new icy(new meq(i4, i4)), 0.0f, null, this.p, this.y, this.d);
        iea ieaVar = this.x;
        mti mtiVar = new mti(ieaVar, this.q, this.c.i, 0);
        this.O = mtiVar;
        ieaVar.ea(mtiVar);
        this.O.dM();
        this.M.h(this.q);
        this.M.h(this.y);
        this.M.s();
        mqp mqpVar = this.M;
        ((mqv) mqpVar).a = this.y;
        mqpVar.r(i);
        Window window = appCompatActivity.getWindow();
        window.clearFlags(134217728);
        window.addFlags(67108864);
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(appCompatActivity.getColor(R.color.gray_900));
        window.setStatusBarColor(appCompatActivity.getColor(R.color.gray_900));
        this.M.j();
    }

    @Override // defpackage.bv
    public final void onStop() {
        super.onStop();
        this.C = true;
        this.M.m(this.q);
        this.M.m(this.y);
        this.Q.a();
        this.Q = mfi.a;
        this.t.e.setVisibility(8);
        this.q.b();
        this.x.ee(this.O);
        this.M.n();
        this.N.e();
        a().i(this.y);
        this.M.k();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.M.g(false);
        return true;
    }

    @Override // defpackage.mqo
    public final void onControllerDeactivationPending() {
    }
}
