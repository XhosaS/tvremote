package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qnt implements qlz {
    public qlz a;
    public final List b = new ArrayList();

    public qnt(qlz qlzVar, qlz qlzVar2) {
        this.a = new qns(this, qlzVar, qlzVar2);
    }

    @Override // defpackage.qlz
    public final zyd a() {
        return this.a.a();
    }

    @Override // defpackage.qlz
    public final zyd b() {
        return this.a.b();
    }

    @Override // defpackage.qlz
    public final void c(qly qlyVar) {
        this.a.c(qlyVar);
    }

    @Override // defpackage.qlz
    public final void d(qly qlyVar) {
        this.a.d(qlyVar);
    }

    @Override // defpackage.qlz
    public final zyd e(String str, int i) {
        return this.a.e(str, i);
    }

    @Override // defpackage.qlz
    public final zyd f(String str, int i) {
        return this.a.f(str, i);
    }
}
