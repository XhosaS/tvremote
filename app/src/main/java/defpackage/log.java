package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class log extends kjn {
    public log(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 208, kjdVar, kgdVar, khmVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 224500000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        return iInterfaceQueryLocalInterface instanceof loj ? (loj) iInterfaceQueryLocalInterface : new loj(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.people.contactssync.service.THIRD_PARTY_START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return new Feature[]{lnj.w, lnj.v, lnj.u};
    }
}
