package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahdt implements ahdg {
    public final ahea a;
    public final agzv b;
    public final agzy c;
    private final agzy d;

    public ahdt(ahea aheaVar, Throwable th) {
        this.a = aheaVar;
        agzz agzzVar = agzz.a;
        this.b = new agzv(false, agzzVar);
        this.d = new agzy(th, agzzVar);
        this.c = new agzy(null, agzzVar);
    }

    @Override // defpackage.ahdg
    public final ahea a() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) this.d.a;
    }

    public final void d(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            this.d.c(th);
            return;
        }
        if (th == thC) {
            return;
        }
        agzy agzyVar = this.c;
        Object obj = agzyVar.a;
        if (obj == null) {
            agzyVar.c(th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                Objects.toString(obj);
                throw new IllegalStateException("State is ".concat(obj.toString()));
            }
        }
        if (th != obj) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            agzyVar.c(arrayList);
        }
    }

    public final boolean e() {
        return c() != null;
    }

    @Override // defpackage.ahdg
    public final boolean fo() {
        return c() == null;
    }

    public final String toString() {
        agzy agzyVar = this.c;
        agzv agzvVar = this.b;
        return "Finishing[cancelling=" + e() + ", completing=" + agzvVar.b() + ", rootCause=" + c() + ", exceptions=" + agzyVar.a + ", list=" + this.a + "]";
    }
}
