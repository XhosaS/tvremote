package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import com.google.android.katniss.R;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikl extends ikm implements hmv {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment");
    public idu ah;
    public ghr ai;
    public irl aj;
    private final uq ak = new uq() { // from class: iki
        @Override // defpackage.uq
        public final void a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            zdy zdyVar = ikl.a;
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "<init>", 79, "ActionablePuntAmatiFragment.java")).x("Received activityResult %s from Parental Authorization.", activityResult);
            int i = activityResult.a;
            ikl iklVar = this.a;
            if (i != -1) {
                iklVar.ai.Q(iklVar.b == 1 ? 3 : 4, 3);
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "<init>", 103, "ActionablePuntAmatiFragment.java")).v("Parental Authorization failed with status %s.", i);
            } else {
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "<init>", 82, "ActionablePuntAmatiFragment.java")).u("Parental Authorization succeeded, continue to launch setup or enable assistant.");
                int i2 = iklVar.b;
                if (i2 == 1) {
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "<init>", 86, "ActionablePuntAmatiFragment.java")).u("Launching OOBE for kids mode.");
                    iklVar.ai.Q(3, 4);
                    wyo.l(iklVar.s(), new Intent("com.google.assistant.GOOGLE_SETUP"));
                } else if (i2 == 2) {
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "<init>", 92, "ActionablePuntAmatiFragment.java")).u("Enable voice search for kids mode.");
                    iklVar.ai.Q(4, 4);
                    iklVar.e.j(true, iklVar.f.c());
                }
            }
            iklVar.c.finish();
        }
    };
    public int b;
    public Activity c;
    public Supplier d;
    public hdr e;
    public gtu f;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        int i2;
        int i3;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.preview_card_container, viewGroup, false).findViewById(R.id.preview_card_container);
        this.b = this.n.getInt("punt_type_argument", 0);
        LogoView logoView = (LogoView) viewGroup2.findViewById(R.id.preview_logo_view);
        hvh.a(logoView);
        logoView.d(10, true);
        View viewInflate = layoutInflater.inflate(R.layout.setup_actionable_punt, viewGroup2, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.actionable_punt_title);
        int i4 = this.b;
        if (i4 == 1) {
            i = R.string.assistant_amati_kids_mode_no_oobe_title;
        } else if (i4 != 2) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "getPuntTitle", 168, "ActionablePuntAmatiFragment.java")).v("invalid puntIdentifier %d", this.b);
            i = 0;
        } else {
            i = R.string.assistant_amati_kids_mode_assistant_disabled_title;
        }
        textView.setText(i);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.assistant_actionable_punt_accept_text);
        int i5 = this.b;
        if (i5 == 1) {
            i2 = R.string.assistant_amati_kids_mode_no_oobe_accept;
        } else if (i5 != 2) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "getPuntYesButtonText", 184, "ActionablePuntAmatiFragment.java")).v("invalid puntIdentifier %d", this.b);
            i2 = 0;
        } else {
            i2 = R.string.assistant_amati_kids_mode_assistant_disabled_accept;
        }
        textView2.setText(i2);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.assistant_actionable_punt_decline_text);
        int i6 = this.b;
        if (i6 == 1) {
            i3 = R.string.assistant_amati_kids_mode_no_oobe_decline;
        } else if (i6 != 2) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "getPuntNoButtonText", 200, "ActionablePuntAmatiFragment.java")).v("invalid puntIdentifier %d", this.b);
            i3 = 0;
        } else {
            i3 = R.string.assistant_amati_kids_mode_assistant_disabled_decline;
        }
        textView3.setText(i3);
        viewGroup2.addView(viewInflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
        aac aacVar = new aac();
        aacVar.c(constraintLayout);
        aacVar.j(viewInflate.getId(), 3, 3, 0);
        aacVar.j(viewInflate.getId(), 6, 6, (int) dZ().getResources().getDimension(R.dimen.amati_search_bar_text_margin_from_parent_start));
        aacVar.j(viewInflate.getId(), 7, 7, 0);
        aacVar.b(constraintLayout);
        return viewGroup2;
    }

    @Override // defpackage.hmv
    public final boolean aI() {
        return false;
    }

    @Override // defpackage.hmv
    public final boolean aJ() {
        return true;
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        View viewFindViewById = view.findViewById(R.id.actionable_punt_yes_button);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ikj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                this.a.l(true);
            }
        });
        view.findViewById(R.id.actionable_punt_no_button).setOnClickListener(new View.OnClickListener() { // from class: ikk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                this.a.l(false);
            }
        });
        if (!this.ah.E() && (this.f.c() != null || !((Boolean) this.d.get()).booleanValue())) {
            viewFindViewById.requestFocus();
            return;
        }
        View viewFindViewById2 = view.findViewById(R.id.actionable_punt_neutral_button);
        viewFindViewById2.setVisibility(0);
        viewFindViewById2.requestFocus();
        if (viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).leftMargin = (int) dZ().getResources().getDimension(R.dimen.space_salmon);
        }
    }

    @Override // defpackage.ikm, defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        this.c = ee();
        this.aj.b(this.ak);
    }

    public final void l(boolean z) throws Resources.NotFoundException {
        if (!z) {
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "onButtonClicked", 231, "ActionablePuntAmatiFragment.java")).v("Launching punt with id %d, user declined.", this.b);
            int i = this.b;
            if (i == 1) {
                this.ai.Q(3, 2);
            } else if (i == 2) {
                this.ai.Q(4, 2);
            }
            this.c.finish();
            return;
        }
        int i2 = this.b;
        if (i2 != 1 && i2 != 2) {
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/setup/fragment/actionablepunt/ActionablePuntAmatiFragment", "onButtonClicked", 264, "ActionablePuntAmatiFragment.java")).v("invalid puntIdentifier %d", this.b);
            return;
        }
        Account accountA = this.f.a();
        String str = accountA == null ? "" : accountA.name;
        String string = dZ().getResources().getString(R.string.kids_mode_parental_authorization_title);
        String string2 = this.b == 1 ? dZ().getResources().getString(R.string.kids_mode_parental_authorization_no_oobe) : dZ().getResources().getString(R.string.kids_mode_parental_authorization_as_disabled);
        Intent intent = new Intent("com.google.android.katniss.action.PARENTAL_AUTHORIZATION");
        ComponentName componentName = irm.a;
        this.aj.a(intent.putExtra("com.google.android.katniss", irm.t.getClassName()).putExtra("parental_authorization_description_text", string2).putExtra("reauth_account_name", str).putExtra("parental_authorization_title_text", string));
    }
}
