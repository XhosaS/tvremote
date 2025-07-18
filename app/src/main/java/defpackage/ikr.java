package defpackage;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ikr extends ats {
    public static final zdy aj = zdy.h("com/google/android/apps/tvsearch/setup/fragment/base/BaseGuidedStepFragment");
    public AccessibilityManager ak;
    public gph al;
    public ipg am;
    public irh an;

    protected static void bc(String str, String str2, Activity activity, final AccessibilityManager accessibilityManager) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Theme.Material.Light.Dialog.Alert);
        builder.setTitle(Html.fromHtml(str, 0)).setMessage(Html.fromHtml(str2, 0)).setPositiveButton(com.google.android.katniss.R.string.assistant_close_dialog_btn, new DialogInterface.OnClickListener() { // from class: ikn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: iko
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = alertDialogCreate;
                Button button = alertDialog.getButton(-1);
                button.setFocusable(true);
                button.setFocusableInTouchMode(true);
                button.requestFocus();
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    View viewFindViewById = alertDialog.findViewById(R.id.message);
                    if (viewFindViewById != null) {
                        viewFindViewById.setFocusable(true);
                        viewFindViewById.setImportantForAccessibility(1);
                    }
                    ViewGroup viewGroup = (ViewGroup) alertDialog.findViewById(R.id.content);
                    if (viewGroup == null) {
                        ((zdv) ((zdv) ikr.aj.d()).q("com/google/android/apps/tvsearch/setup/fragment/base/BaseGuidedStepFragment", "showDialog", 234, "BaseGuidedStepFragment.java")).u("#showDialog AlertDialog missing android:id/content");
                        return;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
                    if (viewGroup2 == null) {
                        ((zdv) ((zdv) ikr.aj.d()).q("com/google/android/apps/tvsearch/setup/fragment/base/BaseGuidedStepFragment", "showDialog", 240, "BaseGuidedStepFragment.java")).u("#showDialog AlertDialog missing android:id/parentPanel");
                        return;
                    }
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getChildAt(0);
                    if (viewGroup3 == null) {
                        ((zdv) ((zdv) ikr.aj.d()).q("com/google/android/apps/tvsearch/setup/fragment/base/BaseGuidedStepFragment", "showDialog", 246, "BaseGuidedStepFragment.java")).u("#showDialog AlertDialog missing android:id/topPanel");
                        return;
                    }
                    ViewGroup viewGroup4 = (ViewGroup) viewGroup3.getChildAt(0);
                    if (viewGroup4 == null) {
                        ((zdv) ((zdv) ikr.aj.d()).q("com/google/android/apps/tvsearch/setup/fragment/base/BaseGuidedStepFragment", "showDialog", 252, "BaseGuidedStepFragment.java")).u("#showDialog AlertDialog missing android:id/title_template");
                        return;
                    }
                    View childAt = viewGroup4.getChildAt(1);
                    if (childAt == null) {
                        ((zdv) ((zdv) ikr.aj.d()).q("com/google/android/apps/tvsearch/setup/fragment/base/BaseGuidedStepFragment", "showDialog", 258, "BaseGuidedStepFragment.java")).u("#showDialog AlertDialog missing android:id/alertTitle");
                    } else {
                        childAt.setFocusable(true);
                        childAt.setImportantForAccessibility(1);
                    }
                }
            }
        });
        alertDialogCreate.show();
    }

    @Override // defpackage.ats
    public axe aD() {
        return new ikq(this);
    }

    @Override // defpackage.ats
    public final void aL() {
        af(null);
        ag(null);
    }

    protected void aT() {
        TextView textView;
        TextView textView2 = ((ats) this).a.a;
        if (textView2 != null) {
            textView2.setFocusable(true);
        }
        TextView textView3 = ((ats) this).a.b;
        if (textView3 != null) {
            textView3.setFocusable(true);
        }
        if (this.al != gph.a || this.R == null || (textView = (TextView) cP().findViewById(com.google.android.katniss.R.id.guidance_description_2)) == null) {
            return;
        }
        textView.setFocusable(true);
    }

    public final Resources aY() {
        bw bwVarEe = ee();
        if (bwVarEe == null || bwVarEe.isFinishing()) {
            return null;
        }
        return bwVarEe.getResources();
    }

    protected final void aZ(Object obj, adzd adzdVar) {
        if (obj instanceof ipa) {
            ((ipa) obj).f(adzdVar);
        } else if (feo.b(obj, ipa.class)) {
            ((ipa) feo.a(obj)).f(adzdVar);
        }
    }

    @Override // defpackage.bq
    public void aa(View view, Bundle bundle) {
        view.getViewTreeObserver().addOnPreDrawListener(new ikp(this, view));
        View viewFindViewById = view.findViewById(com.google.android.katniss.R.id.action_fragment_root);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
        Resources resourcesAY = aY();
        if (resourcesAY == null) {
            return;
        }
        VerticalGridView verticalGridView = this.b.c;
        if (verticalGridView != null) {
            verticalGridView.setItemSpacing(resourcesAY.getDimensionPixelSize(com.google.android.katniss.R.dimen.setup_list_item_margin));
            verticalGridView.setWindowAlignment(3);
            verticalGridView.setWindowAlignmentOffsetPercent(68.05556f);
        }
        ImageView imageView = (ImageView) view.findViewById(com.google.android.katniss.R.id.guidance_icon);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView = ((ats) this).a.a;
        if (textView != null) {
            textView.setFocusable(false);
            if (this.al == gph.a && !this.an.g()) {
                textView.setTextAppearance(com.google.android.katniss.R.style.GuidanceTitleStyleAmati);
            }
        }
        TextView textView2 = ((ats) this).a.b;
        if (textView2 != null) {
            textView2.setFocusable(false);
            if (this.al == gph.a && !this.an.g()) {
                textView2.setTextAppearance(com.google.android.katniss.R.style.GuidanceDescriptionStyleAmati);
            }
        }
        ScrollView scrollView = (ScrollView) view.findViewById(com.google.android.katniss.R.id.main_container_scroll);
        if (scrollView != null) {
            scrollView.setEnabled(false);
            scrollView.setVerticalScrollBarEnabled(false);
        }
        if (this.al == gph.a) {
            TextView textView3 = (TextView) view.findViewById(com.google.android.katniss.R.id.guidance_description_2);
            if (textView3 != null && !this.an.g()) {
                textView3.setFocusable(false);
                textView3.setTextAppearance(com.google.android.katniss.R.style.GuidanceDescription2StyleAmati);
            }
            Integer numValueOf = Integer.valueOf(com.google.android.katniss.R.id.guidedactions_content);
            Integer numValueOf2 = Integer.valueOf(com.google.android.katniss.R.id.guidedactions_root);
            Integer numValueOf3 = Integer.valueOf(com.google.android.katniss.R.id.guidedactions_list);
            Integer numValueOf4 = Integer.valueOf(com.google.android.katniss.R.id.action_fragment_root);
            Integer numValueOf5 = Integer.valueOf(com.google.android.katniss.R.id.actions);
            Integer numValueOf6 = Integer.valueOf(com.google.android.katniss.R.id.content_frame);
            Integer numValueOf7 = Integer.valueOf(com.google.android.katniss.R.id.content_fragment);
            Integer numValueOf8 = Integer.valueOf(com.google.android.katniss.R.id.main_container);
            Integer numValueOf9 = Integer.valueOf(com.google.android.katniss.R.id.action_fragment);
            int i = yyk.e;
            Object[] objArr = {numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9};
            zbw.b(objArr, 9);
            yyk yykVarH = yyk.h(objArr, 9);
            int i2 = ((zcg) yykVarH).d;
            for (int i3 = 0; i3 < i2; i3++) {
                ViewGroup viewGroup = (ViewGroup) view.findViewById(((Integer) yykVarH.get(i3)).intValue());
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
            }
        }
    }

    @Override // defpackage.bq
    public final Animator as(int i, int i2) {
        return null;
    }

    protected final void ba(Object obj, ycm ycmVar) {
        if (obj instanceof ipa) {
            ((ipa) obj).g(ycmVar);
        } else if (feo.b(obj, ipa.class)) {
            ((ipa) feo.a(obj)).g(ycmVar);
        }
    }

    public final boolean bb() {
        ScrollView scrollView = (ScrollView) cP().findViewById(com.google.android.katniss.R.id.main_container_scroll);
        if (scrollView != null) {
            return scrollView.canScrollVertically(1);
        }
        return false;
    }

    @Override // defpackage.bq
    public void dH(Bundle bundle) {
        this.P = true;
        if (this.ak.isTouchExplorationEnabled()) {
            aT();
        }
    }

    @Override // defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        this.am.b(getClass().getSimpleName());
        this.am.a();
    }

    @Override // defpackage.bq
    public void h() {
        TextView textView;
        this.P = true;
        if (this.al != gph.a || (textView = (TextView) cP().findViewById(com.google.android.katniss.R.id.guidance_title)) == null || this.an.g()) {
            return;
        }
        textView.setTextAppearance(com.google.android.katniss.R.style.AmatiSetupGuidanceTitleTextAppearance);
    }
}
