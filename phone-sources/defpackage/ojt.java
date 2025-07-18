package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojt extends obe {
    public ojt(Context context, Looper looper, oav oavVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, 208, oavVar, nycVar, nzwVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 224500000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        return iInterfaceQueryLocalInterface instanceof ojv ? (ojv) iInterfaceQueryLocalInterface : new ojv(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.people.contactssync.service.THIRD_PARTY_START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return new nvg[]{ojd.w, ojd.v, ojd.u};
    }
}
