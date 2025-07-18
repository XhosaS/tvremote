package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjn implements cjm {
    private final /* synthetic */ int a;

    public cjn(int i) {
        this.a = i;
    }

    private static final Typeface d(String str, cji cjiVar, int i) {
        if (a.r(i, 0) && yks.e(cjiVar, cji.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iD = ccf.D(cjiVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iD) : Typeface.create(str, iD);
    }

    private static final Typeface e(String str, cji cjiVar, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, cjiVar, i);
        if (yks.e(typefaceD, Typeface.create(Typeface.DEFAULT, ccf.D(cjiVar, i))) || yks.e(typefaceD, d(null, cjiVar, i))) {
            return null;
        }
        return typefaceD;
    }

    private static final Typeface f(String str, cji cjiVar, int i) {
        if (a.r(i, 0) && yks.e(cjiVar, cji.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), cjiVar.h, a.r(i, 1));
    }

    @Override // defpackage.cjm
    public final Typeface a(cji cjiVar, int i) {
        return this.a != 0 ? f(null, cjiVar, i) : d(null, cjiVar, i);
    }

    @Override // defpackage.cjm
    public final Typeface b(cjk cjkVar, cji cjiVar, int i) {
        String strConcat;
        String str;
        if (this.a != 0) {
            return f(cjkVar.f, cjiVar, i);
        }
        int i2 = cjiVar.h / 100;
        String str2 = cjkVar.f;
        if (i2 < 0 || i2 >= 2) {
            if (i2 < 2 || i2 >= 4) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        str = "-medium";
                    } else if ((i2 < 6 || i2 >= 8) && i2 >= 8 && i2 < 11) {
                        str = "-black";
                    }
                }
                strConcat = str2;
            } else {
                str = "-light";
            }
            strConcat = str2.concat(str);
        } else {
            strConcat = str2.concat("-thin");
        }
        Typeface typefaceE = e(strConcat, cjiVar, i);
        return typefaceE == null ? d(str2, cjiVar, i) : typefaceE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // defpackage.cjm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface c(java.lang.String r6, defpackage.cji r7, defpackage.cjh r8, android.content.Context r9) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L71
            cjk r0 = defpackage.ciy.a
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L14
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto L6c
        L14:
            cjk r0 = defpackage.ciy.b
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L23
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto L6c
        L23:
            cjk r0 = defpackage.ciy.c
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L32
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto L6c
        L32:
            cjk r0 = defpackage.ciy.d
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L41
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto L6c
        L41:
            int r0 = r6.length()
            r2 = 0
            if (r0 != 0) goto L4a
        L48:
            r6 = r2
            goto L6c
        L4a:
            android.graphics.Typeface r6 = f(r6, r7, r1)
            r0 = 1
            boolean r0 = defpackage.a.r(r1, r0)
            int r3 = r7.h
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r0 = defpackage.eo$$ExternalSyntheticApiModelOutline0.m(r4, r3, r0)
            boolean r0 = defpackage.yks.e(r6, r0)
            if (r0 != 0) goto L48
            android.graphics.Typeface r7 = f(r2, r7, r1)
            boolean r7 = defpackage.yks.e(r6, r7)
            if (r7 == 0) goto L6c
            goto L48
        L6c:
            android.graphics.Typeface r6 = defpackage.cko.e(r6, r8, r9)
            return r6
        L71:
            cjk r0 = defpackage.ciy.a
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L80
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto Lb1
        L80:
            cjk r0 = defpackage.ciy.b
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L8f
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto Lb1
        L8f:
            cjk r0 = defpackage.ciy.c
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto L9e
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto Lb1
        L9e:
            cjk r0 = defpackage.ciy.d
            java.lang.String r2 = r0.f
            boolean r2 = defpackage.yks.e(r6, r2)
            if (r2 == 0) goto Lad
            android.graphics.Typeface r6 = r5.b(r0, r7, r1)
            goto Lb1
        Lad:
            android.graphics.Typeface r6 = e(r6, r7, r1)
        Lb1:
            android.graphics.Typeface r6 = defpackage.cko.e(r6, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjn.c(java.lang.String, cji, cjh, android.content.Context):android.graphics.Typeface");
    }
}
