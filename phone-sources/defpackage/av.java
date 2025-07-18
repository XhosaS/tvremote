package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class av implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public av(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new aw(parcel);
            case 1:
                return new au(parcel);
            case 2:
                return new cm(parcel);
            case 3:
                return new cs(parcel);
            case 4:
                return new cw(parcel);
            case 5:
                return dt.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 6:
                return new du(parcel);
            case 7:
                return new dv(parcel.readInt(), parcel.readFloat());
            case 8:
                return new er(parcel);
            case 9:
                return new es(parcel);
            case 10:
                return new et(parcel.readParcelable(null), null);
            case 11:
                return new ev(parcel);
            case 12:
                return new ey(parcel);
            case 13:
                return new ex(parcel);
            case 14:
                parcel.getClass();
                return new gn(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 15:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new gw((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 16:
                return new acf(parcel.readInt());
            case 17:
                return new bce(parcel.readFloat());
            case 18:
                return new bcf(parcel.readInt());
            case 19:
                return new bcg(parcel.readLong());
            default:
                return new czz(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new aw[i];
            case 1:
                return new au[i];
            case 2:
                return new cm[i];
            case 3:
                return new cs[i];
            case 4:
                return new cw[i];
            case 5:
                return new dt[i];
            case 6:
                return new du[i];
            case 7:
                return new dv[i];
            case 8:
                return new er[i];
            case 9:
                return new es[i];
            case 10:
                return new et[i];
            case 11:
                return new ev[i];
            case 12:
                return new ey[i];
            case 13:
                return new ex[i];
            case 14:
                return new gn[i];
            case 15:
                return new gw[i];
            case 16:
                return new acf[i];
            case 17:
                return new bce[i];
            case 18:
                return new bcf[i];
            case 19:
                return new bcg[i];
            default:
                return new czz[i];
        }
    }
}
