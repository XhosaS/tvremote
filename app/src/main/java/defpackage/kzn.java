package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.UploadBatchesParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzn extends ert implements kzp {
    public kzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // defpackage.kzp
    public final void e(UploadBatchesParcel uploadBatchesParcel) {
        Parcel parcelA = a();
        erv.b(parcelA, uploadBatchesParcel);
        K(2, parcelA);
    }
}
