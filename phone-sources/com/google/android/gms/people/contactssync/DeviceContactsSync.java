package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import defpackage.okb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static DeviceContactsSyncClient getClient(Activity activity) {
        return new okb(activity);
    }

    public static DeviceContactsSyncClient getClient(Context context) {
        return new okb(context);
    }
}
