package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxq extends RecyclerView.OnScrollListener {
    private final AppBarLayout a;
    private final idr b;
    private final idr c;
    private final Toolbar d;
    private final boolean e;
    private final String f;
    private boolean g;

    public jxq(AppBarLayout appBarLayout, idr idrVar, idr idrVar2, Toolbar toolbar, boolean z, String str) {
        appBarLayout.getClass();
        idrVar.getClass();
        idrVar2.getClass();
        str.getClass();
        this.a = appBarLayout;
        this.b = idrVar;
        this.c = idrVar2;
        this.d = toolbar;
        this.e = z;
        this.f = str;
        this.g = true;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        Object objA = this.b.a();
        objA.getClass();
        if (((Boolean) objA).booleanValue()) {
            return;
        }
        if (!recyclerView.canScrollVertically(-1) && !this.g) {
            Drawable background = this.a.getBackground();
            background.getClass();
            ((TransitionDrawable) background).reverseTransition(500);
            this.g = true;
            this.c.c(true);
            if (this.e) {
                this.d.setTitle("");
                return;
            }
            return;
        }
        if (recyclerView.canScrollVertically(-1) && this.g) {
            Drawable background2 = this.a.getBackground();
            background2.getClass();
            ((TransitionDrawable) background2).startTransition(0);
            this.g = false;
            this.c.c(false);
            if (this.e) {
                this.d.setTitle(this.f);
            }
        }
    }
}
