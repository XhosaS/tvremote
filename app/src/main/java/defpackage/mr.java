package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mr {
    public Typeface a;
    public String b;
    private final TextView c;
    private final afe d;
    private Typeface e;

    public mr(TextView textView, afe afeVar) {
        this.c = textView;
        this.d = afeVar;
    }

    public final void a(Typeface typeface) {
        this.e = typeface;
        this.d.accept(typeface);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r14) {
        /*
            r13 = this;
            android.widget.TextView r0 = r13.c
            android.graphics.Typeface r1 = r13.a
            android.text.TextPaint r2 = r0.getPaint()
            android.graphics.Typeface r3 = r13.e
            android.graphics.Typeface r4 = r2.getTypeface()
            if (r3 == r4) goto L1b
            java.lang.String r1 = "FontVarSettings"
            java.lang.String r3 = "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint()."
            android.util.Log.w(r1, r3)
            android.graphics.Typeface r1 = r2.getTypeface()
        L1b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 0
            if (r2 < r3) goto L37
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = defpackage.mr$$ExternalSyntheticApiModelOutline0.m(r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto L38
        L37:
            r0 = r4
        L38:
            wt r2 = defpackage.mq.a
            mp r2 = new mp
            r2.<init>(r1, r14, r0)
            wt r3 = defpackage.mq.a
            java.lang.Object r5 = r3.e(r2)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            r6 = 1
            if (r5 == 0) goto L4c
            goto Lcf
        L4c:
            android.graphics.Paint r5 = defpackage.mq.b
            if (r5 != 0) goto L57
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            defpackage.mq.b = r5
        L57:
            if (r0 != 0) goto L5a
            goto L69
        L5a:
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            if (r7 == 0) goto L63
            android.graphics.fonts.FontVariationAxis[] r7 = new android.graphics.fonts.FontVariationAxis[r4]
            goto L6b
        L63:
            android.graphics.fonts.FontVariationAxis[] r7 = defpackage.al$$ExternalSyntheticApiModelOutline0.m(r14)
            if (r7 != 0) goto L6b
        L69:
            r0 = r14
            goto Laf
        L6b:
            r8 = r4
            r9 = r8
        L6d:
            int r10 = r7.length
            java.lang.String r11 = "wght"
            if (r8 >= r10) goto L93
            r10 = r7[r8]
            java.lang.String r12 = defpackage.al$$ExternalSyntheticApiModelOutline0.m34m(r10)
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L90
            android.graphics.fonts.FontVariationAxis r9 = new android.graphics.fonts.FontVariationAxis
            float r10 = defpackage.al$$ExternalSyntheticApiModelOutline0.m(r10)
            float r12 = (float) r0
            float r10 = r10 + r12
            float r10 = defpackage.mq.a(r10)
            r9.<init>(r11, r10)
            r7[r8] = r9
            r9 = r6
        L90:
            int r8 = r8 + 1
            goto L6d
        L93:
            if (r9 != 0) goto Lab
            int r8 = r10 + 1
            android.graphics.fonts.FontVariationAxis[] r8 = new android.graphics.fonts.FontVariationAxis[r8]
            java.lang.System.arraycopy(r7, r4, r8, r4, r10)
            int r0 = r0 + 400
            android.graphics.fonts.FontVariationAxis r7 = new android.graphics.fonts.FontVariationAxis
            float r0 = (float) r0
            float r0 = defpackage.mq.a(r0)
            r7.<init>(r11, r0)
            r8[r10] = r7
            r7 = r8
        Lab:
            java.lang.String r0 = defpackage.al$$ExternalSyntheticApiModelOutline0.m(r7)
        Laf:
            java.lang.String r7 = defpackage.al$$ExternalSyntheticApiModelOutline0.m(r5)
            boolean r7 = j$.util.Objects.equals(r7, r0)
            r8 = 0
            if (r7 == 0) goto Lbd
            defpackage.al$$ExternalSyntheticApiModelOutline0.m(r5, r8)
        Lbd:
            r5.setTypeface(r1)
            boolean r0 = defpackage.al$$ExternalSyntheticApiModelOutline0.m(r5, r0)
            if (r0 == 0) goto Lce
            android.graphics.Typeface r5 = r5.getTypeface()
            r3.f(r2, r5)
            goto Lcf
        Lce:
            r5 = r8
        Lcf:
            if (r5 == 0) goto Ld7
            r13.a(r5)
            r13.b = r14
            return r6
        Ld7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr.b(java.lang.String):boolean");
    }
}
