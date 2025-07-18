package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
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
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zzq extends ICronetEngineBuilder {
    static final int a;
    private static final Pattern m = Pattern.compile("^[0-9\\.]*$");
    protected final zzy b;
    public final Context c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zzp j;
    public String k;
    public boolean l;
    private final List n = new LinkedList();
    private final List o = new LinkedList();
    private final zzv p;

    static {
        a = Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 35;
    }

    public zzq(Context context, zzv zzvVar) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = zzvVar;
        this.b = zzz.a(applicationContext, zzvVar);
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
        zzu zzuVar = new zzu();
        zzuVar.d = false;
        try {
            zzuVar.h = 2;
            zzuVar.g = Process.myUid();
            zzuVar.f = new zzx(ImplVersion.getCronetVersion());
            zzuVar.c = this.p;
            zzuVar.e = new zzx(ApiVersion.getCronetVersion());
            zzuVar.a = getLogCronetInitializationRef();
            zzuVar.d = Boolean.valueOf(z);
        } finally {
            zzuVar.b = (int) (SystemClock.uptimeMillis() - j);
            this.b.b(zzuVar);
        }
    }

    public final void a(int i) {
        zzp zzpVar;
        zzp zzpVar2 = zzp.DISABLED;
        if (i == 0) {
            zzpVar = zzp.DISABLED;
        } else if (i == 1) {
            zzpVar = zzp.MEMORY;
        } else if (i == 2) {
            zzpVar = zzp.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            zzpVar = zzp.DISK;
        }
        if (zzpVar.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = zzpVar;
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
            throw new IllegalArgumentException(a.cg(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException(a.cg(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
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
            list.add(new vxr());
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(a.cg(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
    }

    public final void d(String str) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.n.add(new vxr());
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
        int i;
        StringBuilder sb = new StringBuilder();
        Context context = this.c;
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (aabb.a) {
            i = aabb.b;
            if (i == 0) {
                try {
                    i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    aabb.b = i;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/");
        sb.append(ImplVersion.getCronetVersion());
        sb.append(')');
        return sb.toString();
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
