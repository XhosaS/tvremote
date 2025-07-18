package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.focus.FocusRequesterElement;
import com.google.android.videos.R;
import defpackage.bko;
import defpackage.bmr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class d {
    public static final boolean A(bmr bmrVar, int i, yjv yjvVar) {
        bmy bmyVar;
        bfz bfzVar = new bfz(new bmr[16], 0);
        ae(bmrVar, bfzVar);
        int i2 = bfzVar.b;
        if (i2 <= 1) {
            bmr bmrVar2 = (bmr) (i2 == 0 ? null : bfzVar.a[0]);
            if (bmrVar2 != null) {
                return ((Boolean) yjvVar.a(bmrVar2)).booleanValue();
            }
        } else {
            if (true == a.r(i, 7)) {
                i = 4;
            }
            if (a.r(i, 4) || a.r(i, 6)) {
                bmy bmyVarI = I(bmrVar);
                float f = bmyVarI.b;
                float f2 = bmyVarI.c;
                bmyVar = new bmy(f, f2, f, f2);
            } else {
                if (!a.r(i, 3) && !a.r(i, 5)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bmy bmyVarI2 = I(bmrVar);
                float f3 = bmyVarI2.d;
                float f4 = bmyVarI2.e;
                bmyVar = new bmy(f3, f4, f3, f4);
            }
            bmr bmrVarAd = ad(bfzVar, bmyVar, i);
            if (bmrVarAd != null) {
                return ((Boolean) yjvVar.a(bmrVarAd)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean B(bmy bmyVar, bmy bmyVar2, bmy bmyVar3, int i) {
        if (!ai(bmyVar, i, bmyVar3)) {
            return false;
        }
        if (ai(bmyVar2, i, bmyVar3) && !af(bmyVar3, bmyVar, bmyVar2, i)) {
            return !af(bmyVar3, bmyVar2, bmyVar, i) && ac(i, bmyVar3, bmyVar) < ac(i, bmyVar3, bmyVar2);
        }
        return true;
    }

    public static final boolean C(bmr bmrVar, bmy bmyVar, int i, yjv yjvVar) {
        bmr bmrVarAd;
        bfz bfzVar = new bfz(new bmr[16], 0);
        if (!bmrVar.q.A) {
            bty.c("visitChildren called on an unattached node");
        }
        bfz bfzVar2 = new bfz(new bko[16], 0);
        bko bkoVar = bmrVar.q;
        bko bkoVar2 = bkoVar.u;
        if (bkoVar2 == null) {
            fh.O(bfzVar2, bkoVar);
        } else {
            bfzVar2.o(bkoVar2);
        }
        while (true) {
            int i2 = bfzVar2.b;
            if (i2 == 0) {
                break;
            }
            bko bkoVarF = (bko) bfzVar2.d(i2 - 1);
            if ((bkoVarF.s & 1024) == 0) {
                fh.O(bfzVar2, bkoVarF);
            } else {
                while (true) {
                    if (bkoVarF == null) {
                        break;
                    }
                    if ((bkoVarF.r & 1024) != 0) {
                        bfz bfzVar3 = null;
                        while (bkoVarF != null) {
                            if (bkoVarF instanceof bmr) {
                                bmr bmrVar2 = (bmr) bkoVarF;
                                if (bmrVar2.A) {
                                    bfzVar.o(bmrVar2);
                                }
                            } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                int i3 = 0;
                                for (bko bkoVar3 = ((bxw) bkoVarF).C; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                                    if ((bkoVar3.r & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            bkoVarF = bkoVar3;
                                        } else {
                                            if (bfzVar3 == null) {
                                                bfzVar3 = new bfz(new bko[16], 0);
                                            }
                                            if (bkoVarF != null) {
                                                bfzVar3.o(bkoVarF);
                                            }
                                            bfzVar3.o(bkoVar3);
                                            bkoVarF = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            bkoVarF = fh.F(bfzVar3);
                        }
                    } else {
                        bkoVarF = bkoVarF.u;
                    }
                }
            }
        }
        while (bfzVar.b != 0 && (bmrVarAd = ad(bfzVar, bmyVar, i)) != null) {
            if (((bmj) bmrVarAd.b()).a) {
                return ((Boolean) yjvVar.a(bmrVarAd)).booleanValue();
            }
            if (ah(bmrVarAd, bmyVar, i, yjvVar)) {
                return true;
            }
            bfzVar.n(bmrVarAd);
        }
        return false;
    }

    public static final boolean D(bmr bmrVar, yjv yjvVar) {
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                bmr bmrVarH = H(bmrVar);
                if (bmrVarH == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = bmrVarH.e().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (D(bmrVarH, yjvVar) || ak(bmrVar, bmrVarH, 2, yjvVar)) {
                            return true;
                        }
                        return ((bmj) bmrVarH.b()).a && ((Boolean) yjvVar.a(bmrVarH)).booleanValue();
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new yfu();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return ak(bmrVar, bmrVarH, 2, yjvVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new yfu();
                }
                if (al(bmrVar, yjvVar)) {
                    return true;
                }
                return ((bmj) bmrVar.b()).a && ((Boolean) yjvVar.a(bmrVar)).booleanValue();
            }
        }
        return al(bmrVar, yjvVar);
    }

    public static final boolean E(bmr bmrVar, yjv yjvVar) {
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                bmr bmrVarH = H(bmrVar);
                if (bmrVarH != null) {
                    return E(bmrVarH, yjvVar) || ak(bmrVar, bmrVarH, 1, yjvVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ((bmj) bmrVar.b()).a ? ((Boolean) yjvVar.a(bmrVar)).booleanValue() : am(bmrVar, yjvVar);
                }
                throw new yfu();
            }
        }
        return am(bmrVar, yjvVar);
    }

    public static final boolean F(bmr bmrVar, bmr bmrVar2, int i, yjv yjvVar) {
        bko bkoVar;
        bzm bzmVar;
        if (bmrVar.e() != bmp.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        bfz bfzVar = new bfz(new bmr[16], 0);
        if (!bmrVar.q.A) {
            bty.c("visitChildren called on an unattached node");
        }
        bfz bfzVar2 = new bfz(new bko[16], 0);
        bko bkoVar2 = bmrVar.q;
        bko bkoVar3 = bkoVar2.u;
        if (bkoVar3 == null) {
            fh.O(bfzVar2, bkoVar2);
        } else {
            bfzVar2.o(bkoVar3);
        }
        while (true) {
            int i2 = bfzVar2.b;
            bkoVar = null;
            if (i2 == 0) {
                break;
            }
            bko bkoVarF = (bko) bfzVar2.d(i2 - 1);
            if ((bkoVarF.s & 1024) == 0) {
                fh.O(bfzVar2, bkoVarF);
            } else {
                while (true) {
                    if (bkoVarF == null) {
                        break;
                    }
                    if ((bkoVarF.r & 1024) != 0) {
                        bfz bfzVar3 = null;
                        while (bkoVarF != null) {
                            if (bkoVarF instanceof bmr) {
                                bfzVar.o((bmr) bkoVarF);
                            } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                int i3 = 0;
                                for (bko bkoVar4 = ((bxw) bkoVarF).C; bkoVar4 != null; bkoVar4 = bkoVar4.u) {
                                    if ((bkoVar4.r & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            bkoVarF = bkoVar4;
                                        } else {
                                            if (bfzVar3 == null) {
                                                bfzVar3 = new bfz(new bko[16], 0);
                                            }
                                            if (bkoVarF != null) {
                                                bfzVar3.o(bkoVarF);
                                            }
                                            bfzVar3.o(bkoVar4);
                                            bkoVarF = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            bkoVarF = fh.F(bfzVar3);
                        }
                    } else {
                        bkoVarF = bkoVarF.u;
                    }
                }
            }
        }
        bfzVar.k(bxy.a);
        if (a.r(i, 1)) {
            ymd ymdVarR = ykn.r(0, bfzVar.b);
            int i4 = ymdVarR.a;
            int i5 = ymdVarR.b;
            if (i4 <= i5) {
                boolean zE = false;
                while (true) {
                    if (zE) {
                        bmr bmrVar3 = (bmr) bfzVar.a[i4];
                        if (J(bmrVar3) && E(bmrVar3, yjvVar)) {
                            return true;
                        }
                    }
                    zE |= yks.e(bfzVar.a[i4], bmrVar2);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!a.r(i, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            ymd ymdVarR2 = ykn.r(0, bfzVar.b);
            int i6 = ymdVarR2.a;
            int i7 = ymdVarR2.b;
            if (i6 <= i7) {
                boolean zE2 = false;
                while (true) {
                    if (zE2) {
                        bmr bmrVar4 = (bmr) bfzVar.a[i7];
                        if (J(bmrVar4) && D(bmrVar4, yjvVar)) {
                            return true;
                        }
                    }
                    zE2 |= yks.e(bfzVar.a[i7], bmrVar2);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        if (!a.r(i, 1) && ((bmj) bmrVar.b()).a) {
            if (!bmrVar.q.A) {
                bty.c("visitAncestors called on an unattached node");
            }
            bko bkoVar5 = bmrVar.q.t;
            bys bysVarI = fh.I(bmrVar);
            loop5: while (true) {
                if (bysVarI == null) {
                    break;
                }
                if ((bysVarI.t.f.s & 1024) != 0) {
                    while (bkoVar5 != null) {
                        if ((bkoVar5.r & 1024) != 0) {
                            bko bkoVarF2 = bkoVar5;
                            bfz bfzVar4 = null;
                            while (bkoVarF2 != null) {
                                if (bkoVarF2 instanceof bmr) {
                                    bkoVar = bkoVarF2;
                                    break loop5;
                                }
                                if ((bkoVarF2.r & 1024) != 0 && (bkoVarF2 instanceof bxw)) {
                                    int i8 = 0;
                                    for (bko bkoVar6 = ((bxw) bkoVarF2).C; bkoVar6 != null; bkoVar6 = bkoVar6.u) {
                                        if ((bkoVar6.r & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                bkoVarF2 = bkoVar6;
                                            } else {
                                                if (bfzVar4 == null) {
                                                    bfzVar4 = new bfz(new bko[16], 0);
                                                }
                                                if (bkoVarF2 != null) {
                                                    bfzVar4.o(bkoVarF2);
                                                }
                                                bfzVar4.o(bkoVar6);
                                                bkoVarF2 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                bkoVarF2 = fh.F(bfzVar4);
                            }
                        }
                        bkoVar5 = bkoVar5.t;
                    }
                }
                bysVarI = bysVarI.j();
                bkoVar5 = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
            }
            if (bkoVar != null) {
                return ((Boolean) yjvVar.a(bmrVar)).booleanValue();
            }
        }
        return false;
    }

    public static final bmr G(bmr bmrVar) {
        bmr bmrVar2 = ((cbc) fh.K(bmrVar)).K.e;
        if (bmrVar2 == null || !bmrVar2.A) {
            return null;
        }
        return bmrVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x001c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.bmr H(defpackage.bmr r9) {
        /*
            bko r9 = r9.q
            boolean r0 = r9.A
            r1 = 0
            if (r0 == 0) goto La1
            bfz r0 = new bfz
            r2 = 16
            bko[] r3 = new defpackage.bko[r2]
            r4 = 0
            r0.<init>(r3, r4)
            bko r3 = r9.u
            if (r3 != 0) goto L19
            defpackage.fh.O(r0, r9)
            goto L1c
        L19:
            r0.o(r3)
        L1c:
            int r9 = r0.b
            if (r9 == 0) goto La1
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.d(r9)
            bko r9 = (defpackage.bko) r9
            int r3 = r9.s
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L32
            defpackage.fh.O(r0, r9)
            goto L1c
        L32:
            if (r9 == 0) goto L1c
            int r3 = r9.r
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L9e
            r3 = r1
        L3b:
            if (r9 == 0) goto L1c
            boolean r5 = r9 instanceof defpackage.bmr
            r6 = 1
            if (r5 == 0) goto L64
            bmr r9 = (defpackage.bmr) r9
            bko r5 = r9.q
            boolean r5 = r5.A
            if (r5 == 0) goto L99
            bmp r5 = r9.e()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L63
            if (r5 == r6) goto L63
            r6 = 2
            if (r5 == r6) goto L63
            r9 = 3
            if (r5 != r9) goto L5d
            goto L99
        L5d:
            yfu r9 = new yfu
            r9.<init>()
            throw r9
        L63:
            return r9
        L64:
            int r5 = r9.r
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L99
            boolean r5 = r9 instanceof defpackage.bxw
            if (r5 == 0) goto L99
            r5 = r9
            bxw r5 = (defpackage.bxw) r5
            bko r5 = r5.C
            r7 = r4
        L74:
            if (r5 == 0) goto L97
            int r8 = r5.r
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L94
            int r7 = r7 + 1
            if (r7 != r6) goto L82
            r9 = r5
            goto L94
        L82:
            if (r3 != 0) goto L8b
            bfz r3 = new bfz
            bko[] r8 = new defpackage.bko[r2]
            r3.<init>(r8, r4)
        L8b:
            if (r9 == 0) goto L90
            r3.o(r9)
        L90:
            r3.o(r5)
            r9 = r1
        L94:
            bko r5 = r5.u
            goto L74
        L97:
            if (r7 == r6) goto L3b
        L99:
            bko r9 = defpackage.fh.F(r3)
            goto L3b
        L9e:
            bko r9 = r9.u
            goto L32
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.H(bmr):bmr");
    }

    public static final bmy I(bmr bmrVar) {
        bzq bzqVar = bmrVar.w;
        return bzqVar != null ? bty.w(bzqVar).p(bzqVar, false) : bmy.a;
    }

    public static final boolean J(bmr bmrVar) {
        bys bysVar;
        bzq bzqVar;
        bys bysVar2;
        bzq bzqVar2 = bmrVar.w;
        return (bzqVar2 == null || (bysVar = bzqVar2.s) == null || !bysVar.ag() || (bzqVar = bmrVar.w) == null || (bysVar2 = bzqVar.s) == null || !bysVar2.af()) ? false : true;
    }

    public static final boolean K(bmr bmrVar) {
        bfz bfzVar;
        int i;
        bzm bzmVar;
        bzm bzmVar2;
        bmh bmhVar = ((cbc) fh.K(bmrVar)).K;
        bmr bmrVar2 = bmhVar.e;
        bmp bmpVarE = bmrVar.e();
        if (bmrVar2 == bmrVar) {
            bmrVar.m(bmpVarE, bmpVarE);
            return true;
        }
        int i2 = 0;
        if (bmrVar2 == null && !((cbc) fh.K(bmrVar)).K.a.c()) {
            return false;
        }
        int i3 = 16;
        if (bmrVar2 != null) {
            bfzVar = new bfz(new bmr[16], 0);
            if (!bmrVar2.q.A) {
                bty.c("visitAncestors called on an unattached node");
            }
            bko bkoVar = bmrVar2.q.t;
            bys bysVarI = fh.I(bmrVar2);
            while (bysVarI != null) {
                if ((bysVarI.t.f.s & 1024) != 0) {
                    while (bkoVar != null) {
                        if ((bkoVar.r & 1024) != 0) {
                            bko bkoVarF = bkoVar;
                            bfz bfzVar2 = null;
                            while (bkoVarF != null) {
                                if (bkoVarF instanceof bmr) {
                                    bfzVar.o((bmr) bkoVarF);
                                } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                    int i4 = 0;
                                    for (bko bkoVar2 = ((bxw) bkoVarF).C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                                        if ((bkoVar2.r & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                bkoVarF = bkoVar2;
                                            } else {
                                                if (bfzVar2 == null) {
                                                    bfzVar2 = new bfz(new bko[16], 0);
                                                }
                                                if (bkoVarF != null) {
                                                    bfzVar2.o(bkoVarF);
                                                }
                                                bfzVar2.o(bkoVar2);
                                                bkoVarF = null;
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                bkoVarF = fh.F(bfzVar2);
                            }
                        }
                        bkoVar = bkoVar.t;
                    }
                }
                bysVarI = bysVarI.j();
                bkoVar = (bysVarI == null || (bzmVar2 = bysVarI.t) == null) ? null : bzmVar2.e;
            }
        } else {
            bfzVar = null;
        }
        bfz bfzVar3 = new bfz(new bmr[16], 0);
        if (!bmrVar.q.A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar3 = bmrVar.q.t;
        bys bysVarI2 = fh.I(bmrVar);
        int i5 = 1;
        while (bysVarI2 != null) {
            if ((bysVarI2.t.f.s & 1024) != 0) {
                while (bkoVar3 != null) {
                    if ((bkoVar3.r & 1024) != 0) {
                        bko bkoVarF2 = bkoVar3;
                        bfz bfzVar4 = null;
                        while (bkoVarF2 != null) {
                            if (bkoVarF2 instanceof bmr) {
                                bmr bmrVar3 = (bmr) bkoVarF2;
                                Boolean boolValueOf = bfzVar != null ? Boolean.valueOf(bfzVar.n(bmrVar3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    bfzVar3.o(bmrVar3);
                                }
                                i5 &= bmrVar3 == bmrVar2 ? i2 : 1;
                            } else {
                                if ((bkoVarF2.r & 1024) != 0 && (bkoVarF2 instanceof bxw)) {
                                    bko bkoVar4 = ((bxw) bkoVarF2).C;
                                    int i6 = i2;
                                    while (bkoVar4 != null) {
                                        if ((bkoVar4.r & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                bkoVarF2 = bkoVar4;
                                            } else {
                                                if (bfzVar4 == null) {
                                                    bfzVar4 = new bfz(new bko[i3], 0);
                                                }
                                                if (bkoVarF2 != null) {
                                                    bfzVar4.o(bkoVarF2);
                                                }
                                                bfzVar4.o(bkoVar4);
                                                bkoVarF2 = null;
                                            }
                                        }
                                        bkoVar4 = bkoVar4.u;
                                        i3 = 16;
                                    }
                                    if (i6 != 1) {
                                    }
                                }
                                i2 = 0;
                                i3 = 16;
                            }
                            bkoVarF2 = fh.F(bfzVar4);
                            i2 = 0;
                            i3 = 16;
                        }
                    }
                    bkoVar3 = bkoVar3.t;
                    i2 = 0;
                    i3 = 16;
                }
            }
            bysVarI2 = bysVarI2.j();
            if (bysVarI2 == null || (bzmVar = bysVarI2.t) == null) {
                i2 = 0;
                bkoVar3 = null;
            } else {
                bkoVar3 = bzmVar.e;
                i2 = 0;
            }
            i3 = 16;
        }
        if (i5 == 0 || bmrVar2 == null) {
            i = 0;
        } else {
            i = 0;
            if (!L(bmrVar2, false)) {
                return false;
            }
        }
        cbp.Q(bmrVar, new bms(bmrVar, i));
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((cbc) fh.K(bmrVar)).K.f(bmrVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new yfu();
                }
                ((cbc) fh.K(bmrVar)).K.f(bmrVar);
            }
        }
        if (bfzVar != null) {
            int i7 = bfzVar.b - 1;
            Object[] objArr = bfzVar.a;
            if (i7 < objArr.length) {
                while (i7 >= 0) {
                    bmr bmrVar4 = (bmr) objArr[i7];
                    if (bmhVar.e != bmrVar) {
                        return false;
                    }
                    bmrVar4.m(bmp.b, bmp.d);
                    i7--;
                }
            }
        }
        int i8 = bfzVar3.b - 1;
        Object[] objArr2 = bfzVar3.a;
        if (i8 < objArr2.length) {
            while (i8 >= 0) {
                bmr bmrVar5 = (bmr) objArr2[i8];
                if (bmhVar.e != bmrVar) {
                    return false;
                }
                bmrVar5.m(bmrVar5 == bmrVar2 ? bmp.a : bmp.d, bmp.b);
                i8--;
            }
        }
        if (bmhVar.e != bmrVar) {
            return false;
        }
        bmrVar.m(bmpVarE, bmp.a);
        return bmhVar.e == bmrVar;
    }

    public static final boolean L(bmr bmrVar, boolean z) {
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal == 0) {
            ((cbc) fh.K(bmrVar)).K.f(null);
            bmrVar.m(bmp.a, bmp.d);
            return true;
        }
        if (iOrdinal == 1) {
            bmr bmrVarH = H(bmrVar);
            if (bmrVarH != null && !L(bmrVarH, z)) {
                return false;
            }
            bmrVar.m(bmp.b, bmp.d);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new yfu();
        }
        if (!z) {
            return z;
        }
        ((cbc) fh.K(bmrVar)).K.f(null);
        bmrVar.m(bmp.c, bmp.d);
        return true;
    }

    public static final int M(bmr bmrVar, int i) {
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iM = M(an(bmrVar), i);
                if (iM == 1) {
                    iM = 0;
                }
                if (iM != 0) {
                    return iM;
                }
                if (bmrVar.a) {
                    return 1;
                }
                bmrVar.a = true;
                try {
                    bmi bmiVarB = bmrVar.b();
                    blx blxVar = new blx(i);
                    O(bmrVar);
                    bmh bmhVar = ((cbc) fh.K(bmrVar)).K;
                    bmr bmrVar2 = bmhVar.e;
                    ((bmj) bmiVarB).k.a(blxVar);
                    bmr bmrVar3 = bmhVar.e;
                    if (blxVar.b) {
                        return 2;
                    }
                    if (bmrVar2 == bmrVar3 || bmrVar3 == null) {
                        return 1;
                    }
                    return bml.c == bml.b ? 2 : 3;
                } finally {
                    bmrVar.a = false;
                }
            }
            if (iOrdinal == 2) {
                return 2;
            }
            if (iOrdinal != 3) {
                throw new yfu();
            }
        }
        return 1;
    }

    public static final int N(bmr bmrVar, int i) {
        bko bkoVar;
        bzm bzmVar;
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return M(an(bmrVar), i);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new yfu();
                }
                if (!bmrVar.q.A) {
                    bty.c("visitAncestors called on an unattached node");
                }
                bko bkoVar2 = bmrVar.q.t;
                bys bysVarI = fh.I(bmrVar);
                loop0: while (true) {
                    bkoVar = null;
                    if (bysVarI == null) {
                        break;
                    }
                    if ((bysVarI.t.f.s & 1024) != 0) {
                        while (bkoVar2 != null) {
                            if ((bkoVar2.r & 1024) != 0) {
                                bko bkoVarF = bkoVar2;
                                bfz bfzVar = null;
                                while (bkoVarF != null) {
                                    if (bkoVarF instanceof bmr) {
                                        bkoVar = bkoVarF;
                                        break loop0;
                                    }
                                    if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                        int i2 = 0;
                                        for (bko bkoVar3 = ((bxw) bkoVarF).C; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                                            if ((bkoVar3.r & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    bkoVarF = bkoVar3;
                                                } else {
                                                    if (bfzVar == null) {
                                                        bfzVar = new bfz(new bko[16], 0);
                                                    }
                                                    if (bkoVarF != null) {
                                                        bfzVar.o(bkoVarF);
                                                    }
                                                    bfzVar.o(bkoVar3);
                                                    bkoVarF = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    bkoVarF = fh.F(bfzVar);
                                }
                            }
                            bkoVar2 = bkoVar2.t;
                        }
                    }
                    bysVarI = bysVarI.j();
                    bkoVar2 = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
                }
                bmr bmrVar2 = (bmr) bkoVar;
                if (bmrVar2 == null) {
                    return 1;
                }
                int iOrdinal2 = bmrVar2.e().ordinal();
                if (iOrdinal2 == 0) {
                    return ao(bmrVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return N(bmrVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new yfu();
                }
                int iN = N(bmrVar2, i);
                int i3 = iN != 1 ? iN : 0;
                return i3 == 0 ? ao(bmrVar2, i) : i3;
            }
        }
        return 1;
    }

    public static final void O(bmr bmrVar) {
        bys bysVar;
        bzz bzzVar;
        bzq bzqVar = bmrVar.q.w;
        if (bzqVar == null || (bysVar = bzqVar.s) == null || (bzzVar = bysVar.i) == null) {
            return;
        }
        bmh bmhVar = ((cbc) bzzVar).K;
    }

    public static final bkp Q(bkp bkpVar, bml bmlVar) {
        return bkpVar.a(new FocusRequesterElement(bmlVar));
    }

    public static final boolean R(int i) {
        return a.r(i, 1) || a.r(i, 2);
    }

    public static final bkp S(bkp bkpVar) {
        return bkpVar.a(new bzi<bmr>() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
            @Override // defpackage.bzi
            public final /* synthetic */ bko d() {
                return new bmr(0, null, 7);
            }

            @Override // defpackage.bzi
            public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return 1739042953;
            }
        });
    }

    public static final blz T(int i) {
        int i2 = 2;
        int i3 = 1;
        if (i == 1) {
            return new blz(i2);
        }
        if (i == 2) {
            return new blz(i3);
        }
        if (i == 17) {
            return new blz(3);
        }
        if (i == 33) {
            return new blz(5);
        }
        if (i == 66) {
            return new blz(4);
        }
        if (i != 130) {
            return null;
        }
        return new blz(6);
    }

    public static final bmy U(View view, View view2) {
        int[] iArr = bmc.a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i - i3;
        float f2 = i2 - iArr[1];
        return new bmy(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final cmi V(int i) {
        if (i == 0) {
            return cmi.a;
        }
        if (i != 1) {
            return null;
        }
        return cmi.b;
    }

    public static final Integer W(int i) {
        if (a.r(i, 5)) {
            return 33;
        }
        if (a.r(i, 6)) {
            return 130;
        }
        if (a.r(i, 3)) {
            return 17;
        }
        if (a.r(i, 4)) {
            return 66;
        }
        if (a.r(i, 1)) {
            return 2;
        }
        return !a.r(i, 2) ? null : 1;
    }

    public static final boolean X(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof cbc) {
            return ((cbc) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:55:0x00a2, B:58:0x00ab, B:61:0x00b3, B:64:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Y(defpackage.bmr r10, int r11, defpackage.yjv r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.Y(bmr, int, yjv):java.lang.Object");
    }

    public static final ydk Z(bmr bmrVar) {
        return ((cbc) fh.K(bmrVar)).K.g;
    }

    public static boolean a(int i) {
        return i == 13 || i == 14;
    }

    public static bhi aa(Context context, bv bvVar, boolean z, boolean z2) throws Resources.NotFoundException {
        int exitAnim;
        boolean z3;
        int nextTransition = bvVar.getNextTransition();
        int iAb = 0;
        if (z2) {
            if (z) {
                exitAnim = bvVar.getPopEnterAnim();
                z3 = true;
            } else {
                exitAnim = bvVar.getPopExitAnim();
                z3 = false;
            }
        } else if (z) {
            exitAnim = bvVar.getEnterAnim();
            z3 = true;
        } else {
            exitAnim = bvVar.getExitAnim();
            z3 = false;
        }
        boolean z4 = z3;
        bvVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = bvVar.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            bvVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = bvVar.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = bvVar.onCreateAnimation(nextTransition, z3, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new bhi(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = bvVar.onCreateAnimator(nextTransition, z3, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new bhi(animatorOnCreateAnimator);
        }
        if (exitAnim != 0) {
            iAb = exitAnim;
        } else if (nextTransition != 0) {
            iAb = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z3 ? ab(context, android.R.attr.activityOpenEnterAnimation) : ab(context, android.R.attr.activityOpenExitAnimation) : true != z4 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z3 ? ab(context, android.R.attr.activityCloseEnterAnimation) : ab(context, android.R.attr.activityCloseExitAnimation) : true != z4 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z4 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iAb != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iAb));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iAb);
                    if (animationLoadAnimation != null) {
                        return new bhi(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iAb);
                    if (animatorLoadAnimator != null) {
                        return new bhi(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iAb);
                    if (animationLoadAnimation2 != null) {
                        return new bhi(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int ab(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static final long ac(int i, bmy bmyVar, bmy bmyVar2) {
        float f;
        float f2;
        float f3;
        long jAj = (long) aj(bmyVar2, i, bmyVar);
        if (a.r(i, 3) || a.r(i, 4)) {
            float f4 = bmyVar.c;
            f = f4 + ((bmyVar.e - f4) / 2.0f);
            f2 = bmyVar2.c;
            f3 = bmyVar2.e;
        } else {
            if (!a.r(i, 5) && !a.r(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f5 = bmyVar.b;
            f = f5 + ((bmyVar.d - f5) / 2.0f);
            f2 = bmyVar2.b;
            f3 = bmyVar2.d;
        }
        float f6 = f - (f2 + ((f3 - f2) / 2.0f));
        long j = 13 * jAj * jAj;
        long j2 = (long) f6;
        return j + (j2 * j2);
    }

    private static final bmr ad(bfz bfzVar, bmy bmyVar, int i) {
        bmy bmyVarH;
        if (a.r(i, 3)) {
            bmyVarH = bmyVar.h((bmyVar.d - bmyVar.b) + 1.0f, 0.0f);
        } else if (a.r(i, 4)) {
            bmyVarH = bmyVar.h(-((bmyVar.d - bmyVar.b) + 1.0f), 0.0f);
        } else if (a.r(i, 5)) {
            bmyVarH = bmyVar.h(0.0f, (bmyVar.e - bmyVar.c) + 1.0f);
        } else {
            if (!a.r(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            bmyVarH = bmyVar.h(0.0f, -((bmyVar.e - bmyVar.c) + 1.0f));
        }
        Object[] objArr = bfzVar.a;
        int i2 = bfzVar.b;
        bmr bmrVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            bmr bmrVar2 = (bmr) objArr[i3];
            if (J(bmrVar2)) {
                bmy bmyVarI = I(bmrVar2);
                if (B(bmyVarI, bmyVarH, bmyVar, i)) {
                    bmrVar = bmrVar2;
                    bmyVarH = bmyVarI;
                }
            }
        }
        return bmrVar;
    }

    private static final void ae(bxv bxvVar, bfz bfzVar) {
        bko bkoVar = (bko) bxvVar;
        if (!bkoVar.q.A) {
            bty.c("visitChildren called on an unattached node");
        }
        bfz bfzVar2 = new bfz(new bko[16], 0);
        bko bkoVar2 = bkoVar.q;
        bko bkoVar3 = bkoVar2.u;
        if (bkoVar3 == null) {
            fh.O(bfzVar2, bkoVar2);
        } else {
            bfzVar2.o(bkoVar3);
        }
        while (true) {
            int i = bfzVar2.b;
            if (i == 0) {
                return;
            }
            bko bkoVarF = (bko) bfzVar2.d(i - 1);
            if ((bkoVarF.s & 1024) == 0) {
                fh.O(bfzVar2, bkoVarF);
            } else {
                while (true) {
                    if (bkoVarF == null) {
                        break;
                    }
                    if ((bkoVarF.r & 1024) != 0) {
                        bfz bfzVar3 = null;
                        while (bkoVarF != null) {
                            if (bkoVarF instanceof bmr) {
                                bmr bmrVar = (bmr) bkoVarF;
                                if (bmrVar.A && !fh.I(bmrVar).z) {
                                    if (((bmj) bmrVar.b()).a) {
                                        bfzVar.o(bmrVar);
                                    } else {
                                        ae(bmrVar, bfzVar);
                                    }
                                }
                            } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                int i2 = 0;
                                for (bko bkoVar4 = ((bxw) bkoVarF).C; bkoVar4 != null; bkoVar4 = bkoVar4.u) {
                                    if ((bkoVar4.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bkoVarF = bkoVar4;
                                        } else {
                                            if (bfzVar3 == null) {
                                                bfzVar3 = new bfz(new bko[16], 0);
                                            }
                                            if (bkoVarF != null) {
                                                bfzVar3.o(bkoVarF);
                                            }
                                            bfzVar3.o(bkoVar4);
                                            bkoVarF = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            bkoVarF = fh.F(bfzVar3);
                        }
                    } else {
                        bkoVarF = bkoVarF.u;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean af(defpackage.bmy r9, defpackage.bmy r10, defpackage.bmy r11, int r12) {
        /*
            boolean r0 = ag(r11, r12, r9)
            r1 = 0
            if (r0 != 0) goto Lac
            boolean r0 = ag(r10, r12, r9)
            if (r0 != 0) goto Le
            return r1
        Le:
            r0 = 3
            boolean r2 = defpackage.a.r(r12, r0)
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L25
            float r2 = r9.b
            float r8 = r11.d
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L24
            goto L52
        L24:
            return r7
        L25:
            boolean r2 = defpackage.a.r(r12, r6)
            if (r2 == 0) goto L34
            float r2 = r9.d
            float r8 = r11.b
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L52
            return r7
        L34:
            boolean r2 = defpackage.a.r(r12, r5)
            if (r2 == 0) goto L43
            float r2 = r9.c
            float r8 = r11.e
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L52
            return r7
        L43:
            boolean r2 = defpackage.a.r(r12, r4)
            if (r2 == 0) goto La6
            float r2 = r9.e
            float r8 = r11.c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L52
            return r7
        L52:
            boolean r2 = defpackage.a.r(r12, r0)
            if (r2 != 0) goto La5
            boolean r2 = defpackage.a.r(r12, r6)
            if (r2 == 0) goto L5f
            return r7
        L5f:
            float r10 = aj(r10, r12, r9)
            boolean r0 = defpackage.a.r(r12, r0)
            if (r0 == 0) goto L6f
            float r9 = r9.b
            float r11 = r11.b
        L6d:
            float r9 = r9 - r11
            goto L92
        L6f:
            boolean r0 = defpackage.a.r(r12, r6)
            if (r0 == 0) goto L7c
            float r11 = r11.d
            float r9 = r9.d
        L79:
            float r9 = r11 - r9
            goto L92
        L7c:
            boolean r0 = defpackage.a.r(r12, r5)
            if (r0 == 0) goto L87
            float r9 = r9.c
            float r11 = r11.c
            goto L6d
        L87:
            boolean r12 = defpackage.a.r(r12, r4)
            if (r12 == 0) goto L9f
            float r11 = r11.e
            float r9 = r9.e
            goto L79
        L92:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L99
            r9 = r11
        L99:
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto L9e
            return r1
        L9e:
            return r7
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        La5:
            return r7
        La6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.af(bmy, bmy, bmy, int):boolean");
    }

    private static final boolean ag(bmy bmyVar, int i, bmy bmyVar2) {
        if (a.r(i, 3) || a.r(i, 4)) {
            return bmyVar.e > bmyVar2.c && bmyVar.c < bmyVar2.e;
        }
        if (a.r(i, 5) || a.r(i, 6)) {
            return bmyVar.d > bmyVar2.b && bmyVar.b < bmyVar2.d;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean ah(bmr bmrVar, bmy bmyVar, int i, yjv yjvVar) {
        if (C(bmrVar, bmyVar, i, yjvVar)) {
            return true;
        }
        ydk ydkVarZ = Z(bmrVar);
        int i2 = ydkVarZ.a;
        Boolean bool = (Boolean) Y(bmrVar, i, new bmu(ydkVarZ, ((cbc) fh.K(bmrVar)).K.e, bmrVar, bmyVar, i, yjvVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean ai(bmy bmyVar, int i, bmy bmyVar2) {
        if (a.r(i, 3)) {
            float f = bmyVar2.d;
            float f2 = bmyVar.d;
            return (f > f2 || bmyVar2.b >= f2) && bmyVar2.b > bmyVar.b;
        }
        if (a.r(i, 4)) {
            float f3 = bmyVar2.b;
            float f4 = bmyVar.b;
            return (f3 < f4 || bmyVar2.d <= f4) && bmyVar2.d < bmyVar.d;
        }
        if (a.r(i, 5)) {
            float f5 = bmyVar2.e;
            float f6 = bmyVar.e;
            return (f5 > f6 || bmyVar2.c >= f6) && bmyVar2.c > bmyVar.c;
        }
        if (!a.r(i, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = bmyVar2.c;
        float f8 = bmyVar.c;
        return (f7 < f8 || bmyVar2.e <= f8) && bmyVar2.e < bmyVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ float aj(defpackage.bmy r1, int r2, defpackage.bmy r3) {
        /*
            r0 = 3
            boolean r0 = defpackage.a.r(r2, r0)
            if (r0 == 0) goto Ld
            float r2 = r3.b
            float r1 = r1.d
        Lb:
            float r2 = r2 - r1
            goto L33
        Ld:
            r0 = 4
            boolean r0 = defpackage.a.r(r2, r0)
            if (r0 == 0) goto L1b
            float r1 = r1.b
            float r2 = r3.d
        L18:
            float r2 = r1 - r2
            goto L33
        L1b:
            r0 = 5
            boolean r0 = defpackage.a.r(r2, r0)
            if (r0 == 0) goto L27
            float r2 = r3.c
            float r1 = r1.e
            goto Lb
        L27:
            r0 = 6
            boolean r2 = defpackage.a.r(r2, r0)
            if (r2 == 0) goto L3a
            float r1 = r1.c
            float r2 = r3.e
            goto L18
        L33:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L39
            return r1
        L39:
            return r2
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.aj(bmy, int, bmy):float");
    }

    private static final boolean ak(bmr bmrVar, bmr bmrVar2, int i, yjv yjvVar) {
        if (F(bmrVar, bmrVar2, i, yjvVar)) {
            return true;
        }
        ydk ydkVarZ = Z(bmrVar);
        int i2 = ydkVarZ.a;
        Boolean bool = (Boolean) Y(bmrVar, i, new bmu(ydkVarZ, ((cbc) fh.K(bmrVar)).K.e, bmrVar, bmrVar2, i, yjvVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean al(bmr bmrVar, yjv yjvVar) {
        bfz bfzVar = new bfz(new bmr[16], 0);
        if (!bmrVar.q.A) {
            bty.c("visitChildren called on an unattached node");
        }
        bfz bfzVar2 = new bfz(new bko[16], 0);
        bko bkoVar = bmrVar.q;
        bko bkoVar2 = bkoVar.u;
        if (bkoVar2 == null) {
            fh.O(bfzVar2, bkoVar);
        } else {
            bfzVar2.o(bkoVar2);
        }
        while (true) {
            int i = bfzVar2.b;
            if (i == 0) {
                break;
            }
            bko bkoVarF = (bko) bfzVar2.d(i - 1);
            if ((bkoVarF.s & 1024) == 0) {
                fh.O(bfzVar2, bkoVarF);
            } else {
                while (true) {
                    if (bkoVarF == null) {
                        break;
                    }
                    if ((bkoVarF.r & 1024) != 0) {
                        bfz bfzVar3 = null;
                        while (bkoVarF != null) {
                            if (bkoVarF instanceof bmr) {
                                bfzVar.o((bmr) bkoVarF);
                            } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                int i2 = 0;
                                for (bko bkoVar3 = ((bxw) bkoVarF).C; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                                    if ((bkoVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bkoVarF = bkoVar3;
                                        } else {
                                            if (bfzVar3 == null) {
                                                bfzVar3 = new bfz(new bko[16], 0);
                                            }
                                            if (bkoVarF != null) {
                                                bfzVar3.o(bkoVarF);
                                            }
                                            bfzVar3.o(bkoVar3);
                                            bkoVarF = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            bkoVarF = fh.F(bfzVar3);
                        }
                    } else {
                        bkoVarF = bkoVarF.u;
                    }
                }
            }
        }
        bfzVar.k(bxy.a);
        int i3 = bfzVar.b - 1;
        Object[] objArr = bfzVar.a;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                bmr bmrVar2 = (bmr) objArr[i3];
                if (J(bmrVar2) && D(bmrVar2, yjvVar)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    private static final boolean am(bmr bmrVar, yjv yjvVar) {
        bfz bfzVar = new bfz(new bmr[16], 0);
        if (!bmrVar.q.A) {
            bty.c("visitChildren called on an unattached node");
        }
        bfz bfzVar2 = new bfz(new bko[16], 0);
        bko bkoVar = bmrVar.q;
        bko bkoVar2 = bkoVar.u;
        if (bkoVar2 == null) {
            fh.O(bfzVar2, bkoVar);
        } else {
            bfzVar2.o(bkoVar2);
        }
        while (true) {
            int i = bfzVar2.b;
            if (i == 0) {
                break;
            }
            bko bkoVarF = (bko) bfzVar2.d(i - 1);
            if ((bkoVarF.s & 1024) == 0) {
                fh.O(bfzVar2, bkoVarF);
            } else {
                while (true) {
                    if (bkoVarF == null) {
                        break;
                    }
                    if ((bkoVarF.r & 1024) != 0) {
                        bfz bfzVar3 = null;
                        while (bkoVarF != null) {
                            if (bkoVarF instanceof bmr) {
                                bfzVar.o((bmr) bkoVarF);
                            } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                                int i2 = 0;
                                for (bko bkoVar3 = ((bxw) bkoVarF).C; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                                    if ((bkoVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bkoVarF = bkoVar3;
                                        } else {
                                            if (bfzVar3 == null) {
                                                bfzVar3 = new bfz(new bko[16], 0);
                                            }
                                            if (bkoVarF != null) {
                                                bfzVar3.o(bkoVarF);
                                            }
                                            bfzVar3.o(bkoVar3);
                                            bkoVarF = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            bkoVarF = fh.F(bfzVar3);
                        }
                    } else {
                        bkoVarF = bkoVarF.u;
                    }
                }
            }
        }
        bfzVar.k(bxy.a);
        Object[] objArr = bfzVar.a;
        int i3 = bfzVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            bmr bmrVar2 = (bmr) objArr[i4];
            if (J(bmrVar2) && E(bmrVar2, yjvVar)) {
                return true;
            }
        }
        return false;
    }

    private static final bmr an(bmr bmrVar) {
        bmr bmrVarH = H(bmrVar);
        if (bmrVarH != null) {
            return bmrVarH;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final int ao(bmr bmrVar, int i) {
        if (!bmrVar.b) {
            bmrVar.b = true;
            try {
                bmi bmiVarB = bmrVar.b();
                blx blxVar = new blx(i);
                O(bmrVar);
                bmh bmhVar = ((cbc) fh.K(bmrVar)).K;
                bmr bmrVar2 = bmhVar.e;
                ((bmj) bmiVarB).j.a(blxVar);
                bmr bmrVar3 = bmhVar.e;
                boolean z = blxVar.b;
                int i2 = 2;
                if (!z) {
                    if (bmrVar2 != bmrVar3 && bmrVar3 != null) {
                        if (bml.c != bml.b) {
                            i2 = 3;
                        }
                    }
                }
                return i2;
            } finally {
                bmrVar.b = false;
            }
        }
        return 1;
    }

    public static final void b(View view, fz fzVar) {
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, fzVar);
    }

    public static /* synthetic */ gb c(int i, int i2) {
        return new gb(i, i2, new ga(0), (byte[]) null);
    }

    public static Object d(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return bundle.getParcelable(str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Object e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static /* synthetic */ void f(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static final int g(bfz bfzVar, int i) {
        int i2 = bfzVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = bfzVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((gb) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((gb) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void h(List list, Object[] objArr) {
        for (Object obj : objArr) {
            list.add(obj);
        }
    }

    public static final int i(boolean z, abj abjVar, int i) {
        return z ? ((abk) abjVar.i.get(i)).l : ((abk) abjVar.i.get(i)).m;
    }

    public static final List j(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(defpackage.bkp r31, defpackage.abw r32, defpackage.aau r33, defpackage.yy r34, defpackage.ybo r35, boolean r36, defpackage.qj r37, defpackage.xj r38, defpackage.xe r39, defpackage.yjv r40, defpackage.bao r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.k(bkp, abw, aau, yy, ybo, boolean, qj, xj, xe, yjv, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(final defpackage.aas r20, defpackage.bkp r21, defpackage.abw r22, defpackage.yy r23, final defpackage.xj r24, final defpackage.xe r25, defpackage.ybo r26, boolean r27, defpackage.qj r28, final defpackage.yjv r29, defpackage.bao r30, final int r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.l(aas, bkp, abw, yy, xj, xe, ybo, boolean, qj, yjv, bao, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(defpackage.bkp r32, final defpackage.aan r33, final defpackage.yy r34, final boolean r35, final defpackage.ybo r36, final boolean r37, final defpackage.qj r38, defpackage.bkc r39, defpackage.xj r40, defpackage.bkh r41, defpackage.xe r42, final defpackage.yjv r43, defpackage.bao r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.m(bkp, aan, yy, boolean, ybo, boolean, qj, bkc, xj, bkh, xe, yjv, bao, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(defpackage.bkp r27, defpackage.aan r28, defpackage.yy r29, defpackage.xj r30, defpackage.bkc r31, defpackage.ybo r32, boolean r33, defpackage.qj r34, defpackage.yjv r35, defpackage.bao r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.n(bkp, aan, yy, xj, bkc, ybo, boolean, qj, yjv, bao, int, int):void");
    }

    public static final void o(bkp bkpVar, aan aanVar, yy yyVar, xe xeVar, bkh bkhVar, ybo yboVar, boolean z, qj qjVar, yjv yjvVar, bao baoVar, int i) {
        bkp bkpVar2;
        int i2;
        xe xeVar2;
        bao baoVar2;
        aan aanVar2;
        bkh bkhVar2;
        ybo yboVar2;
        boolean z2;
        qj qjVar2;
        boolean z3;
        bkh bkhVar3;
        ybo yboVarQ;
        qj qjVarA;
        aan aanVar3;
        bao baoVarD = baoVar.d(-1884325601);
        if ((i & 6) == 0) {
            bkpVar2 = bkpVar;
            i2 = (true != baoVarD.F(bkpVar2) ? 2 : 4) | i;
        } else {
            bkpVar2 = bkpVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(yyVar) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            xeVar2 = xeVar;
            i3 |= true != baoVarD.F(xeVar2) ? 8192 : 16384;
        } else {
            xeVar2 = xeVar;
        }
        int i4 = 196608 | i3;
        if ((1572864 & i) == 0) {
            i4 = i3 | 720896;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = i4 | 46137344;
        }
        if ((805306368 & i) == 0) {
            i5 |= true != baoVarD.H(yjvVar) ? 268435456 : 536870912;
        }
        if (baoVarD.L((306783379 & i5) != 306783378, i5 & 1)) {
            int i6 = i5 >> 18;
            int i7 = (-238551153) & i5;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                aan aanVarA = aao.a(baoVarD);
                z3 = true;
                bkhVar3 = bkb.m;
                yboVarQ = og.q(baoVarD);
                qjVarA = sc.a(baoVarD);
                aanVar3 = aanVarA;
            } else {
                baoVarD.t();
                aanVar3 = aanVar;
                bkhVar3 = bkhVar;
                yboVarQ = yboVar;
                z3 = z;
                qjVarA = qjVar;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            m(bkpVar2, aanVar3, yyVar, false, yboVarQ, z3, qjVarA, null, null, bkhVar3, xeVar2, yjvVar, baoVar2, (i5 & 14) | 24576 | (i5 & 896) | (i5 & 7168) | (3670016 & (i7 >> 3)), ((i7 >> 12) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i7 >> 6) & 896) | (i6 & 7168), 1792);
            aanVar2 = aanVar3;
            yboVar2 = yboVarQ;
            z2 = z3;
            qjVar2 = qjVarA;
            bkhVar2 = bkhVar3;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            aanVar2 = aanVar;
            bkhVar2 = bkhVar;
            yboVar2 = yboVar;
            z2 = z;
            qjVar2 = qjVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kif(bkpVar, aanVar2, yyVar, xeVar, bkhVar2, yboVar2, z2, qjVar2, yjvVar, i, 1);
        }
    }

    public static final long p(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final bmy q(long j) {
        return w(0L, j);
    }

    public static final bmz r(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        return new bmz(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final bmz s(bmy bmyVar, long j, long j2, long j3, long j4) {
        return new bmz(bmyVar.b, bmyVar.c, bmyVar.d, bmyVar.e, j, j2, j3, j4);
    }

    public static final bmz t(float f, float f2, float f3, float f4, long j) {
        return r(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }

    public static final bmz u(bmy bmyVar, long j) {
        return r(bmyVar.b, bmyVar.c, bmyVar.d, bmyVar.e, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }

    public static final boolean v(bmz bmzVar) {
        long j = bmzVar.e;
        return (j >>> 32) == (4294967295L & j) && j == bmzVar.f && j == bmzVar.g && j == bmzVar.h;
    }

    public static final bmy w(long j, long j2) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        return new bmy(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final bmy x(bmw bmwVar) {
        return new bmy(bmwVar.a, bmwVar.b, bmwVar.c, bmwVar.d);
    }

    public static final String y(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final Boolean z(bmr bmrVar, int i, bmy bmyVar, yjv yjvVar) {
        int iOrdinal = bmrVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                bmr bmrVarH = H(bmrVar);
                if (bmrVarH == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = bmrVarH.e().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolZ = z(bmrVarH, i, bmyVar, yjvVar);
                        if (!yks.e(boolZ, false)) {
                            return boolZ;
                        }
                        if (bmyVar == null) {
                            if (bmrVarH.e() != bmp.b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            bmr bmrVarG = G(bmrVarH);
                            if (bmrVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            bmyVar = I(bmrVarG);
                        }
                        return Boolean.valueOf(ah(bmrVar, bmyVar, i, yjvVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new yfu();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (bmyVar == null) {
                    bmyVar = I(bmrVarH);
                }
                return Boolean.valueOf(ah(bmrVar, bmyVar, i, yjvVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (Boolean) (((bmj) bmrVar.b()).a ? yjvVar.a(bmrVar) : bmyVar == null ? Boolean.valueOf(A(bmrVar, i, yjvVar)) : Boolean.valueOf(C(bmrVar, bmyVar, i, yjvVar)));
                }
                throw new yfu();
            }
        }
        return Boolean.valueOf(A(bmrVar, i, yjvVar));
    }
}
