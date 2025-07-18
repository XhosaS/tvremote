package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kbb extends ert implements IInterface {
    public kbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void e(kba kbaVar, LogEventParcelable logEventParcelable) {
        Parcel parcelA = a();
        erv.c(parcelA, kbaVar);
        erv.b(parcelA, logEventParcelable);
        K(1, parcelA);
    }
}
