package com.google.android.gms.people.contactssync;

import android.content.Context;
import android.content.Intent;
import defpackage.kew;
import defpackage.lvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface DeviceContactsSyncClient extends kew {

    /* compiled from: PG */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    Intent createGoogleContactsSyncSettingsIntent(Context context, String str);

    lvf getDeviceContactsSyncSetting();

    lvf launchDeviceContactsSyncSettingActivity(Context context);

    lvf registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    lvf unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
