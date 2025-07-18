package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqi extends bv {
    public String a;
    private String b;
    private String c;

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.settings_error_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        this.a = arguments.getString("error_code");
        this.b = arguments.getString("error_text");
        this.c = arguments.getString("error_action_button_text");
        ((TextView) viewInflate.findViewById(R.id.error_text)).setText(this.b);
        Button button = (Button) viewInflate.findViewById(R.id.error_action_button);
        button.setText(this.c);
        button.setOnClickListener(new mqw(this, 1));
        krd.c(String.format("ErrorFragment displayed from %s. %s: %s", requireActivity().getClass().getSimpleName(), this.a, this.b));
        return viewInflate;
    }
}
