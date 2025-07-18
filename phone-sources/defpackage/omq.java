package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omq extends obe {
    public omq(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 51, oavVar, nwsVar, nwtVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof omp ? (omp) iInterfaceQueryLocalInterface : new omp(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return olz.j;
    }
}
