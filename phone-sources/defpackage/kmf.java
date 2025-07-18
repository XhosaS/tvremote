package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public kmf(Context context) {
        this.b = context;
        this.a = "image_manager_disk_cache";
    }

    public final void a() {
        ((kmg) this.a).a();
    }

    public final void b(hij hijVar) {
        int i = hijVar.a;
        if (i == 0) {
            krd.b("The BillingClient is ready.");
            ((kmg) this.a).b((Activity) this.b);
            return;
        }
        kmg kmgVar = (kmg) this.a;
        jde jdeVar = kmgVar.g;
        if (jdeVar != null) {
            Objects.toString(hijVar);
            jdeVar.a(i, new IllegalStateException("Failed to establish connection. BillingResponse=".concat(hijVar.toString())));
        }
        kmgVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.hij r13, defpackage.hfw r14) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmf.c(hij, hfw):void");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ysn] */
    public final void d(Object obj) {
        gtb gtbVar = (gtb) this.b;
        this.a.b(gtbVar.e(obj) ? new gst(gtbVar.d()) : gss.a);
    }

    public kmf(gtb gtbVar, ysk yskVar) {
        this.b = gtbVar;
        this.a = yskVar;
    }

    public kmf(kmg kmgVar, Activity activity) {
        this.a = kmgVar;
        this.b = activity;
    }

    public /* synthetic */ kmf(kmg kmgVar, Activity activity, byte[] bArr) {
        this.a = kmgVar;
        this.b = activity;
    }
}
