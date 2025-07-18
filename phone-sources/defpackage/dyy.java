package defpackage;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyy implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public dyy(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new dyz(parcel);
            case 1:
                return new dza(parcel);
            case 2:
                return new eas(parcel);
            case 3:
                return new euh(parcel);
            case 4:
                return new euf(parcel.readLong(), parcel.readLong());
            case 5:
                return new eug(parcel.readLong(), parcel.readLong());
            case 6:
                return new eur(parcel.readInt());
            case 7:
                return frs.b((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case 8:
                return new frt(parcel);
            case 9:
                return new fsb(parcel);
            case 10:
                return new fsc(parcel);
            case 11:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new fsd(token, null);
            case 12:
                return new fsi(parcel);
            case 13:
                return new fsl(parcel);
            case 14:
                return new fsk(parcel);
            case 15:
                return new fsm(parcel.readInt(), parcel.readFloat());
            case 16:
                return new gcp(parcel);
            case 17:
                return new gcs(parcel);
            case 18:
                return new gcw(parcel);
            case 19:
                return new gcz(parcel);
            default:
                return new gdl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dyz[i];
            case 1:
                return new dza[i];
            case 2:
                return new eas[i];
            case 3:
                return new euh[i];
            case 4:
                return new euf[i];
            case 5:
                return new eug[i];
            case 6:
                return new eur[i];
            case 7:
                return new frs[i];
            case 8:
                return new frt[i];
            case 9:
                return new fsb[i];
            case 10:
                return new fsc[i];
            case 11:
                return new fsd[i];
            case 12:
                return new fsi[i];
            case 13:
                return new fsl[i];
            case 14:
                return new fsk[i];
            case 15:
                return new fsm[i];
            case 16:
                return new gcp[i];
            case 17:
                return new gcs[i];
            case 18:
                return new gcw[i];
            case 19:
                return new gcz[i];
            default:
                return new gdl[i];
        }
    }
}
