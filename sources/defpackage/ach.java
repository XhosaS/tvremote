package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ach extends acj implements aci {
    public ach(IBinder iBinder) {
        super(iBinder, "com.android.systemui.statusbar.tv.IAudioRecordingDisclosureService");
    }

    @Override // defpackage.aci
    public final void a(IBinder iBinder) {
        Parcel parcelC = c();
        parcelC.writeStrongBinder(iBinder);
        parcelC.writeInt(0);
        f(2, parcelC);
    }

    @Override // defpackage.aci
    public final void b(IBinder iBinder) {
        Parcel parcelC = c();
        parcelC.writeStrongBinder(iBinder);
        parcelC.writeInt(0);
        parcelC.writeInt(-1);
        f(1, parcelC);
    }
}
