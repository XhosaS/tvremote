package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzl extends jxj {
    public yjk a = new gel(20);
    public yjk b = new jzm(1);
    public isi c;

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        this.b.a();
    }

    @Override // defpackage.jxj
    public final View onCreateDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.family_library_sheet_layout, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.got_it);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(R.id.cancel);
        viewFindViewById2.getClass();
        View viewFindViewById3 = viewInflate.findViewById(R.id.checkbox);
        viewFindViewById3.getClass();
        ((Button) viewFindViewById).setOnClickListener(new iuy(this, (CheckBox) viewFindViewById3, 4));
        ((Button) viewFindViewById2).setOnClickListener(new jyr(this, 5));
        viewInflate.getClass();
        return viewInflate;
    }
}
