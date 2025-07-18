package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcg extends RecyclerView.ViewHolder {
    public final View a;
    public final Object b;

    public rcg(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.b = (TextView) view.findViewById(R.id.exo_text);
        this.a = view.findViewById(R.id.exo_check);
    }

    public rcg(View view, rcb rcbVar) {
        super(view);
        this.a = view;
        this.b = rcbVar;
    }
}
