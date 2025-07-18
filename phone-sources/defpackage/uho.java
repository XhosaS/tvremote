package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uho {
    public final Object a;
    public volatile Object b;
    public final Object c;

    public uho(sim simVar) {
        this.a = new Object();
        this.c = simVar;
    }

    final Logger a() {
        Object obj = this.b;
        if (obj != null) {
            return (Logger) obj;
        }
        synchronized (this.c) {
            Object obj2 = this.b;
            if (obj2 != null) {
                return (Logger) obj2;
            }
            Logger logger = Logger.getLogger((String) this.a);
            this.b = logger;
            return logger;
        }
    }

    public final uhp b(Context context, boolean z, boolean z2) {
        if (!z) {
            return sfy.C(true);
        }
        Boolean bool = (Boolean) ((AtomicReference) this.a).get();
        if (bool != null) {
            return sfy.C(bool);
        }
        Object obj = this.b;
        if (obj == null) {
            synchronized (this) {
                obj = this.b;
                if (obj == null) {
                    nwq nwqVarA = oos.a(context);
                    this.b = nwqVarA;
                    obj = nwqVarA;
                }
            }
        }
        if (z2 && !((AtomicBoolean) this.c).getAndSet(true)) {
            nwq nwqVar = (nwq) obj;
            nzt nztVarC = kwy.C(new oot() { // from class: rvz
                @Override // defpackage.oot
                public final void a() {
                    ((AtomicReference) this.a.a).set(null);
                }
            }, nwqVar.A, oot.class.getSimpleName());
            nkv nkvVar = new nkv(obj, nztVarC, ((oor) nwqVar.y).a, 6);
            ook ookVar = new ook(obj, 0);
            nzy nzyVar = new nzy();
            nzyVar.a = nkvVar;
            nzyVar.b = ookVar;
            nzyVar.c = nztVarC;
            nzyVar.d = new nvg[]{ooj.a};
            nzyVar.f = 4507;
            nwqVar.y(nzyVar.a());
        }
        uhi uhiVarV = uhi.v(qtl.aH(((nwq) obj).x()));
        tsl tslVarA = trc.a(new pgc(this, 11));
        ugk ugkVar = ugk.a;
        return ues.i(ufn.i(uhiVarV, tslVarA, ugkVar), Throwable.class, new rke(14), ugkVar);
    }

    public uho() {
        this.a = new AtomicReference();
        this.c = new AtomicBoolean(false);
    }

    public uho(Class cls) {
        this.c = new kww();
        this.a = cls.getName();
    }
}
