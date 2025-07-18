package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qxg extends qws {
    private final String a;
    private final agow b;
    private final int c;

    public qxg(int i, String str, agow agowVar) {
        this.c = i;
        this.a = str;
        this.b = agowVar;
    }

    @Override // defpackage.qws
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        agow agowVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qws) {
            qws qwsVar = (qws) obj;
            if (this.c == qwsVar.g() && this.a.equals(qwsVar.e()) && ((agowVar = this.b) != null ? agowVar.equals(qwsVar.f()) : qwsVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qws
    public final agow f() {
        return this.b;
    }

    @Override // defpackage.qws
    public final int g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.c ^ 1000003) * 1000003) ^ this.a.hashCode();
        agow agowVar = this.b;
        return (iHashCode * 1000003) ^ (agowVar == null ? 0 : agowVar.hashCode());
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + qtm.a(this.c) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }
}
