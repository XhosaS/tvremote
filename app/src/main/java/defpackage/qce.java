package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qce {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static boolean a(long j) {
        if (j > 0) {
            return b.nextLong() % j == 0;
        }
        if (j < 0) {
            c("Bad sample interval: %d", Long.valueOf(j));
        }
        return false;
    }

    public static void b(String str) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) zdyVar.c()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 116, "LogUtil.java")).x("%s", str);
        ((zdv) zdyVar.c()).V();
    }

    public static void c(String str, Object obj) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) zdyVar.c()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 123, "LogUtil.java")).x(str, obj);
        ((zdv) zdyVar.c()).V();
    }

    public static void d(String str, Object obj, Object obj2) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) zdyVar.c()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 130, "LogUtil.java")).F(str, obj, obj2);
        ((zdv) zdyVar.c()).V();
    }

    public static void e(String str, Object... objArr) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) zdyVar.c()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 137, "LogUtil.java")).M(str, objArr);
        ((zdv) zdyVar.c()).V();
    }

    public static void f(Throwable th, String str) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) ((zdv) zdyVar.c()).p(th)).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 144, "LogUtil.java")).x("%s", str);
        ((zdv) zdyVar.c()).V();
    }

    public static void g(Throwable th, String str, Object... objArr) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) ((zdv) zdyVar.c()).p(th)).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", ModuleDescriptor.MODULE_VERSION, "LogUtil.java")).M(str, objArr);
        ((zdv) zdyVar.c()).V();
    }

    public static void h(String str, Object obj) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 164, "LogUtil.java")).x(str, obj);
        ((zdv) zdyVar.d()).V();
    }

    public static void i(String str, Object obj, Object obj2) {
        zdy zdyVar = qcd.a;
        ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 171, "LogUtil.java")).F(str, obj, obj2);
        ((zdv) zdyVar.d()).V();
    }
}
