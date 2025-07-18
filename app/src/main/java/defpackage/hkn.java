package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkn extends hkl {
    public AccessibilityManager a;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        hld hldVar = new hld(layoutInflater);
        hldVar.b(R.layout.on_device_loading);
        hle hleVarA = hldVar.a();
        View fragmentView = hleVarA.getFragmentView();
        if (fragmentView != null && (bundle2 = this.n) != null) {
            if (bundle2.containsKey("height")) {
                int i = bundle2.getInt("height", 0);
                ViewGroup.LayoutParams layoutParams = fragmentView.getLayoutParams();
                if (i > layoutParams.height) {
                    layoutParams.height = i;
                }
            }
            TextView textView = (TextView) fragmentView.findViewById(R.id.on_device_loading_message);
            if (textView != null && bundle2.containsKey("term_label")) {
                String string = bundle2.getString("term_label");
                if (bundle2.containsKey("package_label")) {
                    textView.setText(dZ().getResources().getString(R.string.on_device_loading_message, string, bundle2.getString("package_label")));
                } else {
                    textView.setText(dZ().getResources().getString(R.string.on_device_loading, string));
                }
                if (this.a.isTouchExplorationEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                    accessibilityEventObtain.getText().add(textView.getText());
                    this.a.sendAccessibilityEvent(accessibilityEventObtain);
                }
            }
        }
        return hleVarA;
    }
}
