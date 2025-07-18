package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmi extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        cld cldVar = (cld) obj;
        brjVar.i(1, cldVar.c);
        brjVar.g(2, cms.b(cldVar.d));
        brjVar.i(3, cldVar.e);
        brjVar.i(4, cldVar.f);
        caw cawVar = caz.a;
        brjVar.e(5, cawVar.b(cldVar.g));
        brjVar.e(6, cawVar.b(cldVar.h));
        brjVar.g(7, cldVar.i);
        brjVar.g(8, cldVar.j);
        brjVar.g(9, cldVar.k);
        brjVar.g(10, cldVar.m);
        brjVar.g(11, cms.a(cldVar.n));
        brjVar.g(12, cldVar.o);
        brjVar.g(13, cldVar.p);
        brjVar.g(14, cldVar.q);
        brjVar.g(15, cldVar.r);
        brjVar.g(16, cldVar.s ? 1L : 0L);
        brjVar.g(17, cms.j(cldVar.A));
        brjVar.g(18, cldVar.t);
        brjVar.g(19, cldVar.u);
        brjVar.g(20, cldVar.v);
        brjVar.g(21, cldVar.w);
        brjVar.g(22, cldVar.x);
        String str = cldVar.y;
        if (str == null) {
            brjVar.h(23);
        } else {
            brjVar.i(23, str);
        }
        Boolean bool = cldVar.z;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            brjVar.h(24);
        } else {
            brjVar.g(24, r0.intValue());
        }
        caq caqVar = cldVar.l;
        brjVar.g(25, cms.i(caqVar.j));
        brjVar.e(26, cms.g(caqVar.b));
        brjVar.g(27, caqVar.c ? 1L : 0L);
        brjVar.g(28, caqVar.d ? 1L : 0L);
        brjVar.g(29, caqVar.e ? 1L : 0L);
        brjVar.g(30, caqVar.f ? 1L : 0L);
        brjVar.g(31, caqVar.g);
        brjVar.g(32, caqVar.h);
        brjVar.e(33, cms.h(caqVar.i));
    }
}
