package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rhq extends LinearLayout {
    public final RecyclerView a;

    public rhq(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.incognito_content, this);
        setOrientation(1);
        this.a = (RecyclerView) findViewById(R.id.common_actions);
    }
}
