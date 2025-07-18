package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbx implements qbq {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final pwy c;
    private final pvg d;

    public qbx(Context context, pwy pwyVar, pvg pvgVar) {
        pvgVar.getClass();
        this.b = context;
        this.c = pwyVar;
        this.d = pvgVar;
    }

    private final void b(String str) {
        if (str.length() == 0) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((tvk) ((tvk) a.f()).i(e)).v("Failed to start activity for destination URL: %s", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d  */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r13v82, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, lie] */
    @Override // defpackage.qbq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pvs r13, defpackage.yih r14) throws defpackage.vuq {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbx.a(pvs, yih):java.lang.Object");
    }
}
