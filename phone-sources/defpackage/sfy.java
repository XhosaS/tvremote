package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfy {
    private static String a;

    private sfy() {
    }

    public static uhp A() {
        uhj uhjVar = uhj.a;
        return uhjVar != null ? uhjVar : new uhj();
    }

    public static uhp B(Throwable th) {
        th.getClass();
        return new uhk(th);
    }

    public static uhp C(Object obj) {
        return obj == null ? uhl.a : new uhl(obj);
    }

    public static uhp D(uhp uhpVar) {
        if (uhpVar.isDone()) {
            return uhpVar;
        }
        uhd uhdVar = new uhd(uhpVar);
        uhpVar.c(uhdVar, ugk.a);
        return uhdVar;
    }

    public static uhp E(Runnable runnable, Executor executor) {
        uik uikVarG = uik.g(runnable, null);
        executor.execute(uikVarG);
        return uikVarG;
    }

    public static uhp F(Callable callable, Executor executor) {
        uik uikVar = new uik(callable);
        executor.execute(uikVar);
        return uikVar;
    }

    public static uhp G(ufv ufvVar, Executor executor) {
        uik uikVar = new uik(ufvVar);
        executor.execute(uikVar);
        return uikVar;
    }

    public static uhp H(Iterable iterable) {
        return new ugf(ImmutableList.copyOf(iterable), false);
    }

    public static uhp I(uhp uhpVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (uhpVar.isDone()) {
            return uhpVar;
        }
        uih uihVar = new uih(uhpVar);
        uif uifVar = new uif(uihVar);
        uihVar.b = scheduledExecutorService.schedule(uifVar, j, timeUnit);
        uhpVar.c(uifVar, ugk.a);
        return uihVar;
    }

    public static Object J(Future future) {
        sij.z(future.isDone(), "Future was expected to be done: %s", future);
        return a.G(future);
    }

    public static void K(uhp uhpVar, uha uhaVar, Executor executor) {
        uhaVar.getClass();
        uhpVar.c(new uhb(uhpVar, uhaVar), executor);
    }

    public static void L(uhp uhpVar, Future future) {
        if (uhpVar instanceof ufb) {
            ((ufb) uhpVar).p(future);
        } else {
            if (uhpVar == null || !uhpVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static xqr M(Iterable iterable) {
        return new xqr(false, (Object) ImmutableList.copyOf(iterable));
    }

    @SafeVarargs
    public static xqr N(uhp... uhpVarArr) {
        return new xqr(false, (Object) ImmutableList.copyOf(uhpVarArr));
    }

    public static xqr O(Iterable iterable) {
        return new xqr(true, (Object) ImmutableList.copyOf(iterable));
    }

    @SafeVarargs
    public static xqr P(uhp... uhpVarArr) {
        return new xqr(true, (Object) ImmutableList.copyOf(uhpVarArr));
    }

    public static byte Q(long j) {
        sij.r((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static /* synthetic */ int R(byte b) {
        return b & 255;
    }

    public static int S(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List T(long... jArr) {
        int length = jArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new uel(jArr, 0, length);
    }

    public static long[] U(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i = (int) length;
        sij.r(length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i2, length2);
            i2 += length2;
        }
        return jArr3;
    }

    public static long[] V(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }

    public static int W(long j) {
        int i = (int) j;
        sij.r(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int X(int i, int i2, int i3) {
        sij.t(true, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int Y(byte[] bArr) {
        int length = bArr.length;
        sij.t(length >= 4, "array too small: %s < %s", length, 4);
        return Z(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int Z(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static String a(Context context) {
        String strTrim;
        BufferedReader bufferedReader;
        Object objInvoke;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        String str2 = null;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, sfy.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
            } catch (Throwable unused) {
            }
            String str3 = objInvoke instanceof String ? (String) objInvoke : null;
            a = str3;
            if (str3 != null) {
                return str3;
            }
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"), 50);
                } catch (Exception e) {
                    Log.e("CurrentProcess", "Unable to read /proc/self/cmdline", e);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    strTrim = null;
                }
                try {
                    strTrim = bufferedReader.readLine().trim();
                    bufferedReader.close();
                    a = strTrim;
                    if (strTrim != null) {
                        return strTrim;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
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
        a = str2;
        return str2;
    }

    public static /* synthetic */ int aA(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    private static vtw aB(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        vtw vtwVarM = udd.a.m();
        String name = th.getClass().getName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        udd uddVar = (udd) vtwVarM.b;
        name.getClass();
        uddVar.b |= 1;
        uddVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udd uddVar2 = (udd) vtwVarM.b;
            message.getClass();
            uddVar2.b |= 2;
            uddVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                vtw vtwVarM2 = udc.a.m();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    udc udcVar = (udc) vtwVarM2.b;
                    className.getClass();
                    udcVar.b |= 1;
                    udcVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    udc udcVar2 = (udc) vtwVarM2.b;
                    methodName.getClass();
                    udcVar2.b |= 2;
                    udcVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    udc udcVar3 = (udc) vtwVarM2.b;
                    udcVar3.b |= 8;
                    udcVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        udc udcVar4 = (udc) vtwVarM2.b;
                        fileName.getClass();
                        udcVar4.b |= 4;
                        udcVar4.e = fileName;
                    }
                }
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                udd uddVar3 = (udd) vtwVarM.b;
                udc udcVar5 = (udc) vtwVarM2.r();
                udcVar5.getClass();
                vun vunVar = uddVar3.f;
                if (!vunVar.c()) {
                    uddVar3.f = vuc.s(vunVar);
                }
                uddVar3.f.add(udcVar5);
            }
        }
        return vtwVarM;
    }

    public static int aa(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int ab(long j) {
        if (j > 2147483647L) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer ac(java.lang.String r12) {
        /*
            r12.getClass()
            boolean r0 = r12.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r12 = r1
            goto L6f
        Ld:
            r0 = 0
            char r2 = r12.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r4 = r12.length()
            if (r0 != r4) goto L1e
            goto La
        L1e:
            int r4 = r0 + 1
            char r0 = r12.charAt(r0)
            int r0 = defpackage.uek.a(r0)
            if (r0 < 0) goto La
            r5 = 10
            if (r0 < r5) goto L2f
            goto La
        L2f:
            int r0 = -r0
            long r6 = (long) r0
        L31:
            int r0 = r12.length()
            r8 = -9223372036854775808
            if (r4 >= r0) goto L5e
            int r0 = r4 + 1
            char r4 = r12.charAt(r4)
            int r4 = defpackage.uek.a(r4)
            if (r4 < 0) goto La
            if (r4 >= r5) goto La
            r10 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 >= 0) goto L51
            goto La
        L51:
            r10 = 10
            long r6 = r6 * r10
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L5b
            goto La
        L5b:
            long r6 = r6 - r10
            r4 = r0
            goto L31
        L5e:
            if (r2 != r3) goto L65
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            goto L6f
        L65:
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 != 0) goto L6a
            goto La
        L6a:
            long r2 = -r6
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
        L6f:
            if (r12 == 0) goto L88
            long r2 = r12.longValue()
            int r0 = r12.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L7f
            goto L88
        L7f:
            int r12 = r12.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfy.ac(java.lang.String):java.lang.Integer");
    }

    public static List ad(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new uej(iArr, 0, length);
    }

    public static int[] ae(Collection collection) {
        if (collection instanceof uej) {
            uej uejVar = (uej) collection;
            return Arrays.copyOfRange(uejVar.a, uejVar.b, uejVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static char af(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    public static Collection ag(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
        }
        return arrayList;
    }

    public static Collection ah(Object obj, Iterable iterable) {
        ArrayList arrayListNewArrayList = Lists.newArrayList(iterable);
        int size = arrayListNewArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayListNewArrayList.get(i);
            obj.getClass();
            obj2.getClass();
        }
        return arrayListNewArrayList;
    }

    public static void ai(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i + ", " + i2 + ")");
    }

    static void aj(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void ak(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void al(String str, int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be >= 0");
    }

    static void am(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static long an(long j, long j2) {
        long j3 = j + j2;
        aj(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long ao(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        long j3 = j * j2;
        if (iNumberOfLeadingZeros > 65) {
            return j3;
        }
        aj(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        aj(true, "checkedMultiply", j, j2);
        aj(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long ap(long j, long j2) {
        long j3 = j - j2;
        aj(((j ^ j2) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, j2);
        return j3;
    }

    public static long aq(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (udp.a[roundingMode.ordinal()]) {
            case 1:
                ak(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i;
    }

    public static long ar(long j, long j2) {
        am("a", j);
        am("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long as(long j, long j2) {
        boolean z = (j ^ j2) < 0;
        long j3 = j2 + j;
        return z | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long at(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = j ^ j2;
        long j4 = (j3 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j5 = j * j2;
            if (j == 0 || j5 / j == j2) {
                return j5;
            }
        }
        return j4;
    }

    public static long au(double d) {
        sij.o(av(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean av(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static vtw aw(Throwable th, boolean z) {
        vtw vtwVarM = udg.a.m();
        vtw vtwVarM2 = udd.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        udd uddVar = (udd) vtwVarM2.b;
        uddVar.b |= 1;
        uddVar.c = "";
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        udg udgVar = (udg) vtwVarM.b;
        udd uddVar2 = (udd) vtwVarM2.r();
        uddVar2.getClass();
        udgVar.e = uddVar2;
        udgVar.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(ax(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int iIntValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(ax(cause, z));
                    arrayDeque.add(cause);
                }
                vtw vtwVar = (vtw) arrayList.get(iIntValue);
                int iIntValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                udf udfVar = (udf) vtwVar.b;
                udf udfVar2 = udf.a;
                udfVar.b |= 2;
                udfVar.d = iIntValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(ax(th3, z));
                    arrayDeque.add(th3);
                }
                vtw vtwVar2 = (vtw) arrayList.get(iIntValue);
                int iIntValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                udf udfVar3 = (udf) vtwVar2.b;
                udf udfVar4 = udf.a;
                vuj vujVar = udfVar3.e;
                if (!vujVar.c()) {
                    udfVar3.e = vuc.q(vujVar);
                }
                udfVar3.e.g(iIntValue3);
            }
        }
        vtw vtwVarM3 = ude.a.m();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vtw vtwVar3 = (vtw) arrayList.get(i);
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            ude udeVar = (ude) vtwVarM3.b;
            udf udfVar5 = (udf) vtwVar3.r();
            udfVar5.getClass();
            udeVar.b();
            udeVar.b.add(udfVar5);
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        udg udgVar2 = (udg) vtwVarM.b;
        ude udeVar2 = (ude) vtwVarM3.r();
        udeVar2.getClass();
        udgVar2.d = udeVar2;
        udgVar2.c = 4;
        return vtwVarM;
    }

    public static vtw ax(Throwable th, boolean z) {
        vtw vtwVarM = udf.a.m();
        vtw vtwVarAB = aB(th, z);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        udf udfVar = (udf) vtwVarM.b;
        udd uddVar = (udd) vtwVarAB.r();
        uddVar.getClass();
        udfVar.c = uddVar;
        udfVar.b |= 1;
        return vtwVarM;
    }

    public static vtw ay(Throwable th) {
        vtw vtwVarM = udg.a.m();
        vtw vtwVarAB = aB(th, false);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        udg udgVar = (udg) vtwVarM.b;
        udd uddVar = (udd) vtwVarAB.r();
        uddVar.getClass();
        udgVar.e = uddVar;
        udgVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return vtwVarM;
            }
            vtw vtwVarAB2 = aB(th, false);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udg udgVar2 = (udg) vtwVarM.b;
            udd uddVar2 = (udd) vtwVarAB2.r();
            uddVar2.getClass();
            udgVar2.b();
            udgVar2.f.add(uddVar2);
        }
    }

    public static int az(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 31;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 32;
            case 32:
                return 33;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 34;
            case 34:
                return 35;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 36;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 37;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 38;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 39;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 40;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return 41;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 42;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            default:
                return 0;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return 46;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 47;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 48;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 49;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 50;
            case 50:
                return 51;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 52;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return 53;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 54;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return 55;
        }
    }

    public static float b(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(com.google.android.videos.R.attr.replayBottomSheetMaxUncollapsedHeightRatio, typedValue, false)) {
            return typedValue.getFloat();
        }
        return 0.6f;
    }

    public static boolean c(Context context) {
        return context.getResources().getBoolean(com.google.android.videos.R.bool.replay__replaydialog_show_as_centered_dialog);
    }

    public static int d(Resources resources, int i) {
        return i != 2 ? resources.getDimensionPixelSize(com.google.android.videos.R.dimen.replay__imagewidth__small) : resources.getDimensionPixelSize(com.google.android.videos.R.dimen.replay__imagewidth__medium);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static srp e(sev sevVar, String str, int i, Map map) {
        ImmutableList immutableList = sevVar.h;
        ArrayList arrayList = new ArrayList(immutableList.size());
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(e((sev) it.next(), str, i + 1, map));
        }
        srp srpVar = new srp(sevVar, arrayList, i);
        if (((srp) map.put(srpVar.d(), srpVar)) == null) {
            return srpVar;
        }
        throw new IllegalArgumentException("duplicate tag id ".concat(String.valueOf(srpVar.d())));
    }

    public static int f(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        return (context.getTheme().resolveAttribute(i, typedValue, true) && typedValue.type == 5) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : i2;
    }

    public static int g(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static final boolean i(float f, float f2) {
        return f == f2;
    }

    public static final boolean j(gbb gbbVar, gbb gbbVar2) {
        if (!yks.e(gbbVar, gbbVar2)) {
            return false;
        }
        fzi fziVarE = gbbVar != null ? gbbVar.e() : null;
        if (true != (fziVarE instanceof sbw)) {
            fziVarE = null;
        }
        Boolean boolValueOf = fziVarE != null ? Boolean.valueOf(((sbw) fziVarE).a()) : null;
        fzi fziVarE2 = gbbVar2 != null ? gbbVar2.e() : null;
        if (true != (fziVarE2 instanceof sbw)) {
            fziVarE2 = null;
        }
        return yks.e(boolValueOf, fziVarE2 != null ? Boolean.valueOf(((sbw) fziVarE2).a()) : null);
    }

    public static /* synthetic */ scb k(by byVar, RecyclerView recyclerView) {
        return new scn(byVar, new sda(byVar, recyclerView, null));
    }

    public static final scb l(bv bvVar, View view) {
        bvVar.getClass();
        dvk viewLifecycleOwner = bvVar.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        return new scn(bvVar, new scq(viewLifecycleOwner, view));
    }

    public static final scb m(by byVar, View view) {
        byVar.getClass();
        return new scn(byVar, new scq(byVar, view));
    }

    public static final void n(sby sbyVar) {
        if (sbyVar != null && sby.a != null) {
            throw new UnsupportedOperationException("can't change current scope when it's not null");
        }
        sby.a = sbyVar;
    }

    public static final void o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new UnsupportedOperationException("Reoc cannot support multiple threads");
        }
    }

    public static final sbu p() {
        sby sbyVar = sby.a;
        if (sbyVar != null) {
            return sbyVar.a();
        }
        return null;
    }

    public static final void q(dvk dvkVar, yjk yjkVar) {
        dvkVar.getClass();
        o();
        sby sbyVar = new sby();
        sbyVar.s();
        sbyVar.d(new qyw(sbyVar, new sbu(sbyVar, yhb.a, new ynl(yjkVar, 1)), 9));
        sbz sbzVar = new sbz(sbyVar);
        dvkVar.getLifecycle().c(sbzVar);
        sbyVar.d = new yfw(dvkVar, new qyw(dvkVar, sbzVar, 11, null));
    }

    public static void r(Thread thread) {
        boolean z = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void s() {
        Thread.currentThread().interrupt();
    }

    public static void t(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void u(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static uhs v(ExecutorService executorService) {
        return executorService instanceof uhs ? (uhs) executorService : executorService instanceof ScheduledExecutorService ? new uhy((ScheduledExecutorService) executorService) : new uhv(executorService);
    }

    public static uht w(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof uht ? (uht) scheduledExecutorService : new uhy(scheduledExecutorService);
    }

    public static Executor x(final Executor executor, final ufb ufbVar) {
        executor.getClass();
        return executor == ugk.a ? executor : new Executor() { // from class: uhu
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                sfy.y(executor, ufbVar, runnable);
            }
        };
    }

    public static /* synthetic */ void y(Executor executor, ufb ufbVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            ufbVar.e(e);
        }
    }

    public static uhp z(Iterable iterable) {
        return new ugf(ImmutableList.copyOf(iterable), true);
    }
}
