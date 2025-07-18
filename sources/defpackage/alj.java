package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alj extends acj implements IInterface {
    public alj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(ane aneVar, String str) {
        Parcel parcelC = c();
        int i = acl.a;
        parcelC.writeStrongBinder(aneVar);
        parcelC.writeString(str);
        e(5, parcelC);
    }
}
