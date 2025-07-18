package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ikk extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `media_library_item_rental` (`play_id`,`account_name`,`short_rental_expiration_timestamp`) VALUES (?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ime imeVar = (ime) obj;
        String strT = ipc.t(imeVar.a);
        if (strT == null) {
            ghiVar.h(1);
        } else {
            ghiVar.i(1, strT);
        }
        ghiVar.i(2, imeVar.b);
        Long l = imeVar.c;
        if (l == null) {
            ghiVar.h(3);
        } else {
            ghiVar.g(3, l.longValue());
        }
    }
}
