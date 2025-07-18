package com.google.android.apps.play.movies.common.presenter.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.ieg;
import defpackage.jbj;
import defpackage.kgu;
import defpackage.kqc;
import defpackage.ksh;
import defpackage.ksn;
import defpackage.ldv;
import defpackage.lid;
import defpackage.lkt;
import defpackage.xbz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TrailerLauncherActivity extends xbz {
    public ldv a;
    public lkt b;

    @Override // defpackage.xbz, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (GmsErrorActivity.startIfNecessary(this)) {
            finish();
            return;
        }
        Intent intent = getIntent();
        lkt lktVar = this.b;
        String strD = kgu.D(intent);
        ieg iegVar = ieg.a;
        lid lidVarB = lktVar.b(strD, iegVar, iegVar);
        Uri data = intent.getData();
        List<String> pathSegments = data == null ? null : data.getPathSegments();
        if (pathSegments != null && !pathSegments.isEmpty()) {
            String str = pathSegments.get(0);
            if ("trailers".equals(str) || "watch".equals(str)) {
                ksn.a(intent.getStringExtra("authAccount")).o(new jbj(this, 10));
                String queryParameter = data.getQueryParameter("v");
                String strD2 = ksh.d(intent.getStringExtra("pv"));
                data.getQueryParameter("mid");
                ((kqc) getApplication()).b().j(this, queryParameter, strD2, "trailer_launcher", false, lidVarB);
            }
        }
        finish();
    }
}
