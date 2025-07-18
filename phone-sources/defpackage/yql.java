package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
@yfp
/* loaded from: classes3.dex */
public class yql implements yqe {
    private final ynu a;
    public final ynu d;

    public yql(boolean z) {
        ypo ypoVar = z ? yqm.g : yqm.f;
        ynv ynvVar = ynv.a;
        this.d = new ynu(ypoVar, ynvVar);
        this.a = new ynu(null, ynvVar);
    }

    public static final yok Q(yxf yxfVar) {
        while (yxfVar.eG()) {
            yxfVar = yxfVar.i();
        }
        while (true) {
            yxfVar = yxfVar.h();
            if (!yxfVar.eG()) {
                if (yxfVar instanceof yok) {
                    return (yok) yxfVar;
                }
                if (yxfVar instanceof yqq) {
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ CancellationException R(yql yqlVar, Throwable th) {
        return yqlVar.E(th, null);
    }

    private final void T(yqh yqhVar) {
        yqq yqqVar = new yqq();
        yqqVar.f.b(yqhVar);
        yqqVar.e.b(yqhVar);
        while (true) {
            if (yqhVar.f() != yqhVar) {
                break;
            } else if (yqhVar.e.d(yqhVar, yqqVar)) {
                yqqVar.k(yqhVar);
                break;
            }
        }
        this.d.d(yqhVar, yqhVar.h());
    }

    private final boolean U(Throwable th) {
        if (eS()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        yoj yojVarF = F();
        return (yojVarF == null || yojVarF == yqs.a) ? z : yojVarF.d(th) || z;
    }

    private static final String V(Object obj) {
        if (!(obj instanceof yqk)) {
            return obj instanceof yqa ? ((yqa) obj).eE() ? "Active" : "New" : obj instanceof yon ? "Cancelled" : "Completed";
        }
        yqk yqkVar = (yqk) obj;
        return yqkVar.g() ? "Cancelling" : yqkVar.h() ? "Completing" : "Active";
    }

    private final int e(Object obj) {
        if (obj instanceof ypo) {
            if (((ypo) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, yqm.g)) {
                return -1;
            }
            K();
            return 1;
        }
        if (!(obj instanceof ypz)) {
            return 0;
        }
        if (!this.d.d(obj, ((ypz) obj).a)) {
            return -1;
        }
        K();
        return 1;
    }

    private final Object f(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof yqa)) {
            return yqm.a;
        }
        Throwable th = null;
        if (((obj instanceof ypo) || (obj instanceof yqh)) && !(obj instanceof yok) && !(obj2 instanceof yon)) {
            yqa yqaVar = (yqa) obj;
            boolean z = yoy.a;
            if (!this.d.d(yqaVar, yqm.a(obj2))) {
                return yqm.c;
            }
            J(null);
            eO(obj2);
            l(yqaVar, obj2);
            return obj2;
        }
        yqa yqaVar2 = (yqa) obj;
        yqq yqqVarK = k(yqaVar2);
        if (yqqVarK == null) {
            return yqm.c;
        }
        yqk yqkVar = yqaVar2 instanceof yqk ? (yqk) yqaVar2 : null;
        if (yqkVar == null) {
            yqkVar = new yqk(yqqVarK, null);
        }
        ylf ylfVar = new ylf();
        synchronized (yqkVar) {
            if (yqkVar.h()) {
                return yqm.a;
            }
            yqkVar.b.c();
            if (yqkVar != yqaVar2 && !this.d.d(yqaVar2, yqkVar)) {
                return yqm.c;
            }
            boolean z2 = yoy.a;
            boolean zG = yqkVar.g();
            yon yonVar = obj2 instanceof yon ? (yon) obj2 : null;
            if (yonVar != null) {
                yqkVar.e(yonVar.b);
            }
            Throwable thD = yqkVar.d();
            boolean z3 = !zG;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = thD;
            }
            ylfVar.a = th;
            Throwable th2 = (Throwable) ylfVar.a;
            if (th2 != null) {
                n(yqqVarK, th2);
            }
            yok yokVarQ = Q(yqqVarK);
            if (yokVarQ != null && P(yqkVar, yokVarQ, obj2)) {
                return yqm.b;
            }
            yqqVarK.j(2);
            yok yokVarQ2 = Q(yqqVarK);
            return (yokVarQ2 == null || !P(yqkVar, yokVarQ2, obj2)) ? A(yqkVar, obj2) : yqm.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    private final Throwable i(Object obj) {
        CancellationException cancellationExceptionD;
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th != null ? th : new yqf(g(), null, this);
        }
        yql yqlVar = (yql) obj;
        Object objEQ = yqlVar.eQ();
        if (objEQ instanceof yqk) {
            cancellationExceptionD = ((yqk) objEQ).d();
        } else if (objEQ instanceof yon) {
            cancellationExceptionD = ((yon) objEQ).b;
        } else {
            if (objEQ instanceof yqa) {
                Objects.toString(objEQ);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objEQ)));
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new yqf("Parent job is ".concat(V(objEQ)), cancellationExceptionD, yqlVar) : cancellationException;
    }

    private final yqq k(yqa yqaVar) {
        yqq yqqVarEC = yqaVar.eC();
        if (yqqVarEC != null) {
            return yqqVarEC;
        }
        if (yqaVar instanceof ypo) {
            return new yqq();
        }
        if (yqaVar instanceof yqh) {
            T((yqh) yqaVar);
            return null;
        }
        Objects.toString(yqaVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(yqaVar)));
    }

    private final void l(yqa yqaVar, Object obj) throws Throwable {
        yoj yojVarF = F();
        if (yojVarF != null) {
            yojVarF.eD();
            L(yqs.a);
        }
        yoo yooVar = null;
        yon yonVar = obj instanceof yon ? (yon) obj : null;
        Throwable th = yonVar != null ? yonVar.b : null;
        if (yqaVar instanceof yqh) {
            try {
                ((yqh) yqaVar).a(th);
                return;
            } catch (Throwable th2) {
                eN(new yoo(a.ck(this, yqaVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        yqq yqqVarEC = yqaVar.eC();
        if (yqqVarEC != null) {
            yqqVarEC.j(1);
            Object objF = yqqVarEC.f();
            objF.getClass();
            for (yxf yxfVarH = (yxf) objF; !yks.e(yxfVarH, yqqVarEC); yxfVarH = yxfVarH.h()) {
                if (yxfVarH instanceof yqh) {
                    try {
                        ((yqh) yxfVarH).a(th);
                    } catch (Throwable th3) {
                        if (yooVar != null) {
                            ybn.h(yooVar, th3);
                        } else {
                            yooVar = new yoo(a.ck(this, yxfVarH, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (yooVar != null) {
                eN(yooVar);
            }
        }
    }

    private final void n(yqq yqqVar, Throwable th) throws Throwable {
        J(th);
        yqqVar.j(4);
        Object objF = yqqVar.f();
        objF.getClass();
        yoo yooVar = null;
        for (yxf yxfVarH = (yxf) objF; !yks.e(yxfVarH, yqqVar); yxfVarH = yxfVarH.h()) {
            if (yxfVarH instanceof yqh) {
                yqh yqhVar = (yqh) yxfVarH;
                if (yqhVar.b()) {
                    try {
                        yqhVar.a(th);
                    } catch (Throwable th2) {
                        if (yooVar != null) {
                            ybn.h(yooVar, th2);
                        } else {
                            yooVar = new yoo(a.ck(this, yxfVarH, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (yooVar != null) {
            eN(yooVar);
        }
        U(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ypz] */
    private final void o(ypo ypoVar) {
        yqq yqqVar = new yqq();
        if (!ypoVar.a) {
            yqqVar = new ypz(yqqVar);
        }
        this.d.d(ypoVar, yqqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object A(yqk yqkVar, Object obj) throws Throwable {
        boolean zG;
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable yqfVar;
        boolean z = yoy.a;
        Throwable th = null;
        yon yonVar = obj instanceof yon ? (yon) obj : null;
        Throwable th2 = yonVar != null ? yonVar.b : null;
        synchronized (yqkVar) {
            zG = yqkVar.g();
            Object objC = yqkVar.c();
            if (objC == null) {
                arrayList = new ArrayList(4);
            } else if (objC instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(objC.toString()));
                }
                arrayList = (ArrayList) objC;
            }
            Throwable thD = yqkVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !yks.e(th2, thD)) {
                arrayList.add(th2);
            }
            yqkVar.f(yqm.e);
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
                    yqfVar = (Throwable) arrayList.get(0);
                    if (yqfVar instanceof yrc) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            Throwable th4 = (Throwable) next2;
                            if (th4 != yqfVar && (th4 instanceof yrc)) {
                                th = next2;
                                break;
                            }
                        }
                        th = th;
                        if (th == null) {
                            th = yqfVar;
                        }
                    } else {
                        th = yqfVar;
                    }
                } else {
                    th = th3;
                }
            } else if (yqkVar.g()) {
                yqfVar = new yqf(g(), null, this);
                th = yqfVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                boolean z2 = yoy.b;
                Throwable thC = !z2 ? th : yxn.c(th);
                for (Throwable thC2 : arrayList) {
                    if (z2) {
                        thC2 = yxn.c(thC2);
                    }
                    if (thC2 != th && thC2 != thC && !(thC2 instanceof CancellationException) && setNewSetFromMap.add(thC2)) {
                        ybn.h(th, thC2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new yon(th);
        }
        if (th != null && (U(th) || O(th))) {
            obj.getClass();
            ((yon) obj).a();
        }
        if (!zG) {
            J(th);
        }
        eO(obj);
        this.d.d(yqkVar, yqm.a(obj));
        l(yqkVar, obj);
        return obj;
    }

    public final Object D(Object obj) throws Throwable {
        Object objF;
        do {
            objF = f(eQ(), obj);
            if (objF == yqm.a) {
                String strCk = a.ck(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                yon yonVar = obj instanceof yon ? (yon) obj : null;
                throw new IllegalStateException(strCk, yonVar != null ? yonVar.b : null);
            }
        } while (objF == yqm.c);
        return objF;
    }

    protected final CancellationException E(Throwable th, String str) {
        CancellationException yqfVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (yqfVar == null) {
            if (str == null) {
                str = g();
            }
            yqfVar = new yqf(str, th, this);
        }
        return yqfVar;
    }

    public final yoj F() {
        return (yoj) this.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        return defpackage.yqs.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ypm G(boolean r5, defpackage.yqh r6) {
        /*
            r4 = this;
            r6.d = r4
        L2:
            java.lang.Object r0 = r4.eQ()
            boolean r1 = r0 instanceof defpackage.ypo
            if (r1 == 0) goto L1e
            r1 = r0
            ypo r1 = (defpackage.ypo) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L1a
            ynu r1 = r4.d
            boolean r0 = r1.d(r0, r6)
            if (r0 == 0) goto L2
            goto L5e
        L1a:
            r4.o(r1)
            goto L2
        L1e:
            boolean r1 = r0 instanceof defpackage.yqa
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            yqa r1 = (defpackage.yqa) r1
            yqq r3 = r1.eC()
            if (r3 != 0) goto L35
            r0.getClass()
            yqh r0 = (defpackage.yqh) r0
            r4.T(r0)
            goto L2
        L35:
            boolean r0 = r6.b()
            if (r0 == 0) goto L57
            boolean r0 = r1 instanceof defpackage.yqk
            if (r0 == 0) goto L42
            yqk r1 = (defpackage.yqk) r1
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L49
            java.lang.Throwable r2 = r1.d()
        L49:
            if (r2 != 0) goto L51
            r0 = 5
            boolean r0 = r3.l(r6, r0)
            goto L5c
        L51:
            if (r5 == 0) goto L74
            r6.a(r2)
            goto L74
        L57:
            r0 = 1
            boolean r0 = r3.l(r6, r0)
        L5c:
            if (r0 == 0) goto L2
        L5e:
            return r6
        L5f:
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.eQ()
            boolean r0 = r5 instanceof defpackage.yon
            if (r0 == 0) goto L6c
            yon r5 = (defpackage.yon) r5
            goto L6d
        L6c:
            r5 = r2
        L6d:
            if (r5 == 0) goto L71
            java.lang.Throwable r2 = r5.b
        L71:
            r6.a(r2)
        L74:
            yqs r5 = defpackage.yqs.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yql.G(boolean, yqh):ypm");
    }

    public void H(Throwable th) {
        M(th);
    }

    protected final void I(yqe yqeVar) {
        boolean z = yoy.a;
        if (yqeVar == null) {
            L(yqs.a);
            return;
        }
        yqeVar.y();
        yoj yojVarX = yqeVar.x(this);
        L(yojVarX);
        if (w()) {
            yojVarX.eD();
            L(yqs.a);
        }
    }

    public final void L(yoj yojVar) {
        this.a.c(yojVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yql.M(java.lang.Object):boolean");
    }

    public boolean N(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return M(th) && eH();
    }

    protected boolean O(Throwable th) {
        return false;
    }

    public final boolean P(yqk yqkVar, yok yokVar, Object obj) {
        while (yoz.v(yokVar.a, false, new yqj(this, yqkVar, yokVar, obj)) == yqs.a) {
            yokVar = Q(yokVar);
            if (yokVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void S(Object obj) {
        Object objF;
        do {
            objF = f(eQ(), obj);
            if (objF == yqm.a || objF == yqm.b) {
                return;
            }
        } while (objF == yqm.c);
        eR(objF);
    }

    public boolean eB() {
        return false;
    }

    public boolean eH() {
        return true;
    }

    public final Object eP() throws Throwable {
        Object objEQ = eQ();
        if (objEQ instanceof yqa) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objEQ instanceof yon) {
            throw ((yon) objEQ).b;
        }
        return yqm.b(objEQ);
    }

    public final Object eQ() {
        return this.d.a;
    }

    protected boolean eS() {
        return false;
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    protected String g() {
        return "Job was cancelled";
    }

    @Override // defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        return (E) wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final yik<?> getKey() {
        return yqe.c;
    }

    public String h() {
        return yoz.a(this);
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return wcq.V(this, yikVar);
    }

    @Override // defpackage.yqe
    public final Object p(yih yihVar) {
        Object objEQ;
        do {
            objEQ = eQ();
            if (!(objEQ instanceof yqa)) {
                yoz.z(yihVar.getContext());
                return ygi.a;
            }
        } while (e(objEQ) < 0);
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        yks.p(yofVar, yoz.E(this, new yqv(yofVar)));
        Object objI = yofVar.i();
        yio yioVar = yio.a;
        if (objI == yioVar) {
            yihVar.getClass();
        }
        if (objI != yioVar) {
            objI = ygi.a;
        }
        return objI == yioVar ? objI : ygi.a;
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }

    @Override // defpackage.yqe
    public final CancellationException q() {
        Object objEQ = eQ();
        if (!(objEQ instanceof yqk)) {
            if (!(objEQ instanceof yqa)) {
                return objEQ instanceof yon ? R(this, ((yon) objEQ).b) : new yqf(String.valueOf(yoz.a(this)).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thD = ((yqk) objEQ).d();
        if (thD != null) {
            return E(thD, String.valueOf(yoz.a(this)).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.yqe
    public final ypm r(yjv yjvVar) {
        return G(true, new yqd(yjvVar));
    }

    @Override // defpackage.yqe
    public final ypm s(boolean z, boolean z2, yjv yjvVar) {
        return G(z2, z ? new yqc(yjvVar) : new yqd(yjvVar));
    }

    @Override // defpackage.yqe
    public void t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new yqf(g(), null, this);
        }
        H(cancellationException);
    }

    public final String toString() {
        return (h() + "{" + V(eQ()) + "}") + "@" + yoz.b(this);
    }

    @Override // defpackage.yqe
    public final boolean u() {
        Object objEQ = eQ();
        return (objEQ instanceof yqa) && ((yqa) objEQ).eE();
    }

    @Override // defpackage.yqe
    public final boolean v() {
        Object objEQ = eQ();
        if (objEQ instanceof yon) {
            return true;
        }
        return (objEQ instanceof yqk) && ((yqk) objEQ).g();
    }

    @Override // defpackage.yqe
    public final boolean w() {
        return !(eQ() instanceof yqa);
    }

    @Override // defpackage.yqe
    public final yoj x(yql yqlVar) {
        yok yokVar = new yok(yqlVar);
        yokVar.d = this;
        while (true) {
            Object objEQ = eQ();
            if (objEQ instanceof ypo) {
                ypo ypoVar = (ypo) objEQ;
                if (!ypoVar.a) {
                    o(ypoVar);
                } else if (this.d.d(objEQ, yokVar)) {
                    break;
                }
            } else {
                if (!(objEQ instanceof yqa)) {
                    Object objEQ2 = eQ();
                    yon yonVar = objEQ2 instanceof yon ? (yon) objEQ2 : null;
                    yokVar.a(yonVar != null ? yonVar.b : null);
                    return yqs.a;
                }
                yqq yqqVarEC = ((yqa) objEQ).eC();
                if (yqqVarEC == null) {
                    objEQ.getClass();
                    T((yqh) objEQ);
                } else if (!yqqVarEC.l(yokVar, 7)) {
                    boolean zL = yqqVarEC.l(yokVar, 3);
                    Object objEQ3 = eQ();
                    if (objEQ3 instanceof yqk) {
                        thD = ((yqk) objEQ3).d();
                    } else {
                        boolean z = yoy.a;
                        yon yonVar2 = objEQ3 instanceof yon ? (yon) objEQ3 : null;
                        if (yonVar2 != null) {
                            thD = yonVar2.b;
                        }
                    }
                    yokVar.a(thD);
                    if (!zL) {
                        return yqs.a;
                    }
                    boolean z2 = yoy.a;
                    return yokVar;
                }
            }
        }
        return yokVar;
    }

    @Override // defpackage.yqe
    public final void y() {
        int iE;
        do {
            iE = e(eQ());
            if (iE == 0) {
                return;
            }
        } while (iE != 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(yih yihVar) throws Throwable {
        Object objEQ;
        do {
            objEQ = eQ();
            if (!(objEQ instanceof yqa)) {
                if (!(objEQ instanceof yon)) {
                    return yqm.b(objEQ);
                }
                Throwable th = ((yon) objEQ).b;
                if (yoy.b && (yihVar instanceof yiw)) {
                    throw yxn.a(th, yihVar);
                }
                throw th;
            }
        } while (e(objEQ) < 0);
        yqi yqiVar = new yqi(wcq.S(yihVar), this);
        yqiVar.v();
        yks.p(yqiVar, yoz.E(this, new yqu(yqiVar)));
        Object objI = yqiVar.i();
        if (objI == yio.a) {
            yihVar.getClass();
        }
        return objI;
    }

    protected void K() {
    }

    protected void J(Throwable th) {
    }

    public void eN(Throwable th) throws Throwable {
        throw th;
    }

    protected void eO(Object obj) {
    }

    protected void eR(Object obj) {
    }
}
