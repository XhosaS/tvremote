package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import com.google.android.tv.remote.service.audio.compression.Lc3Decoder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class byj {
    public final /* synthetic */ Object a;

    public byj() {
        throw null;
    }

    public final void A(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.f(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void B(ja jaVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.m.aU(jaVar.b, recyclerView.f);
    }

    public final void C(ja jaVar, pv pvVar, pv pvVar2) {
        int i;
        int i2;
        jaVar.k(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        ik ikVar = recyclerView.C;
        if (pvVar == null || ((i = pvVar.b) == (i2 = pvVar2.b) && pvVar.a == pvVar2.a)) {
            ikVar.f(jaVar);
            jaVar.b.setAlpha(0.0f);
            ikVar.c.add(jaVar);
        } else if (!ikVar.g(jaVar, i, pvVar.a, i2, pvVar2.a)) {
            return;
        }
        recyclerView.L();
    }

    public final void D(ja jaVar, pv pvVar, pv pvVar2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.f.l(jaVar);
        recyclerView.o(jaVar);
        jaVar.k(false);
        ik ikVar = recyclerView.C;
        int i = pvVar.b;
        int i2 = pvVar.a;
        View view = jaVar.b;
        int left = pvVar2 == null ? view.getLeft() : pvVar2.b;
        int top = pvVar2 == null ? view.getTop() : pvVar2.a;
        if (jaVar.s() || (i == left && i2 == top)) {
            ikVar.f(jaVar);
            ikVar.b.add(jaVar);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!ikVar.g(jaVar, i, i2, left, top)) {
                return;
            }
        }
        recyclerView.L();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [abk, java.lang.Object] */
    public final void E() {
        ?? r0 = this.a;
        q qVar = (q) r0;
        qVar.Y.j();
        xu.a(r0);
        Bundle bundle = qVar.c;
        qVar.Y.k(bundle != null ? bundle.getBundle("registryState") : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ta] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, ta] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, ta] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Parcelable, java.lang.Object] */
    public final boolean F(asv asvVar, int i, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (Build.VERSION.SDK_INT >= 25) {
            bundle2 = bundle;
            if ((i & 1) != 0) {
                try {
                    asvVar.a.e();
                    ?? D = asvVar.a.d();
                    Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", D);
                    bundle2 = bundle3;
                } catch (Exception e) {
                    Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
        }
        Object obj = this.a;
        ?? r6 = asvVar.a;
        ClipData clipData = new ClipData(r6.a(), new ClipData.Item(r6.b()));
        pg pfVar = Build.VERSION.SDK_INT >= 31 ? new pf(clipData, 2) : new ph(clipData, 2);
        pfVar.d(r6.c());
        pfVar.b(bundle2);
        return qv.c((View) obj, qk.q(pfVar)) == null;
    }

    public final void a(bug bugVar) {
        ((cbs) bsz.a.e().j("com/google/android/tv/remote/service/emote/ConnectedClients$ClientListener", "onConnected", 87, "ConnectedClients.java")).t("Client %s connected", bugVar);
        bsz bszVar = (bsz) this.a;
        bszVar.f++;
        bsy bsyVar = (bsy) bszVar.c.get(bugVar);
        bdq.j(bsyVar.e == -1);
        bsyVar.e = 0;
        bzs bzsVar = bsyVar.d;
        int i = ((cax) bzsVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            bsyVar.e = ((btc) bzsVar.get(i2)).a() | bsyVar.e;
        }
        bdq.j(bsyVar.e >= 0);
        clo cloVarO = bvu.a.o();
        int i3 = bsyVar.e;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvu bvuVar = (bvu) cloVarO.b;
        bvuVar.b |= 1;
        bvuVar.c = i3;
        clo cloVarO2 = but.a.o();
        String str = Build.MODEL;
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        but butVar = (but) cloVarO2.b;
        str.getClass();
        butVar.b |= 1;
        butVar.c = str;
        String str2 = Build.MANUFACTURER;
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        clt cltVar = cloVarO2.b;
        but butVar2 = (but) cltVar;
        str2.getClass();
        butVar2.b |= 2;
        butVar2.d = str2;
        if (!cltVar.A()) {
            cloVarO2.l();
        }
        but butVar3 = (but) cloVarO2.b;
        butVar3.e = 1;
        butVar3.b |= 4;
        String str3 = Build.VERSION.RELEASE;
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        clt cltVar2 = cloVarO2.b;
        but butVar4 = (but) cltVar2;
        str3.getClass();
        butVar4.b |= 8;
        butVar4.f = str3;
        String str4 = awc.b;
        if (str4 != null) {
            if (!cltVar2.A()) {
                cloVarO2.l();
            }
            but butVar5 = (but) cloVarO2.b;
            butVar5.b |= 16;
            butVar5.g = str4;
        }
        String str5 = awc.c;
        if (str5 != null) {
            if (!cloVarO2.b.A()) {
                cloVarO2.l();
            }
            but butVar6 = (but) cloVarO2.b;
            butVar6.b |= 32;
            butVar6.h = str5;
        }
        but butVar7 = (but) cloVarO2.i();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvu bvuVar2 = (bvu) cloVarO.b;
        butVar7.getClass();
        bvuVar2.d = butVar7;
        bvuVar2.b |= 2;
        if (Lc3Decoder.a) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bvu bvuVar3 = (bvu) cloVarO.b;
            cma cmaVar = bvuVar3.e;
            if (!cmaVar.c()) {
                bvuVar3.e = clt.r(cmaVar);
            }
            bvuVar3.e.g(1);
        }
        bug bugVar2 = bsyVar.b;
        clo cloVarO3 = bvw.a.o();
        if (!cloVarO3.b.A()) {
            cloVarO3.l();
        }
        bvw bvwVar = (bvw) cloVarO3.b;
        bvu bvuVar4 = (bvu) cloVarO.i();
        bvuVar4.getClass();
        bvwVar.c = bvuVar4;
        bvwVar.b = 1;
        bugVar2.d((bvw) cloVarO3.i());
    }

    public final void b(bug bugVar) {
        ((cbs) bsz.a.b().j("com/google/android/tv/remote/service/emote/ConnectedClients$ClientListener", "onConnecting", 70, "ConnectedClients.java")).t("Client %s connecting", bugVar);
        bsz bszVar = (bsz) this.a;
        bszVar.d++;
        bdq.j(((bsy) bszVar.c.put(bugVar, new bsy(bszVar.i, bugVar, bszVar.b))) == null);
    }

    public final void c(bug bugVar) {
        ((cbs) bsz.a.g().j("com/google/android/tv/remote/service/emote/ConnectedClients$ClientListener", "onConnectingFailure", 79, "ConnectedClients.java")).t("Client %s connecting failure", bugVar);
        bsz bszVar = (bsz) this.a;
        bszVar.e++;
        ((bsy) bszVar.c.remove(bugVar)).a();
    }

    public final void d(bug bugVar) {
        ((cbs) bsz.a.e().j("com/google/android/tv/remote/service/emote/ConnectedClients$ClientListener", "onDisconnected", 95, "ConnectedClients.java")).t("Client %s disconnected", bugVar);
        bsz bszVar = (bsz) this.a;
        bszVar.h++;
        ((bsy) bszVar.c.remove(bugVar)).a();
    }

    public final void e(bug bugVar, Exception exc) {
        ((cbs) ((cbs) bsz.a.g().i(exc)).j("com/google/android/tv/remote/service/emote/ConnectedClients$ClientListener", "onException", 103, "ConnectedClients.java")).t("Client %s has an exception", bugVar);
        ((bsz) this.a).g++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(bug bugVar, bux buxVar) {
        String str;
        ((cbs) ((cbs) bsz.a.c().g(btt.a)).j("com/google/android/tv/remote/service/emote/ConnectedClients$ClientListener", "onMessage", 112, "ConnectedClients.java")).z("Received a message from client %s: %s", bugVar, buv.a(buxVar.b));
        bsy bsyVar = (bsy) ((bsz) this.a).c.get(bugVar);
        if (bsyVar != null) {
            int iOrdinal = buv.a(buxVar.b).ordinal();
            int i = 0;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    if (bsyVar.h != 3) {
                        bsyVar.b(3, buxVar);
                        return;
                    }
                    int i2 = bsyVar.g;
                    bsyVar.g = (buxVar.b == 2 ? (buw) buxVar.c : buw.a).b & bsyVar.f;
                    bzs bzsVar = bsyVar.d;
                    int i3 = ((cax) bzsVar).c;
                    while (i < i3) {
                        ((btc) bzsVar.get(i)).c(i2, bsyVar.g);
                        i++;
                    }
                    return;
                }
                int i4 = 6;
                if (iOrdinal == 17) {
                    bsyVar.b(6, buxVar);
                    return;
                }
                if (bsyVar.h != 3) {
                    bsyVar.b(3, buxVar);
                    return;
                }
                try {
                    cbk it = bsyVar.d.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        i5 |= ((btc) it.next()).d(buxVar) ? 1 : 0;
                    }
                    i = i5;
                } catch (btb e) {
                    cbs cbsVar = (cbs) ((cbs) bsy.a.g().i(e)).j("com/google/android/tv/remote/service/emote/ConnectedClient", "dispatch", 98, "ConnectedClient.java");
                    i4 = e.a;
                    switch (i4) {
                        case 1:
                            str = "UNSPECIFIED";
                            break;
                        case 2:
                            str = "ALREADY_CONFIGURED";
                            break;
                        case 3:
                            str = "NOT_READY";
                            break;
                        case 4:
                            str = "FEATURE_NOT_AVAILABLE";
                            break;
                        case 5:
                            str = "FEATURE_NOT_REQUESTED";
                            break;
                        case 6:
                            str = "UNKNOWN_CLIENT_MESSAGE";
                            break;
                        case 7:
                            str = "GENERIC_FAILURE";
                            break;
                        case 8:
                            str = "INVALID_ARGUMENT";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    if (i4 == 0) {
                        throw null;
                    }
                    cbsVar.t("Failed to process client message: %s", str);
                }
                if (i == 0) {
                    bsyVar.b(i4, buxVar);
                    return;
                }
                return;
            }
            if (bsyVar.h != 1) {
                bsyVar.b(2, buxVar);
                return;
            }
            bsyVar.h = 2;
            buu buuVar = buxVar.b == 1 ? (buu) buxVar.c : buu.a;
            but butVar = buuVar.c;
            if (butVar == null) {
                butVar = but.a;
            }
            cbs cbsVar2 = (cbs) bsy.a.e().j("com/google/android/tv/remote/service/emote/ConnectedClient", "handleConfigure", 133, "ConnectedClient.java");
            StringBuilder sb = new StringBuilder("device_model='");
            sb.append(butVar.c);
            sb.append("' device_manufacturer=");
            sb.append(butVar.d);
            if ((butVar.b & 4) != 0) {
                int iZ = ii.Z(butVar.e);
                if (iZ == 0) {
                    iZ = 1;
                }
                int i6 = iZ - 1;
                String str2 = i6 != 0 ? i6 != 1 ? "ios" : "android" : "unspecified";
                sb.append(" os=");
                sb.append(str2);
            }
            sb.append(" os_version=");
            sb.append(butVar.f);
            sb.append(" app_name=");
            sb.append(butVar.g);
            sb.append(" app_version=");
            sb.append(butVar.h);
            cbsVar2.t("Build information received: %s", sb.toString());
            clo cloVarO = bsg.a.o();
            if ((butVar.b & 1) != 0) {
                String str3 = butVar.c;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bsg bsgVar = (bsg) cloVarO.b;
                str3.getClass();
                bsgVar.b |= 1;
                bsgVar.c = str3;
            }
            if ((butVar.b & 2) != 0) {
                String str4 = butVar.d;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bsg bsgVar2 = (bsg) cloVarO.b;
                str4.getClass();
                bsgVar2.b |= 2;
                bsgVar2.d = str4;
            }
            if ((butVar.b & 8) != 0) {
                String str5 = butVar.f;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bsg bsgVar3 = (bsg) cloVarO.b;
                str5.getClass();
                bsgVar3.b |= 8;
                bsgVar3.f = str5;
            }
            if ((butVar.b & 16) != 0) {
                String str6 = butVar.g;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bsg bsgVar4 = (bsg) cloVarO.b;
                str6.getClass();
                bsgVar4.b |= 16;
                bsgVar4.g = str6;
            }
            if ((butVar.b & 32) != 0) {
                String str7 = butVar.h;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bsg bsgVar5 = (bsg) cloVarO.b;
                str7.getClass();
                bsgVar5.b |= 32;
                bsgVar5.h = str7;
            }
            if ((butVar.b & 4) != 0) {
                int iZ2 = ii.Z(butVar.e);
                if (iZ2 == 0) {
                    iZ2 = 1;
                }
                int i7 = iZ2 - 1;
                if (i7 == 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bsg bsgVar6 = (bsg) cloVarO.b;
                    bsgVar6.e = 0;
                    bsgVar6.b |= 4;
                } else if (i7 != 1) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bsg bsgVar7 = (bsg) cloVarO.b;
                    bsgVar7.e = 2;
                    bsgVar7.b |= 4;
                } else {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bsg bsgVar8 = (bsg) cloVarO.b;
                    bsgVar8.e = 1;
                    bsgVar8.b |= 4;
                }
            }
            bsyVar.k = cloVarO;
            int i8 = buuVar.b;
            bsyVar.f = i8;
            if ((i8 & (~bsyVar.e)) != 0) {
                bsyVar.b(4, buxVar);
                return;
            }
            bzs bzsVar2 = bsyVar.d;
            int i9 = ((cax) bzsVar2).c;
            bsx bsxVar = new bsx(bsyVar, i9, buxVar);
            while (i < i9) {
                btc btcVar = (btc) bzsVar2.get(i);
                bsw bswVar = new bsw(bsxVar);
                try {
                    if (btcVar.e(bsyVar.f, bswVar)) {
                        bswVar.a(null);
                    }
                } catch (btb e2) {
                    bswVar.a(e2);
                }
                i++;
            }
        }
    }

    public final bjx g(bjx bjxVar) {
        return bjxVar instanceof bke ? bjxVar : new bjv(-((bkc) this.a).b(), bjxVar);
    }

    public final boolean h(String str, String str2) {
        bcn[] bcnVarArrB = ((cih) this.a).b(str);
        if (bcnVarArrB == null || bcnVarArrB.length == 0) {
            return false;
        }
        if (!str2.equals("")) {
            return Arrays.binarySearch(bcnVarArrB, str2) >= 0;
        }
        bcn bcnVar = bcnVarArrB[0];
        cih cihVar = bcn.h;
        return bcnVar.c.equals("");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ahl, java.lang.Object] */
    public final void i(aeq aeqVar) {
        this.a.i(aeqVar);
    }

    public final void j(int i) {
        yv yvVar = (yv) this.a;
        zu zuVarD = yvVar.d();
        if (yvVar.e() != zuVarD) {
            yvVar.k(zuVarD, i, true);
        }
    }

    public final int k(int i, boolean z, Object[] objArr, boolean z2) {
        int i2;
        int i3;
        View viewC;
        Object obj = this.a;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
        View viewV = gridLayoutManager.v(i - gridLayoutManager.g);
        if (!((vu) viewV.getLayoutParams()).d()) {
            if (z2) {
                if (z) {
                    ((in) obj).aE(viewV);
                } else {
                    ((in) obj).aF(viewV, 0);
                }
            } else if (z) {
                ((in) obj).aG(viewV);
            } else {
                ((in) obj).aH(viewV, 0);
            }
            if (gridLayoutManager.G != -1) {
                viewV.setVisibility(0);
            }
            vv vvVar = gridLayoutManager.q;
            if (vvVar != null && !vvVar.m && (i2 = vvVar.p) != 0) {
                if (i2 > 0) {
                    GridLayoutManager gridLayoutManager2 = vvVar.q;
                    i3 = gridLayoutManager2.o + gridLayoutManager2.M;
                } else {
                    GridLayoutManager gridLayoutManager3 = vvVar.q;
                    i3 = gridLayoutManager3.o - gridLayoutManager3.M;
                }
                View view = null;
                while (vvVar.p != 0 && (viewC = vvVar.c(i3)) != null) {
                    GridLayoutManager gridLayoutManager4 = vvVar.q;
                    if (gridLayoutManager4.ag(viewC)) {
                        gridLayoutManager4.o = i3;
                        int i4 = vvVar.p;
                        vvVar.p = i4 > 0 ? i4 - 1 : i4 + 1;
                        view = viewC;
                    }
                    i3 = vvVar.p > 0 ? i3 + gridLayoutManager4.M : i3 - gridLayoutManager4.M;
                }
                if (view != null) {
                    GridLayoutManager gridLayoutManager5 = vvVar.q;
                    if (gridLayoutManager5.be()) {
                        gridLayoutManager5.m |= 32;
                        view.requestFocus();
                        gridLayoutManager5.m &= -33;
                    }
                }
            }
            GridLayoutManager.bH(viewV, viewV.findFocus());
            int i5 = gridLayoutManager.m;
            if ((i5 & 3) != 1) {
                if (i == gridLayoutManager.o && gridLayoutManager.q == null) {
                    gridLayoutManager.G();
                }
            } else if ((i5 & 4) == 0) {
                if ((i5 & 16) == 0) {
                    if (i == gridLayoutManager.o) {
                        gridLayoutManager.G();
                    }
                } else if (i >= gridLayoutManager.o && viewV.hasFocusable()) {
                    gridLayoutManager.o = i;
                    gridLayoutManager.m &= -17;
                    gridLayoutManager.G();
                }
            }
            gridLayoutManager.J(viewV);
        }
        objArr[0] = viewV;
        return gridLayoutManager.e == 0 ? GridLayoutManager.bG(viewV) : GridLayoutManager.bF(viewV);
    }

    public final int l() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a;
        return gridLayoutManager.f.a() + gridLayoutManager.g;
    }

    public final int m(int i) {
        Object obj = this.a;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
        View viewM = ((in) obj).M(i - gridLayoutManager.g);
        return (gridLayoutManager.m & 262144) != 0 ? gridLayoutManager.i(viewM) : gridLayoutManager.k(viewM);
    }

    public final int n() {
        return ((GridLayoutManager) this.a).g;
    }

    public final int o(int i) {
        Object obj = this.a;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
        return gridLayoutManager.l(((in) obj).M(i - gridLayoutManager.g));
    }

    public final void p(int i) {
        Object obj = this.a;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
        in inVar = (in) obj;
        View viewM = inVar.M(i - gridLayoutManager.g);
        if ((gridLayoutManager.m & 3) == 1) {
            inVar.aK(viewM, gridLayoutManager.l);
        } else {
            inVar.aU(viewM, gridLayoutManager.l);
        }
    }

    public final void q(Object obj, int i, int i2, int i3) {
        int i4;
        int i5;
        vv vvVar;
        int i6;
        View view = (View) obj;
        if (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a;
            if (gridLayoutManager.N.b) {
                wn wnVar = gridLayoutManager.O.d;
                i3 = wnVar.f - wnVar.h;
            } else {
                i3 = gridLayoutManager.O.d.g;
            }
        }
        GridLayoutManager gridLayoutManager2 = (GridLayoutManager) this.a;
        if (gridLayoutManager2.N.b) {
            i4 = i3 - i;
            i5 = i3;
        } else {
            i5 = i + i3;
            i4 = i3;
        }
        gridLayoutManager2.I(i2, view, i4, i5, (gridLayoutManager2.c(i2) + gridLayoutManager2.O.e.g) - gridLayoutManager2.H);
        if (!gridLayoutManager2.f.g) {
            gridLayoutManager2.af();
        }
        if ((gridLayoutManager2.m & 3) == 1 || (vvVar = gridLayoutManager2.q) == null) {
            return;
        }
        if (vvVar.m && (i6 = vvVar.p) != 0) {
            vvVar.p = vvVar.q.r(true, i6);
        }
        int i7 = vvVar.p;
        if (i7 == 0 || ((i7 > 0 && vvVar.q.bx()) || (vvVar.p < 0 && vvVar.q.bw()))) {
            vvVar.a = vvVar.q.o;
            vvVar.e();
        }
    }

    public final ja r(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.h.c();
        int i2 = 0;
        ja jaVar = null;
        while (true) {
            if (i2 >= iC) {
                break;
            }
            ja jaVarF = RecyclerView.f(recyclerView.h.f(i2));
            if (jaVarF != null && !jaVarF.s() && jaVarF.d == i) {
                if (!recyclerView.h.k(jaVarF.b)) {
                    jaVar = jaVarF;
                    break;
                }
                jaVar = jaVarF;
            }
            i2++;
        }
        if (jaVar == null || recyclerView.h.k(jaVar.b)) {
            return null;
        }
        return jaVar;
    }

    public final void s(fe feVar) {
        int i = feVar.a;
        if (i == 1) {
            ((RecyclerView) this.a).m.w(feVar.b, feVar.d);
            return;
        }
        if (i == 2) {
            ((RecyclerView) this.a).m.y(feVar.b, feVar.d);
            return;
        }
        if (i != 4) {
            return;
        }
        in inVar = ((RecyclerView) this.a).m;
        int i2 = feVar.b;
        int i3 = feVar.d;
        Object obj = feVar.c;
        inVar.z(i2, i3);
    }

    public final void t(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.h.c();
        for (int i3 = 0; i3 < iC; i3++) {
            ja jaVarF = RecyclerView.f(recyclerView.h.f(i3));
            if (jaVarF != null && !jaVarF.x() && jaVarF.d >= i) {
                jaVarF.h(i2, false);
                recyclerView.K.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ja jaVar = (ja) arrayList.get(i4);
            if (jaVar != null && jaVar.d >= i) {
                jaVar.h(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.M = true;
    }

    public final void u(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.H(i, i2, true);
        recyclerView.M = true;
        recyclerView.K.c += i2;
    }

    public final void v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.h.c();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iC) {
                break;
            }
            View viewF = recyclerView.h.f(i6);
            ja jaVarF = RecyclerView.f(viewF);
            if (jaVarF != null && !jaVarF.x() && (i5 = jaVarF.d) >= i && i5 < i3) {
                jaVarF.c(2);
                jaVarF.z();
                ((io) viewF.getLayoutParams()).e = true;
            }
            i6++;
        }
        ir irVar = recyclerView.f;
        ArrayList arrayList = irVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.N = true;
                return;
            }
            ja jaVar = (ja) arrayList.get(size);
            if (jaVar != null && (i4 = jaVar.d) >= i && i4 < i3) {
                jaVar.c(2);
                irVar.h(size);
            }
        }
    }

    public final int w() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int x(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View y(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void z(View view) {
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF != null) {
            ((RecyclerView) this.a).ah(jaVarF, jaVarF.n);
            jaVarF.n = 0;
        }
    }

    public /* synthetic */ byj(Object obj) {
        this.a = obj;
    }

    public byj(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
