package defpackage;

import android.os.Handler;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqq {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public nqq(boolean z, int i, String str, String str2, et etVar, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.f = str;
        this.g = str2;
        this.e = etVar;
        this.c = z2;
        this.d = z3;
    }

    public static long a(String str, int i) {
        return Objects.hash(str, Integer.valueOf(i));
    }

    public static lid d(lio lioVar) {
        lin linVarF = f(lioVar);
        if (linVarF == null) {
            krd.f("Root node is null");
            return lid.a;
        }
        if (linVarF.d) {
            return linVarF.e.c(lioVar);
        }
        return null;
    }

    public static boolean e(lio lioVar, liq liqVar) {
        liq liqVarC = lioVar.c();
        liqVar.getClass();
        List list = liqVarC.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (liqVar.o((liq) it.next())) {
                return false;
            }
        }
        list.add(liqVar);
        return true;
    }

    public static lin f(lio lioVar) {
        while (lioVar != null) {
            if (lioVar instanceof lin) {
                return (lin) lioVar;
            }
            lioVar = lioVar.b();
        }
        return null;
    }

    public static void j(int i, lio lioVar) {
        if (lioVar == null) {
            krd.f("Node is null");
            lid lidVar = lid.a;
            return;
        }
        if (lioVar.c() == null) {
            krd.f("Node has not been initialized");
            lid lidVar2 = lid.a;
            return;
        }
        lin linVarF = f(lioVar);
        if (linVarF == null) {
            krd.f("Root node is null");
            lid lidVar3 = lid.a;
            return;
        }
        if (linVarF.d) {
            nqq nqqVar = linVarF.e;
            vtw vtwVarM = wjf.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wjf wjfVar = (wjf) vtwVarM.b;
            wjfVar.b |= 1;
            wjfVar.c = i;
            wjf wjfVar2 = (wjf) vtwVarM.r();
            ArrayList arrayList = new ArrayList();
            arrayList.add(wjfVar2);
            nqqVar.k(linVarF, lioVar, arrayList);
        }
    }

    private static int l(liq liqVar, int[] iArr) {
        int i = 0;
        for (liq liqVar2 : liqVar.b) {
            iArr[0] = iArr[0] + 1;
            int iL = l(liqVar2, iArr) + 1;
            if (iL > i) {
                i = iL;
            }
        }
        return i;
    }

    private static int m(wjf wjfVar, int[] iArr) {
        int i = 0;
        for (wjf wjfVar2 : wjfVar.d) {
            iArr[0] = iArr[0] + 1;
            int iM = m(wjfVar2, iArr) + 1;
            if (iM > i) {
                i = iM;
            }
        }
        return i;
    }

    private static String n(Object obj, Class cls) {
        for (Field field : cls.getDeclaredFields()) {
            if ((field.getModifiers() & 25) == 25) {
                try {
                    if (obj.equals(field.get(null))) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e) {
                    krd.c(e.getMessage());
                }
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void o(wjf wjfVar, String str) {
        int length;
        StringBuilder sb = new StringBuilder("type=");
        sb.append(wjfVar.c);
        sb.append('(');
        sb.append(n(Integer.valueOf(wjfVar.c), lir.class));
        sb.append(')');
        if ((wjfVar.b & 2) != 0) {
            sb.append(" c.cookie{");
            wji wjiVar = wjfVar.e;
            if (wjiVar == null) {
                wjiVar = wji.a;
            }
            if ((wjiVar.b & 1) != 0) {
                sb.append("assetInfo=[type=");
                wik wikVar = wjiVar.c;
                if (wikVar == null) {
                    wikVar = wik.a;
                }
                wij wijVarB = wij.b(wikVar.c);
                if (wijVarB == null) {
                    wijVarB = wij.UNKNOWN_ASSET_TYPE;
                }
                sb.append(wijVarB.q);
                sb.append("(");
                wik wikVar2 = wjiVar.c;
                if (wikVar2 == null) {
                    wikVar2 = wik.a;
                }
                wij wijVarB2 = wij.b(wikVar2.c);
                if (wijVarB2 == null) {
                    wijVarB2 = wij.UNKNOWN_ASSET_TYPE;
                }
                sb.append(n(Integer.valueOf(wijVarB2.q), wij.class));
                sb.append(") idType=");
                wik wikVar3 = wjiVar.c;
                if (wikVar3 == null) {
                    wikVar3 = wik.a;
                }
                wii wiiVarB = wii.b(wikVar3.d);
                if (wiiVarB == null) {
                    wiiVarB = wii.UNKNOWN_ID;
                }
                sb.append(wiiVarB.h);
                sb.append("(");
                wik wikVar4 = wjiVar.c;
                if (wikVar4 == null) {
                    wikVar4 = wik.a;
                }
                wii wiiVarB2 = wii.b(wikVar4.d);
                if (wiiVarB2 == null) {
                    wiiVarB2 = wii.UNKNOWN_ID;
                }
                sb.append(n(Integer.valueOf(wiiVarB2.h), wii.class));
                sb.append(") assetId=");
                wik wikVar5 = wjiVar.c;
                if (wikVar5 == null) {
                    wikVar5 = wik.a;
                }
                sb.append(wikVar5.e);
                sb.append("] ");
            }
            if ((wjiVar.b & 4) != 0) {
                sb.append("nonAssetInfo=[non asset type=");
                wjg wjgVar = wjiVar.e;
                if (wjgVar == null) {
                    wjgVar = wjg.a;
                }
                sb.append(wjgVar.d);
                sb.append("(");
                wjg wjgVar2 = wjiVar.e;
                if (wjgVar2 == null) {
                    wjgVar2 = wjg.a;
                }
                sb.append(n(Integer.valueOf(wjgVar2.d), xbv.class));
                sb.append(") non asset id=");
                wjg wjgVar3 = wjiVar.e;
                if (wjgVar3 == null) {
                    wjgVar3 = wjg.a;
                }
                sb.append(wjgVar3.c);
                sb.append(" non asset ids=(");
                int i = 0;
                while (true) {
                    wjg wjgVar4 = wjiVar.e;
                    if (wjgVar4 == null) {
                        wjgVar4 = wjg.a;
                    }
                    if (i >= wjgVar4.e.size()) {
                        break;
                    }
                    sb.append(i > 0 ? "," : "");
                    wjg wjgVar5 = wjiVar.e;
                    if (wjgVar5 == null) {
                        wjgVar5 = wjg.a;
                    }
                    sb.append((String) wjgVar5.e.get(i));
                    i++;
                }
                sb.append(")] ");
            }
            if (!wjiVar.d.isEmpty()) {
                sb.append(" offer.length=");
                sb.append(wjiVar.d.size());
            }
            sb.append("}");
        }
        byte[] bArrW = wjfVar.f.w();
        if (bArrW != null && (length = bArrW.length) != 0) {
            sb.append(" s.cookie{size=");
            sb.append(length);
            sb.append('}');
        }
        krd.b(str.concat(sb.toString()));
    }

    private static void p(String str, long j, liq liqVar, String str2, boolean z, boolean z2) {
        if (z && z2) {
            if (str != null) {
                krd.b(str + " impression tree, id=" + j);
            }
            o(liqVar.a, str2);
            Iterator it = liqVar.b.iterator();
            while (it.hasNext()) {
                p(null, 0L, (liq) it.next(), str2.concat("  "), true, true);
            }
        }
    }

    private static void q(String str, long j, wjf wjfVar, String str2, boolean z, boolean z2) {
        if (z && z2) {
            if (str != null) {
                krd.b(str + " impression tree, id=" + j);
            }
            o(wjfVar, str2);
            Iterator<E> it = wjfVar.d.iterator();
            while (it.hasNext()) {
                q(null, 0L, (wjf) it.next(), str2.concat("  "), true, true);
            }
        }
    }

    public final long b() {
        long andIncrement;
        do {
            andIncrement = ((AtomicLong) this.f).getAndIncrement();
        } while (andIncrement == 0);
        return andIncrement;
    }

    public final lid c(lio lioVar) {
        if (lioVar == null) {
            if (this.c) {
                krd.f("Node is null");
            }
        } else if (lioVar.c() == null) {
            if (this.c) {
                krd.f("Node has not been initialized");
            }
        } else {
            if (f(lioVar) != null) {
                return k(f(lioVar), lioVar, new ArrayList());
            }
            if (this.c) {
                krd.f("Root node is null");
            }
        }
        return lid.a;
    }

    public final void g(long j, lin linVar, boolean z, String str) {
        if (!linVar.k() && z && linVar.a.b.isEmpty()) {
            return;
        }
        linVar.i();
        h(linVar, j, linVar.a.t((kdj) this.g), str);
    }

    public final void h(lin linVar, long j, wjf wjfVar, String str) {
        String str2;
        Object obj;
        vtw vtwVarM = wip.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wip wipVar = (wip) vucVar;
        wjfVar.getClass();
        wipVar.c = wjfVar;
        wipVar.b |= 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wip wipVar2 = (wip) vtwVarM.b;
        wipVar2.b |= 2;
        wipVar2.e = j;
        wip wipVar3 = (wip) vtwVarM.r();
        lid lidVarA = lid.a();
        linVar.c = lidVarA;
        kuw kuwVar = new kuw(lidVarA, linVar.b, (byte[]) null);
        Object obj2 = kuwVar.b;
        Object obj3 = kuwVar.a;
        boolean z = this.d;
        boolean z2 = this.a;
        boolean z3 = this.c;
        wjf wjfVar2 = wipVar3.c;
        if (wjfVar2 == null) {
            wjfVar2 = wjf.a;
        }
        if (z) {
            int i = wjfVar2.c;
            int size = wjfVar2.d.size();
            int[] iArr = {0};
            int iM = m(wjfVar2, iArr);
            int i2 = iArr[0];
            long j2 = ((lid) obj2).b;
            long j3 = ((lid) obj3).b;
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            obj = obj2;
            sb.append(" impression at root. Type=");
            sb.append(i);
            sb.append(" top children=");
            sb.append(size);
            sb.append(" total children=");
            sb.append(i2);
            sb.append(" depth=");
            sb.append(iM);
            sb.append(" eventId=");
            sb.append(j2);
            sb.append(" parentEventId=");
            sb.append(j3);
            krd.b(sb.toString());
        } else {
            str2 = str;
            obj = obj2;
        }
        long j4 = wipVar3.e;
        wjf wjfVar3 = wipVar3.c;
        if (wjfVar3 == null) {
            wjfVar3 = wjf.a;
        }
        q(str2, j4, wjfVar3, "", z2, z3);
        lia liaVar = (lia) this.e;
        vtw vtwVarN = kff.n(liaVar.b, liaVar.c);
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        wjm wjmVar = (wjm) vtwVarN.b;
        wjm wjmVar2 = wjm.a;
        wipVar3.getClass();
        wjmVar.e = wipVar3;
        wjmVar.b |= 4;
        long j5 = ((lid) obj).b;
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        vuc vucVar2 = vtwVarN.b;
        wjm wjmVar3 = (wjm) vucVar2;
        wjmVar3.b |= 65536;
        wjmVar3.l = j5;
        long j6 = ((lid) obj3).b;
        if (!vucVar2.A()) {
            vtwVarN.u();
        }
        lhz lhzVar = liaVar.a;
        wjm wjmVar4 = (wjm) vtwVarN.b;
        wjmVar4.b |= 131072;
        wjmVar4.m = j6;
        lhzVar.b((wjm) vtwVarN.r());
        Object obj4 = this.g;
        if ((wipVar3.b & 1) != 0) {
            wjf wjfVar4 = wipVar3.c;
            if (wjfVar4 == null) {
                wjfVar4 = wjf.a;
            }
            ((kdj) obj4).b(wjfVar4);
        }
        Iterator<E> it = wipVar3.d.iterator();
        while (it.hasNext()) {
            ((kdj) obj4).b((wjf) it.next());
        }
        vtw vtwVar = (vtw) wipVar3.a(5, null);
        vtwVar.x(wipVar3);
        if (vtwVar.a.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        vtwVar.b = vtwVar.q();
        ((nug) ((kdj) obj4).a).a((wip) vtwVar.r());
    }

    public final void i(Handler handler, long j, lin linVar) {
        boolean z = this.d;
        liq liqVar = linVar.a;
        if (z) {
            wjf wjfVar = liqVar.a;
            List list = liqVar.b;
            int i = wjfVar.c;
            int size = list.size();
            int[] iArr = {0};
            int iL = l(liqVar, iArr);
            krd.b("Collecting impression at root. Type=" + i + " top children=" + size + " total children=" + iArr[0] + " depth=" + iL);
        }
        p("Collecting", j, liqVar, "", this.a, this.c);
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new jcp(this, j, linVar, 2), this.b);
    }

    public final lid k(lin linVar, lio lioVar, ArrayList arrayList) {
        linVar.f();
        while (lioVar != null) {
            vtw vtwVarM = wjf.a.m();
            if (lioVar.c() != null) {
                lioVar.c().s(vtwVarM);
            }
            arrayList.add((wjf) vtwVarM.r());
            lioVar = lioVar.b();
        }
        vtw vtwVarM2 = wil.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wil wilVar = (wil) vtwVarM2.b;
        wilVar.d = 1;
        wilVar.b |= 2;
        vtwVarM2.aG(arrayList);
        wil wilVar2 = (wil) vtwVarM2.r();
        arrayList.clear();
        kuw kuwVarO = linVar.o();
        Object obj = kuwVarO.b;
        Object obj2 = kuwVarO.a;
        if (this.c) {
            krd.b("Sending click event (eventId=" + ((lid) obj).b + " parentEventId=" + ((lid) obj2).b + "):");
            Iterator<E> it = wilVar2.c.iterator();
            String strConcat = "";
            while (it.hasNext()) {
                o((wjf) it.next(), strConcat);
                strConcat = strConcat.concat("  ");
            }
        }
        lia liaVar = (lia) this.e;
        vtw vtwVarN = kff.n(liaVar.b, liaVar.c);
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        wjm wjmVar = (wjm) vtwVarN.b;
        wjm wjmVar2 = wjm.a;
        wilVar2.getClass();
        wjmVar.f = wilVar2;
        wjmVar.b |= 8;
        lid lidVar = (lid) obj;
        long j = lidVar.b;
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        vuc vucVar = vtwVarN.b;
        wjm wjmVar3 = (wjm) vucVar;
        wjmVar3.b |= 65536;
        wjmVar3.l = j;
        long j2 = ((lid) obj2).b;
        if (!vucVar.A()) {
            vtwVarN.u();
        }
        lhz lhzVar = liaVar.a;
        wjm wjmVar4 = (wjm) vtwVarN.b;
        wjmVar4.b |= 131072;
        wjmVar4.m = j2;
        lhzVar.b((wjm) vtwVarN.r());
        Object obj3 = this.g;
        Iterator<E> it2 = wilVar2.c.iterator();
        while (it2.hasNext()) {
            ((kdj) obj3).b((wjf) it2.next());
        }
        vtw vtwVar = (vtw) wilVar2.a(5, null);
        vtwVar.x(wilVar2);
        if (vtwVar.a.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        vtwVar.b = vtwVar.q();
        ((nug) ((kdj) obj3).c).a((wil) vtwVar.r());
        return lidVar;
    }

    public nqq(lia liaVar, boolean z, boolean z2, boolean z3, int i) {
        kdj kdjVar = new kdj();
        this.f = new AtomicLong(new SecureRandom().nextLong());
        liaVar.getClass();
        this.e = liaVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.a = z3;
        this.g = kdjVar;
    }
}
