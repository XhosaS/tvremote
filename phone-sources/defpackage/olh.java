package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olh extends ojj {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olh(nwu nwuVar, String str, int i) {
        super(nwuVar);
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ nxc a(Status status) {
        return new olg(status);
    }

    @Override // defpackage.nxr
    protected final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        obn obnVar;
        olb olbVar = (olb) nwfVar;
        oky okyVar = new oky(this);
        int i = this.b;
        String str = this.a;
        obn obnVar2 = null;
        try {
            okt oktVarS = olbVar.s();
            Context context = olbVar.c;
            nwl nwlVarQ = ocv.q();
            Parcel parcelK = oktVarS.k();
            ifl.e(parcelK, okyVar);
            parcelK.writeString(str);
            parcelK.writeString(null);
            parcelK.writeInt(i);
            parcelK.writeInt(1);
            ifl.c(parcelK, nwlVarQ);
            Parcel parcelL = oktVarS.l(505, parcelK);
            IBinder strongBinder = parcelL.readStrongBinder();
            if (strongBinder == null) {
                obnVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                obnVar = iInterfaceQueryLocalInterface instanceof obn ? (obn) iInterfaceQueryLocalInterface : new obn(strongBinder);
            }
            parcelL.recycle();
            obnVar2 = obnVar;
        } catch (RemoteException unused) {
            okyVar.b(8, null, null, null);
        }
        synchronized (this.j) {
            this.o = obnVar2;
        }
    }
}
