package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class riv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    private final Object k;

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection] */
    public riv(Context context, gzo gzoVar, yft yftVar, yft yftVar2, yft yftVar3, gag gagVar, hjs hjsVar) {
        gzoVar.getClass();
        this.h = context;
        this.g = gzoVar;
        this.c = yftVar;
        this.j = yftVar2;
        this.i = yftVar3;
        this.b = gagVar;
        this.f = hjsVar;
        yqy yqyVar = new yqy(null);
        yot yotVar = ypk.a;
        yoz.l(wcq.W(yqyVar, yxi.a.i()).plus(new gwm(CoroutineExceptionHandler.d)));
        hba hbaVar = new hba(this, context);
        this.d = hbaVar;
        fse fseVar = new fse(hbaVar);
        this.k = fseVar;
        List listAn = yfm.an(gagVar.a);
        List listAn2 = yfm.an(gagVar.d);
        List listAn3 = yfm.an(gagVar.c);
        List listAn4 = yfm.an(gagVar.e);
        List listAn5 = yfm.an(gagVar.b);
        fki.ar(new gyx(2), zce.class, listAn2);
        fki.ar(new gyx(5), String.class, listAn2);
        fki.ar(new gyx(0), Uri.class, listAn2);
        fki.ar(new gyx(4), Uri.class, listAn2);
        fki.ar(new gyx(3), Integer.class, listAn2);
        fki.ar(new gyx(1), byte[].class, listAn2);
        fki.at(new gyw(0), Uri.class, listAn3);
        fki.at(new gyw(1), File.class, listAn3);
        fki.as(new gyk(yftVar3, yftVar2), Uri.class, listAn4);
        fki.as(new gye(5), File.class, listAn4);
        fki.as(new gye(1), Uri.class, listAn4);
        fki.as(new gye(3), Uri.class, listAn4);
        fki.as(new gye(6), Uri.class, listAn4);
        fki.as(new gye(4), Drawable.class, listAn4);
        fki.as(new gye(0), Bitmap.class, listAn4);
        fki.as(new gye(2), ByteBuffer.class, listAn4);
        listAn5.add(new gxm(null));
        gag gagVar2 = new gag(hjs.z(listAn), hjs.z(listAn2), hjs.z(listAn3), hjs.z(listAn4), hjs.z(listAn5));
        this.e = gagVar2;
        this.a = yfm.ag(gagVar2.a, new cvi(this, fseVar));
        new AtomicBoolean(false);
    }

    private static final void e(gzq gzqVar, hal halVar) {
        if (halVar != null) {
            Drawable drawable = gzqVar.a;
        }
        gzu gzuVar = gzqVar.b;
        gzqVar.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final pro a(Account account) {
        Account account2;
        pro proVar;
        synchronized (this.f) {
            ?? r0 = this.j;
            if (r0.containsKey(account)) {
                account2 = account;
            } else {
                Object obj = this.k;
                Pattern pattern = sjt.a;
                sjs sjsVar = new sjs((Context) obj);
                sjsVar.a = "com.google.android.gms";
                sjsVar.c("managed");
                sjsVar.d("mdisync");
                sjq.a(account);
                sjsVar.b = account;
                sjsVar.e("profilesync/public/profile_info.pb");
                Uri uriA = sjsVar.a();
                Object obj2 = this.d;
                sln slnVarA = slo.a();
                slnVarA.d = new slr((slf) this.g);
                slnVarA.c(prt.a);
                slnVarA.d(uriA);
                ntp ntpVar = new ntp(((unc) obj2).c(slnVarA.a()));
                nsf nsfVar = new nsf((Executor) this.c, (aafi) this.e);
                AtomicReference atomicReference = new AtomicReference(new pru() { // from class: prp
                    @Override // defpackage.pru
                    public final void f() {
                    }
                });
                AtomicReference atomicReference2 = new AtomicReference(new prv() { // from class: prq
                    @Override // defpackage.prv
                    public final void g() {
                    }
                });
                eij eijVar = new eij(atomicReference, 19);
                int i = 20;
                eij eijVar2 = new eij(atomicReference2, i);
                ogp ogpVar = new ogp((Context) obj, new ogl(account, ueo.a));
                Object obj3 = this.i;
                nsf nsfVar2 = new nsf((Context) obj, ogpVar, (String) obj3, account, eijVar, eijVar2);
                account2 = account;
                if (xhc.a.get().b((Context) obj)) {
                    prh.a(((Context) obj).getApplicationContext(), (String) obj3);
                    uhp uhpVarAH = qtl.aH(((nwq) this.a).w());
                    prn prnVar = new prn(8);
                    ugk ugkVar = ugk.a;
                    tst.i(ufn.i(ufn.i(uhpVarAH, prnVar, ugkVar), new oyj(i), ugkVar));
                } else {
                    prh.a(((Context) obj).getApplicationContext(), (String) obj3);
                    account2.toString();
                    tst.i(new prg());
                }
                eij eijVar3 = new eij(this.b, 18);
                new ocv((byte[]) null, (char[]) null);
                prh.a(((Context) obj).getApplicationContext(), (String) obj3);
                new ocv(eijVar3);
                pro proVar2 = new pro(nsfVar2, (Context) obj, nsfVar, ntpVar, new tko(this, uriA));
                proVar2.e(new prr(this, uriA), ugk.a);
                atomicReference.set(proVar2);
                atomicReference2.set(proVar2);
                r0.put(account2, proVar2);
            }
            proVar = (pro) r0.get(account2);
        }
        return proVar;
    }

    public final Object b(gzu gzuVar, yih yihVar) {
        return yoz.k(new ajp(gzuVar, this, (yih) null, 6), yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (defpackage.hjs.w(r13, r0) != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:14:0x002d, B:45:0x0100, B:47:0x0106, B:49:0x0111, B:50:0x0113, B:51:0x0117, B:53:0x011b, B:56:0x0127, B:57:0x012c, B:36:0x00aa, B:38:0x00b3, B:39:0x00bf), top: B:76:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:14:0x002d, B:45:0x0100, B:47:0x0106, B:49:0x0111, B:50:0x0113, B:51:0x0117, B:53:0x011b, B:56:0x0127, B:57:0x012c, B:36:0x00aa, B:38:0x00b3, B:39:0x00bf), top: B:76:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:14:0x002d, B:45:0x0100, B:47:0x0106, B:49:0x0111, B:50:0x0113, B:51:0x0117, B:53:0x011b, B:56:0x0127, B:57:0x012c, B:36:0x00aa, B:38:0x00b3, B:39:0x00bf), top: B:76:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #0 {all -> 0x0152, blocks: (B:65:0x013d, B:67:0x0141, B:70:0x014e, B:71:0x0151), top: B:75:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e A[Catch: all -> 0x0152, TRY_ENTER, TryCatch #0 {all -> 0x0152, blocks: (B:65:0x013d, B:67:0x0141, B:70:0x014e, B:71:0x0151), top: B:75:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gzu r12, int r13, defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.riv.c(gzu, int, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yft] */
    public final fse d() {
        return (fse) this.c.a();
    }

    public riv(Context context, Executor executor, String str, aafi aafiVar, unc uncVar, ntp ntpVar, osk oskVar, slf slfVar, nwq nwqVar) {
        this.f = new Object();
        this.j = new HashMap();
        this.k = context;
        this.c = executor;
        this.e = aafiVar;
        this.d = uncVar;
        this.b = ntpVar;
        this.h = oskVar;
        this.i = str;
        this.g = slfVar;
        this.a = nwqVar;
    }

    public riv(ScheduledExecutorService scheduledExecutorService, aafi aafiVar, Application application) {
        this.b = sij.l(new qoi(this, 15));
        this.c = sij.l(new riu(this, 5));
        this.d = sij.l(new riu(this, 6));
        sij.l(new riu(this, 7));
        sij.l(new riu(this, 8));
        this.e = sij.l(new qoi(this, 16));
        this.f = sij.l(new qoi(this, 17));
        this.g = sij.l(new qoi(this, 18));
        this.h = sij.l(new qoi(this, 19));
        sij.l(new qoi(this, 20));
        sij.l(new riu(this, 1));
        this.i = sij.l(new riu(this, 0));
        sij.l(new riu(this, 2));
        this.j = sij.l(new riu(this, 3));
        sij.l(new riu(this, 4));
        snj snjVarD = snj.d("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = snjVarD;
        sni sniVar = snjVarD.c;
        if (sniVar == null) {
            this.k = snl.c(aafiVar, scheduledExecutorService, snjVarD, application);
        } else {
            this.k = sniVar;
            ((snl) sniVar).f = aafiVar;
        }
    }
}
