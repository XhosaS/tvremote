package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rgi {
    private static final Object a = new Object();
    public static final AtomicInteger b;
    private static volatile rgh e = null;
    private static volatile boolean f = false;
    private static final rhd g;
    final rgg c;
    final String d;
    private Object h;
    private volatile int i = -1;
    private volatile Object j;
    private final boolean k;
    private volatile boolean l;

    static {
        new AtomicReference();
        g = new rhd();
        b = new AtomicInteger();
    }

    public rgi(rgg rggVar, String str, Object obj, boolean z) {
        String str2 = rggVar.a;
        if (str2 == null && rggVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && rggVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.c = rggVar;
        this.d = str;
        this.h = obj;
        this.k = z;
        this.l = false;
    }

    public static void e(final Context context) {
        if (e != null || context == null) {
            return;
        }
        Object obj = a;
        synchronized (obj) {
            if (e == null) {
                synchronized (obj) {
                    rgh rghVar = e;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (rghVar == null || ((rer) rghVar).a != context) {
                        if (rghVar != null) {
                            reu.d();
                            rgn.a();
                            rfc.c();
                        }
                        e = new rer(context, yru.a(new yrp() { // from class: rfy
                            @Override // defpackage.yrp
                            public final Object eV() {
                                AtomicInteger atomicInteger = rgi.b;
                                return rfd.a(context);
                            }
                        }));
                        b.incrementAndGet();
                    }
                }
            }
        }
    }

    private final String f(String str) {
        return str.isEmpty() ? this.d : str.concat(String.valueOf(this.d));
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:134:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[PHI: r3
  0x0051: PHI (r3v1 yqt) = (r3v0 yqt), (r3v0 yqt), (r3v4 yqt) binds: [B:11:0x0027, B:13:0x002e, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: all -> 0x0270, TryCatch #2 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01c8, B:91:0x01d2, B:94:0x01da, B:96:0x01e0, B:97:0x01e6, B:117:0x022f, B:122:0x023f, B:124:0x0245, B:120:0x0237, B:128:0x024c, B:130:0x024f, B:132:0x0255, B:135:0x025d, B:136:0x0262, B:137:0x0266, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x013a, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0152, B:64:0x0153, B:71:0x0174, B:141:0x026d, B:67:0x016a, B:142:0x026e, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef, B:98:0x01e7, B:100:0x01eb, B:102:0x01f3, B:104:0x01fe, B:103:0x01f9, B:105:0x0200, B:107:0x0204, B:109:0x0208, B:111:0x020c, B:114:0x0222, B:115:0x0229, B:116:0x022e, B:72:0x0175, B:74:0x017f, B:78:0x019d, B:82:0x01a8, B:84:0x01c0, B:85:0x01c3, B:87:0x01c5), top: B:153:0x001e, inners: #0, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {, blocks: (B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef), top: B:150:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153 A[Catch: all -> 0x0270, TryCatch #2 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01c8, B:91:0x01d2, B:94:0x01da, B:96:0x01e0, B:97:0x01e6, B:117:0x022f, B:122:0x023f, B:124:0x0245, B:120:0x0237, B:128:0x024c, B:130:0x024f, B:132:0x0255, B:135:0x025d, B:136:0x0262, B:137:0x0266, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x013a, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0152, B:64:0x0153, B:71:0x0174, B:141:0x026d, B:67:0x016a, B:142:0x026e, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef, B:98:0x01e7, B:100:0x01eb, B:102:0x01f3, B:104:0x01fe, B:103:0x01f9, B:105:0x0200, B:107:0x0204, B:109:0x0208, B:111:0x020c, B:114:0x0222, B:115:0x0229, B:116:0x022e, B:72:0x0175, B:74:0x017f, B:78:0x019d, B:82:0x01a8, B:84:0x01c0, B:85:0x01c3, B:87:0x01c5), top: B:153:0x001e, inners: #0, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8 A[Catch: all -> 0x0270, TRY_ENTER, TryCatch #2 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01c8, B:91:0x01d2, B:94:0x01da, B:96:0x01e0, B:97:0x01e6, B:117:0x022f, B:122:0x023f, B:124:0x0245, B:120:0x0237, B:128:0x024c, B:130:0x024f, B:132:0x0255, B:135:0x025d, B:136:0x0262, B:137:0x0266, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x013a, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0152, B:64:0x0153, B:71:0x0174, B:141:0x026d, B:67:0x016a, B:142:0x026e, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef, B:98:0x01e7, B:100:0x01eb, B:102:0x01f3, B:104:0x01fe, B:103:0x01f9, B:105:0x0200, B:107:0x0204, B:109:0x0208, B:111:0x020c, B:114:0x0222, B:115:0x0229, B:116:0x022e, B:72:0x0175, B:74:0x017f, B:78:0x019d, B:82:0x01a8, B:84:0x01c0, B:85:0x01c3, B:87:0x01c5), top: B:153:0x001e, inners: #0, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da A[Catch: all -> 0x0270, TryCatch #2 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01c8, B:91:0x01d2, B:94:0x01da, B:96:0x01e0, B:97:0x01e6, B:117:0x022f, B:122:0x023f, B:124:0x0245, B:120:0x0237, B:128:0x024c, B:130:0x024f, B:132:0x0255, B:135:0x025d, B:136:0x0262, B:137:0x0266, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x013a, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0152, B:64:0x0153, B:71:0x0174, B:141:0x026d, B:67:0x016a, B:142:0x026e, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef, B:98:0x01e7, B:100:0x01eb, B:102:0x01f3, B:104:0x01fe, B:103:0x01f9, B:105:0x0200, B:107:0x0204, B:109:0x0208, B:111:0x020c, B:114:0x0222, B:115:0x0229, B:116:0x022e, B:72:0x0175, B:74:0x017f, B:78:0x019d, B:82:0x01a8, B:84:0x01c0, B:85:0x01c3, B:87:0x01c5), top: B:153:0x001e, inners: #0, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgi.b():java.lang.Object");
    }

    public final Object c() {
        if (this.l) {
            synchronized (this) {
                if (this.l) {
                    Object objA = a(this.h);
                    objA.getClass();
                    this.h = objA;
                    this.l = false;
                }
            }
        }
        return this.h;
    }

    public final String d() {
        return f(this.c.d);
    }

    public rgi(rgg rggVar, String str, String str2) {
        String str3 = rggVar.a;
        if (str3 == null && rggVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str3 != null && rggVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.c = rggVar;
        this.d = str;
        this.h = str2;
        this.k = true;
        this.l = true;
    }
}
