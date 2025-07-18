package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oes extends obe {
    public final ocv a;

    public oes(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 63, oavVar, nwsVar, nwtVar);
        this.a = new ocv();
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof oeu ? (oeu) iInterfaceQueryLocalInterface : new oeu(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }
}
