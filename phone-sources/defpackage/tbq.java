package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbq {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public View e;
    public TabLayout g;
    public tbs h;
    public int d = -1;
    public final int f = 1;
    public int i = -1;

    public final void a() {
        TabLayout tabLayout = this.g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.k(this);
    }

    public final void b() {
        tbs tbsVar = this.h;
        if (tbsVar != null) {
            tbsVar.b();
        }
    }

    public final void c(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.b = charSequence;
        b();
    }
}
