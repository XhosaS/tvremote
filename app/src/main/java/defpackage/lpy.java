package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lpy extends kjn {
    private static volatile Bundle v;
    private static volatile Bundle w;
    public final String t;
    public final String u;
    private final HashMap x;

    public lpy(Context context, Looper looper, ket ketVar, keu keuVar, String str, kjd kjdVar) {
        super(context.getApplicationContext(), looper, 5, kjdVar, ketVar, keuVar);
        this.x = new HashMap();
        this.t = str;
        this.u = kjdVar.d;
    }

    public static Status K(int i, Bundle bundle) {
        return new Status(i, null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"), null);
    }

    @Override // defpackage.kiz
    protected final void A(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                J(bundle.getBundle("post_init_configuration"));
            }
        }
        super.A(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final synchronized void J(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        lqa.a = bundle.getBoolean("use_contactables_api", true);
        lqt.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        v = bundle.getBundle("config.email_type_map");
        w = bundle.getBundle("config.phone_type_map");
    }

    public final void L(kfv kfvVar, int i) {
        super.y();
        lpu lpuVar = new lpu(kfvVar);
        try {
            lpp lppVar = (lpp) super.v();
            ApiMetadata apiMetadataA = knv.a();
            Parcel parcelA = lppVar.a();
            erv.c(parcelA, lpuVar);
            parcelA.writeInt(0);
            parcelA.writeInt(0);
            parcelA.writeString(null);
            parcelA.writeString(null);
            parcelA.writeInt(i);
            erv.b(parcelA, apiMetadataA);
            lppVar.J(305, parcelA);
        } catch (RemoteException unused) {
            Parcelable.Creator creator = ApiMetadata.CREATOR;
            lpuVar.d(8, null, null);
        }
    }

    public final kjx M(kfv kfvVar, String str, int i) {
        kjx kjxVar;
        lpv lpvVar = new lpv(kfvVar);
        try {
            lpp lppVar = (lpp) super.v();
            ApiMetadata apiMetadataA = knv.a();
            Parcel parcelA = lppVar.a();
            erv.c(parcelA, lpvVar);
            parcelA.writeString(str);
            parcelA.writeString(null);
            parcelA.writeInt(i);
            parcelA.writeInt(1);
            erv.b(parcelA, apiMetadataA);
            Parcel parcelB = lppVar.b(505, parcelA);
            IBinder strongBinder = parcelB.readStrongBinder();
            if (strongBinder == null) {
                kjxVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                kjxVar = iInterfaceQueryLocalInterface instanceof kjx ? (kjx) iInterfaceQueryLocalInterface : new kjx(strongBinder);
            }
            parcelB.recycle();
            return kjxVar;
        } catch (RemoteException unused) {
            Parcelable.Creator creator = ApiMetadata.CREATOR;
            lpvVar.e(8, null, null, null);
            return null;
        }
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return iInterfaceQueryLocalInterface instanceof lpp ? (lpp) iInterfaceQueryLocalInterface : new lpp(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return lnj.A;
    }

    @Override // defpackage.kiz
    protected final Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.t);
        bundle.putString("real_client_package_name", this.u);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    @Override // defpackage.kiz
    public final void z() {
        HashMap map = this.x;
        synchronized (map) {
            if (m()) {
                for (lpt lptVar : map.values()) {
                    khi khiVar = lptVar.a;
                    khiVar.a = null;
                    khiVar.b = null;
                    try {
                        ((lpp) super.v()).e(lptVar, false, 0, knv.a());
                    } catch (RemoteException e) {
                        lqg.a("Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        lqg.a("PeopleService is in unexpected state", e2);
                    }
                }
                this.x.clear();
            } else {
                this.x.clear();
            }
        }
        super.z();
    }
}
