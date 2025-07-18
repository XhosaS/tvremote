package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afem {
    public static final afem a;
    public final afft b;
    public final Executor c;
    public final String d = null;
    public final afej e;
    public final String f;
    public final List g;
    public final Integer h;
    public final Integer i;
    private final Object[][] j;
    private final Boolean k;

    static {
        afek afekVar = new afek();
        afekVar.e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        afekVar.f = Collections.EMPTY_LIST;
        a = new afem(afekVar);
    }

    public afem(afek afekVar) {
        this.b = afekVar.a;
        this.c = afekVar.b;
        this.e = afekVar.c;
        this.f = afekVar.d;
        this.j = afekVar.e;
        this.g = afekVar.f;
        this.k = afekVar.g;
        this.h = afekVar.h;
        this.i = afekVar.i;
    }

    public static afek a(afem afemVar) {
        afek afekVar = new afek();
        afekVar.a = afemVar.b;
        afekVar.b = afemVar.c;
        afekVar.c = afemVar.e;
        afekVar.d = afemVar.f;
        afekVar.e = afemVar.j;
        afekVar.f = afemVar.g;
        afekVar.g = afemVar.k;
        afekVar.h = afemVar.h;
        afekVar.i = afemVar.i;
        return afekVar;
    }

    public final afem b(afej afejVar) {
        afek afekVarA = a(this);
        afekVarA.c = afejVar;
        return new afem(afekVarA);
    }

    public final afem c(afft afftVar) {
        afek afekVarA = a(this);
        afekVarA.a = afftVar;
        return new afem(afekVarA);
    }

    public final afem d(int i) {
        yqw.D(i >= 0, "invalid maxsize %s", i);
        afek afekVarA = a(this);
        afekVarA.h = Integer.valueOf(i);
        return new afem(afekVarA);
    }

    public final afem e(int i) {
        yqw.D(i >= 0, "invalid maxsize %s", i);
        afek afekVarA = a(this);
        afekVarA.i = Integer.valueOf(i);
        return new afem(afekVarA);
    }

    public final afem f(afel afelVar, Object obj) {
        Object[][] objArr;
        int length;
        afelVar.getClass();
        obj.getClass();
        afek afekVarA = a(this);
        int i = 0;
        while (true) {
            objArr = this.j;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (afelVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        afekVarA.e = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, afekVarA.e, 0, length);
        if (i == -1) {
            afekVarA.e[length] = new Object[]{afelVar, obj};
        } else {
            afekVarA.e[i] = new Object[]{afelVar, obj};
        }
        return new afem(afekVarA);
    }

    public final afem g(afeu afeuVar) {
        List list = this.g;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(afeuVar);
        afek afekVarA = a(this);
        afekVarA.f = DesugarCollections.unmodifiableList(arrayList);
        return new afem(afekVarA);
    }

    public final Object h(afel afelVar) {
        afelVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.j;
            if (i >= objArr.length) {
                return afelVar.a;
            }
            if (afelVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean i() {
        return Boolean.TRUE.equals(this.k);
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("deadline", this.b);
        yqqVarB.b("authority", null);
        yqqVarB.b("callCredentials", this.e);
        Executor executor = this.c;
        yqqVarB.b("executor", executor != null ? executor.getClass() : null);
        yqqVarB.b("compressorName", this.f);
        yqqVarB.b("customOptions", Arrays.deepToString(this.j));
        yqqVarB.c("waitForReady", String.valueOf(i()));
        yqqVarB.b("maxInboundMessageSize", this.h);
        yqqVarB.b("maxOutboundMessageSize", this.i);
        yqqVarB.b("onReadyThreshold", null);
        yqqVarB.b("streamTracerFactories", this.g);
        return yqqVarB.toString();
    }
}
