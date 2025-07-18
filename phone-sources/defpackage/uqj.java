package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqj implements uqw {
    private static final tvn a = tvn.n("xRPC");
    private final yfo b;

    @Deprecated
    public uqj(yfo yfoVar) {
        yfoVar.getClass();
        this.b = yfoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uqw
    public final xpz a(uqv uqvVar) {
        sjl.b();
        try {
            CronetEngine cronetEngine = (CronetEngine) this.b.b();
            String defaultUserAgent = new CronetEngine.Builder(uqvVar.b).getDefaultUserAgent();
            String strB = uqvVar.b();
            int iA = uqvVar.a();
            cronetEngine.getClass();
            xty xtyVar = new xty(strB, iA, cronetEngine);
            xyx xyxVar = xtyVar.b;
            xyxVar.m = defaultUserAgent;
            xtyVar.g(uqvVar.e);
            xtyVar.Z(uqvVar.d);
            xtyVar.h(uqvVar.j, TimeUnit.MILLISECONDS);
            int i = uqvVar.k;
            sij.o(i >= 0, "maxMessageSize must be >= 0");
            xtyVar.c = i;
            uqo uqoVar = uqvVar.g;
            if (uqoVar != null) {
                ImmutableSet immutableSet = uqoVar.a;
                UnmodifiableIterator it = immutableSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((uqn) it.next()).b != null) {
                        xyxVar.r = true;
                        ImmutableList.Builder builder = ImmutableList.builder();
                        UnmodifiableIterator it2 = immutableSet.iterator();
                        while (it2.hasNext()) {
                            uqn uqnVar = (uqn) it2.next();
                            ImmutableMap.Builder builder2 = ImmutableMap.builder();
                            ImmutableMap.Builder builder3 = ImmutableMap.builder();
                            builder3.put("service", uqnVar.a);
                            builder2.put("name", ImmutableList.of(builder3.buildOrThrow()));
                            uqm uqmVar = uqnVar.b;
                            if (uqmVar != null && uqmVar.a) {
                                ImmutableMap.Builder builder4 = ImmutableMap.builder();
                                builder4.put("maxAttempts", Double.valueOf(uqmVar.b));
                                builder4.put("initialBackoff", uqmVar.c + "s");
                                builder4.put("maxBackoff", uqmVar.d + "s");
                                builder4.put("backoffMultiplier", Double.valueOf(uqmVar.e));
                                builder4.put("retryableStatusCodes", Lists.transform(uqmVar.f, new uhe(3)));
                                builder2.putAll(ImmutableMap.of("retryPolicy", builder4.buildOrThrow()));
                            }
                            builder.add((ImmutableList.Builder) builder2.buildOrThrow());
                        }
                        xyxVar.t = xyx.g(ImmutableMap.of("methodConfig", builder.build()));
                    }
                }
            }
            Integer num = uqvVar.h;
            if (num != null) {
                int iIntValue = num.intValue();
                xtyVar.f = true;
                xtyVar.g = iIntValue;
            }
            Integer num2 = uqvVar.i;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                xtyVar.d = true;
                xtyVar.e = iIntValue2;
            }
            return wbb.y(xtyVar.f(), new owp(new utc(uqvVar.f, 1)));
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", 'Q', "CronetWithOkHttpFallbackTransport.java")).s("Failed to load Cronet, falling back on OkHttp implementation");
            ycq ycqVar = new ycq(xxc.d(uqvVar.b(), uqvVar.a()));
            ycqVar.g(uqvVar.e);
            Executor executor = uqvVar.d;
            if (executor == null) {
                ycqVar.d = ycq.c;
            } else {
                ycqVar.d = new ybr(executor, 1);
            }
            ycqVar.Z(executor);
            ycqVar.h(uqvVar.j, TimeUnit.MILLISECONDS);
            long j = uqvVar.l;
            boolean z = j > 0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            sij.o(z, "keepalive time must be positive");
            long nanos = timeUnit.toNanos(j);
            ycqVar.g = nanos;
            long jMax = Math.max(nanos, xxw.a);
            ycqVar.g = jMax;
            if (jMax >= ycq.b) {
                ycqVar.g = Long.MAX_VALUE;
            }
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            sij.o(z, "keepalive timeout must be positive");
            long nanos2 = timeUnit2.toNanos(j);
            ycqVar.h = nanos2;
            ycqVar.h = Math.max(nanos2, xxw.b);
            return wbb.y(ycqVar.f(), new utc(uqvVar.f, 1));
        }
    }
}
