package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qba extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR IGNORE INTO `chime_thread_states` (`id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        qax qaxVar = (qax) obj;
        ghiVar.g(1, qaxVar.a);
        ghiVar.i(2, qaxVar.b);
        ghiVar.g(3, qaxVar.c);
        ghiVar.g(4, qaxVar.h - 1);
        ghiVar.g(5, qaxVar.d.d);
        ghiVar.g(6, qaxVar.f - 1);
        ghiVar.g(7, qaxVar.g - 1);
        ghiVar.g(8, qaxVar.e);
    }
}
