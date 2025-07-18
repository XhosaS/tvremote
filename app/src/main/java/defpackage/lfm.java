package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfm implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ boolean d;
    final /* synthetic */ krc e;
    final /* synthetic */ lgp f;

    public lfm(lgp lgpVar, String str, String str2, AppMetadata appMetadata, boolean z, krc krcVar) {
        this.a = str;
        this.b = str2;
        this.c = appMetadata;
        this.d = z;
        this.e = krcVar;
        this.f = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            try {
                lgp lgpVar = this.f;
                kzj kzjVar = lgpVar.b;
                if (kzjVar == null) {
                    lbk lbkVar = lgpVar.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.c.c("Failed to get user properties; not connected to service", this.a, this.b);
                    lio lioVar = lbkVar.i;
                    lbkVar.m(lioVar);
                    lioVar.Q(this.e, bundle2);
                    return;
                }
                List<UserAttributeParcel> listK = kzjVar.k(this.a, this.b, this.d, this.c);
                String[] strArr = lio.a;
                bundle = new Bundle();
                if (listK != null) {
                    for (UserAttributeParcel userAttributeParcel : listK) {
                        String str = userAttributeParcel.e;
                        if (str != null) {
                            bundle.putString(userAttributeParcel.b, str);
                        } else {
                            Long l = userAttributeParcel.d;
                            if (l != null) {
                                bundle.putLong(userAttributeParcel.b, l.longValue());
                            } else {
                                Double d = userAttributeParcel.g;
                                if (d != null) {
                                    bundle.putDouble(userAttributeParcel.b, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    lgpVar.o();
                    lbk lbkVar2 = lgpVar.y;
                    lio lioVar2 = lbkVar2.i;
                    lbkVar2.m(lioVar2);
                    lioVar2.Q(this.e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    lbk lbkVar3 = this.f.y;
                    lab labVar2 = lbkVar3.f;
                    lbkVar3.o(labVar2);
                    labVar2.c.c("Failed to get user properties; remote exception", this.a, e);
                    lbk lbkVar4 = this.f.y;
                    lio lioVar3 = lbkVar4.i;
                    lbkVar4.m(lioVar3);
                    lioVar3.Q(this.e, bundle);
                }
            } catch (RemoteException e3) {
                bundle = bundle2;
                e = e3;
            } catch (Throwable th) {
                th = th;
                lbk lbkVar5 = this.f.y;
                lio lioVar4 = lbkVar5.i;
                lbkVar5.m(lioVar4);
                lioVar4.Q(this.e, bundle2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bundle2 = bundle;
            lbk lbkVar52 = this.f.y;
            lio lioVar42 = lbkVar52.i;
            lbkVar52.m(lioVar42);
            lioVar42.Q(this.e, bundle2);
            throw th;
        }
    }
}
