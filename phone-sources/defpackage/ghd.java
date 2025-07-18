package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghd {
    public final Object a;
    public final Object b;

    public ghd() {
        this((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:19:0x003a, B:20:0x003d, B:21:0x0042, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ghd d(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6b
            zgn[] r0 = new defpackage.zgn[r0]     // Catch: java.io.IOException -> L6b
            zgk r1 = new zgk     // Catch: java.io.IOException -> L6b
            r1.<init>()     // Catch: java.io.IOException -> L6b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6b
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6b
            java.lang.String[] r5 = defpackage.hhf.a     // Catch: java.io.IOException -> L6b
            r6 = 34
            r1.M(r6)     // Catch: java.io.IOException -> L6b
            int r7 = r4.length()     // Catch: java.io.IOException -> L6b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6b
            if (r10 == 0) goto L42
            goto L38
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.R(r4, r9, r8)     // Catch: java.io.IOException -> L6b
        L3d:
            r1.V(r10)     // Catch: java.io.IOException -> L6b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.R(r4, r9, r7)     // Catch: java.io.IOException -> L6b
        L4a:
            r1.M(r6)     // Catch: java.io.IOException -> L6b
            r1.d()     // Catch: java.io.IOException -> L6b
            zgn r4 = r1.s()     // Catch: java.io.IOException -> L6b
            r0[r3] = r4     // Catch: java.io.IOException -> L6b
            int r3 = r3 + 1
            goto La
        L59:
            ghd r1 = new ghd     // Catch: java.io.IOException -> L6b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
            wcq r2 = defpackage.zhc.c     // Catch: java.io.IOException -> L6b
            zhc r0 = r2.aB(r0)     // Catch: java.io.IOException -> L6b
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
            return r1
        L6b:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghd.d(java.lang.String[]):ghd");
    }

    public final void a() {
        ((ghh) this.a).a();
    }

    public final void b(Bundle bundle) {
        ghh ghhVar = (ghh) this.a;
        if (!ghhVar.c) {
            ghhVar.a();
        }
        ghe gheVar = ghhVar.a;
        if (gheVar.getLifecycle().a().a(dvd.d)) {
            dvd dvdVarA = gheVar.getLifecycle().a();
            Objects.toString(dvdVarA);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(dvdVarA)));
        }
        if (ghhVar.e) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleB = null;
        if (bundle != null && ggz.f(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleB = ggz.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        ghhVar.d = bundleB;
        ghhVar.e = true;
    }

    public final void c(Bundle bundle) {
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        Object obj = this.a;
        ghh ghhVar = (ghh) obj;
        Bundle bundle2 = ghhVar.d;
        if (bundle2 != null) {
            bundleJ.putAll(bundle2);
        }
        synchronized (ghhVar.g) {
            for (Map.Entry entry : ((ghh) obj).b.entrySet()) {
                ghf.a(bundleJ, (String) entry.getKey(), ((ghb) entry.getValue()).saveState());
            }
        }
        if (bundleJ.isEmpty()) {
            return;
        }
        ghf.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleJ);
    }

    public final ghd e(float[] fArr) {
        int iJ;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = (float[]) this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            if (iBinarySearch >= 0) {
                iJ = ((int[]) this.b)[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iJ = ((int[]) this.b)[0];
                } else {
                    int[] iArr2 = (int[]) this.b;
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        iJ = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iJ = hjs.j((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = iJ;
        }
        return new ghd(fArr, iArr);
    }

    public ghd(ghh ghhVar) {
        this.a = ghhVar;
        this.b = new ghc(ghhVar);
    }

    public ghd(hig higVar) {
        this.a = higVar.a;
        this.b = higVar.b;
    }

    public ghd(String str, yjv yjvVar) {
        this.a = str;
        this.b = new fyq(yjvVar, 11);
    }

    public ghd(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    private ghd(String[] strArr, zhc zhcVar) {
        this.b = strArr;
        this.a = zhcVar;
    }

    public ghd(String str) {
        this.a = str;
        this.b = new JSONObject(str);
    }

    public /* synthetic */ ghd(byte[] bArr) {
        yvc yvcVarA = yvd.a(new yfw(Integer.MIN_VALUE, null));
        this.a = yvcVarA;
        this.b = new dbm(yvcVarA, 2);
    }

    public ghd(fzx fzxVar, Object obj) {
        fzxVar.getClass();
        this.b = fzxVar;
        this.a = obj;
        if (fzxVar != fzx.a && obj == null) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }

    public ghd(gex gexVar) {
        this.a = gexVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.b = setNewSetFromMap;
    }
}
