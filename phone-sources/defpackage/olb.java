package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olb extends obe {
    private static volatile Bundle d;
    private static volatile Bundle e;
    public final String a;
    public final String b;
    public final Context c;
    private final HashMap f;

    public olb(Context context, Looper looper, nws nwsVar, nwt nwtVar, String str, oav oavVar) {
        super(context.getApplicationContext(), looper, 5, oavVar, nwsVar, nwtVar);
        this.f = new HashMap();
        this.c = context;
        this.a = str;
        this.b = oavVar.e;
    }

    static /* bridge */ /* synthetic */ Status q(int i, Bundle bundle) {
        return new Status(i, null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"));
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return iInterfaceQueryLocalInterface instanceof okt ? (okt) iInterfaceQueryLocalInterface : new okt(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return ojd.A;
    }

    @Override // defpackage.oat
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    public final synchronized void m(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        old.a = bundle.getBoolean("use_contactables_api", true);
        ols.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        d = bundle.getBundle("config.email_type_map");
        e = bundle.getBundle("config.phone_type_map");
    }

    @Override // defpackage.oat, defpackage.nwj
    public final void n() {
        HashMap map = this.f;
        synchronized (map) {
            if (D()) {
                for (okw okwVar : map.values()) {
                    okwVar.a.a();
                    try {
                        s().a(okwVar, false, 0, ocv.q());
                    } catch (RemoteException e2) {
                        ocv.l("Failed to unregister listener", e2);
                    } catch (IllegalStateException e3) {
                        ocv.l("PeopleService is in unexpected state", e3);
                    }
                }
                this.f.clear();
            } else {
                this.f.clear();
            }
        }
        super.n();
    }

    @Override // defpackage.oat
    protected final void p(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                m(bundle.getBundle("post_init_configuration"));
            }
        }
        super.p(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final void r(nxs nxsVar, int i) {
        super.N();
        okx okxVar = new okx(nxsVar);
        try {
            okt oktVarS = s();
            nwl nwlVarQ = ocv.q();
            Parcel parcelK = oktVarS.k();
            ifl.e(parcelK, okxVar);
            parcelK.writeInt(0);
            parcelK.writeInt(0);
            parcelK.writeString(null);
            parcelK.writeString(null);
            parcelK.writeInt(i);
            ifl.c(parcelK, nwlVarQ);
            oktVarS.m(305, parcelK);
        } catch (RemoteException unused) {
            okxVar.a(8, null, null);
        }
    }

    public final okt s() {
        return (okt) super.L();
    }
}
