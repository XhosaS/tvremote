package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nof extends ifj implements nog {
    public nof(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // defpackage.nog
    public final int a() {
        Parcel parcelL = l(8, k());
        int i = parcelL.readInt();
        parcelL.recycle();
        return i;
    }

    @Override // defpackage.nog
    public final nmv b(odd oddVar, nmj nmjVar, noi noiVar, Map map) {
        nmv nmuVar;
        Parcel parcelK = k();
        ifl.e(parcelK, oddVar);
        ifl.c(parcelK, nmjVar);
        ifl.e(parcelK, noiVar);
        parcelK.writeMap(map);
        Parcel parcelL = l(1, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nmuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            nmuVar = iInterfaceQueryLocalInterface instanceof nmv ? (nmv) iInterfaceQueryLocalInterface : new nmu(strongBinder);
        }
        parcelL.recycle();
        return nmuVar;
    }

    @Override // defpackage.nog
    public final nnb c(odd oddVar, odd oddVar2, odd oddVar3) {
        nnb nnaVar;
        Parcel parcelK = k();
        ifl.e(parcelK, oddVar);
        ifl.e(parcelK, oddVar2);
        ifl.e(parcelK, oddVar3);
        Parcel parcelL = l(5, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nnaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            nnaVar = iInterfaceQueryLocalInterface instanceof nnb ? (nnb) iInterfaceQueryLocalInterface : new nna(strongBinder);
        }
        parcelL.recycle();
        return nnaVar;
    }

    @Override // defpackage.nog
    public final nmx d(nmj nmjVar, odd oddVar, nnh nnhVar) {
        nmx nmwVar;
        Parcel parcelK = k();
        ifl.c(parcelK, nmjVar);
        ifl.e(parcelK, oddVar);
        ifl.e(parcelK, nnhVar);
        Parcel parcelL = l(3, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nmwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            nmwVar = iInterfaceQueryLocalInterface instanceof nmx ? (nmx) iInterfaceQueryLocalInterface : new nmw(strongBinder);
        }
        parcelL.recycle();
        return nmwVar;
    }

    @Override // defpackage.nog
    public final nnd e(String str, String str2, nnh nnhVar) {
        nnd nncVar;
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ifl.e(parcelK, nnhVar);
        Parcel parcelL = l(2, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nncVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            nncVar = iInterfaceQueryLocalInterface instanceof nnd ? (nnd) iInterfaceQueryLocalInterface : new nnc(strongBinder);
        }
        parcelL.recycle();
        return nncVar;
    }

    @Override // defpackage.nog
    public final nqo f(odd oddVar, nnh nnhVar, int i, int i2) {
        nqo nqnVar;
        Parcel parcelK = k();
        ifl.e(parcelK, oddVar);
        ifl.e(parcelK, nnhVar);
        parcelK.writeInt(i);
        parcelK.writeInt(i2);
        parcelK.writeInt(0);
        parcelK.writeLong(2097152L);
        parcelK.writeInt(5);
        parcelK.writeInt(333);
        parcelK.writeInt(WVMediaCrypto.TYPE);
        Parcel parcelL = l(6, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nqnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            nqnVar = iInterfaceQueryLocalInterface instanceof nqo ? (nqo) iInterfaceQueryLocalInterface : new nqn(strongBinder);
        }
        parcelL.recycle();
        return nqnVar;
    }

    @Override // defpackage.nog
    public final nqo g(odd oddVar, odd oddVar2, nnh nnhVar, int i, int i2) {
        nqo nqnVar;
        Parcel parcelK = k();
        ifl.e(parcelK, oddVar);
        ifl.e(parcelK, oddVar2);
        ifl.e(parcelK, nnhVar);
        parcelK.writeInt(i);
        parcelK.writeInt(i2);
        parcelK.writeInt(0);
        parcelK.writeLong(2097152L);
        parcelK.writeInt(5);
        parcelK.writeInt(333);
        parcelK.writeInt(WVMediaCrypto.TYPE);
        Parcel parcelL = l(7, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nqnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            nqnVar = iInterfaceQueryLocalInterface instanceof nqo ? (nqo) iInterfaceQueryLocalInterface : new nqn(strongBinder);
        }
        parcelL.recycle();
        return nqnVar;
    }
}
