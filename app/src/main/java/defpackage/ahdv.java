package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahdv implements ahdl, ahay, ahee {
    private final agzy a;
    public final agzy d;

    public ahdv(boolean z) {
        ahcq ahcqVar = z ? ahdw.g : ahdw.f;
        agzz agzzVar = agzz.a;
        this.d = new agzy(ahcqVar, agzzVar);
        this.a = new agzy(null, agzzVar);
    }

    private final ahea P(ahdg ahdgVar) {
        ahea aheaVarA = ahdgVar.a();
        if (aheaVarA != null) {
            return aheaVarA;
        }
        if (ahdgVar instanceof ahcq) {
            return new ahea();
        }
        if (ahdgVar instanceof ahdq) {
            T((ahdq) ahdgVar);
            return null;
        }
        Objects.toString(ahdgVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(ahdgVar)));
    }

    private final void Q(ahdg ahdgVar, Object obj) throws Throwable {
        ahaw ahawVarE = E();
        if (ahawVarE != null) {
            ahawVarE.fn();
            this.a.c(ahec.a);
        }
        ahbd ahbdVar = null;
        ahbc ahbcVar = obj instanceof ahbc ? (ahbc) obj : null;
        Throwable th = ahbcVar != null ? ahbcVar.b : null;
        if (ahdgVar instanceof ahdq) {
            try {
                ((ahdq) ahdgVar).b(th);
                return;
            } catch (Throwable th2) {
                fx(new ahbd(a.d(this, ahdgVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        ahea aheaVarA = ahdgVar.a();
        if (aheaVarA != null) {
            aheaVarA.j(1);
            Object obj2 = aheaVarA.e.a;
            obj2.getClass();
            for (ahlv ahlvVarH = (ahlv) obj2; !agvy.c(ahlvVarH, aheaVarA); ahlvVarH = ahlvVarH.h()) {
                if (ahlvVarH instanceof ahdq) {
                    try {
                        ((ahdq) ahlvVarH).b(th);
                    } catch (Throwable th3) {
                        if (ahbdVar != null) {
                            agox.a(ahbdVar, th3);
                        } else {
                            ahbdVar = new ahbd(a.d(this, ahlvVarH, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (ahbdVar != null) {
                fx(ahbdVar);
            }
        }
    }

    private final void R(ahea aheaVar, Throwable th) throws Throwable {
        aheaVar.j(4);
        Object obj = aheaVar.e.a;
        obj.getClass();
        ahbd ahbdVar = null;
        for (ahlv ahlvVarH = (ahlv) obj; !agvy.c(ahlvVarH, aheaVar); ahlvVarH = ahlvVarH.h()) {
            if (ahlvVarH instanceof ahdq) {
                ahdq ahdqVar = (ahdq) ahlvVarH;
                if (ahdqVar.c()) {
                    try {
                        ahdqVar.b(th);
                    } catch (Throwable th2) {
                        if (ahbdVar != null) {
                            agox.a(ahbdVar, th2);
                        } else {
                            ahbdVar = new ahbd(a.d(this, ahlvVarH, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (ahbdVar != null) {
            fx(ahbdVar);
        }
        U(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ahdf] */
    private final void S(ahcq ahcqVar) {
        ahea aheaVar = new ahea();
        if (!ahcqVar.a) {
            aheaVar = new ahdf(aheaVar);
        }
        this.d.d(ahcqVar, aheaVar);
    }

    private final void T(ahdq ahdqVar) {
        ahea aheaVar = new ahea();
        aheaVar.f.b(ahdqVar);
        aheaVar.e.b(ahdqVar);
        while (true) {
            agzy agzyVar = ahdqVar.e;
            if (agzyVar.a != ahdqVar) {
                break;
            } else if (agzyVar.d(ahdqVar, aheaVar)) {
                aheaVar.k(ahdqVar);
                break;
            }
        }
        this.d.d(ahdqVar, ahdqVar.h());
    }

    private final boolean U(Throwable th) {
        if (fC()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ahaw ahawVarE = E();
        return (ahawVarE == null || ahawVarE == ahec.a) ? z : ahawVarE.e(th) || z;
    }

    private final int d(Object obj) {
        if (obj instanceof ahcq) {
            if (((ahcq) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, ahdw.g)) {
                return -1;
            }
            J();
            return 1;
        }
        if (!(obj instanceof ahdf)) {
            return 0;
        }
        if (!this.d.d(obj, ((ahdf) obj).a)) {
            return -1;
        }
        J();
        return 1;
    }

    private final Object g(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof ahdg)) {
            return ahdw.a;
        }
        if (((obj instanceof ahcq) || (obj instanceof ahdq)) && !(obj instanceof ahax) && !(obj2 instanceof ahbc)) {
            ahdg ahdgVar = (ahdg) obj;
            boolean z = ahbx.a;
            if (!this.d.d(ahdgVar, ahdw.a(obj2))) {
                return ahdw.c;
            }
            l(obj2);
            Q(ahdgVar, obj2);
            return obj2;
        }
        ahdg ahdgVar2 = (ahdg) obj;
        ahea aheaVarP = P(ahdgVar2);
        if (aheaVarP == null) {
            return ahdw.c;
        }
        Throwable th = null;
        ahdt ahdtVar = ahdgVar2 instanceof ahdt ? (ahdt) ahdgVar2 : null;
        if (ahdtVar == null) {
            ahdtVar = new ahdt(aheaVarP, null);
        }
        agwh agwhVar = new agwh();
        synchronized (ahdtVar) {
            agzv agzvVar = ahdtVar.b;
            if (agzvVar.b()) {
                return ahdw.a;
            }
            agzvVar.a = 1;
            if (ahdtVar != ahdgVar2 && !this.d.d(ahdgVar2, ahdtVar)) {
                return ahdw.c;
            }
            boolean z2 = ahbx.a;
            boolean zE = ahdtVar.e();
            ahbc ahbcVar = obj2 instanceof ahbc ? (ahbc) obj2 : null;
            if (ahbcVar != null) {
                ahdtVar.d(ahbcVar.b);
            }
            Throwable thC = ahdtVar.c();
            boolean z3 = !zE;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = thC;
            }
            agwhVar.a = th;
            Throwable th2 = (Throwable) agwhVar.a;
            if (th2 != null) {
                R(aheaVarP, th2);
            }
            ahax ahaxVarF = F(aheaVarP);
            if (ahaxVarF != null && O(ahdtVar, ahaxVarF, obj2)) {
                return ahdw.b;
            }
            aheaVarP.j(2);
            ahax ahaxVarF2 = F(aheaVarP);
            return (ahaxVarF2 == null || !O(ahdtVar, ahaxVarF2, obj2)) ? z(ahdtVar, obj2) : ahdw.b;
        }
    }

    private final String j(Object obj) {
        if (!(obj instanceof ahdt)) {
            return obj instanceof ahdg ? ((ahdg) obj).fo() ? "Active" : "New" : obj instanceof ahbc ? "Cancelled" : "Completed";
        }
        ahdt ahdtVar = (ahdt) obj;
        return ahdtVar.e() ? "Cancelling" : ahdtVar.b.b() ? "Completing" : "Active";
    }

    private final Throwable k(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            return ((ahee) obj).C();
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : new ahdm(b(), null, this);
    }

    public final Object A() throws Throwable {
        Object obj = this.d.a;
        if (obj instanceof ahdg) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof ahbc) {
            throw ((ahbc) obj).b;
        }
        return ahdw.b(obj);
    }

    public final Object B(Object obj) throws Throwable {
        Object objG;
        do {
            objG = g(this.d.a, obj);
            if (objG == ahdw.a) {
                String strD = a.d(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                ahbc ahbcVar = obj instanceof ahbc ? (ahbc) obj : null;
                throw new IllegalStateException(strD, ahbcVar != null ? ahbcVar.b : null);
            }
        } while (objG == ahdw.c);
        return objG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // defpackage.ahee
    public final CancellationException C() {
        CancellationException cancellationExceptionC;
        Object obj = this.d.a;
        if (obj instanceof ahdt) {
            cancellationExceptionC = ((ahdt) obj).c();
        } else if (obj instanceof ahbc) {
            cancellationExceptionC = ((ahbc) obj).b;
        } else {
            if (obj instanceof ahdg) {
                Objects.toString(obj);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(obj)));
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new ahdm("Parent job is ".concat(j(obj)), cancellationExceptionC, this) : cancellationException;
    }

    protected final CancellationException D(Throwable th, String str) {
        CancellationException ahdmVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (ahdmVar == null) {
            if (str == null) {
                str = b();
            }
            ahdmVar = new ahdm(str, th, this);
        }
        return ahdmVar;
    }

    public final ahaw E() {
        return (ahaw) this.a.a;
    }

    public final ahax F(ahlv ahlvVar) {
        while (ahlvVar.fq()) {
            ahlvVar = ahlvVar.i();
        }
        while (true) {
            ahlvVar = ahlvVar.h();
            if (!ahlvVar.fq()) {
                if (ahlvVar instanceof ahax) {
                    return (ahax) ahlvVar;
                }
                if (ahlvVar instanceof ahea) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        return defpackage.ahec.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ahcn G(boolean r5, defpackage.ahdq r6) {
        /*
            r4 = this;
            r6.d = r4
        L2:
            agzy r0 = r4.d
            java.lang.Object r1 = r0.a
            boolean r2 = r1 instanceof defpackage.ahcq
            if (r2 == 0) goto L1c
            r2 = r1
            ahcq r2 = (defpackage.ahcq) r2
            boolean r3 = r2.a
            if (r3 == 0) goto L18
            boolean r0 = r0.d(r1, r6)
            if (r0 == 0) goto L2
            goto L5c
        L18:
            r4.S(r2)
            goto L2
        L1c:
            boolean r2 = r1 instanceof defpackage.ahdg
            r3 = 0
            if (r2 == 0) goto L5d
            r0 = r1
            ahdg r0 = (defpackage.ahdg) r0
            ahea r2 = r0.a()
            if (r2 != 0) goto L33
            r1.getClass()
            ahdq r1 = (defpackage.ahdq) r1
            r4.T(r1)
            goto L2
        L33:
            boolean r1 = r6.c()
            if (r1 == 0) goto L55
            boolean r1 = r0 instanceof defpackage.ahdt
            if (r1 == 0) goto L40
            ahdt r0 = (defpackage.ahdt) r0
            goto L41
        L40:
            r0 = r3
        L41:
            if (r0 == 0) goto L47
            java.lang.Throwable r3 = r0.c()
        L47:
            if (r3 != 0) goto L4f
            r0 = 5
            boolean r0 = r2.l(r6, r0)
            goto L5a
        L4f:
            if (r5 == 0) goto L70
            r6.b(r3)
            goto L70
        L55:
            r0 = 1
            boolean r0 = r2.l(r6, r0)
        L5a:
            if (r0 == 0) goto L2
        L5c:
            return r6
        L5d:
            if (r5 == 0) goto L70
            java.lang.Object r5 = r0.a
            boolean r0 = r5 instanceof defpackage.ahbc
            if (r0 == 0) goto L68
            ahbc r5 = (defpackage.ahbc) r5
            goto L69
        L68:
            r5 = r3
        L69:
            if (r5 == 0) goto L6d
            java.lang.Throwable r3 = r5.b
        L6d:
            r6.b(r3)
        L70:
            ahec r5 = defpackage.ahec.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahdv.G(boolean, ahdq):ahcn");
    }

    public void H(Throwable th) throws Throwable {
        K(th);
    }

    protected final void I(ahdl ahdlVar) {
        boolean z = ahbx.a;
        if (ahdlVar == null) {
            this.a.c(ahec.a);
            return;
        }
        ahdlVar.x();
        ahaw ahawVarQ = ahdlVar.q(this);
        agzy agzyVar = this.a;
        agzyVar.c(ahawVarQ);
        if (v()) {
            ahawVarQ.fn();
            agzyVar.c(ahec.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahdv.K(java.lang.Object):boolean");
    }

    public boolean L(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return K(th) && fl();
    }

    protected boolean M(Throwable th) {
        return false;
    }

    public final boolean N(Object obj) {
        while (true) {
            Object objG = g(this.d.a, obj);
            if (objG == ahdw.a) {
                return false;
            }
            if (objG == ahdw.b) {
                break;
            }
            if (objG != ahdw.c) {
                f(objG);
                break;
            }
        }
        return true;
    }

    public final boolean O(ahdt ahdtVar, ahax ahaxVar, Object obj) {
        while (ahdp.b(ahaxVar.a, false, new ahds(this, ahdtVar, ahaxVar, obj)) == ahec.a) {
            ahaxVar = F(ahaxVar);
            if (ahaxVar == null) {
                return false;
            }
        }
        return true;
    }

    protected String b() {
        return "Job was cancelled";
    }

    @Override // defpackage.ahdl
    public final ahcn fA(boolean z, boolean z2, agux aguxVar) {
        return G(z2, z ? new ahdi(aguxVar) : new ahdj(aguxVar));
    }

    @Override // defpackage.ahdl
    public final boolean fB() {
        Object obj = this.d.a;
        if (obj instanceof ahbc) {
            return true;
        }
        return (obj instanceof ahdt) && ((ahdt) obj).e();
    }

    protected boolean fC() {
        return false;
    }

    public boolean fl() {
        return true;
    }

    public boolean fm() {
        return false;
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    public String fv() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object fy(agsw agswVar) throws Throwable {
        Object obj;
        do {
            obj = this.d.a;
            if (!(obj instanceof ahdg)) {
                if (!(obj instanceof ahbc)) {
                    return ahdw.b(obj);
                }
                Throwable th = ((ahbc) obj).b;
                if (ahbx.b) {
                    throw ahmf.a(th, agswVar);
                }
                throw th;
            }
        } while (d(obj) < 0);
        ahdr ahdrVar = new ahdr(agth.c(agswVar), this);
        ahdrVar.z();
        ahat.b(ahdrVar, ahdp.b(this, true, new ahef(ahdrVar)));
        return ahdrVar.m();
    }

    @Override // defpackage.ahdl
    public final Object fz(agsw agswVar) {
        Object obj;
        do {
            obj = this.d.a;
            if (!(obj instanceof ahdg)) {
                ahdp.e(agswVar.fr());
                return agpu.a;
            }
        } while (d(obj) < 0);
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        ahat.b(aharVar, ahdp.b(this, true, new aheg(aharVar)));
        Object objM = aharVar.m();
        agtg agtgVar = agtg.a;
        if (objM != agtgVar) {
            objM = agpu.a;
        }
        return objM == agtgVar ? objM : agpu.a;
    }

    @Override // defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        return agtb.b(this, agtdVar);
    }

    @Override // defpackage.agtc
    public final agtd getKey() {
        return ahdl.c;
    }

    @Override // defpackage.ahay
    public final void m(ahee aheeVar) throws Throwable {
        K(aheeVar);
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        return agtb.c(this, agtdVar);
    }

    @Override // defpackage.ahdl
    public final CancellationException o() {
        Object obj = this.d.a;
        if (!(obj instanceof ahdt)) {
            if (!(obj instanceof ahdg)) {
                return obj instanceof ahbc ? D(((ahbc) obj).b, null) : new ahdm(String.valueOf(getClass().getSimpleName()).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thC = ((ahdt) obj).c();
        if (thC != null) {
            return D(thC, String.valueOf(getClass().getSimpleName()).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.ahdl
    public final agxs p() {
        return new agxw(new ahdu(this, null));
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        agteVar.getClass();
        return agta.a(this, agteVar);
    }

    @Override // defpackage.ahdl
    public final ahaw q(ahay ahayVar) {
        ahax ahaxVar = new ahax(ahayVar);
        ahaxVar.d = this;
        while (true) {
            agzy agzyVar = this.d;
            Object obj = agzyVar.a;
            if (obj instanceof ahcq) {
                ahcq ahcqVar = (ahcq) obj;
                if (!ahcqVar.a) {
                    S(ahcqVar);
                } else if (agzyVar.d(obj, ahaxVar)) {
                    break;
                }
            } else {
                if (!(obj instanceof ahdg)) {
                    Object obj2 = agzyVar.a;
                    ahbc ahbcVar = obj2 instanceof ahbc ? (ahbc) obj2 : null;
                    ahaxVar.b(ahbcVar != null ? ahbcVar.b : null);
                    return ahec.a;
                }
                ahea aheaVarA = ((ahdg) obj).a();
                if (aheaVarA == null) {
                    obj.getClass();
                    T((ahdq) obj);
                } else if (!aheaVarA.l(ahaxVar, 7)) {
                    boolean zL = aheaVarA.l(ahaxVar, 3);
                    Object obj3 = agzyVar.a;
                    if (obj3 instanceof ahdt) {
                        thC = ((ahdt) obj3).c();
                    } else {
                        boolean z = ahbx.a;
                        ahbc ahbcVar2 = obj3 instanceof ahbc ? (ahbc) obj3 : null;
                        if (ahbcVar2 != null) {
                            thC = ahbcVar2.b;
                        }
                    }
                    ahaxVar.b(thC);
                    if (!zL) {
                        return ahec.a;
                    }
                    boolean z2 = ahbx.a;
                    return ahaxVar;
                }
            }
        }
        return ahaxVar;
    }

    @Override // defpackage.ahdl
    public void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ahdm(b(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.ahdl
    public final boolean t() {
        Object obj = this.d.a;
        return (obj instanceof ahdg) && ((ahdg) obj).fo();
    }

    public final String toString() {
        agzy agzyVar = this.d;
        return (fv() + "{" + j(agzyVar.a) + "}") + "@" + Integer.toHexString(System.identityHashCode(this));
    }

    @Override // defpackage.ahdl
    public final boolean v() {
        return !(this.d.a instanceof ahdg);
    }

    @Override // defpackage.ahdl
    public final void w(agux aguxVar) {
        G(true, new ahdj(aguxVar));
    }

    @Override // defpackage.ahdl
    public final void x() {
        int iD;
        do {
            iD = d(this.d.a);
            if (iD == 0) {
                return;
            }
        } while (iD != 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(ahdt ahdtVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable ahdmVar;
        boolean z = ahbx.a;
        Throwable th = null;
        ahbc ahbcVar = obj instanceof ahbc ? (ahbc) obj : null;
        Throwable th2 = ahbcVar != null ? ahbcVar.b : null;
        synchronized (ahdtVar) {
            ahdtVar.e();
            agzy agzyVar = ahdtVar.c;
            Object obj2 = agzyVar.a;
            if (obj2 == null) {
                arrayList = new ArrayList(4);
            } else if (obj2 instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj2);
                arrayList = arrayList2;
            } else {
                if (!(obj2 instanceof ArrayList)) {
                    Objects.toString(obj2);
                    throw new IllegalStateException("State is ".concat(obj2.toString()));
                }
                arrayList = (ArrayList) obj2;
            }
            Throwable thC = ahdtVar.c();
            if (thC != null) {
                arrayList.add(0, thC);
            }
            if (th2 != null && !agvy.c(th2, thC)) {
                arrayList.add(th2);
            }
            agzyVar.c(ahdw.e);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    ahdmVar = (Throwable) arrayList.get(0);
                    if (ahdmVar instanceof ahem) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            Throwable th4 = (Throwable) next2;
                            if (th4 != ahdmVar && (th4 instanceof ahem)) {
                                th = next2;
                                break;
                            }
                        }
                        th = th;
                        if (th == null) {
                            th = ahdmVar;
                        }
                    } else {
                        th = ahdmVar;
                    }
                } else {
                    th = th3;
                }
            } else if (ahdtVar.e()) {
                ahdmVar = new ahdm(b(), null, this);
                th = ahdmVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                boolean z2 = ahbx.b;
                Throwable thC2 = !z2 ? th : ahmf.c(th);
                for (Throwable thC3 : arrayList) {
                    if (z2) {
                        thC3 = ahmf.c(thC3);
                    }
                    if (thC3 != th && thC3 != thC2 && !(thC3 instanceof CancellationException) && setNewSetFromMap.add(thC3)) {
                        agox.a(th, thC3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new ahbc(th, false);
        }
        if (th != null && (U(th) || M(th))) {
            obj.getClass();
            ((ahbc) obj).c.c();
        }
        l(obj);
        this.d.d(ahdtVar, ahdw.a(obj));
        Q(ahdtVar, obj);
        return obj;
    }

    protected void J() {
    }

    protected void f(Object obj) {
    }

    public void fx(Throwable th) throws Throwable {
        throw th;
    }

    protected void l(Object obj) {
    }
}
