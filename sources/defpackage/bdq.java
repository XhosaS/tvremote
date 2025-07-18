package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdq {
    public static String a;
    public static Boolean b;
    private static String c;
    private static Boolean d;

    private bdq() {
    }

    public static String a(Context context) {
        String strTrim;
        Object objInvoke;
        String str = c;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            c = processName;
            return processName;
        }
        String str2 = null;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, bdq.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
            } catch (Throwable th) {
                Log.d("CurrentProcess", "Unable to check ActivityThread", th);
            }
            String str3 = objInvoke instanceof String ? (String) objInvoke : null;
            c = str3;
            if (str3 != null) {
                return str3;
            }
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"), 50);
                    try {
                        strTrim = bufferedReader.readLine().trim();
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    Log.e("CurrentProcess", "Unable to read /proc/self/cmdline", e);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    strTrim = null;
                }
                c = strTrim;
                if (strTrim != null) {
                    return strTrim;
                }
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            int iMyPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    str2 = next.processName;
                    break;
                }
            }
        }
        c = str2;
        return str2;
    }

    public static boolean b() {
        if (d == null) {
            d = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
        }
        return d.booleanValue();
    }

    public static /* synthetic */ int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            bxb bxbVarG = awo.g((String) entry.getKey());
            try {
                ((beb) ((crv) entry.getValue()).a()).a();
                bxbVarG.close();
            } catch (Throwable th) {
                try {
                    bxbVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z, String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(bit.l(str, Character.valueOf(c2)));
        }
    }

    public static void h(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(bit.l(str, obj));
        }
    }

    public static void i(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? v(i, i3, "start index") : (i2 < 0 || i2 > i3) ? v(i2, i3, "end index") : bit.l("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void k(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void l(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(bit.l(str, Integer.valueOf(i)));
        }
    }

    public static void m(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(bit.l(str, obj));
        }
    }

    public static void n(int i, int i2) {
        String strL;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strL = bit.l("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(b.e(i2, "negative size: "));
                }
                strL = bit.l("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static void o(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(v(i, i2, "index"));
        }
    }

    public static String p(String str) {
        return str == null ? "" : str;
    }

    public static boolean q(String str) {
        return str == null || str.isEmpty();
    }

    public static byf r(Object obj) {
        return new byf(obj.getClass().getSimpleName());
    }

    static final CharSequence s(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final String t(Iterable iterable, String str) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        u(sb, it, str);
        return sb.toString();
    }

    public static final void u(StringBuilder sb, Iterator it, String str) throws IOException {
        try {
            if (it.hasNext()) {
                sb.append(s(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(s(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static String v(int i, int i2, String str) {
        if (i < 0) {
            return bit.l("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return bit.l("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(b.e(i2, "negative size: "));
    }
}
