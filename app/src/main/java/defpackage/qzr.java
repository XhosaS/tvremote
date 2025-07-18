package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzr {
    public static final /* synthetic */ int e = 0;
    public final qtj a;
    public final agow b;
    public final Context c;
    public final agow d;

    static {
        yru.a(new yrp() { // from class: qzo
            @Override // defpackage.yrp
            public final Object eV() {
                return qzr.a();
            }
        });
    }

    public qzr(final agow agowVar, Context context, agow agowVar2, final agow agowVar3, qtj qtjVar) {
        this.a = qtjVar;
        agowVar.getClass();
        final yrp yrpVarA = yru.a(new yrp() { // from class: qzm
            @Override // defpackage.yrp
            public final Object eV() {
                return (qyx) agowVar.a();
            }
        });
        this.b = new agow() { // from class: qzn
            @Override // defpackage.agow
            public final Object a() {
                int i = qzr.e;
                return (qyx) (((Boolean) agowVar3.a()).booleanValue() ? yrpVarA.eV() : agowVar.a());
            }
        };
        this.c = context;
        this.d = agowVar2;
    }

    static /* synthetic */ yqt a() {
        try {
            try {
                try {
                    return yqt.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
                } catch (Error e2) {
                    e = e2;
                    ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).u("MemoryInfo.getOtherPss(which) failure");
                    return ypv.a;
                }
            } catch (NoSuchMethodException unused) {
                return ypv.a;
            }
        } catch (Error | Exception e3) {
            e = e3;
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).u("MemoryInfo.getOtherPss(which) failure");
            return ypv.a;
        }
    }

    public static Long b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                yry.b(strGroup);
                return Long.valueOf(Long.parseLong(strGroup));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
