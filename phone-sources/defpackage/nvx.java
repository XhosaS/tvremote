package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvx extends ocg {
    public static final Parcelable.Creator<nvx> CREATOR = new nub(11);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final obp d;

    public nvx(String str, obp obpVar, boolean z, boolean z2) {
        this.a = str;
        this.d = obpVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        obp obpVar = this.d;
        if (obpVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            obpVar = null;
        }
        ocv.H(parcel, 2, obpVar);
        ocv.y(parcel, 3, this.b);
        ocv.y(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }

    public nvx(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        nvr nvrVar = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                odd oddVarB = (iInterfaceQueryLocalInterface instanceof obq ? (obq) iInterfaceQueryLocalInterface : new obo(iBinder)).b();
                byte[] bArr = oddVarB == null ? null : (byte[]) odc.a(oddVarB);
                if (bArr != null) {
                    nvrVar = new nvr(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = nvrVar;
        this.b = z;
        this.c = z2;
    }
}
