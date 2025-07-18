package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yks {
    private yks() {
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    public static void c(String str) {
        ygh yghVar = new ygh(a.cg(str, "lateinit property ", " has not been initialized"));
        f(yghVar, yks.class.getName());
        throw yghVar;
    }

    public static boolean d(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    static void f(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void g(Object obj, ArrayList arrayList) {
        Object[] objArr;
        int length;
        if (obj != null && (length = (objArr = (Object[]) obj).length) > 0) {
            arrayList.ensureCapacity(arrayList.size() + length);
            Collections.addAll(arrayList, objArr);
        }
    }

    public static final String h(String str) {
        String strQuote = Pattern.quote(str);
        strQuote.getClass();
        return strQuote;
    }

    public static final aafi i(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new aafi(matcher, charSequence);
        }
        return null;
    }

    public static final Throwable j(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ybn.h(runtimeException, th);
        return runtimeException;
    }

    public static final void k(yil yilVar, Throwable th) {
        if (th instanceof ypg) {
            th = ((ypg) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) yilVar.get(CoroutineExceptionHandler.d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(yilVar, th);
            } else {
                wae.T(yilVar, th);
            }
        } catch (Throwable th2) {
            wae.T(yilVar, j(th, th2));
        }
    }

    public static final Object l(Object obj, yih yihVar) {
        if (!(obj instanceof yon)) {
            return obj;
        }
        Throwable thA = ((yon) obj).b;
        if (yoy.b && (yihVar instanceof yiw)) {
            thA = yxn.a(thA, (yiw) yihVar);
        }
        return ybn.e(thA);
    }

    public static final Object m(Object obj) {
        Throwable thA = yfy.a(obj);
        return thA == null ? obj : new yon(thA);
    }

    public static final void n(yol yolVar, Object obj) {
        Throwable thA = yfy.a(obj);
        if (thA == null) {
            yolVar.S(obj);
        } else {
            yolVar.d(thA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r3 = defpackage.yoy.a;
        r3 = r0.d;
        r1 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((r1 instanceof defpackage.yom) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1 = ((defpackage.yom) r1).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r0.c.b = 536870911;
        r3.c(defpackage.ynx.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        return new defpackage.yof(r3, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.yof o(defpackage.yih r3) {
        /*
            boolean r0 = r3 instanceof defpackage.ywu
            if (r0 != 0) goto Lb
            yof r0 = new yof
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        Lb:
            r0 = r3
            ywu r0 = (defpackage.ywu) r0
            ynu r0 = r0.f
        L10:
            java.lang.Object r1 = r0.a
            if (r1 != 0) goto L1b
            yxo r1 = defpackage.ywv.b
            r0.c(r1)
            r0 = 0
            goto L2a
        L1b:
            boolean r2 = r1 instanceof defpackage.yof
            if (r2 == 0) goto L4e
            yxo r2 = defpackage.ywv.b
            boolean r2 = r0.d(r1, r2)
            if (r2 == 0) goto L10
            r0 = r1
            yof r0 = (defpackage.yof) r0
        L2a:
            if (r0 == 0) goto L47
            boolean r3 = defpackage.yoy.a
            ynu r3 = r0.d
            java.lang.Object r1 = r3.a
            boolean r2 = r1 instanceof defpackage.yom
            if (r2 == 0) goto L3a
            yom r1 = (defpackage.yom) r1
            java.lang.Object r1 = r1.d
        L3a:
            yns r1 = r0.c
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.b = r2
            ynx r1 = defpackage.ynx.a
            r3.c(r1)
            return r0
        L47:
            yof r0 = new yof
            r1 = 2
            r0.<init>(r3, r1)
            return r0
        L4e:
            yxo r2 = defpackage.ywv.b
            if (r1 == r2) goto L10
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L57
            goto L10
        L57:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.util.Objects.toString(r1)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = r1.concat(r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yks.o(yih):yof");
    }

    public static final void p(yoe yoeVar, ypm ypmVar) {
        ((yof) yoeVar).w(new yoc(ypmVar, 2));
    }
}
