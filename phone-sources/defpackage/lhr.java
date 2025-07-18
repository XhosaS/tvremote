package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.videos.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public lhr(lie lieVar, ldv ldvVar, ieh iehVar, lfn lfnVar, mem memVar, obl oblVar, xmp xmpVar) {
        this.a = lieVar;
        this.b = ldvVar;
        this.c = iehVar;
        this.d = lfnVar;
        this.e = memVar;
        this.f = oblVar;
        this.g = xmpVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, xmp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mem] */
    public final ody a(Activity activity) {
        boolean zCL;
        String strBo;
        Bitmap bitmapV;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, ksg.a));
        jwq.V(printWriter);
        printWriter.close();
        ?? r1 = this.d;
        if (r1 != 0) {
            strBo = r1.bo();
            zCL = r1.cL();
        } else {
            zCL = false;
            strBo = "null";
        }
        boolean zJ = this.e.g().j();
        ody odyVar = new ody();
        oeh oehVar = new oeh();
        oehVar.a = 2;
        odyVar.e = oehVar;
        odyVar.c("network_available", String.valueOf(zJ));
        odyVar.c("gtv", true != zCL ? "0" : "1");
        odyVar.c("country", strBo);
        odyVar.c("isUmpLibraryV2", true == this.g.d() ? "1" : "0");
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        odyVar.d();
        odyVar.d.add(new oeb(byteArray));
        try {
            bitmapV = nwq.v(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            bitmapV = null;
        }
        if (bitmapV != null) {
            odyVar.a = bitmapV;
        }
        return odyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ldv] */
    public final void b(Activity activity, String str) {
        c(this.a, this.b, ((ldy) this.c).a(), activity, str);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ttm] */
    public final void c(lie lieVar, ldv ldvVar, ieg iegVar, Activity activity, String str) {
        lieVar.y();
        Uri uri = Uri.parse(activity.getString(R.string.uri_help));
        Account accountB = ldvVar.b(iegVar);
        GoogleHelp googleHelp = new GoogleHelp(23, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
        oeh oehVar = new oeh();
        oehVar.a = 1;
        oehVar.b = activity.getColor(R.color.play_movies_action_bar_background);
        googleHelp.s = oehVar;
        googleHelp.c = accountB;
        googleHelp.q = uri;
        odz odzVarA = a(activity).a();
        File cacheDir = activity.getCacheDir();
        byte[] bArr = null;
        googleHelp.R = null;
        googleHelp.v = new ErrorReport(odzVarA, cacheDir);
        googleHelp.v.X = "GoogleHelp";
        Intent intentPutExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        rbi rbiVar = new rbi(activity);
        if (!intentPutExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intentPutExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        Object obj = rbiVar.b;
        Context context = (Context) obj;
        int iB = nwb.b(context, 11925000);
        if (iB == 0) {
            Object obj2 = rbiVar.a.get();
            ocv.aF(((oer) obj2).a);
            oaf oafVar = new oaf();
            oafVar.a = new nkx(obj2, intentPutExtra, 3, bArr);
            oafVar.c = 34401;
            ((nwq) obj2).t(oafVar.a());
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intentPutExtra.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (iB == 7) {
            iB = 7;
        } else if (!((Activity) obj).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new ogh(Looper.getMainLooper()).post(new non(rbiVar, data, 10));
            return;
        }
        if (true == nwb.e(context, iB)) {
            iB = 18;
        }
        nvj.a.d((Activity) obj, iB, 0, null);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void d(Activity activity, lhp lhpVar) {
        ody odyVarA = a(activity);
        lhpVar.b(odyVarA);
        ?? r7 = ((obl) this.f).a;
        if (!r7.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = r7.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) "\n");
                    }
                }
            }
            odyVarA.c("sherlog_links", sb.toString());
        }
        nwq nwqVar = new nwq(activity);
        odz odzVarA = odyVarA.a();
        long jNanoTime = System.nanoTime();
        oaf oafVar = new oaf();
        oafVar.a = new oix(odzVarA, jNanoTime, 1);
        oafVar.c = 6005;
        nwqVar.t(oafVar.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    public final lmy e(String str, boolean z, ieg iegVar, ksy ksyVar) {
        lyz lyzVar = (lyz) this.c.b();
        lyzVar.getClass();
        ExecutorService executorService = (ExecutorService) this.f.b();
        executorService.getClass();
        Executor executor = (Executor) this.b.b();
        executor.getClass();
        ?? r0 = this.g;
        Object objB = this.e.b();
        ltw ltwVar = (ltw) r0.b();
        ltwVar.getClass();
        idr idrVar = (idr) this.a.b();
        idrVar.getClass();
        mab mabVar = (mab) this.d.b();
        mabVar.getClass();
        str.getClass();
        return new lmy(lyzVar, executorService, executor, (kuw) objB, ltwVar, idrVar, mabVar, str, z, iegVar, ksyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yft] */
    public final egc f(ksy ksyVar) throws lka {
        Integer numU;
        ksyVar.getClass();
        String string = this.g.getString(krh.DOWNLOAD_STORAGE, null);
        int iIntValue = (string == null || (numU = ylh.u(string)) == null) ? 0 : numU.intValue();
        Object obj = this.c;
        ?? r3 = this.b;
        File fileJ = jbr.j((Context) obj, iIntValue);
        ksn ksnVar = (ksn) r3.a();
        ksnVar.getClass();
        byte[] bytes = ksnVar.a.getBytes(ynd.a);
        bytes.getClass();
        File file = new File(fileJ, Base64.encodeToString(bytes, 11) + File.separator + ksyVar.c);
        if (((kuk) ((cvw) this.f).a.a()).a(ksyVar).f()) {
            return ((ljj) this.e).b(file);
        }
        ?? r0 = this.a;
        Object obj2 = r0.get(ksyVar);
        if (obj2 == null) {
            egw egwVar = new egw(file, (kdh) this.d, false);
            r0.put(ksyVar, egwVar);
            obj2 = egwVar;
        }
        return (egc) obj2;
    }

    public final int g(long j, boolean z) {
        cgz cgzVarL = l();
        if (cgzVarL == null) {
            return -1;
        }
        if (z) {
            j = h(j);
        }
        return cgzVarL.j(hv.q(this, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(long r3) {
        /*
            r2 = this;
            bvc r0 = r2.k()
            if (r0 == 0) goto L1d
            boolean r1 = r0.s()
            if (r1 == 0) goto L19
            bvc r1 = r2.j()
            if (r1 == 0) goto L17
            bmy r0 = defpackage.bty.h(r1, r0)
            goto L1b
        L17:
            r0 = 0
            goto L1b
        L19:
            bmy r0 = defpackage.bmy.a
        L1b:
            if (r0 != 0) goto L1f
        L1d:
            bmy r0 = defpackage.bmy.a
        L1f:
            long r3 = defpackage.hv.l(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhr.h(long):long");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final bvc i() {
        return (bvc) this.d.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final bvc j() {
        return (bvc) this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final bvc k() {
        return (bvc) this.a.a();
    }

    public final cgz l() {
        return ((ajx) this.e).a();
    }

    public final boolean m(long j) {
        cgz cgzVarL = l();
        if (cgzVarL == null) {
            return false;
        }
        long jQ = hv.q(this, h(j));
        int iH = cgzVarL.h(Float.intBitsToFloat((int) (4294967295L & jQ)));
        int i = (int) (jQ >> 32);
        return Float.intBitsToFloat(i) >= cgzVarL.b(iH) && Float.intBitsToFloat(i) <= cgzVarL.c(iH);
    }

    public final void n(akb akbVar, chc chcVar, boolean z, boolean z2) {
        ((ajx) this.c).a.b(new ajw(akbVar, chcVar, z, z2, a.r(0, 4)));
    }

    public lhr(lyz lyzVar, SharedPreferences sharedPreferences, ltv ltvVar, kuw kuwVar, mes mesVar, lfn lfnVar) {
        this.a = lyzVar;
        this.f = sharedPreferences;
        this.g = ltvVar;
        this.c = mesVar;
        this.b = new ljl(kuwVar, 11, null);
        this.d = lfnVar;
        this.e = hjt.b(lyzVar.a, new mcm(1));
    }

    public lhr() {
        ajx ajxVar = new ajx();
        this.c = ajxVar;
        this.e = ajxVar;
        bcz bczVar = bcz.b;
        this.a = new bci(null, bczVar);
        this.d = new bci(null, bczVar);
        this.f = new bci(null, bczVar);
        this.g = new bci(new cma(0.0f), bcz.c);
        this.b = new aea();
    }

    public lhr(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.f = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.e = yfoVar4;
        yfoVar5.getClass();
        this.g = yfoVar5;
        yfoVar6.getClass();
        this.a = yfoVar6;
        yfoVar7.getClass();
        this.d = yfoVar7;
    }

    public lhr(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, char[] cArr) {
        yfoVar.getClass();
        this.g = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.f = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
        yfoVar6.getClass();
        this.e = yfoVar6;
        yfoVar7.getClass();
        this.b = yfoVar7;
    }

    public lhr(Context context, tae taeVar, isy isyVar, gty gtyVar, WorkDatabase workDatabase, guw guwVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.c = taeVar;
        this.g = isyVar;
        this.d = gtyVar;
        this.e = workDatabase;
        this.f = guwVar;
        this.a = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        new fki(null, null, null);
    }

    public lhr(kuw kuwVar, gag gagVar, jzs jzsVar, ksn ksnVar, Executor executor, Executor executor2) {
        this.a = gagVar;
        this.d = jzsVar;
        this.e = kuwVar;
        this.f = ksnVar;
        this.c = executor;
        this.b = executor2;
        this.g = new jzs(null);
    }

    public lhr(zdg zdgVar, ttm ttmVar, ttm ttmVar2, Executor executor, xbw xbwVar, yyh yyhVar, yfo yfoVar) {
        this.d = new AtomicBoolean(true);
        this.c = zdgVar;
        this.f = ttmVar;
        this.e = ttmVar2;
        this.b = executor;
        this.a = yyhVar.f(executor, xbwVar, null);
        this.g = yfoVar;
    }

    public lhr(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, byte[] bArr) {
        yfoVar.getClass();
        this.f = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.e = yfoVar4;
        yfoVar5.getClass();
        this.g = yfoVar5;
        yfoVar6.getClass();
        this.d = yfoVar6;
        yfoVar7.getClass();
        this.a = yfoVar7;
    }

    public lhr(Context context, kdh kdhVar, SharedPreferences sharedPreferences, cvw cvwVar, ljj ljjVar, iea ieaVar) {
        kdhVar.getClass();
        sharedPreferences.getClass();
        ljjVar.getClass();
        this.c = context;
        this.d = kdhVar;
        this.g = sharedPreferences;
        this.f = cvwVar;
        this.e = ljjVar;
        this.a = new LinkedHashMap();
        this.b = new yga(new izc(ieaVar, 8));
    }
}
