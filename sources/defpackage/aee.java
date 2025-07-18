package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aee extends aij {
    public aee(Context context, Looper looper, aid aidVar, agc agcVar, agd agdVar) {
        super(context, looper, 40, aidVar, agcVar, agdVar);
    }

    @Override // defpackage.aij, defpackage.aib, defpackage.afx
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.aib
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof aeh ? (aeh) iInterfaceQueryLocalInterface : new aeh(iBinder);
    }

    @Override // defpackage.aib
    protected final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.aib
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.aib
    public final aes[] e() {
        return new aes[]{adr.a};
    }
}
