package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vnr extends eru implements vns {
    public vnr() {
        super("com.google.apps.tiktok.account.data.manager.IAccountSyncService");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        vny vnwVar = null;
        vny vnwVar2 = null;
        vnv vntVar = null;
        vny vnwVar3 = null;
        vny vnwVar4 = null;
        vny vnwVar5 = null;
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
                    vnwVar = iInterfaceQueryLocalInterface instanceof vny ? (vny) iInterfaceQueryLocalInterface : new vnw(strongBinder);
                }
                O(parcel);
                e(i2, vnwVar);
                return true;
            case 2:
                int i3 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
                    vnwVar5 = iInterfaceQueryLocalInterface2 instanceof vny ? (vny) iInterfaceQueryLocalInterface2 : new vnw(strongBinder2);
                }
                O(parcel);
                d(i3, vnwVar5);
                return true;
            case 3:
                Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
                    vnwVar4 = iInterfaceQueryLocalInterface3 instanceof vny ? (vny) iInterfaceQueryLocalInterface3 : new vnw(strongBinder3);
                }
                O(parcel);
                g(bundle, vnwVar4);
                return true;
            case 4:
                Bundle bundle2 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
                    vnwVar3 = iInterfaceQueryLocalInterface4 instanceof vny ? (vny) iInterfaceQueryLocalInterface4 : new vnw(strongBinder4);
                }
                O(parcel);
                h(bundle2, vnwVar3);
                return true;
            case 5:
                Bundle bundle3 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceAddAccountsCallback");
                    vntVar = iInterfaceQueryLocalInterface5 instanceof vnv ? (vnv) iInterfaceQueryLocalInterface5 : new vnt(strongBinder5);
                }
                boolean zD = erv.d(parcel);
                O(parcel);
                c(bundle3, vntVar, zD);
                return true;
            case 6:
                int[] iArrCreateIntArray = parcel.createIntArray();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
                    vnwVar2 = iInterfaceQueryLocalInterface6 instanceof vny ? (vny) iInterfaceQueryLocalInterface6 : new vnw(strongBinder6);
                }
                boolean zD2 = erv.d(parcel);
                O(parcel);
                f(iArrCreateIntArray, vnwVar2, zD2);
                return true;
            default:
                return false;
        }
    }
}
