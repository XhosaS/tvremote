package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grr extends gfa {
    final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grr(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `Dependency`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `WorkSpec`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `WorkTag`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `WorkName`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `WorkProgress`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.gfa
    public final void c(gic gicVar) throws Exception {
        gez.t(gicVar, "PRAGMA foreign_keys = ON");
        this.d.v(gicVar);
    }

    @Override // defpackage.gfa
    public final void d(gic gicVar) throws Exception {
        gez.m(gicVar);
    }

    @Override // defpackage.gfa
    public final xqr g(gic gicVar) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new ggt("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new ggt("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new ggu("WorkSpec", "CASCADE", "CASCADE", yfm.p("work_spec_id"), yfm.p("id")));
        linkedHashSet.add(new ggu("WorkSpec", "CASCADE", "CASCADE", yfm.p("prerequisite_id"), yfm.p("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new ggv("index_Dependency_work_spec_id", false, yfm.p("work_spec_id"), yfm.p("ASC")));
        linkedHashSet2.add(new ggv("index_Dependency_prerequisite_id", false, yfm.p("prerequisite_id"), yfm.p("ASC")));
        ggw ggwVar = new ggw("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        ggw ggwVarB = ggs.b(gicVar, "Dependency");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, a.ck(ggwVarB, ggwVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new ggt("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new ggt("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new ggt("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new ggt("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new ggt("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new ggt("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new ggt("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new ggt("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new ggt("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new ggt("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new ggt("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new ggt("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new ggt("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new ggt("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new ggt("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new ggt("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new ggt("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new ggt("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new ggt("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new ggt("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new ggt("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new ggt("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new ggt("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new ggt("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new ggt("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new ggt("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new ggt("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new ggt("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new ggt("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new ggt("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new ggt("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new ggt("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new ggt("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new ggv("index_WorkSpec_schedule_requested_at", false, yfm.p("schedule_requested_at"), yfm.p("ASC")));
        linkedHashSet4.add(new ggv("index_WorkSpec_last_enqueue_time", false, yfm.p("last_enqueue_time"), yfm.p("ASC")));
        ggw ggwVar2 = new ggw("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        ggw ggwVarB2 = ggs.b(gicVar, "WorkSpec");
        if (!gez.F(ggwVar2, ggwVarB2)) {
            return new xqr(false, a.ck(ggwVarB2, ggwVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new ggt("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new ggt("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new ggu("WorkSpec", "CASCADE", "CASCADE", yfm.p("work_spec_id"), yfm.p("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new ggv("index_WorkTag_work_spec_id", false, yfm.p("work_spec_id"), yfm.p("ASC")));
        ggw ggwVar3 = new ggw("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        ggw ggwVarB3 = ggs.b(gicVar, "WorkTag");
        if (!gez.F(ggwVar3, ggwVarB3)) {
            return new xqr(false, a.ck(ggwVarB3, ggwVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new ggt("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new ggt("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new ggt("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new ggu("WorkSpec", "CASCADE", "CASCADE", yfm.p("work_spec_id"), yfm.p("id")));
        ggw ggwVar4 = new ggw("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        ggw ggwVarB4 = ggs.b(gicVar, "SystemIdInfo");
        if (!gez.F(ggwVar4, ggwVarB4)) {
            return new xqr(false, a.ck(ggwVarB4, ggwVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new ggt("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new ggt("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new ggu("WorkSpec", "CASCADE", "CASCADE", yfm.p("work_spec_id"), yfm.p("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new ggv("index_WorkName_work_spec_id", false, yfm.p("work_spec_id"), yfm.p("ASC")));
        ggw ggwVar5 = new ggw("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        ggw ggwVarB5 = ggs.b(gicVar, "WorkName");
        if (!gez.F(ggwVar5, ggwVarB5)) {
            return new xqr(false, a.ck(ggwVarB5, ggwVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new ggt("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new ggt("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new ggu("WorkSpec", "CASCADE", "CASCADE", yfm.p("work_spec_id"), yfm.p("id")));
        ggw ggwVar6 = new ggw("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        ggw ggwVarB6 = ggs.b(gicVar, "WorkProgress");
        if (!gez.F(ggwVar6, ggwVarB6)) {
            return new xqr(false, a.ck(ggwVarB6, ggwVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new ggt("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new ggt("long_value", "INTEGER", false, 0, null, 1));
        ggw ggwVar7 = new ggw("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        ggw ggwVarB7 = ggs.b(gicVar, "Preference");
        return !gez.F(ggwVar7, ggwVarB7) ? new xqr(false, a.ck(ggwVarB7, ggwVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
