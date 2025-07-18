package com.google.android.gms.people.contactssync;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import defpackage.nwh;
import defpackage.nwv;
import defpackage.onz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface DeviceContactsSyncClient extends nwv<nwh> {

    /* compiled from: PG */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    Intent createGoogleContactsSyncSettingsIntent(Context context, String str);

    onz<DeviceContactsSyncSetting> getDeviceContactsSyncSetting();

    onz<Void> launchDeviceContactsSyncSettingActivity(Context context);

    onz<Void> registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    onz<Boolean> unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
