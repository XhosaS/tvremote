package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfr implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ lgp c;

    public lfr(lgp lgpVar, AtomicReference atomicReference, AppMetadata appMetadata) {
        this.a = atomicReference;
        this.b = appMetadata;
        this.c = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        lgp lgpVar;
        lbk lbkVar;
        lao laoVar;
        AtomicReference atomicReference2 = this.a;
        synchronized (atomicReference2) {
            try {
                try {
                    lgpVar = this.c;
                    lbkVar = lgpVar.y;
                    laoVar = lbkVar.e;
                    lbkVar.m(laoVar);
                } catch (RemoteException e) {
                    lbk lbkVar2 = this.c.y;
                    lab labVar = lbkVar2.f;
                    lbkVar2.o(labVar);
                    labVar.c.b("Failed to get app instance id", e);
                    atomicReference = this.a;
                }
                if (laoVar.f().n(lcs.ANALYTICS_STORAGE)) {
                    kzj kzjVar = lgpVar.b;
                    if (kzjVar != null) {
                        atomicReference2.set(kzjVar.f(this.b));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            lbk lbkVar3 = lgpVar.y;
                            leo leoVar = lbkVar3.l;
                            lbkVar3.n(leoVar);
                            leoVar.c.set(str);
                            lbkVar.m(laoVar);
                            laoVar.f.b(str);
                        }
                        lgpVar.o();
                        atomicReference = this.a;
                        atomicReference.notify();
                        return;
                    }
                    lab labVar2 = lbkVar.f;
                    lbkVar.o(labVar2);
                    labVar2.c.a("Failed to get app instance id");
                    atomicReference2.notify();
                } else {
                    lab labVar3 = lbkVar.f;
                    lbkVar.o(labVar3);
                    labVar3.h.a("Analytics storage consent denied; will not get app instance id");
                    lbk lbkVar4 = lgpVar.y;
                    leo leoVar2 = lbkVar4.l;
                    lbkVar4.n(leoVar2);
                    leoVar2.c.set(null);
                    lbkVar.m(laoVar);
                    laoVar.f.b(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
