package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omp extends ifj implements IInterface {
    public omp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(omo omoVar, String str) {
        Parcel parcelK = k();
        ifl.e(parcelK, omoVar);
        parcelK.writeString(str);
        m(5, parcelK);
    }
}
