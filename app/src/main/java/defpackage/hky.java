package defpackage;

import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hky implements hkx {
    public hmx a;
    public abky b;
    public xps c;
    public SuggestionChipList d;
    public aeal e;
    public List f;
    public xpy g;
    public xpu h;
    public boolean i;
    public final String j;
    public String k;
    public final String l;
    public final String m;
    public final String n;
    public adyj o;
    public final List p;
    public boolean q;
    public boolean r;
    private List s;
    private String t;
    private final String u;

    public hky(String str, aeal aealVar, abky abkyVar, String str2) {
        adyj adyjVar;
        this.t = "";
        this.k = "";
        boolean z = false;
        this.r = false;
        this.u = str;
        int iA = adzz.a(aealVar.l);
        if (iA != 0 && iA == 2) {
            z = true;
        }
        this.i = z;
        this.m = aealVar.k;
        this.l = "";
        this.n = str2;
        adzv adzvVar = aealVar.g;
        this.p = new abxl((adzvVar == null ? adzv.b : adzvVar).c, adzv.a);
        this.e = aealVar;
        if ((aealVar.b & 2) != 0) {
            adyjVar = aealVar.c;
            if (adyjVar == null) {
                adyjVar = adyj.a;
            }
        } else {
            adyjVar = null;
        }
        this.o = adyjVar;
        if (!aealVar.h.isEmpty()) {
            str = aealVar.h;
        } else if (adyjVar != null && (adyjVar.b & 16) != 0) {
            adyd adydVar = adyjVar.d;
            if (!(adydVar == null ? adyd.a : adydVar).c.isEmpty()) {
                adyd adydVar2 = adyjVar.d;
                str = (adydVar2 == null ? adyd.a : adydVar2).c;
            }
        }
        this.j = str;
        this.k = aealVar.i;
        this.b = abkyVar;
    }

    public static boolean o(adyj adyjVar) {
        if (adyjVar == null || (adyjVar.b & 16) == 0) {
            return false;
        }
        adyd adydVar = adyjVar.d;
        if (adydVar == null) {
            adydVar = adyd.a;
        }
        int iA = adyh.a(adydVar.k);
        return iA == 0 || iA != 3;
    }

    public static boolean p(adyj adyjVar) {
        if (adyjVar == null || (adyjVar.b & 16) == 0) {
            return false;
        }
        adyd adydVar = adyjVar.d;
        if (adydVar == null) {
            adydVar = adyd.a;
        }
        if ((adydVar.b & 16384) == 0) {
            return false;
        }
        adyd adydVar2 = adyjVar.d;
        int iA = adyc.a((adydVar2 == null ? adyd.a : adydVar2).o);
        if (iA == 0 || iA != 22) {
            return false;
        }
        if (adydVar2 == null) {
            adydVar2 = adyd.a;
        }
        int iA2 = adyh.a(adydVar2.k);
        return iA2 == 0 || iA2 != 3;
    }

    public static boolean q(aeal aealVar) {
        if (aealVar == null || (aealVar.b & 2) == 0) {
            return false;
        }
        adyj adyjVar = aealVar.c;
        if (adyjVar == null) {
            adyjVar = adyj.a;
        }
        return adyjVar.f.size() > 0;
    }

    public static boolean r(aeal aealVar) {
        if (aealVar == null || (aealVar.b & 2) == 0) {
            return false;
        }
        adyj adyjVar = aealVar.c;
        if (adyjVar == null) {
            adyjVar = adyj.a;
        }
        if ((adyjVar.b & 4096) == 0) {
            return false;
        }
        adyj adyjVar2 = aealVar.c;
        if (adyjVar2 == null) {
            adyjVar2 = adyj.a;
        }
        adww adwwVar = adyjVar2.e;
        if (adwwVar == null) {
            adwwVar = adww.a;
        }
        if ((adwwVar.b & 1) == 0) {
            return false;
        }
        adyj adyjVar3 = aealVar.c;
        if (adyjVar3 == null) {
            adyjVar3 = adyj.a;
        }
        adww adwwVar2 = adyjVar3.e;
        if (adwwVar2 == null) {
            adwwVar2 = adww.a;
        }
        aayu aayuVar = adwwVar2.c;
        if (aayuVar == null) {
            aayuVar = aayu.a;
        }
        return aayuVar.b.size() > 0;
    }

    private final boolean s() {
        List listD = d();
        if (listD != null && !listD.isEmpty()) {
            return true;
        }
        List list = this.f;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.hkx
    public final xpy a() {
        int iA;
        xpy xpyVar = this.g;
        if (xpyVar == null || (iA = xpx.a(xpyVar.d)) == 0 || iA != 7) {
            return null;
        }
        return xpyVar;
    }

    @Override // defpackage.hkx
    public final String b() {
        if (!this.t.isEmpty()) {
            return this.t;
        }
        adyj adyjVar = this.o;
        if (adyjVar != null && (adyjVar.b & 16) != 0) {
            adyd adydVar = adyjVar.d;
            if (adydVar == null) {
                adydVar = adyd.a;
            }
            if (!adydVar.c.isEmpty()) {
                adyd adydVar2 = this.o.d;
                if (adydVar2 == null) {
                    adydVar2 = adyd.a;
                }
                return adydVar2.c;
            }
        }
        aeal aealVar = this.e;
        return (aealVar == null || aealVar.h.isEmpty()) ? this.u : this.e.h;
    }

    @Override // defpackage.hkx
    public final List c() {
        xpu xpuVar = this.h;
        return xpuVar == null ? new ArrayList() : xpuVar.b;
    }

    @Override // defpackage.hkx
    public final List d() {
        adyj adyjVar = this.o;
        if (adyjVar == null || (adyjVar.b & 16) == 0) {
            aeal aealVar = this.e;
            if (aealVar != null) {
                return aealVar.d;
            }
            return null;
        }
        adyd adydVar = adyjVar.d;
        if (adydVar == null) {
            adydVar = adyd.a;
        }
        return adydVar.h;
    }

    @Override // defpackage.hkx
    public final Set e() {
        HashSet hashSet = null;
        if (!this.q) {
            aeal aealVar = this.e;
            if (aealVar != null && (aealVar.b & 16) != 0) {
                adyv adyvVar = aealVar.f;
                if (adyvVar == null) {
                    adyvVar = adyv.a;
                }
                if (adyvVar.e.size() > 0) {
                    adyv adyvVar2 = this.e.f;
                    if (adyvVar2 == null) {
                        adyvVar2 = adyv.a;
                    }
                    return new HashSet(adyvVar2.e);
                }
            }
            return null;
        }
        List list = this.s;
        if (list != null) {
            if (list.isEmpty()) {
                return null;
            }
            for (int i = 0; i < this.s.size(); i++) {
                for (xmx xmxVar : ((hkw) this.s.get(i)).b().b) {
                    xbg xbgVar = xmxVar.d;
                    if (xbgVar == null) {
                        xbgVar = xbg.a;
                    }
                    if (!(xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).c.isEmpty() && xmxVar.f) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        xbg xbgVar2 = xmxVar.d;
                        if (xbgVar2 == null) {
                            xbgVar2 = xbg.a;
                        }
                        hashSet.add((xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a).c);
                    }
                }
            }
            if (hashSet == null) {
                return hashSet;
            }
            hashSet.size();
        }
        return hashSet;
    }

    @Override // defpackage.hkx
    public final Set f() {
        if (this.q) {
            return l();
        }
        aeal aealVar = this.e;
        if (aealVar == null || (aealVar.b & 16) == 0) {
            return null;
        }
        adyv adyvVar = aealVar.f;
        if (adyvVar == null) {
            adyvVar = adyv.a;
        }
        if (adyvVar.c.size() <= 0) {
            return null;
        }
        adyv adyvVar2 = this.e.f;
        if (adyvVar2 == null) {
            adyvVar2 = adyv.a;
        }
        return new HashSet(adyvVar2.c);
    }

    @Override // defpackage.hkx
    public final void g(List list) {
        if (list != null) {
            ArrayList arrayListNewArrayList = Lists.newArrayList(list);
            this.s = arrayListNewArrayList;
            if (arrayListNewArrayList != null) {
                arrayListNewArrayList.size();
            }
            String str = this.u;
            int i = 0;
            loop0: while (true) {
                if (i >= list.size()) {
                    break;
                }
                for (xmx xmxVar : ((hkw) list.get(i)).b().b) {
                    if (xmxVar != null && !xmxVar.e.isEmpty()) {
                        str = xmxVar.e;
                        break loop0;
                    }
                }
                i++;
            }
            this.t = str;
        }
    }

    @Override // defpackage.hkx
    public final boolean h() {
        aeal aealVar = this.e;
        if (aealVar == null) {
            return false;
        }
        adyj adyjVar = aealVar.c;
        if (adyjVar == null) {
            adyjVar = adyj.a;
        }
        adyd adydVar = adyjVar.d;
        if (adydVar == null) {
            adydVar = adyd.a;
        }
        return (adydVar.b & 65536) != 0;
    }

    @Override // defpackage.hkx
    public final boolean i() {
        if (this.o != null) {
            return false;
        }
        aeal aealVar = this.e;
        return (aealVar == null || aealVar.e.isEmpty()) && !s();
    }

    @Override // defpackage.hkx
    public final boolean j() {
        return this.o == null && s();
    }

    @Override // defpackage.hkx
    public final boolean k() {
        return this.q ? m() : this.e == null || n();
    }

    public final Set l() {
        List list = this.s;
        HashSet hashSet = null;
        if (list != null && !list.isEmpty()) {
            if (((hkw) this.s.get(0)).a() == 0) {
                for (xmx xmxVar : ((hkw) this.s.get(0)).b().b) {
                    xbg xbgVar = xmxVar.d;
                    if (xbgVar == null) {
                        xbgVar = xbg.a;
                    }
                    if (!(xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).c.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        xbg xbgVar2 = xmxVar.d;
                        if (xbgVar2 == null) {
                            xbgVar2 = xbg.a;
                        }
                        hashSet.add((xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a).c);
                    }
                }
            }
            if (hashSet != null) {
                hashSet.size();
            }
        }
        return hashSet;
    }

    public final boolean m() {
        List list = this.s;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final boolean n() {
        aeal aealVar = this.e;
        if (aealVar == null || (aealVar.b & 16) == 0) {
            return false;
        }
        adyv adyvVar = aealVar.f;
        if (adyvVar == null) {
            adyvVar = adyv.a;
        }
        return adyvVar.b;
    }

    public hky(String str, List list, String str2) {
        this.t = "";
        this.k = "";
        this.r = false;
        this.u = str;
        this.j = str;
        this.q = true;
        this.n = str2;
        this.p = Lists.newArrayList(adzx.TYPE_SEARCH_RESULTS_PAGE);
        this.f = list;
        if (list != null) {
            list.size();
            for (int i = 0; i < this.f.size(); i++) {
                xqe xqeVar = (xqe) this.f.get(i);
                if (xqeVar != null) {
                    if (this.k.isEmpty() && (xqeVar.b & 32) != 0) {
                        this.k = xqeVar.f;
                    }
                    if (!xqeVar.e.isEmpty()) {
                        xqeVar.e.size();
                        int iA = xqb.a(xqeVar.h);
                        if (iA != 0 && iA == 2) {
                            this.i = true;
                        }
                        int iA2 = xqd.a(xqeVar.g);
                        if (iA2 != 0 && iA2 == 5) {
                            this.r = true;
                        }
                    }
                }
            }
        }
        if (!list.isEmpty() && list.get(0) != null) {
            xqe xqeVar2 = (xqe) list.get(0);
            int i2 = xqeVar2.b;
            if ((i2 & 256) != 0) {
                this.l = xqeVar2.i;
            } else if (!this.r || (1 & i2) == 0) {
                this.l = "";
            } else {
                this.l = xqeVar2.c;
            }
            if (this.l.isEmpty()) {
                this.m = xqeVar2.c;
                return;
            } else {
                this.m = this.l;
                return;
            }
        }
        this.l = "";
        this.m = "";
    }
}
