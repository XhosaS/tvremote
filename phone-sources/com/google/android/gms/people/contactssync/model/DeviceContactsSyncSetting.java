package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.oee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceContactsSyncSetting extends ocg {
    public static final Parcelable.Creator<DeviceContactsSyncSetting> CREATOR = new oee(9);
    public static final int NOT_APPLICABLE = 1;
    public static final int OFF = 2;
    public static final int ON = 3;
    public static final int UNKNOWN_SYNC_SETTING = 0;
    private final int a;
    private final Account b;

    public DeviceContactsSyncSetting(int i, Account account) {
        this.a = i;
        this.b = account;
    }

    public static DeviceContactsSyncSetting create(int i) {
        return new DeviceContactsSyncSetting(i, null);
    }

    public Account getAccount() {
        return this.b;
    }

    public int getSyncSetting() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, getSyncSetting());
        ocv.N(parcel, 2, getAccount(), i);
        ocv.x(parcel, iV);
    }

    public static DeviceContactsSyncSetting create(int i, Account account) {
        return new DeviceContactsSyncSetting(i, account);
    }
}
