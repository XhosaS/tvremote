package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afuv extends afhs {
    private static final Method t;
    afvo f;
    public afvo g;
    afiy h;
    final List i;
    final String j;
    public String k;
    final String l;
    public affw m;
    final affb n;
    public long o;
    final afgm p;
    public final afuo q;
    private final List u;
    private final afup v;
    private static final Logger r = Logger.getLogger(afuv.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    public static final afvo c = new afzv(afrq.m);
    public static final affw d = affw.b;
    private static final affb s = affb.a;
    static final Pattern e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method declaredMethod = null;
        try {
            Class<?> cls = Class.forName("afmb");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        t = declaredMethod;
    }

    public afuv(String str, afup afupVar, afuo afuoVar) {
        afvo afvoVar = c;
        this.f = afvoVar;
        this.g = afvoVar;
        this.u = new ArrayList();
        this.h = afiy.b();
        this.i = new ArrayList();
        this.l = "pick_first";
        this.m = d;
        this.n = s;
        this.o = a;
        this.p = afgm.b;
        new ArrayList();
        str.getClass();
        this.j = str;
        this.v = afupVar;
        this.q = afuoVar;
        afgp.a();
    }

    static afuu b(String str, afiy afiyVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        afiw afiwVarA = uri != null ? afiyVar.a(uri.getScheme()) : null;
        if (afiwVarA == null && !e.matcher(str).matches()) {
            try {
                uri = new URI(afiyVar.c(), "", a.j(str, "/"), null);
                afiwVarA = afiyVar.a(uri.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (afiwVarA == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.t(sb, " (", ")") : ""));
        }
        if (collection == null || collection.containsAll(afiwVarA.c())) {
            return new afuu(uri, afiwVarA);
        }
        throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
    }

    static String c(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", a.p(socketAddress, "/"), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.afhs
    public final afhq a() {
        afer aferVar;
        afoj afojVarA = this.v.a();
        afuu afuuVarB = b(this.j, this.h, afojVarA.b());
        URI uri = afuuVarB.a;
        afiw afiwVar = afuuVarB.b;
        afqx afqxVar = new afqx();
        afzv afzvVar = new afzv(afrq.m);
        yrp yrpVar = afrq.o;
        uri.toString();
        List list = this.u;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            afer aferVar2 = null;
            if (!it.hasNext()) {
                affd.a().c();
                Method method = t;
                if (method != null) {
                    try {
                        aferVar = (afer) method.invoke(null, true, true, false, true);
                    } catch (IllegalAccessException e2) {
                        r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                    } catch (InvocationTargetException e3) {
                        r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                    }
                } else {
                    aferVar = null;
                }
                if (aferVar != null) {
                    arrayList.add(0, aferVar);
                }
                try {
                    aferVar2 = (afer) Class.forName("afmc").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e4) {
                    r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                } catch (IllegalAccessException e5) {
                    r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (NoSuchMethodException e6) {
                    r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                } catch (InvocationTargetException e7) {
                    r.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e7);
                }
                if (aferVar2 != null) {
                    arrayList.add(0, aferVar2);
                }
                return new afux(new afun(this, afojVarA, uri, afiwVar, afqxVar, afzvVar, yrpVar, arrayList, agaa.a));
            }
            afer aferVar3 = (afer) it.next();
            if (aferVar3 instanceof afus) {
                afhr afhrVar = ((afus) aferVar3).a;
                throw null;
            }
            arrayList.add(aferVar3);
        }
    }

    public final void d(Executor executor) {
        if (executor != null) {
            this.f = new afrb(executor);
        } else {
            this.f = c;
        }
    }

    public final void e(List list) {
        this.u.addAll(list);
    }

    public afuv(SocketAddress socketAddress, String str, afup afupVar) {
        afvo afvoVar = c;
        this.f = afvoVar;
        this.g = afvoVar;
        this.u = new ArrayList();
        this.h = afiy.b();
        this.i = new ArrayList();
        this.l = "pick_first";
        this.m = d;
        this.n = s;
        this.o = a;
        this.p = afgm.b;
        new ArrayList();
        this.j = c(socketAddress);
        this.v = afupVar;
        afiy afiyVar = new afiy();
        afiyVar.e(new afur(socketAddress, str));
        this.h = afiyVar;
        this.q = new afut();
        afgp.a();
    }
}
