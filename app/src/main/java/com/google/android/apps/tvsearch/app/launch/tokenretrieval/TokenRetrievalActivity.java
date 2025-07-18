package com.google.android.apps.tvsearch.app.launch.tokenretrieval;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.agvy;
import defpackage.eyf;
import defpackage.feq;
import defpackage.wyo;
import defpackage.zdv;
import defpackage.zdy;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TokenRetrievalActivity extends eyf {
    private static final zdy m = zdy.h("com/google/android/apps/tvsearch/app/launch/tokenretrieval/TokenRetrievalActivity");
    private static final Duration n;
    private final Runnable o = new Runnable() { // from class: eyg
        @Override // java.lang.Runnable
        public final void run() {
            this.a.finish();
        }
    };
    private final Handler p = new Handler(Looper.getMainLooper());

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        n = durationOfSeconds;
    }

    private final void D() {
        Handler handler = this.p;
        Runnable runnable = this.o;
        handler.removeCallbacks(runnable);
        feq.e(handler, n, runnable);
    }

    @Override // defpackage.eyf, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getAction();
        if (!agvy.c(getIntent().getAction(), "com.google.android.katniss.action.TOKEN_RETRIEVAL") || getIntent().getExtras() == null) {
            finish();
            return;
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("android.intent.extra.INTENT");
        if (intent != null) {
            wyo.l(this, intent);
            D();
        }
    }

    @Override // defpackage.tt, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        try {
            moveTaskToBack(true);
        } catch (Exception e) {
            ((zdv) ((zdv) m.d()).p(e).q("com/google/android/apps/tvsearch/app/launch/tokenretrieval/TokenRetrievalActivity", "onNewIntent", 58, "TokenRetrievalActivity.kt")).u("Failed to move task to back. Finishing activity and task instead.");
            finishAndRemoveTask();
        }
        super.onNewIntent(intent);
        D();
    }
}
