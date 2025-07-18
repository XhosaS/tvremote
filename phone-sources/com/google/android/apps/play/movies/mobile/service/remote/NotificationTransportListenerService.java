package com.google.android.apps.play.movies.mobile.service.remote;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.videos.R;
import defpackage.krd;
import defpackage.krf;
import defpackage.mjs;
import defpackage.mjt;
import defpackage.mkc;
import defpackage.xcb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationTransportListenerService extends xcb {
    private static final String b = String.valueOf(NotificationTransportListenerService.class.getName()).concat(".");
    private static final String[] c = {"PLAY", "PAUSE", "DISCONNECT", "DISMISS", "SELECT", "BACK_30S"};
    public mkc a;
    private mjs d;
    private PendingIntent[] e;

    public final PendingIntent a(int i) {
        return this.e[i];
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.xcb, android.app.Service
    public final void onCreate() {
        super.onCreate();
        krd.e("Remote notification service started");
        String[] strArr = c;
        int length = strArr.length;
        this.e = new PendingIntent[6];
        for (int i = 0; i < 6; i++) {
            Intent intent = new Intent(this, (Class<?>) NotificationTransportListenerService.class);
            intent.setAction(String.valueOf(b).concat(String.valueOf(strArr[i])));
            this.e[i] = PendingIntent.getService(this, 0, intent, 201326592);
        }
        mjs mjsVar = this.a.b;
        this.d = mjsVar;
        mjsVar.b = this;
        krd.e("Creating notification");
        ((mjt) mjsVar).g(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        krd.e("Remote notification service stopped");
        mjs mjsVar = this.d;
        krd.e("Destroying notification");
        krf.b();
        ((NotificationManager) mjsVar.a.getSystemService("notification")).cancel(R.id.remote_notification);
        mjsVar.b = null;
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
            r9 = this;
            r11 = 2
            if (r10 == 0) goto Le8
            java.lang.String r10 = r10.getAction()
            if (r10 == 0) goto Le8
            java.lang.String r12 = com.google.android.apps.play.movies.mobile.service.remote.NotificationTransportListenerService.b
            boolean r0 = r10.startsWith(r12)
            if (r0 == 0) goto Le8
            int r12 = r12.length()
            java.lang.String r10 = r10.substring(r12)
            int r12 = r10.hashCode()
            switch(r12) {
                case -1852692228: goto L66;
                case -1390139842: goto L55;
                case 2458420: goto L44;
                case 75902422: goto L33;
                case 1015497884: goto L22;
                default: goto L20;
            }
        L20:
            goto Le8
        L22:
            java.lang.String r12 = "DISCONNECT"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto Le8
            mjs r10 = r9.d
            mkc r10 = r10.c
            r10.o()
            goto Le8
        L33:
            java.lang.String r12 = "PAUSE"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto Le8
            mjs r10 = r9.d
            mkc r10 = r10.c
            r10.q()
            goto Le8
        L44:
            java.lang.String r12 = "PLAY"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto Le8
            mjs r10 = r9.d
            mkc r10 = r10.c
            r10.r()
            goto Le8
        L55:
            java.lang.String r12 = "BACK_30S"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto Le8
            mjs r10 = r9.d
            mkc r10 = r10.c
            r10.u()
            goto Le8
        L66:
            java.lang.String r12 = "SELECT"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto Le8
            mjs r10 = r9.d
            mkc r10 = r10.c
            java.lang.String r12 = "onSelect() called"
            defpackage.krd.e(r12)
            mjw r12 = r10.d
            if (r12 == 0) goto Lca
            int r0 = r12.c
            if (r0 != 0) goto Lca
            mke r0 = r12.d()
            mjy r12 = r12.c()
            if (r0 == 0) goto Lca
            if (r12 == 0) goto Lca
            int r12 = r12.b
            r1 = 1
            if (r12 == r1) goto L96
            if (r12 == r11) goto L96
            r1 = 3
            if (r12 == r1) goto L96
            goto Lca
        L96:
            java.lang.String r12 = r10.c()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto La4
            boolean r1 = r0.e
            if (r1 == 0) goto Lca
        La4:
            android.content.Context r2 = r10.a
            ieg r3 = defpackage.ksn.a(r12)
            gag r10 = r10.f
            java.lang.Object r12 = r10.c
            java.lang.Object r1 = r10.a
            java.lang.Object r4 = r10.d
            java.lang.Object r10 = r10.e
            boolean r8 = r0.e
            r7 = r10
            java.lang.String r7 = (java.lang.String) r7
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r10 = defpackage.krb.j(r2, r3, r4, r5, r6, r7, r8)
            r2.startActivity(r10)
            goto Le8
        Lca:
            android.content.Context r10 = r10.a
            java.lang.String r12 = "movies"
            java.lang.String r0 = "remote_tracker"
            android.net.Uri$Builder r12 = defpackage.krb.d(r12, r0)
            android.net.Uri r12 = r12.build()
            ieg r0 = defpackage.ieg.a
            r1 = 0
            android.content.Intent r12 = defpackage.krb.a(r10, r12, r0, r1)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r12 = r12.addFlags(r0)
            r10.startActivity(r12)
        Le8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.service.remote.NotificationTransportListenerService.onStartCommand(android.content.Intent, int, int):int");
    }
}
