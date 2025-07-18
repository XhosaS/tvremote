package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkd implements qjv {
    public static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final xbw c;
    private final qjq d;

    public qkd(Context context, xbw xbwVar, qjq qjqVar) {
        xbwVar.getClass();
        qjqVar.getClass();
        this.b = context;
        this.c = xbwVar;
        this.d = qjqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[Catch: qjr -> 0x00ce, TryCatch #0 {qjr -> 0x00ce, blocks: (B:2:0x0000, B:4:0x0037, B:5:0x003a, B:7:0x0041, B:8:0x004a, B:12:0x0052, B:14:0x0055, B:18:0x005c, B:20:0x0062, B:23:0x0069, B:25:0x0071, B:26:0x0074, B:33:0x008a, B:36:0x0098, B:45:0x00ba, B:42:0x00ab, B:46:0x00bd), top: B:51:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ defpackage.qdl d(defpackage.qkd r8, boolean r9, boolean r10, boolean r11, int r12) {
        /*
            viq r0 = defpackage.viq.a     // Catch: defpackage.qjr -> Lce
            vtw r0 = r0.m()     // Catch: defpackage.qjr -> Lce
            r0.getClass()     // Catch: defpackage.qjr -> Lce
            vix r1 = defpackage.vix.a     // Catch: defpackage.qjr -> Lce
            vtw r1 = r1.m()     // Catch: defpackage.qjr -> Lce
            r1.getClass()     // Catch: defpackage.qjr -> Lce
            android.content.Context r2 = r8.b     // Catch: defpackage.qjr -> Lce
            java.lang.String r3 = r2.getPackageName()     // Catch: defpackage.qjr -> Lce
            r3.getClass()     // Catch: defpackage.qjr -> Lce
            defpackage.vfi.A(r3, r1)     // Catch: defpackage.qjr -> Lce
            java.lang.String r3 = "user"
            java.lang.Object r3 = r2.getSystemService(r3)     // Catch: defpackage.qjr -> Lce
            r3.getClass()     // Catch: defpackage.qjr -> Lce
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: defpackage.qjr -> Lce
            android.os.UserHandle r4 = android.os.Process.myUserHandle()     // Catch: defpackage.qjr -> Lce
            long r3 = r3.getSerialNumberForUser(r4)     // Catch: defpackage.qjr -> Lce
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L3a
            defpackage.vfi.B(r3, r1)     // Catch: defpackage.qjr -> Lce
        L3a:
            r3 = r12 & 1
            r4 = 1
            r3 = r3 ^ r4
            r9 = r9 & r3
            if (r9 == 0) goto L4a
            qjq r9 = r8.d     // Catch: defpackage.qjr -> Lce
            java.lang.String r9 = r9.c()     // Catch: defpackage.qjr -> Lce
            defpackage.vfi.C(r9, r1)     // Catch: defpackage.qjr -> Lce
        L4a:
            r9 = r12 & 2
            r3 = 0
            if (r9 == 0) goto L51
            r9 = r3
            goto L52
        L51:
            r9 = r4
        L52:
            r9 = r9 & r10
            if (r9 == 0) goto L80
            r9 = r12 & 8
            if (r9 == 0) goto L5b
            r9 = r4
            goto L5c
        L5b:
            r9 = r3
        L5c:
            java.lang.String r8 = r8.e(r9)     // Catch: defpackage.qjr -> Lce
            if (r8 == 0) goto L80
            int r9 = r8.length()     // Catch: defpackage.qjr -> Lce
            if (r9 != 0) goto L69
            goto L80
        L69:
            vuc r9 = r1.b     // Catch: defpackage.qjr -> Lce
            boolean r9 = r9.A()     // Catch: defpackage.qjr -> Lce
            if (r9 != 0) goto L74
            r1.u()     // Catch: defpackage.qjr -> Lce
        L74:
            vuc r9 = r1.b     // Catch: defpackage.qjr -> Lce
            vix r9 = (defpackage.vix) r9     // Catch: defpackage.qjr -> Lce
            int r10 = r9.b     // Catch: defpackage.qjr -> Lce
            r10 = r10 | 2
            r9.b = r10     // Catch: defpackage.qjr -> Lce
            r9.d = r8     // Catch: defpackage.qjr -> Lce
        L80:
            r8 = r12 & 4
            if (r8 == 0) goto L85
            r4 = r3
        L85:
            r8 = r4 & r11
            if (r8 != 0) goto L8a
            goto Lbd
        L8a:
            android.content.ContentResolver r8 = r2.getContentResolver()     // Catch: java.lang.SecurityException -> La8 defpackage.qjr -> Lce
            java.lang.String r9 = "android_id"
            long r8 = defpackage.opc.b(r8, r9, r5)     // Catch: java.lang.SecurityException -> La8 defpackage.qjr -> Lce
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto Lb6
            tvn r10 = defpackage.qkd.a     // Catch: java.lang.SecurityException -> La6 defpackage.qjr -> Lce
            tuv r10 = r10.g()     // Catch: java.lang.SecurityException -> La6 defpackage.qjr -> Lce
            tvk r10 = (defpackage.tvk) r10     // Catch: java.lang.SecurityException -> La6 defpackage.qjr -> Lce
            java.lang.String r11 = "Failed to get android ID."
            r10.s(r11)     // Catch: java.lang.SecurityException -> La6 defpackage.qjr -> Lce
            goto Lb6
        La6:
            r10 = move-exception
            goto Lab
        La8:
            r8 = move-exception
            r10 = r8
            r8 = r5
        Lab:
            tvn r11 = defpackage.qkd.a     // Catch: defpackage.qjr -> Lce
            tuv r11 = r11.f()     // Catch: defpackage.qjr -> Lce
            java.lang.String r12 = "Exception reading GServices key."
            defpackage.a.co(r11, r12, r10)     // Catch: defpackage.qjr -> Lce
        Lb6:
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto Lbd
            defpackage.vfi.z(r8, r1)     // Catch: defpackage.qjr -> Lce
        Lbd:
            vix r8 = defpackage.vfi.y(r1)     // Catch: defpackage.qjr -> Lce
            defpackage.ves.g(r8, r0)     // Catch: defpackage.qjr -> Lce
            viq r8 = defpackage.ves.f(r0)     // Catch: defpackage.qjr -> Lce
            qdn r9 = new qdn     // Catch: defpackage.qjr -> Lce
            r9.<init>(r8)     // Catch: defpackage.qjr -> Lce
            goto Ld4
        Lce:
            r8 = move-exception
            qkc r9 = new qkc
            r9.<init>(r8)
        Ld4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.d(qkd, boolean, boolean, boolean, int):qdl");
    }

    private final synchronized String e(boolean z) {
        xbw xbwVar = this.c;
        String string = ((SharedPreferences) xbwVar.b()).getString("fetch_only_id", null);
        if (!TextUtils.isEmpty(string) || !z) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        ((SharedPreferences) xbwVar.b()).edit().putString("fetch_only_id", string2).apply();
        return string2;
    }

    @Override // defpackage.qjv
    public final qdl a(qju qjuVar) {
        return d(this, qjuVar.a, qjuVar.b, qjuVar.c, 8);
    }

    @Override // defpackage.qjv
    public final qdl b(boolean z) {
        qdl qdlVarD = d(this, false, z, z, 1);
        if (!(qdlVarD instanceof qdn)) {
            return (qdi) qdlVarD;
        }
        vtw vtwVarM = vhf.a.m();
        vtwVarM.getClass();
        viq viqVar = (viq) ((qdn) qdlVarD).a;
        vix vixVar = viqVar.b == 1 ? (vix) viqVar.c : vix.a;
        vtw vtwVarM2 = vhj.a.m();
        if ((vixVar.b & 1) != 0) {
            String str = vixVar.c;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vhj vhjVar = (vhj) vtwVarM2.b;
            str.getClass();
            vhjVar.b = 1 | vhjVar.b;
            vhjVar.c = str;
        }
        if ((vixVar.b & 2) != 0) {
            String str2 = vixVar.d;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vhj vhjVar2 = (vhj) vtwVarM2.b;
            str2.getClass();
            vhjVar2.b |= 2;
            vhjVar2.d = str2;
        }
        if ((vixVar.b & 4) != 0) {
            long j = vixVar.e;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vhj vhjVar3 = (vhj) vtwVarM2.b;
            vhjVar3.b |= 4;
            vhjVar3.e = j;
        }
        if ((vixVar.b & 8) != 0) {
            String str3 = vixVar.f;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vhj vhjVar4 = (vhj) vtwVarM2.b;
            str3.getClass();
            vhjVar4.b |= 8;
            vhjVar4.f = str3;
        }
        if ((vixVar.b & 16) != 0) {
            long j2 = vixVar.g;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vhj vhjVar5 = (vhj) vtwVarM2.b;
            vhjVar5.b |= 16;
            vhjVar5.g = j2;
        }
        vhj vhjVar6 = (vhj) vtwVarM2.r();
        vhjVar6.getClass();
        ves.e(vhjVar6, vtwVarM);
        return new qdn(ves.d(vtwVarM));
    }

    @Override // defpackage.qjv
    public final void c() {
        xbw xbwVar = this.c;
        if (TextUtils.isEmpty(((SharedPreferences) xbwVar.b()).getString("fetch_only_id", null))) {
            return;
        }
        ((SharedPreferences) xbwVar.b()).edit().putString("fetch_only_id", UUID.randomUUID().toString()).apply();
    }
}
