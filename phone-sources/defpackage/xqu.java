package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xqu extends wbb {
    public xqu() {
        super(null);
    }

    public final void Z(Executor executor) {
        wbb wbbVarAa = aa();
        if (executor != null) {
            ((xyx) wbbVarAa).h = new ybr(executor, 1);
        } else {
            ((xyx) wbbVarAa).h = xyx.d;
        }
    }

    public abstract wbb aa();

    public final xsa f() {
        xqc xqcVar;
        wbb wbbVarAa = aa();
        xyx xyxVar = (xyx) wbbVarAa;
        xvp xvpVarA = xyxVar.z.a();
        ulo uloVarH = xyx.h(xyxVar.l, xyxVar.j, xvpVarA.b());
        Object obj = uloVarH.a;
        Object obj2 = uloVarH.b;
        ybr ybrVar = new ybr(xxc.n, 0);
        ttm ttmVar = xxc.p;
        URI uri = (URI) obj;
        uri.toString();
        List list = xyxVar.i;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            xqc xqcVar2 = null;
            if (!it.hasNext()) {
                zlj.n().m();
                boolean z = xyxVar.u;
                Method method = xyx.f;
                if (method != null) {
                    try {
                        boolean z2 = ((xyx) wbbVarAa).v;
                        boolean z3 = ((xyx) wbbVarAa).w;
                        boolean z4 = ((xyx) wbbVarAa).x;
                        xqcVar = (xqc) method.invoke(null, true, true, false, true);
                    } catch (IllegalAccessException e) {
                        xyx.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                    } catch (InvocationTargetException e2) {
                        xyx.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                    }
                } else {
                    xqcVar = null;
                }
                if (xqcVar != null) {
                    arrayList.add(0, xqcVar);
                }
                boolean z5 = xyxVar.y;
                try {
                    xqcVar2 = (xqc) Class.forName("xtv").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e3) {
                    xyx.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                } catch (IllegalAccessException e4) {
                    xyx.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                } catch (NoSuchMethodException e5) {
                    xyx.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (InvocationTargetException e6) {
                    xyx.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                }
                if (xqcVar2 != null) {
                    arrayList.add(0, xqcVar2);
                }
                return new xyz(new xyr(xyxVar, xvpVarA, uri, (xsy) obj2, ybrVar, ttmVar, arrayList, ybv.a));
            }
            xqc xqcVar3 = (xqc) it.next();
            if (xqcVar3 instanceof xyw) {
                xsb xsbVar = ((xyw) xqcVar3).a;
                throw null;
            }
            arrayList.add(xqcVar3);
        }
    }

    public final void g(Executor executor) {
        wbb wbbVarAa = aa();
        if (executor != null) {
            ((xyx) wbbVarAa).g = new ybr(executor, 1);
        } else {
            ((xyx) wbbVarAa).g = xyx.d;
        }
    }

    public final void h(long j, TimeUnit timeUnit) {
        boolean z = j > 0;
        wbb wbbVarAa = aa();
        sij.r(z, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            ((xyx) wbbVarAa).q = -1L;
        } else {
            ((xyx) wbbVarAa).q = Math.max(timeUnit.toMillis(j), xyx.c);
        }
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", aa());
        return tssVarH.toString();
    }
}
