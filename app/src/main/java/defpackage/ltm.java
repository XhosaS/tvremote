package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ltm extends kjn {
    public ltm(Context context, Looper looper, kjd kjdVar, ket ketVar, keu keuVar) {
        super(context, looper, 38, kjdVar, ketVar, keuVar);
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        return iInterfaceQueryLocalInterface instanceof ltl ? (ltl) iInterfaceQueryLocalInterface : new ltl(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.pseudonymous.service.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return lta.b;
    }
}
