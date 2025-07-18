package defpackage;

import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxe {
    public IconCompat a;
    public cxp b;
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public IconCompat i;
    public CharSequence o;
    public CharSequence p;
    public int q;
    public CharSequence r;
    private boolean v;
    public final int j = -1;
    public final List k = new ArrayList();
    public final List l = new ArrayList();
    public final List m = new ArrayList();
    public final List n = new ArrayList();
    public final List u = new ArrayList();
    public boolean s = true;
    public final boolean t = true;

    private final void e(cxp cxpVar) {
        if (this.v) {
            throw new IllegalStateException("Only one non-custom toggle can be added in a single row. If you would like to include multiple toggles in a row, set a custom icon for each toggle.");
        }
        this.k.add(cxpVar);
        this.l.add(2);
        this.m.add(false);
        this.v = true;
    }

    public final void a(Parcelable parcelable, CharSequence charSequence, boolean z) {
        cxp cxpVar = new cxp(parcelable, charSequence, z);
        this.q = 0;
        e(cxpVar);
    }

    @Deprecated
    public final void b(Parcelable parcelable) {
        this.b = new cxp(parcelable, "", false);
    }

    public final void c(Parcelable parcelable, boolean z, int i) {
        cxp cxpVar = new cxp(parcelable, "", z);
        this.q = i;
        e(cxpVar);
    }

    public final void d(Parcelable parcelable, boolean z) {
        c(parcelable, z, 2);
        this.r = "RADIO_BUTTON_GROUP_PROACTIVE_BIT";
    }
}
