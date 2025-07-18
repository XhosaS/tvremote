package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jwd extends kjn {
    public jwd(Context context, Looper looper, kjd kjdVar, ket ketVar, keu keuVar) {
        super(context, looper, 154, kjdVar, ketVar, keuVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 12200000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        return iInterfaceQueryLocalInterface instanceof jwe ? (jwe) iInterfaceQueryLocalInterface : new jwe(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.audit.service.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }
}
