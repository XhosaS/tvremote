package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.UserManager;
import android.provider.Settings;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdv implements tdl, tdx {
    public static final whb a = whb.a;
    private static final ImmutableMap k;
    private static final HashSet l;
    private static whe m;
    private static final Object n;
    private static final Object o;
    private static Long p;
    private final String A;
    private final whx B;
    private final yfo C;
    private final long D;
    private final long E;
    private final long F;
    private final long G;
    private final boolean H;
    private final boolean I;
    private final boolean J;
    private final int K;
    private ConnectivityManager L;
    private volatile String M;
    private volatile String N;
    private volatile String O;
    private final long P = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    private final tea Q;
    private final int R;
    private final int S;
    private final int T;
    public final tdy b;
    public Handler c;
    public final Handler d;
    public final long e;
    public whb f;
    volatile long g;
    public volatile boolean h;
    public volatile boolean i;
    public tdo j;
    private final Context q;
    private final ContentResolver r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final int w;
    private final Account x;
    private final String y;
    private final String z;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("arm64-v8a", whc.ARM64_V8A);
        builder.put("armeabi-v7a", whc.ARMEABI_V7A);
        builder.put("x86_64", whc.X86_64);
        builder.put("x86", whc.X86);
        k = builder.buildOrThrow();
        l = new HashSet();
        n = new Object();
        o = new Object();
        p = null;
    }

    public tdv(Context context, String str, String str2, tdu tduVar, String str3, int i, yfo yfoVar, String str4, String str5, String str6, tdt tdtVar, Account account, boolean z, boolean z2, boolean z3) {
        String str7;
        String str8;
        String string;
        File file;
        boolean z4 = false;
        this.i = false;
        HashSet hashSet = l;
        synchronized (hashSet) {
            boolean zAdd = hashSet.add(account);
            if (!z2) {
                a.ah(zAdd, a.ct(account, "Already instantiated a PlayEventLogger for "));
            }
        }
        Semaphore semaphore = new Semaphore(0);
        tdq tdqVar = new tdq(tdv.class.getName(), semaphore);
        tdqVar.start();
        semaphore.acquireUninterruptibly();
        this.c = new tdp(this, tdqVar.getLooper());
        File file2 = new File(context.getCacheDir(), tdtVar.a);
        if (account == null) {
            str7 = "null_account";
        } else {
            str7 = account.type + "." + account.name;
        }
        File file3 = new File(file2, Uri.encode(str7));
        if (account == null) {
            str8 = "null_account.metalog";
        } else {
            str8 = account.type + "." + account.name + ".metalog";
        }
        File file4 = new File(file2, Uri.encode(str8));
        Handler handler = this.c;
        boolean z5 = tdtVar.v;
        this.j = new tdo(file4, handler);
        this.q = context;
        this.L = (ConnectivityManager) context.getSystemService("connectivity");
        ContentResolver contentResolver = context.getContentResolver();
        this.r = contentResolver;
        this.B = tduVar.I;
        this.y = str;
        this.x = account;
        this.s = str2;
        this.t = str3;
        this.C = yfoVar;
        this.K = i;
        long jLongValue = 0;
        try {
            try {
                string = Settings.Secure.getString(contentResolver, "android_id");
                try {
                    jLongValue = new BigInteger(string, 16).longValue();
                } catch (ArithmeticException | NumberFormatException unused) {
                    tho.a("Invalid device id: %s", string);
                    this.j.e(2);
                    this.D = jLongValue;
                    this.z = str4;
                    this.N = str5;
                    this.A = str6;
                    this.i = z3;
                    this.M = null;
                    this.S = 26880;
                    this.T = -1;
                    this.u = Uri.parse(tdtVar.h).buildUpon().appendQueryParameter("format", "raw").appendQueryParameter("proto_v2", "true").build().toString();
                    String str9 = tdtVar.i;
                    this.v = str9;
                    long j = tdtVar.e;
                    this.e = 300000L;
                    long j2 = tdtVar.f;
                    this.E = 60000L;
                    int i2 = tdtVar.j;
                    this.w = WVMediaCrypto.TYPE;
                    long j3 = tdtVar.c;
                    this.F = ((50 * j3) / 100) + 1;
                    this.G = (j3 * 125) / 100;
                    boolean z6 = tdtVar.k;
                    boolean z7 = tdtVar.l;
                    this.H = tdtVar.m;
                    long j4 = tdtVar.r;
                    long j5 = tdtVar.g;
                    if (Build.VERSION.SDK_INT >= 25) {
                        z4 = true;
                    }
                    this.J = z4;
                    this.I = tdtVar.n;
                    boolean z8 = tdtVar.o;
                    boolean z9 = tdtVar.p;
                    this.Q = new tea(str9, this.r, WVMediaCrypto.TYPE);
                    int i3 = tdtVar.s;
                    this.R = -1;
                    boolean z10 = tdtVar.t;
                    boolean z11 = tdtVar.u;
                    boolean z12 = tdtVar.w;
                    boolean z13 = tdtVar.x;
                    if (account != null) {
                        file = new File(file2, Uri.encode(account.name));
                        if (file.exists()) {
                            file.renameTo(file3);
                        }
                    }
                    long j6 = tdtVar.c;
                    long j7 = tdtVar.b;
                    int i4 = tdtVar.d;
                    this.b = new tdy(file3, j6, this, this.j, z, tdtVar.q);
                    this.d = new Handler(Looper.getMainLooper());
                    this.c.sendEmptyMessage(1);
                }
            } catch (ArithmeticException | NumberFormatException unused2) {
                string = null;
            }
        } catch (NullPointerException unused3) {
            tho.a("Null device id or failure to read device id", new Object[0]);
            this.j.e(3);
        }
        this.D = jLongValue;
        this.z = str4;
        this.N = str5;
        this.A = str6;
        this.i = z3;
        this.M = null;
        this.S = 26880;
        this.T = -1;
        this.u = Uri.parse(tdtVar.h).buildUpon().appendQueryParameter("format", "raw").appendQueryParameter("proto_v2", "true").build().toString();
        String str92 = tdtVar.i;
        this.v = str92;
        long j8 = tdtVar.e;
        this.e = 300000L;
        long j22 = tdtVar.f;
        this.E = 60000L;
        int i22 = tdtVar.j;
        this.w = WVMediaCrypto.TYPE;
        long j32 = tdtVar.c;
        this.F = ((50 * j32) / 100) + 1;
        this.G = (j32 * 125) / 100;
        boolean z62 = tdtVar.k;
        boolean z72 = tdtVar.l;
        this.H = tdtVar.m;
        long j42 = tdtVar.r;
        long j52 = tdtVar.g;
        if (Build.VERSION.SDK_INT >= 25 && ((UserManager) context.getSystemService("user")).isDemoUser()) {
            z4 = true;
        }
        this.J = z4;
        this.I = tdtVar.n;
        boolean z82 = tdtVar.o;
        boolean z92 = tdtVar.p;
        this.Q = new tea(str92, this.r, WVMediaCrypto.TYPE);
        int i32 = tdtVar.s;
        this.R = -1;
        boolean z102 = tdtVar.t;
        boolean z112 = tdtVar.u;
        boolean z122 = tdtVar.w;
        boolean z132 = tdtVar.x;
        if (account != null && !file3.exists()) {
            file = new File(file2, Uri.encode(account.name));
            if (file.exists() && file.isDirectory()) {
                file.renameTo(file3);
            }
        }
        long j62 = tdtVar.c;
        long j72 = tdtVar.b;
        int i42 = tdtVar.d;
        this.b = new tdy(file3, j62, this, this.j, z, tdtVar.q);
        this.d = new Handler(Looper.getMainLooper());
        this.c.sendEmptyMessage(1);
    }

    public static tds c() {
        tds tdsVar = new tds();
        tdsVar.f = -1;
        tdsVar.i = Locale.getDefault().getCountry();
        tdsVar.l = true;
        tdsVar.c();
        return tdsVar;
    }

    private final String i(Account account) {
        if (account == null) {
            tho.b("No account for auth token provided", new Object[0]);
            return null;
        }
        try {
            return AccountManager.get(this.q).blockingGetAuthToken(account, this.s, false);
        } catch (AuthenticatorException e) {
            tho.a("Failed to get auth token: %s", e.toString());
            this.j.g(10);
            return null;
        } catch (OperationCanceledException e2) {
            tho.a("Failed to get auth token: %s", e2.toString());
            this.j.g(9);
            return null;
        } catch (IOException e3) {
            tho.a("Failed to get auth token: %s", e3.toString());
            this.j.g(11);
            return null;
        } catch (IllegalArgumentException e4) {
            tho.a("Failed to get auth token: %s", e4.toString());
            this.j.g(12);
            return null;
        }
    }

    private final void j(long j) {
        this.g = System.currentTimeMillis() + Math.max(this.E, j);
    }

    @Override // defpackage.tdl
    public final void a(Runnable runnable) {
        this.c.obtainMessage(4, runnable).sendToTarget();
    }

    @Override // defpackage.tdl
    public final void b(tdm tdmVar) {
        whi whiVar = tdmVar instanceof tdw ? ((tdw) tdmVar).e : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        String str = tdmVar.b;
        tdn tdnVar = tdmVar.c;
        if (tdnVar.d == null) {
            vtw vtwVarM = whb.a.m();
            String[] strArr = tdnVar.a;
            if (strArr != null && strArr.length > 0) {
                vtwVarM.aE(Arrays.asList(strArr));
            }
            long[] jArr = tdnVar.b;
            if (jArr != null && jArr.length > 0) {
                vtwVarM.aF(sfy.T(jArr));
            }
            uir uirVar = tdnVar.c;
            if (uirVar != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                whb whbVar = (whb) vtwVarM.b;
                whbVar.e = uirVar;
                whbVar.b |= 2;
            }
            tdnVar.d = (whb) vtwVarM.r();
        }
        whb whbVar2 = tdnVar.d;
        byte[] bArr = tdmVar.a;
        lValueOf.getClass();
        h(str, whbVar2, bArr, jCurrentTimeMillis, whiVar, tdmVar.d);
    }

    public final void d() {
        if (this.b.b() >= this.F) {
            e(0L);
        }
    }

    public final void e(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            if (jCurrentTimeMillis + j < this.g) {
                j = this.g - jCurrentTimeMillis;
            }
            this.c.sendEmptyMessageDelayed(3, j);
        } else {
            this.c.sendEmptyMessage(3);
        }
        this.g = Math.max(this.g, jCurrentTimeMillis + this.E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        throw new java.io.IOException(defpackage.a.ce(r10, r6, "Unexpected EOS: ", ", "));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0701 A[Catch: all -> 0x0a98, TryCatch #25 {, blocks: (B:218:0x05af, B:220:0x05b5, B:304:0x070e, B:306:0x0713, B:223:0x05c7, B:230:0x0605, B:302:0x0701, B:303:0x070c, B:272:0x0698, B:288:0x06bd, B:289:0x06c1, B:290:0x06c4, B:226:0x05df, B:227:0x05ff, B:293:0x06c8, B:294:0x06e8, B:299:0x06ee, B:232:0x0611, B:249:0x064c, B:287:0x06ad, B:264:0x0678, B:265:0x067b, B:262:0x0672, B:270:0x0694, B:279:0x06a2, B:280:0x06a5), top: B:491:0x05af, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0749 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0778 A[Catch: all -> 0x0a56, IOException -> 0x0a58, Merged into TryCatch #24 {all -> 0x0a56, IOException -> 0x0a58, blocks: (B:318:0x0756, B:332:0x07dd, B:321:0x0778, B:323:0x07b7, B:326:0x07c7, B:327:0x07d0, B:329:0x07d4, B:330:0x07d8, B:430:0x0a58), top: B:480:0x0756 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07dd A[Catch: all -> 0x0a56, IOException -> 0x0a58, Merged into TryCatch #24 {all -> 0x0a56, IOException -> 0x0a58, blocks: (B:318:0x0756, B:332:0x07dd, B:321:0x0778, B:323:0x07b7, B:326:0x07c7, B:327:0x07d0, B:329:0x07d4, B:330:0x07d8, B:430:0x0a58), top: B:480:0x0756 }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07ee A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0756 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v115 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 2790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdv.f():boolean");
    }

    public final vtw g(whb whbVar, long j) {
        vtw vtwVarM = whj.a.m();
        int rawOffset = TimeZone.getDefault().getRawOffset() / 1000;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        whj whjVar = (whj) vtwVarM.b;
        whjVar.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        whjVar.h = rawOffset;
        long jElapsedRealtime = this.P + SystemClock.elapsedRealtime();
        Long l2 = p;
        if (l2 != null) {
            long jLongValue = l2.longValue() + jElapsedRealtime;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            whj whjVar2 = (whj) vtwVarM.b;
            whjVar2.b |= 262144;
            whjVar2.m = jLongValue;
        } else {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            whj whjVar3 = (whj) vucVar;
            whjVar3.b = 262144 | whjVar3.b;
            whjVar3.m = jElapsedRealtime;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            whj whjVar4 = (whj) vtwVarM.b;
            whjVar4.b |= 131072;
            whjVar4.l = true;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        whj whjVar5 = (whj) vucVar2;
        whjVar5.b |= 1;
        whjVar5.c = j;
        if (whbVar != null) {
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            whj whjVar6 = (whj) vtwVarM.b;
            whjVar6.g = whbVar;
            whjVar6.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (!this.H) {
            return vtwVarM;
        }
        synchronized (n) {
            if (m == null) {
                vtw vtwVarM2 = whd.a.m();
                String str = this.z;
                if (!TextUtils.isEmpty(str)) {
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    whd whdVar = (whd) vtwVarM2.b;
                    str.getClass();
                    whdVar.b |= 512;
                    whdVar.l = str;
                }
                vtw vtwVarM3 = whe.a.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                whe wheVar = (whe) vtwVarM3.b;
                whd whdVar2 = (whd) vtwVarM2.r();
                whdVar2.getClass();
                wheVar.d = whdVar2;
                wheVar.b |= 2;
                m = (whe) vtwVarM3.r();
            }
        }
        whe wheVar2 = m;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        whj whjVar7 = (whj) vtwVarM.b;
        wheVar2.getClass();
        whjVar7.j = wheVar2;
        whjVar7.b |= 32768;
        return vtwVarM;
    }

    public final void h(String str, whb whbVar, byte[] bArr, long j, whi whiVar, byte... bArr2) {
        vtw vtwVarM;
        a.ah(true, "Extras must be null or of even length.");
        vtw vtwVarG = g(whbVar, j);
        if (str != null) {
            if (!vtwVarG.b.A()) {
                vtwVarG.u();
            }
            whj whjVar = (whj) vtwVarG.b;
            whj whjVar2 = whj.a;
            whjVar.b |= 2;
            whjVar.d = str;
        }
        if (bArr != null) {
            vsz vszVarQ = vsz.q(bArr);
            if (!vtwVarG.b.A()) {
                vtwVarG.u();
            }
            whj whjVar3 = (whj) vtwVarG.b;
            whj whjVar4 = whj.a;
            whjVar3.b |= 64;
            whjVar3.e = vszVarQ;
        }
        if (bArr2 != null) {
            vsz vszVarQ2 = vsz.q(bArr2);
            if (!vtwVarG.b.A()) {
                vtwVarG.u();
            }
            whj whjVar5 = (whj) vtwVarG.b;
            whj whjVar6 = whj.a;
            whjVar5.b |= 512;
            whjVar5.f = vszVarQ2;
        }
        if (whiVar != null || (!this.I && !this.J)) {
            if (whiVar != null) {
                vtwVarM = (vtw) whiVar.a(5, null);
                vtwVarM.x(whiVar);
            }
            this.c.obtainMessage(2, vtwVarG.r()).sendToTarget();
        }
        vtwVarM = whi.a.m();
        if (this.I && (((whi) vtwVarM.b).b & 1) == 0) {
            int i = this.q.getResources().getConfiguration().orientation;
            if (i == 1) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                whi whiVar2 = (whi) vtwVarM.b;
                whiVar2.c = 1;
                whiVar2.b |= 1;
            } else if (i == 2) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                whi whiVar3 = (whi) vtwVarM.b;
                whiVar3.c = 2;
                whiVar3.b |= 1;
            } else {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                whi whiVar4 = (whi) vtwVarM.b;
                whiVar4.c = 0;
                whiVar4.b |= 1;
            }
        }
        if (this.J) {
            vuc vucVar = vtwVarM.b;
            if ((((whi) vucVar).b & 32) == 0) {
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                whi whiVar5 = (whi) vtwVarM.b;
                whiVar5.b |= 32;
                whiVar5.e = true;
            }
        }
        if (!vtwVarG.b.A()) {
            vtwVarG.u();
        }
        whj whjVar7 = (whj) vtwVarG.b;
        whi whiVar6 = (whi) vtwVarM.r();
        whj whjVar8 = whj.a;
        whiVar6.getClass();
        whjVar7.k = whiVar6;
        whjVar7.b |= 65536;
        this.c.obtainMessage(2, vtwVarG.r()).sendToTarget();
    }
}
