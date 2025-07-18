package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvd extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        guw guwVar = (guw) obj;
        ghiVar.i(1, guwVar.b);
        ghiVar.g(2, fki.aA(guwVar.c));
        ghiVar.i(3, guwVar.d);
        ghiVar.i(4, guwVar.e);
        gox goxVar = gox.a;
        ghiVar.e(5, gli.x(guwVar.f));
        ghiVar.e(6, gli.x(guwVar.g));
        ghiVar.g(7, guwVar.h);
        ghiVar.g(8, guwVar.i);
        ghiVar.g(9, guwVar.j);
        ghiVar.g(10, guwVar.l);
        ghiVar.g(11, fki.aG(guwVar.y));
        ghiVar.g(12, guwVar.m);
        ghiVar.g(13, guwVar.n);
        ghiVar.g(14, guwVar.o);
        ghiVar.g(15, guwVar.p);
        ghiVar.g(16, guwVar.q ? 1L : 0L);
        ghiVar.g(17, fki.aI(guwVar.z));
        ghiVar.g(18, guwVar.r);
        ghiVar.g(19, guwVar.s);
        ghiVar.g(20, guwVar.t);
        ghiVar.g(21, guwVar.u);
        ghiVar.g(22, guwVar.v);
        String str = guwVar.w;
        if (str == null) {
            ghiVar.h(23);
        } else {
            ghiVar.i(23, str);
        }
        Boolean bool = guwVar.x;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            ghiVar.h(24);
        } else {
            ghiVar.g(24, r0.intValue());
        }
        gou gouVar = guwVar.k;
        ghiVar.g(25, fki.aH(gouVar.j));
        ghiVar.e(26, fki.aE(gouVar.b));
        ghiVar.g(27, gouVar.c ? 1L : 0L);
        ghiVar.g(28, gouVar.d ? 1L : 0L);
        ghiVar.g(29, gouVar.e ? 1L : 0L);
        ghiVar.g(30, gouVar.f ? 1L : 0L);
        ghiVar.g(31, gouVar.g);
        ghiVar.g(32, gouVar.h);
        ghiVar.e(33, fki.aF(gouVar.i));
    }
}
