package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfl extends bmu {
    final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfl(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.bmu
    public final bmt a(bsk bskVar) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new bqc("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new bqc("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listSingletonList = Collections.singletonList("work_spec_id");
        listSingletonList.getClass();
        List listSingletonList2 = Collections.singletonList("id");
        listSingletonList2.getClass();
        linkedHashSet.add(new bqd("WorkSpec", "CASCADE", "CASCADE", listSingletonList, listSingletonList2));
        List listSingletonList3 = Collections.singletonList("prerequisite_id");
        listSingletonList3.getClass();
        List listSingletonList4 = Collections.singletonList("id");
        listSingletonList4.getClass();
        linkedHashSet.add(new bqd("WorkSpec", "CASCADE", "CASCADE", listSingletonList3, listSingletonList4));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List listSingletonList5 = Collections.singletonList("work_spec_id");
        listSingletonList5.getClass();
        List listSingletonList6 = Collections.singletonList("ASC");
        listSingletonList6.getClass();
        linkedHashSet2.add(new bqe("index_Dependency_work_spec_id", false, listSingletonList5, listSingletonList6));
        List listSingletonList7 = Collections.singletonList("prerequisite_id");
        listSingletonList7.getClass();
        List listSingletonList8 = Collections.singletonList("ASC");
        listSingletonList8.getClass();
        linkedHashSet2.add(new bqe("index_Dependency_prerequisite_id", false, listSingletonList7, listSingletonList8));
        bqf bqfVar = new bqf("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        bqf bqfVarA = bqa.a(bskVar, "Dependency");
        if (!bqi.f(bqfVar, bqfVarA)) {
            return new bmt(false, a.d(bqfVarA, bqfVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new bqc("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new bqc("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new bqc("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new bqc("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new bqc("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new bqc("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new bqc("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new bqc("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new bqc("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new bqc("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new bqc("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new bqc("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new bqc("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new bqc("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new bqc("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new bqc("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new bqc("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new bqc("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new bqc("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new bqc("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new bqc("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new bqc("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new bqc("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new bqc("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new bqc("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new bqc("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new bqc("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new bqc("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new bqc("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new bqc("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new bqc("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new bqc("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new bqc("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        List listSingletonList9 = Collections.singletonList("schedule_requested_at");
        listSingletonList9.getClass();
        List listSingletonList10 = Collections.singletonList("ASC");
        listSingletonList10.getClass();
        linkedHashSet4.add(new bqe("index_WorkSpec_schedule_requested_at", false, listSingletonList9, listSingletonList10));
        List listSingletonList11 = Collections.singletonList("last_enqueue_time");
        listSingletonList11.getClass();
        List listSingletonList12 = Collections.singletonList("ASC");
        listSingletonList12.getClass();
        linkedHashSet4.add(new bqe("index_WorkSpec_last_enqueue_time", false, listSingletonList11, listSingletonList12));
        bqf bqfVar2 = new bqf("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        bqf bqfVarA2 = bqa.a(bskVar, "WorkSpec");
        if (!bqi.f(bqfVar2, bqfVarA2)) {
            return new bmt(false, a.d(bqfVarA2, bqfVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new bqc("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new bqc("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        List listSingletonList13 = Collections.singletonList("work_spec_id");
        listSingletonList13.getClass();
        List listSingletonList14 = Collections.singletonList("id");
        listSingletonList14.getClass();
        linkedHashSet5.add(new bqd("WorkSpec", "CASCADE", "CASCADE", listSingletonList13, listSingletonList14));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        List listSingletonList15 = Collections.singletonList("work_spec_id");
        listSingletonList15.getClass();
        List listSingletonList16 = Collections.singletonList("ASC");
        listSingletonList16.getClass();
        linkedHashSet6.add(new bqe("index_WorkTag_work_spec_id", false, listSingletonList15, listSingletonList16));
        bqf bqfVar3 = new bqf("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        bqf bqfVarA3 = bqa.a(bskVar, "WorkTag");
        if (!bqi.f(bqfVar3, bqfVarA3)) {
            return new bmt(false, a.d(bqfVarA3, bqfVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new bqc("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new bqc("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new bqc("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        List listSingletonList17 = Collections.singletonList("work_spec_id");
        listSingletonList17.getClass();
        List listSingletonList18 = Collections.singletonList("id");
        listSingletonList18.getClass();
        linkedHashSet7.add(new bqd("WorkSpec", "CASCADE", "CASCADE", listSingletonList17, listSingletonList18));
        bqf bqfVar4 = new bqf("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        bqf bqfVarA4 = bqa.a(bskVar, "SystemIdInfo");
        if (!bqi.f(bqfVar4, bqfVarA4)) {
            return new bmt(false, a.d(bqfVarA4, bqfVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new bqc("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new bqc("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        List listSingletonList19 = Collections.singletonList("work_spec_id");
        listSingletonList19.getClass();
        List listSingletonList20 = Collections.singletonList("id");
        listSingletonList20.getClass();
        linkedHashSet8.add(new bqd("WorkSpec", "CASCADE", "CASCADE", listSingletonList19, listSingletonList20));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        List listSingletonList21 = Collections.singletonList("work_spec_id");
        listSingletonList21.getClass();
        List listSingletonList22 = Collections.singletonList("ASC");
        listSingletonList22.getClass();
        linkedHashSet9.add(new bqe("index_WorkName_work_spec_id", false, listSingletonList21, listSingletonList22));
        bqf bqfVar5 = new bqf("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        bqf bqfVarA5 = bqa.a(bskVar, "WorkName");
        if (!bqi.f(bqfVar5, bqfVarA5)) {
            return new bmt(false, a.d(bqfVarA5, bqfVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new bqc("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new bqc("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        List listSingletonList23 = Collections.singletonList("work_spec_id");
        listSingletonList23.getClass();
        List listSingletonList24 = Collections.singletonList("id");
        listSingletonList24.getClass();
        linkedHashSet10.add(new bqd("WorkSpec", "CASCADE", "CASCADE", listSingletonList23, listSingletonList24));
        bqf bqfVar6 = new bqf("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        bqf bqfVarA6 = bqa.a(bskVar, "WorkProgress");
        if (!bqi.f(bqfVar6, bqfVarA6)) {
            return new bmt(false, a.d(bqfVarA6, bqfVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new bqc("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new bqc("long_value", "INTEGER", false, 0, null, 1));
        bqf bqfVar7 = new bqf("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        bqf bqfVarA7 = bqa.a(bskVar, "Preference");
        return !bqi.f(bqfVar7, bqfVarA7) ? new bmt(false, a.d(bqfVarA7, bqfVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new bmt(true, null);
    }

    @Override // defpackage.bmu
    public final void b(bsk bskVar) throws Exception {
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bri.a(bskVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bri.a(bskVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        bri.a(bskVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bri.a(bskVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bri.a(bskVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bri.a(bskVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bri.a(bskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.bmu
    public final void c(bsk bskVar) throws Exception {
        bri.a(bskVar, "DROP TABLE IF EXISTS `Dependency`");
        bri.a(bskVar, "DROP TABLE IF EXISTS `WorkSpec`");
        bri.a(bskVar, "DROP TABLE IF EXISTS `WorkTag`");
        bri.a(bskVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        bri.a(bskVar, "DROP TABLE IF EXISTS `WorkName`");
        bri.a(bskVar, "DROP TABLE IF EXISTS `WorkProgress`");
        bri.a(bskVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.bmu
    public final void d(bsk bskVar) throws Exception {
        bri.a(bskVar, "PRAGMA foreign_keys = ON");
        this.d.u(bskVar);
    }

    @Override // defpackage.bmu
    public final void e(bsk bskVar) throws Exception {
        bpb.a(bskVar);
    }

    @Override // defpackage.bmu
    public final void f() {
    }

    @Override // defpackage.bmu
    public final void g() {
    }
}
