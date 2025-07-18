package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afk extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(3);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final air d;

    public afk(String str, air airVar, boolean z, boolean z2) {
        this.a = str;
        this.d = airVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iH = qq.h(parcel);
        qq.u(parcel, 1, str);
        air airVar = this.d;
        if (airVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            airVar = null;
        }
        qq.r(parcel, 2, airVar);
        qq.k(parcel, 3, this.b);
        qq.k(parcel, 4, this.c);
        qq.j(parcel, iH);
    }

    public afk(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        afd afdVar = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                ajy ajyVarY = (iInterfaceQueryLocalInterface instanceof ais ? (ais) iInterfaceQueryLocalInterface : new aiq(iBinder)).y();
                byte[] bArr = ajyVarY == null ? null : (byte[]) ajx.b(ajyVarY);
                if (bArr != null) {
                    afdVar = new afd(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = afdVar;
        this.b = z;
        this.c = z2;
    }
}
