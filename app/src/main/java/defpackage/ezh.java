package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezh implements wlk {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/modeutils/art/ArtBroadcastReceiver");
    public final fmg b;
    public final ztw c;
    private final ahbt d;

    public ezh(ahbt ahbtVar, fmg fmgVar, ztw ztwVar) {
        ahbtVar.getClass();
        ztwVar.getClass();
        this.d = ahbtVar;
        this.b = fmgVar;
        this.c = ztwVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        return ahkr.c(this.d, 0, new ezg(intent, this, null), 3);
    }
}
