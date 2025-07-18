package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinderG = null;
        IBinder iBinderG2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderG3 = null;
        String strL = null;
        int iB = 1;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB = kkw.b(parcel, i);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) kkw.h(parcel, i, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinderG = kkw.g(parcel, i);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) kkw.h(parcel, i, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderG2 = kkw.g(parcel, i);
                    break;
                case 6:
                    iBinderG3 = kkw.g(parcel, i);
                    break;
                case 7:
                default:
                    kkw.r(parcel, i);
                    break;
                case '\b':
                    strL = kkw.l(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new LocationRequestUpdateData(iB, locationRequestInternal, iBinderG, iBinderG2, pendingIntent, iBinderG3, strL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
