package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdw extends RecyclerView.ViewHolder {
    public final Drawable a;
    public ColorStateList b;
    public boolean c;
    public boolean d;
    private final SparseArray e;

    public gdw(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.e = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.google.android.videos.R.id.icon_frame, view.findViewById(com.google.android.videos.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.a = view.getBackground();
        if (textView != null) {
            this.b = textView.getTextColors();
        }
    }

    public final View a(int i) {
        SparseArray sparseArray = this.e;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
