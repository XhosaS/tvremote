package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class iyd implements yow {
    public static final wkx a;
    public List b;
    public String c;
    public String d;
    public wod e;
    public boolean f;
    public Throwable g;
    public yjk h;
    public yqe i;
    public final isf j;
    public final jzs k;
    public final irc l;
    public final kw m;
    private final /* synthetic */ yow n;
    private final yft o;
    private yjv p;
    private final yft q;

    static {
        vty vtyVar = (vty) wkx.a.m();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wkx wkxVar = (wkx) vtyVar.b;
        wkxVar.b |= 1;
        wkxVar.c = "loading_indicator";
        wkw wkwVar = wkw.LOADING_INDICATOR;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wkx wkxVar2 = (wkx) vtyVar.b;
        wkxVar2.d = wkwVar.az;
        wkxVar2.b |= 2;
        vuc vucVarR = vtyVar.r();
        vucVarR.getClass();
        a = (wkx) vucVarR;
    }

    public /* synthetic */ iyd(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar) {
        yot yotVar = ypk.a;
        this.n = yoz.l(yya.a);
        this.k = jzsVar;
        this.l = ircVar;
        this.m = kwVar;
        this.j = isfVar;
        this.b = yhb.a;
        wod wodVar = wod.a;
        wodVar.getClass();
        this.e = wodVar;
        this.o = new yga(new gel(10));
        this.p = new iwg(5);
        this.q = new yga(new gel(11));
    }

    public abstract Object a(yih yihVar);

    public ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        str.getClass();
        return this.j.i(str, wodVar, z);
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.n).a;
    }

    public boolean d() {
        String str = this.d;
        return (str == null || str.length() == 0) ? false : true;
    }

    public final ixk e() {
        return (ixk) this.q.a();
    }

    public final ixk f() {
        return (ixk) this.o.a();
    }

    public final Object g(yjk yjkVar, yih yihVar) {
        this.h = yjkVar;
        Object objA = a(yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    public final List h() {
        List list = this.b;
        yjv yjvVar = this.p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) yjvVar.a(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void i(ihz ihzVar) {
        ihzVar.getClass();
        yjk yjkVar = null;
        if (ihzVar instanceof ihx) {
            this.f = true;
            this.g = null;
            yjk yjkVar2 = this.h;
            if (yjkVar2 == null) {
                yks.c("statusChangeCallback");
            } else {
                yjkVar = yjkVar2;
            }
            yjkVar.a();
            return;
        }
        if (!(ihzVar instanceof iht)) {
            if (!(ihzVar instanceof ihw)) {
                if (!(ihzVar instanceof ihy)) {
                    throw new yfu();
                }
                return;
            }
            ihw ihwVar = (ihw) ihzVar;
            if (ihwVar instanceof ihu) {
                Throwable th = ((ihu) ihwVar).a;
                this.f = false;
                this.g = th;
                yjk yjkVar3 = this.h;
                if (yjkVar3 == null) {
                    yks.c("statusChangeCallback");
                } else {
                    yjkVar = yjkVar3;
                }
                yjkVar.a();
                return;
            }
            if (!(ihwVar instanceof ihv)) {
                throw new yfu();
            }
            String str = ((ihv) ihwVar).a;
            this.f = false;
            this.g = new IllegalStateException(str);
            yjk yjkVar4 = this.h;
            if (yjkVar4 == null) {
                yks.c("statusChangeCallback");
            } else {
                yjkVar = yjkVar4;
            }
            yjkVar.a();
            return;
        }
        this.b = yhb.a;
        this.c = null;
        this.d = null;
        this.f = false;
        this.g = null;
        wom womVar = (wom) ((iht) ihzVar).a;
        woa woaVar = womVar.f;
        if (woaVar == null) {
            woaVar = woa.a;
        }
        woaVar.getClass();
        ykr.q(this, null, 0, new imw(this, woaVar, (yih) null, 11), 3);
        wlr wlrVar = womVar.h;
        if (wlrVar == null) {
            wlrVar = wlr.b;
        }
        wlrVar.getClass();
        kw kwVar = this.m;
        vul vulVar = new vul(wlrVar.c, wlr.a);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = vulVar.iterator();
        while (it.hasNext()) {
            ixg ixgVar = (ixg) kwVar.a.get((wlq) it.next());
            if (ixgVar != null) {
                arrayList.add(ixgVar);
            }
        }
        this.p = new ill(arrayList, 6);
        ykr.q(this, null, 0, new imw(this, wlrVar, (yih) null, 10), 3);
        l(womVar);
    }

    protected final void j(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Refresh token cannot be empty");
        }
        this.d = str;
        k(false);
    }

    public final void k(boolean z) {
        if (d()) {
            this.i = ykr.q(this, null, 0, new iyb(this.i, this, z, null), 3);
        } else {
            this.i = ykr.q(this, null, 0, new gow(this, (yih) null, 17), 3);
        }
    }

    public final void l(wom womVar) {
        yjk yjkVar;
        womVar.getClass();
        List listAn = yfm.an(this.b);
        vun vunVar = womVar.c;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = vunVar.iterator();
        while (true) {
            yjkVar = null;
            if (!it.hasNext()) {
                break;
            }
            wkx wkxVar = (wkx) it.next();
            jzs jzsVar = this.k;
            wkxVar.getClass();
            ixh ixhVarB = jzsVar.f(wkxVar) ? jzsVar.b(wkxVar) : null;
            if (ixhVarB != null) {
                arrayList.add(ixhVarB);
            }
        }
        listAn.addAll(arrayList);
        this.c = womVar.e;
        this.d = womVar.d;
        this.f = false;
        this.g = null;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAn) {
            if (hashSet.add(((ixh) obj).d())) {
                arrayList2.add(obj);
            }
        }
        this.b = arrayList2;
        yjk yjkVar2 = this.h;
        if (yjkVar2 == null) {
            yks.c("statusChangeCallback");
        } else {
            yjkVar = yjkVar2;
        }
        yjkVar.a();
    }

    public final boolean m() {
        return this.g != null;
    }

    public boolean n() {
        return false;
    }
}
