package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdr {
    private volatile lwj b;
    public final AtomicReference a = new AtomicReference();
    private final AtomicBoolean c = new AtomicBoolean(false);

    public final zyd a(Context context, boolean z, boolean z2) {
        if (!z) {
            return zxn.h(true);
        }
        Boolean bool = (Boolean) this.a.get();
        if (bool != null) {
            return zxn.h(bool);
        }
        lwj lwjVar = this.b;
        if (lwjVar == null) {
            synchronized (this) {
                lwjVar = this.b;
                if (lwjVar == null) {
                    lwj lwjVarA = lwh.a(context);
                    this.b = lwjVarA;
                    lwjVar = lwjVarA;
                }
            }
        }
        if (z2 && !this.c.getAndSet(true)) {
            lwjVar.b(new lwi() { // from class: rdo
                @Override // defpackage.lwi
                public final void a() {
                    this.a.a.set(null);
                }
            });
        }
        zwx zwxVarU = zwx.u(otn.a(lwjVar.a()));
        yqi yqiVarA = wyo.a(new yqi() { // from class: rdp
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int iA = ((lwc) obj).a();
                boolean z3 = true;
                if (iA != 1 && iA != 3) {
                    z3 = false;
                }
                AtomicReference atomicReference = this.a.a;
                Boolean boolValueOf = Boolean.valueOf(z3);
                atomicReference.set(boolValueOf);
                return boolValueOf;
            }
        });
        zwk zwkVar = zwk.a;
        return zud.g(zuz.g(zwxVarU, yqiVarA, zwkVar), Throwable.class, new yqi() { // from class: rdq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            }
        }, zwkVar);
    }
}
