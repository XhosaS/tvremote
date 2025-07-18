package com.google.android.apps.googletv.app.presentation.pages.preferences;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.videos.R;
import defpackage.by;
import defpackage.dvb;
import defpackage.hju;
import defpackage.idr;
import defpackage.idz;
import defpackage.iom;
import defpackage.isi;
import defpackage.jxs;
import defpackage.kbl;
import defpackage.kcz;
import defpackage.kdb;
import defpackage.kde;
import defpackage.kdh;
import defpackage.kdj;
import defpackage.sfy;
import defpackage.vtw;
import defpackage.wcq;
import defpackage.wnl;
import defpackage.yfm;
import defpackage.ygi;
import defpackage.yhb;
import defpackage.yih;
import defpackage.ykr;
import defpackage.yks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NotificationPreferencesActivity extends jxs {
    public kcz a;
    public iom b;
    public isi c;
    public kdh d;
    private final Map e = new LinkedHashMap();
    private final idr f = new idz(yhb.a);

    /* renamed from: $r8$lambda$95Lg53scIOO7B-aQr9yT2TdWHno, reason: not valid java name */
    public static /* synthetic */ ygi m122$r8$lambda$95Lg53scIOO7BaQr9yT2TdWHno(NotificationPreferencesActivity notificationPreferencesActivity, ProgressBar progressBar) {
        Object objA = notificationPreferencesActivity.f.a();
        objA.getClass();
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(yfm.z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((kdb) notificationPreferencesActivity.a().l((kdj) it.next()));
        }
        by byVarF = hju.F(notificationPreferencesActivity);
        byVarF.getClass();
        View viewFindViewById = notificationPreferencesActivity.findViewById(R.id.notification_preference_items);
        viewFindViewById.getClass();
        sfy.k(byVarF, (RecyclerView) viewFindViewById).a(arrayList);
        progressBar.setVisibility(8);
        return ygi.a;
    }

    public final kcz a() {
        kcz kczVar = this.a;
        if (kczVar != null) {
            return kczVar;
        }
        yks.c("notificationPreferencePresenter");
        return null;
    }

    public final iom b() {
        iom iomVar = this.b;
        if (iomVar != null) {
            return iomVar;
        }
        yks.c("communicationPreferenceStore");
        return null;
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (y().cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.notification_preference_activity_layout);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
            supportActionBar.setTitle(getResources().getString(R.string.notification_settings_entry_string));
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.loading_progress_bar);
        this.f.ea(new kde(this, progressBar, 0));
        ykr.q(dvb.d(this), null, 0, new kbl(this, progressBar, (yih) null, 3), 3);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        Boolean bool;
        super.onDestroy();
        Map map = this.e;
        Set<String> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(yfm.z(setKeySet, 10));
        for (String str : setKeySet) {
            idr idrVar = (idr) map.get(str);
            boolean zBooleanValue = false;
            if (idrVar != null && (bool = (Boolean) idrVar.a()) != null) {
                zBooleanValue = bool.booleanValue();
            }
            vtw vtwVarM = wnl.a.m();
            vtwVarM.getClass();
            wcq.J(str, vtwVarM);
            wcq.K(true != zBooleanValue ? 4 : 3, vtwVarM);
            arrayList.add(wcq.I(vtwVarM));
        }
        iom iomVarB = b();
        isi isiVar = this.c;
        if (isiVar == null) {
            yks.c("userSettingsStore");
            isiVar = null;
        }
        iomVarB.b(arrayList, !isiVar.i.c);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
