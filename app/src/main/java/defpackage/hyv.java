package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.widget.EditText;
import com.google.android.apps.tvsearch.searchbar.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyv extends hyr {
    public hyv(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 1) {
            return g(hzk.RESPONSE_IDLE);
        }
        if (iOrdinal == 6) {
            this.b.t();
            return this;
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
    public final void m() throws Resources.NotFoundException {
        this.b.q();
        this.b.u(10, false);
        final SearchBar searchBar = (SearchBar) this.b;
        EditText keyboardInputBox = searchBar.getKeyboardInputBox();
        if (keyboardInputBox != null) {
            if (searchBar.m.b()) {
                searchBar.P.b((LayerDrawable) searchBar.getBackground());
            }
            searchBar.getSearchBarTextAnimation().b(keyboardInputBox, 1.0f, new Runnable() { // from class: hvl
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    searchBar.t();
                }
            });
        }
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.ai;
    }

    @Override // defpackage.hze
    public final void q() throws Resources.NotFoundException {
        SearchBar searchBar = (SearchBar) this.b;
        EditText keyboardInputBox = searchBar.getKeyboardInputBox();
        if (keyboardInputBox != null) {
            searchBar.getSearchBarTextAnimation().c(keyboardInputBox);
            if (searchBar.m.b()) {
                searchBar.P.c((LayerDrawable) searchBar.getBackground());
            }
        }
        this.b.r();
        this.b.g();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.ep();
    }
}
