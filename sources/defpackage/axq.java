package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axq {
    public static final /* synthetic */ int e = 0;
    public final crv a;
    public final Context b;
    public final crv c;
    public final awy d;

    static {
        bit.k(new azz(1));
    }

    public axq(final crv crvVar, Context context, crv crvVar2, final crv crvVar3, awy awyVar) {
        this.d = awyVar;
        crvVar.getClass();
        final byo byoVarK = bit.k(new asf(crvVar, 9));
        this.a = new crv() { // from class: axo
            @Override // defpackage.crv, defpackage.cru
            public final Object a() {
                int i = axq.e;
                return ((Boolean) crvVar3.a()).booleanValue() ? (axb) byoVarK.aL() : crvVar.a();
            }
        };
        this.b = context;
        this.c = crvVar2;
    }

    public static /* synthetic */ byg a() {
        try {
            return byg.h(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e2) {
            e = e2;
            ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 104, "MemoryUsageCapture.java")).p("MemoryInfo.getOtherPss(which) failure");
            return bxw.a;
        } catch (NoSuchMethodException e3) {
            ((cbs) ((cbs) aqn.a.b().i(e3)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 102, "MemoryUsageCapture.java")).p("MemoryInfo.getOtherPss(which) not found");
            return bxw.a;
        } catch (Exception e4) {
            e = e4;
            ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 104, "MemoryUsageCapture.java")).p("MemoryInfo.getOtherPss(which) failure");
            return bxw.a;
        }
    }

    public static Long b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                bit.j(strGroup);
                return Long.valueOf(Long.parseLong(strGroup));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
