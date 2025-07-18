package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class bky implements bla {
    private final IBinder a;

    public bky(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.bla
    public final int a(bkx bkxVar, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            parcelObtain.writeStrongInterface(bkxVar);
            parcelObtain.writeString(str);
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.bla
    public final void b(int i, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.bla
    public final void c(bkx bkxVar, int i) {
        throw null;
    }
}
