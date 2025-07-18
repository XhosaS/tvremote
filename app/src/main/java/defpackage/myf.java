package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myf {
    public static final /* synthetic */ int a = 0;
    private static final Map b = DesugarCollections.synchronizedMap(new HashMap());
    private static final Map c = DesugarCollections.synchronizedMap(new HashMap());

    public static int a(Resources resources) {
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (i = resources.getConfiguration().fontWeightAdjustment) != Integer.MAX_VALUE) {
            return i;
        }
        return 0;
    }

    public static int b(float f) {
        return (int) (f + (f > 0.0f ? 0.5d : -0.5d));
    }

    public static Typeface c(Resources resources, Typeface typeface) {
        if (typeface == null) {
            typeface = Typeface.defaultFromStyle(0);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int weight = typeface.getWeight();
            if (weight == 0) {
                weight = true != typeface.isBold() ? 400 : 700;
            }
            int iM = m(resources, weight);
            if (iM != weight) {
                return Typeface.create(typeface, iM, typeface.isItalic());
            }
        }
        return typeface;
    }

    public static void d(SpannableString spannableString, Object obj, int i, boolean z, int i2) {
        int iMin;
        int iMin2 = i < 0 ? 0 : Math.min(i, spannableString.length());
        if (!z) {
            iMin = spannableString.length();
        } else if (i2 <= 0) {
            return;
        } else {
            iMin = Math.min(i2 + iMin2, spannableString.length());
        }
        if (iMin2 == iMin) {
            return;
        }
        spannableString.setSpan(obj, iMin2, iMin, 18);
    }

    public static void e(SpannableString spannableString, CharSequence charSequence, Class cls) {
        Object[] spans = spannableString.getSpans(0, spannableString.length(), cls);
        int length = spannableString.length() - charSequence.length();
        for (Object obj : spans) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            if ((cls == ClickableSpan.class || spanStart > 0) && spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(obj, spanStart, length, 0);
            }
        }
    }

    public static int f(CharSequence charSequence, int i) {
        if (charSequence instanceof Spannable) {
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AbsoluteSizeSpan.class)) {
                i = Math.max(absoluteSizeSpan.getSize(), i);
            }
        }
        return i;
    }

    public static int g(CharSequence charSequence, Resources resources) {
        int iB = b(TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        if (charSequence instanceof Spannable) {
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AbsoluteSizeSpan.class)) {
                iB = Math.min(absoluteSizeSpan.getSize(), iB);
            }
        }
        return iB;
    }

    public static Layout.Alignment h(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static TextUtils.TruncateAt i(int i) {
        int i2 = i - 1;
        return i2 != 3 ? i2 != 5 ? i2 != 6 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    public static TextUtils.TruncateAt j(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 3 ? i2 != 4 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    public static Typeface k(final Context context, Resources resources, final nep nepVar, final ofy ofyVar, oco ocoVar, oal oalVar) {
        FutureTask futureTask;
        if (!nepVar.v()) {
            return null;
        }
        final String strQ = nepVar.q();
        int iN = 400;
        if (nepVar.A() || nepVar.B()) {
            if (!nepVar.A()) {
                switch (nepVar.E() - 1) {
                    case 1:
                        iN = 100;
                        break;
                    case 2:
                        iN = 200;
                        break;
                    case 3:
                        iN = 300;
                        break;
                    case 5:
                        iN = 500;
                        break;
                    case 6:
                        iN = 600;
                        break;
                    case 7:
                        iN = 700;
                        break;
                    case 8:
                        iN = 800;
                        break;
                    case 9:
                        iN = 900;
                        break;
                }
            } else {
                iN = nepVar.n();
            }
        }
        final int iM = m(resources, iN);
        mxk mxkVar = new mxk(strQ, iM, nepVar.s());
        Map map = c;
        synchronized (map) {
            futureTask = (FutureTask) map.get(mxkVar);
            if (futureTask == null) {
                FutureTask futureTask2 = new FutureTask(new Callable() { // from class: myc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i = myf.a;
                        ofy ofyVar2 = ofyVar;
                        Context context2 = context;
                        nep nepVar2 = nepVar;
                        int i2 = iM;
                        boolean zS = nepVar2.s();
                        String str = strQ;
                        Typeface typefaceB = ofyVar2.b(context2, str, i2, zS);
                        if (typefaceB != null) {
                            return typefaceB;
                        }
                        return Typeface.create(Typeface.create(ypx.c(str), 0), i2, nepVar2.s());
                    }
                });
                map.put(mxkVar, futureTask2);
                futureTask = futureTask2;
            }
        }
        futureTask.run();
        try {
            return (Typeface) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            acwg acwgVar = acwg.a;
            acvx acvxVar = new acvx();
            acsw acswVar = acsw.LOG_TYPE_INTERNAL_ERROR;
            if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvxVar.y();
            }
            acwg acwgVar2 = (acwg) acvxVar.b;
            acwgVar2.c = acswVar.E;
            acwgVar2.b |= 2;
            acvz acvzVar = acvz.a;
            acvy acvyVar = new acvy();
            if ((acvyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvyVar.y();
            }
            acvz acvzVar2 = (acvz) acvyVar.b;
            strQ.getClass();
            acvzVar2.b |= 2;
            acvzVar2.c = strQ;
            if ((acvyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvyVar.y();
            }
            acvz acvzVar3 = (acvz) acvyVar.b;
            acvzVar3.b |= 4;
            acvzVar3.d = iM;
            boolean zS = nepVar.s();
            if ((acvyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvyVar.y();
            }
            acvz acvzVar4 = (acvz) acvyVar.b;
            acvzVar4.b |= 8;
            acvzVar4.e = zS;
            if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvxVar.y();
            }
            acwg acwgVar3 = (acwg) acvxVar.b;
            acvz acvzVar5 = (acvz) acvyVar.v();
            acvzVar5.getClass();
            acwgVar3.i = acvzVar5;
            acwgVar3.b |= 1024;
            ocoVar.e((acwg) acvxVar.v(), oalVar, e, "Font fetching future task failed.", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0558, code lost:
    
        if (r5 != false) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x069f A[PHI: r2
  0x069f: PHI (r2v9 int) = (r2v8 int), (r2v20 int) binds: [B:233:0x0675, B:247:0x069c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence l(defpackage.oal r31, final android.content.Context r32, defpackage.ndo r33, defpackage.oaa r34, final defpackage.ofy r35, defpackage.oco r36, java.util.Map r37, defpackage.obh r38, defpackage.mrg r39, boolean r40, defpackage.obg r41, java.util.Set r42, int r43) {
        /*
            Method dump skipped, instructions count: 2119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myf.l(oal, android.content.Context, ndo, oaa, ofy, oco, java.util.Map, obh, mrg, boolean, obg, java.util.Set, int):java.lang.CharSequence");
    }

    private static int m(Resources resources, int i) {
        if (Build.VERSION.SDK_INT < 31) {
            return i;
        }
        int i2 = resources.getConfiguration().fontWeightAdjustment;
        if (i2 != Integer.MAX_VALUE) {
            i += i2;
        }
        return ztm.a(i, 1, 1000);
    }
}
