package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hen extends qv implements View.OnClickListener {
    public static final /* synthetic */ int y = 0;
    private static final zdy z = zdy.h("com/google/android/apps/tvsearch/results/actionitem/adapter/ActionListAdapter$ActionViewHolder");
    private final hel A;
    final ImageView s;
    final TextView t;
    final TextView u;
    public final Context v;
    public hej w;
    public final wke x;

    public hen(View view, hek hekVar) {
        super(view);
        this.A = hekVar.j();
        this.x = hekVar.k();
        this.v = view.getContext();
        this.s = (ImageView) view.findViewById(R.id.entity_detail_action_image);
        this.t = (TextView) view.findViewById(R.id.entity_detail_action_title);
        this.u = (TextView) view.findViewById(R.id.entity_detail_action_subtitle);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A.l(view, this.w);
    }

    final ApplicationInfo z(PackageManager packageManager, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((zdv) ((zdv) ((zdv) z.d()).p(e)).q("com/google/android/apps/tvsearch/results/actionitem/adapter/ActionListAdapter$ActionViewHolder", "getApplicationInfo", 244, "ActionListAdapter.java")).x("Failed to find the application with package name:%s", str);
            return null;
        }
    }
}
