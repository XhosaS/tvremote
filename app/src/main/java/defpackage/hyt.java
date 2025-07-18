package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.widget.TextView;
import com.google.android.apps.tvsearch.searchbar.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyt extends hyr {
    public hyt(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 1) {
            return g(hzk.RESPONSE_IDLE);
        }
        if (iOrdinal == 7) {
            return g(hzk.LISTENING);
        }
        if (iOrdinal == 14) {
            return g(hzk.ATTENTION_ASSISTANT);
        }
        if (iOrdinal != 15) {
            l(hzgVar);
        }
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 9) {
            this.b.p(str);
            return this;
        }
        if (iOrdinal == 10) {
            return f(hzk.RESPONSE, str);
        }
        l(hzgVar);
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze c(hzg hzgVar, String str, String str2) {
        if (hzgVar == hzg.SPEECH) {
            return i(str, str2);
        }
        l(hzgVar);
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final void n(String str) {
        SearchBar searchBar = (SearchBar) this.b;
        if (searchBar.m.b()) {
            searchBar.P.b((LayerDrawable) searchBar.getBackground());
        }
        TextView response = searchBar.getResponse();
        response.setText(str);
        searchBar.getSearchBarTextAnimation().e(response);
        this.b.u(10, true);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.an;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.o();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.eu();
    }
}
