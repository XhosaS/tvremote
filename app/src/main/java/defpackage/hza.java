package defpackage;

import com.google.android.apps.tvsearch.searchbar.SearchBar;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hza extends hyr {
    public hza(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 1) {
            return this;
        }
        if (iOrdinal == 2) {
            return d(hzk.TALKING);
        }
        if (iOrdinal == 6) {
            return d(hzk.KEYBOARD);
        }
        if (iOrdinal == 7) {
            return d(hzk.LISTENING);
        }
        switch (iOrdinal) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return d(hzk.ATTENTION_ASSISTANT);
            case 15:
                SearchBar searchBar = (SearchBar) this.b;
                searchBar.n(searchBar.getIdlePromptId(), false);
                return this;
            case 16:
                return d(hzk.TALKING_IDLE);
            default:
                l(hzgVar);
                return this;
        }
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
    public final void m() {
        SearchBar searchBar = (SearchBar) this.b;
        searchBar.k(searchBar.getIdlePromptId(), false);
        this.b.q();
        this.b.u(10, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.af;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.l();
        this.b.r();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.en();
    }
}
