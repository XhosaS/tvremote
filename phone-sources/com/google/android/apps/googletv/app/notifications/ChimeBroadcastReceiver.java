package com.google.android.apps.googletv.app.notifications;

import android.content.Context;
import android.content.Intent;
import defpackage.hju;
import defpackage.iea;
import defpackage.ihq;
import defpackage.irc;
import defpackage.ixs;
import defpackage.izo;
import defpackage.jaq;
import defpackage.krd;
import defpackage.lie;
import defpackage.usc;
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
import defpackage.wae;
import defpackage.wlc;
import defpackage.wnw;
import defpackage.xca;
import defpackage.yfm;
import defpackage.yih;
import defpackage.ykr;
import defpackage.yks;
import defpackage.yow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimeBroadcastReceiver extends xca {
    public iea a;
    public lie b;
    public yow c;
    public jaq d;
    public izo e;
    public ihq f;
    public usc g;
    public irc h;

    @Override // defpackage.xca, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws vuq {
        wlc wlcVar;
        krd.b("Received Chime broadcast");
        wae.B(this, context);
        if (intent == null) {
            krd.b("Chime broadcast had null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("account");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        jaq jaqVar = this.d;
        if (jaqVar == null) {
            yks.c("chimeChannelInitializer");
            jaqVar = null;
        }
        jaqVar.a();
        String stringExtra2 = intent.getStringExtra("notification_type");
        if (stringExtra2 != null && stringExtra2.hashCode() == -1262577197 && stringExtra2.equals("DATA_INVALIDATION")) {
            vsl vslVar = vsl.a;
            vslVar.getClass();
            vvj vvjVarZ = hju.z(intent, "notification_payload", vslVar);
            vvjVarZ.getClass();
            try {
                vsz vszVar = ((vsl) vvjVarZ).c;
                vtp vtpVarA = vtp.a();
                wlc wlcVar2 = wlc.a;
                vte vteVarK = vszVar.k();
                vuc vucVarO = wlcVar2.o();
                try {
                    try {
                        vvy vvyVarB = vvs.a.b(vucVarO);
                        vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVarA);
                        vvyVarB.g(vucVarO);
                        try {
                            vteVarK.z(0);
                            vuc.B(vucVarO);
                            wlcVar = (wlc) vucVarO;
                        } catch (vuq e) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        if (!(e2.getCause() instanceof vuq)) {
                            throw new vuq(e2);
                        }
                        throw ((vuq) e2.getCause());
                    } catch (vwf e3) {
                        throw e3.a();
                    }
                } catch (RuntimeException e4) {
                    if (!(e4.getCause() instanceof vuq)) {
                        throw e4;
                    }
                    throw ((vuq) e4.getCause());
                } catch (vuq e5) {
                    if (!e5.a) {
                        throw e5;
                    }
                    throw new vuq(e5);
                }
            } catch (vuq e6) {
                e6.toString();
                krd.c("Chime data notification received invalid payload. Caught error ".concat(e6.toString()));
                wlcVar = null;
            }
            if (wlcVar != null) {
                Objects.toString(wlcVar);
                krd.b("Parsed chime notification. ".concat(wlcVar.toString()));
                lie lieVar = this.b;
                if (lieVar == null) {
                    yks.c("eventLogger");
                    lieVar = null;
                }
                vun<wnw> vunVar = wlcVar.c;
                vunVar.getClass();
                ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
                for (wnw wnwVar : vunVar) {
                    arrayList.add(wnwVar.b == 2 ? (String) wnwVar.c : "");
                }
                lieVar.g(arrayList);
                yow yowVar = this.c;
                if (yowVar == null) {
                    yks.c("coroutineScope");
                    yowVar = null;
                }
                ykr.q(yowVar, null, 0, new ixs(wlcVar, this, stringExtra, (yih) null, 4), 3);
            }
        }
    }
}
