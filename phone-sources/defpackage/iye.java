package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iye extends sbt {
    private static final Handler b;
    public final iyd a;

    static {
        Handler handlerK = crh.k(Looper.getMainLooper());
        handlerK.getClass();
        b = handlerK;
    }

    public iye(iyd iydVar) {
        this.a = iydVar;
    }

    public final List a() {
        return this.a.h();
    }

    public final void b(boolean z) {
        this.a.k(z);
    }

    public final void c(wod wodVar) {
        iyd iydVar = this.a;
        if (yks.e(iydVar.e, wodVar)) {
            return;
        }
        iydVar.e = wodVar;
        if (!iydVar.n()) {
            List listAn = yfm.an(iydVar.b);
            Iterator it = listAn.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((ixh) it.next()).c() instanceof wue) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                listAn.subList(i + 1, listAn.size()).clear();
                listAn.add(iydVar.k.b(iyd.a));
                iydVar.b = listAn;
                yjk yjkVar = null;
                iydVar.c = null;
                yjk yjkVar2 = iydVar.h;
                if (yjkVar2 == null) {
                    yks.c("statusChangeCallback");
                } else {
                    yjkVar = yjkVar2;
                }
                yjkVar.a();
            }
        }
        iydVar.k(false);
    }

    public final void d() {
        b.post(new iuc(this, 8));
    }

    @Override // defpackage.sbt
    protected final void e() {
        x(this.a.f(), true, new ajh(this, (yih) null, 3));
        y(ixz.class, new qf(this, (yih) null, 17));
        y(sbr.class, new gow(this, (yih) null, 18));
    }

    public final boolean f() {
        return this.a.d();
    }

    public final boolean g() {
        return this.a.m();
    }

    public final boolean h() {
        String str = this.a.c;
        return (str == null || str.length() == 0) ? false : true;
    }

    public final boolean i() {
        return this.a.f;
    }
}
