package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.googletv.app.internal.BottomSheetMaterialActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izf extends spz {
    final /* synthetic */ BottomSheetMaterialActivity a;

    public izf(BottomSheetMaterialActivity bottomSheetMaterialActivity) {
        this.a = bottomSheetMaterialActivity;
    }

    @Override // defpackage.spz
    public final void b(View view, int i) {
        TextView textView = this.a.g;
        String str = null;
        if (textView == null) {
            yks.c("textView");
            textView = null;
        }
        switch (i) {
            case 1:
                str = "STATE_DRAGGING";
                break;
            case 2:
                str = "STATE_SETTLING";
                break;
            case 3:
                str = "STATE_EXPANDED";
                break;
            case 4:
                str = "STATE_COLLAPSED";
                break;
            case 5:
                str = "STATE_HIDDEN";
                break;
            case 6:
                str = "STATE_HALF_EXPANDED";
                break;
        }
        textView.setText(str);
    }

    @Override // defpackage.spz
    public final void a(View view, float f) {
    }
}
