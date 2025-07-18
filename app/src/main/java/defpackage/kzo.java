package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.UploadBatchesParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kzo extends eru implements kzp {
    public kzo() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        UploadBatchesParcel uploadBatchesParcel = (UploadBatchesParcel) erv.a(parcel, UploadBatchesParcel.CREATOR);
        O(parcel);
        e(uploadBatchesParcel);
        return true;
    }
}
