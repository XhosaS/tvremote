package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iki extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `media_library_item_page_data` (`play_id`,`account_name`,`entity_stream`,`expiration_time_millis`) VALUES (?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        imd imdVar = (imd) obj;
        String strT = ipc.t(imdVar.a);
        if (strT == null) {
            ghiVar.h(1);
        } else {
            ghiVar.i(1, strT);
        }
        ghiVar.i(2, imdVar.b);
        ghiVar.e(3, imdVar.c.h());
        ghiVar.g(4, imdVar.d);
    }
}
