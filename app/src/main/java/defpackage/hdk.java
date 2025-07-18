package defpackage;

import android.app.NotificationManager;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdk implements wlk {
    public final hcq a;
    public final hdi b;
    public final hdr c;
    public final NotificationManager d;
    private final ahbt e;

    public hdk(hcq hcqVar, hdi hdiVar, hdr hdrVar, ahbt ahbtVar, NotificationManager notificationManager) {
        hcqVar.getClass();
        hdiVar.getClass();
        hdrVar.getClass();
        ahbtVar.getClass();
        this.a = hcqVar;
        this.b = hdiVar;
        this.c = hdrVar;
        this.e = ahbtVar;
        this.d = notificationManager;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        return ahkr.c(this.e, 0, new hdj(intent, this, null), 3);
    }
}
