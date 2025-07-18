package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rau implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ LayoutTransition c;
    private final /* synthetic */ int d;

    public rau(View view, ViewGroup viewGroup, LayoutTransition layoutTransition, int i) {
        this.d = i;
        this.a = view;
        this.b = viewGroup;
        this.c = layoutTransition;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d != 0) {
            view.removeOnLayoutChangeListener(this);
            this.a.addOnLayoutChangeListener(new jco(this.b, this.c, 5));
        } else {
            view.removeOnLayoutChangeListener(this);
            this.a.addOnLayoutChangeListener(new jco(this.b, this.c, 6));
        }
    }
}
