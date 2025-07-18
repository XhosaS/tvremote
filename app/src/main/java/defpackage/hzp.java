package defpackage;

import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzp extends hyr {
    private final Runnable d;

    public hzp(hzk hzkVar, hzd hzdVar, hzf hzfVar, Runnable runnable) {
        super(hzkVar, hzdVar, hzfVar);
        this.d = runnable;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return g(hzk.RESPONSE_IDLE);
            }
            if (iOrdinal == 2) {
                return g(hzk.TALKING);
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 7) {
                    return g(hzk.LISTENING);
                }
                if (iOrdinal != 11) {
                    switch (iOrdinal) {
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        case 15:
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            return g(hzk.ATTENTION_ASSISTANT);
                        case 16:
                            return g(hzk.TALKING_IDLE);
                        default:
                            l(hzgVar);
                            return this;
                    }
                }
                return this;
            }
        }
        return g(hzk.IDLE);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        switch (hzgVar.ordinal()) {
            case 8:
                return h(hzk.LOADING, str);
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
            ((SearchBar) this.b).f().b(str, str2);
            return this;
        }
        l(hzgVar);
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final void o(String str, String str2) {
        SearchBar searchBar = (SearchBar) this.b;
        if (searchBar.m.b()) {
            searchBar.P.b((LayerDrawable) searchBar.getBackground());
        }
        Runnable runnable = this.d;
        searchBar.f().b(str, str2);
        searchBar.getSearchBarTextAnimation().b(searchBar.e(), 1.0f, runnable);
        this.b.u(2, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.at;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.s();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.eA();
    }
}
