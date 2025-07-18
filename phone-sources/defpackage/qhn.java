package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhn implements qhm {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final ntp c;

    public qhn(Context context, ntp ntpVar, qpr qprVar) {
        ntpVar.getClass();
        this.b = context;
        this.c = ntpVar;
        qprVar.a(context);
    }

    @Override // defpackage.qhm
    public final void a(qhs qhsVar) throws PackageManager.NameNotFoundException {
        qen qenVarA;
        String strSubstring;
        int i;
        vtw vtwVarM = vhb.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = vha.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = vgz.a.m();
        vtwVarM3.getClass();
        DesugarCollections.unmodifiableList(((vgz) vtwVarM3.b).c).getClass();
        vtwVarM3.az(qhsVar.m);
        String str = qhsVar.d.a;
        str.getClass();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vgz vgzVar = (vgz) vtwVarM3.b;
        int i2 = 1;
        vgzVar.b |= 1;
        vgzVar.d = str;
        qmt qmtVar = qhsVar.f;
        if (qhsVar.h != null || TextUtils.isEmpty(qhsVar.o)) {
            qenVarA = qhsVar.h;
        } else {
            qem qemVarA = qen.a();
            qemVarA.b(qqn.a);
            qemVarA.f = qhsVar.o;
            qenVarA = qemVarA.a();
        }
        vic vicVarA = qmtVar.a(qenVarA);
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vgz vgzVar2 = (vgz) vtwVarM3.b;
        vgzVar2.i = vicVarA;
        vgzVar2.b |= 32;
        qpf qpfVar = (qpf) qhsVar.g;
        vkh vkhVarB = qpfVar.b();
        vtw vtwVarM4 = vhx.a.m();
        vtwVarM4.getClass();
        vfi.e(qpfVar.d(), vtwVarM4);
        String id = TimeZone.getDefault().getID();
        id.getClass();
        vfi.f(id, vtwVarM4);
        vtw vtwVarM5 = vhw.a.m();
        vtwVarM5.getClass();
        vfi.n(vkhVarB.c, vtwVarM5);
        String str2 = vkhVarB.f;
        str2.getClass();
        vfi.j(str2, vtwVarM5);
        String str3 = vkhVarB.g;
        str3.getClass();
        vfi.k(str3, vtwVarM5);
        vfi.h(vkhVarB.k, vtwVarM5);
        vfi.x(vtwVarM5);
        String str4 = vkhVarB.e;
        str4.getClass();
        vfi.r(str4, vtwVarM5);
        qos qosVar = qos.a;
        vkb vkbVarB = vkb.b(vkhVarB.p);
        if (vkbVarB == null) {
            vkbVarB = vkb.APP_BLOCK_STATE_UNKNOWN;
        }
        vhu vhuVar = (vhu) qosVar.convert(vkbVarB);
        if (vhuVar != null) {
            vfi.i(vhuVar, vtwVarM5);
        }
        vfi.u(true != a.Z(qpfVar.a) ? 2 : 3, vtwVarM5);
        String str5 = vkhVarB.h;
        str5.getClass();
        if (str5.length() > 0) {
            String str6 = vkhVarB.h;
            str6.getClass();
            vfi.q(str6, vtwVarM5);
        }
        String str7 = vkhVarB.i;
        str7.getClass();
        if (str7.length() > 0) {
            String str8 = vkhVarB.i;
            str8.getClass();
            vfi.o(str8, vtwVarM5);
        }
        String str9 = vkhVarB.j;
        str9.getClass();
        if (str9.length() > 0) {
            String str10 = vkhVarB.j;
            str10.getClass();
            vfi.p(str10, vtwVarM5);
        }
        String str11 = vkhVarB.l;
        str11.getClass();
        if (str11.length() > 0) {
            String str12 = vkhVarB.l;
            str12.getClass();
            vfi.m(str12, vtwVarM5);
        }
        String str13 = vkhVarB.q;
        str13.getClass();
        if (str13.length() > 0) {
            String str14 = vkhVarB.q;
            str14.getClass();
            vfi.l(str14, vtwVarM5);
        }
        DesugarCollections.unmodifiableList(((vhw) vtwVarM5.b).m).getClass();
        vun<vke> vunVar = vkhVarB.n;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (vke vkeVar : vunVar) {
            int i3 = i2;
            vtw vtwVarM6 = vgv.a.m();
            vtwVarM6.getClass();
            String str15 = vkeVar.c;
            str15.getClass();
            if (!vtwVarM6.b.A()) {
                vtwVarM6.u();
            }
            vgv vgvVar = (vgv) vtwVarM6.b;
            vgvVar.b |= 1;
            vgvVar.c = str15;
            qpa qpaVar = qpa.a;
            vkd vkdVarB = vkd.b(vkeVar.e);
            if (vkdVarB == null) {
                vkdVarB = vkd.IMPORTANCE_UNSPECIFIED;
            }
            vgu vguVar = (vgu) qpaVar.convert(vkdVarB);
            if (vguVar != null) {
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                vgv vgvVar2 = (vgv) vtwVarM6.b;
                vgvVar2.e = vguVar.h;
                vgvVar2.b |= 4;
            }
            qoy qoyVar = qoy.a;
            vkc vkcVarB = vkc.b(vkeVar.f);
            if (vkcVarB == null) {
                vkcVarB = vkc.UNSPECIFIED;
            }
            vgt vgtVar = (vgt) qoyVar.convert(vkcVarB);
            if (vgtVar != null) {
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                vgv vgvVar3 = (vgv) vtwVarM6.b;
                vgvVar3.f = vgtVar.d;
                vgvVar3.b |= 8;
            }
            String str16 = vkeVar.d;
            str16.getClass();
            if (str16.length() > 0) {
                String str17 = vkeVar.d;
                str17.getClass();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                vgv vgvVar4 = (vgv) vtwVarM6.b;
                vgvVar4.b |= 2;
                vgvVar4.d = str17;
            }
            vuc vucVarR = vtwVarM6.r();
            vucVarR.getClass();
            arrayList.add((vgv) vucVarR);
            i2 = i3;
        }
        int i4 = i2;
        vfi.s(arrayList, vtwVarM5);
        DesugarCollections.unmodifiableList(((vhw) vtwVarM5.b).n).getClass();
        vun<vkg> vunVar2 = vkhVarB.o;
        vunVar2.getClass();
        ArrayList arrayList2 = new ArrayList(yfm.z(vunVar2, 10));
        for (vkg vkgVar : vunVar2) {
            vtw vtwVarM7 = vgs.a.m();
            vtwVarM7.getClass();
            String str18 = vkgVar.c;
            str18.getClass();
            if (!vtwVarM7.b.A()) {
                vtwVarM7.u();
            }
            vgs vgsVar = (vgs) vtwVarM7.b;
            vgsVar.b |= 1;
            vgsVar.c = str18;
            qoz qozVar = qoz.a;
            vkf vkfVarB = vkf.b(vkgVar.d);
            if (vkfVarB == null) {
                vkfVarB = vkf.CHANNEL_GROUP_UNKNOWN;
            }
            vgr vgrVar = (vgr) qozVar.convert(vkfVarB);
            if (vgrVar != null) {
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                vgs vgsVar2 = (vgs) vtwVarM7.b;
                vgsVar2.d = vgrVar.d;
                vgsVar2.b |= 2;
            }
            vuc vucVarR2 = vtwVarM7.r();
            vucVarR2.getClass();
            arrayList2.add((vgs) vucVarR2);
        }
        vfi.t(arrayList2, vtwVarM5);
        vfi.d(vfi.g(vtwVarM5), vtwVarM4);
        vhx vhxVarC = vfi.c(vtwVarM4);
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar = vtwVarM3.b;
        vgz vgzVar3 = (vgz) vucVar;
        vgzVar3.h = vhxVarC;
        vgzVar3.b |= 16;
        long j = qhsVar.n;
        if (!vucVar.A()) {
            vtwVarM3.u();
        }
        vgz vgzVar4 = (vgz) vtwVarM3.b;
        vgzVar4.b |= 256;
        vgzVar4.k = j;
        vhi vhiVar = qhsVar.l;
        if (vhiVar != null) {
            vtw vtwVarM8 = vhg.a.m();
            vtwVarM8.getClass();
            if (!vtwVarM8.b.A()) {
                vtwVarM8.u();
            }
            vhg vhgVar = (vhg) vtwVarM8.b;
            vhgVar.c = vhiVar;
            vhgVar.b |= 1;
            vuc vucVarR3 = vtwVarM8.r();
            vucVarR3.getClass();
            vhg vhgVar2 = (vhg) vucVarR3;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vgz vgzVar5 = (vgz) vtwVarM3.b;
            vgzVar5.j = vhgVar2;
            vgzVar5.b |= 64;
        }
        String str19 = qhsVar.i;
        if (!TextUtils.isEmpty(str19)) {
            if (str19 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ves.b(str19, vtwVarM3);
        }
        String str20 = qhsVar.j;
        if (!TextUtils.isEmpty(str20)) {
            if (str20 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vgz vgzVar6 = (vgz) vtwVarM3.b;
            vgzVar6.b |= 4;
            vgzVar6.f = str20;
        }
        String str21 = qhsVar.k;
        if (!TextUtils.isEmpty(str21)) {
            if (str21 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ves.b(str21, vtwVarM3);
        }
        Long l = qhsVar.q;
        if (l != null) {
            long jLongValue = l.longValue();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vgz vgzVar7 = (vgz) vtwVarM3.b;
            vgzVar7.b |= 8;
            vgzVar7.g = jLongValue;
        }
        String str22 = qhsVar.r;
        if (str22 != null && str22.length() != 0) {
            vtw vtwVarM9 = vgx.a.m();
            vtwVarM9.getClass();
            if (!vtwVarM9.b.A()) {
                vtwVarM9.u();
            }
            vgx vgxVar = (vgx) vtwVarM9.b;
            vgxVar.b |= 1;
            vgxVar.c = str22;
            vuc vucVarR4 = vtwVarM9.r();
            vucVarR4.getClass();
            vgx vgxVar2 = (vgx) vucVarR4;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vgz vgzVar8 = (vgz) vtwVarM3.b;
            vgzVar8.n = vgxVar2;
            vgzVar8.b |= 8192;
        }
        vuc vucVarR5 = vtwVarM3.r();
        vucVarR5.getClass();
        vgz vgzVar9 = (vgz) vucVarR5;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vha vhaVar = (vha) vtwVarM2.b;
        vhaVar.e = vgzVar9;
        vhaVar.b |= 1;
        vie vieVar = qhsVar.a;
        if (vieVar != null) {
            vtw vtwVarM10 = vii.a.m();
            vtwVarM10.getClass();
            if (!vtwVarM10.b.A()) {
                vtwVarM10.u();
            }
            vuc vucVar2 = vtwVarM10.b;
            vii viiVar = (vii) vucVar2;
            viiVar.c = vieVar.ab;
            viiVar.b |= 1;
            int i5 = qhsVar.v;
            if (i5 != 0) {
                if (!vucVar2.A()) {
                    vtwVarM10.u();
                }
                vii viiVar2 = (vii) vtwVarM10.b;
                viiVar2.g = i5 - 1;
                viiVar2.b |= 64;
            }
            vuc vucVarR6 = vtwVarM10.r();
            vucVarR6.getClass();
            vii viiVar3 = (vii) vucVarR6;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vha vhaVar2 = (vha) vtwVarM2.b;
            vhaVar2.d = viiVar3;
            vhaVar2.c = 2;
        } else {
            vhq vhqVar = qhsVar.b;
            if (vhqVar != null) {
                vtw vtwVarM11 = vhs.a.m();
                vtwVarM11.getClass();
                if (!vtwVarM11.b.A()) {
                    vtwVarM11.u();
                }
                vuc vucVar3 = vtwVarM11.b;
                vhs vhsVar = (vhs) vucVar3;
                vhsVar.c = vhqVar.ak;
                vhsVar.b |= 1;
                int i6 = qhsVar.w;
                if (i6 != 0) {
                    if (!vucVar3.A()) {
                        vtwVarM11.u();
                    }
                    vhs vhsVar2 = (vhs) vtwVarM11.b;
                    vhsVar2.h = i6 - 1;
                    vhsVar2.b |= 256;
                }
                String str23 = qhsVar.p;
                if (str23 != null) {
                    if (!vtwVarM11.b.A()) {
                        vtwVarM11.u();
                    }
                    vhs vhsVar3 = (vhs) vtwVarM11.b;
                    vhsVar3.b |= 32;
                    vhsVar3.g = str23;
                }
                vuc vucVarR7 = vtwVarM11.r();
                vucVarR7.getClass();
                vhs vhsVar4 = (vhs) vucVarR7;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vha vhaVar3 = (vha) vtwVarM2.b;
                vhaVar3.d = vhsVar4;
                vhaVar3.c = 3;
            } else {
                int i7 = qhsVar.u;
                if (i7 != 0) {
                    vtw vtwVarM12 = via.a.m();
                    vtwVarM12.getClass();
                    if (!vtwVarM12.b.A()) {
                        vtwVarM12.u();
                    }
                    via viaVar = (via) vtwVarM12.b;
                    viaVar.c = i7 - 1;
                    viaVar.b |= 1;
                    vuc vucVarR8 = vtwVarM12.r();
                    vucVarR8.getClass();
                    via viaVar2 = (via) vucVarR8;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vha vhaVar4 = (vha) vtwVarM2.b;
                    vhaVar4.d = viaVar2;
                    vhaVar4.c = 4;
                } else {
                    Throwable cause = qhsVar.c;
                    if (cause == null) {
                        throw new IllegalStateException("GnpLogEvent must have interactionType, failureType, systemEventType, or exception.");
                    }
                    vtw vtwVarM13 = vhe.a.m();
                    vtwVarM13.getClass();
                    while (cause != null) {
                        DesugarCollections.unmodifiableList(((vhe) vtwVarM13.b).d).getClass();
                        vtw vtwVarM14 = vhd.a.m();
                        vtwVarM14.getClass();
                        String simpleName = cause.getClass().getSimpleName();
                        simpleName.getClass();
                        if (!vtwVarM14.b.A()) {
                            vtwVarM14.u();
                        }
                        vhd vhdVar = (vhd) vtwVarM14.b;
                        vhdVar.b |= 1;
                        vhdVar.c = simpleName;
                        String message = cause.getMessage();
                        if (message != null) {
                            strSubstring = message.substring(0, Math.min(message.length(), 200));
                            strSubstring.getClass();
                        } else {
                            strSubstring = "";
                        }
                        strSubstring.getClass();
                        if (!vtwVarM14.b.A()) {
                            vtwVarM14.u();
                        }
                        vhd vhdVar2 = (vhd) vtwVarM14.b;
                        vhdVar2.b |= 2;
                        vhdVar2.d = strSubstring;
                        vuc vucVarR9 = vtwVarM14.r();
                        vucVarR9.getClass();
                        vhd vhdVar3 = (vhd) vucVarR9;
                        if (!vtwVarM13.b.A()) {
                            vtwVarM13.u();
                        }
                        vhe vheVar = (vhe) vtwVarM13.b;
                        vun vunVar3 = vheVar.d;
                        if (!vunVar3.c()) {
                            vheVar.d = vuc.s(vunVar3);
                        }
                        vheVar.d.add(vhdVar3);
                        cause = cause.getCause();
                    }
                    if (!vtwVarM13.b.A()) {
                        vtwVarM13.u();
                    }
                    vhe vheVar2 = (vhe) vtwVarM13.b;
                    vheVar2.c = 2;
                    vheVar2.b |= 1;
                    vuc vucVarR10 = vtwVarM13.r();
                    vucVarR10.getClass();
                    vhe vheVar3 = (vhe) vucVarR10;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vha vhaVar5 = (vha) vtwVarM2.b;
                    vhaVar5.d = vheVar3;
                    vhaVar5.c = 6;
                }
            }
        }
        vuc vucVarR11 = vtwVarM2.r();
        vucVarR11.getClass();
        vha vhaVar6 = (vha) vucVarR11;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vhb vhbVar = (vhb) vtwVarM.b;
        vhbVar.c = vhaVar6;
        vhbVar.b |= 2;
        int iOrdinal = qhsVar.e.ordinal();
        if (iOrdinal == 0) {
            i = 4;
        } else if (iOrdinal == i4) {
            i = 3;
        } else if (iOrdinal == 2) {
            i = 14;
        } else if (iOrdinal == 3) {
            i = 13;
        } else if (iOrdinal == 4) {
            i = 15;
        } else {
            if (iOrdinal != 5) {
                throw new yfu();
            }
            i = 2;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vhb vhbVar2 = (vhb) vtwVarM.b;
        vhbVar2.d = i - 1;
        vhbVar2.b |= 4;
        vuc vucVarR12 = vtwVarM.r();
        vucVarR12.getClass();
        vhb vhbVar3 = (vhb) vucVarR12;
        String str24 = qhsVar.s;
        nsy nsyVarH = (str24 == null ? this.c.k() : this.c.j("CHIME", str24)).h(vhbVar3, osr.b(this.b, new vgw()));
        if (!qhsVar.t.isEmpty()) {
            nsyVarH.e(yfm.at(qhsVar.t));
        }
        nsyVarH.c();
        a.l().v("GNP ClearCut log [%s]", vhbVar3);
    }
}
