package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oho extends oii {
    public final yzq a;
    public final oif b;
    public final String c;
    private final Integer d;
    private final int e;

    public oho(yzq yzqVar, oif oifVar, String str, Integer num, int i) {
        this.a = yzqVar;
        this.b = oifVar;
        this.c = str;
        this.d = num;
        this.e = i;
    }

    @Override // defpackage.oii
    public final int a() {
        return this.e;
    }

    @Override // defpackage.oii
    public final oif b() {
        return this.b;
    }

    @Override // defpackage.oii
    public final yzq c() {
        return this.a;
    }

    @Override // defpackage.oii
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.oii
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        oif oifVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oii) {
            oii oiiVar = (oii) obj;
            if (this.a.equals(oiiVar.c()) && ((oifVar = this.b) != null ? oifVar.equals(oiiVar.b()) : oiiVar.b() == null) && ((str = this.c) != null ? str.equals(oiiVar.e()) : oiiVar.e() == null)) {
                oiiVar.l();
                oiiVar.f();
                oiiVar.k();
                oiiVar.i();
                oiiVar.h();
                oiiVar.j();
                oiiVar.m();
                Integer num = this.d;
                if (num != null ? num.equals(oiiVar.d()) : oiiVar.d() == null) {
                    if (this.e == oiiVar.a()) {
                        oiiVar.g();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        oif oifVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (oifVar == null ? 0 : oifVar.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode3 = iHashCode2 ^ (str == null ? 0 : str.hashCode());
        Integer num = this.d;
        return ((((iHashCode3 * (-308306015)) ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.e) * 1000003;
    }

    public final String toString() {
        oif oifVar = this.b;
        return "SpanInfo{templateUris=" + this.a.toString() + ", threadInfo=" + String.valueOf(oifVar) + ", nodeId=" + this.c + ", commandExtensionId=null, commandExecutionStatus=null, jsModuleIdentifier=null, jsFunctionName=null, jsBindingExtensionId=null, jsIsSynchronous=null, isAppBackgrounded=null, treeId=" + this.d + ", materializationCount=" + this.e + ", feedItemCount=null}";
    }

    @Override // defpackage.oii
    public final void f() {
    }

    @Override // defpackage.oii
    public final void g() {
    }

    @Override // defpackage.oii
    public final void h() {
    }

    @Override // defpackage.oii
    public final void i() {
    }

    @Override // defpackage.oii
    public final void j() {
    }

    @Override // defpackage.oii
    public final void k() {
    }

    @Override // defpackage.oii
    public final void l() {
    }

    @Override // defpackage.oii
    public final void m() {
    }
}
