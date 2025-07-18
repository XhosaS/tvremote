package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.aeq;
import defpackage.afi;
import defpackage.agi;
import defpackage.ajh;
import defpackage.b;
import defpackage.ii;
import defpackage.qp;
import defpackage.qq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends ajh implements ReflectedParcelable, agi {
    public final int d;
    public final String e;
    public final PendingIntent f;
    public final aeq g;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(15);
    public static final Parcelable.Creator CREATOR = new afi(5);

    public Status(int i, String str, PendingIntent pendingIntent, aeq aeqVar) {
        this.d = i;
        this.e = str;
        this.f = pendingIntent;
        this.g = aeqVar;
    }

    public final boolean a() {
        return this.d <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.d == status.d && ii.X(this.e, status.e) && ii.X(this.f, status.f) && ii.X(this.g, status.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.e, this.f, this.g});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String strE = this.e;
        if (strE == null) {
            int i = this.d;
            switch (i) {
                case -1:
                    strE = "SUCCESS_CACHE";
                    break;
                case 0:
                    strE = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strE = b.e(i, "unknown status code: ");
                    break;
                case 2:
                    strE = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strE = "SERVICE_DISABLED";
                    break;
                case 4:
                    strE = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strE = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strE = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strE = "NETWORK_ERROR";
                    break;
                case 8:
                    strE = "INTERNAL_ERROR";
                    break;
                case 10:
                    strE = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strE = "ERROR";
                    break;
                case 14:
                    strE = "INTERRUPTED";
                    break;
                case 15:
                    strE = "TIMEOUT";
                    break;
                case 16:
                    strE = "CANCELED";
                    break;
                case 17:
                    strE = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strE = "DEAD_CLIENT";
                    break;
                case 19:
                    strE = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strE = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strE = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strE = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        qp.s("statusCode", strE, arrayList);
        qp.s("resolution", this.f, arrayList);
        return qp.r(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        int iH = qq.h(parcel);
        qq.m(parcel, 1, i2);
        qq.u(parcel, 2, this.e);
        qq.t(parcel, 3, this.f, i);
        qq.t(parcel, 4, this.g, i);
        qq.j(parcel, iH);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, byte[] bArr) {
        this(i, str, null, null);
    }
}
