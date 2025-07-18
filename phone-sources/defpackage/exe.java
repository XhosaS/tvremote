package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class exe extends euv {
    private final eey a;
    private final eer b;
    private final dze c;
    private final eay d;
    private final dzy e;
    private efy f;
    private final sew g;

    public exe(dzx dzxVar, eer eerVar, sew sewVar) {
        this.b = eerVar;
        this.g = sewVar;
        dzl dzlVar = new dzl();
        dzlVar.a = Uri.EMPTY;
        dzlVar.b(dzxVar.h.toString());
        dzlVar.b = ImmutableList.copyOf((Collection) ImmutableList.of(dzxVar));
        dzy dzyVarA = dzlVar.a();
        this.e = dzyVarA;
        dzd dzdVar = new dzd();
        dzdVar.d((String) sij.I(dzxVar.i, "text/x-unknown"));
        dzdVar.d = dzxVar.j;
        dzdVar.e = dzxVar.k;
        dzdVar.f = dzxVar.l;
        dzdVar.b = dzxVar.m;
        String str = dzxVar.n;
        dzdVar.a = str == null ? null : str;
        this.c = new dze(dzdVar);
        eex eexVar = new eex();
        eexVar.a = dzxVar.h;
        eexVar.i = 1;
        this.a = eexVar.a();
        this.d = new exa(-9223372036854775807L, true, false, dzyVarA);
    }

    @Override // defpackage.ewb
    public final dzy a() {
        return this.e;
    }

    @Override // defpackage.euv
    protected final void g(efy efyVar) {
        this.f = efyVar;
        y(this.d);
    }

    @Override // defpackage.ewb
    public final void i(evx evxVar) {
        ((exd) evxVar).a.e();
    }

    @Override // defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        return new exd(this.a, this.b, this.f, this.c, this.g, E(evzVar));
    }

    @Override // defpackage.ewb
    public final void c() {
    }

    @Override // defpackage.euv
    protected final void j() {
    }
}
