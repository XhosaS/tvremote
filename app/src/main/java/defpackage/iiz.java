package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiz extends ijg {
    private static final zdy ao = zdy.h("com/google/android/apps/tvsearch/setup/fragment/DataSharingConsentFragment");
    AlertDialog ai;
    private boolean ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private boolean az;
    public ggk d;
    public PackageManager e;
    public agow f;
    public boolean ah = true;
    private ArrayList ay = new ArrayList();

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return (this.al == gph.b || this.al == gph.c) ? new iiu() : this.an.g() ? new iiv() : new ikq(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new iiy(this);
    }

    @Override // defpackage.ats
    public final axd aP() {
        Resources resourcesAY = aY();
        Bundle bundle = this.n;
        if (bundle == null) {
            return new axd("", "", "", null);
        }
        this.aq = bundle.getString("setup:key_account_name");
        this.ar = bundle.getString("setup:key_account_gaia_id");
        String string = bundle.getString("title", "");
        this.as = bundle.getString("description_1", "");
        this.at = bundle.getString("description_2", "");
        if (this.al == gph.a) {
            return new axd(string, this.as, null, null);
        }
        this.ap = bundle.getBoolean("cloud_tv_operator", false);
        this.av = bundle.getString("rejection_description", "");
        this.aw = bundle.getString("rejection_accept_button", "");
        this.ax = bundle.getString("rejection_deny_button", "");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("app_packages");
        if (stringArrayList != null) {
            this.ay = stringArrayList;
        }
        return new axd(string, null, null, resourcesAY == null ? null : resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_144));
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        Bundle bundle = this.n;
        if (bundle == null) {
            return;
        }
        boolean z = bundle.getBoolean("setup:neutral_consent_button", false);
        this.az = z;
        if (z) {
            dZ();
            axf axfVar = new axf(null);
            axfVar.a = 3L;
            axfVar.b = dZ().getResources().getString(R.string.assistant_setup_neutral_full_screen);
            axfVar.b(8, 8);
            list.add(axfVar.a());
        }
        this.au = bundle.getString("accept_button", "");
        String string = bundle.getString("deny_button", "");
        dZ();
        axf axfVar2 = new axf(null);
        axfVar2.a = 1L;
        axfVar2.b = dZ().getResources().getString(R.string.assistant_setup_data_sharing_consent_view_more);
        list.add(axfVar2.a());
        dZ();
        axf axfVar3 = new axf(null);
        axfVar3.a = 2L;
        axfVar3.b = string;
        list.add(axfVar3.a());
    }

    public final void aS() {
        this.ah = false;
        aE(1L).b = this.au;
        aJ(l(1L));
    }

    @Override // defpackage.ikr
    protected final void aT() {
        super.aT();
        if (this.R != null) {
            if (this.al == gph.a) {
                ((TextView) this.R.requireViewById(R.id.guidance_description_2)).setFocusable(true);
            } else {
                ((TextView) this.R.requireViewById(R.id.guidance_description_p1)).setFocusable(true);
                ((TextView) this.R.requireViewById(R.id.guidance_description_p2)).setFocusable(true);
            }
        }
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        Resources resourcesForApplication;
        super.aa(view, bundle);
        if (this.an.g()) {
            view.setBackground(this.an.b(dZ()));
        }
        ScrollView scrollView = (ScrollView) view.requireViewById(R.id.main_container_scroll);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new iiw(this, scrollView));
        if (this.al == gph.a) {
            TextView textView = (TextView) view.requireViewById(R.id.guidance_description_2);
            textView.setVisibility(0);
            textView.setText(this.at);
            view.requireViewById(R.id.app_icons).setVisibility(0);
            if (this.an.g()) {
                view.requireViewById(R.id.guidance_subtitle).setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.main_container);
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        ((TextView) view.requireViewById(R.id.guidance_description_p1)).setText(this.as);
        TextView textView2 = (TextView) view.requireViewById(R.id.guidance_description_p2);
        textView2.setText(this.at);
        textView2.setTransformationMethod(new iix());
        List listAsList = Arrays.asList((ImageDownloadView) view.requireViewById(R.id.apps_icon_1), (ImageDownloadView) view.requireViewById(R.id.apps_icon_2), (ImageDownloadView) view.requireViewById(R.id.apps_icon_3));
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < listAsList.size() && i < this.ay.size(); i2++) {
            while (true) {
                if (i < this.ay.size()) {
                    int i3 = i + 1;
                    String str = (String) this.ay.get(i);
                    try {
                        applicationInfo = this.e.getApplicationInfo(str, 0);
                        resourcesForApplication = this.e.getResourcesForApplication(str);
                    } catch (PackageManager.NameNotFoundException unused) {
                        ((zdv) ((zdv) ao.b()).q("com/google/android/apps/tvsearch/setup/fragment/DataSharingConsentFragment", "maybeAddLogosFromInstalledApps", 291, "DataSharingConsentFragment.java")).D("Failed to add icon of %s at index %d", str, i2);
                        applicationInfo = null;
                        resourcesForApplication = null;
                    }
                    if (applicationInfo != null && resourcesForApplication != null) {
                        Drawable drawable = resourcesForApplication.getDrawable(applicationInfo.icon);
                        ImageDownloadView imageDownloadView = (ImageDownloadView) listAsList.get(i2);
                        imageDownloadView.setImageDrawable(drawable);
                        imageDownloadView.setVisibility(0);
                        z = true;
                        i = i3;
                        break;
                    }
                    i = i3;
                }
            }
        }
        if (z) {
            view.requireViewById(R.id.apps_icon_more).setVisibility(0);
            return;
        }
        ((zdv) ((zdv) ao.b()).q("com/google/android/apps/tvsearch/setup/fragment/DataSharingConsentFragment", "onViewCreated", 241, "DataSharingConsentFragment.java")).u("No logo from installed apps added, show the default ones on the screen instead");
        for (int i4 = 0; i4 < listAsList.size(); i4++) {
            ((ImageDownloadView) listAsList.get(i4)).setVisibility(0);
        }
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        final ioy ioyVar;
        Object objEp = ep();
        if (objEp instanceof ioy) {
            ioyVar = (ioy) objEp;
        } else if (!feo.b(objEp, ioy.class)) {
            return;
        } else {
            ioyVar = (ioy) feo.a(objEp);
        }
        yyk yykVarQ = yyk.q(Integer.valueOf(R.string.assistant_data_sharing_consent_title_amati), Integer.valueOf(R.string.assistant_data_sharing_consent_description_1_amati), Integer.valueOf(R.string.assistant_data_sharing_consent_description_2_amati));
        ycm ycmVar = ycm.a;
        ycl yclVar = new ycl();
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar2 = (ycm) yclVar.b;
        ycmVar2.c = 11;
        ycmVar2.b |= 1;
        boolean z = this.az;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 8;
        ycmVar3.e = z;
        int i = (int) axhVar.a;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (this.al == gph.a) {
                if (TextUtils.isEmpty(this.aq)) {
                    ((zdv) ((zdv) ao.c()).q("com/google/android/apps/tvsearch/setup/fragment/DataSharingConsentFragment", "onGuidedActionClicked", 465, "DataSharingConsentFragment.java")).u("Setting up DSC in logout mode on Amati.");
                } else {
                    this.d.a(this.aq, this.ar, yykVarQ, false);
                }
            }
            adzd adzdVar = adzd.DATA_SHARING_CONSENT_DENIED;
            aZ(objEp, adzdVar);
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yclVar.y();
            }
            ycm ycmVar4 = (ycm) yclVar.b;
            ycmVar4.d = adzdVar.z;
            ycmVar4.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            if (!this.ap) {
                ioyVar.h(ire.c);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(ee(), android.R.style.Theme.Material.Dialog.Alert);
            builder.setMessage(this.av).setPositiveButton(this.aw, new DialogInterface.OnClickListener() { // from class: iir
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                    ioyVar.h(ire.b);
                }
            }).setNegativeButton(this.ax, new DialogInterface.OnClickListener() { // from class: iis
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                    ioyVar.h(ire.c);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            this.ai = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: iit
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    iiz iizVar = this.a;
                    Button button = iizVar.ai.getButton(-1);
                    button.setFocusable(true);
                    button.setFocusableInTouchMode(true);
                    button.requestFocus();
                    button.setGravity(3);
                    button.setAllCaps(false);
                    button.setTypeface(button.getTypeface(), 0);
                    button.getLayoutParams().width = -1;
                    button.getParent().requestLayout();
                    Button button2 = iizVar.ai.getButton(-2);
                    button2.setGravity(3);
                    button2.setAllCaps(false);
                    button2.getLayoutParams().width = -1;
                    button2.getParent().requestLayout();
                }
            });
            this.ai.show();
            return;
        }
        if (((Boolean) this.f.a()).booleanValue()) {
            if (this.ah) {
                ((ScrollView) cP().requireViewById(R.id.main_container_scroll)).fullScroll(130);
                aS();
                return;
            }
            if (this.al == gph.a) {
                if (TextUtils.isEmpty(this.aq)) {
                    ((zdv) ((zdv) ao.c()).q("com/google/android/apps/tvsearch/setup/fragment/DataSharingConsentFragment", "onGuidedActionClicked", 430, "DataSharingConsentFragment.java")).u("Setting up DSC in logout mode on Amati.");
                } else {
                    this.d.a(this.aq, this.ar, yykVarQ, true);
                }
            }
            adzd adzdVar2 = adzd.DATA_SHARING_CONSENT_GRANTED;
            aZ(objEp, adzdVar2);
            if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yclVar.y();
            }
            ycm ycmVar5 = (ycm) yclVar.b;
            ycmVar5.d = adzdVar2.z;
            ycmVar5.b |= 2;
            ba(objEp, (ycm) yclVar.v());
            ioyVar.h(ire.b);
            return;
        }
        if (bb()) {
            ((ScrollView) cP().requireViewById(R.id.main_container_scroll)).fullScroll(130);
            aS();
            return;
        }
        if (this.al == gph.a) {
            if (TextUtils.isEmpty(this.aq)) {
                ((zdv) ((zdv) ao.c()).q("com/google/android/apps/tvsearch/setup/fragment/DataSharingConsentFragment", "onGuidedActionClicked", 450, "DataSharingConsentFragment.java")).u("Setting up DSC in logout mode on Amati.");
            } else {
                this.d.a(this.aq, this.ar, yykVarQ, true);
            }
        }
        adzd adzdVar3 = adzd.DATA_SHARING_CONSENT_GRANTED;
        aZ(objEp, adzdVar3);
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar6 = (ycm) yclVar.b;
        ycmVar6.d = adzdVar3.z;
        ycmVar6.b |= 2;
        ba(objEp, (ycm) yclVar.v());
        ioyVar.h(ire.b);
    }
}
