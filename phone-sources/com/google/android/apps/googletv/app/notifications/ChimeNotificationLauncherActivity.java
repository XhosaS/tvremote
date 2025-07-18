package com.google.android.apps.googletv.app.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.hju;
import defpackage.ihz;
import defpackage.jbr;
import defpackage.krd;
import defpackage.vsl;
import defpackage.vsz;
import defpackage.vte;
import defpackage.vtf;
import defpackage.vtp;
import defpackage.vuc;
import defpackage.vun;
import defpackage.vuq;
import defpackage.vvj;
import defpackage.vvs;
import defpackage.vvy;
import defpackage.vwf;
import defpackage.wkg;
import defpackage.wlb;
import defpackage.wpi;
import defpackage.xbw;
import defpackage.xcf;
import defpackage.yks;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimeNotificationLauncherActivity extends xcf {
    public xbw a;

    private final void a(wpi wpiVar, String str) {
        wkg wkgVar = wpiVar.c;
        if (wkgVar == null) {
            wkgVar = wkg.a;
        }
        if (ihz.W(wkgVar)) {
            startActivity(jbr.T(this, new Intent()));
            return;
        }
        Context applicationContext = getApplicationContext();
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        wkg wkgVar2 = wpiVar.c;
        if (wkgVar2 == null) {
            wkgVar2 = wkg.a;
        }
        wkgVar2.getClass();
        applicationContext.sendBroadcast(jbr.W(applicationContext2, wkgVar2, str));
        finishAndRemoveTask();
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    public final void onCreate(Bundle bundle) throws vuq {
        wpi wpiVar;
        super.onCreate(bundle);
        xbw xbwVar = this.a;
        Object obj = null;
        if (xbwVar == null) {
            yks.c("observables");
            xbwVar = null;
        }
        xbwVar.b();
        String stringExtra = getIntent().getStringExtra("notification_type");
        Intent intent = getIntent();
        intent.getClass();
        vsl vslVar = vsl.a;
        vslVar.getClass();
        vvj vvjVarZ = hju.z(intent, "notification_payload", vslVar);
        vvjVarZ.getClass();
        try {
            vsz vszVar = ((vsl) vvjVarZ).c;
            vtp vtpVarA = vtp.a();
            wpi wpiVar2 = wpi.a;
            vte vteVarK = vszVar.k();
            vuc vucVarO = wpiVar2.o();
            try {
                try {
                    try {
                        try {
                            vvy vvyVarB = vvs.a.b(vucVarO);
                            vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVarA);
                            vvyVarB.g(vucVarO);
                            try {
                                vteVarK.z(0);
                                vuc.B(vucVarO);
                                wpiVar = (wpi) vucVarO;
                            } catch (vuq e) {
                                throw e;
                            }
                        } catch (vuq e2) {
                            if (!e2.a) {
                                throw e2;
                            }
                            throw new vuq(e2);
                        }
                    } catch (IOException e3) {
                        if (!(e3.getCause() instanceof vuq)) {
                            throw new vuq(e3);
                        }
                        throw ((vuq) e3.getCause());
                    }
                } catch (RuntimeException e4) {
                    if (!(e4.getCause() instanceof vuq)) {
                        throw e4;
                    }
                    throw ((vuq) e4.getCause());
                }
            } catch (vwf e5) {
                throw e5.a();
            }
        } catch (vuq e6) {
            e6.toString();
            krd.c("Chime UI notification received invalid payload. Caught error ".concat(e6.toString()));
            wpiVar = null;
        }
        String stringExtra2 = getIntent().getStringExtra("action_id");
        String stringExtra3 = getIntent().getStringExtra("account");
        krd.b("Chime handling notification type ".concat(String.valueOf(stringExtra)));
        if (wpiVar != null) {
            wkg wkgVar = wpiVar.c;
            if (wkgVar == null) {
                wkgVar = wkg.a;
            }
            if (!ihz.W(wkgVar)) {
                if (stringExtra2 == null) {
                    a(wpiVar, stringExtra3);
                    return;
                }
                vun vunVar = wpiVar.d;
                vunVar.getClass();
                Iterator<E> it = vunVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (yks.e(((wlb) next).b, stringExtra2)) {
                        obj = next;
                        break;
                    }
                }
                wlb wlbVar = (wlb) obj;
                if (wlbVar == null) {
                    krd.b("Custom action not found. Launching click action.");
                    a(wpiVar, stringExtra3);
                    return;
                }
                Context applicationContext = getApplicationContext();
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                wkg wkgVar2 = wlbVar.c;
                if (wkgVar2 == null) {
                    wkgVar2 = wkg.a;
                }
                wkgVar2.getClass();
                applicationContext.sendBroadcast(jbr.W(applicationContext2, wkgVar2, stringExtra3));
                finishAndRemoveTask();
                return;
            }
        }
        krd.b("Parsed UiNotification or its click action was null. Launching home activity");
        startActivity(jbr.T(this, new Intent()));
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        finish();
    }
}
