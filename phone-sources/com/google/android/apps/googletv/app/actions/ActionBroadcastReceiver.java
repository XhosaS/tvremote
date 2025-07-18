package com.google.android.apps.googletv.app.actions;

import android.content.Context;
import android.content.Intent;
import defpackage.gag;
import defpackage.hju;
import defpackage.irc;
import defpackage.krd;
import defpackage.vvj;
import defpackage.wae;
import defpackage.wkg;
import defpackage.xbw;
import defpackage.xca;
import defpackage.yks;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ActionBroadcastReceiver extends xca {
    public xbw a;
    public irc b;
    public gag c;

    public final irc a() {
        irc ircVar = this.b;
        if (ircVar != null) {
            return ircVar;
        }
        yks.c("actionManager");
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [idr, java.lang.Object] */
    @Override // defpackage.xca, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        krd.b("Received Action broadcast");
        wae.B(this, context);
        xbw xbwVar = this.a;
        gag gagVar = null;
        if (xbwVar == null) {
            yks.c("observables");
            xbwVar = null;
        }
        xbwVar.b();
        if (intent == null) {
            krd.b("Action receiver broadcast had null intent");
            return;
        }
        wkg wkgVar = wkg.a;
        wkgVar.getClass();
        vvj vvjVarZ = hju.z(intent, "action", wkgVar);
        vvjVarZ.getClass();
        wkg wkgVar2 = (wkg) vvjVarZ;
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("account");
        String str = stringExtra2 != null ? stringExtra2 : "";
        if (yks.e(wkgVar2, wkgVar)) {
            krd.c("Receiver didn't receive an action");
        } else {
            Objects.toString(wkgVar2);
            krd.b("Performing action: ".concat(wkgVar2.toString()));
            gag gagVar2 = this.c;
            if (gagVar2 == null) {
                yks.c("mediaDeviceUiController");
            } else {
                gagVar = gagVar2;
            }
            gagVar.e.c(false);
            if (str.length() == 0) {
                a().e(wkgVar2, context, stringExtra);
            } else {
                a().g(wkgVar2, context, str, stringExtra);
            }
        }
        wae.B(this, context);
    }
}
