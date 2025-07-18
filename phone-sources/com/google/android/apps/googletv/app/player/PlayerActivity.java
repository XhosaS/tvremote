package com.google.android.apps.googletv.app.player;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import defpackage.at;
import defpackage.bv;
import defpackage.by;
import defpackage.dvb;
import defpackage.dxd;
import defpackage.gag;
import defpackage.hju;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.iej;
import defpackage.ino;
import defpackage.ith;
import defpackage.itk;
import defpackage.itm;
import defpackage.iua;
import defpackage.ivx;
import defpackage.iwg;
import defpackage.jaf;
import defpackage.jan;
import defpackage.jbb;
import defpackage.jbk;
import defpackage.jbr;
import defpackage.jbs;
import defpackage.jbt;
import defpackage.jbv;
import defpackage.jcm;
import defpackage.jdd;
import defpackage.jms;
import defpackage.kpz;
import defpackage.kqa;
import defpackage.ksy;
import defpackage.kum;
import defpackage.kuw;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.lfz;
import defpackage.lhr;
import defpackage.lie;
import defpackage.lxp;
import defpackage.mem;
import defpackage.otz;
import defpackage.ouh;
import defpackage.ouq;
import defpackage.our;
import defpackage.out;
import defpackage.pku;
import defpackage.tug;
import defpackage.tui;
import defpackage.tvo;
import defpackage.vtw;
import defpackage.vxr;
import defpackage.wdq;
import defpackage.wpl;
import defpackage.wpm;
import defpackage.wxe;
import defpackage.xcf;
import defpackage.yfm;
import defpackage.yfw;
import defpackage.yih;
import defpackage.ykr;
import defpackage.yks;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PlayerActivity extends xcf {
    public static final String REMOTE_WATCH_ACTIVITY = "com.google.android.apps.play.movies.mobile.usecase.watch.RemoteWatchActivity";
    public static final String VIDEO_PLAYER_METADATA_KEY = "videoPlayerMetadata";
    private final pku A;
    public ino a;
    public ivx b;
    public itk c;
    public lhr d;
    public lie e;
    public ieh f;
    public ldv g;
    public mem h;
    public jaf i;
    public out j;
    public lxp k;
    public jan l;
    public lfz m;
    public gag n;
    public kuw o;
    private out s;
    private kpz t;
    private boolean u;
    private jbv v;
    private boolean w;
    private final iej x;
    private final iej y;
    private final pku z;
    public static final jbr Companion = new jbr();
    private static final tui p = tui.l("com/google/android/apps/googletv/app/player/PlayerActivity");
    private static final Map q = yfm.h(new yfw(ouh.a, wdq.ERROR_TYPE_UNSPECIFIED), new yfw(ouh.b, wdq.INITIALIZATION_ERROR), new yfw(ouh.c, wdq.STREAM_FETCH_ERROR), new yfw(ouh.d, wdq.DASH_MANIFEST_CONVERSION_ERROR));
    private static final Map r = yfm.h(new yfw(otz.a, wdq.PURCHASE_ERROR), new yfw(otz.d, wdq.DRM_ERROR), new yfw(otz.b, wdq.STREAMING_POLICY_ERROR), new yfw(otz.c, wdq.OFFLINE_POLICY_ERROR));

    public static /* synthetic */ void $r8$lambda$YT6v3sfjM4Kc1EBCZv_R4TIVtP4(PlayerActivity playerActivity) {
        ith ithVarE = playerActivity.a().e();
        if (ithVarE == null || ((iua) ithVarE).d) {
            return;
        }
        String str = playerActivity.j.c.a().c;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        vtw vtwVarM = wpm.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = wpl.a.m();
        vtwVarM2.getClass();
        wxe.t(playerActivity.j.c.b(), vtwVarM2);
        vxr.y(wxe.s(vtwVarM2), vtwVarM);
        wpm wpmVarW = vxr.w(vtwVarM);
        try {
            ((iua) ithVarE).m.ea(playerActivity.y);
        } catch (Exception e) {
            ((tug) ((tug) p.f().h(tvo.a, "[GTVM-Kinetoscope]")).i(e).j("com/google/android/apps/googletv/app/player/PlayerActivity", "mediaDeviceUpdatable$lambda$2", R.styleable.AppCompatTheme_textAppearanceListItemSecondary, "PlayerActivity.kt")).s("Encountered error while trying to add stateRepositoryUpdatable");
        }
        ((tug) p.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/PlayerActivity", "mediaDeviceUpdatable$lambda$2", 109, "PlayerActivity.kt")).E("Status for mediaDevice: %s to support playback for watchaction: %s is: %b", ithVarE, wpmVarW, Boolean.valueOf(playerActivity.a().m(wpmVarW)));
    }

    public PlayerActivity() {
        out outVar = out.a;
        this.j = outVar;
        this.s = outVar;
        this.x = new itm(this, 11);
        this.y = new itm(this, 12, null);
        this.A = new pku(this);
        this.z = new pku(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(jbv jbvVar) {
        if (!this.w) {
            this.v = jbvVar;
            return;
        }
        jbvVar.getClass();
        jbk jbkVar = new jbk();
        Bundle bundle = new Bundle();
        bundle.putParcelable("player_error_data", jbvVar);
        jbkVar.setArguments(bundle);
        at atVar = new at(getSupportFragmentManager());
        atVar.u(com.google.android.videos.R.id.content_container, jbkVar, "error_fragment");
        atVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e() {
        ksy ksyVarI;
        jdd jddVar;
        our ourVar = this.j.c;
        ouq ouqVar = ourVar.b;
        int iOrdinal = ouqVar.ordinal();
        if (iOrdinal == 1) {
            ksyVarI = ksy.i(ourVar.a);
        } else if (iOrdinal == 4) {
            ksyVarI = ksy.h(ourVar.a);
        } else {
            if (iOrdinal != 5) {
                throw new IllegalArgumentException("Unsupported PlayID type: " + ouqVar.name() + ".");
            }
            ksyVarI = ksy.m(ourVar.a);
        }
        lxp lxpVar = this.k;
        if (lxpVar == null) {
            yks.c("modelFactory");
            lxpVar = null;
        }
        Object objB = lxpVar.c(kum.class).b(ksyVarI);
        objB.getClass();
        ieg iegVar = (ieg) objB;
        if (!iegVar.m()) {
            mem memVar = this.h;
            if (memVar == null) {
                yks.c("networkStatus");
                memVar = null;
            }
            if (!memVar.g().j()) {
                pku pkuVar = this.z;
                String string = getString(com.google.android.videos.R.string.no_network);
                string.getClass();
                pkuVar.f(string, false, true);
            }
            ((TextView) findViewById(com.google.android.videos.R.id.content_blocked_text)).setVisibility(0);
            ykr.q(dvb.d(this), null, 0, new jbb(this, (yih) null, 3), 3);
            return;
        }
        lfz lfzVar = this.m;
        if (lfzVar == null) {
            yks.c("contentFiltersManager");
            lfzVar = null;
        }
        lfzVar.e().b(iegVar.g());
        this.u = true;
        String str = "tvod_fragment";
        bv bvVarF = getSupportFragmentManager().f("tvod_fragment");
        if (bvVarF == null) {
            bvVarF = getSupportFragmentManager().f(EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG);
        }
        if (bvVarF != null) {
            at atVar = new at(getSupportFragmentManager());
            atVar.m(bvVarF);
            atVar.a();
        }
        ouq ouqVar2 = this.j.c.b;
        ouq ouqVar3 = ouq.f;
        if (ouqVar2 == ouqVar3) {
            c().e(this, jbr.L(258187, null, 14));
            str = EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG;
        } else {
            c().e(this, jbr.L(258188, null, 14));
        }
        out outVar = this.j;
        if (outVar.c.b == ouqVar3) {
            pku pkuVar2 = this.z;
            outVar.getClass();
            pkuVar2.getClass();
            jcm jcmVar = new jcm();
            Bundle bundle = new Bundle();
            bundle.putParcelable("player_metadata", outVar);
            jcmVar.setArguments(bundle);
            jcmVar.C = pkuVar2;
            jddVar = jcmVar;
        } else {
            tui tuiVar = jdd.a;
            out outVar2 = this.j;
            pku pkuVar3 = this.z;
            pku pkuVar4 = this.A;
            String stringExtra = getIntent().getStringExtra("referrer");
            outVar2.getClass();
            pkuVar3.getClass();
            pkuVar4.getClass();
            jdd jddVar2 = new jdd();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("player_metadata", outVar2);
            bundle2.putString("referrer", stringExtra);
            jddVar2.setArguments(bundle2);
            jddVar2.at = pkuVar3;
            jddVar2.au = pkuVar4;
            jddVar = jddVar2;
        }
        this.s = this.j;
        ((tug) p.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/PlayerActivity", "commitFragmentIfContentAllowed", 271, "PlayerActivity.kt")).v("Launching the Player Fragment for video with playId = %s", this.j.c);
        at atVar2 = new at(getSupportFragmentManager());
        atVar2.u(com.google.android.videos.R.id.content_container, jddVar, str);
        atVar2.a();
    }

    private final void f() {
        if (yks.e(this.j, out.a)) {
            throw new IllegalStateException("PlayerMetadata has not been provided for the playback");
        }
    }

    private static final out g(Intent intent) {
        if (Build.VERSION.SDK_INT > 33) {
            out outVar = (out) intent.getParcelableExtra("player_metadata", out.class);
            return outVar == null ? out.a : outVar;
        }
        out outVar2 = (out) intent.getParcelableExtra("player_metadata");
        return outVar2 == null ? out.a : outVar2;
    }

    public final itk a() {
        itk itkVar = this.c;
        if (itkVar != null) {
            return itkVar;
        }
        yks.c("mediaDeviceController");
        return null;
    }

    public final ivx b() {
        ivx ivxVar = this.b;
        if (ivxVar != null) {
            return ivxVar;
        }
        yks.c("castIconProvider");
        return null;
    }

    public final jaf c() {
        jaf jafVar = this.i;
        if (jafVar != null) {
            return jafVar;
        }
        yks.c("veLogger");
        return null;
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.videos.R.layout.player_activity);
        Object applicationContext = getApplicationContext();
        kqa kqaVar = applicationContext instanceof kqa ? (kqa) applicationContext : null;
        this.t = kqaVar != null ? kqaVar.b() : null;
        if (bundle != null) {
            Object parcelable = bundle.getParcelable(VIDEO_PLAYER_METADATA_KEY, out.class);
            parcelable.getClass();
            this.j = (out) parcelable;
        } else {
            Intent intent = getIntent();
            intent.getClass();
            this.j = g(intent);
        }
        f();
        e();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int i = 1;
        if (menu != null) {
            bv bvVarF = getSupportFragmentManager().f("tvod_fragment");
            if (bvVarF == null) {
                bvVarF = getSupportFragmentManager().f(EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG);
            }
            if (bvVarF != null) {
                ivx ivxVarB = b();
                MenuInflater menuInflater = getMenuInflater();
                menuInflater.getClass();
                ivxVarB.a(this, menu, menuInflater, new iwg(i));
            }
            getMenuInflater().inflate(com.google.android.videos.R.menu.settings_and_help_menu, menu);
        }
        return true;
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        out outVarG = g(intent);
        this.j = outVarG;
        if (yks.e(this.s, outVarG)) {
            return;
        }
        f();
        e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        lhr lhrVar;
        lie lieVar;
        ldv ldvVar;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
        } else {
            if (itemId == com.google.android.videos.R.id.menu_settings) {
                if (this.l == null) {
                    yks.c("navigationManager");
                }
                by byVarF = hju.F(this);
                if (byVarF != null) {
                    byVarF.startActivity(jbr.aa(byVarF));
                }
                return true;
            }
            if (itemId == com.google.android.videos.R.id.menu_help_and_feedback) {
                lhr lhrVar2 = this.d;
                ieh iehVar = null;
                if (lhrVar2 == null) {
                    yks.c("gmsHelpUtil");
                    lhrVar = null;
                } else {
                    lhrVar = lhrVar2;
                }
                lie lieVar2 = this.e;
                if (lieVar2 == null) {
                    yks.c("eventLogger");
                    lieVar = null;
                } else {
                    lieVar = lieVar2;
                }
                ldv ldvVar2 = this.g;
                if (ldvVar2 == null) {
                    yks.c("accountManagerWrapper");
                    ldvVar = null;
                } else {
                    ldvVar = ldvVar2;
                }
                ieh iehVar2 = this.f;
                if (iehVar2 == null) {
                    yks.c("accountSupplier");
                } else {
                    iehVar = iehVar2;
                }
                lhrVar.c(lieVar, ldvVar, ((ldy) iehVar).a(), this, "mobile_movie_player");
                return true;
            }
        }
        return b().c(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.w = false;
        if (this.u) {
            b().b();
        }
        try {
            a().c().ee(this.x);
        } catch (IllegalArgumentException e) {
            ((tug) ((tug) p.f().h(tvo.a, "[GTVM-Kinetoscope]")).i(e).j("com/google/android/apps/googletv/app/player/PlayerActivity", "onPause", 322, "PlayerActivity.kt")).s("Encountered error while trying to remove mediaDeviceUpdatable");
        }
    }

    @Override // defpackage.fl, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        super.onPictureInPictureModeChanged(z, configuration);
        ykr.q(dvb.d(this), null, 0, new jms(this, z, (yih) null, 1), 3);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        dxd dxdVarF = getSupportFragmentManager().f("tvod_fragment");
        if (dxdVarF == null) {
            dxdVarF = getSupportFragmentManager().f(EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG);
        }
        jbs jbsVar = dxdVarF instanceof jbs ? (jbs) dxdVarF : null;
        if (jbsVar != null) {
            jbsVar.b(pictureInPictureUiState);
            super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        }
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.w = true;
        try {
            a().c().ea(this.x);
        } catch (IllegalArgumentException e) {
            ((tug) ((tug) p.f().h(tvo.a, "[GTVM-Kinetoscope]")).i(e).j("com/google/android/apps/googletv/app/player/PlayerActivity", "onResume", 301, "PlayerActivity.kt")).s("Encountered error while trying to add mediaDeviceUpdatable");
        }
        this.x.dM();
    }

    @Override // defpackage.by
    protected final void onResumeFragments() {
        super.onResumeFragments();
        jbv jbvVar = this.v;
        if (jbvVar != null) {
            d(jbvVar);
        }
        this.v = null;
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(VIDEO_PLAYER_METADATA_KEY, this.j);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.w = false;
        if (isInPictureInPictureMode()) {
            finish();
        }
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onUserLeaveHint() {
        dxd dxdVarF = getSupportFragmentManager().f("tvod_fragment");
        if (dxdVarF == null) {
            dxdVarF = getSupportFragmentManager().f(EntityPageActivity.TRAILER_PLAYER_FRAGMENT_TAG);
        }
        jbt jbtVar = dxdVarF instanceof jbt ? (jbt) dxdVarF : null;
        if (jbtVar != null) {
            jbtVar.c();
            super.onUserLeaveHint();
        }
    }

    public static /* synthetic */ void getLegacyPlayerFallback$java_com_google_android_apps_googletv_app_player_player$annotations() {
    }
}
