package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anf extends acj implements IInterface {
    public anf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void a(ane aneVar, and andVar) {
        Parcel parcelC = c();
        int i = acl.a;
        parcelC.writeStrongBinder(aneVar);
        parcelC.writeStrongBinder(andVar);
        e(4, parcelC);
    }
}
