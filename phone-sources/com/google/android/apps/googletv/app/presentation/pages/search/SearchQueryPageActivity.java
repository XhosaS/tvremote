package com.google.android.apps.googletv.app.presentation.pages.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.ctk;
import defpackage.cxe;
import defpackage.idy;
import defpackage.iea;
import defpackage.ieg;
import defpackage.iej;
import defpackage.jan;
import defpackage.jbr;
import defpackage.jeh;
import defpackage.jej;
import defpackage.jlr;
import defpackage.jti;
import defpackage.jtl;
import defpackage.jxs;
import defpackage.jzm;
import defpackage.kal;
import defpackage.keg;
import defpackage.kej;
import defpackage.kek;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.mjo;
import defpackage.mta;
import defpackage.mtr;
import defpackage.opz;
import defpackage.osk;
import defpackage.rtx;
import defpackage.sfy;
import defpackage.sip;
import defpackage.syp;
import defpackage.yft;
import defpackage.yga;
import defpackage.ygi;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;
import defpackage.ylh;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SearchQueryPageActivity extends jxs implements kek, jeh, iej {
    public jti a;
    public iea b;
    public ldv c;
    public idy d;
    public mta e;
    private final yft f;
    private kej g;
    private mtr h;
    private ieg i;
    private final yft j;
    private final yft k;

    /* renamed from: $r8$lambda$-6kugsa3yByJB1MEmL6PraFzuKY, reason: not valid java name */
    public static /* synthetic */ ygi m123$r8$lambda$6kugsa3yByJB1MEmL6PraFzuKY(SearchQueryPageActivity searchQueryPageActivity) {
        jti jtiVar = searchQueryPageActivity.a;
        if (jtiVar == null) {
            yks.c("searchSuggestionsPresenter");
            jtiVar = null;
        }
        jtl jtlVar = (jtl) jtiVar.l(searchQueryPageActivity.b().a());
        View viewFindViewById = searchQueryPageActivity.findViewById(R.id.search_suggestions_view);
        viewFindViewById.getClass();
        sfy.m(searchQueryPageActivity, viewFindViewById).a(jtlVar);
        return ygi.a;
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool $r8$lambda$7x0lK22bZZaTnnRJGUpukRfSIOs() {
        return new RecyclerView.RecycledViewPool();
    }

    public static /* synthetic */ OpenSearchView $r8$lambda$EkqdsYarMiZVEkLImqPboXelELE(SearchQueryPageActivity searchQueryPageActivity) {
        return (OpenSearchView) searchQueryPageActivity.findViewById(R.id.toolbar_search_view);
    }

    public static /* synthetic */ boolean $r8$lambda$vNxezMWm4gMuR149Zb2FLYmgga8(SearchQueryPageActivity searchQueryPageActivity, OpenSearchView openSearchView, TextView textView, int i, KeyEvent keyEvent) {
        if (!yks.e(searchQueryPageActivity.b().a, searchQueryPageActivity.b().b)) {
            searchQueryPageActivity.h(openSearchView);
            return true;
        }
        if (searchQueryPageActivity.b().a.length() <= 0) {
            return true;
        }
        searchQueryPageActivity.finish();
        return true;
    }

    public SearchQueryPageActivity() {
        int i = ylg.a;
        this.f = new jej(new ykl(keg.class), new bck(this, 13), this);
        this.j = new yga(new kal(this, 15));
        rtx.a.c();
        this.k = new yga(new jzm(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final keg b() {
        return (keg) this.f.a();
    }

    private final OpenSearchView c() {
        Object objA = this.j.a();
        objA.getClass();
        return (OpenSearchView) objA;
    }

    private final void e() {
        final OpenSearchView openSearchViewC = c();
        openSearchViewC.findViewById(R.id.open_search_view_background).setBackground(null);
        openSearchViewC.j(b().b);
        EditText editText = openSearchViewC.k;
        editText.setSelection(b().b.length());
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: kef
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchQueryPageActivity.$r8$lambda$vNxezMWm4gMuR149Zb2FLYmgga8(this.a, openSearchViewC, textView, i, keyEvent);
                return true;
            }
        });
        editText.getClass();
        editText.addTextChangedListener(new syp(this, 1));
        if (ctk.c()) {
            try {
                editText.setIsHandwritingDelegate(true);
            } catch (LinkageError unused) {
            }
        }
        openSearchViewC.l(true);
        openSearchViewC.h(false);
        openSearchViewC.postDelayed(new jlr(openSearchViewC, 7), 100L);
    }

    private final void h(OpenSearchView openSearchView) {
        openSearchView.d();
        String string = openSearchView.c().toString();
        Editable editableC = openSearchView.c();
        editableC.getClass();
        if (ylh.L(editableC)) {
            return;
        }
        mta mtaVar = this.e;
        if (mtaVar == null) {
            yks.c("searchSuggestionsStore");
            mtaVar = null;
        }
        mtaVar.p(string);
        D();
        jan.j(this, string, "");
        finish();
    }

    public final iea a() {
        iea ieaVar = this.b;
        if (ieaVar != null) {
            return ieaVar;
        }
        yks.c("accountRepository");
        return null;
    }

    @Override // defpackage.iej
    public final void dM() {
        mtr mtrVar = this.h;
        ieg iegVar = null;
        if (mtrVar == null) {
            yks.c("syncHelper");
            mtrVar = null;
        }
        int iA = mtrVar.a();
        if (iA == 5) {
            finish();
            return;
        }
        if (iA != 2 && iA != 1 && iA != 8 && iA != 6) {
            ieg iegVar2 = this.i;
            if (iegVar2 == null) {
                yks.c("selectedAccount");
                iegVar2 = null;
            }
            if (iegVar2.k()) {
                mtr mtrVar2 = this.h;
                if (mtrVar2 == null) {
                    yks.c("syncHelper");
                    mtrVar2 = null;
                }
                mtrVar2.c();
            }
        }
        invalidateOptionsMenu();
        ieg iegVar3 = this.i;
        if (iegVar3 == null) {
            yks.c("selectedAccount");
        } else {
            iegVar = iegVar3;
        }
        if (iegVar.l() && ((ldy) a()).a().m()) {
            this.i = ((ldy) a()).a();
        }
    }

    @Override // defpackage.jeh
    public final RecyclerView.RecycledViewPool g() {
        return (RecyclerView.RecycledViewPool) this.k.a();
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mtr mtrVar = this.h;
        if (mtrVar == null) {
            yks.c("syncHelper");
            mtrVar = null;
        }
        mtrVar.f(i, i2, intent);
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ConcurrentHashMap concurrentHashMap = opz.a;
            osk.l(this, getIntent());
        }
        x().e(this, jbr.L(160862, (String) b().c.a(), 6));
        if (y().cJ()) {
            if (v().e()) {
                setTheme(R.style.Theme_GoogleTvGM3ExpressiveLight);
            } else {
                setTheme(R.style.Theme_GoogleTv_Light);
            }
            new cxe(getWindow(), getWindow().getDecorView()).i(true);
        } else if (v().e()) {
            setTheme(R.style.Theme_GoogleTvGM3ExpressiveDark);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.search_query_activity_layout);
        OpenSearchView openSearchView = (OpenSearchView) findViewById(R.id.toolbar_search_view);
        if (openSearchView != null) {
            openSearchView.r = true;
            openSearchView.i(false);
        }
        getWindow().getDecorView().getRootView().setBackgroundColor(sip.d(this, android.R.attr.colorBackground, -16777216));
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(sip.d(this, android.R.attr.statusBarColor, -16777216));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setNavigationBarColor(0);
        }
        setSupportActionBar(c().g);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
        }
        e();
        this.i = ((ldy) a()).a();
        ldv ldvVar = this.c;
        kej kejVar = null;
        if (ldvVar == null) {
            yks.c("accountManagerWrapper");
            ldvVar = null;
        }
        ieg iegVar = this.i;
        if (iegVar == null) {
            yks.c("selectedAccount");
            iegVar = null;
        }
        idy idyVar = this.d;
        if (idyVar == null) {
            yks.c("fullPurchaseAccountSyncScheduler");
            idyVar = null;
        }
        mtr mtrVar = new mtr(this, ldvVar, iegVar, idyVar);
        this.h = mtrVar;
        mtrVar.ea(this);
        this.g = new kej(this, this);
        if (getIntent().getBooleanExtra("open_voice_search", false)) {
            kej kejVar2 = this.g;
            if (kejVar2 == null) {
                yks.c("voiceSearchController");
            } else {
                kejVar = kejVar2;
            }
            kejVar.b();
        }
        sfy.q(this, new kal(this, 14));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.open_search_query_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        mtr mtrVar = this.h;
        kej kejVar = null;
        if (mtrVar == null) {
            yks.c("syncHelper");
            mtrVar = null;
        }
        mtrVar.ee(this);
        kej kejVar2 = this.g;
        if (kejVar2 == null) {
            yks.c("voiceSearchController");
        } else {
            kejVar = kejVar2;
        }
        kejVar.a();
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        mtr mtrVar = this.h;
        if (mtrVar == null) {
            yks.c("syncHelper");
            mtrVar = null;
        }
        mtrVar.b();
        setIntent(intent);
        ConcurrentHashMap concurrentHashMap = opz.a;
        osk.l(this, intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
        } else if (itemId == R.id.voice_search_menu_item) {
            kej kejVar = this.g;
            if (kejVar == null) {
                yks.c("voiceSearchController");
                kejVar = null;
            }
            kejVar.b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        super.onPrepareOptionsMenu(menu);
        kej kejVar = this.g;
        if (kejVar == null) {
            yks.c("voiceSearchController");
            kejVar = null;
        }
        mjo.t(menu, R.id.voice_search_menu_item, kejVar.c());
        return true;
    }

    @Override // defpackage.jxs, defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        mtr mtrVar = this.h;
        mtr mtrVar2 = null;
        if (mtrVar == null) {
            yks.c("syncHelper");
            mtrVar = null;
        }
        int iA = mtrVar.a();
        if (iA == 0 || iA == 8) {
            mtr mtrVar3 = this.h;
            if (mtrVar3 == null) {
                yks.c("syncHelper");
            } else {
                mtrVar2 = mtrVar3;
            }
            mtrVar2.c();
        }
        c().h(false);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        mtr mtrVar = null;
        if (isFinishing()) {
            mtr mtrVar2 = this.h;
            if (mtrVar2 == null) {
                yks.c("syncHelper");
            } else {
                mtrVar = mtrVar2;
            }
            mtrVar.e();
            return;
        }
        mtr mtrVar3 = this.h;
        if (mtrVar3 == null) {
            yks.c("syncHelper");
        } else {
            mtrVar = mtrVar3;
        }
        mtrVar.d();
    }

    @Override // defpackage.kek
    public final void t(String str) {
        if (isFinishing()) {
            return;
        }
        OpenSearchView openSearchViewC = c();
        openSearchViewC.j(str);
        h(openSearchViewC);
    }

    public static /* synthetic */ void getFullPurchaseAccountSyncScheduler$annotations() {
    }
}
