package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ael {
    public static final wt a = new wt(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final wx d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new aeq());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new wx(0);
    }

    public static aek a(String str, Context context, List list, int i) {
        aek aekVar;
        int i2;
        int length;
        Typeface typefaceC;
        btt.b("getFontSync");
        try {
            Typeface typeface = (Typeface) a.e(str);
            if (typeface != null) {
                aekVar = new aek(typeface);
            } else {
                try {
                    aem aemVarA = aed.a(context, list);
                    if (aemVarA.a != 0) {
                        i2 = -2;
                    } else {
                        aen[] aenVarArrA = aemVarA.a();
                        if (aenVarArrA == null || (length = aenVarArrA.length) == 0) {
                            i2 = 1;
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = 0;
                                    break;
                                }
                                int i4 = aenVarArrA[i3].e;
                                if (i4 != 0) {
                                    i2 = i4 < 0 ? -3 : i4;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (i2 != 0) {
                        aekVar = new aek(i2);
                    } else {
                        List list2 = aemVarA.b;
                        if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                            typefaceC = acy.c(context, aemVarA.a(), i);
                        } else {
                            adg adgVar = acy.a;
                            btt.b("TypefaceCompat.createFromFontInfoWithFallback");
                            try {
                                typefaceC = acy.a.f(context, list2, i);
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (typefaceC != null) {
                            a.f(str, typefaceC);
                            aekVar = new aek(typefaceC);
                        } else {
                            aekVar = new aek(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    aekVar = new aek(-1);
                }
            }
            return aekVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String b(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((aee) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
