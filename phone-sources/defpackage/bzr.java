package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzr {
    private static final jz a;

    static {
        int i = ka.a;
        a = new jz((byte[]) null);
    }

    public static final int a(bkn bknVar) {
        int i = true == (bknVar instanceof bve) ? 3 : 1;
        if (bknVar instanceof blt) {
            i |= 4;
        }
        if (bknVar instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if (bknVar instanceof btf) {
            i |= 16;
        }
        if ((bknVar instanceof bxf) || (bknVar instanceof bxi)) {
            i |= 32;
        }
        if (bknVar instanceof bma) {
            i |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if (bknVar instanceof bme) {
            i |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (bknVar instanceof bwa) {
            i |= 256;
        }
        if (bknVar instanceof bwg) {
            i |= 64;
        }
        if ((bknVar instanceof bwc) || (bknVar instanceof bwd)) {
            i |= 128;
        }
        return bknVar instanceof cef ? 524288 | i : i;
    }

    public static final int b(bko bkoVar) {
        int i = bkoVar.r;
        if (i != 0) {
            return i;
        }
        jz jzVar = a;
        Class<?> cls = bkoVar.getClass();
        int iA = jzVar.a(cls);
        if (iA >= 0) {
            return jzVar.c[iA];
        }
        int i2 = true == (bkoVar instanceof byl) ? 3 : 1;
        if (bkoVar instanceof byc) {
            i2 |= 4;
        }
        if (bkoVar instanceof cae) {
            i2 |= 8;
        }
        if (bkoVar instanceof cad) {
            i2 |= 16;
        }
        if (bkoVar instanceof bxh) {
            i2 |= 32;
        }
        if (bkoVar instanceof cac) {
            i2 |= 64;
        }
        if (bkoVar instanceof byk) {
            i2 |= 128;
        }
        if (bkoVar instanceof byd) {
            i2 |= 256;
        }
        if (bkoVar instanceof buf) {
            i2 |= 512;
        }
        if (bkoVar instanceof bmr) {
            i2 |= 1024;
        }
        if (bkoVar instanceof bmk) {
            i2 |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (bkoVar instanceof bmb) {
            i2 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if (bkoVar instanceof bry) {
            i2 |= 8192;
        }
        if (bkoVar instanceof btw) {
            i2 |= 16384;
        }
        if (bkoVar instanceof bxu) {
            i2 |= 32768;
        }
        if (bkoVar instanceof bsa) {
            i2 |= 131072;
        }
        if (bkoVar instanceof cak) {
            i2 |= 262144;
        }
        if (bkoVar instanceof cef) {
            i2 |= 524288;
        }
        if (bkoVar instanceof bzv) {
            i2 |= 1048576;
        }
        if (bkoVar instanceof bru) {
            i2 |= 2097152;
        }
        jzVar.g(cls, i2);
        return i2;
    }

    public static final int c(bko bkoVar) {
        if (!(bkoVar instanceof bxw)) {
            return b(bkoVar);
        }
        bxw bxwVar = (bxw) bkoVar;
        int iC = bxwVar.B;
        for (bko bkoVar2 = bxwVar.C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
            iC |= c(bkoVar2);
        }
        return iC;
    }

    public static final void d(bko bkoVar) {
        if (!bkoVar.A) {
            bty.c("autoInvalidateInsertedNode called on unattached node");
        }
        e(bkoVar, -1, 1);
    }

    public static final void e(bko bkoVar, int i, int i2) {
        if (!(bkoVar instanceof bxw)) {
            i(bkoVar, i & bkoVar.r, i2);
            return;
        }
        bxw bxwVar = (bxw) bkoVar;
        int i3 = bxwVar.B;
        i(bkoVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (bko bkoVar2 = bxwVar.C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
            e(bkoVar2, i4, i2);
        }
    }

    public static final void f(bko bkoVar) {
        if (!bkoVar.A) {
            bty.c("autoInvalidateRemovedNode called on unattached node");
        }
        e(bkoVar, -1, 2);
    }

    public static final void g(bko bkoVar) {
        if (!bkoVar.A) {
            bty.c("autoInvalidateUpdatedNode called on unattached node");
        }
        e(bkoVar, -1, 0);
    }

    public static final boolean h(int i) {
        return (i & 128) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void i(bko bkoVar, int i, int i2) {
        if (i2 != 0 || bkoVar.ce()) {
            if ((i & 2) != 0 && (bkoVar instanceof byl)) {
                cbp.Y((byl) bkoVar);
                if (i2 == 2) {
                    fh.J(bkoVar, 2).ak();
                }
            }
            if ((i & 128) != 0 && (bkoVar instanceof byk) && i2 != 2) {
                fh.I(bkoVar).G();
            }
            if ((i & 256) != 0 && (bkoVar instanceof byd) && i2 != 2) {
                bys bysVarI = fh.I(bkoVar);
                if (!bysVarI.ab() && !bysVarI.ae() && !bysVarI.y) {
                    byv.a(bysVarI).y(bysVarI);
                }
            }
            if ((i & 4) != 0 && (bkoVar instanceof byc)) {
                fh.D((byc) bkoVar);
            }
            if ((i & 8) != 0 && (bkoVar instanceof cae)) {
                fh.I(bkoVar).m = true;
            }
            if ((i & 64) != 0 && (bkoVar instanceof cac)) {
                byw bywVar = fh.I((cac) bkoVar).u;
                bywVar.o.q = true;
                bzd bzdVar = bywVar.p;
                if (bzdVar != null) {
                    bzdVar.t = true;
                }
            }
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 && (bkoVar instanceof bmk)) {
                bmk bmkVar = (bmk) bkoVar;
                bxr.b = null;
                bmkVar.l(bxr.a);
                if (bxr.b != null) {
                    if (!bmkVar.E().A) {
                        bty.c("visitChildren called on an unattached node");
                    }
                    bfz bfzVar = new bfz(new bko[16], 0);
                    bko bkoVar2 = bmkVar.E().u;
                    if (bkoVar2 == null) {
                        fh.O(bfzVar, bmkVar.E());
                    } else {
                        bfzVar.o(bkoVar2);
                    }
                    while (true) {
                        int i3 = bfzVar.b;
                        if (i3 == 0) {
                            break;
                        }
                        bko bkoVarF = (bko) bfzVar.d(i3 - 1);
                        if ((bkoVarF.s & 1024) == 0) {
                            fh.O(bfzVar, bkoVarF);
                        } else {
                            while (true) {
                                if (bkoVarF == null) {
                                    break;
                                }
                                if ((bkoVarF.r & 1024) != 0) {
                                    bfz bfzVar2 = null;
                                    while (bkoVarF != null) {
                                        if (bkoVarF instanceof bmr) {
                                            bmr bmrVar = (bmr) bkoVarF;
                                            bmd bmdVar = ((cbc) fh.K(bmrVar)).K.c;
                                            if (((kk) bmdVar.d).j(bmrVar)) {
                                                bmdVar.a();
                                            }
                                        } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                            int i4 = 0;
                                            for (bko bkoVar3 = ((bxw) bkoVarF).C; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                                                if ((bkoVar3.r & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        bkoVarF = bkoVar3;
                                                    } else {
                                                        if (bfzVar2 == null) {
                                                            bfzVar2 = new bfz(new bko[16], 0);
                                                        }
                                                        if (bkoVarF != null) {
                                                            bfzVar2.o(bkoVarF);
                                                        }
                                                        bfzVar2.o(bkoVar3);
                                                        bkoVarF = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        bkoVarF = fh.F(bfzVar2);
                                    }
                                } else {
                                    bkoVarF = bkoVarF.u;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 || !(bkoVar instanceof bmb)) {
                return;
            }
            bmb bmbVar = (bmb) bkoVar;
            bmd bmdVar2 = ((cbc) fh.K(bmbVar)).K.c;
            if (((kk) bmdVar2.e).j(bmbVar)) {
                bmdVar2.a();
            }
        }
    }
}
