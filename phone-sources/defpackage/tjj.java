package defpackage;

import android.os.Build;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tjj {
    public final tjk a;
    public final zft b;

    public tjj(tjk tjkVar, zft zftVar) {
        this.a = tjkVar;
        this.b = zftVar;
    }

    public void a(Exception exc) {
        this.a.c(new rmz(this, exc, 17));
    }

    public final void b() {
        this.a.c(new tci(this, 10));
    }

    public final void c() {
        this.a.c(new tci(this, 8));
    }

    public void d() {
        this.a.c(new tci(this, 9));
    }

    public final void e(Exception exc) {
        this.a.c(new rmz(this, exc, 16));
    }

    public final void f(final tnq tnqVar) {
        this.a.c(new Runnable() { // from class: tji
            @Override // java.lang.Runnable
            public final void run() {
                ImmutableList immutableList;
                tnq tnqVar2 = tnqVar;
                int i = tnqVar2.b;
                int iG = sis.g(i);
                if (iG == 0) {
                    throw null;
                }
                int i2 = iG - 1;
                Object obj = this.a.b.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        tlx tlxVar = (tlx) obj;
                        if (tlxVar.f != 3) {
                            tlxVar.g.f();
                            return;
                        } else {
                            tlxVar.f = 4;
                            tlxVar.h.g(tmc.CONNECTED);
                        }
                    }
                    tlx tlxVar2 = (tlx) obj;
                    if ((tlxVar2.f == 4 || tnqVar2.b == 3) && (immutableList = tlxVar2.b) != null) {
                        UnmodifiableIterator it = immutableList.iterator();
                        while (it.hasNext()) {
                            ((tma) it.next()).a(tnqVar2);
                        }
                        return;
                    }
                    return;
                }
                tlx tlxVar3 = (tlx) obj;
                if (tlxVar3.f != 2) {
                    tlxVar3.g.f();
                    return;
                }
                tno tnoVar = i == 1 ? (tno) tnqVar2.c : tno.b;
                tlxVar3.f = 3;
                tmp tmpVar = tnoVar.d;
                if (tmpVar == null) {
                    tmpVar = tmp.a;
                }
                tug tugVar = (tug) ((tug) tlx.a.e()).j("com/google/android/tv/remote/virtual/client/MessageProcessor", "handleMessage", 85, "MessageProcessor.java");
                StringBuilder sb = new StringBuilder("device_model='");
                sb.append(tmpVar.c);
                sb.append("' device_manufacturer=");
                sb.append(tmpVar.d);
                if ((tmpVar.b & 4) != 0) {
                    int iBm = a.bm(tmpVar.e);
                    if (iBm == 0) {
                        iBm = 1;
                    }
                    int i3 = iBm - 1;
                    String str = i3 != 0 ? i3 != 1 ? "ios" : "android" : "unspecified";
                    sb.append(" os=");
                    sb.append(str);
                }
                sb.append(" os_version=");
                sb.append(tmpVar.f);
                sb.append(" app_name=");
                sb.append(tmpVar.g);
                sb.append(" app_version=");
                sb.append(tmpVar.h);
                tugVar.v("Build information received: %s", sb.toString());
                int i4 = tnoVar.c;
                tmf tmfVar = tmf.INPUT;
                EnumSet enumSetNoneOf = EnumSet.noneOf(tmf.class);
                while (i4 != 0) {
                    int i5 = (-i4) & i4;
                    tmf tmfVar2 = (tmf) tmf.j.get(Integer.valueOf(i5));
                    if (tmfVar2 != null) {
                        enumSetNoneOf.add(tmfVar2);
                    }
                    i4 -= i5;
                }
                ImmutableSet immutableSetImmutableEnumSet = Sets.immutableEnumSet(enumSetNoneOf);
                pku pkuVar = tlxVar3.h;
                immutableSetImmutableEnumSet.getClass();
                tnoVar.getClass();
                iwu iwuVar = (iwu) pkuVar.a;
                iwuVar.m = yfm.al(immutableSetImmutableEnumSet);
                ArrayList<tlq> arrayList = new ArrayList();
                tlw tlwVar = !immutableSetImmutableEnumSet.contains(tmf.INPUT) ? null : new tlw();
                if (tlwVar != null) {
                    arrayList.add(tlwVar);
                    iwuVar.i = tlwVar;
                }
                tlz tlzVar = !immutableSetImmutableEnumSet.contains(tmf.POWER) ? null : new tlz(iwuVar.v);
                if (tlzVar != null) {
                    arrayList.add(tlzVar);
                }
                tlm tlmVar = iwuVar.q;
                tlmVar.c = !immutableSetImmutableEnumSet.contains(tmf.VOICE) ? null : new tmi(tlmVar, immutableSetImmutableEnumSet.contains(tmf.PTT_ASSISTANT), tnoVar);
                tmi tmiVar = tlmVar.c;
                if (tmiVar != null) {
                    arrayList.add(tmiVar);
                }
                tmk tmkVar = !immutableSetImmutableEnumSet.contains(tmf.VOLUME) ? null : new tmk(iwuVar.t);
                if (tmkVar != null) {
                    arrayList.add(tmkVar);
                }
                tlu tluVar = !immutableSetImmutableEnumSet.contains(tmf.IME) ? null : new tlu(new zft(iwuVar.r, null));
                if (tluVar != null) {
                    arrayList.add(tluVar);
                    iwuVar.j = tluVar;
                }
                tlp tlpVar = !immutableSetImmutableEnumSet.contains(tmf.APP_LINK) ? null : new tlp();
                if (tlpVar != null) {
                    arrayList.add(tlpVar);
                    iwuVar.k = tlpVar;
                }
                tls tlsVar = immutableSetImmutableEnumSet.contains(tmf.FIND_MY_REMOTE) ? new tls() : null;
                if (tlsVar != null) {
                    arrayList.add(tlsVar);
                    iwuVar.l = tlsVar;
                }
                ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(arrayList.size() + 1);
                builderBuilderWithExpectedSize.add((ImmutableList.Builder) new tly(tlxVar3));
                for (tlq tlqVar : arrayList) {
                    if (tlqVar != null) {
                        tlxVar3.d |= tmf.a(tlqVar.a());
                        tlxVar3.e |= tmf.a(tlqVar.c());
                        tma tmaVarB = tlqVar.b(tlxVar3);
                        if (tmaVarB != null) {
                            builderBuilderWithExpectedSize.add((ImmutableList.Builder) tmaVarB);
                        }
                    }
                }
                tlxVar3.b = builderBuilderWithExpectedSize.build();
                vtw vtwVarM = tms.a.m();
                vtw vtwVarM2 = tmq.a.m();
                int i6 = tlxVar3.d | tlxVar3.e;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                tmq tmqVar = (tmq) vtwVarM2.b;
                tmqVar.b |= 1;
                tmqVar.c = i6;
                vtw vtwVarM3 = tmp.a.m();
                String str2 = Build.MODEL;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                tmp tmpVar2 = (tmp) vtwVarM3.b;
                str2.getClass();
                tmpVar2.b |= 1;
                tmpVar2.c = str2;
                String str3 = Build.MANUFACTURER;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar = vtwVarM3.b;
                tmp tmpVar3 = (tmp) vucVar;
                str3.getClass();
                tmpVar3.b |= 2;
                tmpVar3.d = str3;
                if (!vucVar.A()) {
                    vtwVarM3.u();
                }
                tmp tmpVar4 = (tmp) vtwVarM3.b;
                tmpVar4.e = 1;
                tmpVar4.b |= 4;
                String str4 = Build.VERSION.RELEASE;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar2 = vtwVarM3.b;
                tmp tmpVar5 = (tmp) vucVar2;
                str4.getClass();
                tmpVar5.b |= 8;
                tmpVar5.f = str4;
                String str5 = sis.a;
                if (str5 != null) {
                    if (!vucVar2.A()) {
                        vtwVarM3.u();
                    }
                    tmp tmpVar6 = (tmp) vtwVarM3.b;
                    tmpVar6.b |= 16;
                    tmpVar6.g = str5;
                }
                String str6 = sis.b;
                if (str6 != null) {
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    tmp tmpVar7 = (tmp) vtwVarM3.b;
                    tmpVar7.b |= 32;
                    tmpVar7.h = str6;
                }
                tmp tmpVar8 = (tmp) vtwVarM3.r();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                tmq tmqVar2 = (tmq) vtwVarM2.b;
                tmpVar8.getClass();
                tmqVar2.d = tmpVar8;
                tmqVar2.b |= 2;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                tms tmsVar = (tms) vtwVarM.b;
                tmq tmqVar3 = (tmq) vtwVarM2.r();
                tmqVar3.getClass();
                tmsVar.c = tmqVar3;
                tmsVar.b = 1;
                tlxVar3.a((tms) vtwVarM.r());
            }
        });
    }

    public tjj(tjk tjkVar, zft zftVar, byte[] bArr) {
        this(tjkVar, zftVar);
    }
}
