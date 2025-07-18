package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvf implements gux {
    public final gei a = new gvd();
    public final geh b = new gve();
    private final gex c;

    public gvf(gex gexVar) {
        this.c = gexVar;
    }

    @Override // defpackage.gux
    public final void A(String str) {
        str.getClass();
        ((Number) gez.j(this.c, false, true, new gup(str, 10, (char[][]) null))).intValue();
    }

    @Override // defpackage.gux
    public final void B(gpx gpxVar, String str) {
        gpxVar.getClass();
        str.getClass();
        ((Number) gez.j(this.c, false, true, new gk(gpxVar, str, 20))).intValue();
    }

    @Override // defpackage.gux
    public final List C() {
        return (List) gez.j(this.c, true, false, new yjv() { // from class: gva
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";

            @Override // defpackage.yjv
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                gic gicVar = (gic) obj;
                gicVar.getClass();
                ghi ghiVarA = gicVar.a(this.a);
                try {
                    ghiVarA.g(1, 20L);
                    int iJ = gez.J(ghiVarA, "id");
                    int iJ2 = gez.J(ghiVarA, "state");
                    int iJ3 = gez.J(ghiVarA, "worker_class_name");
                    int iJ4 = gez.J(ghiVarA, "input_merger_class_name");
                    int iJ5 = gez.J(ghiVarA, "input");
                    int iJ6 = gez.J(ghiVarA, "output");
                    int iJ7 = gez.J(ghiVarA, "initial_delay");
                    int iJ8 = gez.J(ghiVarA, "interval_duration");
                    int iJ9 = gez.J(ghiVarA, "flex_duration");
                    int iJ10 = gez.J(ghiVarA, "run_attempt_count");
                    int iJ11 = gez.J(ghiVarA, "backoff_policy");
                    int iJ12 = gez.J(ghiVarA, "backoff_delay_duration");
                    int iJ13 = gez.J(ghiVarA, "last_enqueue_time");
                    int iJ14 = gez.J(ghiVarA, "minimum_retention_duration");
                    int iJ15 = gez.J(ghiVarA, "schedule_requested_at");
                    int iJ16 = gez.J(ghiVarA, "run_in_foreground");
                    int iJ17 = gez.J(ghiVarA, "out_of_quota_policy");
                    int iJ18 = gez.J(ghiVarA, "period_count");
                    int iJ19 = gez.J(ghiVarA, "generation");
                    int iJ20 = gez.J(ghiVarA, "next_schedule_time_override");
                    int iJ21 = gez.J(ghiVarA, "next_schedule_time_override_generation");
                    int iJ22 = gez.J(ghiVarA, "stop_reason");
                    int iJ23 = gez.J(ghiVarA, "trace_tag");
                    int iJ24 = gez.J(ghiVarA, "backoff_on_system_interruptions");
                    int iJ25 = gez.J(ghiVarA, "required_network_type");
                    int iJ26 = gez.J(ghiVarA, "required_network_request");
                    int iJ27 = gez.J(ghiVarA, "requires_charging");
                    int iJ28 = gez.J(ghiVarA, "requires_device_idle");
                    int iJ29 = gez.J(ghiVarA, "requires_battery_not_low");
                    int iJ30 = gez.J(ghiVarA, "requires_storage_not_low");
                    int iJ31 = gez.J(ghiVarA, "trigger_content_update_delay");
                    int iJ32 = gez.J(ghiVarA, "trigger_max_content_delay");
                    int iJ33 = gez.J(ghiVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        String strD = ghiVarA.d(iJ);
                        int i3 = iJ14;
                        ArrayList arrayList2 = arrayList;
                        gpx gpxVarAB = fki.aB((int) ghiVarA.b(iJ2));
                        String strD2 = ghiVarA.d(iJ3);
                        String strD3 = ghiVarA.d(iJ4);
                        byte[] bArrM = ghiVarA.m(iJ5);
                        gox goxVar = gox.a;
                        gox goxVarW = gli.w(bArrM);
                        gox goxVarW2 = gli.w(ghiVarA.m(iJ6));
                        long jB = ghiVarA.b(iJ7);
                        long jB2 = ghiVarA.b(iJ8);
                        long jB3 = ghiVarA.b(iJ9);
                        int iB = (int) ghiVarA.b(iJ10);
                        int iAJ = fki.aJ((int) ghiVarA.b(iJ11));
                        long jB4 = ghiVarA.b(iJ12);
                        long jB5 = ghiVarA.b(iJ13);
                        long jB6 = ghiVarA.b(i3);
                        int i4 = iJ15;
                        long jB7 = ghiVarA.b(i4);
                        int i5 = iJ;
                        int i6 = iJ16;
                        int i7 = iJ2;
                        boolean z = ((int) ghiVarA.b(i6)) != 0;
                        int i8 = iJ17;
                        int i9 = iJ3;
                        int iAL = fki.aL((int) ghiVarA.b(i8));
                        int i10 = iJ18;
                        int iB2 = (int) ghiVarA.b(i10);
                        int i11 = iJ19;
                        int iB3 = (int) ghiVarA.b(i11);
                        long jB8 = ghiVarA.b(iJ20);
                        int i12 = iJ21;
                        int iB4 = (int) ghiVarA.b(i12);
                        int i13 = iJ22;
                        int iB5 = (int) ghiVarA.b(i13);
                        int i14 = iJ23;
                        Boolean boolValueOf = null;
                        String strD4 = ghiVarA.k(i14) ? null : ghiVarA.d(i14);
                        int i15 = iJ24;
                        if (ghiVarA.k(i15)) {
                            i = iB4;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB4;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) ghiVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iJ24 = i15;
                        int i16 = iJ25;
                        Boolean bool = boolValueOf;
                        int iAK = fki.aK((int) ghiVarA.b(i16));
                        int i17 = iJ26;
                        gvm gvmVarAC = fki.aC(ghiVarA.m(i17));
                        iJ25 = i16;
                        int i18 = iJ27;
                        boolean z2 = ((int) ghiVarA.b(i18)) != 0;
                        iJ27 = i18;
                        int i19 = iJ28;
                        boolean z3 = ((int) ghiVarA.b(i19)) != 0;
                        iJ28 = i19;
                        int i20 = iJ29;
                        boolean z4 = ((int) ghiVarA.b(i20)) != 0;
                        iJ29 = i20;
                        int i21 = iJ30;
                        int i22 = iJ31;
                        int i23 = iJ32;
                        iJ31 = i22;
                        int i24 = iJ33;
                        guw guwVar = new guw(strD, gpxVarAB, strD2, strD3, goxVarW, goxVarW2, jB, jB2, jB3, new gou(gvmVarAC, iAK, z2, z3, z4, ((int) ghiVarA.b(i21)) != 0, ghiVarA.b(i22), ghiVarA.b(i23), fki.aD(ghiVarA.m(i24))), iB, iAJ, jB4, jB5, jB6, jB7, z, iAL, iB2, iB3, jB8, i, iB5, strD4, bool);
                        iJ33 = i24;
                        iJ32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(guwVar);
                        iJ30 = i21;
                        iJ = i5;
                        iJ14 = i3;
                        iJ15 = i4;
                        iJ3 = i9;
                        iJ17 = i8;
                        iJ19 = i11;
                        iJ21 = i12;
                        iJ22 = i2;
                        iJ23 = i14;
                        iJ26 = i17;
                        iJ2 = i7;
                        iJ16 = i6;
                        iJ18 = i10;
                    }
                    return arrayList;
                } finally {
                    ghiVarA.close();
                }
            }
        });
    }

    public final void D(gic gicVar, ir irVar) {
        Set setKeySet = irVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (irVar.d > 999) {
            gez.M(irVar, new gup(this, gicVar, 13));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        gez.G(sb, setKeySet.size());
        sb.append(")");
        ghi ghiVarA = gicVar.a(sb.toString());
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ghiVarA.i(i, (String) it.next());
            i++;
        }
        try {
            int iH = gez.H(ghiVarA, "work_spec_id");
            if (iH != -1) {
                while (ghiVarA.l()) {
                    List list = (List) irVar.get(ghiVarA.d(iH));
                    if (list != null) {
                        byte[] bArrM = ghiVarA.m(0);
                        gox goxVar = gox.a;
                        list.add(gli.w(bArrM));
                    }
                }
            }
        } finally {
            ghiVarA.close();
        }
    }

    public final void E(gic gicVar, ir irVar) {
        Set setKeySet = irVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (irVar.d > 999) {
            gez.M(irVar, new gup(this, gicVar, 14));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        gez.G(sb, setKeySet.size());
        sb.append(")");
        ghi ghiVarA = gicVar.a(sb.toString());
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ghiVarA.i(i, (String) it.next());
            i++;
        }
        try {
            int iH = gez.H(ghiVarA, "work_spec_id");
            if (iH != -1) {
                while (ghiVarA.l()) {
                    List list = (List) irVar.get(ghiVarA.d(iH));
                    if (list != null) {
                        list.add(ghiVarA.d(0));
                    }
                }
            }
        } finally {
            ghiVarA.close();
        }
    }

    @Override // defpackage.gux
    public final int a() {
        return ((Number) gez.j(this.c, true, false, new fyq(15, (char[]) null))).intValue();
    }

    @Override // defpackage.gux
    public final gpx b(String str) {
        str.getClass();
        return (gpx) gez.j(this.c, true, false, new gup(str, 15, (boolean[][]) null));
    }

    @Override // defpackage.gux
    public final guw c(final String str) {
        str.getClass();
        return (guw) gez.j(this.c, true, false, new yjv() { // from class: gvb
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE id=?";

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r36v0, types: [guw] */
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                gic gicVar = (gic) obj;
                gicVar.getClass();
                ghi ghiVarA = gicVar.a(this.a);
                try {
                    ghiVarA.i(1, str);
                    int iJ = gez.J(ghiVarA, "id");
                    int iJ2 = gez.J(ghiVarA, "state");
                    int iJ3 = gez.J(ghiVarA, "worker_class_name");
                    int iJ4 = gez.J(ghiVarA, "input_merger_class_name");
                    int iJ5 = gez.J(ghiVarA, "input");
                    int iJ6 = gez.J(ghiVarA, "output");
                    int iJ7 = gez.J(ghiVarA, "initial_delay");
                    int iJ8 = gez.J(ghiVarA, "interval_duration");
                    int iJ9 = gez.J(ghiVarA, "flex_duration");
                    int iJ10 = gez.J(ghiVarA, "run_attempt_count");
                    int iJ11 = gez.J(ghiVarA, "backoff_policy");
                    int iJ12 = gez.J(ghiVarA, "backoff_delay_duration");
                    int iJ13 = gez.J(ghiVarA, "last_enqueue_time");
                    int iJ14 = gez.J(ghiVarA, "minimum_retention_duration");
                    int iJ15 = gez.J(ghiVarA, "schedule_requested_at");
                    int iJ16 = gez.J(ghiVarA, "run_in_foreground");
                    int iJ17 = gez.J(ghiVarA, "out_of_quota_policy");
                    int iJ18 = gez.J(ghiVarA, "period_count");
                    int iJ19 = gez.J(ghiVarA, "generation");
                    int iJ20 = gez.J(ghiVarA, "next_schedule_time_override");
                    int iJ21 = gez.J(ghiVarA, "next_schedule_time_override_generation");
                    int iJ22 = gez.J(ghiVarA, "stop_reason");
                    int iJ23 = gez.J(ghiVarA, "trace_tag");
                    int iJ24 = gez.J(ghiVarA, "backoff_on_system_interruptions");
                    int iJ25 = gez.J(ghiVarA, "required_network_type");
                    int iJ26 = gez.J(ghiVarA, "required_network_request");
                    int iJ27 = gez.J(ghiVarA, "requires_charging");
                    int iJ28 = gez.J(ghiVarA, "requires_device_idle");
                    int iJ29 = gez.J(ghiVarA, "requires_battery_not_low");
                    int iJ30 = gez.J(ghiVarA, "requires_storage_not_low");
                    int iJ31 = gez.J(ghiVarA, "trigger_content_update_delay");
                    int iJ32 = gez.J(ghiVarA, "trigger_max_content_delay");
                    int iJ33 = gez.J(ghiVarA, "content_uri_triggers");
                    Boolean guwVar = null;
                    if (ghiVarA.l()) {
                        String strD = ghiVarA.d(iJ);
                        gpx gpxVarAB = fki.aB((int) ghiVarA.b(iJ2));
                        String strD2 = ghiVarA.d(iJ3);
                        String strD3 = ghiVarA.d(iJ4);
                        byte[] bArrM = ghiVarA.m(iJ5);
                        gox goxVar = gox.a;
                        gox goxVarW = gli.w(bArrM);
                        gox goxVarW2 = gli.w(ghiVarA.m(iJ6));
                        long jB = ghiVarA.b(iJ7);
                        long jB2 = ghiVarA.b(iJ8);
                        long jB3 = ghiVarA.b(iJ9);
                        int iB = (int) ghiVarA.b(iJ10);
                        int iAJ = fki.aJ((int) ghiVarA.b(iJ11));
                        long jB4 = ghiVarA.b(iJ12);
                        long jB5 = ghiVarA.b(iJ13);
                        long jB6 = ghiVarA.b(iJ14);
                        long jB7 = ghiVarA.b(iJ15);
                        boolean z = ((int) ghiVarA.b(iJ16)) != 0;
                        int iAL = fki.aL((int) ghiVarA.b(iJ17));
                        int iB2 = (int) ghiVarA.b(iJ18);
                        int iB3 = (int) ghiVarA.b(iJ19);
                        long jB8 = ghiVarA.b(iJ20);
                        int iB4 = (int) ghiVarA.b(iJ21);
                        int iB5 = (int) ghiVarA.b(iJ22);
                        String strD4 = ghiVarA.k(iJ23) ? null : ghiVarA.d(iJ23);
                        Integer numValueOf = ghiVarA.k(iJ24) ? null : Integer.valueOf((int) ghiVarA.b(iJ24));
                        if (numValueOf != null) {
                            guwVar = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        guwVar = new guw(strD, gpxVarAB, strD2, strD3, goxVarW, goxVarW2, jB, jB2, jB3, new gou(fki.aC(ghiVarA.m(iJ26)), fki.aK((int) ghiVarA.b(iJ25)), ((int) ghiVarA.b(iJ27)) != 0, ((int) ghiVarA.b(iJ28)) != 0, ((int) ghiVarA.b(iJ29)) != 0, ((int) ghiVarA.b(iJ30)) != 0, ghiVarA.b(iJ31), ghiVarA.b(iJ32), fki.aD(ghiVarA.m(iJ33))), iB, iAJ, jB4, jB5, jB6, jB7, z, iAL, iB2, iB3, jB8, iB4, iB5, strD4, guwVar);
                    }
                    return guwVar;
                } finally {
                    ghiVarA.close();
                }
            }
        });
    }

    @Override // defpackage.gux
    public final List d() {
        return (List) gez.j(this.c, true, false, new fyq(20, (byte[][]) null));
    }

    @Override // defpackage.gux
    public final List e(String str) {
        return (List) gez.j(this.c, true, false, new gup(str, 9, (byte[][]) null));
    }

    @Override // defpackage.gux
    public final List f(final long j) {
        return (List) gez.j(this.c, true, false, new yjv() { // from class: guz
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";

            @Override // defpackage.yjv
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                gic gicVar = (gic) obj;
                gicVar.getClass();
                ghi ghiVarA = gicVar.a(this.a);
                try {
                    ghiVarA.g(1, j);
                    int iJ = gez.J(ghiVarA, "id");
                    int iJ2 = gez.J(ghiVarA, "state");
                    int iJ3 = gez.J(ghiVarA, "worker_class_name");
                    int iJ4 = gez.J(ghiVarA, "input_merger_class_name");
                    int iJ5 = gez.J(ghiVarA, "input");
                    int iJ6 = gez.J(ghiVarA, "output");
                    int iJ7 = gez.J(ghiVarA, "initial_delay");
                    int iJ8 = gez.J(ghiVarA, "interval_duration");
                    int iJ9 = gez.J(ghiVarA, "flex_duration");
                    int iJ10 = gez.J(ghiVarA, "run_attempt_count");
                    int iJ11 = gez.J(ghiVarA, "backoff_policy");
                    int iJ12 = gez.J(ghiVarA, "backoff_delay_duration");
                    int iJ13 = gez.J(ghiVarA, "last_enqueue_time");
                    int iJ14 = gez.J(ghiVarA, "minimum_retention_duration");
                    int iJ15 = gez.J(ghiVarA, "schedule_requested_at");
                    int iJ16 = gez.J(ghiVarA, "run_in_foreground");
                    int iJ17 = gez.J(ghiVarA, "out_of_quota_policy");
                    int iJ18 = gez.J(ghiVarA, "period_count");
                    int iJ19 = gez.J(ghiVarA, "generation");
                    int iJ20 = gez.J(ghiVarA, "next_schedule_time_override");
                    int iJ21 = gez.J(ghiVarA, "next_schedule_time_override_generation");
                    int iJ22 = gez.J(ghiVarA, "stop_reason");
                    int iJ23 = gez.J(ghiVarA, "trace_tag");
                    int iJ24 = gez.J(ghiVarA, "backoff_on_system_interruptions");
                    int iJ25 = gez.J(ghiVarA, "required_network_type");
                    int iJ26 = gez.J(ghiVarA, "required_network_request");
                    int iJ27 = gez.J(ghiVarA, "requires_charging");
                    int iJ28 = gez.J(ghiVarA, "requires_device_idle");
                    int iJ29 = gez.J(ghiVarA, "requires_battery_not_low");
                    int iJ30 = gez.J(ghiVarA, "requires_storage_not_low");
                    int iJ31 = gez.J(ghiVarA, "trigger_content_update_delay");
                    int iJ32 = gez.J(ghiVarA, "trigger_max_content_delay");
                    int iJ33 = gez.J(ghiVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        String strD = ghiVarA.d(iJ);
                        int i3 = iJ14;
                        ArrayList arrayList2 = arrayList;
                        gpx gpxVarAB = fki.aB((int) ghiVarA.b(iJ2));
                        String strD2 = ghiVarA.d(iJ3);
                        String strD3 = ghiVarA.d(iJ4);
                        byte[] bArrM = ghiVarA.m(iJ5);
                        gox goxVar = gox.a;
                        gox goxVarW = gli.w(bArrM);
                        gox goxVarW2 = gli.w(ghiVarA.m(iJ6));
                        long jB = ghiVarA.b(iJ7);
                        long jB2 = ghiVarA.b(iJ8);
                        long jB3 = ghiVarA.b(iJ9);
                        int iB = (int) ghiVarA.b(iJ10);
                        int iAJ = fki.aJ((int) ghiVarA.b(iJ11));
                        long jB4 = ghiVarA.b(iJ12);
                        long jB5 = ghiVarA.b(iJ13);
                        long jB6 = ghiVarA.b(i3);
                        int i4 = iJ15;
                        long jB7 = ghiVarA.b(i4);
                        int i5 = iJ;
                        int i6 = iJ16;
                        int i7 = iJ2;
                        boolean z = ((int) ghiVarA.b(i6)) != 0;
                        int i8 = iJ17;
                        int i9 = iJ3;
                        int iAL = fki.aL((int) ghiVarA.b(i8));
                        int i10 = iJ18;
                        int iB2 = (int) ghiVarA.b(i10);
                        int i11 = iJ19;
                        int iB3 = (int) ghiVarA.b(i11);
                        long jB8 = ghiVarA.b(iJ20);
                        int i12 = iJ21;
                        int iB4 = (int) ghiVarA.b(i12);
                        int i13 = iJ22;
                        int iB5 = (int) ghiVarA.b(i13);
                        int i14 = iJ23;
                        Boolean boolValueOf = null;
                        String strD4 = ghiVarA.k(i14) ? null : ghiVarA.d(i14);
                        int i15 = iJ24;
                        if (ghiVarA.k(i15)) {
                            i = iB4;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB4;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) ghiVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iJ24 = i15;
                        int i16 = iJ25;
                        Boolean bool = boolValueOf;
                        int iAK = fki.aK((int) ghiVarA.b(i16));
                        int i17 = iJ26;
                        gvm gvmVarAC = fki.aC(ghiVarA.m(i17));
                        iJ25 = i16;
                        int i18 = iJ27;
                        boolean z2 = ((int) ghiVarA.b(i18)) != 0;
                        iJ27 = i18;
                        int i19 = iJ28;
                        boolean z3 = ((int) ghiVarA.b(i19)) != 0;
                        iJ28 = i19;
                        int i20 = iJ29;
                        boolean z4 = ((int) ghiVarA.b(i20)) != 0;
                        iJ29 = i20;
                        int i21 = iJ30;
                        int i22 = iJ31;
                        int i23 = iJ32;
                        iJ31 = i22;
                        int i24 = iJ33;
                        guw guwVar = new guw(strD, gpxVarAB, strD2, strD3, goxVarW, goxVarW2, jB, jB2, jB3, new gou(gvmVarAC, iAK, z2, z3, z4, ((int) ghiVarA.b(i21)) != 0, ghiVarA.b(i22), ghiVarA.b(i23), fki.aD(ghiVarA.m(i24))), iB, iAJ, jB4, jB5, jB6, jB7, z, iAL, iB2, iB3, jB8, i, iB5, strD4, bool);
                        iJ33 = i24;
                        iJ32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(guwVar);
                        iJ30 = i21;
                        iJ = i5;
                        iJ14 = i3;
                        iJ15 = i4;
                        iJ3 = i9;
                        iJ17 = i8;
                        iJ19 = i11;
                        iJ21 = i12;
                        iJ22 = i2;
                        iJ23 = i14;
                        iJ26 = i17;
                        iJ2 = i7;
                        iJ16 = i6;
                        iJ18 = i10;
                    }
                    return arrayList;
                } finally {
                    ghiVarA.close();
                }
            }
        });
    }

    @Override // defpackage.gux
    public final List g() {
        return (List) gez.j(this.c, true, false, new fyq(19, (float[]) null));
    }

    @Override // defpackage.gux
    public final List h() {
        return (List) gez.j(this.c, true, false, new fyq(18, (boolean[]) null));
    }

    @Override // defpackage.gux
    public final List i(String str) {
        return (List) gez.j(this.c, true, false, new gup(str, 5, (int[]) null));
    }

    @Override // defpackage.gux
    public final List j(String str) {
        return (List) gez.j(this.c, true, false, new gup(str, 11, (short[][]) null));
    }

    @Override // defpackage.gux
    public final List k(String str) {
        str.getClass();
        return (List) gez.j(this.c, true, false, new gup(str, 4, (short[]) null));
    }

    @Override // defpackage.gux
    public final List l(String str) {
        return (List) gez.j(this.c, true, true, new gk(str, this, 19));
    }

    @Override // defpackage.gux
    public final ysx m() {
        fyq fyqVar = new fyq(16, (short[]) null);
        return gez.p(this.c, new String[]{"workspec"}, fyqVar);
    }

    @Override // defpackage.gux
    public final void n(String str) {
        gez.j(this.c, false, true, new gup(str, 3, (char[]) null));
    }

    @Override // defpackage.gux
    public final void o(String str) {
        gez.j(this.c, false, true, new gup(str, 8, (float[]) null));
    }

    @Override // defpackage.gux
    public final void p(guw guwVar) {
        gez.j(this.c, false, true, new gup(this, guwVar, 16));
    }

    @Override // defpackage.gux
    public final void q(String str, int i) {
        gez.j(this.c, false, true, new aiy(str, i, 6, (char[]) null));
    }

    @Override // defpackage.gux
    public final void r(String str, long j) {
        str.getClass();
        gez.j(this.c, false, true, new gvc(j, str, 0));
    }

    @Override // defpackage.gux
    public final void s(String str, gox goxVar) {
        gez.j(this.c, false, true, new gk(goxVar, str, 18));
    }

    @Override // defpackage.gux
    public final void t(String str, int i) {
        gez.j(this.c, false, true, new aiy(i, str, 5));
    }

    @Override // defpackage.gux
    public final void u(guw guwVar) {
        gez.j(this.c, false, true, new gup(this, guwVar, 6));
    }

    @Override // defpackage.gux
    public final List v() {
        return (List) gez.j(this.c, true, false, new yjv() { // from class: guy
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";

            @Override // defpackage.yjv
            public final Object a(Object obj) {
                int i;
                int i2;
                Integer numValueOf;
                gic gicVar = (gic) obj;
                gicVar.getClass();
                ghi ghiVarA = gicVar.a(this.a);
                try {
                    ghiVarA.g(1, 200L);
                    int iJ = gez.J(ghiVarA, "id");
                    int iJ2 = gez.J(ghiVarA, "state");
                    int iJ3 = gez.J(ghiVarA, "worker_class_name");
                    int iJ4 = gez.J(ghiVarA, "input_merger_class_name");
                    int iJ5 = gez.J(ghiVarA, "input");
                    int iJ6 = gez.J(ghiVarA, "output");
                    int iJ7 = gez.J(ghiVarA, "initial_delay");
                    int iJ8 = gez.J(ghiVarA, "interval_duration");
                    int iJ9 = gez.J(ghiVarA, "flex_duration");
                    int iJ10 = gez.J(ghiVarA, "run_attempt_count");
                    int iJ11 = gez.J(ghiVarA, "backoff_policy");
                    int iJ12 = gez.J(ghiVarA, "backoff_delay_duration");
                    int iJ13 = gez.J(ghiVarA, "last_enqueue_time");
                    int iJ14 = gez.J(ghiVarA, "minimum_retention_duration");
                    int iJ15 = gez.J(ghiVarA, "schedule_requested_at");
                    int iJ16 = gez.J(ghiVarA, "run_in_foreground");
                    int iJ17 = gez.J(ghiVarA, "out_of_quota_policy");
                    int iJ18 = gez.J(ghiVarA, "period_count");
                    int iJ19 = gez.J(ghiVarA, "generation");
                    int iJ20 = gez.J(ghiVarA, "next_schedule_time_override");
                    int iJ21 = gez.J(ghiVarA, "next_schedule_time_override_generation");
                    int iJ22 = gez.J(ghiVarA, "stop_reason");
                    int iJ23 = gez.J(ghiVarA, "trace_tag");
                    int iJ24 = gez.J(ghiVarA, "backoff_on_system_interruptions");
                    int iJ25 = gez.J(ghiVarA, "required_network_type");
                    int iJ26 = gez.J(ghiVarA, "required_network_request");
                    int iJ27 = gez.J(ghiVarA, "requires_charging");
                    int iJ28 = gez.J(ghiVarA, "requires_device_idle");
                    int iJ29 = gez.J(ghiVarA, "requires_battery_not_low");
                    int iJ30 = gez.J(ghiVarA, "requires_storage_not_low");
                    int iJ31 = gez.J(ghiVarA, "trigger_content_update_delay");
                    int iJ32 = gez.J(ghiVarA, "trigger_max_content_delay");
                    int iJ33 = gez.J(ghiVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        String strD = ghiVarA.d(iJ);
                        int i3 = iJ14;
                        ArrayList arrayList2 = arrayList;
                        gpx gpxVarAB = fki.aB((int) ghiVarA.b(iJ2));
                        String strD2 = ghiVarA.d(iJ3);
                        String strD3 = ghiVarA.d(iJ4);
                        byte[] bArrM = ghiVarA.m(iJ5);
                        gox goxVar = gox.a;
                        gox goxVarW = gli.w(bArrM);
                        gox goxVarW2 = gli.w(ghiVarA.m(iJ6));
                        long jB = ghiVarA.b(iJ7);
                        long jB2 = ghiVarA.b(iJ8);
                        long jB3 = ghiVarA.b(iJ9);
                        int iB = (int) ghiVarA.b(iJ10);
                        int iAJ = fki.aJ((int) ghiVarA.b(iJ11));
                        long jB4 = ghiVarA.b(iJ12);
                        long jB5 = ghiVarA.b(iJ13);
                        long jB6 = ghiVarA.b(i3);
                        int i4 = iJ15;
                        long jB7 = ghiVarA.b(i4);
                        int i5 = iJ;
                        int i6 = iJ16;
                        int i7 = iJ2;
                        boolean z = ((int) ghiVarA.b(i6)) != 0;
                        int i8 = iJ17;
                        int i9 = iJ3;
                        int iAL = fki.aL((int) ghiVarA.b(i8));
                        int i10 = iJ18;
                        int iB2 = (int) ghiVarA.b(i10);
                        int i11 = iJ19;
                        int iB3 = (int) ghiVarA.b(i11);
                        long jB8 = ghiVarA.b(iJ20);
                        int i12 = iJ21;
                        int iB4 = (int) ghiVarA.b(i12);
                        int i13 = iJ22;
                        int iB5 = (int) ghiVarA.b(i13);
                        int i14 = iJ23;
                        Boolean boolValueOf = null;
                        String strD4 = ghiVarA.k(i14) ? null : ghiVarA.d(i14);
                        int i15 = iJ24;
                        if (ghiVarA.k(i15)) {
                            i = iB4;
                            i2 = i13;
                            numValueOf = null;
                        } else {
                            i = iB4;
                            i2 = i13;
                            numValueOf = Integer.valueOf((int) ghiVarA.b(i15));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iJ24 = i15;
                        int i16 = iJ25;
                        Boolean bool = boolValueOf;
                        int iAK = fki.aK((int) ghiVarA.b(i16));
                        int i17 = iJ26;
                        gvm gvmVarAC = fki.aC(ghiVarA.m(i17));
                        iJ25 = i16;
                        int i18 = iJ27;
                        boolean z2 = ((int) ghiVarA.b(i18)) != 0;
                        iJ27 = i18;
                        int i19 = iJ28;
                        boolean z3 = ((int) ghiVarA.b(i19)) != 0;
                        iJ28 = i19;
                        int i20 = iJ29;
                        boolean z4 = ((int) ghiVarA.b(i20)) != 0;
                        iJ29 = i20;
                        int i21 = iJ30;
                        int i22 = iJ31;
                        int i23 = iJ32;
                        iJ31 = i22;
                        int i24 = iJ33;
                        guw guwVar = new guw(strD, gpxVarAB, strD2, strD3, goxVarW, goxVarW2, jB, jB2, jB3, new gou(gvmVarAC, iAK, z2, z3, z4, ((int) ghiVarA.b(i21)) != 0, ghiVarA.b(i22), ghiVarA.b(i23), fki.aD(ghiVarA.m(i24))), iB, iAJ, jB4, jB5, jB6, jB7, z, iAL, iB2, iB3, jB8, i, iB5, strD4, bool);
                        iJ33 = i24;
                        iJ32 = i23;
                        arrayList = arrayList2;
                        arrayList.add(guwVar);
                        iJ30 = i21;
                        iJ = i5;
                        iJ14 = i3;
                        iJ15 = i4;
                        iJ3 = i9;
                        iJ17 = i8;
                        iJ19 = i11;
                        iJ21 = i12;
                        iJ22 = i2;
                        iJ23 = i14;
                        iJ26 = i17;
                        iJ2 = i7;
                        iJ16 = i6;
                        iJ18 = i10;
                    }
                    return arrayList;
                } finally {
                    ghiVarA.close();
                }
            }
        });
    }

    @Override // defpackage.gux
    public final void w(String str) {
        ((Number) gez.j(this.c, false, true, new gup(str, 12, (int[][]) null))).intValue();
    }

    @Override // defpackage.gux
    public final void x(String str, long j) {
        str.getClass();
        ((Number) gez.j(this.c, false, true, new gvc(j, str, 1, (byte[]) null))).intValue();
    }

    @Override // defpackage.gux
    public final void y() {
        ((Number) gez.j(this.c, false, true, new fyq(17, (int[]) null))).intValue();
    }

    @Override // defpackage.gux
    public final void z(String str) {
        ((Number) gez.j(this.c, false, true, new gup(str, 7, (boolean[]) null))).intValue();
    }
}
