package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ufx implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ufx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        onz onzVarQ;
        switch (this.b) {
            case 0:
                uho uhoVar = uge.a;
                try {
                    this.a.close();
                    return;
                } catch (Exception e) {
                    sfy.t(e);
                    uge.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e);
                    return;
                }
            case 1:
                ((View) this.a).refreshDrawableState();
                return;
            case 2:
                Object obj = this.a;
                ugd ugdVar = ugd.WILL_CLOSE;
                ugd ugdVar2 = ugd.CLOSING;
                uge ugeVar = (uge) obj;
                ugeVar.d(ugdVar, ugdVar2);
                uge.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", obj);
                ugeVar.b.close();
                ugeVar.d(ugdVar2, ugd.CLOSED);
                return;
            case 3:
                this.a.cancel(false);
                return;
            case 4:
                uop uopVar = (uop) ((zft) this.a.getKey()).a;
                if (uopVar.b()) {
                    uopVar.a.g();
                    return;
                }
                return;
            case 5:
                ((unm) this.a).i();
                return;
            case 6:
                ((unm) this.a).i();
                return;
            case 7:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a;
                if (firebaseMessaging.i()) {
                    firebaseMessaging.g();
                    return;
                }
                return;
            case 8:
                FirebaseMessaging firebaseMessaging2 = (FirebaseMessaging) this.a;
                final Context context = firebaseMessaging2.d;
                uiv.q(context);
                final boolean zJ = firebaseMessaging2.j();
                if (ocv.h()) {
                    SharedPreferences sharedPreferencesP = uiv.p(context);
                    if (!sharedPreferencesP.contains("proxy_retention") || sharedPreferencesP.getBoolean("proxy_retention", false) != zJ) {
                        nvc nvcVar = firebaseMessaging2.e.b;
                        if (nvcVar.g.a() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", zJ);
                            onzVarQ = nux.a(nvcVar.d).b(4, bundle);
                        } else {
                            onzVarQ = osk.q(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        onzVarQ.n(new fba(14), new onv() { // from class: uou
                            @Override // defpackage.onv
                            public final void e(Object obj2) {
                                SharedPreferences.Editor editorEdit = uiv.p(context).edit();
                                editorEdit.putBoolean("proxy_retention", zJ);
                                editorEdit.apply();
                            }
                        });
                    }
                }
                if (firebaseMessaging2.j()) {
                    firebaseMessaging2.d();
                    return;
                }
                return;
            case 9:
                Object obj2 = this.a;
                Object obj3 = ((yyh) obj2).c;
                synchronized (obj3) {
                    SharedPreferences.Editor editorEdit = ((yyh) obj2).a.edit();
                    Object obj4 = ((yyh) obj2).d;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) obj3).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) ((yyh) obj2).e);
                    }
                    editorEdit.putString((String) obj4, sb.toString()).commit();
                }
                return;
            case 10:
                usr usrVar = (usr) this.a;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + ((Intent) usrVar.b).getAction() + " finishing.");
                usrVar.e();
                return;
            case 11:
                ((usy) this.a).b().d();
                return;
            case 12:
                ((utf) this.a).b.d();
                return;
            case 13:
                utr utrVar = (utr) this.a;
                if (utrVar.h) {
                    return;
                }
                utrVar.f = true;
                utrVar.b();
                return;
            case 14:
                utn utnVar = (utn) this.a;
                if (utnVar.a) {
                    return;
                }
                utnVar.c.e();
                return;
            case 15:
                ((wbb) this.a).e();
                return;
            case 16:
                int i = uun.b;
                this.a.isCancelled();
                return;
            case 17:
                xuf xufVar = (xuf) this.a;
                xzd xzdVar = xufVar.b;
                xpv xpvVar = xufVar.h;
                xzdVar.e();
                xufVar.h = xpvVar;
                xufVar.b.b();
                return;
            case 18:
                xux xuxVar = (xux) this.a;
                ulo uloVar = xuxVar.e;
                if (uloVar != null && uloVar.s()) {
                    uloVar.r();
                }
                xuxVar.d = null;
                return;
            case 19:
                ((xwe) this.a).b.d();
                return;
            default:
                ((xwd) this.a).c.e();
                return;
        }
    }

    public ufx(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
