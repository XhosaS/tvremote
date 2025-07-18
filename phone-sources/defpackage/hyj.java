package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hyj extends hym implements hyl, hyi {
    public List i = new ArrayList();
    public Set j = null;
    public String k = null;
    public Set l = null;
    public Set m = null;

    protected hyj() {
    }

    @Override // defpackage.hyl
    public void b(hyp hypVar) {
        this.i.add(hypVar);
    }

    @Override // defpackage.hyi
    public final String c() {
        return this.k;
    }

    @Override // defpackage.hyi
    public final Set d() {
        return this.j;
    }

    @Override // defpackage.hyi
    public final Set e() {
        return this.m;
    }

    @Override // defpackage.hyi
    public final Set f() {
        return this.l;
    }

    @Override // defpackage.hyi
    public final Set g() {
        return null;
    }

    @Override // defpackage.hyi
    public final void h(String str) {
        this.k = str;
    }

    @Override // defpackage.hyi
    public final void i(Set set) {
        this.j = set;
    }

    @Override // defpackage.hyi
    public final void j(Set set) {
        this.m = set;
    }

    @Override // defpackage.hyi
    public final void k(Set set) {
        this.l = set;
    }

    @Override // defpackage.hyl
    public final List n() {
        return this.i;
    }

    @Override // defpackage.hyi
    public final void l(Set set) {
    }
}
