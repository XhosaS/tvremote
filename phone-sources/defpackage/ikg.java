package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ikg extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `media_library_item_metadata` (`play_id`,`account_name`,`expiration_time_millis`,`component`,`search_suggestion_component`,`media_library_item_metadata`) VALUES (?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        imc imcVar = (imc) obj;
        String strT = ipc.t(imcVar.a);
        if (strT == null) {
            ghiVar.h(1);
        } else {
            ghiVar.i(1, strT);
        }
        ghiVar.i(2, imcVar.b);
        ghiVar.g(3, imcVar.c);
        byte[] bArrG = ihz.g(imcVar.d);
        if (bArrG == null) {
            ghiVar.h(4);
        } else {
            ghiVar.e(4, bArrG);
        }
        byte[] bArrG2 = ihz.g(imcVar.e);
        if (bArrG2 == null) {
            ghiVar.h(5);
        } else {
            ghiVar.e(5, bArrG2);
        }
        ghiVar.e(6, imcVar.f.h());
    }
}
