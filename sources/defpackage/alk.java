package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alk extends aij {
    public alk(Context context, Looper looper, aid aidVar, agc agcVar, agd agdVar) {
        super(context, looper, 51, aidVar, agcVar, agdVar);
    }

    @Override // defpackage.aij, defpackage.aib, defpackage.afx
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.aib
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof alj ? (alj) iInterfaceQueryLocalInterface : new alj(iBinder);
    }

    @Override // defpackage.aib
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.aib
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.aib
    public final aes[] e() {
        return aku.j;
    }
}
