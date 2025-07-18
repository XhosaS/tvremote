package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.tv.remote.virtual.ui.trackpad.DpadView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class too extends dao {
    private static final int[] e = {-1, R.string.dpad_up_text, -1, R.string.dpad_left_text, R.string.dpad_center_text, R.string.dpad_right_text, -1, R.string.dpad_down_text, -1};
    private static final int[] f = {0, 19, 0, 21, 23, 22, 0, 20, 0};
    private final DpadView g;

    public too(DpadView dpadView) {
        super(dpadView);
        this.g = dpadView;
    }

    @Override // defpackage.dao
    protected final int a(float f2, float f3) {
        DpadView dpadView = this.g;
        int height = (((int) f3) * 3) / dpadView.getHeight();
        int width = (((int) f2) * 3) / dpadView.getWidth();
        if (height < 0 || height > 2 || width < 0 || width > 2) {
            return -1;
        }
        if (height != 1) {
            if (width != 1) {
                return -1;
            }
            width = 1;
        }
        return (height * 3) + width;
    }

    @Override // defpackage.dao
    protected final void c(List list) {
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
    }

    @Override // defpackage.dao
    protected final void h(int i, cyq cyqVar) {
        DpadView dpadView = this.g;
        int i2 = i % 3;
        int width = dpadView.getWidth();
        int i3 = i / 3;
        int height = dpadView.getHeight();
        j(cyqVar, new Rect((i2 * width) / 3, (i3 * height) / 3, ((i2 + 1) * width) / 3, ((i3 + 1) * height) / 3));
        cyqVar.x(dpadView.getResources().getString(e[i]));
        cyqVar.t(Button.class.getName());
        cyqVar.i(16);
    }

    @Override // defpackage.dao
    protected final boolean o(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        this.g.b.a(f[i], tlv.PRESS);
        return true;
    }
}
