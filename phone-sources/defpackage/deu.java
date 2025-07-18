package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class deu {
    protected volatile dfh a;
    public volatile dds b;

    public final dds a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = dds.b;
            } else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }

    public final dfh b(dfh dfhVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = dfhVar;
                        this.b = dds.b;
                    } catch (der unused) {
                        this.a = dfhVar;
                        this.b = dds.b;
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
        if (!(obj instanceof deu)) {
            return false;
        }
        deu deuVar = (deu) obj;
        dfh dfhVar = this.a;
        dfh dfhVar2 = deuVar.a;
        return (dfhVar == null && dfhVar2 == null) ? a().equals(deuVar.a()) : (dfhVar == null || dfhVar2 == null) ? dfhVar != null ? dfhVar.equals(deuVar.b(dfhVar.e())) : b(dfhVar2.e()).equals(dfhVar2) : dfhVar.equals(dfhVar2);
    }

    public int hashCode() {
        return 1;
    }
}
