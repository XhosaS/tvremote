package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bm {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public DialogInterface.OnKeyListener f;
    public ListAdapter g;
    public DialogInterface.OnClickListener h;
    public boolean i;
    public int j = -1;

    public bm(Context context) {
        this.a = context;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
