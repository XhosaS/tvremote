package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class lge implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ lgp e;

    public lge(lgp lgpVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = appMetadata;
        this.e = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        lgp lgpVar;
        kzj kzjVar;
        AtomicReference atomicReference2 = this.a;
        synchronized (atomicReference2) {
            try {
                try {
                    lgpVar = this.e;
                    kzjVar = lgpVar.b;
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            } catch (RemoteException e) {
                lbk lbkVar = this.e.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e);
                this.a.set(Collections.EMPTY_LIST);
                atomicReference = this.a;
            }
            if (kzjVar == null) {
                lbk lbkVar2 = lgpVar.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.c);
                atomicReference2.set(Collections.EMPTY_LIST);
                atomicReference2.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                atomicReference2.set(kzjVar.i(this.b, this.c, this.d));
            } else {
                atomicReference2.set(kzjVar.j(null, this.b, this.c));
            }
            lgpVar.o();
            atomicReference = this.a;
            atomicReference.notify();
        }
    }
}
