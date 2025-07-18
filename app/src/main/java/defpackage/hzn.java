package defpackage;

import android.widget.TextView;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzn extends hyr {
    public hzn(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 7) {
                return g(hzk.LISTENING);
            }
            switch (iOrdinal) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return g(hzk.ATTENTION_ASSISTANT);
                case 15:
                case 16:
                    break;
                case 17:
                    return e(hzk.RESPONSE);
                default:
                    l(hzgVar);
                    return this;
            }
        }
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        switch (hzgVar.ordinal()) {
            case 8:
                break;
            case 9:
                break;
            case 10:
                this.b.p(str);
                break;
            default:
                l(hzgVar);
                break;
        }
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final void n(String str) {
        SearchBar searchBar = (SearchBar) this.b;
        TextView response = searchBar.getResponse();
        response.setText(str);
        searchBar.getSearchBarTextAnimation().e(response);
        this.b.u(11, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.as;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.o();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.ez();
    }
}
