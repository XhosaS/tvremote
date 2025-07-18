package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglb extends agfo {
    final agoe a;
    agkz b;

    public aglb(agoe agoeVar) {
        this.a = agoeVar;
    }

    final void a(agkz agkzVar) {
        synchronized (this) {
            agkz agkzVar2 = this.b;
            if (agkzVar2 != null && agkzVar2 == agkzVar) {
                aggi aggiVar = agkzVar.b;
                long j = agkzVar.c - 1;
                agkzVar.c = j;
                if (j == 0) {
                    this.b = null;
                    ((agll) this.a).a((aggi) agkzVar.get());
                }
            }
        }
    }

    final void b(agkz agkzVar) {
        synchronized (this) {
            if (agkzVar.c == 0 && agkzVar == this.b) {
                this.b = null;
                aggi aggiVar = (aggi) agkzVar.get();
                aghd.e(agkzVar);
                agoe agoeVar = this.a;
                if (aggiVar == null) {
                    agkzVar.e = true;
                } else {
                    ((agll) agoeVar).a(aggiVar);
                }
            }
        }
    }

    @Override // defpackage.agfo
    protected final void n(agfs agfsVar) {
        agkz agkzVar;
        boolean z;
        agll agllVar;
        agli agliVar;
        synchronized (this) {
            agkzVar = this.b;
            if (agkzVar == null) {
                agkzVar = new agkz(this);
                this.b = agkzVar;
            }
            long j = agkzVar.c;
            if (j == 0) {
                j = 0;
            }
            long j2 = j + 1;
            agkzVar.c = j2;
            if (agkzVar.d || j2 != 1) {
                z = false;
            } else {
                agkzVar.d = true;
                z = true;
            }
        }
        agoe agoeVar = this.a;
        agoeVar.m(new agla(agfsVar, this, agkzVar));
        if (z) {
            while (true) {
                agllVar = (agll) agoeVar;
                AtomicReference atomicReference = agllVar.b;
                agliVar = (agli) atomicReference.get();
                if (agliVar != null && agliVar.e.get() != agli.b) {
                    break;
                }
                agli agliVar2 = new agli(new aglk());
                if (aglc.a(atomicReference, agliVar, agliVar2)) {
                    agliVar = agliVar2;
                    break;
                }
            }
            AtomicBoolean atomicBoolean = agliVar.f;
            boolean z2 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
            try {
                agkzVar.a(agliVar);
                if (z2) {
                    agllVar.a.m(agliVar);
                }
            } catch (Throwable th) {
                if (z2) {
                    agliVar.f.compareAndSet(true, false);
                }
                aggq.a(th);
                throw agnx.a(th);
            }
        }
    }
}
