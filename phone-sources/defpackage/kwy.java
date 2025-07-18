package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Looper;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.LruCache;
import android.view.View;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwy {
    public final Object a;

    public kwy() {
        this.a = mes.a;
    }

    public static nzr B(Object obj, String str) {
        ocv.aG(obj, "Listener must not be null");
        ocv.aG(str, "Listener type must not be null");
        ocv.aE(str, "Listener type must not be empty");
        return new nzr(obj, str);
    }

    public static nzt C(Object obj, Looper looper, String str) {
        ocv.aG(obj, "Listener must not be null");
        ocv.aG(looper, "Looper must not be null");
        ocv.aG(str, "Listener type must not be null");
        return new nzt(looper, obj, str);
    }

    public static kwy D(Context context) {
        return new kwy(AccountManager.get(context), (byte[]) null);
    }

    private static String E(ContentResolver contentResolver, String str, String str2) {
        return opc.d(contentResolver, "videos:".concat(str), str2);
    }

    private static final boolean F(String str) {
        return str != null && str.length() == 2;
    }

    public static /* synthetic */ boolean h(Throwable th) {
        int i;
        if ((th instanceof MediaDrm.MediaDrmStateException) || (th instanceof NotProvisionedException)) {
            return true;
        }
        return (th instanceof lzk) && (i = ((lzk) th).a) >= 500 && i < 600;
    }

    public static boolean m(ContentResolver contentResolver, String str, boolean z) {
        return opc.f(contentResolver, "videos:".concat(str), z);
    }

    public final int A() {
        return ((Context) this.a).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES");
    }

    public final void a(Context context, woi woiVar) {
        context.getClass();
        woiVar.getClass();
        jan janVar = (jan) this.a;
        ykr.q(janVar.f, null, 0, new ixs(janVar, context, woiVar, (yih) null, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final kle b() {
        return new kle(this.a);
    }

    public final synchronized let c(les lesVar) {
        let letVar = (let) ((LruCache) this.a).get(lesVar);
        if (letVar == null) {
            return null;
        }
        if (letVar.b >= System.currentTimeMillis() / 1000) {
            return letVar;
        }
        krd.b("Cache data expired");
        return null;
    }

    public final synchronized void d(les lesVar, let letVar) {
        ((LruCache) this.a).put(lesVar, letVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mab] */
    public final boolean e(int i, int i2, Intent intent) {
        if (i != 905) {
            return false;
        }
        int i3 = 1;
        if (i2 != -1) {
            return true;
        }
        ieg iegVarA = ksn.a(intent.getStringExtra("authAccount"));
        String stringExtra = intent.getStringExtra("backend_docid");
        int intExtra = intent.getIntExtra("document_type", -1);
        if (!iegVarA.k() && (!intent.hasExtra("phonesky.backend") ? intent.getIntExtra("backend", -1) == 4 : intent.getIntExtra("phonesky.backend", -1) == 4)) {
            if (intExtra != 6 && intExtra != 19) {
                if (intExtra == 20) {
                    intExtra = 20;
                }
            }
            idy idyVarB = krh.b(new mmg(i3));
            ksn ksnVar = (ksn) iegVarA.g();
            this.a.e((intExtra == 19 || stringExtra == null) ? new uof(ksnVar, (String) null) : uof.k(ksnVar, stringExtra), idyVarB, new mfm());
            return true;
        }
        krd.c("Unexpected data");
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, mem] */
    public final int f(Throwable th, boolean z) {
        if (th == null) {
            return 0;
        }
        if (th instanceof lve) {
            return 7;
        }
        if (th instanceof AuthenticatorException) {
            return 11;
        }
        if (th instanceof SocketException) {
            return this.a.d() ? 12 : 6;
        }
        if (th instanceof mfr) {
            int i = ((mfr) th).a;
            return (i < 400 || i >= 600) ? 14 : 13;
        }
        if (th instanceof mfh) {
            return 15;
        }
        if (th instanceof lkb) {
            return ((lkb) th).b();
        }
        if (!(th instanceof IOException)) {
            return f(th.getCause(), z);
        }
        if (z || (th instanceof UnknownHostException) || (th.getCause() instanceof UnknownHostException)) {
            return this.a.d() ? 16 : 6;
        }
        return 0;
    }

    public final ieg g(String str, ksy ksyVar, int i) {
        String[] strArr;
        String str2;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("share_type", Integer.valueOf(i));
        if (ksyVar.n() == xay.SHOW) {
            strArr = new String[]{str, ksyVar.b};
            str2 = "account = ? AND asset_type IN (19, 20) AND share_type IN (2, 3) AND root_asset_id = ?";
        } else {
            strArr = new String[]{str, Integer.toString(ksyVar.n().s), ksyVar.b};
            str2 = "account = ? AND asset_type = ? AND asset_id = ?";
        }
        SQLiteDatabase sQLiteDatabaseA = ((lyz) this.a).a();
        try {
            int iUpdate = sQLiteDatabaseA.update("purchased_assets", contentValues, str2, strArr);
            ((lyz) this.a).f(sQLiteDatabaseA, iUpdate > 0, 12);
            return iUpdate > 0 ? ieg.f(Integer.valueOf(iUpdate)) : ieg.b;
        } catch (Throwable th) {
            ((lyz) this.a).f(sQLiteDatabaseA, false, 12);
            throw th;
        }
    }

    public final long i() {
        return opc.b((ContentResolver) this.a, "android_id", 0L);
    }

    public final String j() {
        ContentResolver contentResolver = (ContentResolver) this.a;
        String strE = E(contentResolver, "country_override", null);
        if (!F(strE)) {
            strE = opc.d(contentResolver, "device_country", null);
        }
        if (!F(strE)) {
            strE = Locale.getDefault().getCountry();
        }
        Pattern pattern = ksh.a;
        if (true != F(strE)) {
            strE = "??";
        }
        return strE.toUpperCase(Locale.US);
    }

    public final String k() {
        return E((ContentResolver) this.a, "experiment_id", null);
    }

    public final String l() {
        return E((ContentResolver) this.a, "play_analytics_server", "https://play.googleapis.com/play/log");
    }

    public final boolean n(Context context) {
        boolean z = true;
        if (!context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("android.software.leanback_only")) {
            z = false;
        }
        return m((ContentResolver) this.a, "pano_enabled", z);
    }

    public final View o(by byVar, uzb uzbVar) {
        int i = uzbVar.c;
        int iO = sij.O(i);
        if (iO == 0) {
            throw null;
        }
        int i2 = iO - 1;
        if (i2 == 0) {
            return pgd.c(byVar, null, i == 1 ? (String) uzbVar.d : "");
        }
        if (i2 == 1) {
            return pgd.d(byVar, null, i == 8 ? (String) uzbVar.d : "");
        }
        if (i2 != 2) {
            return null;
        }
        return ((pgd) this.a).a(byVar, null, i == 9 ? ((Integer) uzbVar.d).intValue() : 0);
    }

    public final phc p(uyy uyyVar) {
        pgd pgdVarA = ((pge) this.a).b();
        uyyVar.getClass();
        return new phc(pgdVarA, uyyVar);
    }

    public final SpannableString q(String str) {
        qdl qdjVar;
        str.getClass();
        try {
            Spanned spannedFromHtml = Html.fromHtml(str, 0);
            spannedFromHtml.getClass();
            SpannableString spannableString = new SpannableString(spannedFromHtml);
            Iterator itE = ykn.e((URLSpan[]) spannableString.getSpans(0, spannedFromHtml.length(), URLSpan.class));
            while (itE.hasNext()) {
                URLSpan uRLSpan = (URLSpan) itE.next();
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                String url = uRLSpan.getURL();
                url.getClass();
                spannableString.setSpan(new pfz(url), spanStart, spanEnd, 33);
            }
            qdjVar = new qdn(spannableString);
        } catch (Exception e) {
            ((tvk) ((tvk) ((ttz) this.a).f()).i(e)).s("Failed to create SpannableString from HTML.");
            qdjVar = new qdj(e, 21);
        }
        if (qdjVar.i()) {
            return (SpannableString) qdjVar.c();
        }
        ((tvk) ((ttz) this.a).g()).v("Failed to parse HTML body text: %s", str);
        return null;
    }

    public final yeu r(String str, yeu yeuVar, ouc oucVar) {
        return s(yeuVar.M(uqx.a, new uqx(str)), oucVar);
    }

    public final synchronized yeu s(yeu yeuVar, ouc oucVar) {
        return yeuVar.K(15000L, TimeUnit.MILLISECONDS).M(uqt.a, oucVar.g);
    }

    public final void t(Exception exc) {
        ((ooe) this.a).s(exc);
    }

    public final void u(Object obj) {
        ((ooe) this.a).t(obj);
    }

    public final boolean v(Exception exc) {
        ocv.aG(exc, "Exception must not be null");
        Object obj = this.a;
        ooe ooeVar = (ooe) obj;
        synchronized (ooeVar.a) {
            if (((ooe) obj).b) {
                return false;
            }
            ((ooe) obj).b = true;
            ((ooe) obj).d = exc;
            ooeVar.e.g((onz) obj);
            return true;
        }
    }

    public final boolean w(Object obj) {
        return ((ooe) this.a).u(obj);
    }

    public final Account[] x() {
        tql tqlVarQ = szg.q("AccountManager.getAccounts");
        try {
            Account[] accounts = ((AccountManager) this.a).getAccounts();
            tqlVarQ.close();
            return accounts;
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ApplicationInfo y(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo z(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public kwy(Object obj) {
        this.a = obj;
    }

    public kwy(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kwy(kuo kuoVar) {
        this.a = kuoVar.e;
        String str = kuoVar.s;
        String str2 = kuoVar.p;
        String str3 = kuoVar.n;
    }

    public kwy(byte[] bArr, byte[] bArr2) {
        this.a = new ooe();
    }

    public kwy(char[] cArr) {
        this.a = new kwy((byte[]) null, (byte[]) null);
    }

    public kwy(kvf kvfVar) {
        this.a = kvfVar.E();
        kvfVar.d();
    }

    public kwy(kwy kwyVar) {
        this.a = new ooe();
        ((ooe) kwyVar.a).q(new onn(new pku(this)));
    }

    public kwy(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kwy(char[] cArr, byte[] bArr) {
        this.a = new WeakHashMap();
    }

    public kwy(jan janVar) {
        janVar.getClass();
        this.a = janVar;
    }

    public kwy(tst tstVar) {
        this.a = (ose) tstVar.f();
    }

    public kwy(Context context, kwy kwyVar, idf idfVar) {
        this.a = krh.b(new lkd(context, idfVar, kwyVar, 1));
    }

    public kwy(smc smcVar) {
        smcVar.getClass();
        this.a = smcVar;
    }

    public kwy(int i) {
        this.a = new LruCache(i);
    }

    public kwy(byte[] bArr) {
        this.a = tvn.n("GnpSdk");
    }

    public kwy(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kwy(yfo yfoVar, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kwy(mab mabVar) {
        mabVar.getClass();
        this.a = mabVar;
    }

    public kwy(yfo yfoVar, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kwy(short[] sArr) {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }
}
