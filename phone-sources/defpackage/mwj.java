package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwj extends bv {
    public Activity a;
    public String b;
    private View c;
    private String d;
    private String e;

    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        this.b = arguments.getString("error_code");
        this.d = arguments.getString("error_text");
        this.e = arguments.getString("error_action_button_text");
        ((TextView) this.c.findViewById(R.id.error_text)).setText(this.d);
        Button button = (Button) this.c.findViewById(R.id.error_action_button);
        button.setText(this.e);
        button.setOnClickListener(new mqw(this, 11));
        krd.c(String.format("ErrorFragment displayed from %s. %s: %s", getActivity().getClass().getSimpleName(), this.b, this.d));
    }

    @Override // defpackage.bv
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = activity;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.error_fragment, viewGroup, false);
        this.c = viewInflate;
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("error_code", this.b);
        bundle.putString("error_text", this.d);
        bundle.putString("error_action_button_text", this.e);
    }
}
