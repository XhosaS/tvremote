package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class itk implements ite {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/statesync/monitors/apptokens/NetflixTokenMonitor");
    public final fiu b;
    public final ztw c;
    public agux d;
    public String e;
    public iuw f;
    private final fxu g;
    private final agow h;
    private final fxk i;
    private final boolean j;

    public itk(fiu fiuVar, fxu fxuVar, agow agowVar, ztw ztwVar) {
        fiuVar.getClass();
        fxuVar.getClass();
        ztwVar.getClass();
        this.b = fiuVar;
        this.g = fxuVar;
        this.h = agowVar;
        this.c = ztwVar;
        this.i = new fxk(fiu.a.a("com.netflix.ninja"), new itj(this));
        this.d = new agux() { // from class: ith
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((ite) obj).getClass();
                ((zdv) itk.a.d().q("com/google/android/apps/tvsearch/statesync/monitors/apptokens/NetflixTokenMonitor", "onStateUpdated$lambda$0", 54, "NetflixTokenMonitor.kt")).u("#onStateUpdated non-initialized method call.");
                return agpu.a;
            }
        };
        iuw iuwVar = iuw.a;
        iuwVar.getClass();
        this.f = iuwVar;
        Object objA = agowVar.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.j = !r1.isNegative();
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        List listSingletonList = Collections.singletonList(this.f);
        listSingletonList.getClass();
        return listSingletonList;
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void h() {
        this.g.d(this.i);
    }

    @Override // defpackage.ite
    public final void i() {
        this.g.a(this.i);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.d = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.j;
    }

    @Override // defpackage.ite
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
