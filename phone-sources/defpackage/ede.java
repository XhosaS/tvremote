package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ede extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final nxo a;

    public ede(nxo nxoVar) {
        this.a = nxoVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.a.d(true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
