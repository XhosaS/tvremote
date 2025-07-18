package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeq extends ajh {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final aeq a = new aeq(0);
    public static final Parcelable.Creator CREATOR = new e(20);

    public aeq(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return b.h(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aeq)) {
            return false;
        }
        aeq aeqVar = (aeq) obj;
        return this.c == aeqVar.c && ii.X(this.d, aeqVar.d) && ii.X(this.e, aeqVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qp.s("statusCode", a(this.c), arrayList);
        qp.s("resolution", this.d, arrayList);
        qp.s("message", this.e, arrayList);
        return qp.r(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.b);
        qq.m(parcel, 2, this.c);
        qq.t(parcel, 3, this.d, i);
        qq.u(parcel, 4, this.e);
        qq.j(parcel, iH);
    }

    public aeq(int i) {
        this(i, null, null);
    }

    public aeq(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public aeq(int i, PendingIntent pendingIntent, byte[] bArr) {
        this(1, i, pendingIntent, null);
    }
}
