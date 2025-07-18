package com.google.android.apps.googletv.app.presentation.pages.device;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.gp;
import defpackage.gy;
import defpackage.hiq;
import defpackage.iej;
import defpackage.ith;
import defpackage.itm;
import defpackage.iuf;
import defpackage.iui;
import defpackage.jbr;
import defpackage.jxs;
import defpackage.jyr;
import defpackage.jys;
import defpackage.krd;
import defpackage.opz;
import defpackage.osk;
import defpackage.ygi;
import defpackage.yks;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DeviceNotificationActivity extends jxs {
    public static final String ACTION_VR = "com.google.android.apps.googletv.ACTION_VIRTUAL_REMOTE";
    public static final jys Companion = new jys();
    public View a;
    private iui b;
    private iuf c;
    private final iej d = new itm(this, 14);
    private gp e;
    private final String[] f;

    public static /* synthetic */ ygi $r8$lambda$0QASWaop7K3vMQ2bFoFBPrEaEQU(DeviceNotificationActivity deviceNotificationActivity) {
        deviceNotificationActivity.b = null;
        return ygi.a;
    }

    public static /* synthetic */ void $r8$lambda$2TCTiUqIjkqxU7Zs3lZzE1Tdee4(DeviceNotificationActivity deviceNotificationActivity, Map map) {
        map.getClass();
        krd.b(a.cj(map, "Permissions were granted: ", ". Updating controller."));
        deviceNotificationActivity.w().i();
        deviceNotificationActivity.a();
    }

    /* renamed from: $r8$lambda$EbeTyYfS8rN1oNt-oplLAhyi96I, reason: not valid java name */
    public static /* synthetic */ ygi m111$r8$lambda$EbeTyYfS8rN1oNtoplLAhyi96I(DeviceNotificationActivity deviceNotificationActivity) {
        deviceNotificationActivity.finishAndRemoveTask();
        return ygi.a;
    }

    /* renamed from: $r8$lambda$INMpN0yM4kkGUEooYWXrF-qqdT4, reason: not valid java name */
    public static /* synthetic */ void m112$r8$lambda$INMpN0yM4kkGUEooYWXrFqqdT4(DeviceNotificationActivity deviceNotificationActivity, View view) {
        krd.b("Click detected outside of view. Closing activity.");
        deviceNotificationActivity.finishAndRemoveTask();
    }

    public static /* synthetic */ boolean $r8$lambda$nWHK00JnLVKerQ3NDRSAmyL7kCs(ith ithVar) {
        ithVar.getClass();
        return ithVar.b() != null;
    }

    public DeviceNotificationActivity() {
        this.f = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if ((r1 != null ? ((defpackage.iua) r1).j : null) == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r8 = this;
            iui r0 = r8.b
            if (r0 == 0) goto L6
        L4:
            r2 = r8
            goto L62
        L6:
            iuf r4 = r8.c
            r0 = 0
            r8.c = r0
            if (r4 == 0) goto L29
            itk r1 = r8.w()
            ith r1 = r1.e()
            if (r1 == 0) goto L20
            iua r1 = (defpackage.iua) r1
            fux r1 = r1.i
            if (r1 == 0) goto L20
            java.lang.String r1 = r1.d
            goto L21
        L20:
            r1 = r0
        L21:
            java.lang.String r2 = r4.a
            boolean r1 = defpackage.yks.e(r2, r1)
            if (r1 == 0) goto L39
        L29:
            itk r1 = r8.w()
            ith r1 = r1.e()
            if (r1 == 0) goto L37
            iua r1 = (defpackage.iua) r1
            iwu r0 = r1.j
        L37:
            if (r0 != 0) goto L4
        L39:
            java.lang.String r0 = "Currently selected device does not have a virtual remote. Showing bottom sheet to select another."
            defpackage.krd.b(r0)
            iui r1 = new iui
            itk r3 = r8.w()
            jxd r5 = new jxd
            r0 = 9
            r5.<init>(r0)
            jwz r6 = new jwz
            r0 = 19
            r6.<init>(r8, r0)
            jwz r7 = new jwz
            r0 = 20
            r7.<init>(r8, r0)
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.i()
            r2.b = r1
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity.a():void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [idr, java.lang.Object] */
    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            setTranslucent(true);
        }
        super.onCreate(bundle);
        if (bundle == null) {
            ConcurrentHashMap concurrentHashMap = opz.a;
            osk.l(this, getIntent());
        }
        Intent intent = getIntent();
        View view = null;
        String action = intent != null ? intent.getAction() : null;
        String stringExtra = getIntent().getStringExtra("referrer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        z().ag(stringExtra);
        if (!yks.e(action, ACTION_VR)) {
            krd.b("No action provided. Opening app with expanded companion bar.");
            E().e.c(true);
            startActivity(jbr.V(this));
            finishAndRemoveTask();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("cast_device_id");
        String stringExtra3 = getIntent().getStringExtra("device_name");
        if (stringExtra2 != null && stringExtra3 != null) {
            krd.b(a.cg(stringExtra3, "Intent included target device ", "."));
            this.c = new iuf(stringExtra2, stringExtra3);
        }
        krd.b(a.cg(action, "Invoked with ", ". Showing standalone expanded companion bar."));
        if (y().cJ()) {
            setTheme(R.style.Theme_GoogleTv_TransparentLight);
        } else {
            setTheme(R.style.Theme_GoogleTv_TransparentDark);
        }
        if (Build.VERSION.SDK_INT < 27) {
            getWindow().addFlags(524288);
        }
        setContentView(R.layout.device_page);
        View viewFindViewById = findViewById(R.id.device_page_layout);
        viewFindViewById.getClass();
        this.a = viewFindViewById;
        if (viewFindViewById == null) {
            yks.c("backdrop");
        } else {
            view = viewFindViewById;
        }
        int i = 0;
        view.setOnClickListener(new jyr(this, i));
        w().c().ea(this.d);
        this.e = registerForActivityResult(new gy(), new hiq(this, 7));
        String[] strArr = this.f;
        int length = strArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            if (checkSelfPermission(strArr[i]) == 0) {
                i++;
            } else if (yks.e(E().a.a(), true)) {
                gp gpVar = this.e;
                if (gpVar != null) {
                    gpVar.b(strArr);
                    return;
                }
                return;
            }
        }
        a();
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        iui iuiVar = this.b;
        if (iuiVar != null) {
            iuiVar.a();
        }
        try {
            w().c().ee(this.d);
        } catch (IllegalStateException unused) {
        }
        super.onDestroy();
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        ConcurrentHashMap concurrentHashMap = opz.a;
        osk.l(this, intent);
    }
}
