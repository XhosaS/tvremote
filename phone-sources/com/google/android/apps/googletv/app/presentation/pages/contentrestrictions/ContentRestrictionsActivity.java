package com.google.android.apps.googletv.app.presentation.pages.contentrestrictions;

import android.os.Bundle;
import defpackage.azg;
import defpackage.bck;
import defpackage.bhq;
import defpackage.ge;
import defpackage.jbr;
import defpackage.jej;
import defpackage.jxs;
import defpackage.jyb;
import defpackage.kuw;
import defpackage.mdw;
import defpackage.yft;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContentRestrictionsActivity extends jxs {
    public static final int $stable = 8;
    public final yft a;
    public kuw b;
    public mdw c;

    public ContentRestrictionsActivity() {
        int i = ylg.a;
        this.a = new jej(new ykl(jyb.class), new bck(this, 4), this);
    }

    public final mdw a() {
        mdw mdwVar = this.c;
        if (mdwVar != null) {
            return mdwVar;
        }
        yks.c("parentalControlsManager");
        return null;
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("referrer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        x().e(this, jbr.L(193610, stringExtra, 6));
        ge.a(this, new bhq(-2018046887, true, new azg(this, 9)));
    }
}
