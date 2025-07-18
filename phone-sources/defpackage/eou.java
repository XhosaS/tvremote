package defpackage;

import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eou implements epd {
    public final long a;
    public final List b;
    public final Set c;
    public final Set d;
    public int e;
    public eoo f;
    public eoo g;
    public Looper h;
    public Handler i;
    volatile eor j;
    public final ghc k;
    private final UUID m;
    private final epl n;
    private final epu o;
    private final HashMap p;
    private final boolean q;
    private final int[] r;
    private final boolean s;
    private ExoMediaDrm t;
    private int u;
    private byte[] v;
    private elk w;
    private final sew x;
    private final pku y;

    public eou(UUID uuid, epl eplVar, epu epuVar, HashMap map, boolean z, int[] iArr, boolean z2, sew sewVar, long j) {
        uuid.getClass();
        eci.a(!dys.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.m = uuid;
        this.n = eplVar;
        this.o = epuVar;
        this.p = map;
        this.q = z;
        this.r = iArr;
        this.s = z2;
        this.x = sewVar;
        this.k = new ghc((byte[]) null);
        this.y = new pku(this);
        this.u = 0;
        this.b = new ArrayList();
        this.c = Sets.newIdentityHashSet();
        this.d = Sets.newIdentityHashSet();
        this.a = j;
    }

    private static List j(dza dzaVar, UUID uuid, boolean z) {
        int i = dzaVar.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            dyz dyzVarA = dzaVar.a(i2);
            if ((dyzVarA.c(uuid) || (dys.c.equals(uuid) && dyzVarA.c(dys.b))) && (dyzVarA.d != null || z)) {
                arrayList.add(dyzVarA);
            }
        }
        return arrayList;
    }

    private final synchronized void k(Looper looper) {
        Looper looper2 = this.h;
        if (looper2 == null) {
            this.h = looper;
            this.i = new Handler(looper);
        } else {
            a.ab(looper2 == looper);
            this.i.getClass();
        }
    }

    private final void l() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.d).iterator();
        while (it.hasNext()) {
            ((eox) it.next()).p(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.c).iterator();
        while (it.hasNext()) {
            ((eot) it.next()).a();
        }
    }

    private final void n(boolean z) {
        if (z && this.h == null) {
            edb.f("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.h;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            edb.f("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.h.getThread().getName(), new IllegalStateException());
        }
    }

    private static boolean o(eox eoxVar) {
        if (eoxVar.a() != 1) {
            return false;
        }
        eow eowVarC = eoxVar.c();
        eowVarC.getClass();
        Throwable cause = eowVarC.getCause();
        return (cause instanceof ResourceBusyException) || cme.A(cause);
    }

    private final eoo p(List list, boolean z, eph ephVar) {
        this.t.getClass();
        ExoMediaDrm exoMediaDrm = this.t;
        int i = this.u;
        byte[] bArr = this.v;
        Looper looper = this.h;
        looper.getClass();
        elk elkVar = this.w;
        elkVar.getClass();
        ghc ghcVar = this.k;
        HashMap map = this.p;
        eoo eooVar = new eoo(this.m, exoMediaDrm, ghcVar, this.y, list, i, this.s | z, z, bArr, map, this.o, looper, this.x, elkVar);
        eooVar.o(ephVar);
        if (this.a != -9223372036854775807L) {
            eooVar.o(null);
        }
        return eooVar;
    }

    private final eoo q(List list, boolean z, eph ephVar, boolean z2) {
        eoo eooVarP = p(list, z, ephVar);
        if (o(eooVarP) && !this.d.isEmpty()) {
            l();
            r(eooVarP, ephVar);
            eooVarP = p(list, z, ephVar);
        }
        if (!o(eooVarP) || !z2 || this.c.isEmpty()) {
            return eooVarP;
        }
        m();
        if (!this.d.isEmpty()) {
            l();
        }
        r(eooVarP, ephVar);
        return p(list, z, ephVar);
    }

    private final void r(eox eoxVar, eph ephVar) {
        eoxVar.p(ephVar);
        if (this.a != -9223372036854775807L) {
            eoxVar.p(null);
        }
    }

    @Override // defpackage.epd
    public final int a(dze dzeVar) {
        n(false);
        ExoMediaDrm exoMediaDrm = this.t;
        exoMediaDrm.getClass();
        int cryptoType = exoMediaDrm.getCryptoType();
        dza dzaVar = dzeVar.ac;
        if (dzaVar == null) {
            if (edt.r(this.r, eae.b(dzeVar.Y)) == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.m;
            if (j(dzaVar, uuid, true).isEmpty()) {
                if (dzaVar.c == 1 && dzaVar.a(0).c(dys.b)) {
                    edb.e("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(String.valueOf(uuid))));
                }
                return 1;
            }
            String str = dzaVar.b;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return cryptoType;
    }

    public final void b() {
        if (this.t != null && this.e == 0 && this.b.isEmpty() && this.c.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.t;
            exoMediaDrm.getClass();
            exoMediaDrm.release();
            this.t = null;
        }
    }

    public final void e(int i, byte[] bArr) {
        a.ab(this.b.isEmpty());
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.u = i;
        this.v = bArr;
    }

    @Override // defpackage.epd
    public final void em() {
        n(true);
        int i = this.e;
        this.e = i + 1;
        if (i != 0) {
            return;
        }
        if (this.t == null) {
            ExoMediaDrm exoMediaDrmA = this.n.a(this.m);
            this.t = exoMediaDrmA;
            exoMediaDrmA.setOnEventListener(new eoq(this));
        } else {
            if (this.a == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                List list = this.b;
                if (i2 >= list.size()) {
                    return;
                }
                ((eoo) list.get(i2)).o(null);
                i2++;
            }
        }
    }

    @Override // defpackage.epd
    public final void en() {
        n(true);
        int i = this.e - 1;
        this.e = i;
        if (i != 0) {
            return;
        }
        if (this.a != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.b);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((eoo) arrayList.get(i2)).p(null);
            }
        }
        m();
        b();
    }

    @Override // defpackage.epd
    public final void eo(Looper looper, elk elkVar) {
        k(looper);
        this.w = elkVar;
    }

    @Override // defpackage.epd
    public final eox ep(eph ephVar, dze dzeVar) {
        n(false);
        a.ab(this.e > 0);
        eci.e(this.h);
        return h(this.h, ephVar, dzeVar, true);
    }

    public final eox h(Looper looper, eph ephVar, dze dzeVar, boolean z) {
        List listJ;
        if (this.j == null) {
            this.j = new eor(this, looper);
        }
        dza dzaVar = dzeVar.ac;
        eoo eooVar = null;
        if (dzaVar == null) {
            int iB = eae.b(dzeVar.Y);
            ExoMediaDrm exoMediaDrm = this.t;
            exoMediaDrm.getClass();
            if ((exoMediaDrm.getCryptoType() == 2 && epn.a) || edt.r(this.r, iB) == -1 || exoMediaDrm.getCryptoType() == 1) {
                return null;
            }
            eoo eooVar2 = this.f;
            if (eooVar2 == null) {
                eoo eooVarQ = q(ImmutableList.of(), true, null, z);
                this.b.add(eooVarQ);
                this.f = eooVarQ;
            } else {
                eooVar2.o(null);
            }
            return this.f;
        }
        if (this.v == null) {
            UUID uuid = this.m;
            listJ = j(dzaVar, uuid, false);
            if (listJ.isEmpty()) {
                eos eosVar = new eos(uuid);
                edb.d("DefaultDrmSessionMgr", "DRM error", eosVar);
                if (ephVar != null) {
                    ephVar.x(eosVar);
                }
                return new epg(new eow(eosVar, 6003));
            }
        } else {
            listJ = null;
        }
        boolean z2 = this.q;
        if (z2) {
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                eoo eooVar3 = (eoo) it.next();
                if (Objects.equals(eooVar3.a, listJ)) {
                    eooVar = eooVar3;
                    break;
                }
            }
        } else {
            eooVar = this.g;
        }
        if (eooVar != null) {
            eooVar.o(ephVar);
            return eooVar;
        }
        eoo eooVarQ2 = q(listJ, false, ephVar, z);
        if (!z2) {
            this.g = eooVarQ2;
        }
        this.b.add(eooVarQ2);
        return eooVarQ2;
    }

    @Override // defpackage.epd
    public final epc i(eph ephVar, dze dzeVar) {
        int i = 1;
        a.ab(this.e > 0);
        eci.e(this.h);
        eot eotVar = new eot(this, ephVar);
        Handler handler = eotVar.c.i;
        handler.getClass();
        handler.post(new eoy(eotVar, dzeVar, i));
        return eotVar;
    }
}
