package com.google.android.apps.play.movies.mobile.usecase.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.apps.play.movies.mobile.presenter.helper.DetailsHeaderListLayout;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;
import defpackage.a;
import defpackage.at;
import defpackage.bne;
import defpackage.bv;
import defpackage.by;
import defpackage.cr;
import defpackage.cwk;
import defpackage.cwn;
import defpackage.gag;
import defpackage.hjt;
import defpackage.icz;
import defpackage.idf;
import defpackage.idr;
import defpackage.ids;
import defpackage.idy;
import defpackage.idz;
import defpackage.iea;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.ihg;
import defpackage.ith;
import defpackage.itk;
import defpackage.iua;
import defpackage.iuy;
import defpackage.jaf;
import defpackage.jbr;
import defpackage.kff;
import defpackage.kgu;
import defpackage.kkb;
import defpackage.kri;
import defpackage.krv;
import defpackage.ksa;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.ksy;
import defpackage.ktn;
import defpackage.kuf;
import defpackage.kuj;
import defpackage.kuk;
import defpackage.kuo;
import defpackage.kuw;
import defpackage.kva;
import defpackage.kvf;
import defpackage.kvj;
import defpackage.kwl;
import defpackage.kwn;
import defpackage.lal;
import defpackage.lam;
import defpackage.lan;
import defpackage.lao;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lfz;
import defpackage.lhg;
import defpackage.lid;
import defpackage.lie;
import defpackage.lim;
import defpackage.lin;
import defpackage.lio;
import defpackage.liq;
import defpackage.lll;
import defpackage.lxj;
import defpackage.lys;
import defpackage.mab;
import defpackage.mac;
import defpackage.mij;
import defpackage.mix;
import defpackage.mjd;
import defpackage.mjl;
import defpackage.mjn;
import defpackage.mjo;
import defpackage.mjp;
import defpackage.mlp;
import defpackage.mlq;
import defpackage.mlr;
import defpackage.mls;
import defpackage.mlt;
import defpackage.mlv;
import defpackage.mma;
import defpackage.mmb;
import defpackage.mmk;
import defpackage.mmp;
import defpackage.mmv;
import defpackage.mpz;
import defpackage.mta;
import defpackage.mys;
import defpackage.myt;
import defpackage.myu;
import defpackage.nbt;
import defpackage.nqq;
import defpackage.pjr;
import defpackage.pjx;
import defpackage.pke;
import defpackage.pkg;
import defpackage.qtl;
import defpackage.rdd;
import defpackage.rmp;
import defpackage.rmr;
import defpackage.sdy;
import defpackage.thg;
import defpackage.trk;
import defpackage.tst;
import defpackage.vtw;
import defpackage.wnt;
import defpackage.woz;
import defpackage.wpl;
import defpackage.wpm;
import defpackage.xay;
import defpackage.xji;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DetailsActivity extends mij implements mjd {
    private static tst E = null;
    private static final String F = "com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity";
    public lfz A;
    public nqq B;
    public mta C;
    public gag D;
    private View G;
    private View H;
    private kri I;
    private mlv J;
    private boolean K = false;
    private lin L;
    public DetailsHeaderListLayout b;
    public boolean c;
    public boolean d;
    idr e;
    public lfn f;
    public lxj g;
    public lie h;
    public iea i;
    public iea j;
    public mab k;
    public mjl l;
    public iea m;
    public idy n;
    public idf o;
    public ieh p;
    public mac q;
    public mjo r;
    public pkg s;
    public ldv t;
    public xji u;
    public itk v;
    public pjx w;
    public jaf x;
    public ihg y;
    public lys z;

    public static /* synthetic */ void $r8$lambda$DNdiq2bsDX18t7MOK7U0JazV7KY(DetailsActivity detailsActivity, View view, View view2) {
        view.performClick();
        detailsActivity.x.c(view2);
    }

    private static Intent c(Context context, kwn kwnVar, String str, String str2, lid lidVar, Intent intent) {
        return createShowDetailsActivityIntent(context, kwnVar, str2, lidVar, intent).putExtra("season_id", ksy.k(str));
    }

    public static Intent createEpisodeIntent(Context context, kuo kuoVar, kuf kufVar, String str, lid lidVar, Intent intent) {
        return createEpisodeIntent(context, kuoVar, false, false, str, lidVar, intent).putExtra("distributor", kufVar);
    }

    public static Intent createMovieDetailsIntent(Context context, kvf kvfVar, ieg<kuf> iegVar, String str, lid lidVar, Intent intent) {
        return createMovieDetailsIntent(context, kvfVar, str, intent).putExtra("distributor", (Parcelable) iegVar.c).putExtra("parent_event_id", lidVar).putExtra("parent_intent", intent);
    }

    public static Intent createMoviesBundleDetailsIntent(Context context, kvj kvjVar, ieg<kuf> iegVar, String str, lid lidVar, Intent intent) {
        return createMoviesBundleDetailsIntent(context, kvjVar, str, intent).putExtra("distributor", (Parcelable) iegVar.c).putExtra("parent_event_id", lidVar).putExtra("parent_intent", intent);
    }

    public static Intent createSeasonIntent(Context context, kwl kwlVar, String str, lid lidVar, Intent intent) {
        return c(context, kwn.d(kwlVar.l), kwlVar.d.b, str, lidVar, intent).putExtra("parent_intent", intent);
    }

    public static Intent createShowDetailsActivityIntent(Context context, kwn kwnVar, String str, Intent intent) {
        rmr rmrVarA = rmr.a();
        lim limVar = lim.DETAILS_LATENCY_SHOW;
        rmrVarA.f(rmp.c(limVar));
        E = tst.i(limVar);
        return kgu.y(new Intent(context, (Class<?>) DetailsActivity.class), str).putExtra("show", kwnVar).putExtra("override_transition", true).putExtra("parent_intent", intent);
    }

    public static Intent createShowIntent(Context context, kwn kwnVar, ieg<kuf> iegVar, String str, lid lidVar, Intent intent) {
        return createShowDetailsActivityIntent(context, kwnVar, str, lidVar, intent).putExtra("distributor", (Parcelable) iegVar.c);
    }

    private final View d(View view) {
        if (view == null) {
            return null;
        }
        if (view.isAccessibilityFocused()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewD = d(viewGroup.getChildAt(i));
                if (viewD != null) {
                    return viewD;
                }
            }
        }
        return null;
    }

    @Override // defpackage.mjd
    public final lio a() {
        return this.L;
    }

    public final void b() {
        if (this.K) {
            View viewFindViewById = findViewById(R.id.primary_action);
            TextView textView = (TextView) findViewById(R.id.companion_watch_cta_text);
            MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = (MediaDeviceAwarePlayButton) findViewById(R.id.companion_watch_cta_play_icon);
            View viewFindViewById2 = findViewById(R.id.companion_watch_cta);
            if (viewFindViewById == null || textView == null || mediaDeviceAwarePlayButton == null || viewFindViewById2 == null) {
                return;
            }
            if (viewFindViewById2.getVisibility() != 0) {
                vtw vtwVarM = wpm.a.m();
                wpl wplVar = wpl.a;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wpm wpmVar = (wpm) vtwVarM.b;
                wplVar.getClass();
                wpmVar.g = wplVar;
                wpmVar.b |= 4;
                vtw vtwVarM2 = woz.a.m();
                vtwVarM2.aQ(wnt.a);
                woz wozVar = (woz) vtwVarM2.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wpm wpmVar2 = (wpm) vtwVarM.b;
                wozVar.getClass();
                wpmVar2.d = wozVar;
                wpmVar2.c = 4;
                wpm wpmVar3 = (wpm) vtwVarM.r();
                ith ithVarE = this.v.e();
                int i = 171507;
                if (ithVarE != null && ((iua) ithVarE).d) {
                    i = 171506;
                }
                this.x.a(viewFindViewById2, jbr.H(wpmVar3, null, null, null, Integer.valueOf(i)), new HashMap());
                mediaDeviceAwarePlayButton.a(new kkb(this.v, false, this.y.e(), false, null));
            }
            viewFindViewById2.setVisibility(0);
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setOnClickListener(new iuy(this, viewFindViewById, 11));
            ith ithVarE2 = this.v.e();
            if (ithVarE2 == null || ((iua) ithVarE2).d) {
                textView.setText(R.string.details_watch_now);
            } else {
                textView.setText(R.string.details_watch_on_tv);
            }
        }
    }

    @Override // defpackage.mij
    protected final void j() {
        setTheme(R.style.MoviesTheme);
    }

    @Override // defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        String str;
        ieg iegVar;
        ksy ksyVar;
        kri kriVarD;
        kri kriVar;
        byte b;
        int i;
        boolean z;
        bv mmpVar;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 29 || getResources().getConfiguration().orientation != 1) {
            cwn.c(getWindow(), true);
        } else {
            cwn.c(getWindow(), false);
            getWindow().setNavigationBarColor(0);
        }
        getOnBackPressedDispatcher().b(this, new mlp(this));
        if (getIntent().getBooleanExtra("override_transition", false)) {
            getIntent().removeExtra("override_transition");
            overridePendingTransition(R.anim.enter_details_details_activity_transition, R.anim.enter_details_parent_activity_transition);
        }
        Intent intent = getIntent();
        if (bundle != null) {
            this.c = bundle.getBoolean("did_start_downloading_receiver", false);
            this.d = bundle.getBoolean("did_add_pin_error_dialog_receiver", false);
        } else {
            this.c = false;
            this.d = false;
        }
        ieg iegVarA = ieg.a((kvf) intent.getParcelableExtra("movie"));
        ieg iegVarA2 = ieg.a((kwn) intent.getParcelableExtra("show"));
        ieg iegVarA3 = ieg.a((kvj) intent.getParcelableExtra("movie_bundle"));
        a.ab(((iegVarA.m() ? 1 : 0) + (iegVarA2.m() ? 1 : 0)) + (iegVarA3.m() ? 1 : 0) == 1);
        Intent intentT = (Intent) intent.getParcelableExtra("parent_intent");
        if (intentT == null) {
            intentT = jbr.T(this, new Intent());
        }
        Intent intent2 = intentT;
        ieg iegVarA4 = ieg.a((ksy) intent.getParcelableExtra("season_id"));
        int intExtra = intent.getIntExtra("distributor_selection_type", 0);
        ieg iegVarF = intExtra == 0 ? ieg.a : ieg.f(lam.b(intExtra));
        ieg iegVarA5 = ieg.a((kuf) intent.getParcelableExtra("distributor"));
        int intExtra2 = intent.getIntExtra("season_selection_location", 0);
        ieg iegVarF2 = intExtra2 == 0 ? ieg.a : ieg.f(lan.b(intExtra2));
        ksy ksyVarO = iegVarA.m() ? ((kvf) iegVarA.g()).o() : iegVarA2.m() ? ((kwn) iegVarA2.g()).d : ((kvj) iegVarA3.g()).a;
        String strA = kgu.A(intent);
        ieg iegVar2 = iegVarF;
        ieg iegVarG = ((ldy) this.m).a();
        ksy ksyVar2 = ksyVarO;
        this.L = lin.n(this.B, liq.e(true != iegVarA3.m() ? 310 : 334), lid.c((lid) intent.getParcelableExtra("parent_event_id")));
        if (this.f.cH() && this.u.a()) {
            pjr pjrVarB = ((pke) this.s.b).b(109768);
            ieg iegVarG2 = ((ldy) this.t.f()).a();
            pjrVarB.e(iegVarG2.m() ? rdd.Z(((ksn) iegVarG2.g()).a) : rdd.ab());
            vtw vtwVarM = nbt.a.m();
            str = "season_id";
            iegVar = iegVarA4;
            long jB = this.B.b();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            nbt nbtVar = (nbt) vtwVarM.b;
            nbtVar.b |= 1;
            nbtVar.c = jB;
            pjrVarB.e(qtl.ag((nbt) vtwVarM.r()));
            pjrVarB.c(this);
        } else {
            str = "season_id";
            iegVar = iegVarA4;
        }
        setTheme(R.style.Theme_GoogleTv_Dark);
        View viewInflate = getLayoutInflater().inflate(R.layout.details_frame_companion, (ViewGroup) null);
        this.H = viewInflate;
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = (MediaDeviceFloatingActionButton) viewInflate.findViewById(R.id.media_device_fab);
        mediaDeviceFloatingActionButton.e(this.v, this.D, this.w, this.y);
        this.x.a(mediaDeviceFloatingActionButton, jbr.E(166395, null), ImmutableMap.of());
        this.v.c().ea(new lll(this, 5, null));
        this.H.addOnAttachStateChangeListener(new bne(this, 6));
        this.b = (DetailsHeaderListLayout) this.H.findViewById(R.id.details_header_list_layout);
        b();
        this.b.setOnHierarchyChangeListener(new mlq(this, 3));
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.details_background, (ViewGroup) this.b, false);
        cr supportFragmentManager = getSupportFragmentManager();
        String str2 = F;
        if (supportFragmentManager.f(str2) == null) {
            if (iegVarA.m()) {
                kvf kvfVar = (kvf) iegVarA.g();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("movie", kvfVar);
                bundle2.putString("referrer", strA);
                bundle2.putParcelable("distributor", (Parcelable) iegVarA5.c);
                if (iegVar2.m()) {
                    bundle2.putInt("distributor_selection_type", ((lam) iegVar2.g()).a());
                }
                bundle2.putParcelable("parent_intent", intent2);
                mmpVar = new mmk();
                mmpVar.setArguments(bundle2);
            } else if (iegVarA2.m()) {
                kwn kwnVar = (kwn) iegVarA2.g();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("show", kwnVar);
                bundle3.putParcelable(str, (Parcelable) iegVar.c);
                bundle3.putParcelable("distributor", (Parcelable) iegVarA5.c);
                if (iegVar2.m()) {
                    bundle3.putInt("distributor_selection_type", ((lam) iegVar2.g()).a());
                }
                if (iegVarF2.m()) {
                    bundle3.putInt("season_selection_location", ((lan) iegVarF2.g()).a());
                }
                bundle3.putString("referrer", strA);
                bundle3.putParcelable("parent_intent", intent2);
                mmpVar = new mmv();
                mmpVar.setArguments(bundle3);
            } else {
                kvj kvjVar = (kvj) iegVarA3.g();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("movie_bundle", kvjVar);
                bundle4.putString("referrer", strA);
                bundle4.putParcelable("distributor", (Parcelable) iegVarA5.c);
                if (iegVar2.m()) {
                    bundle4.putInt("distributor_selection_type", ((lam) iegVar2.g()).a());
                }
                bundle4.putParcelable("parent_intent", intent2);
                mmpVar = new mmp();
                mmpVar.setArguments(bundle4);
            }
            at atVar = new at(getSupportFragmentManager());
            atVar.q(R.id.content_container, mmpVar, str2);
            atVar.a();
        }
        mmb mmbVar = new mmb(this, viewGroup);
        DetailsHeaderListLayout detailsHeaderListLayout = this.b;
        detailsHeaderListLayout.n(mmbVar);
        detailsHeaderListLayout.u(getDrawable(R.color.play_movies_action_bar_background));
        detailsHeaderListLayout.e = new mma(this, detailsHeaderListLayout);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.background_image);
        imageView.addOnLayoutChangeListener(sdy.a);
        kuw kuwVar = new kuw(imageView, detailsHeaderListLayout);
        setContentView(this.H);
        this.e = new idz(ieg.a);
        if (iegVarA.m()) {
            iea ieaVarD = this.g.d((kvf) iegVarA.g());
            ksyVar = ksyVar2;
            boolean z2 = ((kva) this.i.a()).b(ksyVar).b;
            kri[] kriVarArr = new kri[3];
            kriVarArr[0] = krv.d(ieaVarD, new mlr(this, this.e, kuwVar, 1));
            kriVarArr[1] = krv.c(ieaVarD, (z2 && intent.getBooleanExtra("start_download", false)) ? new mlt(this, this.C, this.m) : icz.a);
            kriVarArr[2] = krv.c(ieaVarD, (z2 && intent.getBooleanExtra("pinning_error_dialog", false)) ? new mls(this, this.i, this.j, this.m) : icz.a);
            kri kriVarC = ksa.c(kriVarArr);
            this.k.b(iegVarG, ksyVar.b, false);
            this.K = z2;
            kriVar = kriVarC;
        } else {
            ksyVar = ksyVar2;
            if (iegVarA2.m()) {
                kriVarD = krv.d(this.g.h((kwn) iegVarA2.g()), new mlr(this, this.e, kuwVar, 2));
                this.k.c(iegVarG, ksyVar.b, false);
            } else {
                kriVarD = krv.d(this.g.e((kvj) iegVarA3.g()), new mlr(this, this.e, kuwVar, 0));
                this.k.c(iegVarG, ksyVar.b, false);
            }
            kriVar = kriVarD;
        }
        cr supportFragmentManager2 = getSupportFragmentManager();
        iea ieaVar = this.m;
        iea ieaVar2 = this.j;
        iea ieaVar3 = this.i;
        idr idrVar = this.e;
        mab mabVar = this.k;
        mjp mjpVar = new mjp();
        mta mtaVar = this.C;
        lie lieVar = this.h;
        if (iegVarA.m() && this.f.bK()) {
            b = 2;
            i = 3;
            z = true;
        } else {
            b = 2;
            i = 3;
            z = false;
        }
        mlv mlvVar = new mlv(this, supportFragmentManager2, kuwVar, ieaVar, ieaVar2, ieaVar3, idrVar, mabVar, mjpVar, mtaVar, lieVar, intent2, ksyVar, z);
        this.J = mlvVar;
        kri[] kriVarArr2 = new kri[4];
        kriVarArr2[0] = mlvVar;
        Object obj = kuwVar.b;
        lfz lfzVar = this.A;
        lys lysVar = this.z;
        iea ieaVar4 = this.m;
        ids[] idsVarArr = new ids[i];
        idsVarArr[0] = lysVar;
        idsVarArr[1] = lfzVar.c();
        idsVarArr[b] = ieaVar4;
        kriVarArr2[1] = new mix(this, (PlayHeaderListLayout) obj, lfzVar, lysVar, ieaVar4, hjt.d(idsVarArr));
        kriVarArr2[b] = krv.c(new idz(ksyVar), this.q);
        kriVarArr2[i] = kriVar;
        this.I = ksa.c(kriVarArr2);
        this.C.d(this, ((ldy) this.m).a(), this.h);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        mlv mlvVar = this.J;
        MenuInflater menuInflater = getMenuInflater();
        boolean zCL = this.f.cL();
        menuInflater.inflate(R.menu.movie_details_menu, menu);
        if (!zCL) {
            menuInflater.inflate(R.menu.search_menu, menu);
            PlaySearchToolbar playSearchToolbar = (PlaySearchToolbar) ((PlayHeaderListLayout) mlvVar.n.b).b;
            if (playSearchToolbar != null && menu.findItem(R.id.menu_search) != null) {
                MenuItem menuItemFindItem = menu.findItem(R.id.menu_search);
                View actionView = menuItemFindItem.getActionView();
                if (playSearchToolbar.d == null && actionView != null && !(actionView instanceof PlaySearch)) {
                    playSearchToolbar.d = actionView;
                }
                MenuItem menuItem = playSearchToolbar.g;
                if (menuItem != null) {
                    cwk.h(menuItem, null);
                    cwk.i(playSearchToolbar.g, null);
                }
                if (menuItemFindItem != null) {
                    if (playSearchToolbar.f == null) {
                        playSearchToolbar.f = new thg(playSearchToolbar, playSearchToolbar.getContext());
                    }
                    cwk.h(menuItemFindItem, playSearchToolbar.f);
                    cwk.i(menuItemFindItem, playSearchToolbar);
                    if (playSearchToolbar.i == R.id.menu_search && !playSearchToolbar.hasExpandedActionView()) {
                        menuItemFindItem.expandActionView();
                    }
                }
                playSearchToolbar.g = menuItemFindItem;
            }
        }
        mjn mjnVar = mlvVar.h;
        return true;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ith ithVarE = this.v.e();
        if (ithVarE == null || ((iua) ithVarE).d) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            ithVarE.f();
            return true;
        }
        if (i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        ithVarE.e();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        final mlv mlvVar = this.J;
        final ieg iegVarG = ((ldy) mlvVar.c).a();
        kuk kukVar = (kuk) mlvVar.d.a();
        ksy ksyVar = mlvVar.k;
        kuj kujVarA = kukVar.a(ksyVar);
        boolean zC = mlv.c((kva) mlvVar.e.a(), ksyVar);
        boolean zG = kujVarA.g();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_download) {
            if (zC && !zG) {
                mlvVar.m.c(mlvVar.a, mlvVar.b, (ksn) iegVarG.g(), ksyVar);
                mlvVar.i.G(true);
            }
        } else if (itemId == R.id.menu_remove_download) {
            if (zC && zG) {
                ieg iegVar = (ieg) mlvVar.f.a();
                if (!iegVar.k()) {
                    mta mtaVar = mlvVar.m;
                    by byVar = mlvVar.a;
                    cr crVar = mlvVar.b;
                    lie lieVar = mlvVar.i;
                    mta.g(byVar, crVar, ksyVar, (String) iegVar.g(), null, kujVarA);
                    lieVar.ai(ksyVar, true);
                }
            }
        } else if (itemId == R.id.menu_remove_from_device) {
            if (zC) {
                ieg iegVar2 = (ieg) mlvVar.f.a();
                if (!iegVar2.k()) {
                    final boolean z = ksyVar.n() == xay.SHOW;
                    kff.o(mlvVar.a, myt.class, new lhg() { // from class: mlu
                        @Override // defpackage.lhg
                        public final void a(lhf lhfVar) {
                            boolean z2 = z;
                            ieg iegVar3 = iegVarG;
                            mlv mlvVar2 = mlvVar;
                            if (z2) {
                                mlvVar2.g.c(iegVar3, mlvVar2.k.b, true);
                            } else {
                                mlvVar2.g.b(iegVar3, mlvVar2.k.b, true);
                            }
                            mlvVar2.a.finish();
                        }
                    });
                    mys mysVar = new mys(z, (String) iegVar2.g());
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("remove_item_dialog_view_model", mysVar);
                    myu myuVar = new myu();
                    myuVar.setArguments(bundle);
                    myuVar.show(mlvVar.b, "remove item dialog");
                    mlvVar.i.ad(ksyVar.b, ksyVar.n());
                }
            }
        } else {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            by byVar2 = mlvVar.a;
            if (byVar2.getSupportFragmentManager().a() > 0) {
                byVar2.getSupportFragmentManager().M();
            } else {
                byVar2.navigateUpTo(mlvVar.j);
                byVar2.overridePendingTransition(R.anim.exit_details_parent_activity_transition, R.anim.exit_details_details_activity_transition);
            }
        }
        return true;
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        this.G = d(this.H);
        super.onPause();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        mlv mlvVar = this.J;
        kva kvaVar = (kva) mlvVar.e.a();
        ksy ksyVar = mlvVar.k;
        boolean zC = mlv.c(kvaVar, ksyVar);
        boolean zG = ((kuk) mlvVar.d.a()).a(ksyVar).g();
        boolean z = false;
        mjo.t(menu, R.id.menu_download, zC && mlvVar.l && !zG);
        if (zC && mlvVar.l && zG) {
            z = true;
        }
        mjo.t(menu, R.id.menu_remove_download, z);
        mjo.t(menu, R.id.menu_remove_from_device, zC);
        return true;
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        int i = 1;
        if (this.G != null) {
            ksk.h(new mpz(this, i), 1000L);
        }
        this.L.j();
        this.L.h(true ^ this.u.a());
        tst tstVar = E;
        if (tstVar != null && tstVar.g()) {
            rmr rmrVarA = rmr.a();
            rmrVarA.a.i(rmp.c((Enum) E.c()));
            E = trk.a;
        }
        if (((ieg) this.e.a()).m()) {
            setTitle((CharSequence) ((ieg) this.e.a()).g());
        }
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("did_start_downloading_receiver", this.c);
        bundle.putBoolean("did_add_pin_error_dialog_receiver", this.d);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.I.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        this.L.f();
        this.I.b();
        super.onStop();
    }

    public static Intent createEpisodeIntent(Context context, kuo kuoVar, String str, lid lidVar, Intent intent) {
        return createEpisodeIntent(context, kuoVar, false, false, str, lidVar, intent).putExtra("parent_intent", intent);
    }

    public static Intent createShowIntent(Context context, kwn kwnVar, lao laoVar, String str, lid lidVar, Intent intent) {
        ieg iegVarF;
        lal lalVar = laoVar.e;
        if (lalVar == null) {
            lalVar = lal.a;
        }
        if (!lalVar.b.isEmpty()) {
            lal lalVar2 = laoVar.e;
            if (lalVar2 == null) {
                lalVar2 = lal.a;
            }
            String str2 = lalVar2.b;
            kuf kufVar = kuf.a;
            iegVarF = ieg.f(new ktn(str2));
        } else {
            iegVarF = ieg.a;
        }
        lam lamVarB = lam.b(laoVar.d);
        if (lamVarB == null) {
            lamVarB = lam.UNRECOGNIZED;
        }
        lan lanVarB = lan.b(laoVar.c);
        if (lanVarB == null) {
            lanVarB = lan.UNRECOGNIZED;
        }
        return createShowDetailsActivityIntent(context, kwnVar, str, lidVar, intent).putExtra("distributor", (Parcelable) iegVarF.c).putExtra("distributor_selection_type", lamVarB.a()).putExtra("season_selection_location", lanVarB.a());
    }

    public static Intent createEpisodeIntent(Context context, kuo kuoVar, boolean z, boolean z2, String str, lid lidVar, Intent intent) {
        return c(context, kwn.d(ksy.l(kuoVar.k)), kuoVar.j, str, lidVar, intent).putExtra("episode_id", ksy.h(kuoVar.c.b)).putExtra("start_download", z).putExtra("pinning_error_dialog", z2);
    }

    public static Intent createMovieDetailsIntent(Context context, kvf kvfVar, lao laoVar, String str, lid lidVar, Intent intent) {
        ieg iegVarF;
        lal lalVar = laoVar.e;
        if (lalVar == null) {
            lalVar = lal.a;
        }
        if (!lalVar.b.isEmpty()) {
            lal lalVar2 = laoVar.e;
            if (lalVar2 == null) {
                lalVar2 = lal.a;
            }
            String str2 = lalVar2.b;
            kuf kufVar = kuf.a;
            iegVarF = ieg.f(new ktn(str2));
        } else {
            iegVarF = ieg.a;
        }
        lam lamVarB = lam.b(laoVar.d);
        if (lamVarB == null) {
            lamVarB = lam.UNRECOGNIZED;
        }
        return createMovieDetailsIntent(context, kvfVar, str, intent).putExtra("distributor", (Parcelable) iegVarF.c).putExtra("distributor_selection_type", lamVarB.a()).putExtra("parent_event_id", lidVar).putExtra("parent_intent", intent);
    }

    public static Intent createMoviesBundleDetailsIntent(Context context, kvj kvjVar, lao laoVar, String str, lid lidVar, Intent intent) {
        ieg iegVarF;
        lal lalVar = laoVar.e;
        if (lalVar == null) {
            lalVar = lal.a;
        }
        String str2 = lalVar.b;
        if (!str2.isEmpty()) {
            kuf kufVar = kuf.a;
            iegVarF = ieg.f(new ktn(str2));
        } else {
            iegVarF = ieg.a;
        }
        lam lamVarB = lam.b(laoVar.d);
        if (lamVarB == null) {
            lamVarB = lam.UNRECOGNIZED;
        }
        return createMoviesBundleDetailsIntent(context, kvjVar, str, intent).putExtra("distributor", (Parcelable) iegVarF.c).putExtra("distributor_selection_type", lamVarB.a()).putExtra("parent_event_id", lidVar).putExtra("parent_intent", intent);
    }

    public static Intent createShowDetailsActivityIntent(Context context, kwn kwnVar, String str, lid lidVar, Intent intent) {
        return createShowDetailsActivityIntent(context, kwnVar, str, intent).putExtra("parent_event_id", lidVar);
    }

    public static Intent createShowIntent(Context context, kwn kwnVar, String str, lid lidVar, Intent intent, ieg<lao> iegVar) {
        if (iegVar.m()) {
            return createShowIntent(context, kwnVar, (lao) iegVar.g(), str, lidVar, intent);
        }
        return createShowIntent(context, kwnVar, (ieg<kuf>) ieg.a, str, lidVar, intent);
    }

    public static Intent createMoviesBundleDetailsIntent(Context context, kvj kvjVar, String str, Intent intent) {
        rmr rmrVarA = rmr.a();
        lim limVar = lim.DETAILS_LATENCY_MOVIE_BUNDLE;
        rmrVarA.f(rmp.c(limVar));
        E = tst.i(limVar);
        return kgu.y(new Intent(context, (Class<?>) DetailsActivity.class), str).putExtra("movie_bundle", kvjVar).putExtra("override_transition", true).putExtra("parent_intent", intent);
    }

    public static Intent createMovieDetailsIntent(Context context, kvf kvfVar, String str, Intent intent) {
        rmr rmrVarA = rmr.a();
        lim limVar = lim.DETAILS_LATENCY_MOVIE;
        rmrVarA.f(rmp.c(limVar));
        E = tst.i(limVar);
        return kgu.y(new Intent(context, (Class<?>) DetailsActivity.class), str).putExtra("movie", kvfVar).putExtra("override_transition", true).putExtra("parent_intent", intent);
    }

    public static Intent createMovieDetailsIntent(Context context, kvf kvfVar, String str, lid lidVar, Intent intent, ieg<lao> iegVar) {
        if (iegVar.m()) {
            return createMovieDetailsIntent(context, kvfVar, (lao) iegVar.g(), str, lidVar, intent);
        }
        return createMovieDetailsIntent(context, kvfVar, (ieg<kuf>) ieg.a, str, lidVar, intent);
    }

    public static Intent createMoviesBundleDetailsIntent(Context context, kvj kvjVar, String str, lid lidVar, Intent intent) {
        rmr rmrVarA = rmr.a();
        lim limVar = lim.DETAILS_LATENCY_MOVIE_BUNDLE;
        rmrVarA.f(rmp.c(limVar));
        E = tst.i(limVar);
        return kgu.y(new Intent(context, (Class<?>) DetailsActivity.class), str).putExtra("movie_bundle", kvjVar).putExtra("override_transition", true).putExtra("parent_intent", intent).putExtra("parent_event_id", lidVar);
    }

    public static Intent createMovieDetailsIntent(Context context, kvf kvfVar, String str, boolean z, boolean z2, lid lidVar, Intent intent) {
        return createMovieDetailsIntent(context, kvfVar, (ieg<kuf>) ieg.a, str, lidVar, intent).putExtra("start_download", z).putExtra("pinning_error_dialog", z2);
    }

    public static Intent createMoviesBundleDetailsIntent(Context context, kvj kvjVar, String str, lid lidVar, Intent intent, ieg<lao> iegVar) {
        if (iegVar.m()) {
            return createMoviesBundleDetailsIntent(context, kvjVar, (lao) iegVar.g(), str, lidVar, intent);
        }
        return createMoviesBundleDetailsIntent(context, kvjVar, str, lidVar, intent);
    }
}
