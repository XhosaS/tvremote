package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktv extends kwt {
    public static final Parcelable.Creator<ktv> CREATOR = new jbu(8);

    public ktv(int i, int i2) {
        super(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.b) {
            case 2:
                str = "UNIT_UNKNOWN";
                break;
            case 3:
                str = "UNIT_DAY";
                break;
            case 4:
                str = "UNIT_WEEK";
                break;
            case 5:
                str = "UNIT_MONTH";
                break;
            case 6:
                str = "UNIT_YEAR";
                break;
            case 7:
                str = "UNIT_SECOND";
                break;
            case 8:
                str = "UNIT_MINUTE";
                break;
            case 9:
                str = "UNIT_HOUR";
                break;
            default:
                str = "UNRECOGNIZED";
                break;
        }
        parcel.writeString(str);
        parcel.writeInt(this.a);
    }
}
