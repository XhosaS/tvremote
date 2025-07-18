package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetf implements aetd {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;
    public static final rgi g;
    public static final rgi h;

    static {
        rgg rggVarB = new rgg(rff.a("com.google.android.gms.icing.mdd")).c().b();
        rggVarB.e("PeriodicTaskFlags__cellular_charging_gcm_task_cadence", 5L);
        rggVarB.f("PeriodicTaskFlags__cellular_charging_gcm_task_enabled", true);
        a = rggVarB.e("cellular_charging_gcm_task_period", 21600L);
        b = new rge(rggVarB, "cellular_task_constraint_overrides", "CAEQARgA", new rgf() { // from class: aete
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r2 != false) goto L17;
             */
            @Override // defpackage.rgf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(byte[] r5) throws defpackage.abxv {
                /*
                    r4 = this;
                    pgm r0 = defpackage.pgm.a
                    int r1 = r5.length
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    abza r2 = defpackage.abza.a
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    r3 = 0
                    abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                    if (r5 == 0) goto L44
                    r0 = 1
                    r1 = 0
                    java.lang.Object r2 = r5.cM(r0, r1)
                    java.lang.Byte r2 = (java.lang.Byte) r2
                    byte r2 = r2.byteValue()
                    if (r2 != r0) goto L1f
                    goto L44
                L1f:
                    if (r2 == 0) goto L3a
                    abza r2 = defpackage.abza.a
                    java.lang.Class r3 = r5.getClass()
                    abzj r2 = r2.a(r3)
                    boolean r2 = r2.l(r5)
                    if (r0 == r2) goto L32
                    goto L33
                L32:
                    r1 = r5
                L33:
                    r0 = 2
                    r5.cM(r0, r1)
                    if (r2 == 0) goto L3a
                    goto L44
                L3a:
                    abzz r5 = new abzz
                    r5.<init>()
                    abxv r5 = r5.a()
                    throw r5
                L44:
                    pgm r5 = (defpackage.pgm) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aete.a(byte[]):java.lang.Object");
            }
        });
        rggVarB.e("PeriodicTaskFlags__charging_gcm_task_cadence", 5L);
        rggVarB.f("PeriodicTaskFlags__charging_gcm_task_enabled", true);
        c = rggVarB.e("charging_gcm_task_period", 21600L);
        rggVarB.e("PeriodicTaskFlags__maintenance_gcm_task_cadence", 0L);
        rggVarB.f("PeriodicTaskFlags__maintenance_gcm_task_enabled", true);
        d = rggVarB.e("maintenance_gcm_task_period", 86400L);
        e = new rge(rggVarB, "maintenance_task_constraint_overrides", "CAEQARgA", new rgf() { // from class: aete
            @Override // defpackage.rgf
            public final Object a(byte[] v) throws abxv {
                /*
                    this = this;
                    pgm r0 = defpackage.pgm.a
                    int r1 = r5.length
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    abza r2 = defpackage.abza.a
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    r3 = 0
                    abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                    if (r5 == 0) goto L44
                    r0 = 1
                    r1 = 0
                    java.lang.Object r2 = r5.cM(r0, r1)
                    java.lang.Byte r2 = (java.lang.Byte) r2
                    byte r2 = r2.byteValue()
                    if (r2 != r0) goto L1f
                    goto L44
                L1f:
                    if (r2 == 0) goto L3a
                    abza r2 = defpackage.abza.a
                    java.lang.Class r3 = r5.getClass()
                    abzj r2 = r2.a(r3)
                    boolean r2 = r2.l(r5)
                    if (r0 == r2) goto L32
                    goto L33
                L32:
                    r1 = r5
                L33:
                    r0 = 2
                    r5.cM(r0, r1)
                    if (r2 == 0) goto L3a
                    goto L44
                L3a:
                    abzz r5 = new abzz
                    r5.<init>()
                    abxv r5 = r5.a()
                    throw r5
                L44:
                    pgm r5 = (defpackage.pgm) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aete.a(byte[]):java.lang.Object");
            }
        });
        f = new rge(rggVarB, "routine_task_constraint_overrides", "CAEQARgA", new rgf() { // from class: aete
            @Override // defpackage.rgf
            public final Object a(byte[] v) throws abxv {
                /*
                    this = this;
                    pgm r0 = defpackage.pgm.a
                    int r1 = r5.length
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    abza r2 = defpackage.abza.a
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    r3 = 0
                    abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                    if (r5 == 0) goto L44
                    r0 = 1
                    r1 = 0
                    java.lang.Object r2 = r5.cM(r0, r1)
                    java.lang.Byte r2 = (java.lang.Byte) r2
                    byte r2 = r2.byteValue()
                    if (r2 != r0) goto L1f
                    goto L44
                L1f:
                    if (r2 == 0) goto L3a
                    abza r2 = defpackage.abza.a
                    java.lang.Class r3 = r5.getClass()
                    abzj r2 = r2.a(r3)
                    boolean r2 = r2.l(r5)
                    if (r0 == r2) goto L32
                    goto L33
                L32:
                    r1 = r5
                L33:
                    r0 = 2
                    r5.cM(r0, r1)
                    if (r2 == 0) goto L3a
                    goto L44
                L3a:
                    abzz r5 = new abzz
                    r5.<init>()
                    abxv r5 = r5.a()
                    throw r5
                L44:
                    pgm r5 = (defpackage.pgm) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aete.a(byte[]):java.lang.Object");
            }
        });
        rggVarB.e("PeriodicTaskFlags__wifi_charging_gcm_task_cadence", 5L);
        rggVarB.f("PeriodicTaskFlags__wifi_charging_gcm_task_enabled", true);
        g = rggVarB.e("wifi_charging_gcm_task_period", 21600L);
        h = new rge(rggVarB, "wifi_task_constraint_overrides", "CAEQARgA", new rgf() { // from class: aete
            @Override // defpackage.rgf
            public final Object a(byte[] v) throws abxv {
                /*
                    this = this;
                    pgm r0 = defpackage.pgm.a
                    int r1 = r5.length
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    abza r2 = defpackage.abza.a
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    r3 = 0
                    abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                    if (r5 == 0) goto L44
                    r0 = 1
                    r1 = 0
                    java.lang.Object r2 = r5.cM(r0, r1)
                    java.lang.Byte r2 = (java.lang.Byte) r2
                    byte r2 = r2.byteValue()
                    if (r2 != r0) goto L1f
                    goto L44
                L1f:
                    if (r2 == 0) goto L3a
                    abza r2 = defpackage.abza.a
                    java.lang.Class r3 = r5.getClass()
                    abzj r2 = r2.a(r3)
                    boolean r2 = r2.l(r5)
                    if (r0 == r2) goto L32
                    goto L33
                L32:
                    r1 = r5
                L33:
                    r0 = 2
                    r5.cM(r0, r1)
                    if (r2 == 0) goto L3a
                    goto L44
                L3a:
                    abzz r5 = new abzz
                    r5.<init>()
                    abxv r5 = r5.a()
                    throw r5
                L44:
                    pgm r5 = (defpackage.pgm) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aete.a(byte[]):java.lang.Object");
            }
        });
    }

    @Override // defpackage.aetd
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aetd
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.aetd
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.aetd
    public final long d() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.aetd
    public final pgm e() {
        return (pgm) b.b();
    }

    @Override // defpackage.aetd
    public final pgm f() {
        return (pgm) e.b();
    }

    @Override // defpackage.aetd
    public final pgm g() {
        return (pgm) f.b();
    }

    @Override // defpackage.aetd
    public final pgm h() {
        return (pgm) h.b();
    }
}
