package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahzx extends ICronetEngineBuilder {
    static final int a;
    private static final Pattern m = Pattern.compile("^[0-9\\.]*$");
    protected final aiag b;
    public final Context c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ahzu j;
    public String k;
    public boolean l;
    private final List n = new LinkedList();
    private final List o = new LinkedList();
    private final aiad p;

    static {
        a = Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 35;
    }

    public ahzx(Context context, aiad aiadVar) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = aiadVar;
        this.b = aiah.a(applicationContext, aiadVar);
        try {
            this.g = true;
            this.h = true;
            this.i = false;
            a(0);
            this.l = false;
            this.d = true;
            e(jUptimeMillis, true);
        } catch (Throwable th) {
            e(jUptimeMillis, false);
            throw th;
        }
    }

    private final void e(long j, boolean z) {
        if (a >= 30) {
            return;
        }
        aiac aiacVar = new aiac();
        aiacVar.d = false;
        try {
            aiacVar.h = 2;
            aiacVar.g = Process.myUid();
            aiacVar.f = new aiaf(ImplVersion.getCronetVersion());
            aiacVar.c = this.p;
            aiacVar.e = new aiaf(ApiVersion.getCronetVersion());
            aiacVar.a = getLogCronetInitializationRef();
            aiacVar.d = Boolean.valueOf(z);
        } finally {
            aiacVar.b = (int) (SystemClock.uptimeMillis() - j);
            this.b.b(aiacVar);
        }
    }

    public final void a(int i) {
        ahzu ahzuVar;
        ahzu ahzuVar2 = ahzu.DISABLED;
        if (i == 0) {
            ahzuVar = ahzu.DISABLED;
        } else if (i == 1) {
            ahzuVar = ahzu.MEMORY;
        } else if (i == 2) {
            ahzuVar = ahzu.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            ahzuVar = ahzu.DISK;
        }
        if (ahzuVar.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = ahzuVar;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        c(str, set, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        d(str);
        return this;
    }

    public final void b(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f = str;
    }

    public final void c(String str, Set set, Date date) {
        str.getClass();
        set.getClass();
        date.getClass();
        if (m.matcher(str).matches()) {
            throw new IllegalArgumentException(a.e(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException(a.e(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            IDN.toASCII(str, 2);
            HashMap map = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                map.put(Base64.encodeToString(bArr, 0), bArr);
            }
            List list = this.o;
            list.add(new ahzv());
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(a.e(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
    }

    public final void d(String str) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.n.add(new ahzw());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return aicr.a(this.c);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.k = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
