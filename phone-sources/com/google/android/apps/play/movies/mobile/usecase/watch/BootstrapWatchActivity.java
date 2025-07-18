package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.view.View;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import com.google.android.videos.R;
import defpackage.fuy;
import defpackage.gcu;
import defpackage.hjt;
import defpackage.hju;
import defpackage.icy;
import defpackage.icz;
import defpackage.ids;
import defpackage.idy;
import defpackage.iea;
import defpackage.ieb;
import defpackage.ieg;
import defpackage.iej;
import defpackage.ihz;
import defpackage.ino;
import defpackage.kee;
import defpackage.kgu;
import defpackage.krd;
import defpackage.krn;
import defpackage.kro;
import defpackage.krt;
import defpackage.krz;
import defpackage.ksf;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.ksy;
import defpackage.ktw;
import defpackage.kuf;
import defpackage.kum;
import defpackage.kuo;
import defpackage.kva;
import defpackage.kvc;
import defpackage.kvf;
import defpackage.kvk;
import defpackage.kxb;
import defpackage.ldv;
import defpackage.lfn;
import defpackage.lll;
import defpackage.lrc;
import defpackage.lxg;
import defpackage.lxh;
import defpackage.lxj;
import defpackage.lyl;
import defpackage.lys;
import defpackage.lyz;
import defpackage.mab;
import defpackage.mej;
import defpackage.mfm;
import defpackage.mil;
import defpackage.mjl;
import defpackage.mjo;
import defpackage.mmo;
import defpackage.mnm;
import defpackage.mnu;
import defpackage.mqn;
import defpackage.msf;
import defpackage.msv;
import defpackage.msw;
import defpackage.ouq;
import defpackage.our;
import defpackage.out;
import defpackage.ovo;
import defpackage.ssn;
import defpackage.tug;
import defpackage.tui;
import defpackage.tvo;
import defpackage.uof;
import defpackage.wae;
import defpackage.wjo;
import defpackage.xhn;
import defpackage.xke;
import defpackage.xmp;
import defpackage.ygi;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BootstrapWatchActivity extends mil {
    private static final tui t = tui.l("com/google/android/apps/play/movies/mobile/usecase/watch/BootstrapWatchActivity");
    public xke b;
    public xmp c;
    public ino d;
    public boolean e;
    public wjo f;
    public ldv g;
    public mjo h;
    public mjl i;
    public iea j;
    public mab k;
    public lxj l;
    public lfn m;
    public ExecutorService n;
    public idy o;
    public xhn p;
    public View q;
    public lys r;
    public lyz s;
    private boolean y;
    private final iej u = new krt();
    private final iej v = new lll(this, 6);
    private final ksf w = ksf.a();
    private ids x = hjt.d(new ids[0]);
    private boolean z = false;
    private AlertDialog A = null;

    /* renamed from: $r8$lambda$38w-pw4fe9e5v-wIBSsdl7oiGVw, reason: not valid java name */
    public static /* synthetic */ ygi m132$r8$lambda$38wpw4fe9e5vwIBSsdl7oiGVw(BootstrapWatchActivity bootstrapWatchActivity, int i, int i2, ksy ksyVar) {
        ((tug) ((tug) t.e().h(tvo.a, "[GTVM-Kinetoscope]")).j("com/google/android/apps/play/movies/mobile/usecase/watch/BootstrapWatchActivity", "kinetoscopePlayback", 610, "BootstrapWatchActivity.java")).B("Opening %s content with Kinetoscope Player with assetType: %s", true != bootstrapWatchActivity.z ? "TVOD" : "AVOD", bootstrapWatchActivity.c(i2));
        our ourVar = new our(ksyVar.b, bootstrapWatchActivity.c(i2));
        String strV = bootstrapWatchActivity.c.a() ? bootstrapWatchActivity.d.v(ihz.X(ourVar)) : "";
        Intent intent = new Intent(bootstrapWatchActivity, (Class<?>) PlayerActivity.class);
        intent.putExtra("player_metadata", new out(strV, ourVar));
        bootstrapWatchActivity.startActivity(intent.addFlags(i).putExtras(bootstrapWatchActivity.getIntent().getExtras()).putExtra("is_avod_playback", bootstrapWatchActivity.z));
        bootstrapWatchActivity.finish();
        return ygi.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.CharSequence, java.lang.Object] */
    public static /* synthetic */ kvk $r8$lambda$X_q5uL_GulmtU7CHi3RFA5SaFWw(BootstrapWatchActivity bootstrapWatchActivity, iea ieaVar, ksy ksyVar, ieg iegVar) {
        ieg iegVar2 = (ieg) ieaVar.a();
        if (iegVar2.m()) {
            kum kumVar = (kum) iegVar2.g();
            int i = 1;
            if (iegVar.m()) {
                if (!((kvc) iegVar.g()).i) {
                    fuy.b(bootstrapWatchActivity);
                    if (msf.e() == null) {
                        kvc kvcVar = (kvc) iegVar.g();
                        long jCurrentTimeMillis = kvcVar.c - System.currentTimeMillis();
                        long j = kvcVar.j;
                        if (j == Long.MAX_VALUE || jCurrentTimeMillis <= j * 1000) {
                            bootstrapWatchActivity.e();
                        } else if (bootstrapWatchActivity.b.g() && !bootstrapWatchActivity.d.N(hju.t(ksyVar))) {
                            bootstrapWatchActivity.e();
                        } else if (bootstrapWatchActivity.g()) {
                            bootstrapWatchActivity.setTheme(R.style.Theme_GoogleTv_Dark);
                            bootstrapWatchActivity.getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
                            long j2 = ((kvc) iegVar.g()).j * 1000;
                            ovo ovoVar = new ovo(bootstrapWatchActivity, i);
                            ssn ssnVar = new ssn(bootstrapWatchActivity);
                            ssnVar.p(bootstrapWatchActivity.getResources().getString(R.string.rental_dialog_title));
                            ssnVar.e(Html.fromHtml(bootstrapWatchActivity.getResources().getString(R.string.rental_dialog_message, Long.valueOf(j2 / 3600000))));
                            ssnVar.m(bootstrapWatchActivity.getResources().getString(R.string.rental_dialog_positive), new gcu(ovoVar, 15, null));
                            ssnVar.h(bootstrapWatchActivity.getResources().getString(R.string.rental_dialog_negative), new gcu(bootstrapWatchActivity, 16, null));
                            ssnVar.k(new kee((Context) bootstrapWatchActivity, 0));
                            bootstrapWatchActivity.A = ssnVar.create();
                        }
                    } else if (bootstrapWatchActivity.g()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(bootstrapWatchActivity);
                        builder.setTitle(R.string.mirror_warning_title);
                        builder.setMessage(R.string.mirror_warning_body);
                        builder.setPositiveButton(R.string.got_it, (DialogInterface.OnClickListener) null);
                        builder.setOnDismissListener(new kee((Object) bootstrapWatchActivity, 2));
                        bootstrapWatchActivity.A = builder.create();
                    }
                } else if (bootstrapWatchActivity.g()) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(bootstrapWatchActivity);
                    builder2.setTitle((CharSequence) new kro(10).b(kumVar));
                    builder2.setMessage(R.string.error_playback_3d_no_vr);
                    builder2.setPositiveButton(R.string.got_it, (DialogInterface.OnClickListener) null);
                    builder2.setOnDismissListener(new kee((Object) bootstrapWatchActivity, 2));
                    bootstrapWatchActivity.A = builder2.create();
                }
                AlertDialog alertDialog = bootstrapWatchActivity.A;
                if (alertDialog != null) {
                    alertDialog.show();
                }
            } else {
                if (bootstrapWatchActivity.i.V()) {
                    bootstrapWatchActivity.e();
                } else if (kumVar instanceof kvf) {
                    kvf kvfVar = (kvf) kumVar;
                    if (kvfVar.V() && bootstrapWatchActivity.g.a().m()) {
                        if (mnu.C(kvfVar, bootstrapWatchActivity.r.a((ksn) bootstrapWatchActivity.g.a().g()), bootstrapWatchActivity.p.a()) == 2) {
                            bootstrapWatchActivity.z = true;
                            bootstrapWatchActivity.e();
                        } else {
                            bootstrapWatchActivity.finish();
                        }
                    }
                }
                krd.f("Asset is not owned, won't be played, finishing watch activity");
                bootstrapWatchActivity.finish();
            }
        }
        return kvk.a;
    }

    public static /* synthetic */ ygi $r8$lambda$i0lwZRpkg8qNaQfxlODzC575ITw(BootstrapWatchActivity bootstrapWatchActivity, Exception exc) {
        bootstrapWatchActivity.d(exc, "Exoplayer Library", bootstrapWatchActivity.z);
        return ygi.a;
    }

    public static /* synthetic */ ygi $r8$lambda$lMdUuP5oCznRowcjMz0RIV_e410(BootstrapWatchActivity bootstrapWatchActivity, int i, int i2) {
        ((tug) ((tug) t.e().h(tvo.a, "[GTVM-Kinetoscope]")).j("com/google/android/apps/play/movies/mobile/usecase/watch/BootstrapWatchActivity", "nonKinetoscopePlayback", 629, "BootstrapWatchActivity.java")).B("Opening %s content with ExoPlayer library with assetType: %s", true != bootstrapWatchActivity.z ? "TVOD" : "AVOD", bootstrapWatchActivity.c(i2));
        bootstrapWatchActivity.startActivity(new Intent(bootstrapWatchActivity, (Class<?>) (true != bootstrapWatchActivity.y ? WatchActivity.class : WatchActivity.InitiallyLandscape.class)).addFlags(i).putExtras(bootstrapWatchActivity.getIntent().getExtras()).putExtra("is_avod_playback", bootstrapWatchActivity.z));
        bootstrapWatchActivity.finish();
        return ygi.a;
    }

    public static /* synthetic */ ygi $r8$lambda$sR6KNn8M4QFqb3GaMZXqhZOtwfs(BootstrapWatchActivity bootstrapWatchActivity) {
        bootstrapWatchActivity.e();
        return ygi.a;
    }

    public static /* synthetic */ ygi $r8$lambda$wENdGOwRGI51gqY0AZDRxmuFsr4(BootstrapWatchActivity bootstrapWatchActivity, Exception exc) {
        bootstrapWatchActivity.d(exc, "Kinetoscope Player", bootstrapWatchActivity.z);
        return ygi.a;
    }

    private static Intent a(Context context, ksy ksyVar, Uri uri, Uri uri2, ieg iegVar, ieg iegVar2, ieg iegVar3, String str, boolean z, Integer num) {
        msv msvVarA = msw.a(ksyVar);
        msvVarA.g(iegVar);
        msvVarA.h(iegVar2);
        msvVarA.e(uri);
        msvVarA.f(uri2);
        msvVarA.c(iegVar3);
        msvVarA.b(z);
        return b(context, str, msvVarA.a(), num);
    }

    private static Intent b(Context context, String str, msw mswVar, Integer num) {
        return kgu.y(new Intent(context, (Class<?>) BootstrapWatchActivity.class).putExtra("playback_info_extra", mswVar).putExtra("deeplink_maxrt", num), "mobile:".concat(String.valueOf(str)));
    }

    private final ouq c(int i) {
        return i == 5001 ? ouq.f : i == 6 ? ouq.b : i == 20 ? ouq.e : ouq.g;
    }

    public static Intent createAssetIntent(Context context, ksy ksyVar, ieg<ksy> iegVar, ieg<ksy> iegVar2, Uri uri, Uri uri2, String str, Integer num) {
        return a(context, ksyVar, uri, uri2, iegVar2, iegVar, ieg.a, str, false, num);
    }

    public static Intent createEpisodeIntent(Context context, kuo kuoVar, String str, Integer num) {
        ieg iegVarF = ieg.f(ksy.k(kuoVar.j));
        ieg iegVarF2 = ieg.f(ksy.l(kuoVar.k));
        return a(context, kuoVar.c, kuoVar.f, kuoVar.q, iegVarF, iegVarF2, ieg.a, kgu.C(str, "episode"), false, num);
    }

    public static Intent createEpisodeIntentFromBeginning(Context context, kuo kuoVar, String str, Integer num) {
        return a(context, kuoVar.c, kuoVar.f, kuoVar.q, ieg.f(ksy.k(kuoVar.j)), ieg.f(ksy.l(kuoVar.k)), ieg.f(0), kgu.C(str, "episode"), false, num);
    }

    public static Intent createMovieIntent(Context context, kvf kvfVar, int i, String str, Integer num) {
        ksy ksyVarO = kvfVar.o();
        Uri uriG = kvfVar.g();
        Uri uriH = kvfVar.h();
        ieg iegVar = ieg.a;
        return a(context, ksyVarO, uriG, uriH, iegVar, iegVar, ieg.f(Integer.valueOf(i)), kgu.C(str, "movie"), kvfVar.V(), num);
    }

    public static Intent createTrailerIntent(Context context, kxb kxbVar, ieg<ksy> iegVar, ieg<Integer> iegVar2, String str) {
        msv msvVarA = msw.a(kxbVar.b);
        msvVarA.e(kxbVar.d);
        msvVarA.f(kxbVar.c);
        msvVarA.d(iegVar);
        msvVarA.c(iegVar2);
        msvVarA.i(true);
        return b(context, kgu.C(str, "trailer"), msvVarA.a(), null).putExtra("start_activity_flags", 134217728);
    }

    private final void d(Exception exc, String str, boolean z) {
        ((tug) ((tug) ((tug) t.g().h(tvo.a, "[GTVM-Kinetoscope]")).i(exc)).j("com/google/android/apps/play/movies/mobile/usecase/watch/BootstrapWatchActivity", "handleFailureDuringPlayback", 646, "BootstrapWatchActivity.java")).B("Failed to start %s playback with %s", true != z ? "TVOD" : "AVOD", str);
    }

    private final void e() {
        f(true != this.e ? 67108864 : 335544320);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(final int r13) {
        /*
            r12 = this;
            boolean r0 = r12.isFinishing()
            if (r0 == 0) goto L7
            return
        L7:
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "playback_info_extra"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r5 = r0
            msw r5 = (defpackage.msw) r5
            defpackage.a.aq(r5)
            boolean r0 = r5.h
            ksy r8 = r5.e
            r1 = 5001(0x1389, float:7.008E-42)
            if (r0 == 0) goto L25
            r0 = r1
            goto L27
        L25:
            int r0 = r8.a
        L27:
            xke r2 = r12.b
            boolean r2 = r2.g()
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L3c
            r2 = 6
            if (r0 == r2) goto L3a
            r2 = 20
            if (r0 == r2) goto L39
            goto L3c
        L39:
            r0 = r2
        L3a:
            r11 = r10
            goto L52
        L3c:
            xke r2 = r12.b
            boolean r2 = r2.f()
            if (r2 == 0) goto L46
            if (r0 == r1) goto L3a
        L46:
            wjo r1 = r12.f
            wjo r2 = defpackage.wjo.XR
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L51
            goto L3a
        L51:
            r11 = r9
        L52:
            tui r1 = com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity.t
            tuv r1 = r1.e()
            tuy r2 = defpackage.tvo.a
            java.lang.String r3 = "[GTVM-Kinetoscope]"
            tuv r1 = r1.h(r2, r3)
            tug r1 = (defpackage.tug) r1
            r2 = 562(0x232, float:7.88E-43)
            java.lang.String r3 = "BootstrapWatchActivity.java"
            java.lang.String r4 = "com/google/android/apps/play/movies/mobile/usecase/watch/BootstrapWatchActivity"
            java.lang.String r6 = "startWatchActivity"
            tuv r1 = r1.j(r4, r6, r2, r3)
            tug r1 = (defpackage.tug) r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            ouq r4 = r12.c(r0)
            xke r2 = r12.b
            boolean r2 = r2.f()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            wjo r7 = r12.f
            java.lang.String r2 = "[Playback] useKinetoscope=%s with assetType=%s, playbackInfo=%s, trailersPlaybackEnabled=%s, androidSurface=%s"
            r1.G(r2, r3, r4, r5, r6, r7)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r2 = "fallback_to_legacy_player"
            boolean r1 = r1.getBooleanExtra(r2, r9)
            if (r11 == 0) goto L99
            if (r1 != 0) goto L99
            r3 = r10
            goto L9a
        L99:
            r3 = r9
        L9a:
            mql r4 = new mql
            r4.<init>()
            mqm r5 = new mqm
            r5.<init>()
            kij r6 = new kij
            r13 = 15
            r6.<init>(r12, r13)
            kij r7 = new kij
            r13 = 16
            r7.<init>(r12, r13)
            java.lang.String r2 = "tvod playback feature"
            defpackage.igz.a(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity.f(int):void");
    }

    private final boolean g() {
        AlertDialog alertDialog = this.A;
        return alertDialog == null || !alertDialog.isShowing();
    }

    @Override // defpackage.mil, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        wae.y(this);
        super.onCreate(bundle);
        setContentView(R.layout.bootstrap_watch_activity);
        View viewFindViewById = findViewById(R.id.spinner);
        viewFindViewById.getClass();
        this.q = viewFindViewById;
        getOnBackPressedDispatcher().a(new mqn(this));
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        ksf ksfVar = this.w;
        ksfVar.ee(this.v);
        ksfVar.b();
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.w.ea(this.v);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [iec, ied] */
    @Override // defpackage.by, android.app.Activity
    protected final void onStart() {
        iea ieaVarD;
        super.onStart();
        mjl mjlVar = this.i;
        mej mejVarA = mej.a(this);
        fuy.b(this);
        this.y = msf.f(mejVarA, mjlVar);
        Intent intent = getIntent();
        msw mswVar = (msw) intent.getExtras().getParcelable("playback_info_extra");
        mswVar.getClass();
        int i = 0;
        if (intent.getBooleanExtra("direct_playback", false)) {
            e();
        } else if (mswVar.h) {
            int intExtra = intent.getIntExtra("start_activity_flags", 131072);
            if (this.e) {
                intExtra |= 268435456;
            }
            f(intExtra);
        } else {
            this.w.d(2000L);
            ksy ksyVar = mswVar.e;
            ieg iegVar = mswVar.b;
            ieg iegVar2 = mswVar.c;
            ieg iegVarA = this.g.a();
            lyl lylVar = new lyl(this.s, 0);
            int i2 = 1;
            if (((kva) this.j.a()).b(ksyVar).b || !mswVar.i) {
                ktw.o((ksn) iegVarA.g(), ksyVar, iegVar, iegVar2, kuf.a, this.r, this.m).o(new krn(this.n, lylVar, i2, null));
                if (iegVar2.m() && iegVar.m()) {
                    if (iegVarA.m()) {
                        this.k.e(new uof((ksn) iegVarA.g(), (String) null), icz.a, new mfm());
                    }
                    kuo kuoVarD = kuo.d(ksyVar.b, ((ksy) iegVar.g()).b, ((ksy) iegVar2.g()).b);
                    lxj lxjVar = this.l;
                    ksy ksyVar2 = kuoVarD.c;
                    ieg iegVarF = ieg.f(kuoVarD);
                    krz krzVar = new krz(ieg.a);
                    lxh lxhVar = (lxh) lxjVar;
                    krzVar.a = new ids[]{lxhVar.h, lxhVar.c, lxhVar.f};
                    krzVar.b = lxhVar.b;
                    krzVar.d(new lxg(lxjVar, ksyVar2, iegVarF, i));
                    ieaVarD = krzVar.a();
                } else {
                    if (iegVarA.m()) {
                        this.k.e(uof.j((ksn) iegVarA.g(), ksyVar), icz.a, new mfm());
                    }
                    ieaVarD = this.l.d(kvf.U(ksyVar));
                }
                ?? C = ieb.c(kvk.a);
                ieb iebVar = (ieb) C;
                iebVar.k(ieaVarD, this.j);
                iebVar.q();
                iebVar.e(new mmo(ieaVarD, 6));
                iebVar.l();
                iebVar.h(this.j);
                iebVar.j(new icy(ksyVar), mnm.b);
                iebVar.i(ksk.a);
                iebVar.n(new lrc(this, ieaVarD, ksyVar, 10));
                this.x = C.a();
            } else {
                this.z = true;
                e();
            }
        }
        this.x.ea(this.u);
        idy idyVar = this.o;
        Intent intent2 = new Intent("com.google.android.videos.NEW_PLAYBACK_STARTED");
        intent2.setPackage(getPackageName());
        idyVar.c(intent2);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.x.ee(this.u);
    }

    public static Intent createMovieIntent(Context context, kvf kvfVar, String str, Integer num) {
        ksy ksyVarO = kvfVar.o();
        Uri uriG = kvfVar.g();
        Uri uriH = kvfVar.h();
        ieg iegVar = ieg.a;
        return a(context, ksyVarO, uriG, uriH, iegVar, iegVar, iegVar, kgu.C(str, "movie"), kvfVar.V(), num);
    }
}
