package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpo {
    protected volatile dqa a;
    public volatile dol b;

    public final dol a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = dol.b;
            } else {
                this.b = this.a.c();
            }
            return this.b;
        }
    }

    public final dqa b(dqa dqaVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = dqaVar;
                        this.b = dol.b;
                    } catch (dpm unused) {
                        this.a = dqaVar;
                        this.b = dol.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpo)) {
            return false;
        }
        dpo dpoVar = (dpo) obj;
        dqa dqaVar = this.a;
        dqa dqaVar2 = dpoVar.a;
        return (dqaVar == null && dqaVar2 == null) ? a().equals(dpoVar.a()) : (dqaVar == null || dqaVar2 == null) ? dqaVar != null ? dqaVar.equals(dpoVar.b(dqaVar.e())) : b(dqaVar2.e()).equals(dqaVar2) : dqaVar.equals(dqaVar2);
    }

    public final int hashCode() {
        return 1;
    }
}
