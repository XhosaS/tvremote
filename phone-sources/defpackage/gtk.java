package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtk extends gtp {
    public gtk(Context context, isy isyVar) {
        super(context, isyVar);
    }

    @Override // defpackage.gtp
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // defpackage.gtr
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            return Boolean.valueOf(intExtra == 2 || intExtra == 5);
        }
        gpn.b();
        Log.e(gtl.a, "getInitialState - null intent received");
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.gtp
    public final void c(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        gpn.b();
        String str = gtl.a;
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    f(false);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    f(false);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    f(true);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    f(true);
                    break;
                }
                break;
        }
    }
}
