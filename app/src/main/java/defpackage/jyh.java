package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jyh extends kjn {
    public jyh(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 153, kjdVar, kgdVar, khmVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
        return iInterfaceQueryLocalInterface instanceof jya ? (jya) iInterfaceQueryLocalInterface : new jya(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.auth.account.data.IAccountDataService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.auth.account.data.service.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return new Feature[]{jwf.a, jwf.b, jwf.c, jwf.d, jwf.e, jwf.f};
    }
}
