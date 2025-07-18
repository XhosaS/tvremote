package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onj extends obe implements nwj {
    public final Integer a;
    private final boolean b;
    private final oav c;
    private final Bundle d;

    public onj(Context context, Looper looper, oav oavVar, Bundle bundle, nws nwsVar, nwt nwtVar) {
        super(context, looper, 44, oavVar, nwsVar, nwtVar);
        this.b = true;
        this.c = oavVar;
        this.d = bundle;
        this.a = oavVar.h;
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof onh ? (onh) iInterfaceQueryLocalInterface : new onh(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        oav oavVar = this.c;
        String packageName = this.u.getPackageName();
        String str = oavVar.e;
        if (!packageName.equals(str)) {
            this.d.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.d;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final boolean i() {
        return this.b;
    }

    public final void m() {
        B(new oaq(this));
    }

    public final void q(ong ongVar) {
        try {
            Account account = this.c.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountA = "<<default account>>".equals(account.name) ? nju.c(this.u).a() : null;
            Integer num = this.a;
            ocv.aF(num);
            oby obyVar = new oby(2, account, num.intValue(), googleSignInAccountA);
            onh onhVar = (onh) L();
            onk onkVar = new onk(1, obyVar);
            Parcel parcelK = onhVar.k();
            ifl.c(parcelK, onkVar);
            ifl.e(parcelK, ongVar);
            onhVar.m(12, parcelK);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                ongVar.a(new onl(1, new nve(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
