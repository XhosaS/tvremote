package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njh extends obe {
    public final GoogleSignInOptions a;

    public njh(Context context, Looper looper, oav oavVar, GoogleSignInOptions googleSignInOptions, nws nwsVar, nwt nwtVar) {
        super(context, looper, 91, oavVar, nwsVar, nwtVar);
        nje njeVar = googleSignInOptions != null ? new nje(googleSignInOptions) : new nje();
        njeVar.b = oey.a();
        if (!oavVar.c.isEmpty()) {
            Iterator it = oavVar.c.iterator();
            while (it.hasNext()) {
                njeVar.c((Scope) it.next(), new Scope[0]);
            }
        }
        this.a = njeVar.a();
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof njs ? (njs) iInterfaceQueryLocalInterface : new njs(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // defpackage.oat, defpackage.nwj
    public final Intent j() {
        njn.a.c("getSignInIntent()");
        Context context = this.u;
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.a);
        Intent intent = new Intent(SignInHubActivity.ACTION_GOOGLE_SIGN_IN);
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final boolean k() {
        return true;
    }
}
