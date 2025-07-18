package defpackage;

import com.google.common.collect.Sets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nza extends ocj {
    public final agow a;
    public final String b;
    public final oce c;
    public final oct d;
    public final ocq e;
    public final boolean f;
    public final oej g;
    public final boolean h;
    public final tln i;
    private final yyr j;

    public nza(agow agowVar, tln tlnVar, String str, oce oceVar, oct octVar, ocq ocqVar, boolean z, oej oejVar, boolean z2, yyr yyrVar) {
        this.a = agowVar;
        this.i = tlnVar;
        this.b = str;
        this.c = oceVar;
        this.d = octVar;
        this.e = ocqVar;
        this.f = z;
        this.g = oejVar;
        this.h = z2;
        this.j = yyrVar;
    }

    @Override // defpackage.ocj
    public final oce a() {
        return this.c;
    }

    @Override // defpackage.ocj
    public final ocq b() {
        return this.e;
    }

    @Override // defpackage.ocj
    public final oct c() {
        return this.d;
    }

    @Override // defpackage.ocj
    public final oej d() {
        return this.g;
    }

    @Override // defpackage.ocj
    public final yyr e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        tln tlnVar;
        ocq ocqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ocj) {
            ocj ocjVar = (ocj) obj;
            if (this.a.equals(ocjVar.g()) && ((tlnVar = this.i) != null ? tlnVar.equals(ocjVar.j()) : ocjVar.j() == null) && this.b.equals(ocjVar.f()) && this.c.equals(ocjVar.a()) && this.d.equals(ocjVar.c()) && ((ocqVar = this.e) != null ? ocqVar.equals(ocjVar.b()) : ocjVar.b() == null) && this.f == ocjVar.i()) {
                ocjVar.l();
                ocjVar.o();
                ocjVar.p();
                oej oejVar = this.g;
                if (oejVar != null ? oejVar.equals(ocjVar.d()) : ocjVar.d() == null) {
                    if (this.h == ocjVar.h()) {
                        ocjVar.k();
                        ocjVar.m();
                        ocjVar.n();
                        if (zbk.e(this.j, ocjVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ocj
    public final String f() {
        return this.b;
    }

    @Override // defpackage.ocj
    public final agow g() {
        return this.a;
    }

    @Override // defpackage.ocj
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        tln tlnVar = this.i;
        int iHashCode2 = ((((((((iHashCode * 1000003) ^ (tlnVar == null ? 0 : tlnVar.hashCode())) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ocq ocqVar = this.e;
        int iHashCode3 = ((((((iHashCode2 ^ (ocqVar == null ? 0 : ocqVar.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
        oej oejVar = this.g;
        return (((((((iHashCode3 * (-721379959)) ^ (oejVar != null ? oejVar.hashCode() : 0)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ 1237) * 583896283) ^ Sets.a(this.j.entrySet());
    }

    @Override // defpackage.ocj
    public final boolean i() {
        return this.f;
    }

    @Override // defpackage.ocj
    public final tln j() {
        return this.i;
    }

    public final String toString() {
        return "ElementsConfig{converterProvider=" + this.a.toString() + ", layoutExecutor=" + String.valueOf(this.i) + ", logTag=" + this.b + ", perfLoggerFactory=" + this.c.toString() + ", elementsLifeCycleLogger=" + this.d.toString() + ", elementsInteractionLogger=" + String.valueOf(this.e) + ", useIncrementalMount=" + this.f + ", enableLithoReconciliation=false, useSizeSpec=false, userData=null, recyclerConfig=" + String.valueOf(this.g) + ", nestedScrollingEnabled=" + this.h + ", clearComponentOnDetach=false, globalCommandEventDataDecorators=null, globalCommandEventWithViewDataDecorators=null, userDataMap=" + zbk.c(this.j) + "}";
    }

    @Override // defpackage.ocj
    public final void k() {
    }

    @Override // defpackage.ocj
    public final void l() {
    }

    @Override // defpackage.ocj
    public final void m() {
    }

    @Override // defpackage.ocj
    public final void n() {
    }

    @Override // defpackage.ocj
    public final void o() {
    }

    @Override // defpackage.ocj
    public final void p() {
    }
}
