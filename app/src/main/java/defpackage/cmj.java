package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmj implements cle {
    public final bku a = new cmi();
    private final bmn b;

    public cmj(bmn bmnVar) {
        this.b = bmnVar;
    }

    @Override // defpackage.cle
    public final void A(final String str) {
        str.getClass();
        ((Number) bpr.b(this.b, false, true, new agux() { // from class: clz
            public final /* synthetic */ String a = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    int iA = bpv.a(bskVar);
                    brjVarA.close();
                    return Integer.valueOf(iA);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.cle
    public final void B(final ccq ccqVar, final String str) {
        ccqVar.getClass();
        str.getClass();
        ((Number) bpr.b(this.b, false, true, new agux() { // from class: cmd
            public final /* synthetic */ String a = "UPDATE workspec SET state=? WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                ccq ccqVar2 = ccqVar;
                String str2 = str;
                try {
                    brjVarA.g(1, cms.b(ccqVar2));
                    brjVarA.i(2, str2);
                    brjVarA.l();
                    int iA = bpv.a(bskVar);
                    brjVarA.close();
                    return Integer.valueOf(iA);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.cle
    public final List C() {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: clv
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.g(1, 20L);
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        int i3 = iB14;
                        ArrayList arrayList2 = arrayList;
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(i3);
                        int i4 = iB15;
                        long jB7 = brjVarA.b(i4);
                        int i5 = iB;
                        int i6 = iB16;
                        int i7 = iB2;
                        boolean z = ((int) brjVarA.b(i6)) != 0;
                        int i8 = iB17;
                        int i9 = iB3;
                        int iL = cms.l((int) brjVarA.b(i8));
                        int i10 = iB18;
                        int iB35 = (int) brjVarA.b(i10);
                        int i11 = iB19;
                        int iB36 = (int) brjVarA.b(i11);
                        long jB8 = brjVarA.b(iB20);
                        int i12 = iB21;
                        int iB37 = (int) brjVarA.b(i12);
                        int i13 = iB22;
                        int iB38 = (int) brjVarA.b(i13);
                        int i14 = iB23;
                        Boolean boolValueOf = null;
                        String strD4 = brjVarA.k(i14) ? null : brjVarA.d(i14);
                        int i15 = iB24;
                        if (brjVarA.k(i15)) {
                            i = iB37;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB37;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) brjVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iB24 = i15;
                        int i16 = iB25;
                        Boolean bool = boolValueOf;
                        int iK = cms.k((int) brjVarA.b(i16));
                        int i17 = iB26;
                        cnh cnhVarE = cms.e(brjVarA.m(i17));
                        iB25 = i16;
                        int i18 = iB27;
                        boolean z2 = ((int) brjVarA.b(i18)) != 0;
                        iB27 = i18;
                        int i19 = iB28;
                        boolean z3 = ((int) brjVarA.b(i19)) != 0;
                        iB28 = i19;
                        int i20 = iB29;
                        boolean z4 = ((int) brjVarA.b(i20)) != 0;
                        iB29 = i20;
                        int i21 = iB30;
                        int i22 = iB31;
                        int i23 = iB32;
                        iB31 = i22;
                        int i24 = iB33;
                        cld cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cnhVarE, iK, z2, z3, z4, ((int) brjVarA.b(i21)) != 0, brjVarA.b(i22), brjVarA.b(i23), cms.f(brjVarA.m(i24))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, i, iB38, strD4, bool);
                        iB33 = i24;
                        iB32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(cldVar);
                        iB30 = i21;
                        iB = i5;
                        iB14 = i3;
                        iB15 = i4;
                        iB3 = i9;
                        iB17 = i8;
                        iB19 = i11;
                        iB21 = i12;
                        iB22 = i2;
                        iB23 = i14;
                        iB26 = i17;
                        iB2 = i7;
                        iB16 = i6;
                        iB18 = i10;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final int a() {
        return ((Number) bpr.b(this.b, true, false, new agux() { // from class: clg
            public final /* synthetic */ String a = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    int iB = brjVarA.l() ? (int) brjVarA.b(0) : 0;
                    brjVarA.close();
                    return Integer.valueOf(iB);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.cle
    public final ccq b(final String str) {
        str.getClass();
        return (ccq) bpr.b(this.b, true, false, new agux() { // from class: cme
            public final /* synthetic */ String a = "SELECT state FROM workspec WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    ccq ccqVarD = null;
                    if (brjVarA.l()) {
                        Integer numValueOf = brjVarA.k(0) ? null : Integer.valueOf((int) brjVarA.b(0));
                        if (numValueOf != null) {
                            ccqVarD = cms.d(numValueOf.intValue());
                        }
                    }
                    return ccqVarD;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final cld c(final String str) {
        str.getClass();
        return (cld) bpr.b(this.b, true, false, new agux() { // from class: clw
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE id=?";

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r36v0, types: [cld] */
            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    Boolean cldVar = null;
                    if (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(iB14);
                        long jB7 = brjVarA.b(iB15);
                        boolean z = ((int) brjVarA.b(iB16)) != 0;
                        int iL = cms.l((int) brjVarA.b(iB17));
                        int iB35 = (int) brjVarA.b(iB18);
                        int iB36 = (int) brjVarA.b(iB19);
                        long jB8 = brjVarA.b(iB20);
                        int iB37 = (int) brjVarA.b(iB21);
                        int iB38 = (int) brjVarA.b(iB22);
                        String strD4 = brjVarA.k(iB23) ? null : brjVarA.d(iB23);
                        Integer numValueOf = brjVarA.k(iB24) ? null : Integer.valueOf((int) brjVarA.b(iB24));
                        if (numValueOf != null) {
                            cldVar = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cms.e(brjVarA.m(iB26)), cms.k((int) brjVarA.b(iB25)), ((int) brjVarA.b(iB27)) != 0, ((int) brjVarA.b(iB28)) != 0, ((int) brjVarA.b(iB29)) != 0, ((int) brjVarA.b(iB30)) != 0, brjVarA.b(iB31), brjVarA.b(iB32), cms.f(brjVarA.m(iB33))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, iB37, iB38, strD4, cldVar);
                    }
                    return cldVar;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List d() {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cmh
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        int i3 = iB;
                        ArrayList arrayList2 = arrayList;
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(iB14);
                        int i4 = iB15;
                        long jB7 = brjVarA.b(i4);
                        int i5 = iB2;
                        int i6 = iB16;
                        int i7 = iB3;
                        boolean z = ((int) brjVarA.b(i6)) != 0;
                        int i8 = iB17;
                        int i9 = iB4;
                        int iL = cms.l((int) brjVarA.b(i8));
                        int i10 = iB18;
                        int iB35 = (int) brjVarA.b(i10);
                        int i11 = iB19;
                        int iB36 = (int) brjVarA.b(i11);
                        long jB8 = brjVarA.b(iB20);
                        int i12 = iB21;
                        int iB37 = (int) brjVarA.b(i12);
                        int i13 = iB22;
                        int iB38 = (int) brjVarA.b(i13);
                        int i14 = iB23;
                        Boolean boolValueOf = null;
                        String strD4 = brjVarA.k(i14) ? null : brjVarA.d(i14);
                        int i15 = iB24;
                        if (brjVarA.k(i15)) {
                            i = iB37;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB37;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) brjVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i16 = iB25;
                        Boolean bool = boolValueOf;
                        int iK = cms.k((int) brjVarA.b(i16));
                        int i17 = iB26;
                        cnh cnhVarE = cms.e(brjVarA.m(i17));
                        int i18 = iB27;
                        boolean z2 = ((int) brjVarA.b(i18)) != 0;
                        int i19 = iB28;
                        boolean z3 = ((int) brjVarA.b(i19)) != 0;
                        int i20 = iB29;
                        boolean z4 = ((int) brjVarA.b(i20)) != 0;
                        int i21 = iB30;
                        int i22 = iB31;
                        int i23 = iB32;
                        iB31 = i22;
                        int i24 = iB33;
                        cld cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cnhVarE, iK, z2, z3, z4, ((int) brjVarA.b(i21)) != 0, brjVarA.b(i22), brjVarA.b(i23), cms.f(brjVarA.m(i24))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, i, iB38, strD4, bool);
                        iB33 = i24;
                        iB32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(cldVar);
                        iB23 = i14;
                        iB27 = i18;
                        iB28 = i19;
                        iB = i3;
                        iB30 = i21;
                        iB2 = i5;
                        iB15 = i4;
                        iB4 = i9;
                        iB17 = i8;
                        iB19 = i11;
                        iB21 = i12;
                        iB22 = i2;
                        iB24 = i15;
                        iB25 = i16;
                        iB26 = i17;
                        iB29 = i20;
                        iB3 = i7;
                        iB16 = i6;
                        iB18 = i10;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List e(final String str) {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: clx
            public final /* synthetic */ String a = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        arrayList.add(caz.a.a(brjVarA.m(0)));
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List f(final long j) {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: clt
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.g(1, j);
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        int i3 = iB14;
                        ArrayList arrayList2 = arrayList;
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(i3);
                        int i4 = iB15;
                        long jB7 = brjVarA.b(i4);
                        int i5 = iB;
                        int i6 = iB16;
                        int i7 = iB2;
                        boolean z = ((int) brjVarA.b(i6)) != 0;
                        int i8 = iB17;
                        int i9 = iB3;
                        int iL = cms.l((int) brjVarA.b(i8));
                        int i10 = iB18;
                        int iB35 = (int) brjVarA.b(i10);
                        int i11 = iB19;
                        int iB36 = (int) brjVarA.b(i11);
                        long jB8 = brjVarA.b(iB20);
                        int i12 = iB21;
                        int iB37 = (int) brjVarA.b(i12);
                        int i13 = iB22;
                        int iB38 = (int) brjVarA.b(i13);
                        int i14 = iB23;
                        Boolean boolValueOf = null;
                        String strD4 = brjVarA.k(i14) ? null : brjVarA.d(i14);
                        int i15 = iB24;
                        if (brjVarA.k(i15)) {
                            i = iB37;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB37;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) brjVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iB24 = i15;
                        int i16 = iB25;
                        Boolean bool = boolValueOf;
                        int iK = cms.k((int) brjVarA.b(i16));
                        int i17 = iB26;
                        cnh cnhVarE = cms.e(brjVarA.m(i17));
                        iB25 = i16;
                        int i18 = iB27;
                        boolean z2 = ((int) brjVarA.b(i18)) != 0;
                        iB27 = i18;
                        int i19 = iB28;
                        boolean z3 = ((int) brjVarA.b(i19)) != 0;
                        iB28 = i19;
                        int i20 = iB29;
                        boolean z4 = ((int) brjVarA.b(i20)) != 0;
                        iB29 = i20;
                        int i21 = iB30;
                        int i22 = iB31;
                        int i23 = iB32;
                        iB31 = i22;
                        int i24 = iB33;
                        cld cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cnhVarE, iK, z2, z3, z4, ((int) brjVarA.b(i21)) != 0, brjVarA.b(i22), brjVarA.b(i23), cms.f(brjVarA.m(i24))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, i, iB38, strD4, bool);
                        iB33 = i24;
                        iB32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(cldVar);
                        iB30 = i21;
                        iB = i5;
                        iB14 = i3;
                        iB15 = i4;
                        iB3 = i9;
                        iB17 = i8;
                        iB19 = i11;
                        iB21 = i12;
                        iB22 = i2;
                        iB23 = i14;
                        iB26 = i17;
                        iB2 = i7;
                        iB16 = i6;
                        iB18 = i10;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List g() {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cmc
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=1";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        int i3 = iB;
                        ArrayList arrayList2 = arrayList;
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(iB14);
                        int i4 = iB15;
                        long jB7 = brjVarA.b(i4);
                        int i5 = iB2;
                        int i6 = iB16;
                        int i7 = iB3;
                        boolean z = ((int) brjVarA.b(i6)) != 0;
                        int i8 = iB17;
                        int i9 = iB4;
                        int iL = cms.l((int) brjVarA.b(i8));
                        int i10 = iB18;
                        int iB35 = (int) brjVarA.b(i10);
                        int i11 = iB19;
                        int iB36 = (int) brjVarA.b(i11);
                        long jB8 = brjVarA.b(iB20);
                        int i12 = iB21;
                        int iB37 = (int) brjVarA.b(i12);
                        int i13 = iB22;
                        int iB38 = (int) brjVarA.b(i13);
                        int i14 = iB23;
                        Boolean boolValueOf = null;
                        String strD4 = brjVarA.k(i14) ? null : brjVarA.d(i14);
                        int i15 = iB24;
                        if (brjVarA.k(i15)) {
                            i = iB37;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB37;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) brjVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i16 = iB25;
                        Boolean bool = boolValueOf;
                        int iK = cms.k((int) brjVarA.b(i16));
                        int i17 = iB26;
                        cnh cnhVarE = cms.e(brjVarA.m(i17));
                        int i18 = iB27;
                        boolean z2 = ((int) brjVarA.b(i18)) != 0;
                        int i19 = iB28;
                        boolean z3 = ((int) brjVarA.b(i19)) != 0;
                        int i20 = iB29;
                        boolean z4 = ((int) brjVarA.b(i20)) != 0;
                        int i21 = iB30;
                        int i22 = iB31;
                        int i23 = iB32;
                        iB31 = i22;
                        int i24 = iB33;
                        cld cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cnhVarE, iK, z2, z3, z4, ((int) brjVarA.b(i21)) != 0, brjVarA.b(i22), brjVarA.b(i23), cms.f(brjVarA.m(i24))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, i, iB38, strD4, bool);
                        iB33 = i24;
                        iB32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(cldVar);
                        iB23 = i14;
                        iB27 = i18;
                        iB28 = i19;
                        iB = i3;
                        iB30 = i21;
                        iB2 = i5;
                        iB15 = i4;
                        iB4 = i9;
                        iB17 = i8;
                        iB19 = i11;
                        iB21 = i12;
                        iB22 = i2;
                        iB24 = i15;
                        iB25 = i16;
                        iB26 = i17;
                        iB29 = i20;
                        iB3 = i7;
                        iB16 = i6;
                        iB18 = i10;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List h() {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: clu
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        int i3 = iB;
                        ArrayList arrayList2 = arrayList;
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(iB14);
                        int i4 = iB15;
                        long jB7 = brjVarA.b(i4);
                        int i5 = iB2;
                        int i6 = iB16;
                        int i7 = iB3;
                        boolean z = ((int) brjVarA.b(i6)) != 0;
                        int i8 = iB17;
                        int i9 = iB4;
                        int iL = cms.l((int) brjVarA.b(i8));
                        int i10 = iB18;
                        int iB35 = (int) brjVarA.b(i10);
                        int i11 = iB19;
                        int iB36 = (int) brjVarA.b(i11);
                        long jB8 = brjVarA.b(iB20);
                        int i12 = iB21;
                        int iB37 = (int) brjVarA.b(i12);
                        int i13 = iB22;
                        int iB38 = (int) brjVarA.b(i13);
                        int i14 = iB23;
                        Boolean boolValueOf = null;
                        String strD4 = brjVarA.k(i14) ? null : brjVarA.d(i14);
                        int i15 = iB24;
                        if (brjVarA.k(i15)) {
                            i = iB37;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB37;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) brjVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i16 = iB25;
                        Boolean bool = boolValueOf;
                        int iK = cms.k((int) brjVarA.b(i16));
                        int i17 = iB26;
                        cnh cnhVarE = cms.e(brjVarA.m(i17));
                        int i18 = iB27;
                        boolean z2 = ((int) brjVarA.b(i18)) != 0;
                        int i19 = iB28;
                        boolean z3 = ((int) brjVarA.b(i19)) != 0;
                        int i20 = iB29;
                        boolean z4 = ((int) brjVarA.b(i20)) != 0;
                        int i21 = iB30;
                        int i22 = iB31;
                        int i23 = iB32;
                        iB31 = i22;
                        int i24 = iB33;
                        cld cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cnhVarE, iK, z2, z3, z4, ((int) brjVarA.b(i21)) != 0, brjVarA.b(i22), brjVarA.b(i23), cms.f(brjVarA.m(i24))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, i, iB38, strD4, bool);
                        iB33 = i24;
                        iB32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(cldVar);
                        iB23 = i14;
                        iB27 = i18;
                        iB28 = i19;
                        iB = i3;
                        iB30 = i21;
                        iB2 = i5;
                        iB15 = i4;
                        iB4 = i9;
                        iB17 = i8;
                        iB19 = i11;
                        iB21 = i12;
                        iB22 = i2;
                        iB24 = i15;
                        iB25 = i16;
                        iB26 = i17;
                        iB29 = i20;
                        iB3 = i7;
                        iB16 = i6;
                        iB18 = i10;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List i(final String str) {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: clp
            public final /* synthetic */ String a = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        arrayList.add(brjVarA.d(0));
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List j(final String str) {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cma
            public final /* synthetic */ String a = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        arrayList.add(brjVarA.d(0));
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List k(final String str) {
        str.getClass();
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cln
            public final /* synthetic */ String a = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        arrayList.add(new clb(brjVarA.d(0), cms.d((int) brjVarA.b(1))));
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final ahgr l() {
        agux aguxVar = new agux() { // from class: clk
            public final /* synthetic */ String a = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    boolean z = false;
                    if (brjVarA.l()) {
                        if (((int) brjVarA.b(0)) != 0) {
                            z = true;
                        }
                    }
                    brjVarA.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        };
        bmn bmnVar = this.b;
        blh blhVarB = bmnVar.b();
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
        strArr.getClass();
        boa boaVar = blhVarB.c;
        agpi agpiVarF = boaVar.f(strArr);
        String[] strArr2 = (String[]) agpiVarF.a;
        int[] iArr = (int[]) agpiVarF.b;
        strArr2.getClass();
        iArr.getClass();
        blk blkVar = null;
        ahgr ahioVar = new ahio(new bnq(boaVar, iArr, strArr2, null));
        blp blpVar = blhVarB.i;
        if (blpVar != null) {
            strArr2.getClass();
            blkVar = new blk(blpVar.h, strArr2);
        }
        if (blkVar != null) {
            ahgr[] ahgrVarArr = {ahioVar, blkVar};
            int i = ahhy.a;
            ahioVar = new ahjp(new agqn(ahgrVarArr));
        }
        return new bof(ahgy.a(ahioVar), bmnVar, aguxVar);
    }

    @Override // defpackage.cle
    public final void m(final String str) {
        bpr.b(this.b, false, true, new agux() { // from class: cli
            public final /* synthetic */ String a = "DELETE FROM workspec WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void n(final String str) {
        bpr.b(this.b, false, true, new agux() { // from class: cls
            public final /* synthetic */ String a = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void o(final cld cldVar) {
        bpr.b(this.b, false, true, new agux() { // from class: cmg
            @Override // defpackage.agux
            public final Object a(Object obj) throws Exception {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                this.a.a.c(bskVar, cldVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.cle
    public final void p() {
        bpr.b(this.b, false, true, new agux() { // from class: clj
            public final /* synthetic */ String a = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void q(final String str, final int i) {
        bpr.b(this.b, false, true, new agux() { // from class: clh
            public final /* synthetic */ String a = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                String str2 = str;
                int i2 = i;
                try {
                    brjVarA.i(1, str2);
                    brjVarA.g(2, i2);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void r(final String str, final long j) {
        str.getClass();
        bpr.b(this.b, false, true, new agux() { // from class: cmf
            public final /* synthetic */ String a = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                long j2 = j;
                String str2 = str;
                try {
                    brjVarA.g(1, j2);
                    brjVarA.i(2, str2);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void s(final String str, final caz cazVar) {
        bpr.b(this.b, false, true, new agux() { // from class: clo
            public final /* synthetic */ String a = "UPDATE workspec SET output=? WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                caz cazVar2 = cazVar;
                String str2 = str;
                try {
                    brjVarA.e(1, caz.a.b(cazVar2));
                    brjVarA.i(2, str2);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void t(final String str, final int i) {
        bpr.b(this.b, false, true, new agux() { // from class: clf
            public final /* synthetic */ String a = "UPDATE workspec SET stop_reason=? WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                int i2 = i;
                String str2 = str;
                try {
                    brjVarA.g(1, i2);
                    brjVarA.i(2, str2);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void u(final cld cldVar) {
        bpr.b(this.b, false, true, new agux() { // from class: clq
            @Override // defpackage.agux
            public final Object a(Object obj) throws Exception {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a("UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?");
                cld cldVar2 = cldVar;
                try {
                    String str = cldVar2.c;
                    brjVarA.i(1, str);
                    brjVarA.g(2, cms.b(cldVar2.d));
                    brjVarA.i(3, cldVar2.e);
                    brjVarA.i(4, cldVar2.f);
                    caw cawVar = caz.a;
                    brjVarA.e(5, cawVar.b(cldVar2.g));
                    brjVarA.e(6, cawVar.b(cldVar2.h));
                    brjVarA.g(7, cldVar2.i);
                    brjVarA.g(8, cldVar2.j);
                    brjVarA.g(9, cldVar2.k);
                    brjVarA.g(10, cldVar2.m);
                    brjVarA.g(11, cms.a(cldVar2.n));
                    brjVarA.g(12, cldVar2.o);
                    brjVarA.g(13, cldVar2.p);
                    brjVarA.g(14, cldVar2.q);
                    brjVarA.g(15, cldVar2.r);
                    brjVarA.g(16, cldVar2.s ? 1L : 0L);
                    brjVarA.g(17, cms.j(cldVar2.A));
                    brjVarA.g(18, cldVar2.t);
                    brjVarA.g(19, cldVar2.u);
                    brjVarA.g(20, cldVar2.v);
                    brjVarA.g(21, cldVar2.w);
                    brjVarA.g(22, cldVar2.x);
                    String str2 = cldVar2.y;
                    if (str2 == null) {
                        brjVarA.h(23);
                    } else {
                        brjVarA.i(23, str2);
                    }
                    Boolean bool = cldVar2.z;
                    if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                        brjVarA.h(24);
                    } else {
                        brjVarA.g(24, r3.intValue());
                    }
                    caq caqVar = cldVar2.l;
                    brjVarA.g(25, cms.i(caqVar.j));
                    brjVarA.e(26, cms.g(caqVar.b));
                    brjVarA.g(27, caqVar.c ? 1L : 0L);
                    brjVarA.g(28, caqVar.d ? 1L : 0L);
                    brjVarA.g(29, caqVar.e ? 1L : 0L);
                    brjVarA.g(30, caqVar.f ? 1L : 0L);
                    brjVarA.g(31, caqVar.g);
                    brjVarA.g(32, caqVar.h);
                    brjVarA.e(33, cms.h(caqVar.i));
                    brjVarA.i(34, str);
                    brjVarA.l();
                    aguj.a(brjVarA, null);
                    bpv.a(bskVar);
                    return agpu.a;
                } finally {
                }
            }
        });
    }

    @Override // defpackage.cle
    public final List v() {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cll
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.g(1, 200L);
                    int iB = bpw.b(brjVarA, "id");
                    int iB2 = bpw.b(brjVarA, "state");
                    int iB3 = bpw.b(brjVarA, "worker_class_name");
                    int iB4 = bpw.b(brjVarA, "input_merger_class_name");
                    int iB5 = bpw.b(brjVarA, "input");
                    int iB6 = bpw.b(brjVarA, "output");
                    int iB7 = bpw.b(brjVarA, "initial_delay");
                    int iB8 = bpw.b(brjVarA, "interval_duration");
                    int iB9 = bpw.b(brjVarA, "flex_duration");
                    int iB10 = bpw.b(brjVarA, "run_attempt_count");
                    int iB11 = bpw.b(brjVarA, "backoff_policy");
                    int iB12 = bpw.b(brjVarA, "backoff_delay_duration");
                    int iB13 = bpw.b(brjVarA, "last_enqueue_time");
                    int iB14 = bpw.b(brjVarA, "minimum_retention_duration");
                    int iB15 = bpw.b(brjVarA, "schedule_requested_at");
                    int iB16 = bpw.b(brjVarA, "run_in_foreground");
                    int iB17 = bpw.b(brjVarA, "out_of_quota_policy");
                    int iB18 = bpw.b(brjVarA, "period_count");
                    int iB19 = bpw.b(brjVarA, "generation");
                    int iB20 = bpw.b(brjVarA, "next_schedule_time_override");
                    int iB21 = bpw.b(brjVarA, "next_schedule_time_override_generation");
                    int iB22 = bpw.b(brjVarA, "stop_reason");
                    int iB23 = bpw.b(brjVarA, "trace_tag");
                    int iB24 = bpw.b(brjVarA, "backoff_on_system_interruptions");
                    int iB25 = bpw.b(brjVarA, "required_network_type");
                    int iB26 = bpw.b(brjVarA, "required_network_request");
                    int iB27 = bpw.b(brjVarA, "requires_charging");
                    int iB28 = bpw.b(brjVarA, "requires_device_idle");
                    int iB29 = bpw.b(brjVarA, "requires_battery_not_low");
                    int iB30 = bpw.b(brjVarA, "requires_storage_not_low");
                    int iB31 = bpw.b(brjVarA, "trigger_content_update_delay");
                    int iB32 = bpw.b(brjVarA, "trigger_max_content_delay");
                    int iB33 = bpw.b(brjVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        String strD = brjVarA.d(iB);
                        int i3 = iB14;
                        ArrayList arrayList2 = arrayList;
                        ccq ccqVarD = cms.d((int) brjVarA.b(iB2));
                        String strD2 = brjVarA.d(iB3);
                        String strD3 = brjVarA.d(iB4);
                        byte[] bArrM = brjVarA.m(iB5);
                        caw cawVar = caz.a;
                        caz cazVarA = cawVar.a(bArrM);
                        caz cazVarA2 = cawVar.a(brjVarA.m(iB6));
                        long jB = brjVarA.b(iB7);
                        long jB2 = brjVarA.b(iB8);
                        long jB3 = brjVarA.b(iB9);
                        int iB34 = (int) brjVarA.b(iB10);
                        cah cahVarC = cms.c((int) brjVarA.b(iB11));
                        long jB4 = brjVarA.b(iB12);
                        long jB5 = brjVarA.b(iB13);
                        long jB6 = brjVarA.b(i3);
                        int i4 = iB15;
                        long jB7 = brjVarA.b(i4);
                        int i5 = iB;
                        int i6 = iB16;
                        int i7 = iB2;
                        boolean z = ((int) brjVarA.b(i6)) != 0;
                        int i8 = iB17;
                        int i9 = iB3;
                        int iL = cms.l((int) brjVarA.b(i8));
                        int i10 = iB18;
                        int iB35 = (int) brjVarA.b(i10);
                        int i11 = iB19;
                        int iB36 = (int) brjVarA.b(i11);
                        long jB8 = brjVarA.b(iB20);
                        int i12 = iB21;
                        int iB37 = (int) brjVarA.b(i12);
                        int i13 = iB22;
                        int iB38 = (int) brjVarA.b(i13);
                        int i14 = iB23;
                        Boolean boolValueOf = null;
                        String strD4 = brjVarA.k(i14) ? null : brjVarA.d(i14);
                        int i15 = iB24;
                        if (brjVarA.k(i15)) {
                            i = iB37;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB37;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) brjVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iB24 = i15;
                        int i16 = iB25;
                        Boolean bool = boolValueOf;
                        int iK = cms.k((int) brjVarA.b(i16));
                        int i17 = iB26;
                        cnh cnhVarE = cms.e(brjVarA.m(i17));
                        iB25 = i16;
                        int i18 = iB27;
                        boolean z2 = ((int) brjVarA.b(i18)) != 0;
                        iB27 = i18;
                        int i19 = iB28;
                        boolean z3 = ((int) brjVarA.b(i19)) != 0;
                        iB28 = i19;
                        int i20 = iB29;
                        boolean z4 = ((int) brjVarA.b(i20)) != 0;
                        iB29 = i20;
                        int i21 = iB30;
                        int i22 = iB31;
                        int i23 = iB32;
                        iB31 = i22;
                        int i24 = iB33;
                        cld cldVar = new cld(strD, ccqVarD, strD2, strD3, cazVarA, cazVarA2, jB, jB2, jB3, new caq(cnhVarE, iK, z2, z3, z4, ((int) brjVarA.b(i21)) != 0, brjVarA.b(i22), brjVarA.b(i23), cms.f(brjVarA.m(i24))), iB34, cahVarC, jB4, jB5, jB6, jB7, z, iL, iB35, iB36, jB8, i, iB38, strD4, bool);
                        iB33 = i24;
                        iB32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(cldVar);
                        iB30 = i21;
                        iB = i5;
                        iB14 = i3;
                        iB15 = i4;
                        iB3 = i9;
                        iB17 = i8;
                        iB19 = i11;
                        iB21 = i12;
                        iB22 = i2;
                        iB23 = i14;
                        iB26 = i17;
                        iB2 = i7;
                        iB16 = i6;
                        iB18 = i10;
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.cle
    public final void w(final String str) {
        ((Number) bpr.b(this.b, false, true, new agux() { // from class: cmb
            public final /* synthetic */ String a = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    int iA = bpv.a(bskVar);
                    brjVarA.close();
                    return Integer.valueOf(iA);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.cle
    public final void x(final String str, final long j) {
        str.getClass();
        ((Number) bpr.b(this.b, false, true, new agux() { // from class: cly
            public final /* synthetic */ String a = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                long j2 = j;
                String str2 = str;
                try {
                    brjVarA.g(1, j2);
                    brjVarA.i(2, str2);
                    brjVarA.l();
                    int iA = bpv.a(bskVar);
                    brjVarA.close();
                    return Integer.valueOf(iA);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.cle
    public final void y() {
        ((Number) bpr.b(this.b, false, true, new agux() { // from class: clm
            public final /* synthetic */ String a = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.l();
                    int iA = bpv.a(bskVar);
                    brjVarA.close();
                    return Integer.valueOf(iA);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.cle
    public final void z(final String str) {
        ((Number) bpr.b(this.b, false, true, new agux() { // from class: clr
            public final /* synthetic */ String a = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    int iA = bpv.a(bskVar);
                    brjVarA.close();
                    return Integer.valueOf(iA);
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        })).intValue();
    }
}
