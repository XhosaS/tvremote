package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ilm extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `watch_actions` (`account_name`,`entity_id`,`keep_forever`,`watch_actions_blob`,`last_server_write_millis`) VALUES (?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        imj imjVar = (imj) obj;
        ghiVar.i(1, imjVar.a);
        ghiVar.i(2, ihz.c(imjVar.b));
        ghiVar.g(3, imjVar.c ? 1L : 0L);
        ghiVar.e(4, imjVar.d.h());
        ghiVar.g(5, imjVar.e);
    }
}
