package defpackage;

import android.text.Layout;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjp {
    public static final Comparator a = new fab(2);
    public final eca b;
    public final int c;

    public fjp(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        ebz ebzVar = new ebz();
        ebzVar.e(charSequence);
        ebzVar.b = alignment;
        ebzVar.d(f, 0);
        ebzVar.d = i;
        ebzVar.e = f2;
        ebzVar.f = i2;
        ebzVar.g = -3.4028235E38f;
        if (z) {
            ebzVar.g(i3);
        }
        this.b = ebzVar.a();
        this.c = i4;
    }
}
