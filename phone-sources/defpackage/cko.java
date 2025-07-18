package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cko {
    public cko() {
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final ckq c() {
        return ckr.a.c();
    }

    public static final ckp d() {
        return ckr.a.c().a();
    }

    public static final Typeface e(Typeface typeface, cjh cjhVar, Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return typeface;
        }
        ThreadLocal threadLocal = cjq.a;
        if (typeface == null) {
            return null;
        }
        List list = cjhVar.a;
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = cjq.a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        Paint paint2 = paint;
        paint2.setFontVariationSettings(null);
        paint2.setTypeface(typeface);
        clw.q(context);
        paint2.setFontVariationSettings(cmq.d(list, null, null, null, new cjp(0), 31));
        return paint2.getTypeface();
    }

    public static final cjm f() {
        return Build.VERSION.SDK_INT >= 28 ? new cjn(1) : new cjn(0);
    }

    public static final cjg g(String str, float f) {
        if (str.length() != 4) {
            a("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new cjg(str, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(java.lang.Object r6, defpackage.cix r7, defpackage.cji r8, int r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 == 0) goto L6a
            cji r0 = r7.b()
            boolean r0 = defpackage.yks.e(r0, r8)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L24
            cji r0 = defpackage.cji.c
            int r3 = r8.compareTo(r0)
            if (r3 < 0) goto L24
            cji r3 = r7.b()
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            r7.c()
            boolean r3 = defpackage.a.r(r9, r2)
            if (r3 == 0) goto L30
            if (r0 == 0) goto L6a
        L30:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L4b
            if (r3 != 0) goto L3f
            boolean r7 = defpackage.a.r(r9, r1)
            if (r7 == 0) goto L3f
            goto L40
        L3f:
            r1 = r2
        L40:
            int r7 = defpackage.ccf.C(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L4b:
            if (r0 == 0) goto L50
            int r8 = r8.h
            goto L56
        L50:
            cji r8 = r7.b()
            int r8 = r8.h
        L56:
            if (r3 != 0) goto L5d
            boolean r7 = defpackage.a.r(r9, r1)
            goto L64
        L5d:
            r7.c()
            boolean r7 = defpackage.a.r(r2, r1)
        L64:
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r6 = defpackage.eo$$ExternalSyntheticApiModelOutline0.m(r6, r8, r7)
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cko.h(java.lang.Object, cix, cji, int):java.lang.Object");
    }

    public static clo i(clo cloVar, clo cloVar2) {
        boolean z = cloVar2 instanceof cle;
        if (!z || !(cloVar instanceof cle)) {
            return (!z || (cloVar instanceof cle)) ? (z || !(cloVar instanceof cle)) ? cloVar2.d(new awa(cloVar, 18)) : cloVar : cloVar2;
        }
        throw null;
    }

    public static clo j(clo cloVar, yjk yjkVar) {
        return !yks.e(cloVar, cln.a) ? cloVar : (clo) yjkVar.a();
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? "Rtl" : "Ltr";
    }

    public static final int l(int i) {
        return i & 255;
    }

    public static final int m(int i) {
        return (i >> 8) & 255;
    }

    public static final int n(int i) {
        return i >> 16;
    }

    public static final boolean o(cgs cgsVar) {
        return (cgsVar.f == null && cgsVar.d == null && cgsVar.c == null) ? false : true;
    }

    public static final cgs p(cgs cgsVar, cgs cgsVar2) {
        return cgsVar == null ? cgsVar2 : cgsVar.c(cgsVar2);
    }

    public static final void q(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            u(spannable, new BackgroundColorSpan(bny.h(j)), i, i2);
        }
    }

    public static final void r(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            u(spannable, new ForegroundColorSpan(bny.h(j)), i, i2);
        }
    }

    public static final void s(Spannable spannable, long j, clx clxVar, int i, int i2) {
        long jC = cmk.c(j);
        if (a.s(jC, 4294967296L)) {
            u(spannable, new AbsoluteSizeSpan(yln.v(clxVar.cq(j)), false), i, i2);
        } else if (a.s(jC, 8589934592L)) {
            u(spannable, new RelativeSizeSpan(cmk.a(j)), i, i2);
        }
    }

    public static final void t(Spannable spannable, ckq ckqVar, int i, int i2) {
        if (ckqVar != null) {
            ArrayList arrayList = new ArrayList(yfm.z(ckqVar, 10));
            Iterator<E> it = ckqVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((ckp) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            u(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final float v(float f, clx clxVar) {
        if (a.s(0L, cmk.a)) {
            return f;
        }
        long jC = cmk.c(0L);
        if (a.s(jC, 4294967296L)) {
            return clxVar.cq(0L);
        }
        if (a.s(jC, 8589934592L)) {
            return cmk.a(0L) * f;
        }
        return Float.NaN;
    }

    public static final boolean w(chc chcVar) {
        return (chcVar.d != null ? new cgc() : null) == null || !a.r(0, 1);
    }

    public static /* synthetic */ cix x(cxe cxeVar, cjv cjvVar, cji cjiVar) {
        return new cjw((String) cxeVar.a, cjvVar, cjiVar);
    }

    public static final esn y(Context context) {
        return new esn(new cxe(context), new cin(Build.VERSION.SDK_INT >= 31 ? cjj.a.a(context) : 0), cja.b, new cjd(cja.a, 2), new cxe((byte[]) null));
    }

    public cko(byte[] bArr) {
        dhg dhgVar = dhg.a;
    }
}
