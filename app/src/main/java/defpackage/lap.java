package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class lap implements Runnable {
    final /* synthetic */ ServiceConnection a;
    final /* synthetic */ laq b;
    final /* synthetic */ jvd c;

    public lap(laq laqVar, jvd jvdVar, ServiceConnection serviceConnection) {
        this.c = jvdVar;
        this.a = serviceConnection;
        this.b = laqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        laq laqVar = this.b;
        lar larVar = laqVar.b;
        lbk lbkVar = larVar.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        Bundle bundle2 = new Bundle();
        String str = laqVar.a;
        bundle2.putString("package_name", str);
        jvd jvdVar = this.c;
        try {
            Parcel parcelA = jvdVar.a();
            erv.b(parcelA, bundle2);
            Parcel parcelB = jvdVar.b(1, parcelA);
            bundle = (Bundle) erv.a(parcelB, Bundle.CREATOR);
            parcelB.recycle();
        } catch (Exception e) {
            lbk lbkVar2 = larVar.a;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.c.b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        if (bundle == null) {
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.c.a("Install Referrer Service returned a null response");
            bundle = null;
        }
        lbk lbkVar3 = larVar.a;
        lbh lbhVar2 = lbkVar3.g;
        lbkVar3.o(lbhVar2);
        lbhVar2.g();
        lbkVar3.p();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                lab labVar3 = lbkVar3.f;
                lbkVar3.o(labVar3);
                labVar3.f.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    lab labVar4 = lbkVar3.f;
                    lbkVar3.o(labVar4);
                    labVar4.c.a("No referrer defined in Install Referrer response");
                } else {
                    lab labVar5 = lbkVar3.f;
                    lbkVar3.o(labVar5);
                    kzz kzzVar = labVar5.k;
                    kzzVar.b("InstallReferrer API result", string);
                    lio lioVar = lbkVar3.i;
                    lbkVar3.m(lioVar);
                    Bundle bundleX = lioVar.x(Uri.parse("?".concat(string)));
                    if (bundleX == null) {
                        lbkVar3.o(labVar5);
                        labVar5.c.a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) kzg.bh.a(null)).split(","));
                        Iterator<String> it = bundleX.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (listAsList.contains(it.next())) {
                                long j2 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j2 > 0) {
                                    bundleX.putLong("click_timestamp", j2);
                                }
                            }
                        }
                        lao laoVar = lbkVar3.e;
                        lbkVar3.m(laoVar);
                        lal lalVar = laoVar.e;
                        lalVar.a();
                        if (j == lalVar.a) {
                            lbkVar3.o(labVar5);
                            kzzVar.a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (lbkVar3.s()) {
                            lbkVar3.m(laoVar);
                            lalVar.b(j);
                            lbkVar3.o(labVar5);
                            kzzVar.b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleX.putString("_cis", "referrer API v2");
                            leo leoVar = lbkVar3.l;
                            lbkVar3.n(leoVar);
                            leoVar.L("_cmp", bundleX, str);
                        }
                    }
                }
            }
        }
        kle.a().b(lbkVar3.a, this.a);
    }
}
