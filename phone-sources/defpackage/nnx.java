package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnx {
    public static final String a;
    private static nnx j;
    public final nnr b;
    public final SharedPreferences c;
    public final String d;
    public long i;
    public final Set g = new HashSet();
    public final Set h = new HashSet();
    public final Handler f = new ogh(Looper.getMainLooper());
    public final Runnable e = new mpz(this, 13);

    static {
        new nsf("FeatureUsageAnalytics");
        a = "22.1.1";
    }

    private nnx(SharedPreferences sharedPreferences, nnr nnrVar, String str) {
        this.c = sharedPreferences;
        this.b = nnrVar;
        this.d = str;
    }

    public static synchronized nnx a(SharedPreferences sharedPreferences, nnr nnrVar, String str) {
        if (j == null) {
            j = new nnx(sharedPreferences, nnrVar, str);
        }
        return j;
    }

    public static uck b(String str) {
        try {
            return uck.b(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return uck.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    public static String c(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static void e(uck uckVar) {
        nnx nnxVar;
        if (!nnr.a || (nnxVar = j) == null) {
            return;
        }
        nnxVar.c.edit().putLong(nnxVar.d(h(uckVar)), System.currentTimeMillis()).apply();
        nnxVar.g.add(uckVar);
        nnxVar.g();
    }

    public static final String h(uck uckVar) {
        return Integer.toString(uckVar.ag);
    }

    public final String d(String str) {
        SharedPreferences sharedPreferences = this.c;
        String strC = c("feature_usage_timestamp_reported_feature_", str);
        return sharedPreferences.contains(strC) ? strC : c("feature_usage_timestamp_detected_feature_", str);
    }

    public final void f(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.c.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    public final void g() {
        this.f.post(this.e);
    }
}
