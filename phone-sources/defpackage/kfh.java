package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfh extends dwt {
    public ihg a;
    public final yva b;
    public final yva c;
    public final yva d;
    public final yva e;
    public final yft f;
    public final yvc g;
    public final yvc h;
    public final yvc i;
    public final yvc j;
    public isy k;
    private final yft l;

    public kfh(dwi dwiVar) {
        dwiVar.getClass();
        String str = (String) dwiVar.b("search_query");
        yvc yvcVarA = yvd.a(str == null ? "" : str);
        this.g = yvcVarA;
        this.b = new yul(yvcVarA);
        yhb yhbVar = yhb.a;
        yvc yvcVarA2 = yvd.a(yhbVar);
        this.h = yvcVarA2;
        this.c = new yul(yvcVarA2);
        yvc yvcVarA3 = yvd.a(yhbVar);
        this.i = yvcVarA3;
        this.d = vyf.w(new ipi((yjz) new kci(this, (yih) null, 2), (ysx) yvcVarA3, 13), dwu.a(this), yut.a(0L, 3), yhbVar);
        yvc yvcVarA4 = yvd.a(yhbVar);
        this.j = yvcVarA4;
        this.e = new yul(yvcVarA4);
        this.l = new yga(new keu(this, 10));
        this.f = new yga(new keu(dwiVar, 11));
    }

    public final int a() {
        ihg ihgVar = this.a;
        if (ihgVar == null) {
            yks.c("bc25FlagsManager");
            ihgVar = null;
        }
        return (int) ((Long) xhq.a.c(5, "Bc25Feature__recent_search_history_size", 2L).et(((xhq) ihgVar.a).b)).longValue();
    }

    public final jto b() {
        Object objA = this.l.a();
        objA.getClass();
        return (jto) objA;
    }

    public final void c(String str) {
        jto jtoVarB = b();
        ieg iegVarA = ((ldy) jtoVarB.b).a();
        iegVarA.getClass();
        if (iegVarA.m()) {
            jtoVarB.e.p(str);
        } else {
            ((tug) jto.a.e().h(tvo.a, "GTVM-SearchQuery").j("com/google/android/apps/googletv/app/presentation/components/searchsuggestions/v2/SearchSuggestionsDataSource", "saveNewSearchHistoryItem", 30, "SearchSuggestionsDataSource.kt")).s("Unable to save new search item as account is not present");
        }
    }

    public final void e() {
        jto jtoVarB = b();
        int iA = a();
        ykr.q(jtoVarB.d, null, 0, new jtn(jtoVarB, new kah(this, 15), iA, null, 1), 3);
    }
}
