package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgg implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ boolean e;
    final /* synthetic */ lgp f;

    public lgg(lgp lgpVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata, boolean z) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = appMetadata;
        this.e = z;
        this.f = lgpVar;
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
                    lgpVar = this.f;
                    kzjVar = lgpVar.b;
                } catch (RemoteException e) {
                    lbk lbkVar = this.f.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.c.d("(legacy) Failed to get user properties; remote exception", null, this.b, e);
                    this.a.set(Collections.EMPTY_LIST);
                    atomicReference = this.a;
                }
                if (kzjVar == null) {
                    lbk lbkVar2 = lgpVar.y;
                    lab labVar2 = lbkVar2.f;
                    lbkVar2.o(labVar2);
                    labVar2.c.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    atomicReference2.set(kzjVar.k(this.b, this.c, this.e, this.d));
                } else {
                    atomicReference2.set(kzjVar.l(null, this.b, this.c, this.e));
                }
                lgpVar.o();
                atomicReference = this.a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
