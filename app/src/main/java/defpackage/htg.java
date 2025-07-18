package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htg extends uua implements hhl, hhn {
    public final gnj c;
    public String d;
    public boolean e;
    public String f;
    public double g;
    public jba h;
    public final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htg(gnj gnjVar) {
        super(new hhm());
        gnjVar.getClass();
        this.c = gnjVar;
        this.i = new ArrayList();
        ((hhm) this.a).g = this;
    }

    @Override // defpackage.gkj
    public final int a() {
        return 13959;
    }

    @Override // defpackage.gkj
    public final /* synthetic */ pan b() {
        return null;
    }

    @Override // defpackage.gkj
    public final pan c() {
        return null;
    }

    @Override // defpackage.gkj
    public final String d() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        agvy.b("displayName");
        return null;
    }

    @Override // defpackage.gkj
    public final String e() {
        jba jbaVar = this.h;
        if (jbaVar == null) {
            agvy.b("source");
            jbaVar = null;
        }
        return jbaVar.i();
    }

    @Override // defpackage.hhl
    public final int f() {
        return this.i.size();
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

    @Override // defpackage.hhn
    public final double k() {
        return this.g;
    }

    @Override // defpackage.hhl
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final htf g(int i) {
        return (htf) this.i.get(i);
    }

    public final void m(int i, int i2) {
        for (htf htfVar : this.i) {
            htfVar.g = i;
            htfVar.f = i2;
        }
    }
}
