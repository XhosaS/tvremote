package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frl implements frn {
    private final IBinder a;

    public frl(IBinder iBinder) {
        this.a = iBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.frn
    public final void a(frk frkVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder(frkVar);
            this.a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
