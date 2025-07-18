package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class niw extends obe {
    private final nir a;

    public niw(Context context, Looper looper, oav oavVar, nir nirVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, 68, oavVar, nwsVar, nwtVar);
        niq niqVar = new niq(nirVar == null ? nir.a : nirVar);
        niqVar.b = oey.a();
        this.a = new nir(niqVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof nix ? (nix) iInterfaceQueryLocalInterface : new nix(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        nir nirVar = this.a;
        bundle.putBoolean("force_save_dialog", nirVar.c);
        bundle.putString("log_session_id", nirVar.d);
        return bundle;
    }
}
