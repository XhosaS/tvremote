package com.google.android.libraries.notifications.platform.entrypoints.firebase;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.aafi;
import defpackage.ntp;
import defpackage.osk;
import defpackage.qdz;
import defpackage.qei;
import defpackage.qfh;
import defpackage.qfi;
import defpackage.qhj;
import defpackage.qiw;
import defpackage.qjk;
import defpackage.tvk;
import defpackage.tvn;
import defpackage.uov;
import defpackage.wef;
import defpackage.yfo;
import defpackage.yks;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FirebaseMessagingServiceImpl extends FirebaseMessagingService {
    private static final tvn f = tvn.n("GnpSdk");
    public qei a;
    public ntp b;
    public aafi c;
    public osk d;

    private final boolean j() {
        return this.a == null || !a().h;
    }

    public final qei a() {
        qei qeiVar = this.a;
        if (qeiVar != null) {
            return qeiVar;
        }
        yks.c("gnpConfig");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void b() throws Throwable {
        if (j()) {
            return;
        }
        aafi aafiVarE = e();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        qfi qfiVar = new qfi(null, 3, null, null, null, null, null, null, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Object obj = aafiVarE.b;
        aafiVarE.y(qfiVar, applicationContext, timeUnit.toMicros(Instant.now().toEpochMilli()));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, qpr] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(uov uovVar) {
        int iB;
        String str;
        Throwable th;
        if (j()) {
            return;
        }
        if (this.d == null) {
            yks.c("trace");
        }
        int iIntValue = 0;
        qdz qdzVar = new qdz(0);
        try {
            aafi aafiVarE = e();
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            String str2 = (String) uovVar.a().get("casp");
            Bundle bundle = uovVar.a;
            byte[] byteArray = bundle.getByteArray("rawData");
            String str3 = (String) uovVar.a().get("chm");
            String str4 = (String) uovVar.a().get("ki");
            String string = bundle.getString("google.original_priority");
            if (string == null) {
                string = bundle.getString("google.priority");
            }
            qfh qfhVarAc = osk.ac(uov.b(string));
            String string2 = bundle.getString("google.delivered_priority");
            if (string2 != null) {
                iB = uov.b(string2);
            } else if ("1".equals(bundle.getString("google.priority_reduced"))) {
                iB = 2;
            } else {
                string2 = bundle.getString("google.priority");
                iB = uov.b(string2);
            }
            qfh qfhVarAc2 = osk.ac(iB);
            Object obj = bundle.get("google.ttl");
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else if (obj instanceof String) {
                try {
                    iIntValue = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(String.valueOf(obj))));
                }
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Bundle bundle2 = uovVar.a;
            int iD = qfi.d(bundle2.getString("message_type"));
            String string3 = bundle2.getString("google.message_id");
            if (string3 == null) {
                string3 = bundle2.getString("message_id");
            }
            if (true == TextUtils.isEmpty(string3)) {
                th = null;
                str = null;
            } else {
                str = string3;
                th = null;
            }
            qfi qfiVar = new qfi(str, iD, qfhVarAc, qfhVarAc2, numValueOf, str2, byteArray, str3, str4);
            if (qfiVar.c()) {
                aafiVarE.a.a(applicationContext);
                aafiVarE.y(qfiVar, applicationContext, TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli()));
                ((tvk) f.e()).s("Message handled by GNP Firebase handler.");
            }
            wef.v(qdzVar, th);
        } finally {
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        str.getClass();
        j();
    }

    public final aafi e() {
        aafi aafiVar = this.c;
        if (aafiVar != null) {
            return aafiVar;
        }
        yks.c("gnpFirebaseHandler");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        yfo yfoVar = (yfo) qhj.a(getApplicationContext()).Z().get(FirebaseMessagingServiceImpl.class);
        if (yfoVar == null) {
            ((tvk) f.g()).s("Failed to inject dependencies.");
            return;
        }
        Object objB = yfoVar.b();
        objB.getClass();
        ((qjk) objB).a(this);
        if (j()) {
            return;
        }
        Context applicationContext = getApplicationContext();
        ntp ntpVar = this.b;
        if (ntpVar == null) {
            yks.c("firebaseApi");
            ntpVar = null;
        }
        qiw.a(applicationContext, ntpVar, a());
    }
}
