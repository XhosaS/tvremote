package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvk extends sfg {
    public ArrayList a;
    public String b;
    public ieg c;
    public final List d = new ArrayList();
    public mvj e = null;

    public static mvk a(ArrayList arrayList, String str) {
        return b(arrayList, str, ieg.a, false);
    }

    public static mvk b(ArrayList arrayList, String str, ieg iegVar, boolean z) {
        mvk mvkVar = new mvk();
        mvkVar.enableCloseIconOnFullscreenBottomSheet(false);
        if (z) {
            mvkVar.setDialogType(sff.BOTTOM_SHEET);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("option_dialog_data_loader_key", arrayList);
        bundle.putString("option_dialog_unique_key", str);
        if (iegVar.m()) {
            bundle.putParcelable("option_dialog_asset_id", (Parcelable) iegVar.g());
        }
        mvkVar.setArguments(bundle);
        return mvkVar;
    }

    public static mvk c(ArrayList arrayList, ieg iegVar) {
        return b(arrayList, "download_preference_key", iegVar, false);
    }

    @Override // defpackage.bl
    public final int getTheme() {
        int i = true != shownAsCenteredDialog() ? R.attr.bottomSheetDialogTheme : R.attr.dialogTheme;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = bundle == null ? arguments.getParcelableArrayList("option_dialog_data_loader_key") : bundle.getParcelableArrayList("option_dialog_data_loader_key");
        this.b = bundle == null ? arguments.getString("option_dialog_unique_key", "") : bundle.getString("option_dialog_unique_key", "");
        ArrayList arrayList = this.a;
        ViewGroup viewGroup2 = null;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ieg iegVarF = arguments.containsKey("option_dialog_asset_id") ? ieg.f((ksy) arguments.getParcelable("option_dialog_asset_id")) : ieg.a;
        ieg iegVarF2 = (bundle == null || !bundle.containsKey("option_dialog_asset_id")) ? ieg.a : ieg.f((ksy) bundle.getParcelable("option_dialog_asset_id"));
        if (true == iegVarF2.m()) {
            iegVarF = iegVarF2;
        }
        this.c = iegVarF;
        sfh sfhVar = new sfh(this);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.padding_top, (ViewGroup) null, false);
        View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.padding_top, (ViewGroup) null, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.dialog_padding_top));
        viewInflate.setLayoutParams(layoutParams);
        viewInflate2.setLayoutParams(layoutParams);
        sfhVar.b(viewInflate);
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            mvl mvlVar = (mvl) arrayList2.get(i);
            View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.option_group_layout, viewGroup2, false);
            TextView textView = (TextView) viewInflate3.findViewById(R.id.option_title);
            cww.q(textView, true);
            textView.setText(mvlVar.b);
            RadioGroup radioGroup = (RadioGroup) viewInflate3.findViewById(R.id.radio_group);
            radioGroup.removeAllViews();
            for (mvm mvmVar : mvlVar.c) {
                ViewGroup viewGroup3 = viewGroup2;
                View.inflate(getContext(), R.layout.radio_button_layout, radioGroup);
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(radioGroup.getChildCount() - 1);
                radioButton.setText(mvmVar.b);
                if (mvmVar.a.equals(mvlVar.d)) {
                    radioButton.setChecked(true);
                }
                viewGroup2 = viewGroup3;
            }
            this.d.add(viewInflate3);
            sfhVar.b(viewInflate3);
            i++;
            viewGroup2 = viewGroup2;
        }
        sfhVar.b(viewInflate2);
        sfhVar.d(new mvi());
        mvh mvhVar = new mvh();
        mvhVar.b(getContext().getString(R.string.apply), new mqw(this, 9));
        mvhVar.c(getContext().getString(R.string.cancel), new mqw(this, 10));
        sfhVar.d(mvhVar);
        return sfhVar.a();
    }

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            List list = this.d;
            if (arrayList.size() == list.size()) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                for (int i = 0; i < this.a.size(); i++) {
                    mvl mvlVar = (mvl) this.a.get(i);
                    RadioGroup radioGroup = (RadioGroup) ((View) list.get(i)).findViewById(R.id.radio_group);
                    String strA = mvlVar.a(radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId())));
                    if (strA.equals(mvlVar.d)) {
                        arrayList2.add(mvlVar);
                    } else {
                        String str = mvlVar.a;
                        nag nagVarB = mvl.b();
                        nagVarB.d = str;
                        nagVarB.j(mvlVar.b);
                        nagVarB.i(mvlVar.c);
                        nagVarB.h(strA);
                        arrayList2.add(nagVarB.g());
                    }
                }
                bundle.putParcelableArrayList("option_dialog_data_loader_key", arrayList2);
                bundle.putString("option_dialog_unique_key", this.b);
                if (this.c.m()) {
                    bundle.putParcelable("option_dialog_asset_id", (Parcelable) this.c.g());
                }
                super.onSaveInstanceState(bundle);
                return;
            }
        }
        super.onSaveInstanceState(bundle);
    }
}
