package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsn extends kjn {
    public lsn(Context context, Looper looper, kjd kjdVar, ket ketVar, keu keuVar) {
        super(context, looper, 51, kjdVar, ketVar, keuVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof lsm ? (lsm) iInterfaceQueryLocalInterface : new lsm(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return lrd.j;
    }
}
