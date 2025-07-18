package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rct extends rbn {
    private final rcn a;
    private final rdb b;
    private final rbt c;
    private final rcr d;
    private final rde e;

    public rct(rcn rcnVar, rdb rdbVar, rbt rbtVar, rcr rcrVar, rde rdeVar) {
        this.a = rcnVar;
        this.b = rdbVar;
        this.c = rbtVar;
        this.d = rcrVar;
        this.e = rdeVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((rcw) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        rcu rcuVar = (rcu) obj;
        rcw rcwVar = (rcw) obj2;
        rcwVar.getClass();
        vrd vrdVar = rcwVar.a;
        vra vraVar = vrdVar.k;
        vpn vpnVar = null;
        if (!yks.e(vraVar, null)) {
            FrameLayout frameLayout = rcuVar.o;
            int childCount = frameLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                frameLayout.getChildAt(i2).setVisibility(8);
            }
            cb cbVar = (cb) rcuVar.c.get();
            rcn rcnVar = this.a;
            cbVar.getClass();
            rcnVar.c(cbVar, vraVar.a);
            ((ImageView) cbVar.a).setVisibility(0);
        }
        rdb rdbVar = this.b;
        rdbVar.c(rcuVar.p, vrdVar.a);
        ConstraintLayout constraintLayout = rcuVar.a;
        constraintLayout.setContentDescription(null);
        vql vqlVar = vrdVar.b;
        if (vqlVar != null) {
            cb cbVar2 = rcuVar.q;
            ((TextView) cbVar2.a).setVisibility(0);
            rdbVar.c(cbVar2, vqlVar);
        } else {
            ((TextView) rcuVar.q.a).setVisibility(8);
        }
        boolean z = true;
        if (vrdVar.j - 1 != 1) {
            rcuVar.b.d(R.id.og_bento_card_image_container, 4);
        } else {
            rcuVar.b.g(R.id.og_bento_card_image_container, 4, R.id.og_bento_card_top_content, 4);
        }
        rcuVar.b.c(constraintLayout);
        if (vrdVar.i - 1 != 1) {
            FrameLayout frameLayout2 = rcuVar.o;
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            frameLayout2.setLayoutParams(marginLayoutParams);
        } else {
            FrameLayout frameLayout3 = rcuVar.o;
            ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(constraintLayout.getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_account_management_card_icon_start_margin));
            marginLayoutParams2.setMarginEnd(constraintLayout.getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_account_management_card_icon_end_margin));
            frameLayout3.setLayoutParams(marginLayoutParams2);
        }
        vre vreVar = vrdVar.e;
        if (vreVar != null) {
            rcuVar.e.setVisibility(0);
            rde rdeVar = this.e;
            Object obj3 = rcuVar.f.get();
            obj3.getClass();
            rdeVar.c(obj3, vreVar);
        } else {
            rcuVar.e.setVisibility(8);
        }
        vqz vqzVar = vrdVar.c;
        if (vqzVar instanceof vrb) {
            rcuVar.g.setVisibility(0);
            cb cbVar3 = rcuVar.r;
            ((TextView) cbVar3.a).setVisibility(0);
            rcuVar.i.setVisibility(8);
            rdbVar.c(cbVar3, ((vrb) vqzVar).a);
        } else {
            if (vqzVar != null) {
                throw new yfu();
            }
            rcuVar.g.setVisibility(8);
        }
        View view = rcuVar.n;
        vpn vpnVar2 = vrdVar.f;
        vpn vpnVar3 = vrdVar.g;
        if (vpnVar2 == null) {
            i = vpnVar3 != null ? 0 : 8;
        } else {
            i = 0;
            vpnVar = vpnVar2;
        }
        view.setVisibility(i);
        if (vpnVar != null) {
            rcuVar.k.setVisibility(0);
            rbt rbtVar = this.c;
            ttm ttmVar = rcuVar.j;
            Object obj4 = ttmVar.get();
            obj4.getClass();
            rbtVar.c(obj4, vpnVar);
            Object obj5 = ttmVar.get();
            obj5.getClass();
            vrp vrpVar = rcwVar.b;
            Object obj6 = ((rbu) obj5).c;
            boolean zE = yks.e(vrpVar, vpnVar.b);
            raz razVar = (raz) obj6;
            if (rrx.ad(razVar.getContext()) && zE) {
                z = false;
            }
            MaterialButton materialButton = razVar.a;
            if (materialButton != null) {
                materialButton.setFocusable(z);
                materialButton.setClickable(z);
            }
        } else {
            rcuVar.k.setVisibility(8);
        }
        if (vpnVar3 != null) {
            rcuVar.m.setVisibility(0);
            rbt rbtVar2 = this.c;
            Object obj7 = rcuVar.l.get();
            obj7.getClass();
            rbtVar2.c(obj7, vpnVar3);
        } else {
            rcuVar.m.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = rcuVar.d;
        ViewGroup.LayoutParams layoutParams3 = constraintLayout2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        cqe cqeVar = (cqe) layoutParams3;
        if (vqzVar == null && vpnVar2 == null && vpnVar3 == null) {
            cqeVar.S = rrx.ah(constraintLayout2.getResources().getDisplayMetrics(), 40);
            cqeVar.topMargin = rrx.ah(constraintLayout2.getResources().getDisplayMetrics(), 0);
        } else {
            cqeVar.S = rrx.ah(constraintLayout2.getResources().getDisplayMetrics(), 20);
            cqeVar.topMargin = rrx.ah(constraintLayout2.getResources().getDisplayMetrics(), 8);
        }
        constraintLayout2.setLayoutParams(cqeVar);
    }
}
