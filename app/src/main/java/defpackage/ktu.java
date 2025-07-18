package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        UserAttributeParcel userAttributeParcel = null;
        String strL3 = null;
        EventParcel eventParcel = null;
        EventParcel eventParcel2 = null;
        EventParcel eventParcel3 = null;
        long jE = 0;
        long jE2 = 0;
        long jE3 = 0;
        boolean zS = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 4:
                    userAttributeParcel = (UserAttributeParcel) kkw.h(parcel, i, UserAttributeParcel.CREATOR);
                    break;
                case 5:
                    jE = kkw.e(parcel, i);
                    break;
                case 6:
                    zS = kkw.s(parcel, i);
                    break;
                case 7:
                    strL3 = kkw.l(parcel, i);
                    break;
                case '\b':
                    eventParcel = (EventParcel) kkw.h(parcel, i, EventParcel.CREATOR);
                    break;
                case '\t':
                    jE2 = kkw.e(parcel, i);
                    break;
                case '\n':
                    eventParcel2 = (EventParcel) kkw.h(parcel, i, EventParcel.CREATOR);
                    break;
                case 11:
                    jE3 = kkw.e(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    eventParcel3 = (EventParcel) kkw.h(parcel, i, EventParcel.CREATOR);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new ConditionalUserPropertyParcel(strL, strL2, userAttributeParcel, jE, zS, strL3, eventParcel, jE2, eventParcel2, jE3, eventParcel3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConditionalUserPropertyParcel[i];
    }
}
