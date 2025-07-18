package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.card.textarea.ImageWithTextCardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoy extends hhk implements huy {
    private final hor b;
    private final azn c;
    private ayj h;
    private final hmb i;
    private final hmc j;
    private uuh k;
    private uuh l;
    private ayj m;
    private ayj n;
    private qk o;
    private int d = 0;
    public int a = 0;
    private int g = 0;

    public hoy(hmc hmcVar, hmb hmbVar) {
        this.f = false;
        this.e = null;
        this.b = new hor(hmcVar, hmbVar);
        this.c = hmbVar.n();
        this.i = hmbVar;
        this.j = hmcVar;
    }

    private static ayi E() {
        ayi ayiVar = new ayi();
        ayiVar.a(0.0f);
        ayiVar.d = 0;
        ayiVar.f = true;
        ayiVar.b = R.id.row_content;
        return ayiVar;
    }

    private static ayj F(Resources resources, int i) {
        ayi ayiVarE = E();
        ayiVarE.d = resources.getDimensionPixelSize(i);
        ayj ayjVar = new ayj();
        ayjVar.a(new ayi[]{ayiVarE});
        return ayjVar;
    }

    private final void G(Context context) {
        if (this.k != null) {
            return;
        }
        uuh uuhVarJ = l(context.getResources()).j();
        this.k = uuhVarJ;
        x(uuh.class, uuhVarJ);
    }

    private final void H(Context context) throws Resources.NotFoundException {
        if (this.a != 0) {
            return;
        }
        Resources resources = context.getResources();
        this.a = c(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.amati_carousel_item_image_constant_margin_bottom);
        int i = ImageWithTextCardView.i(context);
        this.g = dimensionPixelSize + i;
        this.d = this.a + dimensionPixelSize + i;
    }

    private final void I(azw azwVar, Object obj) {
        if (!(obj instanceof uua)) {
            azwVar.b(ayj.class, null);
            azwVar.b(uuh.class, null);
            return;
        }
        uua uuaVar = (uua) obj;
        ayj ayjVar = (ayj) uuaVar.dy(ayj.class);
        if (ayjVar == null) {
            ayjVar = this.h;
        }
        azwVar.b(ayj.class, ayjVar);
        azwVar.b(uuh.class, (uuh) uuaVar.dy(uuh.class));
    }

    @Override // defpackage.azx
    protected final void A(azw azwVar) {
        azm.r(((hox) y(azwVar)).a.g);
        super.A(azwVar);
    }

    @Override // defpackage.huy
    public final uuh D(Context context) throws Resources.NotFoundException {
        if (this.l == null) {
            if (this.k == null) {
                H(context);
                G(context);
            }
            uty utyVar = new uty(this.k);
            utyVar.d(0);
            this.l = utyVar.j();
        }
        return this.l;
    }

    @Override // defpackage.azx
    protected azw b(ViewGroup viewGroup) throws Resources.NotFoundException {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amati_search_row, viewGroup, false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.row_header_container);
        HorizontalGridView horizontalGridView = (HorizontalGridView) viewGroup2.findViewById(R.id.row_content);
        if (this.o == null) {
            this.o = new qk();
        }
        horizontalGridView.e.m(this.o);
        hpy hpyVar = new hpy(viewGroup3);
        horizontalGridView.setWindowAlignment(3);
        int paddingStart = horizontalGridView.getPaddingStart();
        horizontalGridView.setItemAlignmentOffsetPercent(0.0f);
        horizontalGridView.setItemAlignmentOffset(0);
        horizontalGridView.setWindowAlignmentOffsetPercent(0.0f);
        horizontalGridView.setWindowAlignmentOffset(paddingStart);
        if (this.d == 0) {
            H(viewGroup.getContext());
        }
        if (this.k == null) {
            G(viewGroup.getContext());
        }
        if (this.h == null) {
            ayj ayjVar = new ayj();
            this.h = ayjVar;
            ayjVar.a(new ayi[]{E()});
            x(ayj.class, this.h);
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams();
        horizontalGridView.getLayoutParams().height = horizontalGridView.getPaddingTop() + horizontalGridView.getPaddingBottom() + this.d;
        layoutParams.height = this.a + horizontalGridView.getPaddingTop() + horizontalGridView.getPaddingBottom() + marginLayoutParams.height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        return new hox(viewGroup2, hpyVar, horizontalGridView);
    }

    protected int c(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.amati_carousel_item_image_constant_height);
    }

    @Override // defpackage.azx
    protected final void d(azw azwVar, boolean z) {
        awl awlVar;
        hox hoxVar = (hox) y(azwVar);
        HorizontalGridView horizontalGridView = hoxVar.b;
        ayo ayoVar = (ayo) horizontalGridView.j(horizontalGridView.getSelectedPosition());
        if (!z || (awlVar = hoxVar.r) == null || ayoVar == null) {
            return;
        }
        awlVar.f(ayoVar.t, hoxVar, hoxVar.j);
    }

    @Override // defpackage.azx
    public final void e(azw azwVar, boolean z) {
        HorizontalGridView horizontalGridView = ((hox) y(azwVar)).b;
        boolean z2 = !z;
        horizontalGridView.ad.bz(z2);
        horizontalGridView.aB(z2);
        horizontalGridView.ad.an(z2);
    }

    @Override // defpackage.azx
    protected final void f(azw azwVar) {
        super.f(azwVar);
        hox hoxVar = (hox) y(azwVar);
        hoxVar.c = new how(hoxVar, this.i, this.j);
        ayq ayqVar = hoxVar.c;
        ayqVar.e = this.c;
        ayqVar.a.a();
        HorizontalGridView horizontalGridView = hoxVar.b;
        horizontalGridView.ad.ai(new hot(hoxVar));
        horizontalGridView.ae = new awh() { // from class: hos
        };
        View view = hoxVar.g;
        View view2 = (View) view.getParent();
        (view2 != null ? (ViewGroup.MarginLayoutParams) view2.getLayoutParams() : (ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 1;
    }

    @Override // defpackage.hhk, defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        super.g(azwVar, obj);
        I(azwVar, obj);
        ays aysVar = (ays) obj;
        azd azdVar = aysVar.a;
        if (azdVar.f == null) {
            azdVar.d(this.c);
        }
        hox hoxVar = (hox) y(azwVar);
        this.b.s(hoxVar.a, obj);
        hoxVar.c.s(azdVar);
        HorizontalGridView horizontalGridView = hoxVar.b;
        horizontalGridView.az(hoxVar.c);
        horizontalGridView.setContentDescription(aysVar.dx());
        if (obj instanceof gkj) {
            gkj gkjVar = (gkj) obj;
            if (gkjVar.b() != null) {
                paq.c(horizontalGridView, gkjVar.b());
            }
        }
    }

    @Override // defpackage.azx
    protected final void j(azw azwVar) {
        super.j(azwVar);
        ((hox) azwVar).a.a = azwVar.p;
    }

    @Override // defpackage.azx
    protected final void k(azw azwVar) {
        hox hoxVar = (hox) y(azwVar);
        this.b.u(hoxVar.a);
        hoxVar.b.az(null);
        hoxVar.c.s(null);
        super.k(azwVar);
    }

    protected uug l(Resources resources) {
        uug uugVarO = uuh.o();
        uugVarO.d(resources.getDimensionPixelSize(R.dimen.channel_header_extra_space_before));
        uugVarO.c(this.g);
        uugVarO.i(resources.getFraction(R.fraction.channel_header_unselect_scale, 1, 1));
        uugVarO.g(resources.getFraction(R.fraction.channel_header_select_scale, 1, 1));
        uugVarO.h(resources.getDimensionPixelOffset(R.dimen.channel_header_focused_translation_y));
        return uugVarO;
    }

    @Override // defpackage.huy
    public final ayj n(Context context) {
        if (this.m == null) {
            this.m = F(context.getResources(), R.dimen.first_row_additional_offset);
        }
        return this.m;
    }

    @Override // defpackage.azx
    public final boolean o() {
        return false;
    }

    @Override // defpackage.huy
    public final ayj p(Context context) {
        if (this.n == null) {
            this.n = F(context.getResources(), R.dimen.last_row_additional_offset);
        }
        return this.n;
    }

    @Override // defpackage.azm
    public final void t(azk azkVar, Object obj, List list) {
        if (list.isEmpty()) {
            s(azkVar, obj);
        }
        if (list.contains("PAYLOAD_UPDATE_ITEM_FACETS")) {
            I((azw) azkVar, obj);
        }
    }

    @Override // defpackage.azx
    protected final void z(azw azwVar) {
        super.z(azwVar);
        View view = ((hox) y(azwVar)).g;
        hmc hmcVar = this.j;
        pan panVarA = paq.a(view);
        if (hmcVar.E() && panVarA != null && (panVarA.a().b & 1) == 0) {
            this.i.q().u(hmcVar.y(), view, (View) view.getParent());
        }
    }
}
