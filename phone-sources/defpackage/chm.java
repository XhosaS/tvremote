package defpackage;

import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chm {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (yks.e(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (yks.e(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
