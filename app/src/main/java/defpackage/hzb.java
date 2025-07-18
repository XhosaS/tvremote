package defpackage;

import android.widget.TextView;
import com.google.android.apps.tvsearch.searchbar.SearchBar;
import j$.time.Instant;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzb extends hyr {
    public hzb(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return g(hzk.TALKING);
            }
            if (iOrdinal == 7) {
                return g(hzk.LISTENING);
            }
            switch (iOrdinal) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return g(hzk.ATTENTION_ASSISTANT);
                case 15:
                    break;
                case 16:
                    return e(hzk.TALKING_RESPONSE);
                default:
                    l(hzgVar);
                    return this;
            }
        }
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 9) {
            return f(hzk.ERROR, str);
        }
        if (iOrdinal != 10) {
            l(hzgVar);
            return this;
        }
        this.b.p(str);
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final void n(String str) {
        final SearchBar searchBar = (SearchBar) this.b;
        TextView response = searchBar.getResponse();
        response.setText(str);
        searchBar.getSearchBarTextAnimation().b(response, 1.0f, new Runnable() { // from class: hvi
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar searchBar2 = searchBar;
                if (((Boolean) searchBar2.r.a()).booleanValue()) {
                    ((gfn) searchBar2.n.a()).a(rpm.co()).b().c();
                } else {
                    searchBar2.o.a(rpm.co(), abqb.OK, null, null);
                }
                searchBar2.p.y(gma.i);
                gmd gmdVar = searchBar2.q;
                gmc gmcVar = gmc.D;
                gmc gmcVar2 = gmc.J;
                gmdVar.p(gmcVar, gmcVar2);
                searchBar2.t.C(gmcVar2, Instant.EPOCH);
                searchBar2.u.af();
                if (((Boolean) searchBar2.l.a()).booleanValue() && searchBar2.s.b() != null) {
                    String strB = searchBar2.s.b();
                    gfl gflVarA = ((gfn) searchBar2.n.a()).a(rpm.cS()).a(strB);
                    gflVarA.h(strB);
                    gflVarA.c();
                    gfg gfgVarA = ((gfn) searchBar2.n.a()).c(rpm.dX()).a(strB);
                    gfgVarA.g(strB);
                    gfgVarA.c(abqb.OK);
                }
                ((zdv) ((zdv) SearchBar.h.b()).q("com/google/android/apps/tvsearch/searchbar/SearchBar", "logResponseEnterAnimationComplete", 843, "SearchBar.java")).u("Result displayed text.");
            }
        });
        this.b.u(10, false);
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
