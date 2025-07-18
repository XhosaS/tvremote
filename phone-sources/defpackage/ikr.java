package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ikr extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `last_watched_item` (`account_name`,`show_id`,`last_watched_episode_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        img imgVar = (img) obj;
        ghiVar.i(1, imgVar.a);
        String strT = ipc.t(imgVar.b);
        if (strT == null) {
            ghiVar.h(2);
        } else {
            ghiVar.i(2, strT);
        }
        String strT2 = ipc.t(imgVar.c);
        if (strT2 == null) {
            ghiVar.h(3);
        } else {
            ghiVar.i(3, strT2);
        }
    }
}
