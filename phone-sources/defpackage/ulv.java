package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulv extends oag {
    private final String a;
    private final unj e;

    public ulv(unj unjVar, String str) {
        super(null, false, 13201);
        this.a = str;
        this.e = unjVar;
    }

    @Override // defpackage.oag
    protected final /* bridge */ /* synthetic */ void a(nwf nwfVar, kwy kwyVar) {
        ult ultVar = (ult) nwfVar;
        ulu uluVar = new ulu(this.e, kwyVar);
        String str = this.a;
        try {
            ulx ulxVar = (ulx) ultVar.L();
            Parcel parcelK = ulxVar.k();
            ifl.e(parcelK, uluVar);
            parcelK.writeString(str);
            ulxVar.m(1, parcelK);
        } catch (RemoteException unused) {
        }
    }
}
