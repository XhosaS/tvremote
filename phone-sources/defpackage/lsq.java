package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lsq implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ lsq(int i) {
        this.a = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        lay layVar;
        int i = 5;
        int i2 = 15;
        boolean z = false;
        switch (this.a) {
            case 0:
                vtw vtwVarM = kzk.a.m();
                String str = ((val) obj).c;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                kzk kzkVar = (kzk) vtwVarM.b;
                str.getClass();
                kzkVar.b = str;
                break;
            case 1:
                vtw vtwVarM2 = laa.a.m();
                String str2 = ((val) obj).c;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                laa laaVar = (laa) vtwVarM2.b;
                str2.getClass();
                laaVar.b = str2;
                break;
            case 2:
                vtw vtwVarM3 = lcp.a.m();
                String str3 = ((val) obj).c;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                lcp lcpVar = (lcp) vtwVarM3.b;
                str3.getClass();
                lcpVar.b = str3;
                break;
            case 3:
                val valVar = ((vzg) obj).b;
                if (valVar == null) {
                    break;
                }
                break;
            case 4:
                val valVar2 = ((vzw) obj).b;
                if (valVar2 == null) {
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                wch wchVar = (wch) obj;
                int iAs = a.as(wchVar.c);
                boolean z2 = iAs != 0 && iAs == 3;
                int i3 = wchVar.b;
                if (i3 == 0) {
                    i2 = 2;
                } else if (i3 != 2) {
                    switch (i3) {
                        case 6:
                            i2 = 8;
                            break;
                        case 7:
                            i2 = 9;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        case 9:
                            i2 = 11;
                            break;
                        case 10:
                            i2 = 12;
                            break;
                        case 11:
                            i2 = 13;
                            break;
                        case 12:
                            i2 = 14;
                            break;
                        case 13:
                            break;
                        case 14:
                            i2 = 16;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                } else {
                    i2 = 4;
                }
                if (i2 == 0) {
                    i2 = 1;
                }
                int i4 = i2 - 2;
                if (i4 != 2) {
                    switch (i4) {
                        case 6:
                            i = 1;
                            break;
                        case 7:
                            i = 4;
                            break;
                        case 8:
                            break;
                        case 9:
                            i = 3;
                            break;
                        case 10:
                            i = 6;
                            break;
                        case 11:
                            i = 10;
                            break;
                        case 12:
                            i = 8;
                            break;
                        case 13:
                            i = 9;
                            break;
                        case 14:
                            i = 7;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = 2;
                }
                break;
            case 7:
                wbd wbdVar = (wbd) obj;
                vtw vtwVarM4 = laz.a.m();
                int iAs2 = a.as(wbdVar.c);
                if (iAs2 != 0 && iAs2 == 3) {
                    z = true;
                }
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                ((laz) vtwVarM4.b).c = z;
                int iAX = a.aX(wbdVar.d);
                if (iAX != 0 && iAX == 3) {
                    vtw vtwVarM5 = lay.a.m();
                    if (!vtwVarM5.b.A()) {
                        vtwVarM5.u();
                    }
                    ((lay) vtwVarM5.b).b = a.aG(5);
                    layVar = (lay) vtwVarM5.r();
                } else {
                    layVar = lay.a;
                }
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                laz lazVar = (laz) vtwVarM4.b;
                layVar.getClass();
                lazVar.d = layVar;
                lazVar.b |= 1;
                vwe vweVar = wbdVar.e;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                long j = vweVar.b;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                ((laz) vtwVarM4.b).e = j;
                vtl vtlVar = wbdVar.f;
                if (vtlVar == null) {
                    vtlVar = vtl.a;
                }
                long j2 = vtlVar.b;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                ((laz) vtwVarM4.b).f = j2;
                break;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                vtw vtwVarM6 = lab.a.m();
                String str4 = (String) entry.getKey();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                lab labVar = (lab) vtwVarM6.b;
                str4.getClass();
                labVar.b = str4;
                String str5 = (String) entry.getValue();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                lab labVar2 = (lab) vtwVarM6.b;
                str5.getClass();
                labVar2.c = str5;
                break;
            case 9:
                vaj vajVar = (vaj) obj;
                if (vajVar.b != 15) {
                    break;
                } else {
                    break;
                }
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                ofq ofqVar = ofr.a;
                break;
            case 18:
                ofq ofqVar2 = ofr.a;
                break;
            case 19:
                ofx ofxVar = ofy.a;
                break;
            default:
                ofx ofxVar2 = ofy.a;
                break;
        }
        return osk.r(true);
    }
}
