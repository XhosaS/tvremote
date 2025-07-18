package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzk extends ert implements kzm {
    public kzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // defpackage.kzm
    public final void e(List list) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        K(2, parcelA);
    }
}
