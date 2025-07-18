package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tel extends tfj {
    final /* synthetic */ String a;
    final /* synthetic */ teo b;
    final /* synthetic */ kwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tel(teo teoVar, kwy kwyVar, kwy kwyVar2, String str) {
        super(kwyVar);
        this.c = kwyVar2;
        this.a = str;
        this.b = teoVar;
    }

    @Override // defpackage.tfj
    protected final void a() {
        try {
            teo teoVar = this.b;
            tep tepVar = (tep) teoVar.a.m;
            String str = teoVar.b;
            Bundle bundleB = teo.b();
            tem temVar = new tem(teoVar, this.c);
            Parcel parcelK = tepVar.k();
            parcelK.writeString(str);
            ifl.c(parcelK, bundleB);
            ifl.e(parcelK, temVar);
            tepVar.n(3, parcelK);
        } catch (RemoteException e) {
            teo.d.an(e, "completeUpdate(%s)", this.a);
            this.c.v(new RuntimeException(e));
        }
    }
}
