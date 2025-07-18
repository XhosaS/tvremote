package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sre extends dao {
    final /* synthetic */ Chip e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sre(Chip chip, Chip chip2) {
        super(chip2);
        this.e = chip;
    }

    @Override // defpackage.dao
    protected final int a(float f, float f2) {
        Chip chip = this.e;
        return (chip.i() && chip.d().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.dao
    protected final void c(List list) {
        list.add(0);
        Chip chip = this.e;
        if (chip.i() && chip.k() && chip.f != null) {
            list.add(1);
        }
    }

    @Override // defpackage.dao
    protected final void g(cyq cyqVar) {
        Chip chip = this.e;
        cyqVar.r(chip.j());
        cyqVar.u(chip.isClickable());
        cyqVar.t(chip.getAccessibilityClassName());
        cyqVar.T(chip.getText());
    }

    @Override // defpackage.dao
    protected final void h(int i, cyq cyqVar) {
        if (i != 1) {
            cyqVar.x("");
            cyqVar.p(Chip.d);
            return;
        }
        Chip chip = this.e;
        CharSequence text = chip.getText();
        cyqVar.x(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, true != TextUtils.isEmpty(text) ? text : "").trim());
        cyqVar.p(chip.c());
        cyqVar.j(cyp.a);
        cyqVar.z(chip.isEnabled());
        cyqVar.t(Button.class.getName());
    }

    @Override // defpackage.dao
    protected final void i(int i, boolean z) {
        if (i == 1) {
            this.e.h = z;
        }
        Chip chip = this.e;
        srg srgVar = chip.e;
        boolean z2 = chip.h;
        if (srgVar.f != null) {
            if (srgVar.r(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : srg.a)) {
                chip.refreshDrawableState();
            }
        }
    }

    @Override // defpackage.dao
    protected final boolean o(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.e.performClick();
        }
        if (i == 1) {
            return this.e.l();
        }
        return false;
    }
}
