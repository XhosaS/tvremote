package defpackage;

import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyy extends hyr {
    public hyy(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 4) {
                return g(hzk.IDLE);
            }
            if (iOrdinal == 7) {
                return g(hzk.LISTENING);
            }
            switch (iOrdinal) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return g(hzk.ATTENTION_ASSISTANT);
                case 15:
                case 16:
                    break;
                default:
                    l(hzgVar);
                    return this;
            }
        }
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        if (hzgVar == hzg.SHOW_ERROR) {
            return h(hzk.ERROR, str);
        }
        l(hzgVar);
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final void m() {
        SearchBar searchBar = (SearchBar) this.b;
        if (searchBar.m.b()) {
            searchBar.P.b((LayerDrawable) searchBar.getBackground());
        }
        searchBar.getSearchBarTextAnimation().e(searchBar.e());
        this.b.u(10, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.ag;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.s();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.eo();
    }
}
