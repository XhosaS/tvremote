package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hms extends azx {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/renderedcardrow/RenderedCardRowPresenter");
    private final hmb b;
    private int c;
    private int d;

    public hms(hmb hmbVar) {
        this.b = hmbVar;
        this.e = null;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) throws Resources.NotFoundException {
        viewGroup.getClass();
        hmb hmbVar = this.b;
        gph gphVarR = hmbVar.r();
        gph gphVar = gph.a;
        if (gphVarR == gphVar) {
            this.c = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.rendered_card_row_extra_space_before_keyline_amati);
            this.d = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.rendered_card_row_extra_space_after_keyline_amati);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rendered_card_row, viewGroup, false);
        if (hmbVar.r() == gphVar) {
            viewInflate.getClass();
            viewInflate.setPadding(viewInflate.getPaddingLeft(), viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.rendered_card_row_extra_space_above_amati), viewInflate.getPaddingRight(), viewInflate.getPaddingBottom());
        } else {
            viewInflate.getClass();
            viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), viewInflate.getPaddingRight(), viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.space_blue));
        }
        viewInflate.getClass();
        return new hmr(viewInflate, hmbVar);
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        obj.getClass();
        if (!(obj instanceof hmq) || !(azwVar instanceof hmr)) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/results/renderedcardrow/RenderedCardRowPresenter", "onBindRowViewHolder", 73, "RenderedCardRowPresenter.kt")).u("#onBindRowViewHolder: Wrong use of the ViewHolder or Row");
            return;
        }
        hmr hmrVar = (hmr) azwVar;
        abky abkyVar = ((hmq) obj).a;
        abxc abxcVar = abkw.b;
        MessageLite messageLite = abxcVar.a;
        abky abkyVar2 = abky.a;
        if (messageLite != abkyVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = abkyVar.n;
        abxb abxbVar = abxcVar.d;
        if (abwrVar.n(abxbVar)) {
            if (messageLite != abkyVar2) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK = abkyVar.n.k(abxbVar);
            Object objB = objK == null ? abxcVar.b : abxcVar.b(objK);
            objB.getClass();
            hmrVar.b.addView(hho.a(hmrVar.g.getContext(), (addb) objB, null, false, false, hmrVar.a.v()));
        }
        uug uugVarO = uuh.o();
        uugVarO.h(1.0f);
        uugVarO.g(1.0f);
        uugVarO.i(1.0f);
        uugVarO.d(this.c);
        uugVarO.c(this.d);
        azwVar.b(uuh.class, uugVarO.j());
    }

    @Override // defpackage.azx
    public final void i(azw azwVar, boolean z) {
        super.i(azwVar, z);
        if (z) {
            this.b.p().k();
        }
    }

    @Override // defpackage.azx
    protected final void k(azw azwVar) {
        if (azwVar instanceof hmr) {
            ((hmr) azwVar).b.removeAllViews();
        } else {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/results/renderedcardrow/RenderedCardRowPresenter", "onUnbindRowViewHolder", 86, "RenderedCardRowPresenter.kt")).u("#onUnbindRowViewHolder: Wrong use of the ViewHolder");
        }
    }

    @Override // defpackage.azx
    public final boolean o() {
        return false;
    }
}
