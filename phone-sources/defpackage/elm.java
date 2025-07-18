package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elm {
    static final ImmutableMap b;
    public final int c;
    private final SparseArray e = new SparseArray();
    public static final elm a = new elm(ImmutableList.of(ell.a));
    private static final ImmutableList d = ImmutableList.of(2, 5, 6);

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(5, 6);
        builder.put(17, 6);
        builder.put(7, 6);
        builder.put(30, 10);
        builder.put(18, 6);
        builder.put(6, 8);
        builder.put(8, 8);
        builder.put(14, 8);
        b = builder.buildOrThrow();
    }

    public elm(List list) {
        for (int i = 0; i < list.size(); i++) {
            ell ellVar = (ell) list.get(i);
            this.e.put(ellVar.b, ellVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            iMax = Math.max(iMax, ((ell) this.e.valueAt(i2)).c);
        }
        this.c = iMax;
    }

    @Deprecated
    public static elm b(Context context) {
        return f(context, dyo.a, null);
    }

    public static ImmutableList c(int[] iArr, int i) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            builder.add((ImmutableList.Builder) new ell(i2, i));
        }
        return builder.build();
    }

    public static boolean d() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    static elm f(Context context, dyo dyoVar, dxc dxcVar) {
        return g(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dyoVar, dxcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.elm g(android.content.Context r9, android.content.Intent r10, defpackage.dyo r11, defpackage.dxc r12) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elm.g(android.content.Context, android.content.Intent, dyo, dxc):elm");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[PHI: r1
  0x0036: PHI (r1v3 int) = (r1v2 int), (r1v6 int) binds: [B:11:0x002a, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(defpackage.dze r12, defpackage.dyo r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elm.a(dze, dyo):android.util.Pair");
    }

    public final boolean e(int i) {
        return edt.ag(this.e, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof defpackage.elm
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            elm r9 = (defpackage.elm) r9
            android.util.SparseArray r1 = r8.e
            android.util.SparseArray r3 = r9.e
            java.lang.String r4 = defpackage.edt.a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L1f
            boolean r1 = defpackage.elk$$ExternalSyntheticApiModelOutline0.m(r1, r3)
            if (r1 == 0) goto L48
            goto L41
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L48
            r5 = r2
        L2a:
            if (r5 >= r4) goto L41
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L48
            int r5 = r5 + 1
            goto L2a
        L41:
            int r1 = r8.c
            int r9 = r9.c
            if (r1 != r9) goto L48
            return r0
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elm.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = edt.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.e;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return this.c + (iContentHashCode * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.c + ", audioProfiles=" + this.e.toString() + "]";
    }
}
