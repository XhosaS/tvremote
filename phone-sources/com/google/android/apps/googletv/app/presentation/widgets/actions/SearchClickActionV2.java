package com.google.android.apps.googletv.app.presentation.widgets.actions;

import android.content.Context;
import android.content.Intent;
import defpackage.dmy;
import defpackage.opz;
import defpackage.oqe;
import defpackage.osk;
import defpackage.ygi;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SearchClickActionV2 implements dmy {
    @Override // defpackage.dmy
    public final Object a(Context context) {
        ConcurrentHashMap concurrentHashMap = opz.a;
        Intent intentPutExtra = new Intent("com.google.android.apps.googletv.ACTION_SEARCH_PAGE_V2").setPackage(context.getPackageName()).addFlags(268468224).putExtra("referrer", "widget_referrer");
        intentPutExtra.getClass();
        osk.k(intentPutExtra, oqe.y, "searchButton");
        context.startActivity(intentPutExtra);
        return ygi.a;
    }
}
