package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afma {
    static int a(Parcel parcel, Status status) {
        int iValue = status.getCode().value() << 16;
        String description = status.getDescription();
        if (description != null && description.length() > 1000) {
            description = description.substring(0, 1000);
        }
        if (description == null) {
            return iValue;
        }
        int i = iValue | 32;
        parcel.writeString(description);
        return i;
    }

    static void b(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(iDataPosition);
    }

    static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }
}
