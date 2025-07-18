package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jrx extends ert implements IInterface {
    public jrx(IBinder iBinder) {
        super(iBinder, "com.google.android.assistant.led.IFixedStateLedService");
    }

    public final void e(int i) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        J(8, parcelA);
    }
}
