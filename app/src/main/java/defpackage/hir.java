package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hir extends ays implements hhl {
    public final List c;
    private final String d;
    private final String e;
    private final agpc f;

    public hir() {
        super(new hhm());
        this.c = new ArrayList();
        this.d = "";
        this.e = "com.google.android.katniss";
        this.f = new agpn(new agum() { // from class: hiq
            @Override // defpackage.agum
            public final Object a() {
                return new pan(4774651);
            }
        });
        azd azdVar = this.a;
        ((hhm) azdVar).g = this;
        azdVar.d(new bar(new him()));
    }

    @Override // defpackage.gkj
    public final int a() {
        return 4774651;
    }

    @Override // defpackage.gkj
    public final /* synthetic */ pan b() {
        return null;
    }

    @Override // defpackage.gkj
    public final pan c() {
        return (pan) this.f.a();
    }

    @Override // defpackage.gkj
    public final String d() {
        return this.d;
    }

    @Override // defpackage.gkj
    public final String e() {
        return this.e;
    }

    @Override // defpackage.hhl
    public final int f() {
        return this.c.size();
    }

    @Override // defpackage.hhl
    public final /* bridge */ /* synthetic */ hkk g(int i) {
        return (hik) this.c.get(i);
    }

    @Override // defpackage.hhl
    public final /* synthetic */ String h() {
        return "";
    }

    @Override // defpackage.hhl
    public final /* synthetic */ String i() {
        return "";
    }

    @Override // defpackage.hhl
    public final /* synthetic */ boolean j() {
        return false;
    }
}
