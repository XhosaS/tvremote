package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aca {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public aca(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.c) != null && colorStateList.isStateful();
    }

    public final boolean c(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.b) {
            return false;
        }
        this.b = colorForState;
        return true;
    }

    public final boolean d() {
        return a() || this.b != 0;
    }
}
