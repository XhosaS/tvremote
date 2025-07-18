package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.tv.remote.service.IAtvSearchAssistantService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vei extends ert implements IAtvSearchAssistantService {
    public vei(IBinder iBinder) {
        super(iBinder, "com.google.android.tv.remote.service.IAtvSearchAssistantService");
    }

    @Override // com.google.android.tv.remote.service.IAtvSearchAssistantService
    public final void e(int i) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        J(2, parcelA);
    }

    @Override // com.google.android.tv.remote.service.IAtvSearchAssistantService
    public final boolean f() {
        Parcel parcelB = b(1, a());
        boolean zD = erv.d(parcelB);
        parcelB.recycle();
        return zD;
    }
}
