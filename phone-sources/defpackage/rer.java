package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.content.res.AppCompatResources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmenu.cards.TextualCardRootView;
import com.google.android.material.chip.Chip;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rer extends rdv {
    public boolean A;
    public boolean B;
    private ViewGroup C;
    private ViewGroup D;
    private View E;
    private View F;
    private ViewGroup G;
    private boolean H;
    private final int g;
    private final int h;
    public final int i;
    public TextualCardRootView j;
    public ImageView k;
    public ImageView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public Chip p;
    public Chip q;
    public ImageView r;
    public ImageView s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public ViewGroup w;
    public View.OnClickListener x;
    public View.OnClickListener y;
    public boolean z;

    public rer(ViewGroup viewGroup, Context context, rjg rjgVar) {
        super(viewGroup, context, rjgVar);
        this.i = rrx.at(context, R.attr.ogIconColor);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.account_menu_cards_vertical_spacing);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.text_card_vertical_spacing_with_actions);
    }

    private final void e() {
        this.p.setClickable(false);
        this.p.setFocusable(false);
    }

    public static void l(TextView textView, rei reiVar) {
        String str = (String) reiVar.b.f();
        textView.setText(reiVar.a);
        textView.setContentDescription(str);
    }

    private static final void m(TextualCardRootView textualCardRootView, rem remVar) {
        if (textualCardRootView != null) {
            textualCardRootView.a = remVar != null ? tst.i(remVar.w) : trk.a;
        }
    }

    private static final void n(ViewGroup viewGroup, rem remVar) {
        if (viewGroup != null) {
            viewGroup.setTag(R.id.og_card_highlight_id_tag, remVar != null ? (Integer) remVar.v.f() : null);
        }
    }

    protected View b(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rdv
    protected void c(dvk dvkVar) {
        this.j.e(this.b);
        super.c(dvkVar);
        rem remVar = (rem) this.f;
        remVar.getClass();
        remVar.j.j(dvkVar);
        remVar.k.j(dvkVar);
        remVar.l.j(dvkVar);
        remVar.m.j(dvkVar);
        remVar.n.j(dvkVar);
        remVar.o.j(dvkVar);
        remVar.q.j(dvkVar);
        remVar.s.j(dvkVar);
        remVar.r.j(dvkVar);
        remVar.p.j(dvkVar);
        remVar.t.j(dvkVar);
        remVar.b.j(dvkVar);
        if (this.H) {
            remVar.u.j(dvkVar);
        }
        if (remVar instanceof rec) {
            ((rec) remVar).c();
        }
        remVar.l();
    }

    @Override // defpackage.rdv
    protected final void d(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.G = viewGroup2;
        Context context = this.a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.og_textual_card, viewGroup);
        this.j = (TextualCardRootView) viewInflate.findViewById(R.id.og_text_card_root);
        this.C = (ViewGroup) viewInflate.findViewById(R.id.og_full_text_card_root);
        this.D = (ViewGroup) viewInflate.findViewById(R.id.og_minimized_text_card_root);
        this.k = (ImageView) viewInflate.findViewById(R.id.og_text_card_icon);
        this.l = (ImageView) viewInflate.findViewById(R.id.og_minimized_text_card_icon);
        this.m = (TextView) viewInflate.findViewById(R.id.og_text_card_title);
        this.n = (TextView) viewInflate.findViewById(R.id.og_minimized_text_card_title);
        this.o = (TextView) viewInflate.findViewById(R.id.og_text_card_subtitle);
        this.p = (Chip) viewInflate.findViewById(R.id.og_text_card_action);
        this.E = viewInflate.findViewById(R.id.og_text_actions_top_margin);
        this.F = viewInflate.findViewById(R.id.og_text_cards_flow);
        this.q = (Chip) viewInflate.findViewById(R.id.og_text_card_secondary_action);
        this.r = (ImageView) viewInflate.findViewById(R.id.og_text_card_trail_image);
        this.s = (ImageView) viewInflate.findViewById(R.id.og_text_card_trail_title_image);
        this.t = (ImageView) viewInflate.findViewById(R.id.og_minimized_text_card_trail_title_image);
        this.u = (TextView) viewInflate.findViewById(R.id.og_text_card_trail_title_text);
        this.v = (TextView) viewInflate.findViewById(R.id.og_text_card_trail_caption_text);
        this.w = (ViewGroup) viewInflate.findViewById(R.id.og_text_card_custom_content);
        if (rrx.ad(context)) {
            e();
        }
        m(this.j, (rem) this.f);
        n(viewGroup2, (rem) this.f);
        this.H = b(this.w) != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rdv
    public void f(dvk dvkVar, rem remVar) {
        super.f(dvkVar, remVar);
        boolean z = remVar instanceof rec;
        this.z = z;
        n(this.G, remVar);
        m(this.j, remVar);
        this.j.b(this.b);
        remVar.j.d(dvkVar, new hs(this, 19));
        remVar.k.d(dvkVar, new req(this, 2));
        remVar.l.d(dvkVar, new req(this, 3));
        remVar.m.d(dvkVar, new req(this, 4));
        remVar.n.d(dvkVar, new hs(this, 13));
        remVar.o.d(dvkVar, new hs(this, 14));
        remVar.q.d(dvkVar, new hs(this, 15));
        remVar.s.d(dvkVar, new hs(this, 16));
        remVar.r.d(dvkVar, new hs(this, 17));
        remVar.p.d(dvkVar, new hs(this, 18));
        remVar.t.d(dvkVar, new hs(this, 20));
        if (this.H) {
            remVar.u.d(dvkVar, new req(this, 1));
        }
        remVar.b.d(dvkVar, new req(this, 0));
        if (z) {
            ((rec) remVar).a();
        } else {
            this.C.setVisibility(0);
            this.D.setVisibility(8);
            this.n.setVisibility(8);
        }
        remVar.k();
    }

    public final ColorStateList g(tst tstVar) {
        return tstVar.g() ? (ColorStateList) tstVar.c() : AppCompatResources.getColorStateList(this.a, R.color.og_chip_assistive_text_color);
    }

    public final void h(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        byte[] bArr = null;
        if (onClickListener == null) {
            onClickListener = (onClickListener2 == null || rrx.ad(this.a)) ? null : onClickListener2;
        }
        if (onClickListener != null) {
            this.p.setOnClickListener(new nay(this, onClickListener, 9, bArr));
        } else {
            e();
        }
    }

    public final void i() {
        int i = 0;
        if (this.p.getVisibility() == 8 && this.q.getVisibility() == 8) {
            i = 8;
        }
        this.F.setVisibility(i);
        this.E.setVisibility(i);
        ViewGroup viewGroup = this.C;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), this.C.getPaddingTop(), this.C.getPaddingRight(), i == 0 ? this.h : this.g);
    }

    public final void j(ImageView imageView, tst tstVar, int i) {
        imageView.setVisibility(true != tstVar.g() ? 8 : 0);
        if (tstVar.g()) {
            imageView.setImageDrawable(((ret) tstVar.c()).a(this.a, i));
            imageView.setContentDescription((CharSequence) ((ret) tstVar.c()).d.f());
        }
    }

    public final void k(boolean z) {
        if (this.B && z) {
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
        i();
    }
}
