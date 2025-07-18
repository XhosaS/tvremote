package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cke implements cka {
    private final bmn a;

    public cke(bmn bmnVar) {
        this.a = bmnVar;
    }

    @Override // defpackage.cka
    public final List a(brt brtVar) {
        final bna bnaVar;
        brl brlVar = (brl) brtVar;
        Object[] objArr = brlVar.c;
        String str = brlVar.b;
        int length = objArr != null ? objArr.length : 0;
        TreeMap treeMap = bna.a;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(length));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                bnaVar = (bna) entryCeilingEntry.getValue();
                bnaVar.b = str;
                bnaVar.h = length;
                bnaVar.getClass();
            } else {
                bnaVar = new bna(length);
                bnaVar.b = str;
                bnaVar.h = length;
            }
        }
        brl.a.a(new bmz(bnaVar), brlVar.c);
        String str2 = bnaVar.b;
        if (str2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final bmx bmxVar = new bmx(str2, new agux() { // from class: bmy
            @Override // defpackage.agux
            public final Object a(Object obj) {
                brj brjVar = (brj) obj;
                brjVar.getClass();
                bna bnaVar2 = bnaVar;
                int i = bnaVar2.h;
                if (i > 0) {
                    int i2 = 1;
                    while (true) {
                        int i3 = bnaVar2.g[i2];
                        if (i3 == 1) {
                            brjVar.h(i2);
                        } else if (i3 == 2) {
                            brjVar.g(i2, bnaVar2.c[i2]);
                        } else if (i3 == 3) {
                            brjVar.f(i2, bnaVar2.d[i2]);
                        } else if (i3 == 4) {
                            String str3 = bnaVar2.e[i2];
                            if (str3 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            brjVar.i(i2, str3);
                        } else if (i3 == 5) {
                            byte[] bArr = bnaVar2.f[i2];
                            if (bArr == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            brjVar.e(i2, bArr);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                return agpu.a;
            }
        });
        final String str3 = bmxVar.a;
        return (List) bpr.b(this.a, true, false, new agux() { // from class: ckc
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int iB;
                int i2;
                int i3;
                int iB2;
                int i4;
                long jB;
                int i5;
                int i6;
                int i7;
                int iB3;
                int i8;
                int i9;
                int i10;
                boolean z;
                int i11;
                int i12;
                int i13;
                boolean z2;
                int i14;
                int i15;
                int i16;
                boolean z3;
                int i17;
                int i18;
                int i19;
                boolean z4;
                int i20;
                int i21;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(str3);
                bmx bmxVar2 = bmxVar;
                cke ckeVar = this;
                try {
                    bmxVar2.b.a(brjVarA);
                    int iA = bpx.a(brjVarA, "id");
                    int iA2 = bpx.a(brjVarA, "state");
                    int iA3 = bpx.a(brjVarA, "output");
                    int iA4 = bpx.a(brjVarA, "initial_delay");
                    int iA5 = bpx.a(brjVarA, "interval_duration");
                    int iA6 = bpx.a(brjVarA, "flex_duration");
                    int iA7 = bpx.a(brjVarA, "run_attempt_count");
                    int iA8 = bpx.a(brjVarA, "backoff_policy");
                    int iA9 = bpx.a(brjVarA, "backoff_delay_duration");
                    int iA10 = bpx.a(brjVarA, "last_enqueue_time");
                    int iA11 = bpx.a(brjVarA, "period_count");
                    int iA12 = bpx.a(brjVarA, "generation");
                    int iA13 = bpx.a(brjVarA, "next_schedule_time_override");
                    int iA14 = bpx.a(brjVarA, "stop_reason");
                    int iA15 = bpx.a(brjVarA, "required_network_type");
                    int iA16 = bpx.a(brjVarA, "required_network_request");
                    int iA17 = bpx.a(brjVarA, "requires_charging");
                    int iA18 = bpx.a(brjVarA, "requires_device_idle");
                    int iA19 = bpx.a(brjVarA, "requires_battery_not_low");
                    int iA20 = bpx.a(brjVarA, "requires_storage_not_low");
                    int iA21 = bpx.a(brjVarA, "trigger_content_update_delay");
                    int iA22 = bpx.a(brjVarA, "trigger_max_content_delay");
                    int iA23 = bpx.a(brjVarA, "content_uri_triggers");
                    we weVar = new we();
                    int i22 = iA12;
                    we weVar2 = new we();
                    while (brjVarA.l()) {
                        int i23 = iA11;
                        String strD = brjVarA.d(iA);
                        if (weVar.containsKey(strD)) {
                            i21 = iA10;
                        } else {
                            i21 = iA10;
                            weVar.put(strD, new ArrayList());
                        }
                        String strD2 = brjVarA.d(iA);
                        if (!weVar2.containsKey(strD2)) {
                            weVar2.put(strD2, new ArrayList());
                        }
                        iA11 = i23;
                        iA10 = i21;
                    }
                    int i24 = iA10;
                    int i25 = iA11;
                    brjVarA.j();
                    ckeVar.c(bskVar, weVar);
                    ckeVar.b(bskVar, weVar2);
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        if (iA == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String strD3 = brjVarA.d(iA);
                        if (iA2 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        ccq ccqVarD = cms.d((int) brjVarA.b(iA2));
                        if (iA3 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        caz cazVarA = caz.a.a(brjVarA.m(iA3));
                        long jB2 = iA4 == -1 ? 0L : brjVarA.b(iA4);
                        long jB3 = iA5 == -1 ? 0L : brjVarA.b(iA5);
                        long jB4 = iA6 == -1 ? 0L : brjVarA.b(iA6);
                        int iB4 = iA7 == -1 ? 0 : (int) brjVarA.b(iA7);
                        if (iA8 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        int i26 = iA2;
                        cah cahVarC = cms.c((int) brjVarA.b(iA8));
                        long jB5 = iA9 == -1 ? 0L : brjVarA.b(iA9);
                        int i27 = i24;
                        long jB6 = i27 == -1 ? 0L : brjVarA.b(i27);
                        i24 = i27;
                        int i28 = i25;
                        if (i28 == -1) {
                            i = iA3;
                            iB = 0;
                            i2 = -1;
                        } else {
                            i = iA3;
                            iB = (int) brjVarA.b(i28);
                            i2 = -1;
                        }
                        int i29 = i22;
                        if (i29 == i2) {
                            i3 = iA4;
                            iB2 = 0;
                            i4 = i2;
                        } else {
                            i3 = iA4;
                            iB2 = (int) brjVarA.b(i29);
                            i4 = -1;
                        }
                        int i30 = iA13;
                        if (i30 == i4) {
                            int i31 = iA14;
                            i5 = i28;
                            i6 = i31;
                            jB = 0;
                        } else {
                            jB = brjVarA.b(i30);
                            int i32 = iA14;
                            i5 = i28;
                            i6 = i32;
                        }
                        if (i6 == i4) {
                            i7 = iA5;
                            iB3 = 0;
                            i8 = i4;
                        } else {
                            i7 = iA5;
                            iB3 = (int) brjVarA.b(i6);
                            i8 = -1;
                        }
                        int i33 = iA15;
                        if (i33 == i8) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int i34 = iA6;
                        int iK = cms.k((int) brjVarA.b(i33));
                        int i35 = iA16;
                        if (i35 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        cnh cnhVarE = cms.e(brjVarA.m(i35));
                        int i36 = i6;
                        int i37 = iA17;
                        if (i37 == -1) {
                            i9 = iA7;
                            z = false;
                            i11 = -1;
                            i10 = iA18;
                        } else {
                            i9 = iA7;
                            if (((int) brjVarA.b(i37)) != 0) {
                                z = true;
                                i10 = iA18;
                            } else {
                                i10 = iA18;
                                z = false;
                            }
                            i11 = -1;
                        }
                        if (i10 == i11) {
                            i12 = iA8;
                            z2 = false;
                            i14 = i11;
                            i13 = iA19;
                        } else {
                            i12 = iA8;
                            if (((int) brjVarA.b(i10)) != 0) {
                                z2 = true;
                                i13 = iA19;
                            } else {
                                i13 = iA19;
                                z2 = false;
                            }
                            i14 = -1;
                        }
                        if (i13 == i14) {
                            i15 = iA9;
                            z3 = false;
                            i17 = i14;
                            i16 = iA20;
                        } else {
                            i15 = iA9;
                            if (((int) brjVarA.b(i13)) != 0) {
                                z3 = true;
                                i16 = iA20;
                            } else {
                                i16 = iA20;
                                z3 = false;
                            }
                            i17 = -1;
                        }
                        if (i16 == i17) {
                            i18 = iB4;
                            z4 = false;
                            i20 = i17;
                            i19 = iA21;
                        } else {
                            i18 = iB4;
                            if (((int) brjVarA.b(i16)) != 0) {
                                z4 = true;
                                i19 = iA21;
                            } else {
                                i19 = iA21;
                                z4 = false;
                            }
                            i20 = -1;
                        }
                        long jB7 = i19 == i20 ? 0L : brjVarA.b(i19);
                        int i38 = iA22;
                        long jB8 = i38 == i20 ? 0L : brjVarA.b(i38);
                        iA22 = i38;
                        int i39 = iA23;
                        if (i39 == i20) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        caq caqVar = new caq(cnhVarE, iK, z, z2, z3, z4, jB7, jB8, cms.f(brjVarA.m(i39)));
                        Object objA = agrj.a(weVar, brjVarA.d(iA));
                        objA.getClass();
                        List list = (List) objA;
                        Object objA2 = agrj.a(weVar2, brjVarA.d(iA));
                        objA2.getClass();
                        arrayList.add(new clc(strD3, ccqVarD, cazVarA, jB2, jB3, jB4, caqVar, i18, cahVarC, jB5, jB6, iB, iB2, jB, iB3, list, (List) objA2));
                        iA23 = i39;
                        iA20 = i16;
                        iA21 = i19;
                        iA8 = i12;
                        iA9 = i15;
                        iA18 = i10;
                        iA19 = i13;
                        iA6 = i34;
                        iA7 = i9;
                        iA15 = i33;
                        iA17 = i37;
                        iA4 = i3;
                        i22 = i29;
                        iA16 = i35;
                        iA2 = i26;
                        iA5 = i7;
                        iA13 = i30;
                        iA3 = i;
                        i25 = i5;
                        iA14 = i36;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    public final void b(final bsk bskVar, we weVar) {
        Set setKeySet = weVar.keySet();
        we weVar2 = ((wa) setKeySet).a;
        if (weVar2.isEmpty()) {
            return;
        }
        if (weVar.d > 999) {
            bpu.a(weVar, new agux() { // from class: ckb
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    we weVar3 = (we) obj;
                    weVar3.getClass();
                    this.a.b(bskVar, weVar3);
                    return agpu.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        bqb.a(sb, weVar2.d);
        sb.append(")");
        brj brjVarA = bskVar.a(sb.toString());
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            brjVarA.i(i, (String) it.next());
            i++;
        }
        try {
            int iA = bpx.a(brjVarA, "work_spec_id");
            if (iA != -1) {
                while (brjVarA.l()) {
                    List list = (List) weVar.get(brjVarA.d(iA));
                    if (list != null) {
                        list.add(caz.a.a(brjVarA.m(0)));
                    }
                }
            }
        } finally {
            brjVarA.close();
        }
    }

    public final void c(final bsk bskVar, we weVar) {
        Set setKeySet = weVar.keySet();
        we weVar2 = ((wa) setKeySet).a;
        if (weVar2.isEmpty()) {
            return;
        }
        if (weVar.d > 999) {
            bpu.a(weVar, new agux() { // from class: ckd
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    we weVar3 = (we) obj;
                    weVar3.getClass();
                    this.a.c(bskVar, weVar3);
                    return agpu.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        bqb.a(sb, weVar2.d);
        sb.append(")");
        brj brjVarA = bskVar.a(sb.toString());
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            brjVarA.i(i, (String) it.next());
            i++;
        }
        try {
            int iA = bpx.a(brjVarA, "work_spec_id");
            if (iA != -1) {
                while (brjVarA.l()) {
                    List list = (List) weVar.get(brjVarA.d(iA));
                    if (list != null) {
                        list.add(brjVarA.d(0));
                    }
                }
            }
        } finally {
            brjVarA.close();
        }
    }
}
