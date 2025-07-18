package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ese extends eru implements esf {
    public ese() {
        super("com.google.android.apps.inputmethod.libs.tvvoice.api.IKeyboardService");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        esd esdVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.inputmethod.libs.tvvoice.api.IKeyboardCallback");
                esdVar = iInterfaceQueryLocalInterface instanceof esd ? (esd) iInterfaceQueryLocalInterface : new esd(strongBinder);
            }
            parcel.readInt();
            O(parcel);
            esh eshVarC = c(esdVar);
            parcel2.writeNoException();
            erv.c(parcel2, eshVarC);
        } else {
            if (i != 2) {
                return false;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.apps.inputmethod.libs.tvvoice.api.IKeyboardCallback");
                esdVar = iInterfaceQueryLocalInterface2 instanceof esd ? (esd) iInterfaceQueryLocalInterface2 : new esd(strongBinder2);
            }
            O(parcel);
            H(esdVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
