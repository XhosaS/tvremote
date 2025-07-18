package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbj extends pq {
    final /* synthetic */ bbl d;
    private final int e;
    private final int f;
    private final int g;
    private final bbm h;

    public bbj(bbl bblVar, int i, int i2, int i3) {
        this.d = bblVar;
        this.e = i;
        this.f = i3;
        this.g = i2;
        this.h = (bbm) bblVar.k.get(i3);
    }

    @Override // defpackage.pq
    public final int a() {
        bbm bbmVar = this.h;
        if (bbmVar == null) {
            return 0;
        }
        return (bbmVar.c - bbmVar.b) + 1;
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ qv d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.e, viewGroup, false);
        int i2 = this.g;
        return new bbk(viewInflate, i2 != 0 ? (TextView) viewInflate.findViewById(i2) : (TextView) viewInflate);
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ void f(qv qvVar, int i) {
        bbm bbmVar;
        bbk bbkVar = (bbk) qvVar;
        TextView textView = bbkVar.s;
        if (textView != null && (bbmVar = this.h) != null) {
            int i2 = bbmVar.b + i;
            CharSequence[] charSequenceArr = bbmVar.d;
            textView.setText(charSequenceArr == null ? String.format(bbmVar.e, Integer.valueOf(i2)) : charSequenceArr[i2]);
        }
        bbl bblVar = this.d;
        View view = bbkVar.a;
        int i3 = this.f;
        bblVar.i(view, ((VerticalGridView) bblVar.j.get(i3)).getSelectedPosition() == i, i3, false);
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ void v(qv qvVar) {
        ((bbk) qvVar).a.setFocusable(this.d.isActivated());
    }
}
