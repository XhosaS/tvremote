package defpackage;

import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otv extends FileNotFoundException {
    public final oty a;

    public otv(vzb vzbVar) {
        oty otyVar;
        oua ouaVar;
        oty otyVar2;
        oua ouaVar2;
        oua ouaVar3;
        oua ouaVar4;
        int i = vzbVar.b;
        int iAM = a.aM(i);
        if (iAM == 0) {
            throw null;
        }
        int i2 = iAM - 1;
        int i3 = 1;
        if (i2 == 0) {
            otz otzVar = otz.a;
            if (i == 2) {
                int iBb = a.bb(((Integer) vzbVar.c).intValue());
                if (iBb != 0) {
                    i3 = iBb;
                }
            } else {
                i3 = 2;
            }
            switch (i3 - 2) {
                case 0:
                    ouaVar = oua.g;
                    break;
                case 1:
                    ouaVar = oua.a;
                    break;
                case 2:
                    ouaVar = oua.b;
                    break;
                case 3:
                    ouaVar = oua.c;
                    break;
                case 4:
                    ouaVar = oua.f;
                    break;
                case 5:
                    ouaVar = oua.d;
                    break;
                case 6:
                    ouaVar = oua.e;
                    break;
                default:
                    ouaVar = oua.g;
                    break;
            }
            otyVar = new oty(otzVar, ouaVar);
        } else if (i2 == 1) {
            otz otzVar2 = otz.b;
            if (i == 3) {
                int iAO = a.aO(((Integer) vzbVar.c).intValue());
                if (iAO != 0) {
                    i3 = iAO;
                }
            } else {
                i3 = 2;
            }
            switch (i3 - 2) {
                case 0:
                    ouaVar2 = oua.B;
                    break;
                case 1:
                    ouaVar2 = oua.u;
                    break;
                case 2:
                    ouaVar2 = oua.v;
                    break;
                case 3:
                    ouaVar2 = oua.w;
                    break;
                case 4:
                    ouaVar2 = oua.x;
                    break;
                case 5:
                    ouaVar2 = oua.y;
                    break;
                case 6:
                    ouaVar2 = oua.z;
                    break;
                case 7:
                    ouaVar2 = oua.A;
                    break;
                default:
                    ouaVar2 = oua.B;
                    break;
            }
            otyVar = new oty(otzVar2, ouaVar2);
        } else if (i2 == 2) {
            otz otzVar3 = otz.c;
            if (i == 4) {
                int iBb2 = a.bb(((Integer) vzbVar.c).intValue());
                if (iBb2 != 0) {
                    i3 = iBb2;
                }
            } else {
                i3 = 2;
            }
            switch (i3 - 2) {
                case 0:
                    ouaVar3 = oua.I;
                    break;
                case 1:
                    ouaVar3 = oua.C;
                    break;
                case 2:
                    ouaVar3 = oua.D;
                    break;
                case 3:
                    ouaVar3 = oua.E;
                    break;
                case 4:
                    ouaVar3 = oua.F;
                    break;
                case 5:
                    ouaVar3 = oua.G;
                    break;
                case 6:
                    ouaVar3 = oua.H;
                    break;
                default:
                    ouaVar3 = oua.I;
                    break;
            }
            otyVar = new oty(otzVar3, ouaVar3);
        } else {
            if (i2 != 3) {
                otyVar2 = new oty(otz.e, oua.J);
                this.a = otyVar2;
            }
            otz otzVar4 = otz.d;
            if (i == 5) {
                int iB = wae.b(((Integer) vzbVar.c).intValue());
                if (iB != 0) {
                    i3 = iB;
                }
            } else {
                i3 = 2;
            }
            switch (i3 - 2) {
                case 0:
                    ouaVar4 = oua.t;
                    break;
                case 1:
                    ouaVar4 = oua.h;
                    break;
                case 2:
                    ouaVar4 = oua.i;
                    break;
                case 3:
                    ouaVar4 = oua.j;
                    break;
                case 4:
                    ouaVar4 = oua.k;
                    break;
                case 5:
                    ouaVar4 = oua.l;
                    break;
                case 6:
                    ouaVar4 = oua.m;
                    break;
                case 7:
                    ouaVar4 = oua.n;
                    break;
                case 8:
                    ouaVar4 = oua.o;
                    break;
                case 9:
                    ouaVar4 = oua.p;
                    break;
                case 10:
                    ouaVar4 = oua.q;
                    break;
                case 11:
                    ouaVar4 = oua.r;
                    break;
                case 12:
                    ouaVar4 = oua.s;
                    break;
                default:
                    ouaVar4 = oua.t;
                    break;
            }
            otyVar = new oty(otzVar4, ouaVar4);
        }
        otyVar2 = otyVar;
        this.a = otyVar2;
    }
}
