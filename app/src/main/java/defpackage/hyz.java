package defpackage;

import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyz extends hyr {
    private final Runnable d;

    public hyz(hzk hzkVar, hzd hzdVar, hzf hzfVar, Runnable runnable) {
        super(hzkVar, hzdVar, hzfVar);
        this.d = runnable;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 1) {
            return g(hzk.RESPONSE_IDLE);
        }
        if (iOrdinal == 2) {
            return g(hzk.TALKING);
        }
        if (iOrdinal == 5) {
            hyr hyrVarQ = ((hvt) this.c).q(hzk.LOADING_IN_APP);
            hyrVarQ.m();
            return hyrVarQ;
        }
        if (iOrdinal == 7) {
            return g(hzk.LISTENING);
        }
        switch (iOrdinal) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return g(hzk.ATTENTION_ASSISTANT);
            case 15:
                return this;
            case 16:
                return g(hzk.TALKING_IDLE);
            default:
                l(hzgVar);
                return this;
        }
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        switch (hzgVar.ordinal()) {
            case 8:
                ((SearchBar) this.b).f().a(str);
                return this;
            case 9:
                return h(hzk.ERROR, str);
            case 10:
                return h(hzk.RESPONSE, str);
            default:
                l(hzgVar);
                return this;
        }
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
        Runnable runnable = this.d;
        searchBar.f().a(str);
        searchBar.getSearchBarTextAnimation().b(searchBar.e(), 0.5f, runnable);
        this.b.u(4, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.al;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.s();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.es();
    }
}
