package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesy implements aesv {
    public static final rgi a;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;
    public static final rgi g;
    public static final rgi h;
    public static final rgi i;
    public static final rgi j;
    public static final rgi k;
    public static final rgi l;
    public static final rgi m;
    public static final rgi n;
    public static final rgi o;
    public static final rgi p;
    public static final rgi q;
    public static final rgi r;
    public static final rgi s;
    public static final rgi t;
    public static final rgi u;

    static {
        rgg rggVarB = new rgg(rff.a("com.google.android.gms.icing.mdd")).c().b();
        rggVarB.f("gms_icing_mdd_add_configs_from_phenotype", true);
        rggVarB.f("broadcast_newly_downloaded_groups", true);
        new rge(rggVarB, "build_id_overrides", "", new rgf() { // from class: aesw
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
                    pgk r0 = defpackage.pgk.a
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
                    pgk r5 = (defpackage.pgk) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aesw.a(byte[]):java.lang.Object");
            }
        });
        rggVarB.f("gms_icing_mdd_cache_last_location", true);
        rggVarB.f("clear_state_on_mdd_disabled", false);
        a = rggVarB.f("delete_file_groups_with_files_missing", true);
        b = rggVarB.f("disable_phenotype_namespace_migration_and_cleanup", false);
        rggVarB.f("gms_mdd_download_first_on_wifi_then_on_any_network", true);
        rggVarB.f("gms_mdd_dump_mdd_info", false);
        rggVarB.f("enable_android_file_sharing", true);
        rggVarB.f("enable_android_file_sharing_data_clean_up", true);
        rggVarB.f("enable_android_sharing_daily_maintenance", false);
        rggVarB.f("enable_client_error_logging", false);
        rggVarB.f("enable_compressed_file", true);
        c = rggVarB.f("enable_days_since_last_maintenance_tracking", true);
        rggVarB.f("gms_mdd_enable_debug_ui", false);
        d = rggVarB.f("enable_delayed_download", true);
        rggVarB.f("enable_delta_download", true);
        e = rggVarB.f("enable_download_stage_experiment_id_propagation", true);
        f = rggVarB.f("enable_file_download_dedup_by_file_key", false);
        rggVarB.f("enable_gdd_batch_sync", false);
        rggVarB.f("enable_gdd_zwieback_id_propagation", false);
        g = rggVarB.f("enable_isolated_structure_verification", true);
        rggVarB.f("gms_mdd_enable_mdd_gcm_service", true);
        h = rggVarB.f("enable_mdd_multi_variant_handling", false);
        rggVarB.f("enable_mobile_data_download", true);
        rggVarB.f("enable_mobstore_file_service", true);
        rggVarB.f("enable_mobstore_file_service_rename", true);
        rggVarB.f("enable_mobstore_file_service_whitelist", true);
        i = rggVarB.f("enable_rng_based_device_stable_sampling", true);
        rggVarB.f("enable_set_runtime_properties", true);
        j = rggVarB.f("enable_sideloading", true);
        rggVarB.f("gms_mdd_enable_silent_feedback", true);
        k = rggVarB.f("enable_zip_folder", true);
        l = rggVarB.e("FeatureFlags__file_key_version", 2L);
        rggVarB.f("gcm_reschedule_only_once_per_process_start", true);
        rggVarB.f("gms_mdd_switch_to_cronet", false);
        rggVarB.e("gms_icing_mdd_location_s2_level", 10L);
        rggVarB.e("gms_icing_mdd_task_await_time", 5L);
        m = rggVarB.f("log_file_groups_with_files_missing", true);
        n = rggVarB.f("log_network_stats", true);
        rggVarB.f("gms_mdd_log_storage_stats", true);
        o = rggVarB.f("gms_icing_mdd_delete_groups_removed_accounts", false);
        p = rggVarB.f("gms_icing_mdd_delete_uninstalled_apps", true);
        q = rggVarB.f("gms_icing_mdd_enable_download_pending_groups", true);
        r = rggVarB.f("gms_icing_mdd_enable_garbage_collection", true);
        s = rggVarB.f("gms_icing_mdd_enable_verify_pending_groups", true);
        t = rggVarB.e("gms_icing_mdd_reset_trigger", 0L);
        rggVarB.f("migrate_file_expiration_policy", true);
        rggVarB.f("migrate_to_new_file_key", true);
        u = new rge(rggVarB, "FeatureFlags__pds_migration_state", "", new rgf() { // from class: aesx
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
                    phk r0 = defpackage.phk.a
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
                    phk r5 = (defpackage.phk) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aesx.a(byte[]):java.lang.Object");
            }
        });
        rggVarB.f("remove_groupkeys_with_downloaded_field_not_set", true);
        rggVarB.f("test_only_file_key_version", false);
    }

    @Override // defpackage.aesv
    public final long a() {
        return ((Long) l.b()).longValue();
    }

    @Override // defpackage.aesv
    public final long b() {
        return ((Long) t.b()).longValue();
    }

    @Override // defpackage.aesv
    public final phk c() {
        return (phk) u.b();
    }

    @Override // defpackage.aesv
    public final boolean d() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean e() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean f() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean g() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean h() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean i() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean j() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean k() {
        return ((Boolean) i.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean l() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean m() {
        return ((Boolean) k.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean n() {
        return ((Boolean) m.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean o() {
        return ((Boolean) n.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean p() {
        return ((Boolean) o.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean q() {
        return ((Boolean) p.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean r() {
        return ((Boolean) q.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean s() {
        return ((Boolean) r.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final boolean t() {
        return ((Boolean) s.b()).booleanValue();
    }

    @Override // defpackage.aesv
    public final void u() {
        ((Boolean) h.b()).booleanValue();
    }
}
