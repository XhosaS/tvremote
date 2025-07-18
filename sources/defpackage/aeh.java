package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeh extends acj implements IInterface {
    public aeh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(aeg aegVar, adt adtVar) {
        Parcel parcelC = c();
        int i = acl.a;
        parcelC.writeStrongBinder(aegVar);
        acl.c(parcelC, adtVar);
        f(1, parcelC);
    }
}
