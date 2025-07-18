package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lzp extends eru implements lzq {
    public lzp() {
        super("com.google.android.katniss.setting.IAssistantSettings");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        lzr lzrVar = null;
        lzo lzoVar = null;
        lzr lzrVar2 = null;
        lzn lznVar = null;
        switch (i) {
            case 1:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = erv.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 2:
                boolean zD = erv.d(parcel);
                O(parcel);
                g(zD);
                parcel2.writeNoException();
                return true;
            case 3:
                int iC = c();
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 4:
                boolean zD2 = erv.d(parcel);
                O(parcel);
                h(zD2);
                parcel2.writeNoException();
                return true;
            case 5:
                int iD = d();
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 6:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.katniss.setting.IAssistantSettingsCallback");
                    lzrVar = iInterfaceQueryLocalInterface instanceof lzr ? (lzr) iInterfaceQueryLocalInterface : new lzr(strongBinder);
                }
                O(parcel);
                j(lzrVar);
                return true;
            case 7:
                e();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.katniss.setting.IAssistantAvailableCallback");
                    lznVar = iInterfaceQueryLocalInterface2 instanceof lzn ? (lzn) iInterfaceQueryLocalInterface2 : new lzn(strongBinder2);
                }
                O(parcel);
                l(lznVar);
                return true;
            case 9:
                boolean zD3 = erv.d(parcel);
                O(parcel);
                f(zD3);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.katniss.setting.IAssistantSettingsCallback");
                    lzrVar2 = iInterfaceQueryLocalInterface3 instanceof lzr ? (lzr) iInterfaceQueryLocalInterface3 : new lzr(strongBinder3);
                }
                O(parcel);
                k(lzrVar2);
                return true;
            case 11:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.katniss.setting.IAssistantDeviceIdCallback");
                    lzoVar = iInterfaceQueryLocalInterface4 instanceof lzo ? (lzo) iInterfaceQueryLocalInterface4 : new lzo(strongBinder4);
                }
                O(parcel);
                m(string, lzoVar);
                return true;
            default:
                return false;
        }
    }
}
