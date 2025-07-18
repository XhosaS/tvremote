package com.google.android.apps.googletv.app.presentation.pages.virtualremote.activities;

import android.os.Bundle;
import defpackage.azg;
import defpackage.bhq;
import defpackage.fn;
import defpackage.ge;
import defpackage.jxs;
import defpackage.kgu;
import defpackage.kiq;
import defpackage.kuw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VirtualRemoteActivity extends jxs {
    public kiq a;
    public kuw b;
    public static final kgu Companion = new kgu();
    public static final int $stable = 8;

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fn.a(this);
        ge.a(this, new bhq(1699569411, true, new azg(this, 18)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [idr, java.lang.Object] */
    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        E().e.c(false);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        finish();
    }
}
