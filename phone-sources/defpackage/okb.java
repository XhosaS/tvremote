package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okb extends nwq implements DeviceContactsSyncClient {
    public static final /* synthetic */ int a = 0;
    private static final npj b;
    private static final jzs c;
    private static final ocv d;

    static {
        npj npjVar = new npj(null);
        b = npjVar;
        ojw ojwVar = new ojw();
        d = ojwVar;
        c = new jzs("People.API", (ocv) ojwVar, npjVar);
    }

    public okb(Activity activity) {
        super(activity, activity, c, nwi.q, nwp.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final Intent createGoogleContactsSyncSettingsIntent(Context context, String str) {
        ocv.aG(context, "Please provide a non-null context");
        Intent intent = new Intent("com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity").setPackage(context.getPackageName());
        if (str != null) {
            intent.putExtra("authAccount", str);
        }
        return intent;
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final onz<DeviceContactsSyncSetting> getDeviceContactsSyncSetting() {
        oaf oafVar = new oaf();
        oafVar.b = new nvg[]{ojd.v};
        oafVar.a = new nku(5);
        oafVar.c = 2731;
        return r(oafVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final onz<Void> launchDeviceContactsSyncSettingActivity(Context context) {
        ocv.aG(context, "Please provide a non-null context");
        oaf oafVar = new oaf();
        oafVar.b = new nvg[]{ojd.v};
        oafVar.a = new nig(context, 18);
        oafVar.c = 2733;
        return r(oafVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final onz<Void> registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        nzt nztVarO = o(syncSettingUpdatedListener, "dataChangedListenerKey");
        nig nigVar = new nig(nztVarO, 19);
        nku nkuVar = new nku(4);
        nzy nzyVar = new nzy();
        nzyVar.c = nztVarO;
        nzyVar.a = nigVar;
        nzyVar.b = nkuVar;
        nzyVar.d = new nvg[]{ojd.u};
        nzyVar.f = 2729;
        return y(nzyVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final onz<Boolean> unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return s(kwy.B(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public okb(Context context) {
        super(context, c, nwi.q, nwp.a);
    }
}
