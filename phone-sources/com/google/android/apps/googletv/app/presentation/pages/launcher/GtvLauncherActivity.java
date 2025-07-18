package com.google.android.apps.googletv.app.presentation.pages.launcher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.google.android.videos.R;
import defpackage.ajo;
import defpackage.cxe;
import defpackage.gag;
import defpackage.irc;
import defpackage.jbr;
import defpackage.krd;
import defpackage.lfn;
import defpackage.lie;
import defpackage.xbw;
import defpackage.xcf;
import defpackage.xij;
import defpackage.xil;
import defpackage.yih;
import defpackage.ykr;
import defpackage.yks;
import defpackage.yoz;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GtvLauncherActivity extends xcf {

    @Deprecated
    public static final String DEEPLINK_SEARCH_SUBDOMAIN = "search/";

    @Deprecated
    public static final String GTV_APP_DEEPLINK_DOMAIN = "https://tv.google.com/";

    @Deprecated
    public static final String GTV_APP_VIRTUAL_REMOTE_DEEPLINK = "https://tv.google.com/on-app/open-remote";

    @Deprecated
    public static final String ON_APP_PATH_SEGMENT = "on-app";

    @Deprecated
    public static final String OPEN_REMOTE_PATH_SEGMENT = "open-remote";
    public xbw a;
    public lie b;
    public lfn c;
    public xil d;
    public xij e;
    public irc f;
    public irc g;
    public gag h;
    private ProgressBar i;

    public final lie a() {
        lie lieVar = this.b;
        if (lieVar != null) {
            return lieVar;
        }
        yks.c("eventLogger");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [idr, java.lang.Object] */
    public final void b(String str, Bundle bundle) {
        xil xilVar = this.d;
        if (xilVar == null) {
            yks.c("deeplinkLoggingFeatureFlags");
            xilVar = null;
        }
        if (xilVar.a()) {
            a().n(str);
        }
        gag gagVar = this.h;
        if (gagVar == null) {
            yks.c("mediaDeviceUiController");
            gagVar = null;
        }
        gagVar.e.c(false);
        xij xijVar = this.e;
        if (xijVar == null) {
            yks.c("deeplinkFeatureFlags");
            xijVar = null;
        }
        if (xijVar.a()) {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            if (pathSegments.size() == 2 && yks.e(pathSegments.get(0), ON_APP_PATH_SEGMENT) && yks.e(pathSegments.get(1), OPEN_REMOTE_PATH_SEGMENT)) {
                startActivity(jbr.T(this, new Intent()).putExtra("DEEPLINK_DESTINATION", GTV_APP_VIRTUAL_REMOTE_DEEPLINK));
                return;
            }
        }
        ykr.q(yoz.m(), null, 0, new ajo(this, str, this, bundle, (yih) null, 17), 3);
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xbw xbwVar = this.a;
        lfn lfnVar = null;
        if (xbwVar == null) {
            yks.c("observables");
            xbwVar = null;
        }
        xbwVar.b();
        setContentView(R.layout.gtv_launcher_activity_layout);
        this.i = (ProgressBar) findViewById(R.id.loading_progress_bar);
        lfn lfnVar2 = this.c;
        if (lfnVar2 == null) {
            yks.c("config");
        } else {
            lfnVar = lfnVar2;
        }
        if (lfnVar.cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
            new cxe(getWindow(), getWindow().getDecorView()).i(true);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        Intent intent = getIntent();
        Uri data = intent.getData();
        data.getClass();
        Bundle extras = intent.getExtras();
        Objects.toString(data);
        krd.b("Received GTV deep link ".concat(data.toString()));
        String string = data.toString();
        string.getClass();
        b(string, extras);
    }
}
