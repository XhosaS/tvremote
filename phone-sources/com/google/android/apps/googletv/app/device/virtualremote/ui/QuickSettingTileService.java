package com.google.android.apps.googletv.app.device.virtualremote.ui;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.service.quicksettings.TileService;
import defpackage.a;
import defpackage.ieg;
import defpackage.ith;
import defpackage.itk;
import defpackage.lie;
import defpackage.qtl;
import defpackage.sga;
import defpackage.wae;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class QuickSettingTileService extends TileService {
    public lie a;
    public itk b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(boolean r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            android.service.quicksettings.Tile r0 = defpackage.a$$ExternalSyntheticApiModelOutline0.m6m(r3)
            if (r0 == 0) goto L3c
            r1 = 1
            if (r1 == r4) goto Lb
            r4 = r1
            goto Lc
        Lb:
            r4 = 2
        Lc:
            defpackage.a$$ExternalSyntheticApiModelOutline0.m(r0, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L39
            itk r4 = r3.a()
            ith r4 = r4.e()
            if (r4 == 0) goto L28
            iua r4 = (defpackage.iua) r4
            boolean r2 = r4.l
            if (r2 != r1) goto L28
            java.lang.String r4 = r4.c
            goto L36
        L28:
            android.content.res.Resources r4 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r3)
            r1 = 2132018921(0x7f1406e9, float:1.9676162E38)
            java.lang.String r4 = r4.getString(r1)
            r4.getClass()
        L36:
            defpackage.fr$$ExternalSyntheticApiModelOutline0.m(r0, r4)
        L39:
            defpackage.a$$ExternalSyntheticApiModelOutline0.m(r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.device.virtualremote.ui.QuickSettingTileService.b(boolean):void");
    }

    public final itk a() {
        itk itkVar = this.b;
        if (itkVar != null) {
            return itkVar;
        }
        yks.c("mediaDeviceController");
        return null;
    }

    public final void onClick() {
        super.onClick();
        lie lieVar = this.a;
        if (lieVar == null) {
            yks.c("eventLogger");
            lieVar = null;
        }
        lieVar.al();
        if (Build.VERSION.SDK_INT < 34) {
            startActivityAndCollapse(qtl.aG());
            return;
        }
        Intent intentAG = qtl.aG();
        ClipData clipData = sga.a;
        a.ab(true);
        PendingIntent activity = PendingIntent.getActivity(this, 1, intentAG, 67108864);
        if (activity != null) {
            startActivityAndCollapse(activity);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        wae.z(this);
        super.onCreate();
    }

    public final void onStartListening() throws Resources.NotFoundException {
        super.onStartListening();
        Object objA = a().c().a();
        objA.getClass();
        ieg iegVar = (ieg) objA;
        boolean z = false;
        if (iegVar.m() && ((ith) iegVar.g()).m()) {
            z = true;
        }
        b(z);
    }

    public final void onTileAdded() throws Resources.NotFoundException {
        super.onTileAdded();
        b(false);
    }
}
