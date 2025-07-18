package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkq extends hux implements View.OnClickListener {
    public final TextView a;
    final /* synthetic */ hkr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkq(hkr hkrVar, View view) {
        super(view);
        this.b = hkrVar;
        this.a = (TextView) view.findViewById(R.id.title);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        TextView textView = this.a;
        textView.getText().toString();
        this.b.b.Y(5);
        Context context = this.g.getContext();
        context.getClass();
        Intent intent = new Intent("android.intent.action.ASSIST");
        intent.addFlags(270532608);
        intent.putExtra("search_type", 12);
        intent.putExtra("query", textView.getText().toString());
        wyo.l(context, intent);
    }
}
