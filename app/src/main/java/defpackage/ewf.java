package defpackage;

import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewf {
    private static final agpc a = new agpn(new agum() { // from class: ewe
        @Override // defpackage.agum
        public final Object a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.DREAMING_STARTED");
            intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
            return intentFilter;
        }
    });

    public static final IntentFilter a() {
        return (IntentFilter) a.a();
    }
}
