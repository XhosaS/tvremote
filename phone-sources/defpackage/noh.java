package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class noh extends ifk implements noi {
    public noh() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        nok nojVar;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    nojVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    nojVar = iInterfaceQueryLocalInterface instanceof nok ? (nok) iInterfaceQueryLocalInterface : new noj(strongBinder);
                }
                ifl.b(parcel);
                d(bundle, nojVar);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                int i2 = parcel.readInt();
                ifl.b(parcel);
                c(bundle2, i2);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle3 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                f(bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle4 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                int i3 = parcel.readInt();
                ifl.b(parcel);
                boolean zM = m(bundle4, i3);
                parcel2.writeNoException();
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 5:
                String string = parcel.readString();
                ifl.b(parcel);
                h(string);
                parcel2.writeNoException();
                return true;
            case 6:
                g();
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zL = l();
                parcel2.writeNoException();
                int i4 = ifl.a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 8:
                String string2 = parcel.readString();
                ifl.b(parcel);
                Bundle bundleA = a(string2);
                parcel2.writeNoException();
                ifl.d(parcel2, bundleA);
                return true;
            case 9:
                String strB = b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(252505000);
                return true;
            case 11:
                e();
                parcel2.writeNoException();
                return true;
            case 12:
                boolean zJ = j();
                parcel2.writeNoException();
                int i5 = ifl.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 13:
                int i6 = parcel.readInt();
                ifl.b(parcel);
                i(i6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
