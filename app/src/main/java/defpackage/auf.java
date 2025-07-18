package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auf extends qv implements View.OnClickListener {
    public final Checkable s;
    public final TextView t;
    private final ViewGroup u;
    private final aue v;

    public auf(View view, aue aueVar) {
        super(view);
        this.s = (Checkable) view.findViewById(R.id.button);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.container);
        this.u = viewGroup;
        this.t = (TextView) view.findViewById(android.R.id.title);
        viewGroup.setOnClickListener(this);
        this.v = aueVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.v.m(this);
    }
}
