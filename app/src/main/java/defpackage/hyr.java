package defpackage;

import android.widget.TextView;
import com.google.android.apps.tvsearch.searchbar.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hyr implements hze {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/searchbar/states/AbstractSearchBarState");
    public final hzk a;
    public hzd b;
    public hzf c;

    public hyr(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        this.a = hzkVar;
        this.b = hzdVar;
        this.c = hzfVar;
    }

    @Override // defpackage.hze
    public hze a(hzg hzgVar) {
        throw null;
    }

    @Override // defpackage.hze
    public hze b(hzg hzgVar, String str) {
        throw null;
    }

    @Override // defpackage.hze
    public hze c(hzg hzgVar, String str, String str2) {
        l(hzgVar);
        return this;
    }

    final hze d(hzk hzkVar) {
        int iOrdinal = hzkVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 5) {
                if (iOrdinal != 9) {
                    if (iOrdinal != 11) {
                        if (iOrdinal != 14) {
                            return g(hzkVar);
                        }
                    }
                }
            }
            SearchBar searchBar = (SearchBar) this.b;
            searchBar.m(searchBar.getHesitatedPromptId());
            hyr hyrVarQ = ((hvt) this.c).q(hzkVar);
            hyrVarQ.m();
            return hyrVarQ;
        }
        SearchBar searchBar2 = (SearchBar) this.b;
        searchBar2.m(searchBar2.getIdlePromptId());
        hyr hyrVarQ2 = ((hvt) this.c).q(hzkVar);
        hyrVarQ2.m();
        return hyrVarQ2;
    }

    final hze e(hzk hzkVar) {
        int iOrdinal = hzkVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 8) {
            this.b.u(10, false);
            return ((hvt) this.c).q(hzkVar);
        }
        if (iOrdinal != 15) {
            return g(hzkVar);
        }
        this.b.u(11, false);
        return ((hvt) this.c).q(hzkVar);
    }

    final hze f(hzk hzkVar, String str) {
        int iOrdinal = hzkVar.ordinal();
        if (iOrdinal != 1 && iOrdinal != 8 && iOrdinal != 15) {
            return h(hzkVar, str);
        }
        SearchBar searchBar = (SearchBar) this.b;
        TextView response = searchBar.getResponse();
        CharSequence text = response.getText();
        if (!str.contentEquals(text)) {
            TextView exitResponse = searchBar.getExitResponse();
            exitResponse.setVisibility(0);
            exitResponse.setText(text);
            searchBar.getSearchBarTextAnimation().d(exitResponse, response);
        }
        hyr hyrVarQ = ((hvt) this.c).q(hzkVar);
        hyrVarQ.n(str);
        return hyrVarQ;
    }

    protected final hze g(hzk hzkVar) {
        q();
        hyr hyrVarQ = ((hvt) this.c).q(hzkVar);
        hyrVarQ.m();
        return hyrVarQ;
    }

    protected final hze h(hzk hzkVar, String str) {
        q();
        hyr hyrVarQ = ((hvt) this.c).q(hzkVar);
        hyrVarQ.n(str);
        return hyrVarQ;
    }

    protected final hze i(String str, String str2) {
        q();
        hyr hyrVarQ = ((hvt) this.c).q(hzk.TRANSCRIBING);
        hyrVarQ.o(str, str2);
        return hyrVarQ;
    }

    @Override // defpackage.hze
    public final hzk j() {
        return this.a;
    }

    final void k() {
        ((zdv) ((zdv) d.c()).q("com/google/android/apps/tvsearch/searchbar/states/AbstractSearchBarState", "unexpectedEnter", 81, "AbstractSearchBarState.java")).x("%s unexpected call to enter.", this.a);
    }

    final void l(hzg hzgVar) {
        ((zdv) ((zdv) ((zdv) d.c()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/searchbar/states/AbstractSearchBarState", "unexpectedSignal", 74, "AbstractSearchBarState.java")).F("%s unexpected signal %s.", new qsk(this.a), new qsk(hzgVar));
    }

    @Override // defpackage.hze
    public void m() {
        k();
    }

    @Override // defpackage.hze
    public void n(String str) {
        k();
    }

    @Override // defpackage.hze
    public void o(String str, String str2) {
        k();
    }
}
