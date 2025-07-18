package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uti extends xpz {
    private final String a;
    private final uqh b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public uti(String str, uqh uqhVar) {
        this.a = str;
        this.b = uqhVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            return uri.getPort() != -1 ? uri : new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.xpz
    public final xqb a(xsq xsqVar, xpy xpyVar) {
        Context context;
        URI uri;
        Executor executor;
        Executor executor2;
        Executor executor3;
        ttm ttmVar;
        String str = (String) xpyVar.g(uqt.a);
        if (str == null) {
            str = this.a;
        }
        uqh uqhVar = this.b;
        URI uriC = c(str);
        sij.x(!TextUtils.isEmpty(uriC.getAuthority()), "Could not parse channel authority");
        Integer num = (Integer) xpyVar.g(uuc.a);
        Integer num2 = (Integer) xpyVar.g(uuc.b);
        Integer num3 = (Integer) xpyVar.g(uqp.a);
        long jLongValue = ((Long) ((ttp) uqhVar.k).a).longValue();
        long j = uqhVar.n;
        long j2 = uqhVar.o;
        uth uthVar = new uth(uriC, jLongValue, j, j2, num, num2, num3);
        ConcurrentHashMap concurrentHashMap = this.d;
        utg utgVar = (utg) concurrentHashMap.get(uthVar);
        if (utgVar == null) {
            synchronized (this.c) {
                if (!concurrentHashMap.containsKey(uthVar)) {
                    long j3 = uqv.a;
                    eik eikVar = new eik(17);
                    uqu uquVar = new uqu();
                    uquVar.d(eikVar);
                    uquVar.c(4194304);
                    uquVar.a(Long.MAX_VALUE);
                    uquVar.b(uqv.a);
                    Context context2 = uqhVar.a;
                    if (context2 == null) {
                        throw new NullPointerException("Null applicationContext");
                    }
                    uquVar.a = context2;
                    uquVar.b = uthVar.a;
                    uquVar.h = uthVar.c;
                    uquVar.i = uthVar.d;
                    uquVar.j = uthVar.b;
                    uquVar.n = (byte) (uquVar.n | 1);
                    Executor executor4 = uqhVar.d;
                    if (executor4 == null) {
                        throw new NullPointerException("Null backgroundExecutor");
                    }
                    uquVar.c = executor4;
                    Executor executor5 = uqhVar.e;
                    if (executor5 == null) {
                        throw new NullPointerException("Null blockingExecutor");
                    }
                    uquVar.d = executor5;
                    Executor executor6 = uqhVar.c;
                    if (executor6 == null) {
                        throw new NullPointerException("Null lightweightExecutor");
                    }
                    uquVar.e = executor6;
                    uquVar.d(uqhVar.h);
                    uquVar.g = uqhVar.l;
                    uquVar.a(j);
                    uquVar.b(j2);
                    Integer num4 = uthVar.e;
                    if (num4 != null) {
                        uquVar.c(num4.intValue());
                    } else {
                        uquVar.c(uqhVar.m);
                    }
                    uqw uqwVar = uqhVar.b;
                    if (uquVar.n == 15 && (context = uquVar.a) != null && (uri = uquVar.b) != null && (executor = uquVar.c) != null && (executor2 = uquVar.d) != null && (executor3 = uquVar.e) != null && (ttmVar = uquVar.f) != null) {
                        concurrentHashMap.put(uthVar, new utg(uqwVar, new uqv(context, uri, executor, executor2, executor3, ttmVar, uquVar.g, uquVar.h, uquVar.i, uquVar.j, uquVar.k, uquVar.l, uquVar.m)));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (uquVar.a == null) {
                        sb.append(" applicationContext");
                    }
                    if (uquVar.b == null) {
                        sb.append(" uri");
                    }
                    if (uquVar.c == null) {
                        sb.append(" backgroundExecutor");
                    }
                    if (uquVar.d == null) {
                        sb.append(" blockingExecutor");
                    }
                    if (uquVar.e == null) {
                        sb.append(" lightweightExecutor");
                    }
                    if (uquVar.f == null) {
                        sb.append(" recordNetworkMetricsToPrimes");
                    }
                    if ((uquVar.n & 1) == 0) {
                        sb.append(" grpcIdleTimeoutMillis");
                    }
                    if ((uquVar.n & 2) == 0) {
                        sb.append(" maxMessageSize");
                    }
                    if ((uquVar.n & 4) == 0) {
                        sb.append(" grpcKeepAliveTimeMillis");
                    }
                    if ((uquVar.n & 8) == 0) {
                        sb.append(" grpcKeepAliveTimeoutMillis");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                utgVar = (utg) concurrentHashMap.get(uthVar);
            }
        }
        return utgVar.a(xsqVar, xpyVar);
    }

    @Override // defpackage.xpz
    public final String b() {
        return this.a;
    }
}
