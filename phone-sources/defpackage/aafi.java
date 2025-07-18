package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import j$.time.Instant;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafi {
    public final Object a;
    public final Object b;
    public final Object c;

    public aafi() {
        this((byte[]) null);
    }

    private final Method F(Class cls) throws NoSuchMethodException, SecurityException {
        Object obj;
        Method methodG = G(cls, (String) this.a, (Class[]) this.c);
        if (methodG == null || (obj = this.b) == null) {
            return methodG;
        }
        if (((Class) obj).isAssignableFrom(methodG.getReturnType())) {
            return methodG;
        }
        return null;
    }

    private static Method G(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return G(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private static final String H(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    private final unc I(Uri uri) throws ske {
        ImmutableList.Builder builder = ImmutableList.builder();
        Pattern pattern = skk.a;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        String encodedFragment = uri.getEncodedFragment();
        UnmodifiableIterator it = ((TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? ImmutableList.of() : ImmutableList.copyOf(uof.h("+").f().b(encodedFragment.substring(10)))).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Matcher matcher = skk.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            builder2.add((ImmutableList.Builder) matcher.group(1));
        }
        UnmodifiableIterator it2 = builder2.build().iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            sky skyVar = (sky) this.a.get(str2);
            if (skyVar == null) {
                throw new ske("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            builder.add((ImmutableList.Builder) skyVar);
        }
        ImmutableList immutableListReverse = builder.build().reverse();
        sjo sjoVar = new sjo();
        sjoVar.a = this;
        String scheme = uri.getScheme();
        skt sktVar = (skt) this.c.get(scheme);
        if (sktVar == null) {
            throw new ske(String.format("Requested backend isn't registered: %s", scheme));
        }
        sjoVar.b = sktVar;
        sjoVar.d = this.b;
        sjoVar.c = immutableListReverse;
        sjoVar.e = uri;
        if (!immutableListReverse.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String strB = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = immutableListReverse.listIterator(immutableListReverse.size());
                while (listIterator.hasPrevious()) {
                    strB = ((sky) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, strB);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        sjoVar.f = uri;
        return new unc(sjoVar);
    }

    static String k(String str) {
        return str.concat("|S|cre");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, pyg] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, qmt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(defpackage.qen r10, long r11, defpackage.vlo r13, defpackage.vme r14, defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.A(qen, long, vlo, vme, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(defpackage.qen r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.pwa
            if (r0 == 0) goto L13
            r0 = r7
            pwa r0 = (defpackage.pwa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            pwa r0 = new pwa
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L27
            goto L57
        L27:
            r6 = move-exception
            goto L5b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r5.c     // Catch: java.lang.Throwable -> L27
            nsf r7 = (defpackage.nsf) r7     // Catch: java.lang.Throwable -> L27
            smc r6 = r7.o(r6)     // Catch: java.lang.Throwable -> L27
            oun r7 = new oun     // Catch: java.lang.Throwable -> L27
            r2 = 9
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L27
            pgc r2 = new pgc     // Catch: java.lang.Throwable -> L27
            r4 = 4
            r2.<init>(r7, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r5.b     // Catch: java.lang.Throwable -> L27
            uhp r6 = r6.b(r2, r7)     // Catch: java.lang.Throwable -> L27
            r0.b = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = defpackage.wae.U(r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L5a
        L57:
            ygi r6 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L27
            goto L5f
        L5a:
            return r1
        L5b:
            java.lang.Object r6 = defpackage.ybn.e(r6)
        L5f:
            r7 = 19
            qdl r6 = defpackage.osk.am(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.B(qen, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(defpackage.qen r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.pwb
            if (r0 == 0) goto L13
            r0 = r8
            pwb r0 = (defpackage.pwb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            pwb r0 = new pwb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r8)     // Catch: java.lang.Throwable -> L27
            goto L4c
        L27:
            r7 = move-exception
            goto L9b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
            java.lang.Object r8 = r6.c     // Catch: java.lang.Throwable -> L27
            nsf r8 = (defpackage.nsf) r8     // Catch: java.lang.Throwable -> L27
            smc r7 = r8.o(r7)     // Catch: java.lang.Throwable -> L27
            uhp r7 = r7.a()     // Catch: java.lang.Throwable -> L27
            r7.getClass()     // Catch: java.lang.Throwable -> L27
            r0.b = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = defpackage.wae.U(r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r8 != r1) goto L4c
            return r1
        L4c:
            pwg r8 = (defpackage.pwg) r8     // Catch: java.lang.Throwable -> L27
            pwh r7 = r8.c     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L54
            pwh r7 = defpackage.pwh.a     // Catch: java.lang.Throwable -> L27
        L54:
            long r0 = r7.c     // Catch: java.lang.Throwable -> L27
            vve r7 = r8.d     // Catch: java.lang.Throwable -> L27
            java.util.Map r7 = j$.util.DesugarCollections.unmodifiableMap(r7)     // Catch: java.lang.Throwable -> L27
            r7.getClass()     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L27
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L27
            int r2 = defpackage.yfm.e(r2)     // Catch: java.lang.Throwable -> L27
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L27
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L27
        L74:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L95
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L27
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L27
            pwh r2 = (defpackage.pwh) r2     // Catch: java.lang.Throwable -> L27
            long r4 = r2.c     // Catch: java.lang.Throwable -> L27
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L27
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27
            r8.put(r3, r2)     // Catch: java.lang.Throwable -> L27
            goto L74
        L95:
            psz r7 = new psz     // Catch: java.lang.Throwable -> L27
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L27
            goto L9f
        L9b:
            java.lang.Object r7 = defpackage.ybn.e(r7)
        L9f:
            r8 = 19
            qdl r7 = defpackage.osk.am(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.C(qen, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(defpackage.qen r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pwc
            if (r0 == 0) goto L13
            r0 = r6
            pwc r0 = (defpackage.pwc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            pwc r0 = new pwc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            r0.b = r3
            java.lang.Object r6 = r4.C(r5, r0)
            if (r6 == r1) goto L5c
        L3a:
            qdl r6 = (defpackage.qdl) r6
            boolean r5 = r6 instanceof defpackage.qdn
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.a
            tst r5 = (defpackage.tst) r5
            java.lang.Object r5 = r5.f()
            qrr r5 = (defpackage.qrr) r5
            if (r5 == 0) goto L59
            qdn r6 = (defpackage.qdn) r6
            java.lang.Object r6 = r6.a
            psz r6 = (defpackage.psz) r6
            long r0 = r6.a
            java.util.Map r6 = r6.b
            r5.a()
        L59:
            ygi r5 = defpackage.ygi.a
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.D(qen, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r5.D(r0, r3) != r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(defpackage.qen r17, long r18, long r20, java.util.Map r22, defpackage.yih r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r23
            boolean r3 = r2 instanceof defpackage.pwd
            if (r3 == 0) goto L19
            r3 = r2
            pwd r3 = (defpackage.pwd) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.b = r4
            goto L1e
        L19:
            pwd r3 = new pwd
            r3.<init>(r1, r2)
        L1e:
            java.lang.Object r2 = r3.a
            yio r4 = defpackage.yio.a
            int r5 = r3.b
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L46
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L32
            defpackage.ybn.f(r2)     // Catch: java.lang.Throwable -> L30
            goto L90
        L30:
            r0 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            ylb r0 = r3.c
            aafi r5 = r3.f
            qen r7 = r3.d
            defpackage.ybn.f(r2)     // Catch: java.lang.Throwable -> L30
            r11 = r0
            r0 = r7
            goto L7d
        L46:
            defpackage.ybn.f(r2)
            ylb r11 = new ylb     // Catch: java.lang.Throwable -> L30
            r11.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r1.c     // Catch: java.lang.Throwable -> L30
            nsf r2 = (defpackage.nsf) r2     // Catch: java.lang.Throwable -> L30
            smc r2 = r2.o(r0)     // Catch: java.lang.Throwable -> L30
            ati r8 = new ati     // Catch: java.lang.Throwable -> L30
            r15 = 2
            r9 = r18
            r13 = r20
            r12 = r22
            r8.<init>(r9, r11, r12, r13, r15)     // Catch: java.lang.Throwable -> L30
            pgc r5 = new pgc     // Catch: java.lang.Throwable -> L30
            r9 = 5
            r5.<init>(r8, r9)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r1.b     // Catch: java.lang.Throwable -> L30
            uhp r2 = r2.b(r5, r8)     // Catch: java.lang.Throwable -> L30
            r3.d = r0     // Catch: java.lang.Throwable -> L30
            r3.f = r1     // Catch: java.lang.Throwable -> L30
            r3.c = r11     // Catch: java.lang.Throwable -> L30
            r3.b = r7     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = defpackage.wae.U(r2, r3)     // Catch: java.lang.Throwable -> L30
            if (r2 == r4) goto L93
            r5 = r1
        L7d:
            boolean r2 = r11.a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L90
            r2 = 0
            r3.d = r2     // Catch: java.lang.Throwable -> L30
            r3.f = r2     // Catch: java.lang.Throwable -> L30
            r3.c = r2     // Catch: java.lang.Throwable -> L30
            r3.b = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r5.D(r0, r3)     // Catch: java.lang.Throwable -> L30
            if (r0 == r4) goto L93
        L90:
            ygi r0 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L30
            goto L98
        L93:
            return r4
        L94:
            java.lang.Object r0 = defpackage.ybn.e(r0)
        L98:
            r2 = 19
            qdl r0 = defpackage.osk.am(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.E(qen, long, long, java.util.Map, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.regex.MatchResult] */
    public final ymd a() {
        ?? r0 = this.a;
        return ykn.r(r0.start(), r0.end());
    }

    public final Object b(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method methodF = F(obj.getClass());
            if (methodF != null) {
                try {
                    return methodF.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodF.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            Object obj2 = this.a;
            throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean c(Object obj) {
        return F(obj.getClass()) != null;
    }

    public final void d(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodF = F(obj.getClass());
            if (methodF == null) {
                return;
            }
            try {
                methodF.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.regex.MatchResult] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, java.lang.Object] */
    public final aafi e() {
        ?? r0 = this.a;
        int iEnd = r0.end() + (r0.end() == r0.start() ? 1 : 0);
        ?? r2 = this.b;
        if (iEnd > r2.length()) {
            return null;
        }
        Matcher matcher = ((Matcher) r0).pattern().matcher(r2);
        matcher.getClass();
        return yks.i(matcher, iEnd, r2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized unf f(String str, String str2, String str3) {
        unf unfVar;
        ?? r0 = this.b;
        String strH = H(str, str2, str3);
        unfVar = null;
        String string = r0.getString(strH, null);
        long j = unf.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    unfVar = new unf(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                unfVar = new unf(string, null, 0L);
            }
        }
        return unfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void g() {
        this.a.clear();
        this.b.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void h(String str, String str2, String str3) {
        ?? r0 = this.b;
        String strH = H(str, str2, str3);
        SharedPreferences.Editor editorEdit = r0.edit();
        editorEdit.remove(strH);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void i(String str, String str2, String str3, String str4, String str5) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = unf.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(H(str, str2, str3), string);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean j() {
        return this.b.getAll().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void l(String str) throws NumberFormatException {
        ?? r0 = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r0.contains(k(str))) {
            String string = r0.getString(k(str), null);
            jCurrentTimeMillis = 0;
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            ?? r02 = this.b;
            String strK = k(str);
            SharedPreferences.Editor editorEdit = r02.edit();
            editorEdit.putString(strK, String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.a.put(str, Long.valueOf(jCurrentTimeMillis));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final boolean m() {
        return this.a.isEmpty();
    }

    public final onz n() {
        Object objC;
        String packageName = ((Context) this.c).getPackageName();
        teo teoVar = (teo) this.b;
        if (teoVar.a == null) {
            objC = teo.c();
        } else {
            kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
            teoVar.a.e(new tek(teoVar, kwyVar, packageName, kwyVar), kwyVar);
            objC = kwyVar.a;
        }
        return (onz) objC;
    }

    public final synchronized void o(igv igvVar) {
        ((tex) this.a).b(igvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, svi] */
    public final void p() {
        Object obj = this.c;
        if (obj != null) {
            ((svj) obj).b(this.b, (View) this.a, false);
        }
    }

    public final void q() {
        Object obj = this.c;
        if (obj != null) {
            ((svj) obj).c((View) this.a);
        }
    }

    public final Object r(Uri uri, sjp sjpVar) {
        return sjpVar.a(I(uri));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, skt] */
    public final void s(Uri uri) throws ske {
        unc uncVarI = I(uri);
        uncVarI.a.f((Uri) uncVarI.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, skt] */
    public final void t(Uri uri, Uri uri2) throws ske {
        unc uncVarI = I(uri);
        ?? r0 = uncVarI.a;
        unc uncVarI2 = I(uri2);
        if (r0 != uncVarI2.a) {
            throw new ske("Cannot rename file across backends");
        }
        r0.g((Uri) uncVarI.c, (Uri) uncVarI2.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, skt] */
    public final boolean u(Uri uri) throws ske {
        unc uncVarI = I(uri);
        return uncVarI.a.h((Uri) uncVarI.c);
    }

    public final boolean v(ttm ttmVar) {
        if (((rop) this.a).b().booleanValue()) {
            return ((rou) this.b).c.a == 2;
        }
        return rpd.d((Context) this.c, (rpe) ttmVar.get());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qth] */
    public final void w(View view, Object obj) {
        qvg.a(view, (tst) this.a, 501, this.c, obj, "https://www.google.com/policies/privacy", (tst) this.b);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qth] */
    public final void x(View view, Object obj) {
        qvg.a(view, (tst) this.a, 504, this.c, obj, "https://myaccount.google.com/termsofservice", (tst) this.b);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, qfk] */
    public final void y(qfi qfiVar, Context context, long j) throws Throwable {
        if (xfl.a.get().b()) {
            ykr.n(yim.a, new dsk(this, qfiVar, context, j, (yih) null, 9));
        } else {
            this.c.f(qfiVar, osk.ad(context), j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, pyg] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, qmt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.qen r19, long r20, java.util.List r22, defpackage.vlo r23, defpackage.vme r24, defpackage.yih r25) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.z(qen, long, java.util.List, vlo, vme, yih):java.lang.Object");
    }

    public aafi(aaft aaftVar, aafs aafsVar) {
        this.a = aaftVar;
        this.b = aafsVar;
        this.c = null;
    }

    public aafi(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public aafi(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public aafi(String str, String str2, String[] strArr) {
        this.c = str;
        this.a = str2;
        this.b = strArr;
    }

    public aafi(List list, String str, ArrayList arrayList) {
        this.b = list;
        this.c = str;
        this.a = arrayList;
    }

    public aafi(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
        this.c = new ynh(this);
    }

    public aafi(rzu rzuVar, sew sewVar, rrx rrxVar) {
        this.b = rzuVar;
        this.a = sewVar;
        this.c = rrxVar;
    }

    public aafi(svi sviVar, View view) {
        this.c = Build.VERSION.SDK_INT >= 34 ? new svl() : Build.VERSION.SDK_INT >= 33 ? new svj() : null;
        this.b = sviVar;
        this.a = view;
    }

    public aafi(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        this.a = xtkVar;
        this.b = xvlVar;
        this.c = xsmVar;
    }

    public aafi(Context context, String str) {
        nsz nszVar = new nsz(context, str, null);
        this.c = new CopyOnWriteArrayList();
        if (str.startsWith("STREAMZ_")) {
            this.a = nszVar;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }

    public aafi(nsf nsfVar, uhs uhsVar, tst tstVar) {
        uhsVar.getClass();
        this.c = nsfVar;
        this.b = uhsVar;
        this.a = tstVar;
    }

    public aafi(teo teoVar, tex texVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.b = teoVar;
        this.a = texVar;
        this.c = context;
    }

    public aafi(vsz vszVar, String str, String str2) {
        this.c = tzs.e;
        this.b = sij.l(new evk(this, vszVar, 19, null));
        this.a = sij.l(new rzo(this, str, str2, 1));
    }

    public /* synthetic */ aafi(byte[] bArr) {
        this.a = yoz.m();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
    }

    public aafi(qei qeiVar, pyg pygVar, qmt qmtVar, byte[] bArr) {
        qeiVar.getClass();
        pygVar.getClass();
        this.a = qeiVar;
        this.c = pygVar;
        this.b = qmtVar;
    }

    public aafi(ukh ukhVar) {
        this.b = new HashSet();
        this.a = new HashSet();
        this.c = ukhVar;
    }

    public aafi(qei qeiVar, pyg pygVar, qmt qmtVar) {
        qeiVar.getClass();
        pygVar.getClass();
        this.b = qeiVar;
        this.c = pygVar;
        this.a = qmtVar;
    }

    public aafi(Context context) {
        this.a = new ir();
        this.c = context;
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || j()) {
                return;
            }
            g();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public aafi(List list) {
        List<sky> list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            skt sktVar = (skt) it.next();
            if (TextUtils.isEmpty(sktVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                skt sktVar2 = (skt) this.c.put(sktVar.e(), sktVar);
                if (sktVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + sktVar2.getClass().getCanonicalName() + " with " + sktVar.getClass().getCanonicalName());
                }
            }
        }
        for (sky skyVar : list2) {
            if (TextUtils.isEmpty(skyVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                sky skyVar2 = (sky) this.a.put(skyVar.a(), skyVar);
                if (skyVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + skyVar2.getClass().getCanonicalName() + " with " + skyVar.getClass().getCanonicalName());
                }
            }
        }
        this.b.addAll(list3);
    }

    public aafi(qei qeiVar, qjq qjqVar, qmt qmtVar) {
        qeiVar.getClass();
        qjqVar.getClass();
        this.c = qeiVar;
        this.b = qjqVar;
        this.a = qmtVar;
    }

    public aafi(osk oskVar, qfk qfkVar, qpr qprVar) {
        oskVar.getClass();
        this.b = oskVar;
        this.c = qfkVar;
        this.a = qprVar;
    }

    public aafi(rbi rbiVar, yil yilVar) {
        this.b = rbiVar;
        this.c = yilVar;
        this.a = new yyk();
    }

    public aafi(qth qthVar, tst tstVar, tst tstVar2) {
        qthVar.getClass();
        this.c = qthVar;
        this.a = tstVar;
        this.b = tstVar2;
    }

    public aafi(yfo yfoVar, cb cbVar, yfo yfoVar2) {
        yfoVar.getClass();
        yfoVar2.getClass();
        this.a = yfoVar;
        this.c = cbVar;
        this.b = yfoVar2;
    }

    public aafi(String str, Instant instant, Instant instant2) {
        this.a = str;
        instant.getClass();
        this.c = instant;
        this.b = instant2;
    }

    public aafi(Object obj, xsm xsmVar, xsm xsmVar2) {
        obj.getClass();
        this.a = obj;
        this.c = xsmVar;
        this.b = xsmVar2;
    }
}
