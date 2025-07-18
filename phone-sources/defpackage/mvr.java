package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mvr {
    public final Context b;

    public mvr(Context context) {
        this.b = context;
    }

    public abstract int a();

    public int b() {
        throw null;
    }

    public int d() {
        TypedArray typedArrayObtainStyledAttributes = this.b.obtainStyledAttributes(new int[]{R.attr.statusBarColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public int e() {
        TypedArray typedArrayObtainStyledAttributes = this.b.obtainStyledAttributes(new int[]{com.google.android.videos.R.attr.colorPrimary});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public int f(Context context) {
        int i = PlayHeaderListLayout.f;
        return context.getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.abc_action_bar_default_height_material);
    }

    public Toolbar h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (Toolbar) layoutInflater.inflate(com.google.android.videos.R.layout.movies_play_header_list_toolbar, viewGroup, false);
    }

    public abstract void i(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public int m() {
        return 0;
    }

    public boolean n() {
        int i = PlayHeaderListLayout.f;
        return false;
    }

    public int o() {
        return -1;
    }

    public int p() {
        return 0;
    }

    public void l(ViewGroup viewGroup) {
    }
}
