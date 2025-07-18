package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfi extends sfj {
    public CharSequence a;
    public CompoundButton.OnCheckedChangeListener b;

    public sfi() {
        super(R.layout.replaydialog_check_box);
    }

    @Override // defpackage.sfj
    protected final /* bridge */ /* synthetic */ void a(Context context, View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.check_box);
        linearLayout.setOnClickListener(new phn(checkBox, 13));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            checkBox.setText(charSequence);
        }
        checkBox.setSingleLine(true);
        checkBox.setMaxLines(1);
        linearLayout.setEnabled(true);
        checkBox.setEnabled(true);
        checkBox.setChecked(false);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.b;
        if (onCheckedChangeListener != null) {
            checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }
}
