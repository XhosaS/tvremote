package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lou extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `watchlist` (`account_name`,`asset_id`,`asset_type`,`asset_state`,`asset_order`,`in_cloud`) VALUES (?,?,?,?,?,?)";
    }

    @Override // defpackage.gei
    public final /* synthetic */ void b(ghi ghiVar, Object obj) {
        kgu.v(ghiVar, (lox) obj);
    }
}
