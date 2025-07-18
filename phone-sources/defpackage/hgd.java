package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgd {
    private static final ghd a = ghd.d("ty", "d");

    public static hev a(hhf hhfVar, hbk hbkVar) {
        String strF;
        hev hevVar;
        hev heuVar;
        hev hfeVar;
        hev hfgVar;
        hev hfhVar;
        hhfVar.h();
        int iB = 2;
        while (true) {
            if (!hhfVar.n()) {
                strF = null;
                break;
            }
            int iQ = hhfVar.q(a);
            if (iQ == 0) {
                strF = hhfVar.f();
                break;
            }
            if (iQ != 1) {
                hhfVar.l();
                hhfVar.m();
            } else {
                iB = hhfVar.b();
            }
        }
        if (strF == null) {
            return null;
        }
        int iHashCode = strF.hashCode();
        int i = 0;
        boolean zO = false;
        boolean zO2 = false;
        int iB2 = 0;
        if (iHashCode != 3239) {
            if (iHashCode == 3270) {
                hevVar = null;
                if (strF.equals("fl")) {
                    ghd ghdVar = hgx.a;
                    int iB3 = 1;
                    boolean zO3 = false;
                    hek hekVar = null;
                    String strF2 = null;
                    heh hehVarK = null;
                    boolean zO4 = false;
                    while (hhfVar.n()) {
                        int iQ2 = hhfVar.q(hgx.a);
                        if (iQ2 == 0) {
                            strF2 = hhfVar.f();
                        } else if (iQ2 == 1) {
                            hehVarK = hjs.k(hhfVar, hbkVar);
                        } else if (iQ2 == 2) {
                            hekVar = hjs.o(hhfVar, hbkVar);
                        } else if (iQ2 == 3) {
                            zO4 = hhfVar.o();
                        } else if (iQ2 == 4) {
                            iB3 = hhfVar.b();
                        } else if (iQ2 != 5) {
                            hhfVar.l();
                            hhfVar.m();
                        } else {
                            zO3 = hhfVar.o();
                        }
                    }
                    if (hekVar == null) {
                        hekVar = new hek(Collections.singletonList(new hhs(100)));
                    }
                    hfeVar = new hfe(strF2, zO4, iB3 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, hehVarK, hekVar, zO3);
                }
                hhk.a("Unknown shape type ".concat(strF));
            } else if (iHashCode == 3295) {
                hevVar = null;
                if (strF.equals("gf")) {
                    ghd ghdVar2 = hgk.a;
                    Path.FillType fillType = Path.FillType.WINDING;
                    int i2 = 0;
                    boolean zO5 = false;
                    hek hekVar2 = null;
                    String strF3 = null;
                    hej hejVarN = null;
                    hem hemVarP = null;
                    hem hemVarP2 = null;
                    while (hhfVar.n()) {
                        switch (hhfVar.q(hgk.a)) {
                            case 0:
                                strF3 = hhfVar.f();
                                break;
                            case 1:
                                hhfVar.h();
                                int iB4 = -1;
                                while (hhfVar.n()) {
                                    int iQ3 = hhfVar.q(hgk.b);
                                    if (iQ3 == 0) {
                                        iB4 = hhfVar.b();
                                    } else if (iQ3 != 1) {
                                        hhfVar.l();
                                        hhfVar.m();
                                    } else {
                                        hejVarN = hjs.n(hhfVar, hbkVar, iB4);
                                    }
                                }
                                hhfVar.j();
                                break;
                            case 2:
                                hekVar2 = hjs.o(hhfVar, hbkVar);
                                break;
                            case 3:
                                if (hhfVar.b() != 1) {
                                    i2 = 2;
                                    break;
                                } else {
                                    i2 = 1;
                                    break;
                                }
                            case 4:
                                hemVarP = hjs.p(hhfVar, hbkVar);
                                break;
                            case 5:
                                hemVarP2 = hjs.p(hhfVar, hbkVar);
                                break;
                            case 6:
                                if (hhfVar.b() != 1) {
                                    fillType = Path.FillType.EVEN_ODD;
                                    break;
                                } else {
                                    fillType = Path.FillType.WINDING;
                                    break;
                                }
                            case 7:
                                zO5 = hhfVar.o();
                                break;
                            default:
                                hhfVar.l();
                                hhfVar.m();
                                break;
                        }
                    }
                    if (hekVar2 == null) {
                        hekVar2 = new hek(Collections.singletonList(new hhs(100)));
                    }
                    heuVar = new hew(strF3, i2, fillType, hejVarN, hekVar2, hemVarP, hemVarP2, zO5);
                    hfeVar = heuVar;
                }
                hhk.a("Unknown shape type ".concat(strF));
            } else if (iHashCode == 3488) {
                hevVar = null;
                if (strF.equals("mm")) {
                    ghd ghdVar3 = hgr.a;
                    boolean zO6 = false;
                    while (hhfVar.n()) {
                        int iQ4 = hhfVar.q(hgr.a);
                        if (iQ4 == 0) {
                            hhfVar.f();
                        } else if (iQ4 == 1) {
                            int iB5 = hhfVar.b();
                            if (iB5 != 1) {
                                if (iB5 == 2) {
                                    i = 2;
                                } else if (iB5 == 3) {
                                    i = 3;
                                } else if (iB5 == 4) {
                                    i = 4;
                                } else if (iB5 == 5) {
                                    i = 5;
                                }
                            }
                            i = 1;
                        } else if (iQ4 != 2) {
                            hhfVar.l();
                            hhfVar.m();
                        } else {
                            zO6 = hhfVar.o();
                        }
                    }
                    hfeVar = new hey(i, zO6);
                    hbkVar.d("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                }
                hhk.a("Unknown shape type ".concat(strF));
            } else if (iHashCode == 3646) {
                hevVar = null;
                if (strF.equals("rp")) {
                    ghd ghdVar4 = hgu.a;
                    boolean zO7 = false;
                    String strF4 = null;
                    hei heiVarM = null;
                    hei heiVarM2 = null;
                    her herVarA = null;
                    while (hhfVar.n()) {
                        int iQ5 = hhfVar.q(hgu.a);
                        if (iQ5 == 0) {
                            strF4 = hhfVar.f();
                        } else if (iQ5 == 1) {
                            heiVarM = hjs.m(hhfVar, hbkVar, false);
                        } else if (iQ5 == 2) {
                            heiVarM2 = hjs.m(hhfVar, hbkVar, false);
                        } else if (iQ5 == 3) {
                            herVarA = hga.a(hhfVar, hbkVar);
                        } else if (iQ5 != 4) {
                            hhfVar.m();
                        } else {
                            zO7 = hhfVar.o();
                        }
                    }
                    heuVar = new hfb(strF4, heiVarM, heiVarM2, herVarA, zO7);
                    hfeVar = heuVar;
                }
                hhk.a("Unknown shape type ".concat(strF));
            } else if (iHashCode == 3669) {
                hevVar = null;
                if (strF.equals("sh")) {
                    int i3 = hgz.b;
                    boolean zO8 = false;
                    heo heoVarQ = null;
                    String strF5 = null;
                    while (hhfVar.n()) {
                        int iQ6 = hhfVar.q(hgz.a);
                        if (iQ6 == 0) {
                            strF5 = hhfVar.f();
                        } else if (iQ6 == 1) {
                            iB2 = hhfVar.b();
                        } else if (iQ6 == 2) {
                            heoVarQ = hjs.q(hhfVar, hbkVar);
                        } else if (iQ6 != 3) {
                            hhfVar.m();
                        } else {
                            zO8 = hhfVar.o();
                        }
                    }
                    hfgVar = new hfg(strF5, iB2, heoVarQ, zO8);
                    hfeVar = hfgVar;
                }
                hhk.a("Unknown shape type ".concat(strF));
            } else if (iHashCode != 3679) {
                hevVar = null;
                if (iHashCode == 3681) {
                    if (strF.equals("st")) {
                        ghd ghdVar5 = hha.a;
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        int i5 = 0;
                        boolean zO9 = false;
                        hek hekVar3 = null;
                        String strF6 = null;
                        hei heiVar = null;
                        heh hehVarK2 = null;
                        hei heiVarL = null;
                        float fA = 0.0f;
                        while (hhfVar.n()) {
                            switch (hhfVar.q(hha.a)) {
                                case 0:
                                    strF6 = hhfVar.f();
                                    break;
                                case 1:
                                    hehVarK2 = hjs.k(hhfVar, hbkVar);
                                    break;
                                case 2:
                                    heiVarL = hjs.l(hhfVar, hbkVar);
                                    break;
                                case 3:
                                    hekVar3 = hjs.o(hhfVar, hbkVar);
                                    break;
                                case 4:
                                    i4 = a.aZ()[hhfVar.b() - 1];
                                    break;
                                case 5:
                                    i5 = a.aZ()[hhfVar.b() - 1];
                                    break;
                                case 6:
                                    fA = (float) hhfVar.a();
                                    break;
                                case 7:
                                    zO9 = hhfVar.o();
                                    break;
                                case 8:
                                    hhfVar.g();
                                    while (hhfVar.n()) {
                                        hhfVar.h();
                                        String strF7 = null;
                                        hei heiVarL2 = null;
                                        while (hhfVar.n()) {
                                            int iQ7 = hhfVar.q(hha.b);
                                            if (iQ7 == 0) {
                                                strF7 = hhfVar.f();
                                            } else if (iQ7 != 1) {
                                                hhfVar.l();
                                                hhfVar.m();
                                            } else {
                                                heiVarL2 = hjs.l(hhfVar, hbkVar);
                                            }
                                        }
                                        hhfVar.j();
                                        int iHashCode2 = strF7.hashCode();
                                        if (iHashCode2 != 100) {
                                            if (iHashCode2 != 103) {
                                                if (iHashCode2 == 111 && strF7.equals("o")) {
                                                    heiVar = heiVarL2;
                                                }
                                            } else if (strF7.equals("g")) {
                                                hbkVar.f();
                                                arrayList.add(heiVarL2);
                                            }
                                        } else if (strF7.equals("d")) {
                                            hbkVar.f();
                                            arrayList.add(heiVarL2);
                                        }
                                    }
                                    hhfVar.i();
                                    if (arrayList.size() != 1) {
                                        break;
                                    } else {
                                        arrayList.add((hei) arrayList.get(0));
                                        break;
                                    }
                                default:
                                    hhfVar.m();
                                    break;
                            }
                        }
                        if (hekVar3 == null) {
                            hekVar3 = new hek(Collections.singletonList(new hhs(100)));
                        }
                        hfhVar = new hfh(strF6, heiVar, arrayList, hehVarK2, hekVar3, heiVarL, i4, i5, fA, zO9);
                        hfeVar = hfhVar;
                    }
                    hhk.a("Unknown shape type ".concat(strF));
                } else if (iHashCode == 3705) {
                    if (strF.equals("tm")) {
                        ghd ghdVar6 = hhb.a;
                        int i6 = 0;
                        boolean zO10 = false;
                        hei heiVarM3 = null;
                        hei heiVarM4 = null;
                        hei heiVarM5 = null;
                        while (hhfVar.n()) {
                            int iQ8 = hhfVar.q(hhb.a);
                            if (iQ8 == 0) {
                                heiVarM3 = hjs.m(hhfVar, hbkVar, false);
                            } else if (iQ8 == 1) {
                                heiVarM4 = hjs.m(hhfVar, hbkVar, false);
                            } else if (iQ8 == 2) {
                                heiVarM5 = hjs.m(hhfVar, hbkVar, false);
                            } else if (iQ8 == 3) {
                                hhfVar.f();
                            } else if (iQ8 == 4) {
                                int iB6 = hhfVar.b();
                                if (iB6 == 1) {
                                    i6 = 1;
                                } else {
                                    if (iB6 != 2) {
                                        throw new IllegalArgumentException(a.cf(iB6, "Unknown trim path type "));
                                    }
                                    i6 = 2;
                                }
                            } else if (iQ8 != 5) {
                                hhfVar.m();
                            } else {
                                zO10 = hhfVar.o();
                            }
                        }
                        heuVar = new hfi(i6, heiVarM3, heiVarM4, heiVarM5, zO10);
                        hfeVar = heuVar;
                    }
                    hhk.a("Unknown shape type ".concat(strF));
                } else if (iHashCode != 3710) {
                    if (iHashCode != 3307) {
                        if (iHashCode != 3308) {
                            if (iHashCode != 3633) {
                                if (iHashCode == 3634 && strF.equals("rd")) {
                                    ghd ghdVar7 = hgv.a;
                                    hei heiVarM6 = null;
                                    while (hhfVar.n()) {
                                        int iQ9 = hhfVar.q(hgv.a);
                                        if (iQ9 == 0) {
                                            hhfVar.f();
                                        } else if (iQ9 == 1) {
                                            heiVarM6 = hjs.m(hhfVar, hbkVar, true);
                                        } else if (iQ9 != 2) {
                                            hhfVar.m();
                                        } else {
                                            zO = hhfVar.o();
                                        }
                                    }
                                    if (!zO) {
                                        hfeVar = new hfc(heiVarM6);
                                    }
                                }
                            } else if (strF.equals("rc")) {
                                ghd ghdVar8 = hgt.a;
                                boolean zO11 = false;
                                String strF8 = null;
                                hes hesVarB = null;
                                hem hemVarP3 = null;
                                hei heiVarL3 = null;
                                while (hhfVar.n()) {
                                    int iQ10 = hhfVar.q(hgt.a);
                                    if (iQ10 == 0) {
                                        strF8 = hhfVar.f();
                                    } else if (iQ10 == 1) {
                                        hesVarB = hfy.b(hhfVar, hbkVar);
                                    } else if (iQ10 == 2) {
                                        hemVarP3 = hjs.p(hhfVar, hbkVar);
                                    } else if (iQ10 == 3) {
                                        heiVarL3 = hjs.l(hhfVar, hbkVar);
                                    } else if (iQ10 != 4) {
                                        hhfVar.m();
                                    } else {
                                        zO11 = hhfVar.o();
                                    }
                                }
                                heuVar = new hfa(strF8, hesVarB, hemVarP3, heiVarL3, zO11);
                                hfeVar = heuVar;
                            }
                        } else if (strF.equals("gs")) {
                            ghd ghdVar9 = hgl.a;
                            ArrayList arrayList2 = new ArrayList();
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            boolean zO12 = false;
                            hek hekVar4 = null;
                            String strF9 = null;
                            hej hejVarN2 = null;
                            hem hemVarP4 = null;
                            hem hemVarP5 = null;
                            hei heiVarL4 = null;
                            hei heiVar2 = null;
                            float fA2 = 0.0f;
                            while (hhfVar.n()) {
                                switch (hhfVar.q(hgl.a)) {
                                    case 0:
                                        strF9 = hhfVar.f();
                                        break;
                                    case 1:
                                        hhfVar.h();
                                        int iB7 = -1;
                                        while (hhfVar.n()) {
                                            int iQ11 = hhfVar.q(hgl.b);
                                            if (iQ11 == 0) {
                                                iB7 = hhfVar.b();
                                            } else if (iQ11 != 1) {
                                                hhfVar.l();
                                                hhfVar.m();
                                            } else {
                                                hejVarN2 = hjs.n(hhfVar, hbkVar, iB7);
                                            }
                                        }
                                        hhfVar.j();
                                        break;
                                    case 2:
                                        hekVar4 = hjs.o(hhfVar, hbkVar);
                                        break;
                                    case 3:
                                        if (hhfVar.b() != 1) {
                                            i7 = 2;
                                            break;
                                        } else {
                                            i7 = 1;
                                            break;
                                        }
                                    case 4:
                                        hemVarP4 = hjs.p(hhfVar, hbkVar);
                                        break;
                                    case 5:
                                        hemVarP5 = hjs.p(hhfVar, hbkVar);
                                        break;
                                    case 6:
                                        heiVarL4 = hjs.l(hhfVar, hbkVar);
                                        break;
                                    case 7:
                                        i8 = a.aZ()[hhfVar.b() - 1];
                                        break;
                                    case 8:
                                        i9 = a.aZ()[hhfVar.b() - 1];
                                        break;
                                    case 9:
                                        fA2 = (float) hhfVar.a();
                                        break;
                                    case 10:
                                        zO12 = hhfVar.o();
                                        break;
                                    case 11:
                                        hhfVar.g();
                                        while (hhfVar.n()) {
                                            hhfVar.h();
                                            String strF10 = null;
                                            hei heiVarL5 = null;
                                            while (hhfVar.n()) {
                                                int iQ12 = hhfVar.q(hgl.c);
                                                if (iQ12 == 0) {
                                                    strF10 = hhfVar.f();
                                                } else if (iQ12 != 1) {
                                                    hhfVar.l();
                                                    hhfVar.m();
                                                } else {
                                                    heiVarL5 = hjs.l(hhfVar, hbkVar);
                                                }
                                            }
                                            hhfVar.j();
                                            if (strF10.equals("o")) {
                                                heiVar2 = heiVarL5;
                                            } else if (strF10.equals("d") || strF10.equals("g")) {
                                                hbkVar.f();
                                                arrayList2.add(heiVarL5);
                                            }
                                        }
                                        hhfVar.i();
                                        if (arrayList2.size() != 1) {
                                            break;
                                        } else {
                                            arrayList2.add((hei) arrayList2.get(0));
                                            break;
                                        }
                                    default:
                                        hhfVar.l();
                                        hhfVar.m();
                                        break;
                                }
                            }
                            if (hekVar4 == null) {
                                hekVar4 = new hek(Collections.singletonList(new hhs(100)));
                            }
                            hfhVar = new hex(strF9, i7, hejVarN2, hekVar4, hemVarP4, hemVarP5, heiVarL4, i8, i9, fA2, arrayList2, heiVar2, zO12);
                            hfeVar = hfhVar;
                        }
                    } else if (strF.equals("gr")) {
                        ghd ghdVar10 = hgy.a;
                        ArrayList arrayList3 = new ArrayList();
                        String strF11 = null;
                        while (hhfVar.n()) {
                            int iQ13 = hhfVar.q(hgy.a);
                            if (iQ13 == 0) {
                                strF11 = hhfVar.f();
                            } else if (iQ13 == 1) {
                                zO2 = hhfVar.o();
                            } else if (iQ13 != 2) {
                                hhfVar.m();
                            } else {
                                hhfVar.g();
                                while (hhfVar.n()) {
                                    hev hevVarA = a(hhfVar, hbkVar);
                                    if (hevVarA != null) {
                                        arrayList3.add(hevVarA);
                                    }
                                }
                                hhfVar.i();
                            }
                        }
                        hfgVar = new hff(strF11, arrayList3, zO2);
                        hfeVar = hfgVar;
                    }
                    hhk.a("Unknown shape type ".concat(strF));
                } else {
                    if (strF.equals("tr")) {
                        hfeVar = hga.a(hhfVar, hbkVar);
                    }
                    hhk.a("Unknown shape type ".concat(strF));
                }
            } else {
                hevVar = null;
                if (strF.equals("sr")) {
                    boolean z = iB == 3;
                    ghd ghdVar11 = hgs.a;
                    boolean z2 = z;
                    int i10 = 0;
                    boolean zO13 = false;
                    String strF12 = null;
                    hei heiVarM7 = null;
                    hes hesVarB2 = null;
                    hei heiVarM8 = null;
                    hei heiVarL6 = null;
                    hei heiVarL7 = null;
                    hei heiVarM9 = null;
                    hei heiVarM10 = null;
                    while (hhfVar.n()) {
                        switch (hhfVar.q(hgs.a)) {
                            case 0:
                                strF12 = hhfVar.f();
                                break;
                            case 1:
                                int iB8 = hhfVar.b();
                                int[] iArr = {1, 2};
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= 2) {
                                        i10 = 0;
                                        break;
                                    } else {
                                        int i12 = iArr[i11];
                                        if (i12 == 0) {
                                            throw null;
                                        }
                                        if (i12 == iB8) {
                                            i10 = i12;
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            case 2:
                                heiVarM7 = hjs.m(hhfVar, hbkVar, false);
                                break;
                            case 3:
                                hesVarB2 = hfy.b(hhfVar, hbkVar);
                                break;
                            case 4:
                                heiVarM8 = hjs.m(hhfVar, hbkVar, false);
                                break;
                            case 5:
                                heiVarL7 = hjs.l(hhfVar, hbkVar);
                                break;
                            case 6:
                                heiVarM10 = hjs.m(hhfVar, hbkVar, false);
                                break;
                            case 7:
                                heiVarL6 = hjs.l(hhfVar, hbkVar);
                                break;
                            case 8:
                                heiVarM9 = hjs.m(hhfVar, hbkVar, false);
                                break;
                            case 9:
                                zO13 = hhfVar.o();
                                break;
                            case 10:
                                if (hhfVar.b() != 3) {
                                    z2 = false;
                                    break;
                                } else {
                                    z2 = true;
                                    break;
                                }
                            default:
                                hhfVar.l();
                                hhfVar.m();
                                break;
                        }
                    }
                    heuVar = new hez(strF12, i10, heiVarM7, hesVarB2, heiVarM8, heiVarL6, heiVarL7, heiVarM9, heiVarM10, zO13, z2);
                    hfeVar = heuVar;
                }
                hhk.a("Unknown shape type ".concat(strF));
            }
            hfeVar = hevVar;
        } else {
            hevVar = null;
            if (strF.equals("el")) {
                boolean z3 = iB == 3;
                ghd ghdVar12 = hgc.a;
                boolean z4 = z3;
                boolean zO14 = false;
                String strF13 = null;
                hes hesVarB3 = null;
                hem hemVarP6 = null;
                while (hhfVar.n()) {
                    int iQ14 = hhfVar.q(hgc.a);
                    if (iQ14 == 0) {
                        strF13 = hhfVar.f();
                    } else if (iQ14 == 1) {
                        hesVarB3 = hfy.b(hhfVar, hbkVar);
                    } else if (iQ14 == 2) {
                        hemVarP6 = hjs.p(hhfVar, hbkVar);
                    } else if (iQ14 == 3) {
                        zO14 = hhfVar.o();
                    } else if (iQ14 != 4) {
                        hhfVar.l();
                        hhfVar.m();
                    } else {
                        z4 = hhfVar.b() == 3;
                    }
                }
                heuVar = new heu(strF13, hesVarB3, hemVarP6, z4, zO14);
                hfeVar = heuVar;
            }
            hhk.a("Unknown shape type ".concat(strF));
            hfeVar = hevVar;
        }
        while (hhfVar.n()) {
            hhfVar.m();
        }
        hhfVar.j();
        return hfeVar;
    }
}
