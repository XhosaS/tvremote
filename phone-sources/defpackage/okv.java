package defpackage;

import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okv implements nzs {
    private final /* synthetic */ int a;

    public okv(int i) {
        this.a = i;
    }

    @Override // defpackage.nzs
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((ojg) obj).a();
        } else if (i != 1) {
            ((oot) obj).a();
        } else {
            ((DeviceContactsSyncClient.SyncSettingUpdatedListener) obj).onDeviceContactsSyncSettingUpdated();
        }
    }
}
