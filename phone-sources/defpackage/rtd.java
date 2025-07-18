package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtd {
    public static final /* synthetic */ int e = 0;
    public final yfo a;
    public final Context b;
    public final yfo c;
    public final rzy d;

    static {
        sij.l(new eik(9));
    }

    public rtd(yfo yfoVar, Context context, yfo yfoVar2, yfo yfoVar3, rzy rzyVar) {
        this.d = rzyVar;
        this.a = new lij(yfoVar3, sij.l(new rtb(yfoVar, 1)), yfoVar, 2);
        this.b = context;
        this.c = yfoVar2;
    }

    public static /* synthetic */ tst a() {
        try {
            return tst.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e2) {
            e = e2;
            ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).s("MemoryInfo.getOtherPss(which) failure");
            return trk.a;
        } catch (NoSuchMethodException e3) {
            ((tug) ((tug) ((tug) rnb.a.b()).i(e3)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'f', "MemoryUsageCapture.java")).s("MemoryInfo.getOtherPss(which) not found");
            return trk.a;
        } catch (Exception e4) {
            e = e4;
            ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).s("MemoryInfo.getOtherPss(which) failure");
            return trk.a;
        }
    }

    public static Long b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                sij.k(strGroup);
                return Long.valueOf(Long.parseLong(strGroup));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
