package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbo {
    public final String a;
    public final boolean b;

    public qbo() {
        throw null;
    }

    public final vgs a() {
        vtw vtwVarM = vgs.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        String str = this.a;
        vuc vucVar = vtwVarM.b;
        vgs vgsVar = (vgs) vucVar;
        str.getClass();
        vgsVar.b |= 1;
        vgsVar.c = str;
        vgr vgrVar = this.b ? vgr.BANNED : vgr.ALLOWED;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vgs vgsVar2 = (vgs) vtwVarM.b;
        vgsVar2.d = vgrVar.d;
        vgsVar2.b |= 2;
        return (vgs) vtwVarM.r();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qbo) {
            qbo qboVar = (qbo) obj;
            if (this.a.equals(qboVar.a) && this.b == qboVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ChimeNotificationChannelGroup{id=" + this.a + ", blocked=" + this.b + "}";
    }

    public qbo(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
