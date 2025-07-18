package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tek extends tfj {
    final /* synthetic */ String a;
    final /* synthetic */ teo b;
    final /* synthetic */ kwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tek(teo teoVar, kwy kwyVar, String str, kwy kwyVar2) {
        super(kwyVar);
        this.a = str;
        this.c = kwyVar2;
        this.b = teoVar;
    }

    @Override // defpackage.tfj
    protected final void a() {
        Integer numValueOf;
        try {
            teo teoVar = this.b;
            tep tepVar = (tep) teoVar.a.m;
            String str = teoVar.b;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(teo.b());
            bundle.putString("package.name", str2);
            try {
                Context context = teoVar.c;
                numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                teo.d.am("The current version of the app could not be retrieved", new Object[0]);
                numValueOf = null;
            }
            if (numValueOf != null) {
                bundle.putInt("app.version.code", numValueOf.intValue());
            }
            ten tenVar = new ten(this.b, this.c);
            Parcel parcelK = tepVar.k();
            parcelK.writeString(str);
            ifl.c(parcelK, bundle);
            ifl.e(parcelK, tenVar);
            tepVar.n(2, parcelK);
        } catch (RemoteException e) {
            teo.d.an(e, "requestUpdateInfo(%s)", this.a);
            this.c.v(new RuntimeException(e));
        }
    }
}
