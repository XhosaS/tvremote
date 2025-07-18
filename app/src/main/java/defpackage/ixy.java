package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ixy extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR ABORT INTO `fallback_suggestion_table` (`display_text`,`foreground_app`,`server_log`) VALUES (?,?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        ixq ixqVar = (ixq) obj;
        brjVar.i(1, ixqVar.a);
        brjVar.i(2, ixqVar.b);
        brjVar.i(3, ixqVar.c);
    }
}
