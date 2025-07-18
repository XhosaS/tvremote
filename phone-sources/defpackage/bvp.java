package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvp implements bak {
    public final bys a;
    public baw b;
    public bwz c;
    public int d;
    public int e;
    public final bvj f;
    public final bvg g;
    public final bfz h;
    public int i;
    public int j;
    public final String k;
    public final ki l;
    public final ki m;
    public final ki n;
    public final ki o;
    private final bwy p;

    public bvp(bys bysVar, bwz bwzVar) {
        this.a = bysVar;
        this.c = bwzVar;
        long[] jArr = kj.a;
        this.l = new ki((byte[]) null);
        this.m = new ki((byte[]) null);
        this.f = new bvj(this);
        this.g = new bvg(this);
        this.n = new ki((byte[]) null);
        this.p = new bwy(null);
        this.o = new ki((byte[]) null);
        this.h = new bfz(new Object[16], 0);
        this.k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bzw, bzz] */
    private final bzw m() {
        ?? A = byv.a(this.a);
        if (((cbc) A).isAttachedToWindow()) {
            return A;
        }
        return null;
    }

    private final Object n(List list, int i) {
        Object objA = this.l.a((bys) list.get(i));
        objA.getClass();
        return ((bvh) objA).a;
    }

    private static final void o(bvh bvhVar, bzw bzwVar) {
        bvhVar.b();
        bms bmsVar = new bms(bvhVar, 5);
        Handler handler = ((cbc) bzwVar).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new caw(bmsVar, 0));
    }

    private static final void p(bys bysVar) {
        bysVar.m().G = 3;
        bzd bzdVarL = bysVar.l();
        if (bzdVarL != null) {
            bzdVarL.w = 3;
        }
    }

    @Override // defpackage.bak
    public final void a() {
        j(true);
    }

    @Override // defpackage.bak
    public final void b() {
        g();
    }

    @Override // defpackage.bak
    public final void c() {
        j(false);
    }

    public final bwv d(Object obj, yjz yjzVar) {
        bys bysVar = this.a;
        if (bysVar.af()) {
            i();
            if (!ki.e(this.m, obj)) {
                this.o.g(obj);
                ki kiVar = this.n;
                Object objA = kiVar.a(obj);
                if (objA == null) {
                    objA = f(obj);
                    if (objA != null) {
                        k(bysVar.u().indexOf(objA), bysVar.u().size());
                        this.j++;
                    } else {
                        objA = e(bysVar.u().size());
                        this.j++;
                    }
                    kiVar.j(obj, objA);
                }
                l((bys) objA, obj, yjzVar);
            }
        }
        return !bysVar.af() ? new bvm() : new bvn(this, obj);
    }

    public final bys e(int i) {
        bys bysVar = new bys(true, 2, null);
        bys bysVar2 = this.a;
        bysVar2.l = true;
        bysVar2.D(i, bysVar);
        bysVar2.l = false;
        return bysVar;
    }

    public final bys f(Object obj) {
        int i;
        if (this.i == 0) {
            return null;
        }
        List listU = this.a.u();
        int size = listU.size() - this.j;
        int i2 = size - this.i;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (yks.e(n(listU, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object objA = this.l.a((bys) listU.get(i3));
                objA.getClass();
                bvh bvhVar = (bvh) objA;
                Object obj2 = bvhVar.a;
                if (obj2 == bwu.a || this.c.b(obj, obj2)) {
                    bvhVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            k(i4, i2);
        }
        this.i--;
        bys bysVar = (bys) listU.get(i2);
        Object objA2 = this.l.a(bysVar);
        objA2.getClass();
        bvh bvhVar2 = (bvh) objA2;
        bvhVar2.e = new bci(true, bcz.c);
        bvhVar2.d = true;
        bvhVar2.c = true;
        return bysVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r18 = this;
            r0 = r18
            bys r1 = r0.a
            r2 = 1
            r1.l = r2
            ki r2 = r0.l
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            r11 = r6
        L27:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L47
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            bvh r12 = (defpackage.bvh) r12
            baz r12 = r12.g
            if (r12 == 0) goto L47
            r12.d()
        L47:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L27
        L4b:
            if (r12 != r13) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r1.O()
            r1.l = r6
            r2.i()
            ki r1 = r0.m
            r1.i()
            r0.j = r6
            r0.i = r6
            ki r1 = r0.n
            r1.i()
            r0.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvp.g():void");
    }

    public final void h(int i) {
        this.i = 0;
        bys bysVar = this.a;
        List listU = bysVar.u();
        int size = (listU.size() - this.j) - 1;
        if (i <= size) {
            bwy bwyVar = this.p;
            bwyVar.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    bwyVar.add(n(listU, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(bwyVar);
            bzw bzwVarM = m();
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            boolean z = false;
            while (size >= i) {
                try {
                    bys bysVar2 = (bys) listU.get(size);
                    ki kiVar = this.l;
                    Object objA = kiVar.a(bysVar2);
                    objA.getClass();
                    bvh bvhVar = (bvh) objA;
                    Object obj = bvhVar.a;
                    if (bwyVar.contains(obj)) {
                        this.i++;
                        if (bvhVar.a()) {
                            p(bysVar2);
                            if (bzwVarM != null) {
                                o(bvhVar, bzwVarM);
                            } else {
                                bvhVar.b();
                                if (bvhVar.f) {
                                    z = true;
                                } else {
                                    baz bazVar = bvhVar.g;
                                    if (bazVar != null) {
                                        bazVar.k();
                                    }
                                }
                            }
                        }
                    } else {
                        bysVar.l = true;
                        kiVar.g(bysVar2);
                        baz bazVar2 = bvhVar.g;
                        if (bazVar2 != null) {
                            bazVar2.d();
                        }
                        bysVar.P(size, 1);
                        bysVar.l = false;
                    }
                    this.m.g(obj);
                    size--;
                } finally {
                    bcm.z(bitVarT, bitVarU, yjvVarI);
                }
            }
            if (z) {
                bcm.A();
            }
        }
        i();
    }

    public final void i() {
        int size = this.a.u().size();
        ki kiVar = this.l;
        if (kiVar.e != size) {
            bty.b("Inconsistency between the count of nodes tracked by the state (" + kiVar.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.i) - this.j < 0) {
            bty.b("Incorrect state. Total children " + size + ". Reusable children " + this.i + ". Precomposed children " + this.j);
        }
        ki kiVar2 = this.n;
        if (kiVar2.e == this.j) {
            return;
        }
        bty.b("Incorrect state. Precomposed children " + this.j + ". Map size " + kiVar2.e);
    }

    public final void j(boolean z) {
        baz bazVar;
        this.j = 0;
        this.n.i();
        List listU = this.a.u();
        int size = listU.size();
        if (this.i != size) {
            this.i = size;
            bzw bzwVarM = m();
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            for (int i = 0; i < size; i++) {
                try {
                    bys bysVar = (bys) listU.get(i);
                    bvh bvhVar = (bvh) this.l.a(bysVar);
                    if (bvhVar != null && bvhVar.a()) {
                        p(bysVar);
                        if (z) {
                            baz bazVar2 = bvhVar.g;
                            if (bazVar2 != null) {
                                bazVar2.k();
                            }
                            bvhVar.e = new bci(false, bcz.c);
                        } else if (bzwVarM != null) {
                            o(bvhVar, bzwVarM);
                        } else {
                            bvhVar.b();
                            if (!bvhVar.f && (bazVar = bvhVar.g) != null) {
                                bazVar.k();
                            }
                        }
                        bvhVar.a = bwu.a;
                    }
                } catch (Throwable th) {
                    bcm.z(bitVarT, bitVarU, yjvVarI);
                    throw th;
                }
            }
            bcm.z(bitVarT, bitVarU, yjvVarI);
            this.m.i();
        }
        i();
    }

    public final void k(int i, int i2) {
        bys bysVar = this.a;
        bysVar.l = true;
        bysVar.M(i, i2, 1);
        bysVar.l = false;
    }

    public final void l(bys bysVar, Object obj, yjz yjzVar) {
        boolean z;
        ki kiVar = this.l;
        Object objA = kiVar.a(bysVar);
        if (objA == null) {
            objA = new bvh(obj, bul.a);
            kiVar.j(bysVar, objA);
        }
        bvh bvhVar = (bvh) objA;
        yjz yjzVar2 = bvhVar.b;
        baz bazVar = bvhVar.g;
        if (bazVar != null) {
            synchronized (bazVar.b) {
                z = bazVar.l.e > 0;
            }
        } else {
            z = true;
        }
        if (yjzVar2 != yjzVar || z || bvhVar.c) {
            bvhVar.b = yjzVar;
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            try {
                bys bysVar2 = this.a;
                bysVar2.l = true;
                baz bazVar2 = bvhVar.g;
                baw bawVar = this.b;
                if (bawVar == null) {
                    bty.a("parent composition reference not set");
                    throw new yfs();
                }
                if (bazVar2 == null || bazVar2.i) {
                    ViewGroup.LayoutParams layoutParams = cee.a;
                    bazVar2 = new baz(bawVar, new cal(bysVar));
                }
                bvhVar.g = bazVar2;
                yjz bhqVar = bvhVar.b;
                if (m() != null) {
                    bvhVar.f = false;
                } else {
                    bvhVar.f = true;
                    bhqVar = new bhq(1524156494, true, new bvo(bvhVar, bhqVar, 0));
                }
                if (bvhVar.d) {
                    bas basVar = bazVar2.h;
                    basVar.l = 100;
                    basVar.k = true;
                    bazVar2.j(bhqVar);
                    if (basVar.o || basVar.l != 100) {
                        bcm.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    basVar.l = -1;
                    basVar.k = false;
                } else {
                    bazVar2.j(bhqVar);
                }
                bvhVar.d = false;
                bysVar2.l = false;
                bcm.z(bitVarT, bitVarU, yjvVarI);
                bvhVar.c = false;
            } catch (Throwable th) {
                bcm.z(bitVarT, bitVarU, yjvVarI);
                throw th;
            }
        }
    }
}
