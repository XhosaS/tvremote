package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mra extends xch {
    public mem a;
    public lie b;
    public ldv c;
    public ieh d;
    public lfn e;
    public lhr f;
    public jaf g;
    public idf h;
    private idr i;
    private iej j;
    private View k;

    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.h = new llu(getResources());
        this.i = ((WatchActivity) getActivity()).d;
        View viewFindViewById = this.k.findViewById(R.id.error_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = this.k.findViewById(R.id.error_retry_button);
        viewFindViewById2.getClass();
        Button button = (Button) viewFindViewById2;
        View viewFindViewById3 = this.k.findViewById(R.id.error_got_it_button);
        viewFindViewById3.getClass();
        Button button2 = (Button) viewFindViewById3;
        View viewFindViewById4 = this.k.findViewById(R.id.error_troubleshoot_button);
        viewFindViewById4.getClass();
        Button button3 = (Button) viewFindViewById4;
        button.setOnClickListener(new mqy(this.i, 0));
        button2.setOnClickListener(new mqw(this, 0));
        idr idrVar = this.i;
        krw krwVar = new krw(idrVar, new jbj(new mqx(this, this.b, button3, textView, button, button2, this.c, this.d), 6));
        this.j = krwVar;
        idrVar.ea(krwVar);
        this.a.ea(this.j);
        this.j.dM();
        if (getArguments() != null && !getArguments().getBoolean("is_trailer", false) && !textView.getText().toString().equals(getResources().getString(R.string.no_network))) {
            this.g.a(this.k, jbr.E(265379, null), ImmutableMap.of());
        }
        Window window = getActivity().getWindow();
        window.clearFlags(134217728);
        window.addFlags(67108864);
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = this.e.cH() ? layoutInflater.inflate(R.layout.gtv_error_overlay, viewGroup, false) : layoutInflater.inflate(R.layout.error_overlay, viewGroup, false);
        this.k = viewInflate;
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDestroy() {
        super.onDestroy();
        this.i.ee(this.j);
        this.a.ee(this.j);
        this.g.g(this.k, ImmutableList.of());
    }
}
