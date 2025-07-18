package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hij extends hix {
    public AccessibilityManager d;

    private final void aV() {
        bw bwVarEe = ee();
        if (bwVarEe != null) {
            bwVarEe.onBackPressed();
        }
    }

    @Override // defpackage.ats
    public final int aB() {
        return R.style.Theme_DisclaimerNotification_GuidedStep_Watson;
    }

    @Override // defpackage.ats
    public final axe aD() {
        return new hii();
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new hih();
    }

    @Override // defpackage.ats
    public final axd aP() {
        Bundle bundle = this.n;
        String string = bundle != null ? bundle.getString("disclaimer_title") : null;
        Bundle bundle2 = this.n;
        return new axd(string, bundle2 != null ? bundle2.getString("disclaimer_description") : null, null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        s();
        axf axfVar = new axf(null);
        axfVar.a = 1L;
        axfVar.b = dZ().getResources().getString(R.string.assistant_setup_got_it_button);
        list.add(axfVar.a());
    }

    public final AccessibilityManager aS() {
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        agvy.b("accessibilityManager");
        return null;
    }

    @Override // defpackage.bq
    public final void dH(Bundle bundle) {
        this.P = true;
        if (aS().isTouchExplorationEnabled()) {
            StringBuilder sb = new StringBuilder();
            TextView textView = ((ats) this).a.a;
            if (textView != null) {
                textView.setFocusable(true);
                sb.append(textView.getText());
                sb.append("\n");
            }
            TextView textView2 = ((ats) this).a.b;
            if (textView2 != null) {
                textView2.setFocusable(true);
                sb.append(textView2.getText());
            }
            String string = sb.toString();
            if (agyv.n(string)) {
                return;
            }
            AccessibilityManager accessibilityManagerAS = aS();
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
            accessibilityEventObtain.setEventType(32);
            Context contextS = s();
            accessibilityEventObtain.setPackageName(contextS != null ? contextS.getPackageName() : null);
            accessibilityEventObtain.getText().add(string);
            accessibilityManagerAS.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        axhVar.getClass();
        if (axhVar.a == 1) {
            aV();
        }
    }

    @Override // defpackage.ats, defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        Bundle bundle2 = this.n;
        if (bundle2 != null && bundle2.getString("disclaimer_title") != null) {
            Bundle bundle3 = this.n;
            if ((bundle3 != null ? bundle3.getString("disclaimer_description") : null) != null) {
                return;
            }
        }
        aV();
    }
}
