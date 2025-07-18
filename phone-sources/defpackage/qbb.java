package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbb extends geh {
    @Override // defpackage.geh
    protected final String a() {
        return "UPDATE OR ABORT `chime_thread_states` SET `id` = ?,`thread_id` = ?,`last_updated_version` = ?,`read_state` = ?,`deletion_status` = ?,`count_behavior` = ?,`system_tray_behavior` = ?,`modified_timestamp` = ? WHERE `id` = ?";
    }

    @Override // defpackage.geh
    protected final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        qax qaxVar = (qax) obj;
        long j = qaxVar.a;
        ghiVar.g(1, j);
        ghiVar.i(2, qaxVar.b);
        ghiVar.g(3, qaxVar.c);
        ghiVar.g(4, qaxVar.h - 1);
        ghiVar.g(5, qaxVar.d.d);
        ghiVar.g(6, qaxVar.f - 1);
        ghiVar.g(7, qaxVar.g - 1);
        ghiVar.g(8, qaxVar.e);
        ghiVar.g(9, j);
    }
}
