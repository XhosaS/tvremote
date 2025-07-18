package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhp extends LinearLayout implements rji {
    public static final /* synthetic */ int t = 0;
    private static final String u = String.valueOf(rhp.class.getName()).concat(".superState");
    private static final String v = String.valueOf(rhp.class.getName()).concat(".collapsed");
    private static final Interpolator w = new dup();
    public final MyAccountChip a;
    public final SelectedAccountView b;
    public final RecyclerView c;
    public final RecyclerView d;
    public final ViewGroup e;
    public final dvv f;
    public final dvw g;
    public boolean h;
    public rjg i;
    public rfo j;
    public tst k;
    public rhu l;
    public rfp m;
    public qwn n;
    public wds o;
    public tst p;
    public qux q;
    public final rdd r;
    public aafi s;

    public rhp(Context context) {
        super(context);
        this.f = new dvv(ImmutableList.of());
        this.r = new rho(this);
        LayoutInflater.from(context).inflate(R.layout.has_selected_content, this);
        setOrientation(1);
        this.a = (MyAccountChip) findViewById(R.id.my_account_chip);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account_view);
        this.b = selectedAccountView;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accounts);
        this.c = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.account_management_actions);
        this.d = recyclerView2;
        recyclerView.setFocusable(false);
        recyclerView2.setFocusable(false);
        this.e = (ViewGroup) findViewById(R.id.og_critical_alert_container);
        selectedAccountView.n.setDuration(200L);
        selectedAccountView.n.setInterpolator(new dup());
        setLayoutTransition(h());
        if (!xnl.a.get().a(context)) {
            ((ViewGroup) recyclerView.getParent()).setLayoutTransition(h());
        }
        this.g = new req(this, 9);
    }

    public static void c(RecyclerView.Adapter adapter, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration) {
        if (adapter.getItemCount() > 0) {
            recyclerView.removeItemDecoration(itemDecoration);
            return;
        }
        for (int i = 0; i < recyclerView.getItemDecorationCount(); i++) {
            if (recyclerView.getItemDecorationAt(i).equals(itemDecoration)) {
                return;
            }
        }
        recyclerView.addItemDecoration(itemDecoration);
    }

    public static qvy f(View view) {
        return new qvy(view, rrx.Y(view.getContext()));
    }

    private static LayoutTransition h() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        Interpolator interpolator = w;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }

    public final void a(boolean z) {
        sjl.c();
        this.h = z;
        int i = true != z ? 0 : 8;
        this.c.setVisibility(i);
        this.d.setVisibility(i);
        boolean z2 = !z;
        SelectedAccountView selectedAccountView = this.b;
        if (z2 == selectedAccountView.o) {
            return;
        }
        selectedAccountView.o = z2;
        selectedAccountView.j(z2);
        if (z) {
            selectedAccountView.n.reverse();
        } else {
            selectedAccountView.n.start();
        }
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        SelectedAccountView selectedAccountView = this.b;
        rjgVar.b(selectedAccountView, 90784);
        rjgVar.b(selectedAccountView.j, 111271);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.qwn r6, defpackage.qvx r7, defpackage.rdz r8) {
        /*
            r5 = this;
            defpackage.sjl.c()
            rfg r6 = r6.e
            tst r0 = r6.l
            rfp r6 = r6.f
            boolean r6 = r6.e()
            r0 = 3
            r1 = 1
            if (r6 == 0) goto L1f
            int r6 = r7.getItemCount()
            if (r6 > 0) goto L1d
            int r6 = r8.getItemCount()
            if (r6 <= 0) goto L1f
        L1d:
            r6 = r1
            goto L20
        L1f:
            r6 = r0
        L20:
            com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView r7 = r5.b
            android.widget.ImageView r8 = r7.l
            r2 = 8
            r8.setVisibility(r2)
            r8 = 0
            if (r6 != r1) goto L2e
            r3 = r8
            goto L2f
        L2e:
            r3 = r2
        L2f:
            android.widget.ImageView r4 = r7.k
            r4.setVisibility(r3)
            if (r6 != r0) goto L38
            r3 = r2
            goto L39
        L38:
            r3 = r8
        L39:
            android.widget.FrameLayout r4 = r7.m
            r4.setVisibility(r3)
            r7.e()
            int r3 = r6 + (-1)
            if (r3 == 0) goto L75
            if (r3 == r1) goto L49
            r2 = 0
            goto L7b
        L49:
            defpackage.a.ab(r8)
            rhz r2 = new rhz
            phn r3 = new phn
            r4 = 9
            r3.<init>(r5, r4)
            r2.<init>(r3)
            rhu r3 = r5.l
            java.lang.Runnable r3 = r3.b()
            r2.d = r3
            rhu r3 = r5.l
            java.lang.Runnable r3 = r3.a()
            r2.e = r3
            aafi r3 = r5.s
            r4 = 56
            r2.s(r3, r4)
            rhy r3 = new rhy
            r3.<init>(r2)
            goto L7a
        L75:
            phn r3 = new phn
            r3.<init>(r5, r2)
        L7a:
            r2 = r3
        L7b:
            r7.setOnClickListener(r2)
            if (r6 == r0) goto L81
            goto L82
        L81:
            r1 = r8
        L82:
            r7.setClickable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhp.d(qwn, qvx, rdz):void");
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        SelectedAccountView selectedAccountView = this.b;
        rjgVar.e(selectedAccountView.j);
        rjgVar.e(selectedAccountView);
    }

    public final rdz g(dvs dvsVar, int i) {
        Context context = getContext();
        qwo qwoVar = this.n.b;
        if (dvsVar == null) {
            dvsVar = new dvv(ImmutableList.of());
        }
        return new rdz(context, qwoVar, dvsVar, this.l, this.i, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MyAccountChip myAccountChip = this.a;
        CharSequence text = myAccountChip.getText();
        myAccountChip.b.k(((View) myAccountChip.getParent()).getMeasuredWidth());
        if (TextUtils.equals(text, myAccountChip.getText())) {
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(u);
            a(bundle.getBoolean(v));
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(u, super.onSaveInstanceState());
        bundle.putBoolean(v, this.h);
        return bundle;
    }
}
