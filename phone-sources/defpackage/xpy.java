package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpy {
    public static final xpy a;
    public final xqp b;
    public final Executor c;
    public final String d = null;
    public final List e;
    public final Integer f;
    public final Integer g;
    private final Object[][] h;
    private final Boolean i;

    static {
        xpw xpwVar = new xpw();
        xpwVar.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        xpwVar.d = Collections.EMPTY_LIST;
        a = new xpy(xpwVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public xpy(xpw xpwVar) {
        this.b = (xqp) xpwVar.a;
        this.c = xpwVar.b;
        this.h = (Object[][]) xpwVar.c;
        this.e = xpwVar.d;
        this.i = (Boolean) xpwVar.e;
        this.f = (Integer) xpwVar.f;
        this.g = (Integer) xpwVar.g;
    }

    public static xpw a(xpy xpyVar) {
        xpw xpwVar = new xpw();
        xpwVar.a = xpyVar.b;
        xpwVar.b = xpyVar.c;
        xpwVar.c = xpyVar.h;
        xpwVar.d = xpyVar.e;
        xpwVar.e = xpyVar.i;
        xpwVar.f = xpyVar.f;
        xpwVar.g = xpyVar.g;
        return xpwVar;
    }

    public final xpy b(xqp xqpVar) {
        xpw xpwVarA = a(this);
        xpwVarA.a = xqpVar;
        return new xpy(xpwVarA);
    }

    public final xpy c(Executor executor) {
        xpw xpwVarA = a(this);
        xpwVarA.b = executor;
        return new xpy(xpwVarA);
    }

    public final xpy d(int i) {
        sij.q(i >= 0, "invalid maxsize %s", i);
        xpw xpwVarA = a(this);
        xpwVarA.f = Integer.valueOf(i);
        return new xpy(xpwVarA);
    }

    public final xpy e(int i) {
        sij.q(i >= 0, "invalid maxsize %s", i);
        xpw xpwVarA = a(this);
        xpwVarA.g = Integer.valueOf(i);
        return new xpy(xpwVarA);
    }

    public final xpy f(xpx xpxVar, Object obj) {
        Object[][] objArr;
        int length;
        xpxVar.getClass();
        obj.getClass();
        xpw xpwVarA = a(this);
        int i = 0;
        while (true) {
            objArr = this.h;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (xpxVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        xpwVarA.c = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, xpwVarA.c, 0, length);
        if (i == -1) {
            ((Object[][]) xpwVarA.c)[length] = new Object[]{xpxVar, obj};
        } else {
            ((Object[][]) xpwVarA.c)[i] = new Object[]{xpxVar, obj};
        }
        return new xpy(xpwVarA);
    }

    public final Object g(xpx xpxVar) {
        xpxVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.h;
            if (i >= objArr.length) {
                return xpxVar.a;
            }
            if (xpxVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean h() {
        return Boolean.TRUE.equals(this.i);
    }

    public final xpy i(wbb wbbVar) {
        List list = this.e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(wbbVar);
        xpw xpwVarA = a(this);
        xpwVarA.d = DesugarCollections.unmodifiableList(arrayList);
        return new xpy(xpwVarA);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("deadline", this.b);
        tssVarH.b("authority", null);
        tssVarH.b("callCredentials", null);
        Executor executor = this.c;
        tssVarH.b("executor", executor != null ? executor.getClass() : null);
        tssVarH.b("compressorName", null);
        tssVarH.b("customOptions", Arrays.deepToString(this.h));
        tssVarH.f("waitForReady", h());
        tssVarH.b("maxInboundMessageSize", this.f);
        tssVarH.b("maxOutboundMessageSize", this.g);
        tssVarH.b("onReadyThreshold", null);
        tssVarH.b("streamTracerFactories", this.e);
        return tssVarH.toString();
    }
}
