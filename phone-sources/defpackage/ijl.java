package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ijl extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `persistent_cache` (`cache_key`,`account_name`,`cache_value`,`expiration_time_millis`,`access_time_millis`,`cache_val_bytes`,`cache_id`) VALUES (?,?,?,?,?,?,nullif(?, 0))";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ilz ilzVar = (ilz) obj;
        ghiVar.e(1, ihz.h(ilzVar.a));
        ghiVar.i(2, ilzVar.b);
        ghiVar.e(3, ilzVar.c.h());
        ghiVar.g(4, ilzVar.d);
        ghiVar.g(5, ilzVar.e);
        ghiVar.g(6, ilzVar.f);
        ghiVar.g(7, 0L);
    }
}
