package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vuw {
    protected volatile vvj a;
    public volatile vsz b;
    private volatile boolean c;

    public final vsz a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = vsz.b;
            } else {
                this.b = this.a.e();
            }
            return this.b;
        }
    }

    public final vvj b(vvj vvjVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = vvjVar;
                        this.b = vsz.b;
                    } catch (vuq unused) {
                        this.c = true;
                        this.a = vvjVar;
                        this.b = vsz.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuw)) {
            return false;
        }
        vuw vuwVar = (vuw) obj;
        vvj vvjVar = this.a;
        vvj vvjVar2 = vuwVar.a;
        return (vvjVar == null && vvjVar2 == null) ? a().equals(vuwVar.a()) : (vvjVar == null || vvjVar2 == null) ? vvjVar != null ? vvjVar.equals(vuwVar.b(vvjVar.t())) : b(vvjVar2.t()).equals(vvjVar2) : vvjVar.equals(vvjVar2);
    }

    public int hashCode() {
        return 1;
    }
}
