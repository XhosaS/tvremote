package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gek extends Binder implements IInterface {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public gek() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        int i3 = 0;
        gej gejVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                gejVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gej)) ? new gej(strongBinder) : (gej) iInterfaceQueryLocalInterface;
            }
            String string = parcel.readString();
            gejVar.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
                synchronized (remoteCallbackList) {
                    int i4 = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i4;
                    Integer numValueOf = Integer.valueOf(i4);
                    if (remoteCallbackList.register(gejVar, numValueOf)) {
                        multiInstanceInvalidationService.b.put(numValueOf, string);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                gejVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof gej)) ? new gej(strongBinder2) : (gej) iInterfaceQueryLocalInterface2;
            }
            int i5 = parcel.readInt();
            gejVar.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.c;
            synchronized (remoteCallbackList2) {
                remoteCallbackList2.unregister(gejVar);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i6 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            strArrCreateStringArray.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
            RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.c;
            synchronized (remoteCallbackList3) {
                Map map = multiInstanceInvalidationService3.b;
                String str = (String) map.get(Integer.valueOf(i6));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = remoteCallbackList3.beginBroadcast();
                    while (i3 < iBeginBroadcast) {
                        try {
                            Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) map.get(num);
                            if (i6 != iIntValue && yks.e(str, str2)) {
                                try {
                                    gej gejVar2 = (gej) remoteCallbackList3.getBroadcastItem(i3);
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                        parcelObtain.writeStringArray(strArrCreateStringArray);
                                        gejVar2.a.transact(1, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }

    public gek(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
