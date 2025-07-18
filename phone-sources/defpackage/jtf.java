package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtf extends scf {
    public scg a;
    public sck b;
    public wlx c;
    public boolean d;
    public boolean e;
    public wls f;
    public View.OnClickListener g;
    public String h;
    private final yfo i;

    public jtf(yfo yfoVar) {
        this.i = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.search_suggestions_item_view_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jtf jtfVar = (jtf) scfVar;
        long j = true != yks.e(this.c, jtfVar.c) ? 1L : 0L;
        if (!yks.e(Boolean.valueOf(this.d), Boolean.valueOf(jtfVar.d))) {
            j |= 2;
        }
        if (!yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jtfVar.e))) {
            j |= 4;
        }
        if (!yks.e(this.f, jtfVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jtfVar.g)) {
            j |= 16;
        }
        return !yks.e(this.h, jtfVar.h) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.i.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jte jteVar = (jte) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jteVar.b.t(jteVar, this.c, R.id.poster, -1, 8, false, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            jteVar.a().setVisibility(true != this.d ? 8 : 0);
        }
        if (j == 0 || (4 & j) != 0) {
            boolean z = this.e;
            ImageView imageViewA = jteVar.a();
            imageViewA.setImageDrawable(z ? imageViewA.getResources().getDrawable(2131232457, null) : imageViewA.getResources().getDrawable(2131232481, null));
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jteVar, this.f, R.id.title, 8);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jteVar.r(R.id.search_suggestion_item_component, this.g);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "search_suggestion_item_component", "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionItemViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            jwq.h(jteVar, this.h, R.id.search_suggestion_item_component);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("SearchSuggestionItemViewModel{poster=%s, showSearchImage=%s, useSearchHistoryIcon=%s, title=%s, onClickListener=%s, tag=%s}", this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h);
    }
}
