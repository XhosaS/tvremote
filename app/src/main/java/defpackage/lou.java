package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lou extends kes implements DeviceContactsSyncClient {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        loo looVar = new loo();
        l = looVar;
        m = new kei("People.API", looVar);
    }

    public lou(Activity activity) {
        super(activity, activity, m, kee.a, ker.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final Intent createGoogleContactsSyncSettingsIntent(Context context, String str) {
        kkk.l(context, "Please provide a non-null context");
        Intent intent = new Intent("com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity").setPackage(context.getPackageName());
        if (str != null) {
            intent.putExtra("authAccount", str);
        }
        return intent;
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final lvf getDeviceContactsSyncSetting() {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{lnj.v};
        kibVar.a = new khv() { // from class: lon
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                log logVar = (log) obj;
                try {
                    loj lojVar = (loj) logVar.v();
                    lop lopVar = new lop((lvj) obj2);
                    Context context = logVar.b;
                    ApiMetadata apiMetadataA = knv.a();
                    Parcel parcelA = lojVar.a();
                    erv.c(parcelA, lopVar);
                    erv.b(parcelA, apiMetadataA);
                    lojVar.J(224702, parcelA);
                } catch (RemoteException e) {
                    ((lvj) obj2).a.q(e);
                }
            }
        };
        kibVar.d = 2731;
        return super.g(0, kibVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final lvf launchDeviceContactsSyncSettingActivity(final Context context) {
        kkk.l(context, "Please provide a non-null context");
        kib kibVar = new kib();
        kibVar.c = new Feature[]{lnj.v};
        kibVar.a = new khv() { // from class: lok
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                Context context2 = context;
                log logVar = (log) obj;
                try {
                    loj lojVar = (loj) logVar.v();
                    lot lotVar = new lot(context2, (lvj) obj2);
                    Context context3 = logVar.b;
                    ApiMetadata apiMetadataA = knv.a();
                    Parcel parcelA = lojVar.a();
                    erv.c(parcelA, lotVar);
                    erv.b(parcelA, apiMetadataA);
                    lojVar.J(224705, parcelA);
                } catch (RemoteException e) {
                    ((lvj) obj2).a.q(e);
                }
            }
        };
        kibVar.d = 2733;
        return super.g(0, kibVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final lvf registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        final khi khiVarB = khj.b(syncSettingUpdatedListener, this.h, "dataChangedListenerKey");
        khv khvVar = new khv() { // from class: lol
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                log logVar = (log) obj;
                loj lojVar = (loj) logVar.v();
                lor lorVar = new lor(khiVarB);
                Context context = logVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = lojVar.a();
                erv.c(parcelA, lorVar);
                erv.b(parcelA, apiMetadataA);
                lojVar.J(224703, parcelA);
            }
        };
        khv khvVar2 = new khv() { // from class: lom
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                log logVar = (log) obj;
                loj lojVar = (loj) logVar.v();
                los losVar = new los((lvj) obj2);
                Context context = logVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = lojVar.a();
                erv.c(parcelA, losVar);
                erv.b(parcelA, apiMetadataA);
                lojVar.J(224704, parcelA);
            }
        };
        kht khtVar = new kht();
        khtVar.c = khiVarB;
        khtVar.a = khvVar;
        khtVar.b = khvVar2;
        khtVar.d = new Feature[]{lnj.u};
        khtVar.f = 2729;
        return h(khtVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final lvf unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return i(khj.a(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public lou(Context context) {
        super(context, null, m, kee.a, ker.a);
    }
}
