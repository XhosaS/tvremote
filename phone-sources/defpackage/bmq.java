package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmq extends ykt implements yjk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmq(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [can] */
    /* JADX WARN: Type inference failed for: r0v44, types: [dve] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v47, types: [bvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.view.View$OnAttachStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bfz] */
    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        Object obj;
        bys bysVar;
        bmy bmyVar;
        switch (this.c) {
            case 0:
                ((ylf) this.a).a = ((bmr) this.b).b();
                return ygi.a;
            case 1:
                ((blq) this.b).a.a(this.a);
                return ygi.a;
            case 2:
                ((bsm) this.a).c((bko) this.b);
                return ygi.a;
            case 3:
                bzm bzmVar = ((bys) this.b).t;
                if ((bzmVar.a() & 8) != 0) {
                    for (bko bkoVar = bzmVar.e; bkoVar != null; bkoVar = bkoVar.t) {
                        if ((bkoVar.r & 8) != 0) {
                            bxw bxwVarF = bkoVar;
                            ?? bfzVar = 0;
                            while (bxwVarF != 0) {
                                if (bxwVarF instanceof cae) {
                                    Object obj2 = this.a;
                                    cae caeVar = (cae) bxwVarF;
                                    caeVar.B();
                                    if (caeVar.q()) {
                                        ((cfc) ((ylf) obj2).a).a = true;
                                    }
                                    caeVar.x((cfc) ((ylf) obj2).a);
                                } else if ((bxwVarF.r & 8) != 0 && (bxwVarF instanceof bxw)) {
                                    bko bkoVar2 = bxwVarF.C;
                                    int i = 0;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                    while (bkoVar2 != null) {
                                        if ((bkoVar2.r & 8) != 0) {
                                            i++;
                                            bfzVar = bfzVar;
                                            if (i == 1) {
                                                bxwVarF = bkoVar2;
                                            } else {
                                                if (bfzVar == 0) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bxwVarF != 0) {
                                                    bfzVar.o(bxwVarF);
                                                }
                                                bfzVar.o(bkoVar2);
                                                bxwVarF = 0;
                                            }
                                        }
                                        bkoVar2 = bkoVar2.u;
                                        bxwVarF = bxwVarF;
                                        bfzVar = bfzVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bxwVarF = fh.F(bfzVar);
                            }
                        }
                    }
                }
                return ygi.a;
            case 4:
                bzd bzdVar = (bzd) this.a;
                bzdVar.f.g = 0;
                bfz bfzVarI = bzdVar.p().i();
                Object[] objArr = bfzVarI.a;
                int i2 = bfzVarI.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    bzd bzdVar2 = ((bys) objArr[i3]).u.p;
                    bzdVar2.getClass();
                    bzdVar2.h = bzdVar2.i;
                    bzdVar2.i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    if (bzdVar2.w == 2) {
                        bzdVar2.w = 3;
                    }
                }
                bzdVar.k(lo.r);
                bza bzaVar = ((byi) bzdVar.j()).g;
                if (bzaVar != null) {
                    boolean z = bzaVar.k;
                    List listT = bzdVar.p().t();
                    int size = listT.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        bza bzaVarB = ((bys) listT.get(i4)).o().B();
                        if (bzaVarB != null) {
                            bzaVarB.k = z;
                        }
                    }
                }
                ((bza) this.b).J().f();
                if (((byi) bzdVar.j()).g != null) {
                    List listT2 = bzdVar.p().t();
                    int size2 = listT2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        bza bzaVarB2 = ((bys) listT2.get(i5)).o().B();
                        if (bzaVarB2 != null) {
                            bzaVarB2.k = false;
                        }
                    }
                }
                bfz bfzVarI2 = bzdVar.p().i();
                Object[] objArr2 = bfzVarI2.a;
                int i6 = bfzVarI2.b;
                for (int i7 = 0; i7 < i6; i7++) {
                    bzd bzdVar3 = ((bys) objArr2[i7]).u.p;
                    bzdVar3.getClass();
                    int i8 = bzdVar3.h;
                    int i9 = bzdVar3.i;
                    if (i8 != i9 && i9 == Integer.MAX_VALUE) {
                        bzdVar3.s(true);
                    }
                }
                bzdVar.k(lo.s);
                return ygi.a;
            case 5:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) this.b));
            case 6:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.b));
            case 7:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) this.b));
            case 8:
                cdn cdnVar = (cdn) this.a;
                cfa cfaVar = cdnVar.d;
                cfa cfaVar2 = cdnVar.e;
                Float f = cdnVar.b;
                Float f2 = cdnVar.c;
                float fFloatValue = (cfaVar == null || f == null) ? 0.0f : ((Number) cfaVar.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (cfaVar2 == null || f2 == null) ? 0.0f : ((Number) cfaVar2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    Object obj3 = this.b;
                    cbi cbiVar = (cbi) obj3;
                    int iD = cbiVar.d(cdnVar.a);
                    dhk dhkVar = (dhk) cbiVar.g().a(cbiVar.i);
                    if (dhkVar != null) {
                        try {
                            cyq cyqVar = ((cbi) obj3).k;
                            if (cyqVar != null) {
                                cyqVar.q(((cbi) obj3).E(dhkVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    Object obj4 = this.b;
                    cbi cbiVar2 = (cbi) obj4;
                    dhk dhkVar2 = (dhk) cbiVar2.g().a(cbiVar2.j);
                    if (dhkVar2 != null) {
                        try {
                            cyq cyqVar2 = ((cbi) obj4).l;
                            if (cyqVar2 != null) {
                                cyqVar2.q(((cbi) obj4).E(dhkVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    cbi cbiVar3 = (cbi) this.b;
                    cbiVar3.b.invalidate();
                    dhk dhkVar3 = (dhk) cbiVar3.g().a(iD);
                    if (dhkVar3 != null && (obj = dhkVar3.b) != null && (bysVar = ((cff) obj).b) != null) {
                        if (cfaVar != null) {
                            cbiVar3.y.f(iD, cfaVar);
                        }
                        if (cfaVar2 != null) {
                            cbiVar3.z.f(iD, cfaVar2);
                        }
                        cbiVar3.k(bysVar);
                    }
                }
                if (cfaVar != null) {
                    ((cdn) this.a).b = (Float) cfaVar.a.a();
                }
                if (cfaVar2 != null) {
                    ((cdn) this.a).c = (Float) cfaVar2.a.a();
                }
                return ygi.a;
            case 9:
                ((can) this.b).removeOnAttachStateChangeListener(this.a);
                return ygi.a;
            case 10:
                ((dve) this.b).d(this.a);
                return ygi.a;
            default:
                ?? r0 = this.a;
                if (r0 != 0 && (bmyVar = (bmy) r0.a()) != null) {
                    return bmyVar;
                }
                ?? r02 = this.b;
                boolean zS = r02.s();
                bvc bvcVar = r02;
                if (true != zS) {
                    bvcVar = null;
                }
                if (bvcVar != null) {
                    return d.q(clw.y(bvcVar.h()));
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmq(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
