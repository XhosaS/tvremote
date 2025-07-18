package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsm extends ert implements IInterface {
    public lsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(lsl lslVar, String str) {
        Parcel parcelA = a();
        erv.c(parcelA, lslVar);
        parcelA.writeString(str);
        J(5, parcelA);
    }
}
