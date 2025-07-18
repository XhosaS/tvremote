package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axe {
    public TextView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public View e;

    public int a() {
        return R.layout.lb_guidance;
    }

    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        View viewInflate = layoutInflater.inflate(a(), viewGroup, false);
        this.a = (TextView) viewInflate.findViewById(R.id.guidance_title);
        this.c = (TextView) viewInflate.findViewById(R.id.guidance_breadcrumb);
        this.b = (TextView) viewInflate.findViewById(R.id.guidance_description);
        this.d = (ImageView) viewInflate.findViewById(R.id.guidance_icon);
        this.e = viewInflate.findViewById(R.id.guidance_container);
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(axdVar.a);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(axdVar.c);
        }
        TextView textView3 = this.b;
        if (textView3 != null) {
            textView3.setText(axdVar.b);
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            Drawable drawable = axdVar.d;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
        View view = this.e;
        if (view != null && TextUtils.isEmpty(view.getContentDescription())) {
            StringBuilder sb = new StringBuilder();
            String str = axdVar.c;
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append('\n');
            }
            String str2 = axdVar.a;
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                sb.append('\n');
            }
            String str3 = axdVar.b;
            if (!TextUtils.isEmpty(str3)) {
                sb.append(str3);
                sb.append('\n');
            }
            this.e.setContentDescription(sb);
        }
        return viewInflate;
    }
}
