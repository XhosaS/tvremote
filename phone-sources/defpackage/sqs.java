package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqs extends cuo {
    final /* synthetic */ MaterialButtonToggleGroup a;

    public sqs(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.a = materialButtonToggleGroup;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        int i = -1;
        if (view instanceof MaterialButton) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                MaterialButtonToggleGroup materialButtonToggleGroup = this.a;
                if (i2 >= materialButtonToggleGroup.getChildCount()) {
                    break;
                }
                if (materialButtonToggleGroup.getChildAt(i2) == view) {
                    i = i3;
                    break;
                }
                if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.m(i2)) {
                    i3++;
                }
                i2++;
            }
        }
        cyqVar.w(cxe.j(0, 1, i, 1, ((MaterialButton) view).j));
    }
}
