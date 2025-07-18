package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldm implements zxe {
    final /* synthetic */ TriggerUriParcel a;
    final /* synthetic */ leo b;

    public ldm(leo leoVar, TriggerUriParcel triggerUriParcel) {
        this.a = triggerUriParcel;
        this.b = leoVar;
    }

    private final void c() throws JSONException {
        lbk lbkVar = this.b.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        SparseArray sparseArrayD = laoVar.d();
        TriggerUriParcel triggerUriParcel = this.a;
        sparseArrayD.put(triggerUriParcel.c, Long.valueOf(triggerUriParcel.b));
        lbkVar.m(laoVar);
        int[] iArr = new int[sparseArrayD.size()];
        long[] jArr = new long[sparseArrayD.size()];
        for (int i = 0; i < sparseArrayD.size(); i++) {
            iArr[i] = sparseArrayD.keyAt(i);
            jArr[i] = ((Long) sparseArrayD.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        laoVar.m.b(bundle);
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) throws JSONException {
        leo leoVar = this.b;
        leoVar.g();
        leoVar.d = false;
        lbk lbkVar = leoVar.y;
        int i = 2;
        if (lbkVar.d.t(null, kzg.aT)) {
            String message = th.getMessage();
            leoVar.h = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        leoVar.h = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", lab.b(leoVar.y.e().i()), lab.b(th.toString()));
            leoVar.e = 1;
            leoVar.m().add(this.a);
            return;
        }
        if (i2 != 1) {
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.c.c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", lab.b(leoVar.y.e().i()), th);
            c();
            leoVar.e = 1;
            leoVar.x();
            return;
        }
        leoVar.m().add(this.a);
        if (leoVar.e > ((Integer) kzg.aw.a(null)).intValue()) {
            leoVar.e = 1;
            lab labVar3 = lbkVar.f;
            lbkVar.o(labVar3);
            labVar3.f.c("registerTriggerAsync failed. May try later. App ID, throwable", lab.b(leoVar.y.e().i()), lab.b(th.toString()));
            return;
        }
        lab labVar4 = lbkVar.f;
        lbkVar.o(labVar4);
        labVar4.f.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", lab.b(leoVar.y.e().i()), lab.b(String.valueOf(leoVar.e)), lab.b(th.toString()));
        int i3 = leoVar.e;
        if (leoVar.f == null) {
            leoVar.f = new ldn(leoVar, leoVar.y);
        }
        leoVar.f.c(i3 * 1000);
        int i4 = leoVar.e;
        leoVar.e = i4 + i4;
    }

    @Override // defpackage.zxe
    public final void b(Object obj) throws JSONException {
        leo leoVar = this.b;
        leoVar.g();
        c();
        leoVar.d = false;
        leoVar.e = 1;
        lbk lbkVar = leoVar.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.b("Successfully registered trigger URI", this.a.a);
        leoVar.x();
    }
}
