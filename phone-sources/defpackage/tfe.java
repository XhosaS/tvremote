package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfe extends tfj {
    final /* synthetic */ tfg a;
    final /* synthetic */ kwy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(tfg tfgVar, kwy kwyVar, kwy kwyVar2) {
        super(kwyVar);
        this.b = kwyVar2;
        this.a = tfgVar;
    }

    @Override // defpackage.tfj
    protected final void a() {
        try {
            tfg tfgVar = this.a;
            ter terVar = (ter) tfgVar.a.m;
            String str = tfgVar.b;
            int i = tfh.a;
            Bundle bundle = new Bundle();
            Map mapA = tfh.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            tff tffVar = new tff(tfgVar, this.b);
            Parcel parcelK = terVar.k();
            parcelK.writeString(str);
            ifl.c(parcelK, bundle);
            ifl.e(parcelK, tffVar);
            terVar.n(2, parcelK);
        } catch (RemoteException e) {
            tfg.c.an(e, "error requesting in-app review for %s", this.a.b);
            this.b.v(new RuntimeException(e));
        }
    }
}
