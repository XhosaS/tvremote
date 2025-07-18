package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrp extends beb {
    public final Set b;
    private final Context d;
    public final vrn a = new vrn("FuturesMixinRF");
    public final int c = Process.myPid();

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vrp(defpackage.bdl r11, android.content.Context r12) {
        /*
            r10 = this;
            r10.<init>()
            vrn r0 = new vrn
            java.lang.String r1 = "FuturesMixinRF"
            r0.<init>(r1)
            r10.a = r0
            r10.d = r12
            int r0 = android.os.Process.myPid()
            r10.c = r0
            beq r0 = r11.b
            java.lang.String r1 = "future_saved_state"
            java.lang.Object r0 = r0.b(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2 = 1
            if (r0 == 0) goto Lc5
            java.lang.String r3 = "last_process_id"
            int r3 = r0.getInt(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            r6 = 0
            if (r4 < r5) goto L5b
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r12.getSystemService(r4)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            if (r4 == 0) goto L5b
            java.lang.String r12 = r12.getPackageName()
            java.util.List r12 = defpackage.ms$$ExternalSyntheticApiModelOutline0.m(r4, r12, r3, r2)
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L5b
            java.lang.Object r12 = r12.get(r6)
            android.app.ApplicationExitInfo r12 = defpackage.ms$$ExternalSyntheticApiModelOutline0.m(r12)
            int r12 = defpackage.ms$$ExternalSyntheticApiModelOutline0.m(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            yqt r12 = defpackage.yqt.i(r12)
            goto L5d
        L5b:
            ypv r12 = defpackage.ypv.a
        L5d:
            java.lang.String r3 = "future_wrappers"
            android.os.Parcelable[] r3 = r0.getParcelableArray(r3)
            java.util.HashSet r4 = new java.util.HashSet
            int r5 = r3.length
            r4.<init>(r5)
            r10.b = r4
        L6b:
            if (r6 >= r5) goto Lcc
            r4 = r3[r6]
            com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture r4 = (com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) r4
            yqt r7 = r4.b
            boolean r7 = r7.g()
            if (r7 != 0) goto L7a
            goto Lbd
        L7a:
            yqt r7 = r4.b
            java.lang.Object r7 = r7.c()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 == r2) goto Lbd
            r8 = 2
            if (r7 != r8) goto Lae
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "ParcelableFuture was Parceled by a lifecycle change before it completed."
            r7.<init>(r8)
            boolean r8 = r12.g()
            if (r8 == 0) goto La4
            java.lang.String r8 = " process exit reason code: "
            r7.append(r8)
            java.lang.Object r8 = r12.c()
            r7.append(r8)
        La4:
            vrr r8 = new vrr
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            goto Lb9
        Lae:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "ParcelableFuture read in unexpected value for hasResult: "
            java.lang.String r7 = defpackage.a.b(r7, r9)
            r8.<init>(r7)
        Lb9:
            r4.c = r8
            r4.a = r2
        Lbd:
            java.util.Set r7 = r10.b
            r7.add(r4)
            int r6 = r6 + 1
            goto L6b
        Lc5:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r2)
            r10.b = r12
        Lcc:
            vrn r12 = r10.a
            r12.a(r0)
            vro r12 = new vro
            r12.<init>()
            beq r11 = r11.b
            r11.d(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrp.<init>(bdl, android.content.Context):void");
    }
}
