package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dw implements dy {
    private final IBinder a;

    public dw(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dy
    public final void a(ey eyVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (eyVar != null) {
                parcelObtain.writeInt(1);
                eyVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
