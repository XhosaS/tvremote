package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfh implements wcp {
    private volatile wdw a;
    private yyr b;
    private boolean c;
    private wfg d;

    public wfh(Map map, wdw wdwVar) {
        this.a = wdwVar;
        yyr yyrVarJ = yyr.j(map);
        yyrVarJ.getClass();
        this.b = yyrVarJ;
    }

    @Override // defpackage.wcp
    public final wag a(String str, agux aguxVar) {
        uea.c();
        yyr yyrVar = this.b;
        yyrVar.getClass();
        Object objA = agrj.a(yyrVar, str);
        objA.getClass();
        wag wagVar = (wag) objA;
        if (!this.c) {
            aguxVar.a(this.a);
        }
        this.c = true;
        return wagVar;
    }

    @Override // defpackage.wcp
    public final wdw b() {
        return this.a;
    }

    @Override // defpackage.wcp
    public final void c() {
        uea.c();
        wfg wfgVar = this.d;
        wfgVar.getClass();
        this.b = wfgVar.a;
        wfgVar.getClass();
        this.a = wfgVar.b;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.wcp
    public final boolean d() {
        uea.c();
        return this.d != null;
    }

    @Override // defpackage.wcp
    public final boolean e(Map map, wdw wdwVar) {
        uea.c();
        yyr yyrVarJ = yyr.j(map);
        yyrVarJ.getClass();
        if (this.c) {
            this.d = new wfg(yyrVarJ, wdwVar);
            return false;
        }
        this.b = yyrVarJ;
        this.a = wdwVar;
        return true;
    }
}
