package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yzg extends yxx {
    public zby a;
    public boolean b;
    public boolean c;

    public yzg() {
        throw null;
    }

    public final yzj a() {
        zby zbyVar = this.a;
        zbyVar.getClass();
        if (zbyVar.c == 0) {
            return zco.b;
        }
        if (this.c) {
            this.a = new zby(zbyVar);
            this.c = false;
        }
        this.b = true;
        return new zco(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Iterable iterable) {
        zby zbyVar = this.a;
        zbyVar.getClass();
        if (!(iterable instanceof zbp)) {
            super.d(iterable);
            return;
        }
        zby zbyVar2 = iterable instanceof zco ? ((zco) iterable).c : null;
        if (zbyVar2 != null) {
            zbyVar.j(Math.max(zbyVar.c, zbyVar2.c));
            for (int iA = zbyVar2.a(); iA >= 0; iA = zbyVar2.e(iA)) {
                f(zbyVar2.i(iA), zbyVar2.c(iA));
            }
            return;
        }
        Set setJ = iterable.j();
        zby zbyVar3 = this.a;
        zbyVar3.j(Math.max(zbyVar3.c, setJ.size()));
        for (zbo zboVar : iterable.j()) {
            f(zboVar.b(), zboVar.a());
        }
    }

    @Override // defpackage.yxx
    public final /* synthetic */ void c(Object obj) {
        f(obj, 1);
    }

    public final void f(Object obj, int i) {
        zby zbyVar = this.a;
        zbyVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new zby(zbyVar);
            this.c = false;
        }
        this.b = false;
        obj.getClass();
        zby zbyVar2 = this.a;
        zbyVar2.p(obj, i + zbyVar2.b(obj));
    }

    public yzg(int i) {
        this.b = false;
        this.c = false;
        this.a = new zby(i);
    }
}
