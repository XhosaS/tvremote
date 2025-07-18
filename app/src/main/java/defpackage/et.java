package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class et extends Binder implements ev {
    public et() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                e();
                return true;
            case 2:
                a();
                return true;
            case 3:
                h();
                return true;
            case 4:
                g();
                return true;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                i();
                return true;
            case 6:
                j();
                return true;
            case 7:
                f();
                return true;
            case 8:
                c((ParcelableVolumeInfo) eu.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                parcel.readInt();
                k();
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                d();
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                parcel.readInt();
                l();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                b();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
