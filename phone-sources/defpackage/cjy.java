package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjy implements cik {
    private final /* synthetic */ int c;
    public static final cjy b = new cjy(1);
    public static final cjy a = new cjy(0);

    private cjy(int i) {
        this.c = i;
    }

    @Override // defpackage.cik
    public final Typeface a(Context context, cil cilVar) {
        if (this.c == 0) {
            Objects.toString(cilVar);
            throw new IllegalStateException("GoogleFont only support async loading: ".concat(String.valueOf(cilVar)));
        }
        ciw ciwVar = cilVar instanceof ciw ? (ciw) cilVar : null;
        if (ciwVar != null) {
            return cko.f().c(ciwVar.c, ciwVar.d, ciwVar.b, context);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    @Override // defpackage.cik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r15, defpackage.cil r16, defpackage.yih r17) {
        /*
            r14 = this;
            r0 = r16
            int r1 = r14.c
            if (r1 != 0) goto Lbe
            boolean r1 = r0 instanceof defpackage.cjw
            if (r1 == 0) goto La5
            r1 = r0
            cjw r1 = (defpackage.cjw) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "name="
            r2.<init>(r3)
            java.lang.String r3 = r1.c
            r2.append(r3)
            java.lang.String r3 = "&weight="
            r2.append(r3)
            cji r3 = r1.e
            int r4 = r3.h
            r2.append(r4)
            java.lang.String r4 = "&italic="
            r2.append(r4)
            int r4 = r1.f
            r4 = 0
            r5 = 1
            boolean r6 = defpackage.a.r(r4, r5)
            r2.append(r6)
            java.lang.String r6 = "&besteffort=true"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            ctt r6 = new ctt
            cjv r1 = r1.d
            r6.<init>(r2)
            cji r1 = defpackage.cji.g
            int r1 = r3.compareTo(r1)
            if (r1 < 0) goto L4f
            r1 = r5
            goto L50
        L4f:
            r1 = r4
        L50:
            boolean r2 = defpackage.a.r(r4, r5)
            if (r2 == 0) goto L5b
            if (r1 == 0) goto L5a
            r1 = 3
            goto L5e
        L5a:
            r1 = r4
        L5b:
            if (r2 == 0) goto L60
            r1 = 2
        L5e:
            r9 = r1
            goto L65
        L60:
            if (r1 == 0) goto L64
            r9 = r5
            goto L65
        L64:
            r9 = r4
        L65:
            yof r1 = new yof
            yih r2 = defpackage.wcq.S(r17)
            r1.<init>(r2, r5)
            r1.v()
            cjx r13 = new cjx
            r13.<init>(r1, r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L80
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L80:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L8c
            android.os.Handler r0 = defpackage.eo$$ExternalSyntheticApiModelOutline0.m(r0)
            r12 = r0
            goto L92
        L8c:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            r12 = r2
        L92:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r6
            java.util.List r8 = defpackage.dhk.b(r0)
            r10 = 0
            r11 = 0
            r7 = r15
            defpackage.crl.n(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = r1.i()
            return r15
        La5:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Only GoogleFontImpl supported (actual "
            r15.<init>(r1)
            r15.append(r0)
            r0 = 41
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r15)
            throw r0
        Lbe:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "All preloaded fonts are optional local."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjy.b(android.content.Context, cil, yih):java.lang.Object");
    }
}
