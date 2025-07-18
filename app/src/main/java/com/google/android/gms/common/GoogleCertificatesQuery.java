package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kdg;
import defpackage.kdh;
import defpackage.kdn;
import defpackage.kjy;
import defpackage.kka;
import defpackage.kkx;
import defpackage.kme;
import defpackage.kmf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kdn();
    public final String a;
    public final boolean b;
    public final boolean c;
    private final kdg d;

    public GoogleCertificatesQuery(String str, kdg kdgVar, boolean z, boolean z2) {
        this.a = str;
        this.d = kdgVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kdg kdgVar = this.d;
        if (kdgVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            kdgVar = null;
        }
        kkx.l(parcel, 2, kdgVar);
        kkx.c(parcel, 3, this.b);
        kkx.c(parcel, 4, this.c);
        kkx.b(parcel, iA);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        kdh kdhVar = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                kme kmeVarE = (iInterfaceQueryLocalInterface instanceof kka ? (kka) iInterfaceQueryLocalInterface : new kjy(iBinder)).e();
                byte[] bArr = kmeVarE == null ? null : (byte[]) kmf.c(kmeVarE);
                if (bArr != null) {
                    kdhVar = new kdh(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = kdhVar;
        this.b = z;
        this.c = z2;
    }
}
