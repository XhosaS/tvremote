package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgd {
    private final Set a;
    private final ArrayList b;

    public vgd(Set set) {
        new Random();
        this.a = set;
        this.b = new ArrayList(2);
    }

    public final void a(vhg vhgVar) {
        wvx wvxVarF = wzg.f("onBeforeActivityAccountReady", wwb.a, true);
        try {
            String str = vhgVar.j;
            zaq zaqVar = new zaq(((zdd) this.a).b);
            while (zaqVar.hasNext()) {
                vgc vgcVar = (vgc) zaqVar.next();
                if (vgcVar instanceof vge) {
                    ((vge) vgcVar).c();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                vgc vgcVar2 = (vgc) it.next();
                if (vgcVar2 instanceof vge) {
                    ((vge) vgcVar2).c();
                }
            }
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        wvx wvxVarF = wzg.f("onBeforeNoAccountAvailable", wwb.a, true);
        try {
            zaq zaqVar = new zaq(((zdd) this.a).b);
            while (zaqVar.hasNext()) {
                vgc vgcVar = (vgc) zaqVar.next();
                if (vgcVar instanceof vge) {
                    ((vge) vgcVar).b();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                vgc vgcVar2 = (vgc) it.next();
                if (vgcVar2 instanceof vge) {
                    ((vge) vgcVar2).b();
                }
            }
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        wvx wvxVarF = wzg.f("onBeforeAccountLoading", wwb.a, true);
        try {
            zaq zaqVar = new zaq(((zdd) this.a).b);
            while (zaqVar.hasNext()) {
                vgc vgcVar = (vgc) zaqVar.next();
                if (vgcVar instanceof vge) {
                    ((vge) vgcVar).a();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                vgc vgcVar2 = (vgc) it.next();
                if (vgcVar2 instanceof vge) {
                    ((vge) vgcVar2).a();
                }
            }
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
