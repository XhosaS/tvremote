package com.google.android.apps.googletv.app.presentation.pages.search.v2;

import android.os.Bundle;
import defpackage.azg;
import defpackage.bck;
import defpackage.bhq;
import defpackage.ge;
import defpackage.irc;
import defpackage.jan;
import defpackage.jbr;
import defpackage.jej;
import defpackage.jxs;
import defpackage.kej;
import defpackage.kek;
import defpackage.kff;
import defpackage.kfh;
import defpackage.kuw;
import defpackage.opz;
import defpackage.osk;
import defpackage.rtx;
import defpackage.tug;
import defpackage.tui;
import defpackage.tvo;
import defpackage.yft;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchQueryPageActivity extends jxs implements kek {
    protected kej a;
    public kuw b;
    public irc c;
    private final yft e;
    public static final kff Companion = new kff();
    public static final int $stable = 8;
    private static final tui d = tui.l("com/google/android/apps/googletv/app/presentation/pages/search/v2/SearchQueryPageActivity");

    public SearchQueryPageActivity() {
        int i = ylg.a;
        this.e = new jej(new ykl(kfh.class), new bck(this, 15), this);
        rtx.a.c();
    }

    public static /* synthetic */ void submitSearchQuery$default(SearchQueryPageActivity searchQueryPageActivity, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitSearchQuery");
        }
        searchQueryPageActivity.c(str, z | (!((i & 2) == 0)));
    }

    public final kej a() {
        kej kejVar = this.a;
        if (kejVar != null) {
            return kejVar;
        }
        yks.c("voiceSearchController");
        return null;
    }

    public final kfh b() {
        return (kfh) this.e.a();
    }

    public final void c(String str, boolean z) {
        str.getClass();
        if (z) {
            b().c(str);
        }
        D();
        jan.j(this, str, "");
        finish();
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((tug) d.b().h(tvo.a, "GTVM-SearchQuery").j("com/google/android/apps/googletv/app/presentation/pages/search/v2/SearchQueryPageActivity", "onCreate", 49, "SearchQueryPageActivity.kt")).s("OnCreate Called");
        this.a = new kej(this, this);
        if (bundle == null) {
            ConcurrentHashMap concurrentHashMap = opz.a;
            osk.l(this, getIntent());
        }
        x().e(this, jbr.L(160862, (String) b().f.a(), 6));
        ge.a(this, new bhq(1925977819, true, new azg(this, 16)));
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ((tug) d.b().h(tvo.a, "GTVM-SearchQuery").j("com/google/android/apps/googletv/app/presentation/pages/search/v2/SearchQueryPageActivity", "onDestroy", 75, "SearchQueryPageActivity.kt")).s("onDestroy: Called");
        a().a();
    }

    @Override // defpackage.kek
    public final void t(String str) {
        submitSearchQuery$default(this, str, false, 2, null);
    }
}
