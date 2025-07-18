package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.katniss.data.PermissionsText;
import com.google.android.katniss.data.UserAssistantSettings;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lzr extends ert implements IInterface {
    public lzr(IBinder iBinder) {
        super(iBinder, "com.google.android.katniss.setting.IAssistantSettingsCallback");
    }

    public final void e(PermissionsText permissionsText) {
        Parcel parcelA = a();
        erv.b(parcelA, permissionsText);
        K(1, parcelA);
    }

    public final void f(UserAssistantSettings userAssistantSettings) {
        Parcel parcelA = a();
        erv.b(parcelA, userAssistantSettings);
        K(2, parcelA);
    }
}
