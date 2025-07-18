package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rza {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public rza(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ttm] */
    public final void a() {
        synchronized (rza.class) {
            if (!d) {
                rtr rtrVar = new rtr(this, 16);
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                uht uhtVar = (uht) this.b.get();
                rrx.H(uhtVar.schedule(new qeo(rtrVar, uhtVar, j, timeUnit, 2), j, timeUnit));
                d = true;
            }
        }
    }

    protected final String b(String str) {
        return ((String) this.b).concat(str);
    }

    public final void c(String str) {
        if (this.a <= 3) {
            b(str);
        }
    }

    public final void d(String str, Throwable th) {
        Log.e((String) this.c, b(str), th);
    }

    public final void e(String str) {
        Log.e((String) this.c, b(str));
    }

    public final void f(String str) {
        Log.w((String) this.c, b(str));
    }

    public final boolean g() {
        return ((ebg) this.c).c(this.a);
    }

    public rza(Bitmap bitmap, Map map, int i) {
        this.c = bitmap;
        this.b = map;
        this.a = i;
    }

    public rza(String str, int i, String str2) {
        this.b = str;
        this.a = i;
        this.c = str2;
    }

    public rza(nxm nxmVar, int i, nwq nwqVar) {
        this.c = nxmVar;
        this.a = i;
        this.b = nwqVar;
    }

    public rza(ssb ssbVar, ssb ssbVar2) {
        this.b = ssbVar;
        this.c = ssbVar2;
        this.a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rza(ebh ebhVar, int i, int i2, String str) {
        this.c = (ebg) ebhVar.c.get(i);
        this.a = i2;
        this.b = str;
    }

    public rza(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            String str2 = strArr[0];
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str2);
            sb.append("] ");
            string = sb.toString();
        }
        this.b = string;
        this.c = str;
        int i = 2;
        Object[] objArr = {str, 23};
        if (str.length() > 23) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
            i++;
        }
        this.a = i;
    }

    public rza(ttm ttmVar) {
        eik eikVar = new eik(13);
        this.b = ttmVar;
        this.a = Math.max(5, 10);
        this.c = eikVar;
    }
}
