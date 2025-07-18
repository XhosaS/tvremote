package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyx extends wbb {
    public static final Method f;
    public final xys A;
    public xzo g;
    public xzo h;
    public final List i;
    public xta j;
    final List k;
    public final String l;
    public String m;
    final String n;
    final xqs o;
    final xqi p;
    public long q;
    public boolean r;
    final xrb s;
    public Map t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final xyt z;
    public static final Logger a = Logger.getLogger(xyx.class.getName());
    static final long b = TimeUnit.MINUTES.toMillis(30);
    public static final long c = TimeUnit.SECONDS.toMillis(1);
    public static final xzo d = new ybr(xxc.n, 0);
    private static final xqs B = xqs.b;
    private static final xqi C = xqi.a;
    static final Pattern e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method declaredMethod = null;
        try {
            Class<?> cls = Class.forName("xtu");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        f = declaredMethod;
    }

    public xyx(String str, xyt xytVar, xys xysVar) {
        super(null);
        xzo xzoVar = d;
        this.g = xzoVar;
        this.h = xzoVar;
        this.i = new ArrayList();
        this.j = xta.b();
        this.k = new ArrayList();
        this.n = "pick_first";
        this.o = B;
        this.p = C;
        this.q = b;
        this.r = true;
        this.s = xrb.b;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        new ArrayList();
        str.getClass();
        this.l = str;
        this.z = xytVar;
        this.A = xysVar;
        wbb.w();
    }

    private static List Z(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(g((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(Z((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj.toString() + "' is of type '" + String.valueOf(obj.getClass()) + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static String f(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", a.ct(socketAddress, "/"), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Map g(Map map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            sij.s(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, g((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, Z((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + String.valueOf(entry) + "' is of type '" + String.valueOf(value.getClass()) + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static ulo h(String str, xta xtaVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        xsy xsyVarA = uri != null ? xtaVar.a(uri.getScheme()) : null;
        if (xsyVarA == null && !e.matcher(str).matches()) {
            try {
                uri = new URI(xtaVar.c(), "", a.cr(str, "/"), null);
                xsyVarA = xtaVar.a(uri.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (xsyVarA == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.ch(sb, " (", ")") : ""));
        }
        if (collection == null || collection.containsAll(xsyVarA.c())) {
            return new ulo(uri, xsyVarA);
        }
        throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
    }

    public xyx(SocketAddress socketAddress, String str, xyt xytVar) {
        super(null);
        xzo xzoVar = d;
        this.g = xzoVar;
        this.h = xzoVar;
        this.i = new ArrayList();
        this.j = xta.b();
        this.k = new ArrayList();
        this.n = "pick_first";
        this.o = B;
        this.p = C;
        this.q = b;
        this.r = true;
        this.s = xrb.b;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        new ArrayList();
        this.l = f(socketAddress);
        this.z = xytVar;
        xta xtaVar = new xta();
        xtaVar.e(new xyv(socketAddress, str));
        this.j = xtaVar;
        this.A = new ycn(1);
        wbb.w();
    }
}
