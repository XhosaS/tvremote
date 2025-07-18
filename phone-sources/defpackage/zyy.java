package defpackage;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import j$.time.Duration;
import j$.time.TimeConversions;
import j$.util.DateRetargetClass;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyy extends ICronetEngineBuilder {
    private static boolean a;
    private static boolean b;
    private final HttpEngine.Builder c;

    public zyy(HttpEngine.Builder builder) {
        this.c = builder;
    }

    private static int a(int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        this.c.addPublicKeyPins(str, set, z, TimeConversions.convert(DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.c.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        return new zyz(this.c.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.c.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.c.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.c.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!b) {
            b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.c.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.c.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        aabh aabhVar = new aabh(str);
        ConnectionMigrationOptions.Builder builder = new ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(a(aabhVar.k()));
        builder.setPathDegradationMigration(a(vxr.aD((Boolean) aabhVar.f("QUIC", "allow_port_migration", null, Boolean.class))));
        int iJ = aabhVar.j();
        builder.setAllowNonDefaultNetworkUsage(a(iJ));
        if (iJ == 2) {
            builder.setPathDegradationMigration(a(2));
        }
        HttpEngine.Builder builder2 = this.c;
        builder2.setConnectionMigrationOptions(builder.build());
        DnsOptions.StaleDnsOptions.Builder builder3 = new DnsOptions.StaleDnsOptions.Builder();
        int iC = aabhVar.c();
        if (iC != -1) {
            builder3.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(iC)));
        }
        int iD = aabhVar.d();
        if (iD != -1) {
            builder3.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(iD)));
        }
        builder3.setAllowCrossNetworkUsage(a(aabhVar.l())).setUseStaleOnNameNotResolved(a(aabhVar.o()));
        DnsOptions.Builder builder4 = new DnsOptions.Builder();
        builder4.setUseHttpStackDnsResolver(a(aabhVar.i())).setStaleDns(a(aabhVar.m())).setStaleDnsOptions(builder3.build()).setPreestablishConnectionsToStaleDnsResults(a(vxr.aD((Boolean) aabhVar.f("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(a(aabhVar.n()));
        int iE = aabhVar.e();
        if (iE != -1) {
            builder4.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(iE)));
        }
        builder2.setDnsOptions(builder4.build());
        QuicOptions.Builder builder5 = new QuicOptions.Builder();
        if (aabhVar.g() != null) {
            for (String str2 : aabhVar.g().split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int iB = aabhVar.b();
        if (iB != -1) {
            builder5.setInMemoryServerConfigsCacheSize(iB);
        }
        String str3 = (String) aabhVar.f("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int iA = aabhVar.a();
        if (iA != -1) {
            builder5.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(iA)));
        }
        builder2.setQuicOptions(builder5.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!a) {
            a = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.c.setUserAgent(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
