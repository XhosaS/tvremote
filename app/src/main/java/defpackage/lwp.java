package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lwp extends ert implements IInterface {
    public lwp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(lwo lwoVar, lwm lwmVar) {
        Parcel parcelA = a();
        erv.c(parcelA, lwoVar);
        erv.c(parcelA, lwmVar);
        J(4, parcelA);
    }
}
