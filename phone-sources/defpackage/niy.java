package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class niy extends obe {
    private final Bundle a;

    public niy(Context context, Looper looper, oav oavVar, niv nivVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, 16, oavVar, nycVar, nzwVar);
        this.a = nivVar == null ? new Bundle() : new Bundle(nivVar.a);
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof nja ? (nja) iInterfaceQueryLocalInterface : new nja(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        return this.a;
    }

    @Override // defpackage.oat, defpackage.nwj
    public final boolean i() {
        oav oavVar = this.M;
        Account account = oavVar.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((kwy) oavVar.d.get(niu.b)) == null) {
            return !oavVar.b.isEmpty();
        }
        throw null;
    }
}
