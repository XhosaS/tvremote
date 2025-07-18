package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fri implements frk {
    private final IBinder a;

    public fri(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.frk
    public final void a(fsl fslVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            fslVar.writeToParcel(parcelObtain, 0);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.frk
    public final void b(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            this.a.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.frk
    public final void c(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            this.a.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
