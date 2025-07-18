package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iub extends ArrayAdapter {
    private final itk a;
    private final boolean b;

    public iub(Context context, itk itkVar, boolean z) {
        super(context, R.layout.media_device_bottom_sheet_item);
        this.a = itkVar;
        this.b = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object item = getItem(i);
        if (item == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ith ithVar = (ith) item;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.media_device_bottom_sheet_item, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.device_title);
        TextView textView2 = (TextView) view.findViewById(R.id.device_subtitle);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.device_tv_icon);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.connected_check);
        boolean zE = yks.e(ithVar, this.a.e());
        appCompatImageView2.getClass();
        appCompatImageView2.setVisibility(true != zE ? 8 : 0);
        Context context = getContext();
        context.getClass();
        int iE = hju.E(context, true != zE ? R.attr.colorPrimary : R.attr.colorTertiary);
        textView.setText(ithVar.d());
        textView.setTextColor(iE);
        textView2.setTextColor(iE);
        appCompatImageView.setColorFilter(iE);
        if (ithVar.o()) {
            appCompatImageView.setImageResource(R.drawable.quantum_gm_ic_phone_android_vd_theme_24);
            textView2.setVisibility(8);
        } else if (ithVar.p()) {
            appCompatImageView.setImageResource(R.drawable.quantum_gm_ic_tv_vd_theme_24);
            textView2.setVisibility(8);
        } else {
            appCompatImageView.setImageResource(R.drawable.quantum_gm_ic_nest_display_vd_theme_24);
            textView2.setVisibility(0);
            textView2.setText(R.string.media_device_google_tv_content_only);
        }
        view.getClass();
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.b;
    }
}
