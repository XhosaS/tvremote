package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipc {
    public final ipb a;
    public final gvw b;

    public ipc(ipb ipbVar, gvw gvwVar) {
        ipbVar.getClass();
        gvwVar.getClass();
        this.a = ipbVar;
        this.b = gvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipc)) {
            return false;
        }
        ipc ipcVar = (ipc) obj;
        return this.a == ipcVar.a && this.b == ipcVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "KatnissAuthTokenState(accountType=" + this.a + ", tokenStatus=" + this.b + ")";
    }
}
