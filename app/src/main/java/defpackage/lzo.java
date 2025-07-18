package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lzo extends ert implements IInterface {
    public lzo(IBinder iBinder) {
        super(iBinder, "com.google.android.katniss.setting.IAssistantDeviceIdCallback");
    }

    public final void e(String str, int i) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeInt(i);
        K(1, parcelA);
    }
}
