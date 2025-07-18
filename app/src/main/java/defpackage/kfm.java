package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfm extends kfi {
    private final kic a;
    private final lvj b;

    public kfm(int i, kic kicVar, lvj lvjVar) {
        super(i);
        this.b = lvjVar;
        this.a = kicVar;
        if (i == 2 && kicVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.kfi
    public final boolean a(kgq kgqVar) {
        return this.a.c;
    }

    @Override // defpackage.kfi
    public final Feature[] b(kgq kgqVar) {
        return this.a.b;
    }

    @Override // defpackage.kfo
    public final void d(Status status) {
        this.b.a.q(kin.a(status));
    }

    @Override // defpackage.kfo
    public final void e(Exception exc) {
        this.b.a.q(exc);
    }

    @Override // defpackage.kfo
    public final void f(kgq kgqVar) throws DeadObjectException {
        try {
            kic kicVar = this.a;
            ((kia) kicVar).a.a.a(kgqVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(kfo.h(e2));
        } catch (RuntimeException e3) {
            this.b.a.q(e3);
        }
    }

    @Override // defpackage.kfo
    public final void g(kgg kggVar, boolean z) {
        Map map = kggVar.b;
        lvj lvjVar = this.b;
        map.put(lvjVar, Boolean.valueOf(z));
        lvjVar.a.l(lvm.a, new kgf(kggVar, lvjVar));
    }
}
